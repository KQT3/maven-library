package chainqt3.blockchain.mavenlibrary;

public class BlockHelper {

     public static Block createBlock(int hashCode, String[] genesisTransactions) {
         return new Block(hashCode, genesisTransactions);
     }

}
