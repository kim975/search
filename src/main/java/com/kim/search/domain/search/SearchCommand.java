package com.kim.search.domain.search;

import com.kim.search.domain.search.trend.TrendSearchMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class SearchCommand {

    @Getter
    @Builder
    @ToString
    public static class SearchRequest {
        public String keyword;
        public TrendSearchMethod trendSearchMethod;
    }

}
