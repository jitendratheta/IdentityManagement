package com.search.datastore;

import com.google.inject.Inject;
import com.search.dtos.UserRequest;
import com.search.dtos.UserResponse;
import lombok.extern.slf4j.Slf4j;


/**
 * Created by jitendra.k on 14/02/17.
 */
@Slf4j
public class DataStore {

    IUserRepository<UserRequest> userRepository;

    /**
     * Instantiates a new Data store.
     *
     * @param userRepository the review repository
     */
    @Inject
    public DataStore(IUserRepository<UserRequest> userRepository) {
        this.userRepository = userRepository;
    }

    public void initialize() {
        userRepository.initialize();
        Long memorySize = Runtime.getRuntime().totalMemory()/(1024*1024);
        log.info("Total runtime memory: " +  memorySize  + " MB");
    }

    public UserResponse createUser(UserRequest request) throws Exception {
        return userRepository.createUser(request);
    }

    public UserResponse getUser(String userId) throws Exception {
        return userRepository.getUser(userId);
    }
}
