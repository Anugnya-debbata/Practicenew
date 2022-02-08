
public class Graph {
 private boolean adjMatrix[][];
 private int numVertices;
 //intialize matrix
 public Graph(int numVertices) {
	 this.numVertices=  numVertices;
	 adjMatrix= new boolean[numVertices][numVertices];
 }
 //add edges
 
 public void addedge(int i, int j) {
	 adjMatrix[i][j]=true;
	 adjMatrix[j][i]=true;
 }
 
 //delete edges
 
 public void deleteedge(int i, int j) {
	 adjMatrix[i][j]=false;
	 adjMatrix[j][i]=false;
	 
 }
 ///Print matrix
 
 public String toString() {
	 StringBuilder s=new StringBuilder();
	 for(int i=0;i<numVertices;i++) {
		 s.append(i+":");
	 for(boolean j:adjMatrix[i]) {
		 s.append((j ? 1:0)+" ");
	 }
	 s.append("\n");
	 
 }
	 return s.toString();
 }
	public static void main(String[] args) {
		
		Graph g=new Graph(4);
		
		 g.addedge(0, 1);
		    g.addedge(0, 2);
		    g.addedge(1, 2);
		    g.addedge(2, 0);
		    g.addedge(2, 3);
		    g.deleteedge(2, 3);
		    System.out.println(g.toString());

		// TODO Auto-generated method stub

	}

}
