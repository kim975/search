package com.kim.search.interfaces.search;

import com.kim.search.application.search.SearchFacade;
import com.kim.search.domain.search.SearchCommand;
import com.kim.search.domain.search.trend.TrendSearchMethod;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SearchController {

    private final SearchFacade searchFacade;

    @GetMapping("search")
    public void test(String user) {
        String userid = "userid";
        SearchCommand.SearchRequest searchRequest = SearchCommand.SearchRequest.builder()
                .keyword("가나다")
                .trendSearchMethod(TrendSearchMethod.naver)
                .build();

        searchFacade.getSearchResult(userid, searchRequest);
    }
}
