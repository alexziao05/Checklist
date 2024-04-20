import java.util.LinkedList;
public class LinkedMethods<T> implements QueueInterface<T>{

    private LinkedList <T> list;

    public LinkedMethods () {
        this.list = new LinkedList<>();
    }

    /**
     * Adds a new task to the back of the queue.
     *
     * @param task A task to be added.
     */
    @Override
    public void add(T task) {
        list.addLast(task);
    }

    /**
     * Removes an element from the queue.
     *
     * @param position The position of the task in the linkedList.
     */
    @Override
    public void del(int position) {

    }

    /**
     * Move a task from one position to another.
     *
     * @param task     The task to be moved.
     * @param position The position of where the task should be moved.
     */
    @Override
    public void move(T task, int position) {

    }


    /**
     * Checks if the queue is empty.
     *
     * @return Returns true if empty, or false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Removes every task from the checklist.
     */
    @Override
    public void clear() {

    }
}
