package chainqt3.blockchain.mavenlibrary;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BlockHelperTest {

    public static List<Block> blockchain = new ArrayList<>();
    public static int prefix = 4;
    public static String prefixString = new String(new char[prefix]).replace('\0', '0');

    @BeforeEach
    void setUp() {
        Block genesisBlock = new Block("The is the Genesis Block.", "0", new Date().getTime());
        genesisBlock.mineBlock(prefix);
        blockchain.add(genesisBlock);
        Block firstBlock = new Block("The is the First Block.", genesisBlock.getHash(), new Date().getTime());
        firstBlock.mineBlock(prefix);
        blockchain.add(firstBlock);
    }

    @AfterEach
    void tearDown() {
        blockchain.clear();
    }

    @Test
    public void givenBlockchain_whenNewBlockAdded_thenSuccess() {
        Block newBlock = new Block("The is a New Block.", blockchain.get(blockchain.size() - 1).getHash(), new Date().getTime());
        newBlock.mineBlock(prefix);
        assertEquals(newBlock.getHash().substring(0, prefix), prefixString);
        blockchain.add(newBlock);
        blockchain.forEach(block -> System.out.println(block.getHash()));
    }

    @Test
    public void givenBlockchain_whenValidated_thenSuccess() {
        boolean flag = true;
        for (int i = 0; i < blockchain.size(); i++) {
            String previousHash = i == 0 ? "0" : blockchain.get(i - 1).getHash();
            flag = blockchain.get(i).getHash().equals(blockchain.get(i).calculateBlockHash())
                    && previousHash.equals(blockchain.get(i).getPreviousHash())
                    && blockchain.get(i).getHash().substring(0, prefix).equals(prefixString);
            if (!flag) break;
        }
        assertTrue(flag);
    }

    @Test
    void create_block() {
        Block genesisBlock = BlockHelper.createBlock("The is the Genesis Block.", "0", new Date());
        genesisBlock.mineBlock(prefix);
        blockchain.add(genesisBlock);
        Block block1 = BlockHelper.createBlock("The is the First Block.", genesisBlock.getHash(), new Date());
        block1.mineBlock(prefix);
        blockchain.add(block1);
        assertEquals(4, blockchain.size());
    }
}