/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.ay_3;
import celestial.iB_2;
import celestial.rBW;
import celestial.rSM;
import celestial.rhP_2;
import celestial.rhb_3;
import celestial.rsU_2;
import java.util.EnumSet;

public class rhM_2
extends rSM {
    private final rhP_2 id_class;
    private iB_2 id_break;
    private int id_byte;

    @Override
    public void id_byte() {
        this.id_throws.id_byte(this.id_break);
        an_3 an_32 = this.id_class.N();
        if (an_32 instanceof rsU_2) {
            this.id_byte = ((rsU_2)an_32).Sb();
        }
        super.id_byte();
    }

    public rhM_2(rhb_3 rhb_32, rhP_2 rhP_22) {
        super(rhP_22, false);
        this.id_class = rhP_22;
        this.id_class(EnumSet.of(rBW.TARGET));
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.z()) {
            return false;
        }
        an_3 an_32 = this.id_class.N();
        if (!(an_32 instanceof rsU_2)) {
            return false;
        }
        rsU_2 rsU_22 = (rsU_2)an_32;
        this.id_break = rsU_22.Sr();
        int n = rsU_22.Sb();
        return n != this.id_byte && this.id_class(this.id_break, ay_3.id_class);
    }
}

