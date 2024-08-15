import java.util.Scanner;

public class Pattern {


  public static void RTtriangle(int a)
    {
        for (int i=0;i<=a;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print( j+" ");
            }
            System.out.print("\n");
        }
    }
//
//    public static void VRTtriangle(int a)
//    {
//        for (int i=a;i>=0;i--)
//        {
//            for (int j=0;j<=i;j++)
//            {
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//        }
//    }
     //************************* Hallow rectangle  **********************
    public static void hallow_Rectangle(int a)
    {
        for (int i=0;i<=a;i++)
        {
            for (int j=0;j<=a;j++)
            {
                if(j==0 || j==a ||i==0||i==a)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }

            }
            System.out.print("\n");
        }

    }

    //************************************     *******************************************
//                              *
//                           *  *
//                        *  *  *
//                     *  *  *  *
    public static  void inverted_triangle(int a)
    {
        int sum;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                sum=i+j;
                 if(sum>=a)
                 {
                     System.out.print(" * ");
                 }
                 else
                 {
                     System.out.print("   ");
                 }
            }
            System.out.println();
        }

    }
//*************************** Inverted half prymid  ***********************************
//    12345
//    1234
//    123
//    12
//    1

    public static void innverted_no_pyramid(int a)
    {
        int count=1;
        for(int i=a;i>0;i--)
        {
            //count=1;
            for(int j=i;j>0;j--)
            {

                System.out.print(" "+count+" ");
                count++;


            }

            System.out.println();
        }
    }
    //**************************    ****************************************
//  0  1
//  1  01
//  2  101
//  3  01010
//  4  101010
      public static void RTtriangle_01(int a)
    {
        int count;
        for (int i=0;i<=a;i++)
        {

            System.out.print(i+".");
            for (int j=0;j<i;j++)
            {
                int sum=i+j;
               if(sum%2==0)
               {

                   System.out.print(" 1 ");
               }
             else
               {
                   System.out.print(" 0 ");
               }
            }
            System.out.println();
        }
    }

    public static void hello()
    {
      
            System.out.println("hello");
        }
    

    public static  void main(String args[])
    {
        System.out.print("Enter no :");
        Scanner sc= new Scanner(System.in);
        int range= sc.nextInt();


        RTtriangle(range);
       // RTtriangle_01(range);
       // VRTtriangle(range);
      //  hallow_Rectangle(range);
       // inverted_triangle(range);
      //  innverted_no_pyramid(range);
    }





}
