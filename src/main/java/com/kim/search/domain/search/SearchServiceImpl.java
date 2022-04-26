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

    private final SearchReader searchReader;
    private final TrendSearchProcessor trendSearchProcessor;

    @Override
    public List<SearchInfo.Main> getSearchResult(SearchCommand.SearchRequest searchRequest) {
        //1. DB에 기존 검색 결과 조회
        //2. DB에 존재시 결과 리턴
        //3. 외부 API 호출 리턴

        List<TrendSearchDto> trendSearchDtoList = trendSearchProcessor.getTrendSearch(searchRequest);

        return trendSearchDtoList.stream()
                .map(x -> new SearchInfo.Main(x))
                .collect(Collectors.toList());
    }
}
