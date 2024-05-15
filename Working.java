//this is a java program
public class Working{
    //main method
	public static void main(String[] args) {
	    //create your annoying array
		int[] array = {4,53,2,34,3,6,7,3,3,35,54};
		//sets the array to the new sorted array
        array = sort(array);
        //gets the size of the array
        int size = array.length;
        //creates a for loop that runs size amt of times
        for (int i = 0; i<size; i++){
            //prints i + ", "
            System.out.print(array[i]+", ");
        //close bracket
        }
    //end of main close bracket
	}
	//creates a function called sort -- bubble sort
	public static int[] sort(int[] array){
	    //gets the size of the array
	    int size = array.length;
	    //creates a new array
        int[] sorted = new int[size];
        //sets the new array same as old array
        sorted = array;
        //creates a for loop that runs size amt of times]
        for (int i = 0; i<size; i++){
            //creates ANOTHER for loop that runs size amt of times
            for (int j = 0; j<size; j++){
                // if sorted[i] < sorted[j], then 
                if (sorted[i] < sorted[j]){
                    //sets num equal to sorted j
                    int num = sorted[j];
                    //sets sorted j = sorted i
                    sorted[j] = sorted[i];
                    //sets sorted i = num
                    sorted[i] = num;
                //end bracket of if
                }
            //end bracket of for
            }
        //end bracket of for
        }
        //returns the sorted array
        return sorted;
    //end bracket of function
	}
//end bracket of all
}
//this is a useless comment \/
//why are you degrading your fellow comment :C
