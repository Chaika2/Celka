/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ji_3;
import celestial.rqO_2;

public final class fV_2 {
    public final rqO_2 id_class;
    public int id_break;
    public int id_byte;
    public final ji_3 id_protected;
    public double id_throws = 1.0;

    public int id_byte() {
        return this.id_byte;
    }

    public fV_2(rqO_2 rqO_22, int n, int n2, ji_3 ji_32) {
        this.id_class = rqO_22;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = ji_32;
    }

    public String toString() {
        return this.id_class + ", width: " + this.id_break + ", height: " + this.id_byte + ", frames: " + this.id_protected.id_class() + ", scale: " + this.id_throws;
    }

    public rqO_2 id_class() {
        return this.id_class;
    }

    public void id_class(int n) {
        this.id_break = n;
    }

    public void id_class(double d) {
        this.id_throws = d;
    }

    public void id_break(int n) {
        this.id_byte = n;
    }

    public int id_break() {
        return this.id_break;
    }

    public double id_throws() {
        return this.id_throws;
    }

    public ji_3 id_protected() {
        return this.id_protected;
    }
}

