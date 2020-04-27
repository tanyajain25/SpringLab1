package com.capg.assign.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.capg.assign.dto.AdminCredentialsDto;
import com.capg.assign.entity.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {
	private Map<Integer, AdminCredentialsDto> map = new HashMap<>();
	public TraineeDaoImpl()
	{
		map.put(1, new AdminCredentialsDto("tanya","123"));
	}
	
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public boolean isValidLogin(String name, String password) {

		if (password.isEmpty() || name.isEmpty()) {
			return false;
		}
		boolean isValidPassword=false;
		new AdminCredentialsDto();
		AdminCredentialsDto admin = map.get(1);
		if(admin.getName().equals(name)) {
		isValidPassword = admin.getPassword().equals(password);
		}
		return isValidPassword;

	}

	public Trainee addDetails(Trainee trainee) {
		trainee = entityManager.merge(trainee);
		return trainee;
		
	}

	public Trainee retrieveById(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		return trainee;

	}

	public List<Trainee> retrieveAll() {
		String s = "from Trainee";
		TypedQuery<Trainee> query = entityManager.createQuery(s, Trainee.class);
		List<Trainee> list = query.getResultList();
		return list;
	}
	
	public Trainee remove(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		entityManager.remove(trainee);
		return trainee;

	}
	
	public Trainee modify(int traineeId, String traineeName, String traineeDomain, String traineeLocation) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		trainee.setTraineeId(traineeId);
		trainee.setTraineeName(traineeName);
		trainee.setTraineeLocation(traineeLocation);
		trainee.setTraineeDomain(traineeDomain);
		return trainee;

	}
	
}
