public abstract class Activity
{
    public void finish()
    {
        System.out.print("Exiting app");
        System.exit(0);
    }
    public abstract void onCreate();
}
