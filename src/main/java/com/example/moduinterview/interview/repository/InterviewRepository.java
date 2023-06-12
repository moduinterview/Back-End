package com.example.moduinterview.interview.repository;

import com.example.moduinterview.interview.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Long> {


}
