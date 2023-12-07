package com.yaksha.training.tutor.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.tutor.entity.Tutor;

@Controller
@RequestMapping(value = { "/tutor", "/" })
public class TutorController {

	@GetMapping(value = { "/list", "/" })
	public String listTutors(Model model) {
		return "";
	}

	@GetMapping("/addTutorForm")
	public String showFormForAdd(Model model) {
		return "";
	}

	@PostMapping("/saveTutor")
	public String saveTutor(@Valid @ModelAttribute("tutor") Tutor tutor, BindingResult bindingResult) {
		return "";
	}

	@GetMapping("/updateTutorForm")
	public String showFormForUpdate(@RequestParam("tutorId") Long id, Model model) {
		return "";
	}

	@GetMapping("/delete")
	public String deleteTutor(@RequestParam("tutorId") Long id) {
		return "";
	}

	@PostMapping("/search")
	public String searchTutors(@RequestParam("theSearchName") String theSearchName, Model theModel) {
		return "";
	}
}
