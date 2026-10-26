/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdO_2;
import celestial.rhd_3;
import celestial.rxJ_2;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class rdK_2
extends rxJ_2 {
    @Override
    public xc_3 id_byte(rxx_3 rxx_32) {
        rhd_3 rhd_32 = rxx_32.id_final();
        return rhd_32 != null && !rhd_32.sU() ? null : super.id_byte(rxx_32);
    }

    public rdK_2(xd_3 xd_32, rdO_2 rdO_22) {
        super(xd_32, rdO_22);
    }
}

