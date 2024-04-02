package com.damianzygma.bankappbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name="contact_messages")
public class Contact {

    @Id
    @Column(name="contact_id")
    private String contactId;

    @Column(name="contact_name")
    private String contactName;

    @Column(name="contact_email")
    private String contactEmail;

    private String subject;

    @Column(name="create_dt")
    private Date createDt;

}
