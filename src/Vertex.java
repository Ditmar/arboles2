
public class Vertex {
	public String label;
	public Vertex LEFT;
	public Vertex RIGHT;
	public Vertex (String l, Vertex left, Vertex right) {
		this.label = l;
		this.LEFT = left;
		this.RIGHT = right;
	}
	
}