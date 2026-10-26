/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.iO_2;
import celestial.rEi_1;
import celestial.rGP;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rRo_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfH_2;
import celestial.rrEr_1;
import java.util.Random;

public abstract class rGr_1
extends rEi_1 {
    private rfH_2 id_class;
    private boolean id_break;
    private boolean id_protected;

    protected rGr_1(aI_2<? extends rGr_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (iO_22 != iO_2.PATROL && iO_22 != iO_2.EVENT && iO_22 != iO_2.STRUCTURE && ((Random)this.id_throws[40]).nextFloat() < 0.06f && this.su()) {
            this.id_break = true;
        }
        if (this.sF()) {
            this.id_class(rXQ.HEAD, rrEr_1.id_new());
            this.id_class(rXQ.HEAD, 2.0f);
        }
        if (iO_22 == iO_2.PATROL) {
            this.id_protected = true;
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_class != null) {
            rcd_32.id_class("PatrolTarget", rco_3.id_class(this.id_class));
        }
        rcd_32.id_class("PatrolLeader", this.id_break);
        rcd_32.id_class("Patrolling", this.id_protected);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_throws("PatrolTarget")) {
            this.id_class = rco_3.id_break(rcd_32.id_int("PatrolTarget"));
        }
        this.id_break = rcd_32.id_new("PatrolLeader");
        this.id_protected = rcd_32.id_new("Patrolling");
    }

    public static boolean id_break(aI_2<? extends rGr_1> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRg_12.id_class(rRo_1.BLOCK, rfH_22) > 8 ? false : rGr_1.id_byte(aI_22, rRg_12, iO_22, rfH_22, random);
    }

    public boolean sv() {
        return this.id_class != null;
    }

    public void id_implements(rfH_2 rfH_22) {
        this.id_class = rfH_22;
        this.id_protected = true;
    }

    protected void id_return(boolean bl) {
        this.id_protected = bl;
    }

    @Override
    public boolean id_private(double d) {
        return !this.id_protected || d > 16384.0;
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(4, new rGP<rGr_1>(this, 0.7, 0.595));
    }

    public void id_synchronized(boolean bl) {
        this.id_break = bl;
        this.id_protected = true;
    }

    @Override
    public double Pv() {
        return -0.45;
    }

    public boolean sJ() {
        return true;
    }

    public void sL() {
        this.id_class = this.Bs().id_break(-500 + ((Random)this.id_throws[40]).nextInt(1000), 0, -500 + ((Random)this.id_throws[40]).nextInt(1000));
        this.id_protected = true;
    }

    public boolean su() {
        return true;
    }

    public rfH_2 sZ() {
        return this.id_class;
    }

    public boolean sF() {
        return this.id_break;
    }

    protected boolean sA() {
        return this.id_protected;
    }
}

