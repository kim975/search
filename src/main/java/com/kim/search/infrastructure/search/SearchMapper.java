package com.kim.search.infrastructure.search;

import com.kim.search.domain.search.SearchReader;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchMapper extends SearchReader {
}
