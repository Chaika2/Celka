/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.rng_3;

public class As_1
extends Thread {
    public As_1(String string) {
        super(string);
    }

    @Override
    public void run() {
        rng_3 rng_32;
        QY qY = QY.id_instanceof();
        if (qY != null && (rng_32 = qY.id_this()) != null) {
            rng_32.id_class(true);
        }
    }
}

