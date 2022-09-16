package com.dayone.web;

import com.dayone.model.Company;
import com.dayone.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {
    private final CompanyService companyService;
    @GetMapping("/autocomplete") // 회사 검색 자동 완성
    public ResponseEntity<?> autocomplete(@RequestParam String keyword) {
        return null;
    }

    @GetMapping // 회사 리스트 조회
    public ResponseEntity<?> searchCompany() {
        return null;
    }

    @PostMapping // 배당금 데이터 저장
    public ResponseEntity<?> addCompany(@RequestBody Company request) {
        String ticker = request.getTicker().trim();
        if (ObjectUtils.isEmpty(ticker)) {
            throw new RuntimeException("ticker is empty");
        }

        Company company = this.companyService.save(ticker);

        return ResponseEntity.ok(company);
    }

    @DeleteMapping // 회사 삭제
    public ResponseEntity<?> deleteCompany() {
        return null;
    }
}
