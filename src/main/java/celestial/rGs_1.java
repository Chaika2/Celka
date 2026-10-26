/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.ay_3;
import celestial.iB_2;
import celestial.rBk_1;
import celestial.rGB;
import celestial.rYB;
import celestial.rhd_3;
import java.util.Comparator;
import java.util.List;

public class rGs_1
extends rBk_1 {
    private final ay_3 id_break = new ay_3().id_class(64.0);
    private int id_byte = 20;
    public final /* synthetic */ rGB id_class;

    public rGs_1(rGB rGB2) {
        this.id_class = rGB2;
    }

    @Override
    public boolean id_class() {
        if (this.id_byte > 0) {
            --this.id_byte;
            return false;
        }
        this.id_byte = 60;
        List<rhd_3> list = ((rYB)this.id_class.id_throws[7]).id_class(this.id_break, this.id_class, this.id_class.rN().id_byte(16.0, 64.0, 16.0));
        if (!list.isEmpty()) {
            list.sort(Comparator.comparing(an_3::re).reversed());
            for (rhd_3 rhd_32 : list) {
                if (!this.id_class.id_class((iB_2)rhd_32, ay_3.id_class)) continue;
                this.id_class.id_byte((iB_2)rhd_32);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean id_break() {
        iB_2 iB_22 = this.id_class.I_();
        return iB_22 != null ? this.id_class.id_class(iB_22, ay_3.id_class) : false;
    }
}

