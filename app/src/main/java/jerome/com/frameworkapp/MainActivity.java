package jerome.com.frameworkapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context applicationContext = getApplicationContext();
        myHelper(applicationContext.getClass());

    }

    int myHelper(Class<?> c) {
        int activity_main1 = -1;
        try {
            Field[] fields = c.getFields();
            for (Field field: fields
                 ) {
                System.out.println(field.getName());
            }
            Field activity_main = c.getField("main_activity");
            activity_main1 = activity_main.getInt("activity_main");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(activity_main1);
        return activity_main1;
    }
}
