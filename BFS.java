import java.util.Iterator;
import java.util.LinkedList;



public class BFS{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Graph g = new Graph(4); // enter the value of vertices
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
        
        g.BFS(0);
        
	}
	
	
	
	

}

class Graph{
	private int V; //number of verticies
	 
	private LinkedList<Integer> adj[]; //adjacency list
	
	// Constructor
	Graph(int v) {
		V = v; //intialize V
		adj = new LinkedList[v];// initialize size of the linkedList
		 
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList(); //each array index is given a  new LinkedList
	}
	
	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w);
		// the array with index v, is given a int w to add to its linkedlist
		
	}
	 
	void BFS(int s) {// made to print BFS from a arbitrary node 
		//this array is made so that you can keep of visited nodes
		boolean visited[]= new boolean[V];
		
		//queue (generally used for BFS)
		LinkedList<Integer>queue = new LinkedList<Integer>();
		
		//mark the current node as visited and enqueue it 
		visited[s]=true;
		queue.add(s);
		
		while(queue.size() != 0) {
			//Dequeue a vertex from queue and print it
			s= queue.poll();
			System.out.println(s+" ");
			// Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
		
		
		
	}
			
			
			
		
		
		
		
		
	}
	
	
