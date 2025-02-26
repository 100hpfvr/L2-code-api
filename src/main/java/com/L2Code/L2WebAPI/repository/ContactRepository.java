package com.L2Code.L2WebAPI.repository;


import com.L2Code.L2WebAPI.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    Optional<Contact> findByCelular(String celular);
}