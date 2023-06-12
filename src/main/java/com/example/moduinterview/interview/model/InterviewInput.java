package com.example.moduinterview.interview.model;


import com.example.moduinterview.enums.InterviewStatus;
import com.example.moduinterview.enums.InterviewType;
import com.example.moduinterview.enums.MoneyUnit;
import com.example.moduinterview.enums.Region;
import java.time.LocalDateTime;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class InterviewInput {


  @Size(min = 0, max = 100, message = "리크루트 인원은 1~100명 사이로 작성해주세요.")
  private Long recruitNum;

  @Length(min = 1, max = 30, message = "제목은 1~30자 길이로 작성해주세요.")
  private String title;
  private LocalDateTime dueDate;
  private LocalDateTime interviewDate;

  private String description;
  private InterviewType interviewType;

  private MoneyUnit moneyUnit;
  private InterviewStatus interviewStatus;
  private String contactName;
  private String contactPhone;

  @Email(message = "이메일 형식이 아닙니다.")
  private String contactEmail;
  private LocalDateTime regDate;
  private LocalDateTime modifiedDate;
  private String thumbnailLink;
  private Region region;


}
