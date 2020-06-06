package com.akshat.learningspring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Getter
@Setter
@Entity
@Table(name = "ROOM")
public class Room {
  @Id
  @Column(name = "ROOM_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long roomId;

  @Column(name = "NAME")
  private String roomName;

  @NonNull
  @Column(name = "ROOM_NUMBER")
  private String roomNumber;

  @NonNull
  @Column(name = "BED_INFO")
  private String bedInfo;
}

