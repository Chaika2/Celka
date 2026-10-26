/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rrxQ_2 {
    private boolean id_class;
    private int id_break;

    public boolean id_byte() {
        return this.id_class;
    }

    public rrxQ_2(boolean bl, int n) {
        this.id_class = bl;
        this.id_break = n;
    }

    public rrxQ_2(boolean bl) {
        this(bl, 1029);
    }

    public rrxQ_2() {
        this(false, 1029);
    }

    public String toString() {
        return "enabled: " + this.id_class + ", mode: " + this.id_break;
    }

    public void id_class(boolean bl, int n) {
        this.id_class = bl;
        this.id_break = n;
    }

    public void id_class(boolean bl) {
        this.id_class = bl;
    }

    public void id_class() {
        this.id_class = true;
    }

    public void id_class(rrxQ_2 rrxQ_22) {
        this.id_class = rrxQ_22.id_class;
        this.id_break = rrxQ_22.id_break;
    }

    public void id_class(int n) {
        this.id_break = n;
    }

    public void id_break() {
        this.id_class = false;
    }

    public int id_protected() {
        return this.id_break;
    }
}

