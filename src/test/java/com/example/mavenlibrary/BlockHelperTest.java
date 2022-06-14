package com.example.mavenlibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BlockHelperTest {

    @Test
    void create_block() {
        Block block = BlockHelper.createBlock();
        assertNotNull(block);
    }
}