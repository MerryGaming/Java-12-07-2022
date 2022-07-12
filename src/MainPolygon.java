public class MainPolygon {
    public static void main(String[] args) {
        /*var polygonManagement= PolygonManagement.getPolygonManagementInstance();


        polygonManagement.enterPolygon();
        polygonManagement.printPolygon();*/
        /*var figurePolygon = new FigurePolygon();
        figurePolygon.enter();
        figurePolygon.print();
        System.out.println(figurePolygon.perimeter());*/


        TriangleManagement triangleManagement = TriangleManagement.getTriangleManagementInstent();
        triangleManagement.listTriangle();
        triangleManagement.printList();
        triangleManagement.printMax();
        triangleManagement.search();
        triangleManagement.delete();
        triangleManagement.sort();
    }


}
