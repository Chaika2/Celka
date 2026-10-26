/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rTN
implements Runnable {
    private final int id_class;
    private final Runnable id_break;

    public rTN(int n, Runnable runnable) {
        this.id_class = n;
        this.id_break = runnable;
    }

    @Override
    public void run() {
        this.id_break.run();
    }

    public int id_class() {
        return this.id_class;
    }
}

