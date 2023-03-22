package com.altrocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "HR001")
public class HR001 { ////InBound

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "ship_to_warehouse")
	private String shipToWarehouse;

	@Column(name = "ship_from_name")
	private String shipFromName;

	@Column(name = "ship_from_warehouse")
	private String shipFromWarehouse;

	@Column(name = "customer_service_type")
	private String customerServiceType;

	@Column(name = "dhl_service_type")
	private String dhlServiceType;

	@Column(name = "order_type")
	private String orderType;

	@Column(name = "sla_type")
	private String slaType;

	@Column(name = "order_creation_date")
	private Date orderCreationDate;

	@Column(name = "receipt_date")
	private Date receiptDate;

	@Column(name = "tat_date_time")
	private Date tatDatetime;

	@Column(name = "order_number")
	private String orderNumber;

	@Column(name = "reference_no_1")
	private String referenceNo1;

	@Column(name = "reference_no_2")
	private String referenceNo2;

	@Column(name = "reference_no_3")
	private String referenceNo3;

	@Column(name = "reference_no_4")
	private String referenceNo4;

	@Column(name = "reference_no_5")
	private String referenceNo5;

	@Column(name = "reference_no_6")
	private String referenceNo6;

	@Column(name = "awb")
	private String awb;

	@Column(name = "carrier")
	private String carrier;

	@Column(name = "order_line_number")
	private String orderLineNumber;

	@Column(name = "product_class")
	private String productClass;

	@Column(name = "part_number")
	private String partNumber;

	@Column(name = "expected_line_quantity")
	private String expectedLineQuantity;

	@Column(name = "received_line_quantity")
	private String receivedLineQuantity;

	@Column(name = "lpn_quantity")
	private String lpnQuantity;

	@Column(name = "lpn_number")
	private String lpnNumber;

	@Column(name = "serial_number")
	private String serialNumber;

	@Column(name = "revision_level")
	private String revisionLevel;

	@Column(name = "expiry_date")
	private Date expiryDate;

	@Column(name = "lot_number")
	private String lotNumber;

	@Column(name = "batch_number")
	private String batchNumber;

	@Column(name = "coo")
	private String coo;

	@Column(name = "disposition_code")
	private String dispositionCode;

	@Column(name = "putaway_bin_location")
	private String putawayBinLocation;

	@Column(name = "segment")
	private String segment;

	@Column(name = "order_status")
	private String orderStatus;

	@Column(name = "putaway_date")
	private Date putawayDate;

	@Column(name = "ship_from_contactname")
	private String shipFromContactName;

	@Column(name = "ship_from_address")
	private String shipFromAddress;

	@Column(name = "ship_from_city")
	private String shipFromCity;

	@Column(name = "ship_from_zipcode")
	private String shipFromZipCode;

	@Column(name = "ship_from_country")
	private String shipFromCountry;

	@Column(name = "ship_from_contactphone")
	private String shipFromContactPhone;

	@Column(name = "Order_line_reference")
	private String OrderLineReference;

	@Column(name = "order_line_instruction")
	private String OrderLineInstruction;

	@Column(name = "price_value")
	private String priceValue;

	@Column(name = "uom")
	private String uom;

	@Column(name = "bill_of_entry")
	private String billOfEntry;

	@Column(name = "received_by")
	private String receivedBy;

	@Column(name = "putaway_by")
	private String putawayBy;

	@Column(name = "secondary_serial_number")
	private String secondarySerialNum;

	@Column(name = "ib_service_level")
	private String ibServiceLevel;

	@Column(name = "wms_po")
	private String wmsPO;
 
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShipToWarehouse() {
		return shipToWarehouse;
	}

	public void setShipToWarehouse(String shipToWarehouse) {
		this.shipToWarehouse = shipToWarehouse;
	}

	public String getShipFromName() {
		return shipFromName;
	}

	public void setShipFromName(String shipFromName) {
		this.shipFromName = shipFromName;
	}

	public String getShipFromWarehouse() {
		return shipFromWarehouse;
	}

	public void setShipFromWarehouse(String shipFromWarehouse) {
		this.shipFromWarehouse = shipFromWarehouse;
	}

	public String getCustomerServiceType() {
		return customerServiceType;
	}

	public void setCustomerServiceType(String customerServiceType) {
		this.customerServiceType = customerServiceType;
	}

	public String getDhlServiceType() {
		return dhlServiceType;
	}

	public void setDhlServiceType(String dhlServiceType) {
		this.dhlServiceType = dhlServiceType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getSlaType() {
		return slaType;
	}

	public void setSlaType(String slaType) {
		this.slaType = slaType;
	}

	public Date getOrderCreationDate() {
		return orderCreationDate;
	}

	public void setOrderCreationDate(Date orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public Date getTatDatetime() {
		return tatDatetime;
	}

	public void setTatDatetime(Date tatDatetime) {
		this.tatDatetime = tatDatetime;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getReferenceNo1() {
		return referenceNo1;
	}

	public void setReferenceNo1(String reference1) {
		this.referenceNo1 = reference1;
	}

	public String getReferenceNo2() {
		return referenceNo2;
	}

	public void setReferenceNo2(String reference2) {
		this.referenceNo2 = reference2;
	}

	public String getReferenceNo3() {
		return referenceNo3;
	}

	public void setReferenceNo3(String reference3) {
		this.referenceNo3 = reference3;
	}

	public String getReferenceNo4() {
		return referenceNo4;
	}

	public void setReferenceNo4(String reference4) {
		this.referenceNo4 = reference4;
	}

	public String getReferenceNo5() {
		return referenceNo5;
	}

	public void setReferenceNo5(String reference5) {
		this.referenceNo5 = reference5;
	}

	public String getReferenceNo6() {
		return referenceNo6;
	}

	public void setReferenceNo6(String reference6) {
		this.referenceNo6 = reference6;
	}

	public String getAwb() {
		return awb;
	}

	public void setAwb(String awb) {
		this.awb = awb;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(String orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	public String getProductClass() {
		return productClass;
	}

	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getExpectedLineQuantity() {
		return expectedLineQuantity;
	}

	public void setExpectedLineQuantity(String expectedLineQuantity) {
		this.expectedLineQuantity = expectedLineQuantity;
	}

	public String getReceivedLineQuantity() {
		return receivedLineQuantity;
	}

	public void setReceivedLineQuantity(String receivedLineQuantity) {
		this.receivedLineQuantity = receivedLineQuantity;
	}

	public String getLpnQuantity() {
		return lpnQuantity;
	}

	public void setLpnQuantity(String lpnQuantity) {
		this.lpnQuantity = lpnQuantity;
	}

	public String getLpnNumber() {
		return lpnNumber;
	}

	public void setLpnNumber(String lpnNumber) {
		this.lpnNumber = lpnNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getRevisionLevel() {
		return revisionLevel;
	}

	public void setRevisionLevel(String revisionLevel) {
		this.revisionLevel = revisionLevel;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getCoo() {
		return coo;
	}

	public void setCoo(String coo) {
		this.coo = coo;
	}

	public String getDispositionCode() {
		return dispositionCode;
	}

	public void setDispositionCode(String dispositionCode) {
		this.dispositionCode = dispositionCode;
	}

	public String getPutawayBinLocation() {
		return putawayBinLocation;
	}

	public void setPutawayBinLocation(String putawayBinLocation) {
		this.putawayBinLocation = putawayBinLocation;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getPutawayDate() {
		return putawayDate;
	}

	public void setPutawayDate(Date putawayDate) {
		this.putawayDate = putawayDate;
	}

	public String getShipFromContactName() {
		return shipFromContactName;
	}

	public void setShipFromContactName(String shipFromContactName) {
		this.shipFromContactName = shipFromContactName;
	}

	public String getShipFromAddress() {
		return shipFromAddress;
	}

	public void setShipFromAddress(String shipFromAddress) {
		this.shipFromAddress = shipFromAddress;
	}

	public String getShipFromCity() {
		return shipFromCity;
	}

	public void setShipFromCity(String shipFromCity) {
		this.shipFromCity = shipFromCity;
	}

	public String getShipFromZipCode() {
		return shipFromZipCode;
	}

	public void setShipFromZipCode(String shipFromZipCode) {
		this.shipFromZipCode = shipFromZipCode;
	}

	public String getShipFromCountry() {
		return shipFromCountry;
	}

	public void setShipFromCountry(String shipFromCountry) {
		this.shipFromCountry = shipFromCountry;
	}

	public String getShipFromContactPhone() {
		return shipFromContactPhone;
	}

	public void setShipFromContactPhone(String shipFromContactPhone) {
		this.shipFromContactPhone = shipFromContactPhone;
	}

	public String getOrderLineReference() {
		return OrderLineReference;
	}

	public void setOrderLineReference(String orderLineReference) {
		OrderLineReference = orderLineReference;
	}

	public String getOrderLineInstruction() {
		return OrderLineInstruction;
	}

	public void setOrderLineInstruction(String orderLineInstruction) {
		OrderLineInstruction = orderLineInstruction;
	}

	public String getPriceValue() {
		return priceValue;
	}

	public void setPriceValue(String priceValue) {
		this.priceValue = priceValue;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getBillOfEntry() {
		return billOfEntry;
	}

	public void setBillOfEntry(String billOfEntry) {
		this.billOfEntry = billOfEntry;
	}

	public String getReceivedBy() {
		return receivedBy;
	}

	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	public String getPutawayBy() {
		return putawayBy;
	}

	public void setPutawayBy(String putawayBy) {
		this.putawayBy = putawayBy;
	}

	public String getSecondarySerialNum() {
		return secondarySerialNum;
	}

	public void setSecondarySerialNum(String secondarySerialNum) {
		this.secondarySerialNum = secondarySerialNum;
	}

	public String getIbServiceLevel() {
		return ibServiceLevel;
	}

	public void setIbServiceLevel(String ibServiceLevel) {
		this.ibServiceLevel = ibServiceLevel;
	}

	public String getWmsPO() {
		return wmsPO;
	}

	public void setWmsPO(String wmsPO) {
		this.wmsPO = wmsPO;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	

	@Override
	public String toString() {
		return "HR001 [id=" + id + ", customerName=" + customerName + ", shipToWarehouse=" + shipToWarehouse
				+ ", shipFromName=" + shipFromName + ", shipFromWarehouse=" + shipFromWarehouse
				+ ", customerServiceType=" + customerServiceType + ", dhlServiceType=" + dhlServiceType + ", orderType="
				+ orderType + ", slaType=" + slaType + ", orderCreationDate=" + orderCreationDate + ", receiptDate="
				+ receiptDate + ", tatDatetime=" + tatDatetime + ", orderNumber=" + orderNumber + ", reference1="
				+ referenceNo1 + ", reference2=" + referenceNo2 + ", reference3=" + referenceNo3 + ", reference4="
				+ referenceNo4 + ", reference5=" + referenceNo5 + ", reference6=" + referenceNo6 + ", awb=" + awb
				+ ", carrier=" + carrier + ", orderLineNumber=" + orderLineNumber + ", productClass=" + productClass
				+ ", partNumber=" + partNumber + ", expectedLineQuantity=" + expectedLineQuantity
				+ ", receivedLineQuantity=" + receivedLineQuantity + ", lpnQuantity=" + lpnQuantity + ", lpnNumber="
				+ lpnNumber + ", serialNumber=" + serialNumber + ", revisionLevel=" + revisionLevel + ", expiryDate="
				+ expiryDate + ", lotNumber=" + lotNumber + ", batchNumber=" + batchNumber + ", coo=" + coo
				+ ", dispositionCode=" + dispositionCode + ", putawayBinLocation=" + putawayBinLocation + ", segment="
				+ segment + ", orderStatus=" + orderStatus + ", putawayDate=" + putawayDate + ", shipFromContactName="
				+ shipFromContactName + ", shipFromAddress=" + shipFromAddress + ", shipFromCity=" + shipFromCity
				+ ", shipFromZipCode=" + shipFromZipCode + ", shipFromCountry=" + shipFromCountry
				+ ", shipFromContactPhone=" + shipFromContactPhone + ", OrderLineReference=" + OrderLineReference
				+ ", OrderLineInstruction=" + OrderLineInstruction + ", priceValue=" + priceValue + ", uom=" + uom
				+ ", billOfEntry=" + billOfEntry + ", receivedBy=" + receivedBy + ", putawayBy=" + putawayBy
				+ ", secondarySerialNum=" + secondarySerialNum + ", ibServiceLevel=" + ibServiceLevel + ", wmsPO="
				+ wmsPO + "]";
	}

	

}