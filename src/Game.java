import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	private Vertex root;
	public Game () {
		this.root = new Vertex("¿Vuela?", null, null);
		Vertex a = new Vertex("Perro", null, null);
		Vertex b = new Vertex("Paloma", null, null);
		this.root.LEFT = a;
		this.root.RIGHT = b;
	}
	public void startGame() throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¿Piense en un animal?");
		Vertex v = this.root;
		boolean game = true;
		while (game) {
			while (v != null) {
				System.out.println(" " + v.label + " ");
				String r = read.readLine();
				if (r.equals("s")) {
					if (v.LEFT == null && v.RIGHT == null) {
						System.out.println("¡GANE!");
						game = false;
						v = null;
					} else {
						v = v.RIGHT;
					}
				} else if (r.equals("n")) {
					if (v.LEFT == null && v.RIGHT == null) {
						break;
					}else {
						v = v.LEFT;
					}
				}
			}
			if (game) {
				System.out.println(" ¿En que animal penso? ");
				String animalName = read.readLine();
				System.out.println("¿Cual es la diferencia entre "+ v.label + " y  " + animalName + "?");
				String diff = read.readLine();
				System.out.println("El " + animalName +" "+ diff);
				String yesOrnot = read.readLine();
				if (yesOrnot.equals("s")) {
					v.RIGHT = new Vertex(animalName, null, null);
					v.LEFT = new Vertex(v.label, null, null);
					v.label = diff;
				} else if (yesOrnot.equals("n")) {
					v.RIGHT = new Vertex(v.label, null, null);
					v.LEFT = new Vertex(animalName, null, null);
					v.label = diff;
				}
				
			}
			System.out.println("¿Desea jugar otra vez?");
			String y = read.readLine();	
			if (y.equals("s")) {
				v =  this.root;
			} else if (y.equals("n")) {
				System.out.println(" Gracias por Jugar ");
				game = false;
			}
		}
	}
}
