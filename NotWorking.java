public class NotWorking {
    public static void main(String[] args) {
        int[] array = {4,53,2,34,3};
        array = sort(array);
        int size = array.length;
        for (int i = 0; i<size; i++){
            System.out.print(array[i]+", ");
        }
    }
    public static int[] sort(int[] array){
        int size = array.length;
        int[] sorted = new int[size];
        int sIndex = 0;
        int min = array[0];
        int maxsorted = min;
        for (int i = 0; i<size; i++){
            System.out.println(min+"min");
            for (int j = 0; j<size; j++){
                if (array[j] < min){
                    System.out.println(maxsorted+"maxsorted");
                    min = array[j];
                    System.out.println(min+"new min");
                }
                else if(min==array[j]){
                    boolean inArray = compare(sorted, maxsorted);
                    if (inArray){
                        min++;
                        System.out.println(min+"+1");
                    }
                    else{
                        System.out.println(array[j]+"="+min);
                    }
                }
                else{
                    System.out.println(array[j]+">"+min);
                }
            }
            sorted[sIndex] = min;
            sIndex++;
            min = findMax(sorted);
            maxsorted=min;
            min++;
        }
        return sorted;
    }
    public static boolean compare(int[] array, int num){
        int size = array.length;
        for (int i = 0; i<size; i++){
            if (array[i] == num){
                System.out.println(num+"true");
                return true;
            }
        }
        System.out.println(num+"false");
        return false;
    }
    public static int findMax(int[] array){
        int size = array.length;
        int max = array[0];
        for (int i = 0; i<size; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max+"-max");
        return max;
    }
}