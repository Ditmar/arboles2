import java.util.ArrayList;

public class Recorridos {
	public String result;
	public Recorridos () {
		result = "[ ";
	}
	public void preorder (Vertex v) {
		if (v == null) {
			return;
		}
		//raíz,
		//Izquierda
		//Derecha
		System.out.print(" " + v.label + ", ");
		inorder(v.LEFT);
		inorder(v.RIGHT);
	}
	public void inorder (Vertex v) {
		if (v == null) {
			return;
		}
		//izquierda
		inorder(v.LEFT);
		//raíz
		System.out.print(" " + v.label + ", ");
		//Derecha
		inorder(v.RIGHT);
	}
	public void postorder (Vertex v) {
		if (v == null) {
			return;
		}
		//izquierda
		inorder(v.LEFT);
		//derecha
		inorder(v.RIGHT);
		//raíz
		System.out.print(" " + v.label + ", ");
	}
	public void widePath (Vertex v) {
		System.out.print(" " + v.label + ", ");
		ArrayList<Vertex> childs = new ArrayList<Vertex>();
		if (v.LEFT != null) {
			childs.add(v.LEFT);
		}
		if (v.RIGHT != null) {
			childs.add(v.RIGHT);
		}
		if (childs.size() > 0) {
			recursivePath(childs);
		}
	}
	private void recursivePath(ArrayList<Vertex> childs) {
		ArrayList<Vertex> _childs = new ArrayList<Vertex>();
		for (int i = 0; i < childs.size(); i++) {
			System.out.print(" " + childs.get(i).label + ", ");
			if (childs.get(i).LEFT != null) {
				_childs.add(childs.get(i).LEFT);
			}
			if (childs.get(i).RIGHT != null) {
				_childs.add(childs.get(i).RIGHT);
			}
		}
		if (_childs.size() == 0) {
			return;
		}
		recursivePath(_childs);
	}
}
