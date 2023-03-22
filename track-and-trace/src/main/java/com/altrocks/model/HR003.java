package com.altrocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HR003")
public class HR003 { //Transport_Shipment//

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "ship_from_warehouse_code")
	private String shipFromWarehouseCode;
	
	@Column(name = "ship_to_warehouse_code1")
	private String shipToWarehouseCode1;
	
	@Column(name = "shipment")
	private String shipment;	
	
	@Column(name = "orders")
	private String order;
	
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
	
	@Column(name = "service_type")
	private String serviceType;	
	
	@Column(name = "document_type")
	private String documentType;
	
	@Column(name = "service_level")
	private String serviceLevel;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "ship_to_warehouse_code2")
	private String shipToWarehouseCode2;
	
	@Column(name = "ship_to_name")
	private String shipToName;	
	
	@Column(name = "ship_to_address_line1")
	private String shipToAddressLine1;
	
	@Column(name = "ship_to_address_line2")
	private String shipToAddressLine2;	
	
	@Column(name = "ship_to_address_line3")
	private String shipToAddressLine3;	
	
	@Column(name = "ship_to_address_line4")
	private String shipToAddressLine4;	
	
	@Column(name = "ship_to_address_line5")
	private String shipToAddressLine5;	
	
	@Column(name = "ship_to_address_line6")
	private String shipToAddressLine6;	
	
	@Column(name = "ship_to_city")
	private String shipToCity;	
	
	@Column(name = "ship_to_zipcode")
	private String shipToZipCode;  
	
	@Column(name = "ship_to_state")
	private String shipToState;	
	
	@Column(name = "ship_to_country")
	private String shipToCountry;	
	
	@Column(name = "ship_to_contact_name")
	private String shipToContactName;
	
	@Column(name = "ship_to_contact_number")
	private String shipToContactNumber;	
	
	@Column(name = "collect_from_name")
	private String collectFromName;	
	
	@Column(name = "collect_from_address_info")
	private String collectFromAddressInfo;
	
	@Column(name = "collect_from_country")
	private String collectFromCountry;	
	
	@Column(name = "collect_from_contact_name")
	private String collectFromContactName;
	
	@Column(name = "collect_from_contact_number")
	private String collectFromContactNumber;
	
	@Column(name = "carrier")
	private String carrier;	
	
	@Column(name = "awb")
	private String awb;	
	
	@Column(name = "rawb")
	private String rawb;
	
	@Column(name = "weight")
	private double weight;
	
	@Column(name = "weight_uom")
	private String weightUom;
	
	@Column(name = "volume")
	private long volume;
	
	@Column(name = "volume_uom")
	private String volumeUom;	
	
	@Column(name = "total_qty")
	private String totalQty;
	
	@Column(name = "total_no_of_packages")
	private long totalNoOfPackages;
	
	@Column(name = "original_eta_datetime")
	private Date originalEtaDatetime;
	
	@Column(name = "latest_eta_datetime")
	private Date latestEtaDatetime;	
	
	@Column(name = "eta_revision_reason_code")
	private String etaRevisionReasonCode;	
	
	@Column(name = "eta_revision_reason_comments")
	private String etaRevisionReasonComments;
	
	@Column(name = "courier_name")
	private String courierName;	
	
	@Column(name = "courier_contact_number")
	private String courierContactNumber;
	
	@Column(name = "courier_pickup_datetime")
	private Date courierPickUpDatetime;	
	
	@Column(name = "actual_delivery_datetime")
	private Date actualDeliveryDatetime;
	
	@Column(name = "distance_travelled")
	private double distanceTravelled;	
	
	@Column(name = "pod_reason_code")
	private String podReasonCode;
	
	@Column(name = "pod_reason_comments")
	private String podReasonComments;
	
	@Column(name = "signer")
	private String signer;	
	
	@Column(name = "total_toll_fee_amount")
	private double totalTollFeeAmount;
	
	@Column(name = "currency")
	private String currency;	
	
	@Column(name = "user_id")
	private String userId;	
	
	@Column(name = "shipment_creation_date")
	private Date shipmentCreationDate;
	
	@Column(name = "wms_reference1")
	private String wmsReference1;	
	
	@Column(name = "order_creation_date")
	private Date orderCreationDate;	
	
	@Column(name = "field_engineer_id")
	private String fieldEngineerId;	
	
	@Column(name = "pod_entry_date")
	private Date podEntryDate;	
	
	@Column(name = "shipment_comments")
	private String shipmentComments;
	
	@Column(name = "late_pod_entry_reason_code")
	private String latePodEntryReasonCode;	
	
	@Column(name = "late_pod_entry_reason_comment")
	private String latePodEntryReasonComment;
	
	@Column(name = "field_engineer_name")
	private String fieldEngineerName;	
	
	@Column(name = "ready_for_collection_datetime")
	private Date readyForCollectionDatetime;
	
	@Column(name = "carrier_service_level")
	private String carrierServiceLevel;
	
	@Column(name = "first_eta_revision_date")
	private Date firstEtaRevisionDate;	
	
	@Column(name = "shipment_pickup_datetime")
	private Date shipmentPickUpDatetime;
	
	@Column(name = "shipment_pickup_User")
	private String shipmentPickUpUser;	
	
	@Column(name = "shipment_pack_datetime")
	private Date shipmentPackDatetime;
	
	@Column(name = "shipment_dispatch_datetime")
	private Date shipmentDispatchDatetime;	
	
	@Column(name = "order_type")
	private String orderType;

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

	public String getShipFromWarehouseCode() {
		return shipFromWarehouseCode;
	}

	public void setShipFromWarehouseCode(String shipFromWarehouseCode) {
		this.shipFromWarehouseCode = shipFromWarehouseCode;
	}

	public String getShipToWarehouseCode1() {
		return shipToWarehouseCode1;
	}

	public void setShipToWarehouseCode1(String shipToWarehouseCode1) {
		this.shipToWarehouseCode1 = shipToWarehouseCode1;
	}

	public String getShipment() {
		return shipment;
	}

	public void setShipment(String shipment) {
		this.shipment = shipment;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
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

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getShipToWarehouseCode2() {
		return shipToWarehouseCode2;
	}

	public void setShipToWarehouseCode2(String shipToWarehouseCode2) {
		this.shipToWarehouseCode2 = shipToWarehouseCode2;
	}

	public String getShipToName() {
		return shipToName;
	}

	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	public String getShipToAddressLine1() {
		return shipToAddressLine1;
	}

	public void setShipToAddressLine1(String shipToAddressLine1) {
		this.shipToAddressLine1 = shipToAddressLine1;
	}

	public String getShipToAddressLine2() {
		return shipToAddressLine2;
	}

	public void setShipToAddressLine2(String shipToAddressLine2) {
		this.shipToAddressLine2 = shipToAddressLine2;
	}

	public String getShipToAddressLine3() {
		return shipToAddressLine3;
	}

	public void setShipToAddressLine3(String shipToAddressLine3) {
		this.shipToAddressLine3 = shipToAddressLine3;
	}

	public String getShipToAddressLine4() {
		return shipToAddressLine4;
	}

	public void setShipToAddressLine4(String shipToAddressLine4) {
		this.shipToAddressLine4 = shipToAddressLine4;
	}

	public String getShipToAddressLine5() {
		return shipToAddressLine5;
	}

	public void setShipToAddressLine5(String shipToAddressLine5) {
		this.shipToAddressLine5 = shipToAddressLine5;
	}

	public String getShipToAddressLine6() {
		return shipToAddressLine6;
	}

	public void setShipToAddressLine6(String shipToAddressLine6) {
		this.shipToAddressLine6 = shipToAddressLine6;
	}

	public String getShipToCity() {
		return shipToCity;
	}

	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}

	public String getShipToZipCode() {
		return shipToZipCode;
	}

	public void setShipToZipCode(String shipToZipCode) {
		this.shipToZipCode = shipToZipCode;
	}

	public String getShipToState() {
		return shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	public String getShipToCountry() {
		return shipToCountry;
	}

	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}

	public String getShipToContactName() {
		return shipToContactName;
	}

	public void setShipToContactName(String shipToContactName) {
		this.shipToContactName = shipToContactName;
	}

	public String getShipToContactNumber() {
		return shipToContactNumber;
	}

	public void setShipToContactNumber(String shipToContactNumber) {
		this.shipToContactNumber = shipToContactNumber;
	}

	public String getCollectFromName() {
		return collectFromName;
	}

	public void setCollectFromName(String collectFromName) {
		this.collectFromName = collectFromName;
	}

	public String getCollectFromAddressInfo() {
		return collectFromAddressInfo;
	}

	public void setCollectFromAddressInfo(String collectFromAddressInfo) {
		this.collectFromAddressInfo = collectFromAddressInfo;
	}

	public String getCollectFromCountry() {
		return collectFromCountry;
	}

	public void setCollectFromCountry(String collectFromCountry) {
		this.collectFromCountry = collectFromCountry;
	}

	public String getCollectFromContactName() {
		return collectFromContactName;
	}

	public void setCollectFromContactName(String collectFromContactName) {
		this.collectFromContactName = collectFromContactName;
	}

	public String getCollectFromContactNumber() {
		return collectFromContactNumber;
	}

	public void setCollectFromContactNumber(String collectFromContactNumber) {
		this.collectFromContactNumber = collectFromContactNumber;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getAwb() {
		return awb;
	}

	public void setAwb(String awb) {
		this.awb = awb;
	}

	public String getRawb() {
		return rawb;
	}

	public void setRawb(String rawb) {
		this.rawb = rawb;
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

	public String getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
	}

	public long getTotalNoOfPackages() {
		return totalNoOfPackages;
	}

	public void setTotalNoOfPackages(long totalNoOfPackages) {
		this.totalNoOfPackages = totalNoOfPackages;
	}

	public Date getOriginalEtaDatetime() {
		return originalEtaDatetime;
	}

	public void setOriginalEtaDatetime(Date originalEtaDatetime) {
		this.originalEtaDatetime = originalEtaDatetime;
	}

	public Date getLatestEtaDatetime() {
		return latestEtaDatetime;
	}

	public void setLatestEtaDatetime(Date latestEtaDatetime) {
		this.latestEtaDatetime = latestEtaDatetime;
	}

	public String getEtaRevisionReasonCode() {
		return etaRevisionReasonCode;
	}

	public void setEtaRevisionReasonCode(String etaRevisionReasonCode) {
		this.etaRevisionReasonCode = etaRevisionReasonCode;
	}

	public String getEtaRevisionReasonComments() {
		return etaRevisionReasonComments;
	}

	public void setEtaRevisionReasonComments(String etaRevisionReasonComments) {
		this.etaRevisionReasonComments = etaRevisionReasonComments;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierContactNumber() {
		return courierContactNumber;
	}

	public void setCourierContactNumber(String courierContactNumber) {
		this.courierContactNumber = courierContactNumber;
	}

	public Date getCourierPickUpDatetime() {
		return courierPickUpDatetime;
	}

	public void setCourierPickUpDatetime(Date courierPickUpDatetime) {
		this.courierPickUpDatetime = courierPickUpDatetime;
	}

	public Date getActualDeliveryDatetime() {
		return actualDeliveryDatetime;
	}

	public void setActualDeliveryDatetime(Date actualDeliveryDatetime) {
		this.actualDeliveryDatetime = actualDeliveryDatetime;
	}

	public double getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	public String getPodReasonCode() {
		return podReasonCode;
	}

	public void setPodReasonCode(String podReasonCode) {
		this.podReasonCode = podReasonCode;
	}

	public String getPodReasonComments() {
		return podReasonComments;
	}

	public void setPodReasonComments(String podReasonComments) {
		this.podReasonComments = podReasonComments;
	}

	public String getSigner() {
		return signer;
	}

	public void setSigner(String signer) {
		this.signer = signer;
	}

	public double getTotalTollFeeAmount() {
		return totalTollFeeAmount;
	}

	public void setTotalTollFeeAmount(double totalTollFeeAmount) {
		this.totalTollFeeAmount = totalTollFeeAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getShipmentCreationDate() {
		return shipmentCreationDate;
	}

	public void setShipmentCreationDate(Date shipmentCreationDate) {
		this.shipmentCreationDate = shipmentCreationDate;
	}

	public String getWmsReference1() {
		return wmsReference1;
	}

	public void setWmsReference1(String wmsReference1) {
		this.wmsReference1 = wmsReference1;
	}

	public Date getOrderCreationDate() {
		return orderCreationDate;
	}

	public void setOrderCreationDate(Date orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}

	public String getFieldEngineerId() {
		return fieldEngineerId;
	}

	public void setFieldEngineerId(String fieldEngineerId) {
		this.fieldEngineerId = fieldEngineerId;
	}

	public Date getPodEntryDate() {
		return podEntryDate;
	}

	public void setPodEntryDate(Date podEntryDate) {
		this.podEntryDate = podEntryDate;
	}

	public String getShipmentComments() {
		return shipmentComments;
	}

	public void setShipmentComments(String shipmentComments) {
		this.shipmentComments = shipmentComments;
	}

	public String getLatePodEntryReasonCode() {
		return latePodEntryReasonCode;
	}

	public void setLatePodEntryReasonCode(String latePodEntryReasonCode) {
		this.latePodEntryReasonCode = latePodEntryReasonCode;
	}

	public String getLatePodEntryReasonComment() {
		return latePodEntryReasonComment;
	}

	public void setLatePodEntryReasonComment(String latePodEntryReasonComment) {
		this.latePodEntryReasonComment = latePodEntryReasonComment;
	}

	public String getFieldEngineerName() {
		return fieldEngineerName;
	}

	public void setFieldEngineerName(String fieldEngineerName) {
		this.fieldEngineerName = fieldEngineerName;
	}

	public Date getReadyForCollectionDatetime() {
		return readyForCollectionDatetime;
	}

	public void setReadyForCollectionDatetime(Date readyForCollectionDatetime) {
		this.readyForCollectionDatetime = readyForCollectionDatetime;
	}

	public String getCarrierServiceLevel() {
		return carrierServiceLevel;
	}

	public void setCarrierServiceLevel(String carrierServiceLevel) {
		this.carrierServiceLevel = carrierServiceLevel;
	}

	public Date getFirstEtaRevisionDate() {
		return firstEtaRevisionDate;
	}

	public void setFirstEtaRevisionDate(Date firstEtaRevisionDate) {
		this.firstEtaRevisionDate = firstEtaRevisionDate;
	}

	public Date getShipmentPickUpDatetime() {
		return shipmentPickUpDatetime;
	}

	public void setShipmentPickUpDatetime(Date shipmentPickUpDatetime) {
		this.shipmentPickUpDatetime = shipmentPickUpDatetime;
	}

	public String getShipmentPickUpUser() {
		return shipmentPickUpUser;
	}

	public void setShipmentPickUpUser(String shipmentPickUpUser) {
		this.shipmentPickUpUser = shipmentPickUpUser;
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

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Override
	public String toString() {
		return "HR003 [id=" + id + ", customerName=" + customerName + ", shipFromWarehouseCode=" + shipFromWarehouseCode
				+ ", shipToWarehouseCode1=" + shipToWarehouseCode1 + ", shipment=" + shipment + ", order=" + order
				+ ", referenceNo1=" + referenceNo1 + ", referenceNo2=" + referenceNo2 + ", referenceNo3=" + referenceNo3
				+ ", referenceNo4=" + referenceNo4 + ", referenceNo5=" + referenceNo5 + ", referenceNo6=" + referenceNo6
				+ ", serviceType=" + serviceType + ", documentType=" + documentType + ", serviceLevel=" + serviceLevel
				+ ", status=" + status + ", shipToWarehouseCode2=" + shipToWarehouseCode2 + ", shipToName=" + shipToName
				+ ", shipToAddressLine1=" + shipToAddressLine1 + ", shipToAddressLine2=" + shipToAddressLine2
				+ ", shipToAddressLine3=" + shipToAddressLine3 + ", shipToAddressLine4=" + shipToAddressLine4
				+ ", shipToAddressLine5=" + shipToAddressLine5 + ", shipToAddressLine6=" + shipToAddressLine6
				+ ", shipToCity=" + shipToCity + ", shipToZipCode=" + shipToZipCode + ", shipToState=" + shipToState
				+ ", shipToCountry=" + shipToCountry + ", shipToContactName=" + shipToContactName
				+ ", shipToContactNumber=" + shipToContactNumber + ", collectFromName=" + collectFromName
				+ ", collectFromAddressInfo=" + collectFromAddressInfo + ", collectFromCountry=" + collectFromCountry
				+ ", collectFromContactName=" + collectFromContactName + ", collectFromContactNumber="
				+ collectFromContactNumber + ", carrier=" + carrier + ", awb=" + awb + ", rawb=" + rawb + ", weight="
				+ weight + ", weightUom=" + weightUom + ", volume=" + volume + ", volumeUom=" + volumeUom
				+ ", totalQty=" + totalQty + ", totalNoOfPackages=" + totalNoOfPackages + ", originalEtaDatetime="
				+ originalEtaDatetime + ", latestEtaDatetime=" + latestEtaDatetime + ", etaRevisionReasonCode="
				+ etaRevisionReasonCode + ", etaRevisionReasonComments=" + etaRevisionReasonComments + ", courierName="
				+ courierName + ", courierContactNumber=" + courierContactNumber + ", courierPickUpDatetime="
				+ courierPickUpDatetime + ", actualDeliveryDatetime=" + actualDeliveryDatetime + ", distanceTravelled="
				+ distanceTravelled + ", podReasonCode=" + podReasonCode + ", podReasonComments=" + podReasonComments
				+ ", signer=" + signer + ", totalTollFeeAmount=" + totalTollFeeAmount + ", currency=" + currency
				+ ", userId=" + userId + ", shipmentCreationDate=" + shipmentCreationDate + ", wmsReference1="
				+ wmsReference1 + ", orderCreationDate=" + orderCreationDate + ", fieldEngineerId=" + fieldEngineerId
				+ ", podEntryDate=" + podEntryDate + ", shipmentComments=" + shipmentComments
				+ ", latePodEntryReasonCode=" + latePodEntryReasonCode + ", latePodEntryReasonComment="
				+ latePodEntryReasonComment + ", fieldEngineerName=" + fieldEngineerName
				+ ", readyForCollectionDatetime=" + readyForCollectionDatetime + ", carrierServiceLevel="
				+ carrierServiceLevel + ", firstEtaRevisionDate=" + firstEtaRevisionDate + ", shipmentPickUpDatetime="
				+ shipmentPickUpDatetime + ", shipmentPickUpUser=" + shipmentPickUpUser + ", shipmentPackDatetime="
				+ shipmentPackDatetime + ", shipmentDispatchDatetime=" + shipmentDispatchDatetime + ", orderType="
				+ orderType + "]";
	}

	
	
}
