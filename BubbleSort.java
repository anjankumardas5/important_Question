//the logic to sort element in bubble sort  is ,check the pair of element and find the largest element into the last of the array

class BubbleSort{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[]={2,8,9,6,5,4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        printArray(arr);
        
    }
    
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
     
    }

 }