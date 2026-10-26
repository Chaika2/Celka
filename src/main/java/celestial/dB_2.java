/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kx_3;
import celestial.rJZ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;

public abstract class dB_2
extends xd_3
implements kx_3 {
    protected dB_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        return ryO_22 instanceof rJZ ? (rJZ)((Object)ryO_22) : null;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, int n, int n2) {
        super.id_class(xc_32, rYB2, rfH_22, n, n2);
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        return ryO_22 == null ? false : ryO_22.a_(n, n2);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.INVISIBLE;
    }
}

