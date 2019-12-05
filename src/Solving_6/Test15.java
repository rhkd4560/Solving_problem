package Solving_6;

import java.util.Random;

public class Test15 {
    static int size;
    public static void main(String[] args) {
        int R=5, C=5, count=0;
        char ground[][]=new char[R][C];
        Random random=new Random();
        for (int i = 0; i < ground.length; i++){ // 임의 개수의 물웅덩이 포함 평면 생성
            for (int j = 0; j < ground[i].length; j++) ground[i][j]=(random.nextInt(3)==0)? '1' : '0';
        }
        for (int i = 0; i < ground.length; i++){ // 평면 출력
            for (int j = 0; j < ground[i].length; j++) System.out.print(ground[i][j]);
            System.out.println();
        }
        for (int i = 0; i < ground.length; i++) {
            for (int j = 0; j < ground[i].length; j++){
                if(ground[i][j]=='1'){
                    size = 1;
                    dfs(ground, R, C, i, j);
                    count++;
                    System.out.println("물 웅덩이의 크기 : " + size);
                }
            }
        }
        System.out.println("물 웅덩이의 총 개수 : " + count);
    }
    private static void dfs(char[][] ground, int R, int C, int i, int j) {
        int dx[] = {1, 1, 0, -1, -1, -1, 0, 1}, dy[] = {0 ,-1 ,-1 ,-1, 0, 1, 1, 1};

        for (int z = 0; z < dx.length; z++) {
            int x = i + dx[z];
            int y = j + dy[z];
            if (x >= 0 && x < R && y >= 0 && y < C && ground[x][y]=='1') {
                ground[i][j]='0';
                ground[x][y]='0';
                size+=1;
                dfs(ground, R, C, x, y);
            }
        }
    }
}
