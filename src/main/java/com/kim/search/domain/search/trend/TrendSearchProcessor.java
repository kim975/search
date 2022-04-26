package com.kim.search.domain.search.trend;

import com.kim.search.domain.search.SearchCommand;

import java.util.List;

public interface TrendSearchProcessor {

    List<TrendSearchDto> getTrendSearch(SearchCommand.SearchRequest searchRequest);

}
