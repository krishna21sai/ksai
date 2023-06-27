import java.util.*;
class arraymul {

  public static void main(String[] rgs) {
    Scanner in=new Scanner(System.in);
    int[][] a=new int[][]{{1,0,0}, {0,1,0}, {0,0,1}};
    int[][] b=new int[][]{{1,2,3},{1,2,3},{3,5,6}};
    int[][] r=new int[a.length][b[0].length];
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<b.length;j++)
      {
        r[i][j]=0;
        for(int k=0;k<a[0].length;k++)
        {
          r[i][j]+=a[i][k]*b[k][j];
        }
      }
    }
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<b.length;j++)
      {
        System.out.print(r[i][j]+" ");
      }
      System.out.println();
    }
  }
}
