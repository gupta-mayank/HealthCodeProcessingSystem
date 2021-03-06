package com.healthcode.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * This POJO represents 'Visit Entry Details' collection in DB 
 *
 */
@Document(collection="Visit_Entry_Details")
public class VisitEntry extends ModelEntity{

	private String visitEntryRef;
	private String doctorCode;
	private String healthCode;
	private List<VisitMedicalPrescriptions> prescriptions;
	VisitDiagnosticPrescription diagnosticSuggestions;
	private Date visitDate;
	Boolean isReminderRequired;
	Date nextAppointment;
	
	public String getVisitEntryRef() {
		return visitEntryRef;
	}
	public void setVisitEntryRef(String visitEntryRef) {
		this.visitEntryRef = visitEntryRef;
	}
	public String getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}
	public String getHealthCode() {
		return healthCode;
	}
	public void setHealthCode(String healthCode) {
		this.healthCode = healthCode;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public List<VisitMedicalPrescriptions> getPrescriptions() {
		return prescriptions;
	}
	public void setPrescriptions(List<VisitMedicalPrescriptions> prescriptions) {
		this.prescriptions = prescriptions;
	}
	public VisitDiagnosticPrescription getDiagnosticSuggestions() {
		return diagnosticSuggestions;
	}
	public void setDiagnosticSuggestions(
			VisitDiagnosticPrescription diagnosticSuggestions) {
		this.diagnosticSuggestions = diagnosticSuggestions;
	}
	public Boolean getIsReminderRequired() {
		return isReminderRequired;
	}
	public void setIsReminderRequired(Boolean isReminderRequired) {
		this.isReminderRequired = isReminderRequired;
	}
	public Date getNextAppointment() {
		return nextAppointment;
	}
	public void setNextAppointment(Date nextAppointment) {
		this.nextAppointment = nextAppointment;
	}
	
}
