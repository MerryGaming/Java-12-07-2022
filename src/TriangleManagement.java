import java.util.ArrayList;
import java.util.Scanner;

public class TriangleManagement {

    private int n;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static TriangleManagement triangleManagementInstent = new TriangleManagement();

    public static TriangleManagement getTriangleManagementInstent()
    {
        return triangleManagementInstent;
    }
    private FigureTriangle[] list = new FigureTriangle[50];


    public void listTriangle()
    {
        System.out.printf("Nhập số tam giác: ");
        n = SCANNER.nextInt(); //Integer.parseInt(SCANNER.nextLine());

        for (int i = 0; i < n; i++)
        {
            FigureTriangle figureTriangle = new FigureTriangle();
            figureTriangle.enterTriangle();
            list[i] = figureTriangle;
        }
    }

    public void printList()
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("Tam giác thứ : "+(i+1));
            list[i].printTriangle();
        }
    }

    public void printMax()
    {
        double max = list[0].area();
        int Max = 0;
        for (int i = 0; i < n; i++)
        {
            if (list[i].area() > max)
            {
                max = list[i].area();
                Max = i;
            }
        }
        System.out.println("Lon nhat: ");
        list[Max].printTriangle();
    }
    public void search()
    {
        System.out.println("Nhập vị trí của tam giác cần tìm kiếm: ");
        int t = SCANNER.nextInt();
        if(t > n)
        {
            System.out.println("Vị trí không tồn tại");
        }
        else
        {
            list[t-1].printTriangle();
        }
    }
    public void delete()
    {
        int k = 0;
        System.out.println("Nhập vào vị trí của tam giác cần xóa");
        int x = SCANNER.nextInt();
        if(x >= n)
        {
            System.out.println("Vị trí không tồn tại");
        }
        else
        {
            for (int i = 0; i < n; i++)
            {
                if(i != (x-1))
                {
                    list[k] = list[i];
                    k++;
                }
            }
        }
        n = k;
    }
    public void sort()
    {
        FigureTriangle temp = list[0];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(list[i].area() > list[j].area())
                {
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }



}
