package com.yaksha.training.tutor.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.tutor.entity.Tutor;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/tutor", "/" })
public class TutorController {

	@GetMapping(value = { "/list", "/" })
	public String listTutors(@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/addTutorForm")
	public String showFormForAdd(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveTutor")
	public String saveTutor(@Valid @ModelAttribute("tutor") Tutor tutor, BindingResult bindingResult) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateTutorForm")
	public String showFormForUpdate(@RequestParam("tutorId") Long id, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete")
	public String deleteTutor(@RequestParam("tutorId") Long id) {
		// write your logic here
		return "";
	}

	@RequestMapping("/search")
	public String searchTutors(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateAvailability")
	public String updateAvailability(@RequestParam("tutorId") Long id, @RequestParam("status") Integer status) {
		// write your logic here
		return "";
	}
}
