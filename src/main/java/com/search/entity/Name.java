package com.search.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jitendra.k on 20/05/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {

    String formatted;
    String familyName;
    String givenName;
    String middleName;
    String honorificPrefix;
    String honorificSuffix;

}
