//package week14;
//
//class AdjMatrix{
//	private int matrix[][] = new int[10][10];
//	private int totalV;
//	
//	public void insertVertex(int v) {
//		totalV++;
//	}
//	public void insertEdge(int v1, int v2) {
//		if(v1 >= totalV || v2 >= totalV)
//			System.out.println("그래프에 없는 정점입니다");
//		else {
//			matrix[v1][v2] = 1;
//		}
//	}
//	public void printMatrix() {
//		for(int i=0;i<totalV; i++) {
//			System.out.printf("\n\t\t");
//			for(int j=0;j<totalV;j++) {
//				System.out.printf("%3d",matrix[i][j]);
//			}
//		}
//	}
//}
//class GraphNode{
//	int vertex;
//	GraphNode link;
//}
//class AdjList{
//	private GraphNode head[] = new GraphNode[10];
//	private int totalV = 0;
//	
//	public void insertVertex(int V) {
//		totalV++;
//	}
//	public void insertEdge(int v1, int v2) {
//		if(v1 >= totalV || v2 >= totalV) {
//			System.out.println("그래프에 없는 정점입니다");
//		}
//		else {
//			GraphNode gNode = new GraphNode();
//			gNode.vertex = v2;
//			gNode.link = head[v1];
//			head[v1] = gNode;
//		}
//	}
//	public void printAdjList() {
//		GraphNode gNode = new GraphNode();
//		for(int i=0; i<totalV; i++) {
//			System.out.printf("\n정점 %c의 인접리스트",i+65);
//			gNode = head[i];
//			while(gNode != null) {
//				System.out.printf("->%c",gNode.vertex+65);
//				gNode = gNode.link;
//			}
//		}
//	}
//}
//
//public class GraphEx {
//	public static void main(String[] args) {
//		AdjMatrix mg1 =  new AdjMatrix();
//		for(int i = 0; i<4;i++) {
//			mg1.insertVertex(i);
//		}
//		mg1.insertEdge(0, 3);
//		mg1.insertEdge(0, 1);
//		mg1.insertEdge(1, 3);
//		mg1.insertEdge(1, 2);
//		mg1.insertEdge(1, 0);
//		mg1.insertEdge(2, 3);
//		mg1.insertEdge(2, 1);
//		mg1.insertEdge(3, 2);
//		mg1.insertEdge(3, 1);
//		mg1.insertEdge(3, 0);
//		System.out.println();
//		System.out.println("그래프 G의 인접행렬");
//		mg1.printMatrix();
//		
//		AdjList lg1 = new AdjList();
//		for(int i=0;i<4;i++) {
//			lg1.insertVertex(i);
//		}
//		lg1.insertEdge(0, 3);
//		lg1.insertEdge(0, 1);
//		lg1.insertEdge(1, 3);
//		lg1.insertEdge(1, 2);
//		lg1.insertEdge(1, 0);
//		lg1.insertEdge(2, 3);
//		lg1.insertEdge(2, 1);
//		lg1.insertEdge(3, 2);
//		lg1.insertEdge(3, 1);
//		lg1.insertEdge(3, 0);
//		System.out.println();
//		System.out.println("그래프 G의 인접행렬");
//		lg1.printAdjList();
//	}
//}