import java.util.*;
class longestsubstringwithoutrep {
    public static void main(String[] args)
    {
        String s="pwwkew";
        char[] a=s.toCharArray();
        String k="";
        String str="";
        int ll = 0,max = 0,i,j;
        for( i=0;i<a.length;i++)
        {
            for( j=i;j<a.length;j++)
            {
                str+=a[j];
                if(a[j]==a[j+1])
                {
                    if(ll>max)
                    {
                        k=String.valueOf(str);
                    }
                    ll=0;
                    str="";
                    break;
                }
                ll+=1;
                
            }
        }
        System.out.println(k);
    }
}
