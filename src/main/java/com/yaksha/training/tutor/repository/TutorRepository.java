package com.yaksha.training.tutor.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.tutor.entity.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

	// feel free to edit this
	Page<Tutor> findByTutorNameAndSubject(@Param("keyword") String keyword, Pageable pageable);

	// feel free to edit this
	void updateTutorAvailability(@Param("id") Long id, @Param("status") Integer status);

	// feel free to edit this
	Page<Tutor> findAllTutor(Pageable pageable);
}
