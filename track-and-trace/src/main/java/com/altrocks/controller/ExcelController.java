package com.altrocks.controller;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.altrocks.message.ResponseMessage;
import com.altrocks.service.HR001Service;
import com.altrocks.util.AltrocksUtil;

@RestController
@RequestMapping("/api/excel")
public class ExcelController<E> {

	@Autowired
	HR001Service service;

	@PostMapping("/upload")
	public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file,
			@RequestParam("type") String type) {

		String message = "";

		String fileName = file.getOriginalFilename();
		String filePath = "E:\\dhl-reports\\uploaded-file\\" + fileName;
		//System.out.println("File Name:" + fileType);

		if (AltrocksUtil.hasExcelFormat(file)) {
			try {

				// save file to specified path
				FileUtils.writeByteArrayToFile(new File(filePath), file.getBytes());
				if (filePath != null && type != null) {

					System.out.println("called read-method");

					// read data from Excel file
					service.readexcel(filePath, type);

					message = "Uploaded the file successfully: " + file.getOriginalFilename();
					return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
				}
			} catch (Exception e) {
				message = "Could not save the data to database: " + file.getOriginalFilename() + "!";
				return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
			}
		}

		message = "Please upload an excel file!";
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
	}
	
	

}
