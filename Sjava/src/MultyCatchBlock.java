
class MultyCatchBlock
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(100/0);

            int[] a={10,20,30,40,50};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException  |ArithmeticException  e)
        {
            System.out.println(e);

        }
    }
}