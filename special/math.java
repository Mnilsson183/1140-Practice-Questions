package special;

public class math {
    
    public static void main(String[] args){
        double INF = 100000000;
        double max = 0;
        double min = INF;
        for(int i = 0; i < 1000; ++i){
            double val =  (Math.random() * 100) + 1;
            if(val > max) max = val;
            if(val < min) min = val;
        }

        System.out.printf("Max is : %.2f\n", max);
        System.out.printf("Min is : %.2f\n", min);

        
    }
}
