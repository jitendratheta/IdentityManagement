package com.search;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.search.datastore.DataStore;
import com.search.datastore.ESUserRepository;
import com.search.datastore.IUserRepository;
import com.search.dtos.UserRequest;

/**
 * Created by jitendra.k on 14/02/17.
 */
public class AppModule implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(new TypeLiteral<IUserRepository<UserRequest>>() {}).to(ESUserRepository.class);
        binder.bind(DataStore.class);
    }
}
