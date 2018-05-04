import java.util.Scanner;
class program3
{

  /*public int And(int a[][],int b[][],int r,int c)
  {
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<r;j++)
      {
        d[i][j]=a[i][j]&b[i][j];
      }
    }
        return d;
    }

  public int Or(int a[][],int and[][],int r,int c)
  {
        for(int i=0;i<r;i++)
            {
              for(int j=0;j<r;j++)
              {
                or[i][j]=a[i][j]|and[i][j];
              }
            }
     return or;
  }*/

  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    program3 p3=new program3();
    int r,c;

    System.out.println("Enter rows and Columns");

    r=s.nextInt();
    c=s.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];

    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        {
                   System.out.println("enter first array element");

              a[i][j]=s.nextInt();
              System.out.println("enetr second Array element");
              b[i][j]=s.nextInt();

        }
    }


    int and[][]=new int[r][c];
    int or[][]=new int[r][c];




  //And
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        and[i][j]=a[i][j]&b[i][j];
      }
    }



       System.out.println("and operation elemnts");
       for(int i=0;i<r;i++)
          {
            for(int j=0;j<c;j++)
            {
             System.out.println(and[i][j]);
            }
          }




    //OR
         for(int i=0;i<r;i++)
            {
              for(int j=0;j<c;j++)
              {
                or[i][j]=a[i][j]|and[i][j];
              }
            }

    int final_result[]=new int[100];
    int cnt=0;

    System.out.println("or operation elemnts");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          final_result[cnt]=or[i][j];
          System.out.println(final_result[cnt]);
          cnt++;
        }
      }


    int inc=0,decimal=0;
    for(int array1=0;array1<final_result.length-1;array1++)
    {
        decimal += final_result[array1]*Math.pow(2, inc);
        inc++;
    }



System.out.println("decimal is "+decimal);


}
}