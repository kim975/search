package com.kim.search.infrastructure.search.trend;

import com.kim.search.common.exception.InvalidParamException;
import com.kim.search.domain.search.SearchCommand;
import com.kim.search.domain.search.trend.TrendSearchDto;
import com.kim.search.domain.search.trend.TrendSearchProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TrendSearcherImpl implements TrendSearchProcessor {

    private final List<TrendSearchApiCaller> trendSearchApiCallerList;

    @Override
    public List<TrendSearchDto> getTrendSearch(SearchCommand.SearchRequest searchRequest) {
        TrendSearchApiCaller trendSearchApiCaller = routingApiCaller(searchRequest);
        return trendSearchApiCaller.getTrendSearch(searchRequest.getKeyword());
    }

    private TrendSearchApiCaller routingApiCaller(SearchCommand.SearchRequest searchRequest) {
        return trendSearchApiCallerList.stream()
                .filter(trendSearchApiCaller -> trendSearchApiCaller.support(searchRequest.getTrendSearchMethod()))
                .findFirst()
                .orElseThrow(InvalidParamException::new);
    }
}
