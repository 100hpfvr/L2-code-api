package com.L2Code.L2WebAPI.controller;
import com.L2Code.L2WebAPI.model.Contact;
import com.L2Code.L2WebAPI.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<Contact> create(@RequestBody Contact contact) {
        return ResponseEntity.ok(contactService.save(contact));
    }

    @GetMapping
    public ResponseEntity<List<Contact>> list() {
        return ResponseEntity.ok(contactService.list());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> update(@PathVariable Long id, @RequestBody Contact contact) {
        return ResponseEntity.ok(contactService.update(id, contact));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> inactivate(@PathVariable Long id) {
        contactService.inactivate(id);
        return ResponseEntity.noContent().build();
    }
}
