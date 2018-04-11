package jerome.com.mainlite.domain.excutor.impls.lite;

import jerome.com.mainlite.domain.excutor.IExecutor;
import jerome.com.mainlite.domain.excutor.IExecutorCallback;
import jerome.com.mainlite.domain.excutor.ITaskQueue;
import jerome.com.mainlite.domain.excutor.impls.TaskQueue;

public class LiteExecutor implements IExecutor {

    //    定义一个维护ITask对象的线程安全的集合
    private ITaskQueue mTaskQueue = new TaskQueue();

    @Override
    public String postTask(Long delay, IExecutorCallback executorCallback) {
        return null;
    }

    @Override
    public boolean cancelByTag(String tag) {
        return false;
    }

    @Override
    public void cancelAll() {

    }
}
