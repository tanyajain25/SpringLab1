package com.capg.assign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.capg.assign.entity.Trainee;
import com.capg.assign.service.TraineeService;

@Controller
public class TraineeController {
	@Autowired
	private TraineeService service;

	@GetMapping("/")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	@GetMapping("/operations")
	public ModelAndView operations() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("operations");
		return mv;
	}

	@GetMapping("/loginprocess")
	public ModelAndView loginProcess(@RequestParam("name") String name, @RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView();
		boolean isValid = service.isValidLogin(name, password);
		if (isValid) {
			mv.setViewName("operations");
			return mv;
		} else {
			mv.setViewName("wrongCredentials");
		}
		return mv;

	}

	@GetMapping("/add")
	public ModelAndView addDetails() {
		ModelAndView mv = new ModelAndView();
		return mv;
	}

	@GetMapping("/addprocess")
	public ModelAndView addProcess(@RequestParam("traineeId") int id, @RequestParam("traineeName") String name,
			@RequestParam("traineeLocation") String location, @RequestParam("traineeDomain") String domain) {

		Trainee t = new Trainee(id, name, domain, location);
		service.addDetails(t);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("operations");
		return mv;
	}

	@GetMapping("/retrieve")
	public ModelAndView retrieveDetail() {
		ModelAndView mv = new ModelAndView();
		return mv;
	}

	@GetMapping("/retrieveprocess")
	public ModelAndView retrieveProcess(@RequestParam("traineeId") int id) {

		Trainee trainee = service.retrieveById(id);

		ModelAndView mv = new ModelAndView("retrieveTraineeInfo", "trainee", trainee);
		return mv;
	}

	@GetMapping("/retrieveallprocess")
	public ModelAndView retrieveAllProcess() {

		List<Trainee> trainees = service.retrieveAll();

		ModelAndView mv = new ModelAndView("retrieveall");
		mv.addObject("traineelist", trainees);
		return mv;
	}

	@GetMapping("/delete")
	public ModelAndView deleteTraineeInfo() {
		ModelAndView mv = new ModelAndView();
		return mv;
	}

	@GetMapping("/deleteprocess")
	public ModelAndView deletedetails(@RequestParam("traineeId") int id) {
		Trainee trainee = service.remove(id);
		ModelAndView mv = new ModelAndView("remove", "trainee", trainee);
		return mv;
	}

	@GetMapping("/modify")
	public ModelAndView modifyTraineeInfo() {
		ModelAndView mv = new ModelAndView("modificationPage");
		return mv;
	}

	@GetMapping("/modifyprocess")
	public ModelAndView modifydetails(@RequestParam("traineeId") int id, @RequestParam("traineeName") String name,
			@RequestParam("traineeLocation") String location, @RequestParam("traineeDomain") String domain) {
		Trainee trainee = service.retrieveById(id);
		trainee = service.modify(id, name, domain, location);
		ModelAndView mv = new ModelAndView("retrieveTraineeInfo", "trainee", trainee);
		return mv;
	}
}
