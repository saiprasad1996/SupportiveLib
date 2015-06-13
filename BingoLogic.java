public class BingoLogic extends Activity
{
    Button b[];
    @Override
    public void onCreate()
    {
        b=new Button[26];
        b[0]=null;
        b[1] = new Button("1");
        b[2] = new Button("2");
        b[3] = new Button("3");
        b[4] = new Button("4");
        b[5] = new Button("5");
        b[6] = new Button("6");
        b[7] = new Button("7");
        b[8] = new Button("8");
        b[9] = new Button("9");
        b[10] = new Button("10");
        b[11] = new Button("11");
        b[12] = new Button("12");
        b[13] = new Button("13");
        b[14] = new Button("14");
        b[15] = new Button("15");
        b[16] = new Button("16");
        b[17] = new Button("17");
        b[18] = new Button("18");
        b[19] = new Button("19");
        b[20] = new Button("20");
        b[21] = new Button("21");
        b[22] = new Button("22");
        b[23] = new Button("23");
        b[24] = new Button("24");
        b[25] = new Button("25");

        for(int i=1;i<26;i++)
        {
            System.out.print(b[i].showName()+"\t");
            if(i%5==0)
            {   
                System.out.print("\n\n");
            }
        }
        /*
        checkForRow();
        checkForColumn();
        checkForDiagonal();
        */
        
    }
    public void checkForCol1()
    {
        boolean flag=false;
        int enumerate[]={1,6,11,16,21};
        int i = 0;
        while(i<5)
        {
            if(b[enumerate[i]].isEnabled())
            {
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            i++;
        }
        if(flag)
        {
            System.out.println("First row is completed");
        }
        else{
            System.out.println("Row not completed");
        }
    }
    public void checkForCol2()
    {
        boolean flag=false;
        int enumerate[]={2,7,12,17,22};
        int i = 0;
        while(i<5)
        {
            if(b[enumerate[i]].isEnabled())
            {
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            i++;
        }
        if(flag)
        {
            System.out.println("Second row is completed");
        }
        else{
            System.out.println("Row not completed");
        }
        
    }
    public void checkForCol3()
    {
        boolean flag=false;
        int enumerate[]={3,8,13,18,23};
        int i = 0;
        while(i<5)
        {
            if(b[enumerate[i]].isEnabled())
            {
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            i++;
        }
        if(flag)
        {
            System.out.println("3rd Col is completed");
        }
        else{
            System.out.println("Row not completed");
        }
    }
    public void checkForCol4()
    {
        boolean flag=false;
        int enumerate[]={4,9,14,19,24};
        int i = 0;
        while(i<5)
        {
            if(b[enumerate[i]].isEnabled())
            {
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            i++;
        }
        if(flag)
        {
            System.out.println("4th Col is completed");
        }
        else{
            System.out.println("Row not completed");
        }
    }
    public void checkForCol5()
    {
        boolean flag=false;
        int enumerate[]={5,10,15,20,25};
        int i = 0;
        while(i<5)
        {
            if(b[enumerate[i]].isEnabled())
            {
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            i++;
        }
        if(flag)
        {
            System.out.println("5th Col is completed");
        }
        else{
            System.out.println("Row not completed");
        }
    }
}