package classNotes;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class ShapeReader {
	public static ArrayList<Shape> readShapesFromFile(String fName) {
		try {
			ArrayList<Shape> result = new ArrayList<Shape>();
			Scanner fsc = new Scanner(new File(fName));
			String line;
			String[] parts;
			String shapeType;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				parts = line.split("\t");
				shapeType = parts[0];
				if (shapeType.equals("circle")) {
					circ = new Circle(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
					result.add(circ);
				} else if (shapeType.equals("rectangle")) {
					rect = new Rectangle(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), Double.parseDouble(parts[3]), Double.parseDouble(parts[4]));
					result.add(rect);
				}
				
			}
		}catch (Exception ex) {
			return null;
		}
	}
}
