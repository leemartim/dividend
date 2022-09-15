package com.dayone.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
public class FinanceController {
    @GetMapping("/dividend/{companyName}") // 회사 배당금 검색 api
    public ResponseEntity<?> searchFinance(@PathVariable String companyName) {
        return null;
    }
}
