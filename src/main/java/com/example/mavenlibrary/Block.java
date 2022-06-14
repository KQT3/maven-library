package com.example.mavenlibrary;

import lombok.Builder;
import lombok.Value;

import java.util.Arrays;

@Value
public class Block {
    int previousHash;
    String[] transactions;
    int blockHash;

    public Block(int previousHash, String[] transaction) {
        this.previousHash = previousHash;
        this.transactions = transaction;

        Object[] hashCodeBasedOnPreviousBlock = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(hashCodeBasedOnPreviousBlock);
    }
}