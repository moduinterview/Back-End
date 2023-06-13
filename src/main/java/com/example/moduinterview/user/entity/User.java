package com.example.moduinterview.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
//TODO: User Entity 설계
public class User {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
  private long id;

  private String email;
  private String password;
  private String userName;
  private String phone;
  private String address;
  private String addressDetail;
  private String zipCode;

  private String role;
  private String status;

}
