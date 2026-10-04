package com.ninja.api;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entries")
public class EntryController {

    public record CreateEntryRequest(String content, String mood) {
    }

    private final EntryService service;

    public EntryController(EntryService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entry create(@RequestBody CreateEntryRequest request) {
        return service.create(request.content(), request.mood());
    }

    @GetMapping
    public List<Entry> list() {
        return service.findAll();
    }
}
