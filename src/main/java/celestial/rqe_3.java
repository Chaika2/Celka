/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqR_2;

public class rqe_3
extends Thread {
    public rqe_3(String string) {
        super(string);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(Integer.MAX_VALUE);
            }
        }
        catch (InterruptedException interruptedException) {
            rqR_2.id_catch.warn("Timer hack thread interrupted, that really should not happen");
            return;
        }
    }
}

