package com.kim.search.infrastructure.search.trend;

import com.kim.search.domain.search.trend.TrendSearchDto;
import com.kim.search.domain.search.trend.TrendSearchMethod;

import java.util.List;

public interface TrendSearchApiCaller {

    List<TrendSearchDto> getTrendSearch(String keyword);

    boolean support(TrendSearchMethod trendSearchMethod);
}
