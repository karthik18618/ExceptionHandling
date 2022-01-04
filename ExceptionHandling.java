class Except
    {
        void display()
        {
            try
            {
                int[] b;
                b = new int[5];
                b[6]=6;
}            catch(Exception e)
             {
                 System.out.println(e);
                 System.out.println("Exception handled");
            }


        }
    }
    public class ExceptionHandling
    {
    public static void main(String args[])
    {
        Except e=new Except();
        e.display();
    }
}
