package com.kim.search.application.search;

import com.kim.search.domain.search.trend.TrendSearchDto;
import com.kim.search.infrastructure.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @Autowired
    TestMapper testMapper;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        TrendSearchDto aaa = testMapper.getAllDataList();
        System.out.println(aaa.getId());

        return testMapper.getAllDataList().toString();
    }
}
