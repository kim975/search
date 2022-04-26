package com.kim.search.domain.search;

import com.kim.search.domain.search.trend.TrendSearchDto;
import lombok.*;


public class SearchInfo {

    @Getter
    @Builder
    @ToString
    public static class Main {
        private String keyword;
        private String period;
        private Double ratio;

        public Main(TrendSearchDto trendSearchDto) {
            this.keyword = trendSearchDto.getKeyword();
            this.period = trendSearchDto.getPeriod();
            this.ratio = trendSearchDto.getRatio();
        }
    }

}
