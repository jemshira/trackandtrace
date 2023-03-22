package com.altrocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "HR004")
public class HR004 {  ////Stock_Location
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "warehouse_code")
	private String warehouseCode;	
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zone")
	private String zone;
	
	@Column(name = "bin_location")
	private String binLocation;
	
	@Column(name = "part_number")
	private String partNumber;
	
	@Column(name = "part_description")
	private String partDescription;
	
	@Column(name = "product_class")
	private String productClass;
	
	@Column(name = "inventory_segment")
	private String inventorySegment;
	
	@Column(name = "on_hand_qty")
	private String onHandQty;
	
	@Column(name = "inventory_status")
	private String inventoryStatus;	
	
	@Column(name = "lpn_number")
	private String lpnNumber;
	
	@Column(name = "lpn_creation_date")
	private Date lpnCreationDate;
	
	@Column(name = "serial_number")
	private String serialNumber;
	
	@Column(name = "revision_level")
	private String revisionLevel;
	
	@Column(name = "expiry_date")
	private Date expiryDate;
	
	@Column(name = "batch_number")
	private String batchNumber;
	
	@Column(name = "lot_number")
	private String lotNumber;
	
	@Column(name = "coo")
	private String coo;
	
	@Column(name = "velocity_code")
	private String velocityCode;
	
	@Column(name = "abc_code")
	private String abcCode;
	
	@Column(name = "fifo_number")
	private String fifoNumber;
	
	@Column(name = "receipt_date")
	private Date receiptDate;
	
	@Column(name = "receipt_number")
	private String receiptNumber;
	
	@Column(name = "ib_order_reference1")
	private String ibOrderReference1;
	
	@Column(name = "ib_order_reference2")
	private String ibOrderReference2;
	
	@Column(name = "ib_order_line_price_value")
	private double ibOrderLinePriceValue;
	
	@Column(name = "uom")
	private String uom;
	
	@Column(name = "extn_hazmat_attribute1")
	private String extnHazmatAttribute1;
	
	@Column(name = "extn_hazmat_attribute2")
	private String extnHazmatAttribute2;
	
	@Column(name = "extn_hazmat_pi_section")
	private String extnHazmatPISection;
	
	@Column(name = "extn_un_number")
	private String extnUnNumber;
	
	@Column(name = "extn_msds")
	private String extnMsds;
	
	@Column(name = "extn_hazmat_pi")
	private String extnHazmatPi;
	
	@Column(name = "lpn_facility_status")
	private String lpnFacilityStatus;
	
	@Column(name = "manufacturer_item")
	private String manufacturerItem;
	
	@Column(name = "manufacturer_item_desc")
	private String manufacturerItemDesc;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getBinLocation() {
		return binLocation;
	}

	public void setBinLocation(String binLocation) {
		this.binLocation = binLocation;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public String getProductClass() {
		return productClass;
	}

	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}

	public String getInventorySegment() {
		return inventorySegment;
	}

	public void setInventorySegment(String inventorySegment) {
		this.inventorySegment = inventorySegment;
	}

	public String getOnHandQty() {
		return onHandQty;
	}

	public void setOnHandQty(String onHandQty) {
		this.onHandQty = onHandQty;
	}

	public String getInventoryStatus() {
		return inventoryStatus;
	}

	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}

	public String getLpnNumber() {
		return lpnNumber;
	}

	public void setLpnNumber(String lpnNumber) {
		this.lpnNumber = lpnNumber;
	}

	public Date getLpnCreationDate() {
		return lpnCreationDate;
	}

	public void setLpnCreationDate(Date lpnCreationDate) {
		this.lpnCreationDate = lpnCreationDate;
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

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getCoo() {
		return coo;
	}

	public void setCoo(String coo) {
		this.coo = coo;
	}

	public String getVelocityCode() {
		return velocityCode;
	}

	public void setVelocityCode(String velocityCode) {
		this.velocityCode = velocityCode;
	}

	public String getAbcCode() {
		return abcCode;
	}

	public void setAbcCode(String abcCode) {
		this.abcCode = abcCode;
	}

	public String getFifoNumber() {
		return fifoNumber;
	}

	public void setFifoNumber(String fifoNumber) {
		this.fifoNumber = fifoNumber;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getReceiptNumber() {
		return receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public String getIbOrderReference1() {
		return ibOrderReference1;
	}

	public void setIbOrderReference1(String ibOrderReference1) {
		this.ibOrderReference1 = ibOrderReference1;
	}

	public String getIbOrderReference2() {
		return ibOrderReference2;
	}

	public void setIbOrderReference2(String ibOrderReference2) {
		this.ibOrderReference2 = ibOrderReference2;
	}

	public double getIbOrderLinePriceValue() {
		return ibOrderLinePriceValue;
	}

	public void setIbOrderLinePriceValue(double ibOrderLinePriceValue) {
		this.ibOrderLinePriceValue = ibOrderLinePriceValue;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getExtnHazmatAttribute1() {
		return extnHazmatAttribute1;
	}

	public void setExtnHazmatAttribute1(String extnHazmatAttribute1) {
		this.extnHazmatAttribute1 = extnHazmatAttribute1;
	}

	public String getExtnHazmatAttribute2() {
		return extnHazmatAttribute2;
	}

	public void setExtnHazmatAttribute2(String extnHazmatAttribute2) {
		this.extnHazmatAttribute2 = extnHazmatAttribute2;
	}

	public String getExtnHazmatPISection() {
		return extnHazmatPISection;
	}

	public void setExtnHazmatPISection(String extnHazmatPISection) {
		this.extnHazmatPISection = extnHazmatPISection;
	}

	public String getExtnUnNumber() {
		return extnUnNumber;
	}

	public void setExtnUnNumber(String extnUnNumber) {
		this.extnUnNumber = extnUnNumber;
	}

	public String getExtnMsds() {
		return extnMsds;
	}

	public void setExtnMsds(String extnMsds) {
		this.extnMsds = extnMsds;
	}

	public String getExtnHazmatPi() {
		return extnHazmatPi;
	}

	public void setExtnHazmatPi(String extnHazmatPi) {
		this.extnHazmatPi = extnHazmatPi;
	}

	public String getLpnFacilityStatus() {
		return lpnFacilityStatus;
	}

	public void setLpnFacilityStatus(String lpnFacilityStatus) {
		this.lpnFacilityStatus = lpnFacilityStatus;
	}

	public String getManufacturerItem() {
		return manufacturerItem;
	}

	public void setManufacturerItem(String manufacturerItem) {
		this.manufacturerItem = manufacturerItem;
	}

	public String getManufacturerItemDesc() {
		return manufacturerItemDesc;
	}

	public void setManufacturerItemDesc(String manufacturerItemDesc) {
		this.manufacturerItemDesc = manufacturerItemDesc;
	}

	@Override
	public String toString() {
		return "HR004 [id=" + id + ", customerName=" + customerName + ", warehouseCode=" + warehouseCode + ", country="
				+ country + ", zone=" + zone + ", binLocation=" + binLocation + ", partNumber=" + partNumber
				+ ", partDescription=" + partDescription + ", productClass=" + productClass + ", inventorySegment="
				+ inventorySegment + ", onHandQty=" + onHandQty + ", inventoryStatus=" + inventoryStatus
				+ ", lpnNumber=" + lpnNumber + ", lpnCreationDate=" + lpnCreationDate + ", serialNumber=" + serialNumber
				+ ", revisionLevel=" + revisionLevel + ", expiryDate=" + expiryDate + ", batchNumber=" + batchNumber
				+ ", lotNumber=" + lotNumber + ", coo=" + coo + ", velocityCode=" + velocityCode + ", abcCode="
				+ abcCode + ", fifoNumber=" + fifoNumber + ", receiptDate=" + receiptDate + ", receiptNumber="
				+ receiptNumber + ", ibOrderReference1=" + ibOrderReference1 + ", ibOrderReference2="
				+ ibOrderReference2 + ", ibOrderLinePriceValue=" + ibOrderLinePriceValue + ", uom=" + uom
				+ ", extnHazmatAttribute1=" + extnHazmatAttribute1 + ", extnHazmatAttribute2=" + extnHazmatAttribute2
				+ ", extnHazmatPISection=" + extnHazmatPISection + ", extnUnNumber=" + extnUnNumber + ", extnMsds="
				+ extnMsds + ", extnHazmatPi=" + extnHazmatPi + ", lpnFacilityStatus=" + lpnFacilityStatus
				+ ", manufacturerItem=" + manufacturerItem + ", manufacturerItemDesc=" + manufacturerItemDesc + "]";
	}

	

}
