/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.am_3;
import celestial.an_3;
import celestial.iO_2;
import celestial.rBY;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rhM_2;
import celestial.rhP_2;
import celestial.rhd_3;
import celestial.rsU_2;

public class rhb_3
extends rhP_2 {
    private int id_try = 47999;

    public rhb_3(aI_2<? extends rhb_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rhP_2>)aI_22, rYB2);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (iO_22 == iO_2.EVENT) {
            this.e_(0);
        }
        if (aU_22 == null) {
            aU_22 = new am_3(false);
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("DespawnDelay", this.id_try);
    }

    @Override
    protected rhP_2 si() {
        return aI_2.R.id_class((rYB)this.id_throws[7]);
    }

    @Override
    public void id_default() {
        super.id_default();
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.Es();
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("DespawnDelay", 99)) {
            this.id_try = rcd_32.id_private("DespawnDelay");
        }
    }

    @Override
    protected void id_catch(rhd_3 rhd_32) {
        an_3 an_32 = this.N();
        if (!(an_32 instanceof rsU_2)) {
            super.id_catch(rhd_32);
        }
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(1, new rBY(this, 2.0));
        this.id_int.id_class(1, new rhM_2(this, this));
    }

    private boolean EG() {
        return this.N() instanceof rsU_2;
    }

    private boolean Eb() {
        return this.z() && !this.EG();
    }

    private void Es() {
        if (this.EE()) {
            int n = this.id_try = this.EG() ? ((rsU_2)this.N()).sW() - 1 : this.id_try - 1;
            if (this.id_try <= 0) {
                this.id_class(true, false);
                this.PD();
            }
        }
    }

    @Override
    public boolean sK() {
        return true;
    }

    private boolean EE() {
        return !this.sm() && !this.Eb() && !this.Pq();
    }
}

