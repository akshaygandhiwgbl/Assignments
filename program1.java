 import java.util.Scanner;
class program1
{

  public void prime(int sum,int element1,int element2)
  {
     int is_prime=0,flag=0,cal=0,no=sum;
       for(int p=2;p<=sum/2;p++)
       {
        if(no%p==0)
        {
          is_prime=1;
          break;
        }
       }
       if(is_prime!=1)
       {
            while(no>0)
           {
            cal=cal+no%10;
            no=no/10;
           }
           // System.out.println("cal"+cal );
           if(cal%2!=0)
           {
            System.out.println("addition of "+element1+ " "+element2+" odd and no inns prime"+sum );
           }
       }


  }




  public static void main(String[] args) {
    program1 pr =new program1();
    Scanner s= new Scanner(System.in);
    int i,j,r,c;
    System.out.println("enter row and column");
    r=s.nextInt();
    c=s.nextInt();
    int a[][] = new int[r][c];
    int sum=0;
    System.out.println("enter elemnts in array");
    for(int x=0;x<r;x++)
    {
      for(int y=0;y<c;y++)
      {
        a[x][y]=s.nextInt();
      }
    }
    for (i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
{
      sum=a[i][j]+a[j][i];
     // System.out.println("output is"+sum);
pr.prime(sum,a[i][j],a[j][i]);
//prime

    }
    }

  }
}
