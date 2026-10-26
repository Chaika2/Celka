/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.xd_3;
import java.util.List;

public class rxB_2
extends rdb_3 {
    private final xd_3 id_class;

    public rxB_2(xd_3 xd_32, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_class = xd_32;
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        super.id_class(rdn_32, rYB2, list, vD);
        this.id_class.id_class(rdn_32, (rRq_1)rYB2, list, vD);
    }

    @Override
    public String id_break() {
        return this.id_class.id_volatile();
    }
}

