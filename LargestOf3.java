public class LargestOf3{
    public static void main(String[] args) {
        int a=18;
        int b=13;
        int c=07;
        if(a>b){
            if(a>c){
                System.out.println(" a is big ");
            }
            else{
                System.out.println("c is big");
            }
        }
        else if(b>c){
            if(b>a){
                System.out.println("b is big");
            }else{
                System.out.println("a is big");
            }
        }
    }
}
