package com.yilmazgokhan.internal.training.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "userId", nullable = false, unique = true)
    private String userId;

    @Column(name = "name")
    private String name;

    @Column(name = "surr")
    private String surr;

    @Column(name = "age")
    private int age;

}
