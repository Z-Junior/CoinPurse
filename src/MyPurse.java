public class MyPurse
{
    public static void main(String[] args)
    {
        CoinPurse mine = new CoinPurse();

        Coin c1 = new Coin(1);
        Coin c5 = new Coin(5);
        Coin c6 = new Coin(10);
        Coin c7 = new Coin(25);
        Coin c8 = new Coin(25);

        mine.addCoin(c1);
        mine.addCoin(c5);
        mine.addCoin(c6);
        mine.addCoin(c7);
        mine.addCoin(c8);

        System.out.println(mine.count());
        System.out.println("$" + mine.total());
        System.out.println(mine);
      
    }
}
        