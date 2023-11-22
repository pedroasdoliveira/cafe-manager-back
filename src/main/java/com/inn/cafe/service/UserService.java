package com.inn.cafe.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {

    ResponseEntity<String> singup(Map<String, String> requestMap);
}
