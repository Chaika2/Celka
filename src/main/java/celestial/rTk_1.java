/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rTk_1
implements Runnable {
    private final int id_class;
    private final Runnable id_break;

    public rTk_1(int n, Runnable runnable) {
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

