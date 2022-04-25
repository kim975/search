package com.kim.search.infrastructure.search.trend;

import com.kim.search.domain.search.trend.TrendSearchDto;
import com.kim.search.domain.search.trend.TrendSearcher;

public class TrendSearcherImpl implements TrendSearcher {

    @Override
    public TrendSearchDto getTrendSearch() {
        TrendSearchApiCaller trendSearchApiCaller = new NaverTrendSearchApiCaller();
        trendSearchApiCaller.getTrendSearch();
        return null;
    }
}
