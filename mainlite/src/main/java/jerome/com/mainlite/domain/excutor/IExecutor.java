package jerome.com.mainlite.domain.excutor;

public interface IExecutor {
    String postTask(Long delay,IExecutorCallback executorCallback);
    boolean cancelByTag(String tag);
    void cancelAll();
}
