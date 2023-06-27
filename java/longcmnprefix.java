class longcmnprefix
{
    public static void main(String[] args) {
        int pp=0,c=0;
        String s[]={"flower","flow","flight"};
        int min=s[0].length(),k=0;
        for(int i=1;i<s.length;i++)
        {
            if(s[i].length()<min)
          
            {

                min=s[i].length();
                k=i;

            }
        }

    String ans="";
    char temp;
    boolean flag;
        for(int i=0;i<s[k].length();i++)
        {
            flag = true ;
            for(int j=0;j<s.length;j++){
            if(!(s[j].substring(0,i+1).equals(s[k].substring(0,i+1))))
            {
                flag = false;
            }
            
             }
            if(flag)
                ans+=s[k].charAt(i);
        }
        System.out.println(ans);
}
}