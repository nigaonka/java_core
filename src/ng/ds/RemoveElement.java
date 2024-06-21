package ng.ds;

public class RemoveElement {

    public static void removeElement(int val){

        int ar[] = {1,3,4,5};
        int index = 0;
        for(int i=0;i< ar.length;i++){
            if(ar[i] != val){
                ar[index] = ar[i];
                index++;
            }

        }
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }

    public static void main(String arg[]){
        removeElement(4);
    }

}
