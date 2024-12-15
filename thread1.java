//implementing runnable interfaces
class Main
{
    public static void main(String args[])
    {
        System.out.println("Thread started....");
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Thread resumed");
    }
}
