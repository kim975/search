package com.kim.search.domain.search;

import java.util.List;

public interface SearchReader {

    List<Search> findByKeyword(String keyword);

}
