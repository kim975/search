package com.kim.search.application.search;

import com.kim.search.domain.search.SearchCommand;
import com.kim.search.domain.search.SearchInfo;
import com.kim.search.domain.search.SearchService;
import com.kim.search.domain.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchFacade {

    private final SearchService searchService;
    private final UserService userService;

    public List<SearchInfo.Main> getSearchResult(String userid, SearchCommand.SearchRequest searchRequest) {

        if (userService.checkPaidUpMember(userid)) {
            return searchService.getSearchResult(searchRequest);
        }

        if (userService.checkRestSearchCount(userid)) {
            return searchService.getSearchResult(searchRequest);
        }

        return null;
    }

}
