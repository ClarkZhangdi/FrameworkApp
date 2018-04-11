package jerome.com.mainlite.base.presenter;

import android.support.annotation.NonNull;

/**
 * create() resume() pause() destroy() attachView()这几个方法
 */
public interface IBasePresenter {
    void create();

    void resume();

    void pause();

    void destroy();

    void attachView(@NonNull IBaseView view);
}
