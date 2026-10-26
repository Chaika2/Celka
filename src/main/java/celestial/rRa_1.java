/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYr_1;
import celestial.rfH_2;

public class rRa_1<T> {
    public final T id_protected;
    public final rfH_2 id_class;
    public final int id_break;
    public final rYr_1 id_byte;

    public rRa_1(T t, rfH_2 rfH_22, int n, rYr_1 rYr_12) {
        this.id_protected = t;
        this.id_class = rfH_22;
        this.id_break = n;
        this.id_byte = rYr_12;
    }

    public String toString() {
        return this.id_protected + ": " + this.id_class + ", " + this.id_break + ", " + this.id_byte;
    }
}

