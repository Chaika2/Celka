/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ruS_2;

public class rrzB_2
implements Runnable {
    private ruS_2 id_class;
    private Runnable id_break;

    public rrzB_2(ruS_2 ruS_22, Runnable runnable) {
        this.id_class = ruS_22;
        this.id_break = runnable;
    }

    @Override
    public void run() {
        this.id_break.run();
    }

    public String toString() {
        return "PacketRunnable: " + this.id_class;
    }

    public ruS_2 id_class() {
        return this.id_class;
    }
}

