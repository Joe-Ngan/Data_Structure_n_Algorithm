package edu.northeastern.Question1;

public class Roomba implements iRobot{
    final int[][] room;
    int i;
    int j;
    Direction dir;

    public Roomba(int r, int c){
        this.room = new int[r][c];
        i = 0;
        j = 0;
        dir = Direction.DOWN;
    }

    @Override
    public boolean move() {
        int m= room.length;
        int n= room[0].length;
        if(dir==Direction.RIGHT){
            if(j+1>=n || room[i][j+1]==-1){
                return false;
            }else{
                j++;
                return true;
            }
        }else if(dir==Direction.LEFT){
            if(j-1<0 || room[i][j-1]==-1){
                return false;
            }else{
                j--;
                return true;
            }
        }else if(dir==Direction.UP){
            if(i-1<0 || room[i-1][j]==-1){
                return false;
            }else{
                i--;
                return true;
            }
        }else{
            if(i+1>=m || room[i+1][j]==-1){
                return false;
            }else{
                i++;
                return true;
            }
        }
    }

    @Override
    public void turnLeft() {
        if(dir == Direction.LEFT){
            dir = Direction.DOWN;
        }else if(dir == Direction.DOWN){
            dir = Direction.RIGHT;
        }else if(dir == Direction.RIGHT){
            dir = Direction.UP;
        }else {
            dir = Direction.LEFT;
        }
    }

    @Override
    public void turnRight() {
        if(dir == Direction.RIGHT){
            dir = Direction.DOWN;
        }else if(dir == Direction.DOWN){
            dir = Direction.LEFT;
        }else if(dir == Direction.LEFT){
            dir = Direction.UP;
        }else {
            dir = Direction.RIGHT;
        }
    }

    @Override
    public void clean() {
        if(room[i][j]==1){
            return;
        }else{
            room[i][j] = 1;
        }
    }
}
