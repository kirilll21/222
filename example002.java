package example002;

public class example002 {
    static boolean isTriangular(int num)
    {
        if (num < 0)
        return false;
        int sum = 0;
        for (int n = 1; sum <= num; n++)
        {

            sum = sum + n;

            if (sum == num)

                return true;

        }
        return false;

    }
    public static void main (String[] args)
    {
        int n = 66;

        if (isTriangular(n))
            System.out.print("Число является треугольным");
        else
            System.out.print("Число не является треугольным");

    }

}



    

