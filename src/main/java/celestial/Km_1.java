/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Rm_1;
import celestial.an_3;
import celestial.gy_3;
import celestial.rhN_2;
import celestial.rjU_2;

public class Km_1 {
    private final rjU_2 id_class;
    private final an_3 id_break;
    private final Rm_1 id_byte;

    public Km_1(an_3 an_32, Rm_1 rm_1) {
        this.id_break = an_32;
        this.id_byte = rm_1;
        this.id_class = rm_1.id_class(an_32);
    }

    public Km_1(rjU_2 rjU_22) {
        this.id_break = null;
        this.id_class = rjU_22;
        this.id_byte = null;
    }

    public void id_class(gy_3 gy_32, an_3 an_32) {
        if (this.id_break != null) {
            if (an_32 instanceof rhN_2) {
                ((rhN_2)an_32).id_class(gy_32.id_this(), this.id_break, this.id_byte);
            } else {
                an_32.id_class(gy_32.id_this(), this.id_class);
            }
        } else {
            an_32.id_class(gy_32.id_this(), this.id_class);
        }
    }
}

