package com.capg.assign.dao;

import java.util.List;

import com.capg.assign.entity.Trainee;

public interface TraineeDao
{
	 boolean isValidLogin(String name, String password);
	 Trainee addDetails(Trainee trainee);
	 Trainee retrieveById(int traineeId);
	 List<Trainee> retrieveAll();
	 Trainee remove(int traineeId);
	 Trainee modify(int traineeId, String traineeName, String traineeDomain, String traineeLocation);
}
