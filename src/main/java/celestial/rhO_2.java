/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.au_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rOD;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.ryZ_2;
import celestial.rye_3;

public class rhO_2
extends rOD {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        super.id_byte(rye_32);
        return rqn_3.WU;
    }

    public rhO_2(aI_2<? extends rhO_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rOD>)aI_22, rYB2);
    }

    public static iz_3 n() {
        return rhO_2.sq().id_class(iQ_2.id_class, 15.0).id_class(iQ_2.id_protected, 0.2f);
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.rE.id_class(rrEm_12);
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (!this.sm()) {
            return ryZ_2.PASS;
        }
        if (this.n_()) {
            return super.id_break(rhd_32, rpm_32);
        }
        if (rhd_32.sN()) {
            this.id_case(rhd_32);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        if (this.BP()) {
            return super.id_break(rhd_32, rpm_32);
        }
        if (!rdn_32.id_class()) {
            if (rdn_32.id_break() == rdy_3.hK && !this.id_byte()) {
                this.id_case(rhd_32);
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            ryZ_2 ryZ_22 = rdn_32.id_class(rhd_32, (iB_2)this, rpm_32);
            if (ryZ_22.id_class()) {
                return ryZ_22;
            }
        }
        this.id_catch(rhd_32);
        return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
    }

    @Override
    protected void L() {
        this.id_byte(iQ_2.id_volatile).id_class(this.sg());
    }

    @Override
    protected rqA_2 id_static() {
        super.id_static();
        return rqn_3.WK;
    }

    @Override
    protected rqA_2 Bt() {
        super.Bt();
        return rqn_3.WD;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_break;
    }

    @Override
    protected void su() {
    }
}

