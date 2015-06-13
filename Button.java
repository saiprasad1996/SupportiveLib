public class Button
{
    private boolean STATE;
    private String name;
    public void printButtons()
    {
        for(int i=1;i<26;i++)
        {
            System.out.println("b["+i+"] = (Button)findViewById(R.id.b"+i+");");
     
        }
    }
    public void setEnabled(boolean state)
    {
        STATE=state;
    }
    public boolean isEnabled()
    {
        return STATE;
    }
    Button(String buttonName)
    {
        name=buttonName;
    }
    public String showName()
    {
        return name;
    }
}
