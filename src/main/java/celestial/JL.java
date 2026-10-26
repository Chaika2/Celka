/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.iB_2;
import celestial.rHb_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rxL_2;
import celestial.ryO_2;
import celestial.xc_3;

public abstract class JL
extends dB_2 {
    private final rxL_2 id_volatile;

    protected JL(rxL_2 rxL_22, Jq_1 jq_1) {
        super(jq_1);
        this.id_volatile = rxL_22;
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        ryO_2 ryO_22 = rRq_12.id_class(rfH_22);
        return ryO_22 instanceof rHb_1 ? ((rHb_1)ryO_22).id_class(xc_32) : super.id_class(rRq_12, rfH_22, xc_32);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHb_1) {
            ((rHb_1)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHb_1(this.id_volatile);
    }

    @Override
    public boolean id_class() {
        return true;
    }

    public rxL_2 id_break() {
        return this.id_volatile;
    }
}

