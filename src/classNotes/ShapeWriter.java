package classNotes;
import java.util.ArrayList;
import java.io.FileWriter; //writes to disk
import java.io.BufferedWriter; //for performance, write to memory then to disk
import java.io.PrintWriter; // conveniance
import java.io.File; 

public class ShapeWriter {
	/**
	 * Function writes shapes to a file
	 * @param fName name of the file
	 * @param shapes list of shape objects to write to the file
	 * @return true if successful, false if not
	 */
	public static boolean writeShapesToFile(String fName, ArrayList<Shape> shapes) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fName))));
			for(Shape shape : shapes) {
				pw.println(shape);
			}
			pw.close();
			return true;
		} catch (Exception ex){
			return false;
		}
	}
	public static void writeShapesToScreen(ArrayList<Shape> shapes) {
		for(Shape shape : shapes) {
			System.out.println(shape);
		}
	}
}
