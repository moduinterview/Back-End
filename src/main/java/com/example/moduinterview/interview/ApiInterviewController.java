package com.example.moduinterview.interview;


import com.example.moduinterview.interview.repository.InterviewRepository;
import com.example.moduinterview.interview.service.InterviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiInterviewController {

  private final InterviewService interviewService;

  private final InterviewRepository interviewRepository;
}


