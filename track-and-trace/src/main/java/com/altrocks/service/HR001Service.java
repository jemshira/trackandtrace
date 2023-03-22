package com.altrocks.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altrocks.model.HR001;
import com.altrocks.repository.HR001Repository;
import com.altrocks.util.AltrocksUtil;

@Service
public class HR001Service {

	@Autowired
	HR001Repository HR001repository;

	@Autowired
	HR001Repository HR002repository;

	@Autowired
	HR001Repository HR003repository;

	@Autowired
	HR001Repository HR004repository;

	@Autowired
	AltrocksUtil util;

	@SuppressWarnings("unchecked")
	public void readexcel(String filePath, String type) throws Exception {
		try {

			List inBound = util.readExcelFile(filePath, type);
			HR001repository.saveAll(inBound);

		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}
}


/*
 * if (type.contentEquals("HR001")) { HR001repository.saveAll(inBound); } else
 * if (type.contentEquals("HR002")) { HR002repository.saveAll(inBound); } else
 * if (type.contentEquals("HR003")) { HR003repository.saveAll(inBound); }
 * HR004repository.saveAll(inBound);
 */
