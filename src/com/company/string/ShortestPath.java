package com.company.string;

public class ShortestPath {
    static double getShortestPath(String directions){
        int x = 0, y = 0;

        for(int i=0; i<directions.length(); i++){
            switch(directions.charAt(i)){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
            }
        }

        return Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {
        System.out.println("The shortest path of direction WNEENESENNN is: "+getShortestPath("WNEENESENNN"));
    }
}
