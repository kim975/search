package com.kim.search.domain.search.trend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrendSearchDto {

    private String keyword;
    private String period;
    private Double ratio;


}
