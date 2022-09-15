package com.dayone.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @GetMapping("/autocomplete") // 회사 검색 자동 완성
    public ResponseEntity<?> autocomplete(@RequestParam String keyword) {
        return null;
    }

    @GetMapping // 회사 리스트 조회
    public ResponseEntity<?> searchCompany() {
        return null;
    }

    @PostMapping // 배당금 데이터 저장
    public ResponseEntity<?> adCompany() {
        return null;
    }

    @DeleteMapping // 회사 삭제
    public ResponseEntity<?> deleteCompany() {
        return null;
    }
}
