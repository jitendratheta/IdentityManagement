package com.search.datastore;

import com.search.dtos.UserRequest;
import com.search.dtos.UserResponse;

/**
 * Created by jitendra.k on 20/05/17.
 */
public interface IUserRepository<T> {

    UserResponse createUser(UserRequest request);
    UserResponse getUser(String id);
    void initialize();
}
