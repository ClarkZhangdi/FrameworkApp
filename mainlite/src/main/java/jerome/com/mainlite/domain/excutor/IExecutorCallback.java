package jerome.com.mainlite.domain.excutor;

public interface IExecutorCallback {

    void runOnBackground();

    void runOnMainThread();

    void cancel();
}
