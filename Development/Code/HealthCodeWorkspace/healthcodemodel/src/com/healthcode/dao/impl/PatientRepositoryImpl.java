package com.healthcode.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.healthcode.dao.PatientRepository;
import com.healthcode.dao.PersonInterface;
import com.healthcode.model.Patient;
import com.healthcode.model.PersonDetails;


@Repository
public class PatientRepositoryImpl  extends BaseRepositoryImpl<Patient> implements PatientRepository {

	
	@Override
	public PersonDetails getPersonByHealthCode(String healthCode) {
		MongoOperations mongoOp = (MongoOperations) getMongoDBInstance();
		//Query 'Patient' collection by Health Code
		Query searchPatientbyHealthCode = new Query(Criteria
								.where(PersonInterface.HEALTHCODE)
								.is(healthCode)); 
		PersonDetails patient = mongoOp.findOne(searchPatientbyHealthCode,Patient.class); 
		
		return patient;
	}

	@Override
	public Collection<PersonDetails> getPersonByCity(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<PersonDetails> getPersonByAgeRange(Integer start,
			Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<PersonDetails> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<PersonDetails> getPersonByGenderAndAge(String geneder,
			Integer start, Integer end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Patient> getPersonByDisease(String diseaseName) {
		// TODO Auto-generated method stub
		return null;
	}
}
