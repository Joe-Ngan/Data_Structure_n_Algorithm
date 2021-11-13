import java.util.LinkedList;

public class Q1_ThreadSafeLinkedList<T>{
    private LinkedList<T> list;
    private Object obj;

    public Q1_ThreadSafeLinkedList(){
        this.list = new LinkedList<T>();
        this.obj = new Object();
    }

    public void addAtPosition(int index, T element){
        synchronized (obj){
            if(list.size()-1<index){
                return;
            }else{
                list.add(index, element);
            }
        }
    }

    public void removeAtPosition(int index){
        synchronized (obj){
            if(list.size()-1<index){
                return;
            }else {
                list.remove(index);
            }
        }
    }

    public T getFirst(){
        synchronized (obj){
            return list.getFirst();
        }
    }

    public T getLast(){
        synchronized (obj){
            return list.getLast();
        }
    }

    public int size(){
        synchronized (obj){
            return list.size();
        }
    }
}
