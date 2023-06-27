class maxe {
   int findmax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max < arr[i]){
            max=arr[i];}
        }
        return max;
    }
    boolean in(int k,int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(k==a[i])
            {
                return true;
            }
        }
        return false;
    }
}
class max{
public static void main(String[] args)
{
    int[] arr = new int[]{1,2,3,4,7};
    int max = (new maxe()).findmax(arr);
    for(int i=1;i<=max;i++)
    {
        if(!(new maxe()).in(i,arr))
        {
            System.out.println(i+"");
        }
    }
}
}

