import java.util.Scanner;

public class FigureTriangle extends FigurePolygon{


    private static final Scanner SCANNER = new Scanner(System.in);

    FigureTriangle()
    {
        this.arr = new int[3];
        this.numberOfEdges = 3;
    }

    public void enterTriangle()
    {
            do{
                for(int i = 0; i < 3; i++)
                {
                    System.out.printf("Nhap canh thu " + (i+1) + " la: ");
                    this.arr[i] = SCANNER.nextInt();//Integer.parseInt(SCANNER.nextLine());
                }
            }while(((this.arr[0] + this.arr[1]) <= this.arr[2]) || (this.arr[0] + this.arr[2]) <= this.arr[1] || (this.arr[2] + this.arr[1]) <= this.arr[0]);
        System.out.println("\n============================================\n");

    }

    public int perimeter()
    {
        int perimeter = 0;
        for(int i = 0; i < 3; i++)
        {
            perimeter += this.arr[i];
        }
        return perimeter;
    }

    public double area()
    {
        double dt = 0;
        int A = arr[0];
        int B = arr[1];
        int C = arr[2];
        double P = (A + B + C) / 2;
        dt = Math.sqrt(P * (P - A) * (P - B) * (P - C));
        return dt;
    }

    public void printTriangle()
    {
        super.print();
    }
}
