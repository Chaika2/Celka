/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rjU_2;
import celestial.rqR_2;
import celestial.uo_3;

public class uK_2 {
    private final rgP_2 id_class;
    private long id_break;
    private rjU_2 id_byte;

    public rjU_2 id_byte() {
        return this.id_byte;
    }

    public uK_2(uo_3 uo_32, rgP_2 rgP_22, rjU_2 rjU_22) {
        this.id_class = rgP_22;
        this.id_byte = rjU_22;
        this.id_break = rqR_2.id_break();
    }

    public void id_class(rjU_2 rjU_22) {
        this.id_byte = rjU_22;
        this.id_break = rqR_2.id_break();
    }

    public rgP_2 id_class() {
        return this.id_class;
    }

    public long id_break() {
        return this.id_break;
    }
}

