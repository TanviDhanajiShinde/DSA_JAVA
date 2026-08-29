class Linear_search{
    public static int linear_search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(key==numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={30,70,50,10,70,50};
        int key=50;
        int index=linear_search(number,key);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index"+index);
        } 

    }
}