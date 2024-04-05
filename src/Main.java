
import java.util.Collections;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Graf graf = new Graf();
		graf.ReadGraphFromFile("Graph1.gr");
		//graf.printGraph();
/*
		Vector<Integer> dfsr = graf.DFSRekurzivno(4);
		System.out.println("DFS Rekurzivno: " + dfsr.toString());
		
		Vector<Integer> dfsnr = graf.DFSNerekurzivno(4);
		System.out.println("DFS Rekurzivno: " + dfsnr.toString());*/
		int[][] matrica={
				{0,0,0,3,3},
				{0,2,2,3,3},
				{0,1,2,5,5},
				{1,1,2,5,4},
				{1,1,2,5,4}
		};
		int n=5;
		int m=5;
		//Graf graf = new Graf(5);
		int brSoba=-1;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(matrica[i][j]>brSoba)
					brSoba=matrica[i][j];
			}
		}
		Graf graf = new Graf(brSoba+1);
		for(int i=0;i<n;i++) {
			for (int j = 0; j < m; j++) {
				int soba = matrica[i][j];

				if (i - 1 >= 0 && matrica[i - 1][j] != soba){
					int soba2=matrica[i-1][j];
					graf.DodajGranuNeusmereni(soba+1,soba2+1,1);
				}
				if (i + 1 <n && matrica[i + 1][j] != soba){
					int soba2=matrica[i+1][j];
					graf.DodajGranuNeusmereni(soba+1,soba2+1,1);
				}
				if(j-1>=0 && matrica[i][j-1]!=soba){
					int soba2=matrica[i][j-1];
					graf.DodajGranuNeusmereni(soba+1,soba2+1,1);
				}
				if(j+1<n && matrica[i][j+1]!=soba){
					int soba2 = matrica[i][j+1];
					graf.DodajGranuNeusmereni(soba+1,soba2+1,1);
				}

			}
		}
		int soba1 = 0;
		int soba2=4;
		System.out.println(graf.rastojanje(soba1+1,soba2+1));
	}

		/*graf.dodajGranuUsmereni(1,2,1);
		graf.dodajGranuUsmereni(1,3,1);
		graf.dodajGranuUsmereni(4,5,1);
		//graf.dodajGranuUsmereni(3,5,1);
		Vector<Vector<Integer>> komponente = graf.KomponentePovezanosti();
		System.out.println(komponente.toString());
		//Vector<Integer> bfs = graf.Bfs(1);
		//System.out.println("BFS :" + bfs.toString());

		//Vector<Integer> dijsktra = graf.Dijkstra(1);
		//System.out.println("Dijkstra :" + dijsktra.toString());

		//Vector<Edge> mstK = graf.mstKruskal();
		//System.out.println(mstK);

		//Vector<Edge> mstP = graf.mstPrim(1);
		//System.out.println(mstP);
			*/
	}


