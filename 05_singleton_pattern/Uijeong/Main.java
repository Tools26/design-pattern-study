public class Main {
    public static void main(String[] args){
        TotalScore groupUser1 = TotalScore.getInstance();
        TotalScore groupUser2 = TotalScore.getInstance();

        groupUser1.plusTotal();
        System.out.println(groupUser1.getTotal()); //2
        System.out.println(groupUser2.getTotal()); //2

        groupUser2.plusTotal();
        System.out.println(groupUser1.getTotal()); //3
        System.out.println(groupUser2.getTotal()); //3
    }

}
