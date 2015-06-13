class Test
{
    public static void main(String args[])
    {
        BingoLogic bingo=new BingoLogic();
        bingo.onCreate();
        for(int i=1;i<=21;i=i+5)
        (bingo.b[i]).setEnabled(true);
        
        bingo.b[11].setEnabled(false);
        
        for(int i=2;i<=22;i=i+5)
        (bingo.b[i]).setEnabled(true);
        
        bingo.checkForCol1();
        bingo.checkForCol2();
        bingo.checkForCol3();
        bingo.checkForCol4();
        bingo.checkForCol5();
        
    }
}
