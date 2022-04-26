package com.kim.search.domain.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Search {

    private Long id;
    private String keyword;
    private String period;
    private Double ratio;

}
