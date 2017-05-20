package com.search.datastore;

import com.search.dtos.UserRequest;
import com.search.dtos.UserResponse;
import lombok.extern.log4j.Log4j;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

/**
 * Created by jitendra.k on 20/05/17.
 */
@Log4j
public class ESUserRepository implements IUserRepository<UserRequest> {

    private TransportClient client;
    @Override
    public UserResponse createUser(UserRequest request) {
        return null;
    }

    @Override
    public UserResponse getUser(String id) {
        return null;
    }

    @Override
    public void initialize() {
        Client client = null;
        TransportClient transportClient = null;
        try {
            transportClient = new PreBuiltTransportClient(Settings.EMPTY);
            client = transportClient.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // on shutdown
        //client.close();
    }

}
