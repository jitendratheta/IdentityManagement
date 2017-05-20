package com.search.dtos;

import com.search.entity.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by jitendra.k on 20/05/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    List<String> schema;
    String externalId;
    String userName;
    Name name;
}
