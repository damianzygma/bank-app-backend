package com.damianzygma.bankappbackend.repository;

import com.damianzygma.bankappbackend.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {


}
