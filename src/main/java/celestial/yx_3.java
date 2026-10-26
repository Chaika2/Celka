/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;
import celestial.yQ_2;

public class yx_3 {
    public final yQ_2 id_class;
    public rpr_3 id_break;
    public int id_byte;
    public int id_protected;

    public yx_3(yQ_2 yQ_22, rpr_3 rpr_32, int n) {
        this.id_class = yQ_22;
        this.id_break = rpr_32;
        this.id_byte = n;
    }

    public void id_class(rpr_3 rpr_32, int n, int n2) {
        this.id_break = rpr_32;
        this.id_byte = n;
        this.id_protected = n2;
    }

    public boolean id_class(rpr_3 rpr_32) {
        return (this.id_byte & 1 << rpr_32.ordinal()) > 0;
    }

    public void id_class(byte by, rpr_3 rpr_32) {
        this.id_byte = this.id_byte | by | 1 << this.id_break.ordinal();
    }
}

