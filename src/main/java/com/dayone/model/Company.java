package com.dayone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
CompanyEntity에서 구현되었지만 CompanyEntity는 DB와 연결되는 클래스이므로
service부분을 담당하는 클래스를 또 만들어 준것
CompanyEntity를 재사용해도되지만 가독성에 문제가 있을수있으므로 또 만들어주는것이 나음
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private String ticker;
    private String name;
}
