/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.Vs_1;
import celestial.cj_3;
import celestial.fH_2;
import celestial.fN_2;
import celestial.fy_3;
import celestial.rAI;
import celestial.rAL;
import celestial.rAY;
import java.io.IOException;
import java.io.InputStream;

public class cV_2
extends fH_2 {
    public cV_2() {
        super(cj_3.id_class);
    }

    @Override
    protected fy_3 id_class(rAL rAL2) {
        fy_3 fy_32;
        block8: {
            QY qY = QY.id_instanceof();
            rAY rAY2 = qY.Z().id_class();
            InputStream inputStream = cV_2.id_class(rAL2, rAY2);
            try {
                fy_32 = new fy_3(new Vs_1(true, true), fN_2.id_class(inputStream));
                if (inputStream == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    return new fy_3(iOException);
                }
            }
            inputStream.close();
        }
        return fy_32;
    }

    private static InputStream id_class(rAL rAL2, rAY rAY2) throws IOException {
        return rAL2.id_break(cj_3.id_class) ? rAL2.id_class(cj_3.id_class).id_break() : rAY2.id_class(rAI.CLIENT_RESOURCES, cj_3.id_class);
    }
}

