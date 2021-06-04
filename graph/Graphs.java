package graph;

public class Graphs {
	
	public int vertices;
	public int adjMat[][];
	public int visited[];
	
	public Graphs(int n) {
		vertices = n;
		adjMat = new int[n][n];
		visited = new int[vertices];
	}

	// inserting an edge into the graph
	public void insertEdge(int u, int v, int x) {
		// assign matrix to have cost of x
		adjMat[u][v] = x;
	}
	
	
	// removing an edge from the graph
	public void removeEdge(int u, int v) {
		// make the cost as 0 and remove
		adjMat[u][v] = 0;
	}
	
	// checking for edge in the graph
	public boolean existEdge(int u, int v) {
		// if value exists means there is path 
		// so return true else return false
		return adjMat[u][v] != 0;
	}
	
	// count no of vertices 
	public int vertexCount() {
		return vertices;
	}
	
	// count no of edges 
	public int edgeCount() {
		int count = 0;
		for(int i=0; i<vertices; i++) {
			for(int j=0; j<vertices; j++)
				if(adjMat[i][j] != 0)
					count = count + 1;
		}
		return count;
	}
	
	// display edges present 
	public void edges() {
		System.out.println("Edges :: ");
		for(int i=0; i<vertices; i++) {
			for(int j=0; j<vertices; j++)
				if(adjMat[i][j] != 0)
					System.out.println(i+"--"+j);
		}
	}
	
	// compute outdegree of any vertices 
	public int outdegree(int v) {
		int count = 0;
		// traverse the columns in matrix
		for(int j=0; j<vertices; j++)
			if(adjMat[v][j] != 0)
				count = count + 1;
		return count;
	}
	
	// compute indegree of any vertices 
	public int indegree(int v) {
		int count = 0;
		// traverse the rows in matrix 
		for(int i=0; i<vertices; i++)
			if(adjMat[i][v] != 0)
				count = count + 1;
		return count;
	}
	
	public void display() {
		for(int i=0; i<vertices; i++) {
			for(int j=0; j<vertices; j++)
				System.out.print(adjMat[i][j]+"\t");
		System.out.println();
		}
	}
	
	public void breadthFirstSearch(int s) {
		int i = s;
		BFS b = new BFS();
		int visited[] = new int[vertices];
		System.out.print(i + " ");
		visited[i] = 1;		// vertex is visited
		b.enque(i); 		// element added to queue
		while( !b.isEmpty()) {
			i = b.deque();		// remove verted d
			for(int j=0; j<vertices; j++) {
				// check if path is there and vertex is visited or not
				if(adjMat[i][j] == 1 && visited[j] == 0) {
					System.out.print(j+" ");
					visited[j] = 1;
					b.enque(j);
				}
			}
		}
	}
	
	public void depthFirstSearch(int s) {
		// if vertex s is not visited 
		if(visited[s] == 0) {
			System.out.print(s+" ");
			visited[s] = 1;			// marked as visited
			for(int j=0; j<vertices; j++) {
				// if path exists and yet not visited
				if(adjMat[s][j] == 1 && visited[j] == 0) {
					depthFirstSearch(j);
				}
			}
		}
	}
	
	public static void main(String [] args) {
		Graphs gg = new Graphs(4);
		System.out.println("Graphs Adjacency Matrix");
		gg.display();
		
		System.out.println("Vertices count :: "+gg.vertexCount());
		System.out.println("Edge count :: "+gg.edgeCount());
		gg.insertEdge(0, 1, 1);
		gg.insertEdge(1, 0, 1);
		gg.insertEdge(0, 2, 1);
		gg.insertEdge(2, 0, 1);
		gg.insertEdge(2, 1, 1);
		gg.insertEdge(1, 2, 0);
		gg.insertEdge(2, 3, 1);
		gg.insertEdge(3, 2, 1);
		System.out.println("Edge count :: "+gg.edgeCount());
		gg.edges();
		System.out.println("Edge between 1 and 3 "+gg.existEdge(1, 3));
		System.out.println("Edge between 0 and 2 "+gg.existEdge(0, 2));
		System.out.println("Degree of 1 :: "+gg.indegree(2));
		gg.removeEdge(0, 2);
		gg.edges();
		gg.display();
		System.out.println("Edges between 0 and 2 "+gg.existEdge(0, 2));
	}
}
