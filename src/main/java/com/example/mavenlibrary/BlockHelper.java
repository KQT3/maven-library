package com.example.mavenlibrary;

public interface BlockHelper {

     static Block createBlock() {
        String[] genesisTransactions = {"sent BTC", "send ETH"};
        return new Block(0, genesisTransactions);
    }

}
