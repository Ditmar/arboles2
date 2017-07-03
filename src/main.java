
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// armado manual del arbol
		/*Vertex a = new Vertex("a",null,null);
		Vertex b = new Vertex("b",null,null);
		Vertex c = new Vertex("c",null,null);
		Vertex d = new Vertex("d",null,null);
		Vertex e = new Vertex("e",null,null);
		Vertex f = new Vertex("f",null,null);
		Vertex g = new Vertex("g",null,null);
		Vertex h = new Vertex("h",null,null);
		Vertex i = new Vertex("i",null,null);
		Vertex j = new Vertex("j",null,null);
		a.LEFT = b;
		a.RIGHT = c;
		b.LEFT = d;
		b.RIGHT = e;
		c.LEFT = f;
		c.RIGHT = g;
		d.LEFT = j;
		g.LEFT = h;
		g.RIGHT = i;
		Recorridos s = new Recorridos();
		s.widePath(a); */
		Game g = new Game();
		try {
			g.startGame();
		} catch (Exception IOException) {
			
		}
		
	}
}
