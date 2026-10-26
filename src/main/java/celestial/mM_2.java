/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.mO_2;
import celestial.mb_3;
import celestial.mh_3;
import celestial.rdn_3;
import celestial.rkw_3;

public class mM_2
extends mO_2 {
    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public mM_2(mb_3 mb_32, int n, int n2, rkw_3 rkw_32, boolean bl) {
        super(mb_32, n, n2, rkw_32, bl);
    }

    @Override
    protected void id_class(rkw_3<?> rkw_32) {
        rdn_3[] rdn_3Array = rkw_32.id_class().get(0).id_class();
        this.id_class.add(new mh_3(this, 10, 10, rdn_3Array));
    }
}

