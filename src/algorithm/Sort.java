package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp = 0;
        for(int i=1; i<array.length;i++)
        {
            for(int j=i; j>0; j--)
            {
                if(array[j]<array[j-1])
                {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int i=array.length; i>=0; i--)
        {
            for(int j=0; j<array.length-1; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }
    

    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here



        return list;
    }
    

    public int [] quickSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

                final long endTime = System.currentTimeMillis();
                final long executionTime = endTime - startTime;
                this.executionTime = executionTime;
                return list;
    }

    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int maxVal=1000000;
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++)
        {
            bucket[i]=0;
        }
        for (int i=0; i<list.length; i++)
        {
            bucket[list[i]]++;
        }
        int outPos=0;
        for (int i=0; i<bucket.length; i++)
        {
            for (int j=0; j<bucket[i]; j++)
            {
                list[outPos++]=i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here




        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
