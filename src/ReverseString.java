public class ReverseString
{
   public static void main(String[] args)
   {
       String str = "suketa";
       //it should start with length -1 and decrements
       for(int i=str.length()-1;i>=0;i--)
       {
            System.out.print(str.charAt(i));
       }
   }

}

