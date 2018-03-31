package tk.jcseahawks.ocja.day_nine.chaptertwo;
// Fri Mar 30 21:59:23 EDT 2018
class GameShape {
	public void displayShape() {
		System.out.println("displaying shape");
	}
	// more code
}
class PlayerPiece extends GameShape implements Animatable {
	public void movePiece() {
		System.out.println("moving some piece");
	}
	public void animate() {
		System.out.println("animating..");
	}
	// more code
}
class TilePiece extends GameShape {
	public void getAdjacent() {
		System.out.println("getting adjacent tiles");
	}
}
public class TestShapes {
	public static void main(String[] args) {
		// PlayerPiece shape = new PlayerPiece();
		// shape.displayShape();
		// shape.movePiece();
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();
		doShapes(player);
		doShapes(tile);
	}
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}
