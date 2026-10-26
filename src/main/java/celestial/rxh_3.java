/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.rHE;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import java.util.List;

public class rxh_3
extends rdb_3 {
    private final rHE id_class;

    public rHE id_byte() {
        return this.id_class;
    }

    public rxh_3(rHE rHE2, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_class = rHE2;
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        list.add(this.id_throws().id_class(rgF_2.GRAY));
    }

    public rVi_1 id_throws() {
        return new rgn_3(this.id_break() + ".desc");
    }
}

