package turtle;

public class SketchPad {
    private int[][] floor;
public SketchPad(int floorRow, int floorColumn){
    floor = new int[floorRow][floorColumn];
}

public int [][]getFloor(){
    return floor;
}
public void display(){
    for (var row : floor){
        for (var column : row) {
            if (column == 1) System.out.println("*");
            if (column == 0) System.out.println(" ");
        }
        System.out.println();
        }
    }
}

