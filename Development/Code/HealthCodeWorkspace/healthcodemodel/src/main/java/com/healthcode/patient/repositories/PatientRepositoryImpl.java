package com.healthcode.patient.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.healthcode.springdata.patient.model.domain.Patient;


@Repository
public class PatientRepositoryImpl implements CustomPatientRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public Patient getPatientDetailsbyHealthCode(String healthCode) {
		MongoOperations mongoOp = (MongoOperations) mongoTemplate;
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(CustomPatientRepository.HEALTHCODE)
								.is(healthCode)); 
		Patient patient = mongoOp.findOne(searchPatientbyHealthCode,Patient.class); 
		
		return patient;
	}

}
