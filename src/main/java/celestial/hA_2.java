/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Xm_1;
import celestial.hC_2;
import celestial.hL_2;
import celestial.hY_2;
import celestial.hn_3;

public class hA_2 {
    private Xm_1 id_class = Xm_1.id_throws;
    private Xm_1 id_break = Xm_1.id_throws;
    private hY_2 id_byte = hY_2.id_class;
    private Boolean id_protected;
    private hn_3 id_throws = hn_3.id_class;

    public hA_2 id_class(hC_2 hC_22) {
        this.id_throws = hC_22.id_break();
        return this;
    }

    public hA_2 id_class(Boolean bl) {
        this.id_protected = bl;
        return this;
    }

    public static hA_2 id_class() {
        return new hA_2();
    }

    public hL_2 id_break() {
        return new hL_2(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
    }
}

