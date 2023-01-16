public class Main {
    public static void main(String args[]){
        Trigger trigger = new Trigger();

        String getMessage = trigger.request(new GetMessage());
        System.out.println(getMessage);

        String listMessage = trigger.request(new ListMessage());
        System.out.println(listMessage);
    }
}
