package com.rest.optional.stream.controller;

import com.rest.optional.stream.api.bin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GetPostsRestConnector {

    @Value("get.posts.uri")
    public String uri;
    @Autowired
    private RestTemplate restTemplate;

    public List<User> getAllUser() {
        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {});
        return responseEntity.getBody();
    }

}
