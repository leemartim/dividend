package com.dayone.persist;

import com.dayone.persist.entity.CompanyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    boolean existsByTicker(String ticker);

    Optional<CompanyEntity> findByName(String name); // 회사명을 인자로 받음
    //optional 사용하는 이유는 null값에 대한 처리와 값이 없는 경우에 대한 처리가 편안

    Page<CompanyEntity> findByNameStartingWithIgnoreCase(String s, Pageable pageable); // Like 연산자 사용 준비 완료
}
