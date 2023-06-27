public class sum {
    public static void main(String[] args) {
        int[] n=new int[]{1,23,4,4};
        int k=5;
        int i,j;
        for(i=0;i<n.length;i++)
        {
            for(j=i+1;j<n.length ; j++)
            {
                if(n[i]+n[j] == k)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }    
}
