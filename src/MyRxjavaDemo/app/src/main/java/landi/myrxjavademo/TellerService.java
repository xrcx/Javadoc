package landi.myrxjavademo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.arke.vas.IVASListener;
import com.arke.vas.VASInterfaceStub;
import com.arke.vas.data.VASPayload;

/**
 */

public class TellerService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    private VASInterfaceStub tellerBinder = new VASInterfaceStub() {
        @Override
        public void signIn(IVASListener listener) throws RemoteException {
            // 签到业务实现
        }

        @Override
        public void sale(VASPayload requestData, IVASListener listener) throws RemoteException {
            // 消费业务实现
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return tellerBinder;
    }
}
