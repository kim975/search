package com.kim.search.domain.search;

import com.kim.search.domain.search.trend.TrendSearchDto;
import com.kim.search.domain.search.trend.TrendSearchProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService{

    private final TrendSearchProcessor trendSearchProcessor;

    @Override
    public List<SearchInfo.Main> getSearchResult(SearchCommand.SearchRequest searchRequest ) {
        List<TrendSearchDto> trendSearchDtoList = trendSearchProcessor.getTrendSearch(searchRequest);

        return trendSearchDtoList.stream()
                .map(x -> new SearchInfo.Main(x))
                .collect(Collectors.toList());
    }
}
