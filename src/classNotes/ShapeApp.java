package classNotes;
import java.util.ArrayList;
public class ShapeApp {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		//shapes.add(new Rectangle (10,10,5,6));
		shapes.add(new Circle (15,15,15));
		//shapes.add(new Rectangle (20,16,5,8));
		ShapeWriter.writeShapesToScreen(shapes);
	}
}
