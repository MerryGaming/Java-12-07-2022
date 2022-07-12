import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolygonManagement {
    private  List<FigurePolygon> figurePolygons;
    private static final String ANSWER_ENTER_QUESTION_IS_NO = "no";

    private static final Scanner SCANNER = new Scanner(System.in);

    private static PolygonManagement polygonManagementInstent = new PolygonManagement();

    private PolygonManagement()
    {
        this.figurePolygons = new ArrayList<>();
    }

    public static PolygonManagement getPolygonManagementInstance()
    {
        return polygonManagementInstent;
    }

    public void enterPolygon()
    {
        boolean checkEnterContinue = true;
        do{
            var polygon = new FigurePolygon();
            polygon.enter();
            polygon.perimeter();
            polygon.print();
            figurePolygons.add(polygon);

            System.out.print("Ban muon nhap tiep khong? (Nhap 'no' de ket thuc!!!)");
            String answer = SCANNER.nextLine();
            if(answer.equalsIgnoreCase(ANSWER_ENTER_QUESTION_IS_NO)) {
                checkEnterContinue = false;
            } else {
                System.out.println("------------------------------");
            }
        }while(checkEnterContinue);

    }

    public void printPolygon()
    {
        System.out.println(figurePolygons);
    }


}
