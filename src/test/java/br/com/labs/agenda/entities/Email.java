package br.com.labs.agenda.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "emails")
public class Email {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    private String email;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
