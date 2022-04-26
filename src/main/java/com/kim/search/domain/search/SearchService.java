package com.kim.search.domain.search;

import java.util.List;

public interface SearchService {

    List<SearchInfo.Main> getSearchResult(SearchCommand.SearchRequest searchRequest);

}
