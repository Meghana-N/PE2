public class IntegerFactorial {

    public String getFactorial(int num )
    {
        int fact;
        String s;
        String str;
        str="";
        s="";
        for( int i=1;i<=num ; i++ )
        {
            fact =1;
            for( int j=1 ; j<=i ;j++ )
            {
               fact= fact*j;
            }
            s=s+"The factorial of "+i+" is "+Integer.toString(fact)+ "\n";
        }
        for(int i=0;i<s.length()-1 ; i++ )
        {
            str=str+s.charAt(i);
        }
        return str;
    }
}
