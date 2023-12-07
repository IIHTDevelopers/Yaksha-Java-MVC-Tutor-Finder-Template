package com.yaksha.training.tutor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.tutor.entity.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

	List<Tutor> findByTutorNameAndSubject(@Param("keyword") String keyword);
}
