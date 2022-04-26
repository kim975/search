package com.kim.search.infrastructure.search.trend;

import com.kim.search.domain.search.trend.TrendSearchDto;
import com.kim.search.domain.search.trend.TrendSearchMethod;

import java.util.List;

public class GoogleTrendSearchApiCaller implements TrendSearchApiCaller{

    @Override
    public List<TrendSearchDto> getTrendSearch(String keyword) {
        return null;
    }

    @Override
    public boolean support(TrendSearchMethod trendSearchMethod) {
        return TrendSearchMethod.google == trendSearchMethod;
    }

}
