package jerome.com.mainlite.domain.excutor;

public interface ITask extends Comparable<ITask> {
    void setTag(String tag);

    String getTag();

    void post(IExecutorCallback callback);

    void post(IExecutorCallback callback, long delay);

    boolean cancel();
}
