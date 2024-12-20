public class CheckAscending{
    public static boolean check(int[] arr. int index){
        if(arr.length-1 == index){
            return true;
        }else if (arr[index] <= arr[index + 1]){
             return check(arr, index + 1);
        }else{
            return false;}
        }
        }
    }
}