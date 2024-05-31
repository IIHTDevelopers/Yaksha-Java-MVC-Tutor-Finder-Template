package com.yaksha.training.tutor.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.tutor.entity.Tutor;

@Service
public class TutorService {

	public Page<Tutor> getTutors(Pageable pageable) {
		// write your logic here
		return null;
	}

	public Tutor saveTutor(Tutor tutor) {
		// write your logic here
		return null;
	}

	public Tutor getTutor(Long id) {
		// write your logic here
		return null;
	}

	public boolean deleteTutor(Long id) {
		// write your logic here
		return false;
	}

	public Page<Tutor> searchTutors(String theSearchName, Pageable pageable) {
		// write your logic here
		return null;
	}

	public boolean updateTutorAvailability(Long id, Integer status) {
		// write your logic here
		return false;
	}
}
