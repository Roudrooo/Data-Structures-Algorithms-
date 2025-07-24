import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Graph{
    public static void main(String[] args) {
        Edge[] list=getAdjList();
        int[][] mat=getAdjMat();
        System.out.println("Depth First Search:");
        dfs(mat);
        System.out.println("\nBreadth First Search:");
        bfs(mat);
    }

    public static Edge[] getAdjList(){
        Edge[] list=new Edge[5];

        list[0]=new Edge(0,2);
        list[0].next=new Edge(0,4);

        list[1]=new Edge(1,0);
        list[1].next=new Edge(1,3);

        list[2]=new Edge(2,0);
        list[2].next=new Edge(2,2);

        list[4]=new Edge(4,3);

        return list;
    }

    public static int[][] getAdjMat(){
        int[][] mat=new int[5][5];
        
        mat[0][2]=1;
        mat[0][4]=1;

        mat[1][0]=1;
        mat[1][3]=1;
        
        mat[2][0]=1;
        mat[2][2]=1;
        
        mat[4][3]=1;

        return mat;
    }

    public static void dfs(int[][] mat){
        boolean[] visited=new boolean[mat.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<mat.length;i++){
            if(visited[i]==false){
                visited[i]=true;
                s.push(i);
                System.out.println(i);
                while(!s.isEmpty()){
                    int idx1=s.peek();
                    boolean isBreak=false;
                    for(int idx2=0;idx2<mat.length;++idx2){
                        if(mat[idx1][idx2]==1){
                            if(visited[idx2]==false){
                                visited[idx2]=true;
                                s.push(idx2);
                                System.out.println(idx2);
                                isBreak=true;
                                break;
                            }
                        }
                    }
                    if(!isBreak) s.pop();
                }
            }
        }
    }

    public static void bfs(int[][] mat){
        boolean[] visited=new boolean[mat.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<mat.length;++i){
            if(visited[i]==false){
                visited[i]=true;
                q.add(i);
                System.out.println(i);
                while(!q.isEmpty()){
                    int idx1=q.remove();
                    for(int idx2=0;idx2<mat.length;++idx2){
                        if(mat[idx1][idx2]==1){
                            if(visited[idx2]==false){
                                visited[idx2]=true;
                                q.add(idx2);
                                System.out.println(idx2);
                            }
                        }
                    }
                }
            }
        }
    }

}
