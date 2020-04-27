package com.capg.assign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.assign.dao.TraineeDao;
import com.capg.assign.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	private TraineeDao traineedao;

	public TraineeServiceImpl() {
		super();
	}

	public TraineeServiceImpl(TraineeDao traineedao) {
		super();
		this.traineedao = traineedao;
	}

	public TraineeDao getTraineedao() {
		return traineedao;
	}

	@Autowired
	public void setTraineedao(TraineeDao traineedao) {
		this.traineedao = traineedao;
	}

	@Override
	public boolean isValidLogin(String name, String password) {

		boolean isValid = traineedao.isValidLogin(name, password);
		return isValid;
	}

	@Override
	public Trainee addDetails(Trainee trainee) {
		Trainee traineeObj = traineedao.addDetails(trainee);
		return traineeObj;
	}

	@Override
	public Trainee retrieveById(int traineeId) {
		Trainee traineeObj = traineedao.retrieveById(traineeId);
		return traineeObj;
	}

	@Override
	public List<Trainee> retrieveAll() {
		List<Trainee> list = traineedao.retrieveAll();
		return list;
	}
	
	@Override
	public Trainee remove(int traineeId)
	{
		Trainee trainee= traineedao.remove(traineeId);
		return trainee;
	}
	@Override
	public Trainee modify(int traineeId, String traineeName, String traineeDomain, String traineeLocation)
	{
		Trainee trainee= traineedao.modify(traineeId, traineeName, traineeDomain, traineeLocation);
		return trainee;
	}

}
