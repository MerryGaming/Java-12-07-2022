import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FigurePolygon {
    protected int numberOfEdges;
    protected int arr[] = new int[20];


    private static final Scanner SCANNER = new Scanner(System.in);

    public FigurePolygon() {
    }

    public FigurePolygon(int numberOfEdges, int[] arr) {
        this.numberOfEdges = numberOfEdges;
        this.arr = arr;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public void setNumberOfEdges(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public void enter()

    {
        do{
            System.out.printf("Nhap so luong canh: ");
            this.numberOfEdges = SCANNER.nextInt(); //Integer.parseInt(SCANNER.nextLine());

        }while(this.numberOfEdges <= 2);


        for (int i = 0; i < this.numberOfEdges; i++)
        {
            System.out.printf("Nhap canh thu " + (i + 1) + ": ");
            this.arr[i] = SCANNER.nextInt();//Integer.parseInt(SCANNER.nextLine());
        }


    }


    @Override
    public String toString() {
        return "FigurePolygon{" +
                "numberOfEdges=" + numberOfEdges +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public int perimeter()
    {
        int perimeter = 0;
        for(int i = 0; i < this.numberOfEdges; i++)
        {
            perimeter += this.arr[i];
        }
        return perimeter;
    }

    public void print()
    {

        System.out.println("Độ dài các cạnh lần lượt là: ");
        for (int i = 0; i < this.numberOfEdges; i++) {
            if(i < (this.numberOfEdges-1)){
                System.out.print(this.arr[i] + "      ");
            }
            else{
                System.out.println(this.arr[i]);
            }
        }
        System.out.println("\n------------------------------------------------\n");
    }






}
