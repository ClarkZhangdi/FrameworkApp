package jerome.com.mainlite.domain.excutor;

import jerome.com.mainlite.domain.excutor.impls.lite.LiteExecutor;

public class Executor {
    public static final int MODE_LITE_ASYNC = 2;

    private static IExecutor executor;

    public static void initMode(int mode) {
        switch (mode) {
            case MODE_LITE_ASYNC:
                executor = new LiteExecutor();
                break;
        }
    }
}
