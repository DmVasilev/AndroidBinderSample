package org.gearvrf.staroneservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by d.vasilev on 2/12/18.
 */

public class StarOneLocationService extends Service {
    private final IStarOneLocationInterface.Stub mBinder = new IStarOneLocationInterface.Stub() {
        public String ask(String question) {
            return question.equals("The fool knows everything and nothing") ? "NEW TEXT The location of Star One is @gridref C17320 in the 11th Sector":"";
        }
    };
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
