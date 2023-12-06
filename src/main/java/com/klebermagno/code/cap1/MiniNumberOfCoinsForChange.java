package com.klebermagno.code.cap1;

import java.util.*;
import com.klebermagno.code.test.*;

public class MiniNumberOfCoinsForChange {
    public static void main(String[] args) {

        System.out.println(CoinDeterminer.coinDeterminer(16)); // Expected output: 2
        System.out.println(CoinDeterminer.coinDeterminer(25)); // Expected output: 3

        Test.assertEquals(3, CoinDeterminer.coinDeterminer(25));
        Test.assertEquals(2, CoinDeterminer.coinDeterminer(16));
    }
}
/*Not minimum */
class CoinDeterminer {

    private static final int[] coins = {11, 9, 7, 5, 1}; // Coins in descending order

    public static void main(String[] args) {
        System.out.println(coinDeterminer(16)); // Expected output: 2
        System.out.println(coinDeterminer(25)); // Expected output: 3
    }

    public static int coinDeterminer(int num) {
        int minCoins = 0;

        for (int i = 0; i < coins.length; i++) {
            while (num >= coins[i]) {
                num -= coins[i];
                minCoins++;
            }
            if (num == 0) {
                break;
            }
        }
        
        return minCoins;
    }
}