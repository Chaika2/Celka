/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rpa_3;
import celestial.rqd_3;
import celestial.xc_3;
import celestial.xd_3;

public abstract class kE_2
extends xd_3 {
    public static final rCc_1 p = rCT.id_strictfp;

    protected kE_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(p, rqd_32.id_class(xc_32.id_byte(p)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(p)));
    }
}

