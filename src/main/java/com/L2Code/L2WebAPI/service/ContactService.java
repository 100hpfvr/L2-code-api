package com.L2Code.L2WebAPI.service;
import com.L2Code.L2WebAPI.model.Contact;
import com.L2Code.L2WebAPI.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository, ContactRepository contactRepository1) {
        this.contactRepository = contactRepository1;
    }

    public Contact save(Contact contact) {
        Optional<Contact> existente = contactRepository.findByCelular(contact.getCelular());
        if (existente.isPresent()) {
            throw new RuntimeException("Número de celular já cadastrado!");
        }
        return contactRepository.saveAndFlush(contact);
    }

    public List<Contact> list() {
        return contactRepository.findAll();
    }

    public Contact update(Contact updatedContact) {
        Contact contact = contactRepository.findById(updatedContact.getId())
                .orElseThrow(() -> new RuntimeException("Contato não encontrado"));

        contact.setNome(updatedContact.getNome());
        contact.setEmail(updatedContact.getEmail());
        contact.setTelefone(updatedContact.getTelefone());
        contact.setFavorito(updatedContact.getFavorito());

        return contactRepository.saveAndFlush(contact);
    }

    public void inactivate(Long id) {
        Contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato não encontrado"));
        contact.setAtivo('N');
        contactRepository.save(contact);
    }

}
