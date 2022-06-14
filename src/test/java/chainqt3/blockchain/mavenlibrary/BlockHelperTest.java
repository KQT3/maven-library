package chainqt3.blockchain.mavenlibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BlockHelperTest {

    @Test
    void create_block() {
        String[] genesisTransactions = {"BTC", "ETH"};
        Block block = BlockHelper.createBlock(0, genesisTransactions);
        assertNotNull(block);
    }
}