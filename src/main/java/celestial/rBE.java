/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.iB_2;
import celestial.rBW;
import celestial.rMZ;
import celestial.rSM;
import celestial.rYB;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rsq_3;
import java.util.EnumSet;
import java.util.List;

public class rBE
extends rSM {
    private final rMZ id_class;
    private iB_2 id_break;
    private final ay_3 id_byte = new ay_3().id_class(64.0);

    @Override
    public void id_byte() {
        this.id_class.id_byte(this.id_break);
        super.id_byte();
    }

    public rBE(rMZ rMZ2) {
        super(rMZ2, false, true);
        this.id_class = rMZ2;
        this.id_class(EnumSet.of(rBW.TARGET));
    }

    @Override
    public boolean id_class() {
        rfl_3 rfl_32 = this.id_class.rN().id_byte(10.0, 8.0, 10.0);
        List<rsq_3> list = ((rYB)this.id_class.id_throws[7]).id_class(rsq_3.class, this.id_byte, this.id_class, rfl_32);
        List<rhd_3> list2 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_byte, this.id_class, rfl_32);
        for (iB_2 iB_22 : list) {
            rsq_3 rsq_32 = (rsq_3)iB_22;
            for (rhd_3 rhd_32 : list2) {
                int n = rsq_32.id_throws(rhd_32);
                if (n > -100) continue;
                this.id_break = rhd_32;
            }
        }
        if (this.id_break == null) {
            return false;
        }
        return !(this.id_break instanceof rhd_3) || !this.id_break.id_native() && !((rhd_3)this.id_break).id_implements();
    }
}

