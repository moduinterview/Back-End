package com.example.moduinterview.interview;

import com.example.moduinterview.enums.InterviewStatus;
import com.example.moduinterview.enums.InterviewType;
import com.example.moduinterview.enums.MoneyUnit;
import com.example.moduinterview.enums.Region;
import com.example.moduinterview.interview.model.InterviewInput;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Setter
@Getter
public class Interview {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  //TODO : 연관관계 설정 및 컬럼추가

  //TODO : 리크루트인원 0명일때는 리크루트 불가능하게 설정
  @Size(min = 0, max = 100, message = "리크루트 인원은 1~100명 사이로 작성해주세요.")
  private Long recruitNum;

  @Length(min = 1, max = 30, message = "제목은 1~30자 길이로 작성해주세요.")
  private String title;
  private LocalDateTime dueDate;
  private LocalDateTime interviewDate;

  private String description;
  @Enumerated(value = javax.persistence.EnumType.STRING)
  private InterviewType interviewType;


  @Enumerated(value = javax.persistence.EnumType.STRING)
  private MoneyUnit moneyUnit;
  @Enumerated(value = javax.persistence.EnumType.STRING)
  private InterviewStatus interviewStatus;
  private String contactName;
  private String contactPhone;

  @Email(message = "이메일 형식이 아닙니다.")
  private String contactEmail;
  private LocalDateTime regDate;
  private LocalDateTime modifiedDate;
  private String thumbnailLink;
  @Enumerated(value = javax.persistence.EnumType.STRING)
  private Region region;


  //Method for Resetting all the fields of Interview from InterviewInput
  public void setInterviewFrom(InterviewInput interviewInput) {
    this.recruitNum = interviewInput.getRecruitNum();
    this.title = interviewInput.getTitle();
    this.dueDate = interviewInput.getDueDate();
    this.interviewDate = interviewInput.getInterviewDate();
    this.description = interviewInput.getDescription();
    this.interviewType = interviewInput.getInterviewType();
    this.moneyUnit = interviewInput.getMoneyUnit();
    this.interviewStatus = interviewInput.getInterviewStatus();
    this.contactName = interviewInput.getContactName();
    this.contactPhone = interviewInput.getContactPhone();
    this.contactEmail = interviewInput.getContactEmail();
    this.regDate = interviewInput.getRegDate();
    this.modifiedDate = interviewInput.getModifiedDate();
    this.thumbnailLink = interviewInput.getThumbnailLink();
    this.region = interviewInput.getRegion();
  }

}
