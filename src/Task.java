public class Task {
    private int position;
    private String task;

    public Task (String task, int position) {
        this.task = task;
        this.position = position;
    }

    public int getPosition (){
        return position;
    }

    public void setPosition (int position) {
        this.position = position;
    }

    public String getTask (){
        return task;
    }

    public void setTask (String task) {
        this.task = task;
    }
}
