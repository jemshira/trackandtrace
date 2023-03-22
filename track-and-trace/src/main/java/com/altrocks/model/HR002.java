package com.altrocks.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HR002")
public class HR002 {  ////OB_Shipment
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "order_number")
	private String orderNumber;	
	
	@Column(name = "shipment_number")
	private String shipmentNumber;
	
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
	
	@Column(name = "customer_service_type")
	private String customerServiceType;
	
	@Column(name = "dhl_service_type")
	private String dhlServiceType;
	
	@Column(name = "document_type")
	private String documentType;
	
	@Column(name = "order_type")
	private String orderType;
	
	@Column(name = "service_level")
	private String serviceLevel;
	
	@Column(name = "eta")
	private Date eta;	
	
	@Column(name = "ship_from_warehouse")
	private String shipFromWarehouse;	
	
	@Column(name = "ship_to_warehouse")
	private String shipToWarehouse;	
	
	@Column(name = "ship_to_name")
	private String shipToName;
	
	@Column(name = "ship_to_address")
	private String shipToAddress;
	
	@Column(name = "ship_to_state")
	private String shipToState;	
	
	@Column(name = "ship_to_city")
	private String shipToCity;	
	
	@Column(name = "ship_to_zipcode")
	private String shipToZipcode;
	
	@Column(name = "ship_to_country")
	private String shipToCountry;
	
	@Column(name = "ship_from_region")
	private String shipFromRegion;
	
	@Column(name = "ship_to_contact")
	private String shipToContact;
	
	@Column(name = "ship_to_contactnumber")
	private String shipToContactNumber;	
	
	@Column(name = "pick_instruction")
	private String pickInstruction;
	
	@Column(name = "pack_instruction")
	private String packInstruction;	
	
	@Column(name = "delivery_instruction")
	private String deliveryInstruction;	
	
	@Column(name = "shipment_status")
	private String shipmentStatus;	
	
	@Column(name = "order_line_number")
	private String orderLineNumber;  
	
	@Column(name = "product_class")
	private String productClass;
	
	@Column(name = "part_number")
	private String partNumber;	
	
	@Column(name = "part_description")
	private String partDescription;	
	
	@Column(name = "request_ship_line_qty")
	private String requestShipLineQty;
	
	@Column(name = "shipped_line_qty")
	private String shippedLineQty;
	
	@Column(name = "shipped_lpn_qty")
	private String shippedLpnQty;	 
	
	@Column(name = "lpn_number")
	private String lpnNumber;	
	
	@Column(name = "serial_number")
	private String serialNumber;
	
	@Column(name = "revision_level")
	private String revisionLevel;
	
	@Column(name = "lot_number")
	private String lotNumber;
	
	@Column(name = "batch_number")
	private String batchNumber;	
	
	@Column(name = "segment")
	private String segment;	
	
	@Column(name = "carrier")
	private String carrier;	
	
	@Column(name = "awb_number")
	private String awbNumber;	
	
	@Column(name = "rawb_number")
	private String rawbNumber;
	
	@Column(name = "weight")
	private double weight;
	
	@Column(name = "weight_uom")
	private String weightUom;
	
	@Column(name = "volume")
	private long volume;	
	
	@Column(name = "volume_uom")
	private String volumeUom;	
	
	@Column(name = "shipment_creation_date")
	private Date shipmentCreationDate;
	
	@Column(name = "dispatched_date")
	private Date dispatchedDate;
	
	@Column(name = "cancelled_date")
	private Date cancelledDate;
	
	@Column(name = "to_dhl_warehouse")
	private String toDhlWarehouse;
	
	@Column(name = "from_dhl_warehouse")
	private String fromDhlWarehouse;
	
	@Column(name = "customer_product_class")
	private String customerProductClass;
	
	@Column(name = "field_engineer_id")
	private String fieldEngineerID;	
	
	@Column(name = "uom")
	private String uom;	
	
	@Column(name = "order_line_reference")
	private String orderLineReference;	
	
	@Column(name = "order_generated_by")
	private String orderGeneratedBy;
	
	@Column(name = "start_order_generation")
	private Date startOrderGeneration;
	
	@Column(name = "end_order_generation")
	private Date endOrderGeneration;
	
	@Column(name = "picked_by")
	private String pickedBy;
	
	@Column(name = "start_pick_time")
	private Date startPickTime;	
	
	@Column(name = "end_pick_time")
	private Date endPickTime;
	
	@Column(name = "packed_by")
	private String packedBy;	
	
	@Column(name = "start_pack_time")
	private Date startPackTime;	
	
	@Column(name = "end_pack_time")
	private Date endPackTime;	
	
	@Column(name = "ship_confirmed_by")
	private String shipConfirmedBy;	
	
	@Column(name = "start_ship_confirm_time")
	private Date startShipConfirmTime;
	
	@Column(name = "end_ship_confirm_time")
	private Date endShipConfirmTime;
	
	@Column(name = "unit_price")
	private double unitPrice;	
	
	@Column(name = "harmonized_code")
	private String harmonizedCode;	
	
	@Column(name = "suggested_lpn_number")
	private String suggestedLpnNumber;	
	
	@Column(name = "secondary_serial_no")
	private String secondarySerialNo;
	
	@Column(name = "ready_for_collection_datetime")
	private Date readyForCollectionDatetime;
	
	@Column(name = "collected_datetime")
	private Date collectedDatetime;	
	
	@Column(name = "signer")
	private String signer;	
	
	@Column(name = "stage_to_dock_time")
	private Date stageToDockTime;	
	
	@Column(name = "carrier_service_level")
	private String carrierServiceLevel;	
	
	@Column(name = "shipment_pickup_datetime")
	private Date shipmentPickUpDatetime;
	
	@Column(name = "shipment_pickup_user")
	private String shipmentPickupUser;	
	
	@Column(name = "shipment_pack_datetime")
	private Date shipmentPackDatetime;	
	
	@Column(name = "shipment_dispatch_datetime")
	private Date shipmentDispatchDatetime;

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

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getShipmentNumber() {
		return shipmentNumber;
	}

	public void setShipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}

	public String getReferenceNo1() {
		return referenceNo1;
	}

	public void setReferenceNo1(String referenceNo1) {
		this.referenceNo1 = referenceNo1;
	}

	public String getReferenceNo2() {
		return referenceNo2;
	}

	public void setReferenceNo2(String referenceNo2) {
		this.referenceNo2 = referenceNo2;
	}

	public String getReferenceNo3() {
		return referenceNo3;
	}

	public void setReferenceNo3(String referenceNo3) {
		this.referenceNo3 = referenceNo3;
	}

	public String getReferenceNo4() {
		return referenceNo4;
	}

	public void setReferenceNo4(String referenceNo4) {
		this.referenceNo4 = referenceNo4;
	}

	public String getReferenceNo5() {
		return referenceNo5;
	}

	public void setReferenceNo5(String referenceNo5) {
		this.referenceNo5 = referenceNo5;
	}

	public String getReferenceNo6() {
		return referenceNo6;
	}

	public void setReferenceNo6(String referenceNo6) {
		this.referenceNo6 = referenceNo6;
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

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public Date getEta() {
		return eta;
	}

	public void setEta(Date eta) {
		this.eta = eta;
	}

	public String getShipFromWarehouse() {
		return shipFromWarehouse;
	}

	public void setShipFromWarehouse(String shipFromWarehouse) {
		this.shipFromWarehouse = shipFromWarehouse;
	}

	public String getShipToWarehouse() {
		return shipToWarehouse;
	}

	public void setShipToWarehouse(String shipToWarehouse) {
		this.shipToWarehouse = shipToWarehouse;
	}

	public String getShipToName() {
		return shipToName;
	}

	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	public String getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	public String getShipToState() {
		return shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	public String getShipToCity() {
		return shipToCity;
	}

	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}

	public String getShipToZipcode() {
		return shipToZipcode;
	}

	public void setShipToZipcode(String shipToZipcode) {
		this.shipToZipcode = shipToZipcode;
	}

	public String getShipToCountry() {
		return shipToCountry;
	}

	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}

	public String getShipFromRegion() {
		return shipFromRegion;
	}

	public void setShipFromRegion(String shipFromRegion) {
		this.shipFromRegion = shipFromRegion;
	}

	public String getShipToContact() {
		return shipToContact;
	}

	public void setShipToContact(String shipToContact) {
		this.shipToContact = shipToContact;
	}

	public String getShipToContactNumber() {
		return shipToContactNumber;
	}

	public void setShipToContactNumber(String shipToContactNumber) {
		this.shipToContactNumber = shipToContactNumber;
	}

	public String getPickInstruction() {
		return pickInstruction;
	}

	public void setPickInstruction(String pickInstruction) {
		this.pickInstruction = pickInstruction;
	}

	public String getPackInstruction() {
		return packInstruction;
	}

	public void setPackInstruction(String packInstruction) {
		this.packInstruction = packInstruction;
	}

	public String getDeliveryInstruction() {
		return deliveryInstruction;
	}

	public void setDeliveryInstruction(String deliveryInstruction) {
		this.deliveryInstruction = deliveryInstruction;
	}

	public String getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
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

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public String getRequestShipLineQty() {
		return requestShipLineQty;
	}

	public void setRequestShipLineQty(String requestShipLineQty) {
		this.requestShipLineQty = requestShipLineQty;
	}

	public String getShippedLineQty() {
		return shippedLineQty;
	}

	public void setShippedLineQty(String shippedLineQty) {
		this.shippedLineQty = shippedLineQty;
	}

	public String getShippedLpnQty() {
		return shippedLpnQty;
	}

	public void setShippedLpnQty(String shippedLpnQty) {
		this.shippedLpnQty = shippedLpnQty;
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

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	public String getRawbNumber() {
		return rawbNumber;
	}

	public void setRawbNumber(String rawbNumber) {
		this.rawbNumber = rawbNumber;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getWeightUom() {
		return weightUom;
	}

	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public String getVolumeUom() {
		return volumeUom;
	}

	public void setVolumeUom(String volumeUom) {
		this.volumeUom = volumeUom;
	}

	public Date getShipmentCreationDate() {
		return shipmentCreationDate;
	}

	public void setShipmentCreationDate(Date shipmentCreationDate) {
		this.shipmentCreationDate = shipmentCreationDate;
	}

	public Date getDispatchedDate() {
		return dispatchedDate;
	}

	public void setDispatchedDate(Date dispatchedDate) {
		this.dispatchedDate = dispatchedDate;
	}

	public Date getCancelledDate() {
		return cancelledDate;
	}

	public void setCancelledDate(Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public String getToDhlWarehouse() {
		return toDhlWarehouse;
	}

	public void setToDhlWarehouse(String toDhlWarehouse) {
		this.toDhlWarehouse = toDhlWarehouse;
	}

	public String getFromDhlWarehouse() {
		return fromDhlWarehouse;
	}

	public void setFromDhlWarehouse(String fromDhlWarehouse) {
		this.fromDhlWarehouse = fromDhlWarehouse;
	}

	public String getCustomerProductClass() {
		return customerProductClass;
	}

	public void setCustomerProductClass(String customerProductClass) {
		this.customerProductClass = customerProductClass;
	}

	public String getFieldEngineerID() {
		return fieldEngineerID;
	}

	public void setFieldEngineerID(String fieldEngineerID) {
		this.fieldEngineerID = fieldEngineerID;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getOrderLineReference() {
		return orderLineReference;
	}

	public void setOrderLineReference(String orderLineReference) {
		this.orderLineReference = orderLineReference;
	}

	public String getOrderGeneratedBy() {
		return orderGeneratedBy;
	}

	public void setOrderGeneratedBy(String orderGeneratedBy) {
		this.orderGeneratedBy = orderGeneratedBy;
	}

	public Date getStartOrderGeneration() {
		return startOrderGeneration;
	}

	public void setStartOrderGeneration(Date startOrderGeneration) {
		this.startOrderGeneration = startOrderGeneration;
	}

	public Date getEndOrderGeneration() {
		return endOrderGeneration;
	}

	public void setEndOrderGeneration(Date endOrderGeneration) {
		this.endOrderGeneration = endOrderGeneration;
	}

	public String getPickedBy() {
		return pickedBy;
	}

	public void setPickedBy(String pickedBy) {
		this.pickedBy = pickedBy;
	}

	public Date getStartPickTime() {
		return startPickTime;
	}

	public void setStartPickTime(Date startPickTime) {
		this.startPickTime = startPickTime;
	}

	public Date getEndPickTime() {
		return endPickTime;
	}

	public void setEndPickTime(Date endPickTime) {
		this.endPickTime = endPickTime;
	}

	public String getPackedBy() {
		return packedBy;
	}

	public void setPackedBy(String packedBy) {
		this.packedBy = packedBy;
	}

	public Date getStartPackTime() {
		return startPackTime;
	}

	public void setStartPackTime(Date startPackTime) {
		this.startPackTime = startPackTime;
	}

	public Date getEndPackTime() {
		return endPackTime;
	}

	public void setEndPackTime(Date endPackTime) {
		this.endPackTime = endPackTime;
	}

	public String getShipConfirmedBy() {
		return shipConfirmedBy;
	}

	public void setShipConfirmedBy(String shipConfirmedBy) {
		this.shipConfirmedBy = shipConfirmedBy;
	}

	public Date getStartShipConfirmTime() {
		return startShipConfirmTime;
	}

	public void setStartShipConfirmTime(Date startShipConfirmTime) {
		this.startShipConfirmTime = startShipConfirmTime;
	}

	public Date getEndShipConfirmTime() {
		return endShipConfirmTime;
	}

	public void setEndShipConfirmTime(Date endShipConfirmTime) {
		this.endShipConfirmTime = endShipConfirmTime;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getHarmonizedCode() {
		return harmonizedCode;
	}

	public void setHarmonizedCode(String harmonizedCode) {
		this.harmonizedCode = harmonizedCode;
	}

	public String getSuggestedLpnNumber() {
		return suggestedLpnNumber;
	}

	public void setSuggestedLpnNumber(String suggestedLpnNumber) {
		this.suggestedLpnNumber = suggestedLpnNumber;
	}

	public String getSecondarySerialNo() {
		return secondarySerialNo;
	}

	public void setSecondarySerialNo(String secondarySerialNo) {
		this.secondarySerialNo = secondarySerialNo;
	}

	public Date getReadyForCollectionDatetime() {
		return readyForCollectionDatetime;
	}

	public void setReadyForCollectionDatetime(Date readyForCollectionDatetime) {
		this.readyForCollectionDatetime = readyForCollectionDatetime;
	}

	public Date getCollectedDatetime() {
		return collectedDatetime;
	}

	public void setCollectedDatetime(Date collectedDatetime) {
		this.collectedDatetime = collectedDatetime;
	}

	public String getSigner() {
		return signer;
	}

	public void setSigner(String signer) {
		this.signer = signer;
	}

	public Date getStageToDockTime() {
		return stageToDockTime;
	}

	public void setStageToDockTime(Date stageToDockTime) {
		this.stageToDockTime = stageToDockTime;
	}

	public String getCarrierServiceLevel() {
		return carrierServiceLevel;
	}

	public void setCarrierServiceLevel(String carrierServiceLevel) {
		this.carrierServiceLevel = carrierServiceLevel;
	}

	public Date getShipmentPickUpDatetime() {
		return shipmentPickUpDatetime;
	}

	public void setShipmentPickUpDatetime(Date shipmentPickUpDatetime) {
		this.shipmentPickUpDatetime = shipmentPickUpDatetime;
	}

	public String getShipmentPickupUser() {
		return shipmentPickupUser;
	}

	public void setShipmentPickupUser(String shipmentPickupUser) {
		this.shipmentPickupUser = shipmentPickupUser;
	}

	public Date getShipmentPackDatetime() {
		return shipmentPackDatetime;
	}

	public void setShipmentPackDatetime(Date shipmentPackDatetime) {
		this.shipmentPackDatetime = shipmentPackDatetime;
	}

	public Date getShipmentDispatchDatetime() {
		return shipmentDispatchDatetime;
	}

	public void setShipmentDispatchDatetime(Date shipmentDispatchDatetime) {
		this.shipmentDispatchDatetime = shipmentDispatchDatetime;
	}

	@Override
	public String toString() {
		return "HR002 [id=" + id + ", customerName=" + customerName + ", orderNumber=" + orderNumber
				+ ", shipmentNumber=" + shipmentNumber + ", referenceNo1=" + referenceNo1 + ", reference2=" + referenceNo2
				+ ", reference3=" + referenceNo3 + ", reference4=" + referenceNo4 + ", reference5=" + referenceNo5
				+ ", reference6=" + referenceNo6 + ", customerServiceType=" + customerServiceType + ", dhlServiceType="
				+ dhlServiceType + ", documentType=" + documentType + ", orderType=" + orderType + ", serviceLevel="
				+ serviceLevel + ", eta=" + eta + ", shipFromWarehouse=" + shipFromWarehouse + ", shipToWarehouse="
				+ shipToWarehouse + ", shipToName=" + shipToName + ", shipToAddress=" + shipToAddress + ", shipToState="
				+ shipToState + ", shipToCity=" + shipToCity + ", shipToZipcode=" + shipToZipcode + ", shipToCountry="
				+ shipToCountry + ", shipFromRegion=" + shipFromRegion + ", shipToContact=" + shipToContact
				+ ", shipToContactNumber=" + shipToContactNumber + ", pickInstruction=" + pickInstruction
				+ ", packInstruction=" + packInstruction + ", deliveryInstruction=" + deliveryInstruction
				+ ", shipmentStatus=" + shipmentStatus + ", orderLineNumber=" + orderLineNumber + ", productClass="
				+ productClass + ", partNumber=" + partNumber + ", partDescription=" + partDescription
				+ ", requestShipLineQty=" + requestShipLineQty + ", shippedLineQty=" + shippedLineQty
				+ ", shippedLpnQty=" + shippedLpnQty + ", lpnNumber=" + lpnNumber + ", serialNumber=" + serialNumber
				+ ", revisionLevel=" + revisionLevel + ", lotNumber=" + lotNumber + ", batchNumber=" + batchNumber
				+ ", segment=" + segment + ", carrier=" + carrier + ", awbNumber=" + awbNumber + ", rawbNumber="
				+ rawbNumber + ", weight=" + weight + ", weightUom=" + weightUom + ", volume=" + volume + ", volumeUom="
				+ volumeUom + ", shipmentCreationDate=" + shipmentCreationDate + ", dispatchedDate=" + dispatchedDate
				+ ", cancelledDate=" + cancelledDate + ", toDhlWarehouse=" + toDhlWarehouse + ", fromDhlWarehouse="
				+ fromDhlWarehouse + ", customerProductClass=" + customerProductClass + ", fieldEngineerID="
				+ fieldEngineerID + ", uom=" + uom + ", orderLineReference=" + orderLineReference
				+ ", orderGeneratedBy=" + orderGeneratedBy + ", startOrderGeneration=" + startOrderGeneration
				+ ", endOrderGeneration=" + endOrderGeneration + ", pickedBy=" + pickedBy + ", startPickTime="
				+ startPickTime + ", endPickTime=" + endPickTime + ", packedBy=" + packedBy + ", startPackTime="
				+ startPackTime + ", endPackTime=" + endPackTime + ", shipConfirmedBy=" + shipConfirmedBy
				+ ", startShipConfirmTime=" + startShipConfirmTime + ", endShipConfirmTime=" + endShipConfirmTime
				+ ", unitPrice=" + unitPrice + ", harmonizedCode=" + harmonizedCode + ", suggestedLpnNumber="
				+ suggestedLpnNumber + ", secondarySerialNo=" + secondarySerialNo + ", readyForCollectionDatetime="
				+ readyForCollectionDatetime + ", collectedDatetime=" + collectedDatetime + ", signer=" + signer
				+ ", stageToDockTime=" + stageToDockTime + ", carrierServiceLevel=" + carrierServiceLevel
				+ ", shipmentPickUpDatetime=" + shipmentPickUpDatetime + ", shipmentPickupUser=" + shipmentPickupUser
				+ ", shipmentPackDatetime=" + shipmentPackDatetime + ", shipmentDispatchDatetime="
				+ shipmentDispatchDatetime + "]";
	} 
	
	

}
