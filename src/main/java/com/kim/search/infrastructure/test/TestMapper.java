package com.kim.search.infrastructure.test;

import com.kim.search.domain.search.trend.TrendSearchDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TrendSearchDto getAllDataList();
}
