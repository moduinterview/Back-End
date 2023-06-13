package com.example.moduinterview.interview.service;

import com.example.moduinterview.common.ServiceResult;
import com.example.moduinterview.enums.InterviewType;
import com.example.moduinterview.interview.entity.Interview;
import com.example.moduinterview.interview.model.InterviewInput;
import com.example.moduinterview.interview.repository.InterviewRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InterviewServiceImpl implements InterviewService {

  private final InterviewRepository interviewRepository;

  ///인터뷰 추가
  /*
  InterviewInput의 정보를 받아 Interview Entity를 생성하고
  InterviewRepository를 통해 DB에 저장한다.
  TODO: 비즈니스 정책 확정필요
  추가 안되는 케이스? 가령 동일제목이라던가
   */

  @Override
  public ServiceResult addInterview(InterviewInput interviewInput) {

    Interview interview = new Interview();
    interview.setInterviewFrom(interviewInput);
    interviewRepository.save(interview);

    return ServiceResult.success("Interview added");
  }

  ///인터뷰 수정
  @Override
  public ServiceResult updateInterview(InterviewInput interviewInput, Long id) {
    // Search Interview by id
    Optional<Interview> optionalInterview = interviewRepository.findById(id);
    if (!optionalInterview.isPresent()) {
      return ServiceResult.fail("Interview not found");
    }

    Interview interview = optionalInterview.get();
    interview.setInterviewFrom(interviewInput);
    interviewRepository.save(interview);

    return ServiceResult.success("Interview updated");
  }

  ///인터뷰 삭제
  @Override
  public ServiceResult deleteInterview(Long id) {
    Optional<Interview> optionalInterview = interviewRepository.findById(id);
    if (!optionalInterview.isPresent()) {
      return ServiceResult.fail("Interview not found");
    }
    Interview interview = optionalInterview.get();
    interviewRepository.delete(interview);
    return ServiceResult.success("Interview deleted");
  }

  ///인터뷰 타입반환
  @Override
  public List<InterviewType> getAllInterviewType() {



    return null;
  }

  ///인터뷰 조회수
  @Override
  public ServiceResult InterviewHits(Long interviewId, Long userId) {

    return null;
  }
  ///인터뷰 좋아요
  @Override
  public ServiceResult InterviewLike(Long id, String email) {
    return null;
  }

  ///인터뷰 좋아요 취소
  @Override
  public ServiceResult InterviewUnlike(Long id, String email) {
    return null;
  }

  ///인터뷰 스크랩
  @Override
  public ServiceResult scrap(Long id, String email) {
    return null;
  }
}
