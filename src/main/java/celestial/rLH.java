/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLq_1;

public class rLH {
    private rLq_1[] id_class = new rLq_1[128];
    private int id_break;

    public boolean id_byte() {
        return this.id_break == 0;
    }

    public void id_class(rLq_1 rLq_12, float f) {
        float f2 = rLq_12.id_catch;
        rLq_12.id_catch = f;
        if (f < f2) {
            this.id_class(rLq_12.id_protected);
        } else {
            this.id_break(rLq_12.id_protected);
        }
    }

    private void id_class(int n) {
        rLq_1 rLq_12 = this.id_class[n];
        float f = rLq_12.id_catch;
        while (n > 0) {
            int n2 = n - 1 >> 1;
            rLq_1 rLq_13 = this.id_class[n2];
            if (!(f < rLq_13.id_catch)) break;
            this.id_class[n] = rLq_13;
            rLq_13.id_protected = n;
            n = n2;
        }
        this.id_class[n] = rLq_12;
        rLq_12.id_protected = n;
    }

    public rLq_1 id_class(rLq_1 rLq_12) {
        if (rLq_12.id_protected >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.id_break == this.id_class.length) {
            rLq_1[] rLq_1Array = new rLq_1[this.id_break << 1];
            System.arraycopy(this.id_class, 0, rLq_1Array, 0, this.id_break);
            this.id_class = rLq_1Array;
        }
        this.id_class[this.id_break] = rLq_12;
        rLq_12.id_protected = this.id_break;
        this.id_class(this.id_break++);
        return rLq_12;
    }

    public void id_class() {
        this.id_break = 0;
    }

    private void id_break(int n) {
        rLq_1 rLq_12 = this.id_class[n];
        float f = rLq_12.id_catch;
        while (true) {
            float f2;
            rLq_1 rLq_13;
            int n2 = 1 + (n << 1);
            int n3 = n2 + 1;
            if (n2 >= this.id_break) break;
            rLq_1 rLq_14 = this.id_class[n2];
            float f3 = rLq_14.id_catch;
            if (n3 >= this.id_break) {
                rLq_13 = null;
                f2 = Float.POSITIVE_INFINITY;
            } else {
                rLq_13 = this.id_class[n3];
                f2 = rLq_13.id_catch;
            }
            if (f3 < f2) {
                if (!(f3 < f)) break;
                this.id_class[n] = rLq_14;
                rLq_14.id_protected = n;
                n = n2;
                continue;
            }
            if (!(f2 < f)) break;
            this.id_class[n] = rLq_13;
            rLq_13.id_protected = n;
            n = n3;
        }
        this.id_class[n] = rLq_12;
        rLq_12.id_protected = n;
    }

    public rLq_1 id_break() {
        rLq_1 rLq_12 = this.id_class[0];
        this.id_class[0] = this.id_class[--this.id_break];
        this.id_class[this.id_break] = null;
        if (this.id_break > 0) {
            this.id_break(0);
        }
        rLq_12.id_protected = -1;
        return rLq_12;
    }
}

