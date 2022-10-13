package com.codesates.section2week4.member;

public class Member {
  private long memberId;
  private String email;
  private String name;
  private String phone;

  public Member(long memberId, String email, String name, String phone) {
    this.memberId = memberId;
    this.email = email;
    this.name = name;
    this.phone = phone;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public long getMemberId() {
    return memberId;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }
}
