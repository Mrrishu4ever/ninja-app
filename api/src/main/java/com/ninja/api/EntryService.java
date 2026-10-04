package com.ninja.api;

import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

@Service
public class EntryService {

    private final List<Entry> entries = new CopyOnWriteArrayList<>();
    private final AtomicLong nextId = new AtomicLong(1);

    public Entry create(String content, String mood) {
        Entry entry = new Entry(nextId.getAndIncrement(), content, mood, Instant.now());
        entries.add(entry);
        return entry;
    }

    public List<Entry> findAll() {
        return List.copyOf(entries);
    }
}
