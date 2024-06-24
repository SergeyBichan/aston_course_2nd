public class Runner {
    public static void main(String[] args) throws Exception {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.addLast("abc");
        linkedList.addLast("adas");
        linkedList.addLast("absac");
        System.out.println(linkedList.size());
        System.out.println(linkedList.getElementByIndex(0));
        System.out.println(linkedList.getElementByIndex(5));


    }
}
