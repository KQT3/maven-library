package chainqt3.blockchain.mavenlibrary;

import java.util.Date;

public class BlockHelper {

    public static Block createBlock(String data, String prevHash, Date date) {
        return new Block(data, prevHash, date.getTime());
    }
}
