public interface MyLinkedList<E>{
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter) throws Exception;
    //TODO
    // void addAll(MyLinkedList<E> linkedList);

}
