package com.kim.search.domain.user;

public interface UserService {

    boolean checkPaidUpMember(String userid);

    boolean checkRestSearchCount(String userid);
}
