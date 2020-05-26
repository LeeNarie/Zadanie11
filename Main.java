class Main {

public static boolean SimpleNum(int x){
    if (x<=1)
        return false;
    else if (x <=3)
        return true;
    else if (x%2==0 || x %3 ==0)
        return false;
    int n = 5;
    while (n*n <=x){
        if (x % n ==0 || x % (n+2) == 0)
            return false;
        n=n+6;
    }
    return true;
}


public static int rnd(int min, int max)
{
	max -= min;
	return (int) (Math.random() * ++max) + min;
}

  public static void main(String[] args) {
    int[][] sh = new int[8][8];
    boolean c = false;

    for (int i = 0; i<8; i++)
    {
      for (int j = 0; j<8; j++)
      {
        if (c)
        {sh[i][j] = 0; c=!c;}
        else { sh[i][j] = 1; c=!c;}
        System.out.print(sh[i][j] + " ");
      }
      System.out.println("");
      c=!c;
    }




    int[][] mas = new int[10][10];
    final int minr = -50; // Минимальное число для диапазона
  	final int maxr = 50; // Максимальное число для диапазона

    for (int i = 0; i<10; i++)
    {
      for (int j = 0; j<10; j++)
      {
        mas[i][j] = rnd(minr, maxr);
        System.out.print(mas[i][j] + " | ");
      }
      System.out.println("");
    }

    int sum = 0;
    for (int i = 0; i<10;i++)
    {
      for (int j = 0; j<10;j++)
      {
        sum +=mas[i][j];
      }
       System.out.println("sum" + i + " = " + sum);
       sum = 0;
    }
System.out.println("simple numbers: ");
    for (int i = 0; i<10;i++)
    {
      for (int j = 0; j<10;j++)
      {
        if (SimpleNum(mas[i][j])) System.out.print(mas[i][j] + ", ");
      }
    }

  }
}