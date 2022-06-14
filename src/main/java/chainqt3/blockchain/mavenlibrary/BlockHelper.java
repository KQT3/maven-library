package chainqt3.blockchain.mavenlibrary;

public class BlockHelper {

     public static Block createBlock() {
        String[] genesisTransactions = {"sent BTC", "send ETH"};
         return new Block(0, genesisTransactions);
     }

     public static String test() {
         return "test";
     }

}
