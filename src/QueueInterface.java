public interface QueueInterface <T>{
    /**
     * Adds a new task to the back of the queue.
     * @param task A task to be added.
     */
    public void add (T task);

    /**
     * Removes an element from the queue.
     * @param position The index of the task in the linkedList.
     */
    public void del (int position);

    /**
     * Move a task from one position to another.
     * @param task The task to be moved.
     * @param position The position of where the task should be moved.
     */
    public void move (T task, int position);

    /**
     * Checks if the queue is empty.
     * @return Returns true if empty, or false otherwise.
     */
    public boolean isEmpty();

    /**
     * Removes every task from the checklist.
     */
    public void clear();
}
