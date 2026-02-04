// ContactRepository.java
package com.Portfolio.platform.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
    public String save() {
        return "Contact saved";
    }
}
