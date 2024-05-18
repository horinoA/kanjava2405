package com.demo.kanjava2405.kanjava2405.model;

import java.time.LocalDateTime;

public record personaldictInput (
    Long id,
    String lastname,
    String firstname, 
    String lastnamekana,
    String firstnamekana,
    String email,
    String contactphone,
    String postalcode,
    String prefectures,
    String address,
    LocalDateTime birthdate
    ){}
