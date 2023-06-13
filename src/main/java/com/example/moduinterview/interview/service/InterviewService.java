package com.example.moduinterview.interview.service;

import com.example.moduinterview.common.ServiceResult;
import com.example.moduinterview.enums.InterviewType;
import com.example.moduinterview.interview.model.InterviewInput;
import java.util.List;

public interface InterviewService {

  ///인터뷰 추가
  ServiceResult addInterview(InterviewInput interviewInput);

  ///인터뷰 수정
  ServiceResult updateInterview(InterviewInput interviewInput, Long id);

  ///인터뷰 삭제
  ServiceResult deleteInterview(Long id);

  ///인터뷰 타입반환
  List<InterviewType> getAllInterviewType();

  ///인터뷰 조회수
  ServiceResult InterviewHits(Long interviewId, Long userId);

  ///인터뷰 좋아요
  ServiceResult InterviewLike(Long id, String email);

  ///인터뷰 좋아요 취소
  ServiceResult InterviewUnlike(Long id, String email);

  ///인터뷰 스크랩
  ServiceResult scrap(Long id, String email);


}
