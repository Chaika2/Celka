/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gD_2;
import celestial.gK_2;
import celestial.go_3;
import celestial.rcd_3;
import celestial.rnW_2;
import celestial.rqO_2;

public class gU_2
extends gK_2<rnW_2, gD_2> {
    public gU_2() {
        super(new rqO_2("function"), gD_2.class);
    }

    @Override
    public /* synthetic */ go_3 id_class(rcd_3 rcd_32) {
        return this.id_break(rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32, gD_2 gD_22) {
        rcd_32.id_class("Name", gD_22.id_class.toString());
    }

    public gD_2 id_break(rcd_3 rcd_32) {
        rqO_2 rqO_22 = new rqO_2(rcd_32.id_native("Name"));
        return new gD_2(rqO_22);
    }
}

