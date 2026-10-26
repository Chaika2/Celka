/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;

public class rrxW_2 {
    private boolean id_class;
    private int id_break;
    private float id_byte;

    public boolean id_byte() {
        return this.id_class;
    }

    public rrxW_2(boolean bl, int n, float f) {
        this.id_class = bl;
        this.id_break = n;
        this.id_byte = f;
    }

    public rrxW_2(boolean bl) {
        this(bl, 519, 0.0f);
    }

    public rrxW_2() {
        this(false, 519, 0.0f);
    }

    public String toString() {
        return "enabled: " + this.id_class + ", func: " + this.id_break + ", ref: " + this.id_byte;
    }

    public void id_class() {
        this.id_class = true;
    }

    public void id_class(boolean bl, int n, float f) {
        this.id_class = bl;
        this.id_break = n;
        this.id_byte = f;
    }

    public void id_class(rrxW_2 rrxW_22) {
        this.id_class = rrxW_22.id_class;
        this.id_break = rrxW_22.id_break;
        this.id_byte = rrxW_22.id_byte;
    }

    public void id_class(int n, float f) {
        this.id_break = n;
        this.id_byte = f;
    }

    public void id_class(boolean bl) {
        this.id_class = bl;
    }

    public void id_break() {
        this.id_class = false;
    }

    public float id_throws() {
        return this.id_byte;
    }

    public void id_case() {
        if (!this.id_class) {
            MT.id_protected();
        } else {
            MT.id_throws();
            MT.id_class(this.id_break, this.id_byte);
        }
    }

    public int id_protected() {
        return this.id_break;
    }
}

