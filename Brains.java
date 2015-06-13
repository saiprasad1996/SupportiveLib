package tk.saiprasadm.bingo;


import android.view.View;
import android.widget.Button;

public class Brains {
    Button b[];
    View appView;

    Brains(Button[] btns)
    {
        b=btns;

    }
    public void CheckAllCols()
    {
        checkForCol1();
        checkForCol2();
        checkForCol3();
        checkForCol4();
        checkForCol5();
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
