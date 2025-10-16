import java.util.ArrayList;

public class EX_25MostWater {
    public static int maxWater(ArrayList<Integer> list){
        int maxWater = 0;int currWater = 0;
        for(int i = 0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                int height = Math.min(list.get(j), list.get(i));
                int width = j-i;
                currWater = height*width;
                if(currWater>maxWater){
                    maxWater=currWater;
                }
            }
        }
        return maxWater;
    }

    // two pointer approach

    public static int maxWaterContainer(ArrayList<Integer> list){
        int maxWater = 0,currWater=0,start=0,end = list.size()-1;
        while (start<=end)
        {
            int height = Math.min(list.get(start),list.get(end));
            int width = end-start;
            currWater = height*width;
            maxWater = Math.max(maxWater, currWater);
            if(list.get(start)<list.get(end)){
                start++;
            }
            else{
                end--;
            }

        }

    return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        // System.out.println(maxWater(list));
        System.out.println(maxWaterContainer(list));
    
    }
}
