public class ShortestPath {
    public static void calcShortPath(String routeD)
    {
        int x1=0,x2=0,y1=0,y2=0;
        for(int i=0;i<routeD.length();i++)
        {
            char dir=routeD.charAt(i)
            if(dir=='E')
            {
                x2++;
            }else if(dir=='W')
            {
                x2--;
            }else if(dir=='N')
            {
                y2++;
            }else{
                y2--;
            }
        }
        double shortestPath=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        System.out.println("Shortest Distance from ["+x1+"]["+y1+"] to ["+x2+"]["+y2+"]="+shortestPath);
    }
    public static void main(String[] args) {
        String route=new String("WNEENESENNN");
        calcShortPath(route);
    }
}
