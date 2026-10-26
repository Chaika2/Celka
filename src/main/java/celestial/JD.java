/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Qr_1;
import celestial.dB_2;
import celestial.kd_3;
import celestial.rCN;
import celestial.rCT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rxA_2;
import celestial.ryO_2;
import celestial.ryS_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;

public abstract class JD
extends dB_2
implements kd_3 {
    public static final rCN id_volatile = rCT.id_throw;
    protected static final rjC_2 id_final = xd_3.id_class(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    private final Qr_1 id_package;

    protected JD(Jq_1 jq_1, Qr_1 qr_1) {
        super(jq_1);
        this.id_package = qr_1;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new ryS_2();
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        boolean bl;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        boolean bl2 = bl = rdn_32.id_break() instanceof rxA_2 && ((rhx_3)rhd_32.id_implements[18]).id_throws;
        if (rYB2.id_continue) {
            return bl ? ryZ_2.SUCCESS : ryZ_2.CONSUME;
        }
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof ryS_2) {
            boolean bl3;
            ryS_2 ryS_22 = (ryS_2)ryO_22;
            if (bl && (bl3 = ryS_22.id_class(((rxA_2)rdn_32.id_break()).id_byte())) && !rhd_32.id_implements()) {
                rdn_32.id_catch(1);
            }
            return ryS_22.id_break(rhd_32) ? ryZ_2.SUCCESS : ryZ_2.PASS;
        }
        return ryZ_2.PASS;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    @Override
    public boolean id_class() {
        return true;
    }

    public Qr_1 id_break() {
        return this.id_package;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }
}

