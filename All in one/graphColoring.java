public class graphColoring {
    private int V;
    private int[] colors;
    private int[][] graph;
    public graphColoring(int[][]graph){
        this.V=graph.length;
        this.graph=graph;
        this.colors = new int[V];

    }

    public static void main(String[]args)
    {
        int[][] graph ={
                {0,1,1,1},
                {1,0,1,0},
                {1,1,0,1},
                {1,0,1,0}
        };

        graphColoring obj = new graphColoring(graph);
        obj.graphColor();
    }

    public boolean graphColor(){
        if(!graphUntil(0)){
            System.out.println("invalid");
            return false;
        }

        for(int i=0;i<V;i++){
            System.out.print(colors[i]+" ");
        }
        System.out.println();
        return true;
    }

    private boolean graphUntil(int v){
        if(v==V){
            return true;
        }
        for(int c=1;c<V;c++){
            if(isSafe(c,v)){
                colors[v]=c;
                if(graphUntil(v+1)){
                    return true;
                }
                colors[v]=0;
            }
        }
        return false;
    }
    private boolean isSafe(int c ,int v){
        for(int i=0;i<V;i++){
            if(graph[v][i] ==1 && colors[i]==c){
                return false;
            }
        }
        return true;
    }

}
