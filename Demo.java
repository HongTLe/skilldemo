public class Demo{
    static int num = 0;
    public static int sum(int[] array){
        for (int i=0; i < array.length; i++){
            num += array[i];
        }
        return num;
    }
}
