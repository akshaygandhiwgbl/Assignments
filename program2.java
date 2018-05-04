 import java.util.Scanner;
class program2
{
 public static void main(String[] args)
   {
       Scanner s= new Scanner(System.in);
       int size,r=0;
       int count=0;
       System.out.println("enetr random no");
       r=s.nextInt();

       System.out.println("enter size of array");
       size=s.nextInt();
            int a[]=new int[size];
       System.out.println("enter array elements");
       for(int i=0;i<size;i++)
        {
          a[i]=s.nextInt();

        }

      int v=size/r;

        for(int j=0;j<size;j++)
          {
            count=1;
            for(int k=j+1;k<size;k++)
            {
              if(a[j]==a[k]&&a[j]!=0)
              {
                a[k]=0;
                count++;
                //System.out.println(a[j]);
              }
            }
            if(count>=v)
            {
              System.out.println(a[j]+"   "+count);
            }

          }

  }
}