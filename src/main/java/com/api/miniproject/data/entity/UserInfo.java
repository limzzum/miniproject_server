package com.api.miniproject.data.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "User_Info")
@Data
public class UserInfo {

    @Id @GeneratedValue
    int id;

    String name;

    String photoPath;

    int[] follower;

    int[] follow;

    int[] ticketId;



}
