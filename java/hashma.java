import java.util.*;
class hashma
{
    public static void main(String[] args)
    {
        Hashtable<String , Integer> d = new Hashtable<>();

        String k ="dsg hdf ghs d f gh s dts dsg kkr rmp kkd xx xx xxx rrr ramp trt";

        String[] kk = k.split(" ");

        for(int i = 0; i < kk.length;i++ )
        {

            String s = kk[i];

            if(d.containsKey(s))
            {
                d.put(s,d.get(s)+1);
            }
            else{
                d.put(s,1);
            }

        }
        for(String key:d.keySet())
        {
            System.out.println(key+" "+d.get(key));
        }


    }
}