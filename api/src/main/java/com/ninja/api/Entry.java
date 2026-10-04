package com.ninja.api;

import java.time.Instant;

public record Entry(Long id, String content, String mood, Instant createdAt) {
}
