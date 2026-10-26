/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.aa_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iO_2;
import celestial.is_3;
import celestial.rBI;
import celestial.rBU;
import celestial.rBc_1;
import celestial.rEN;
import celestial.rEQ;
import celestial.rEW;
import celestial.rEd_1;
import celestial.rEk_1;
import celestial.rEz_1;
import celestial.rLA;
import celestial.rLC;
import celestial.rLp_1;
import celestial.rLw_1;
import celestial.rLy_1;
import celestial.rMZ;
import celestial.rON;
import celestial.rRO;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rbB_2;
import celestial.rbG_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhD_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rqA_2;
import celestial.rqM_2;
import celestial.rqn_3;
import celestial.rsy_3;
import celestial.rye_3;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class rEx_1
extends rbB_2
implements aa_3 {
    public boolean id_protected;
    protected final rLw_1 id_class;
    protected final rLA id_break;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return this.rT() ? rqn_3.Bs : rqn_3.BS;
    }

    public rEx_1(aI_2<? extends rEx_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rbB_2>)aI_22, rYB2);
        Float f = Float.valueOf(1.0f);
        this.id_throws[37] = f;
        this.id_native = new rEz_1(this);
        this.id_class(rLp_1.WATER, 0.0f);
        this.id_class = new rLw_1(this, rYB2);
        this.id_break = new rLA(this, rYB2);
    }

    public void id_this(boolean bl) {
        this.id_protected = bl;
    }

    @Override
    protected boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        if (rdn_33.id_break() == rdy_3.kK) {
            return false;
        }
        if (rdn_33.id_break() == rdy_3.kY) {
            if (rdn_32.id_break() == rdy_3.kY) {
                return rdn_32.id_catch() < rdn_33.id_catch();
            }
            return false;
        }
        return rdn_32.id_break() == rdy_3.kY ? true : super.id_class(rdn_32, rdn_33);
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        if ((double)((Random)this.id_throws[40]).nextFloat() > 0.9) {
            int n = ((Random)this.id_throws[40]).nextInt(16);
            if (n < 10) {
                this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.kY));
            } else {
                this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Xd));
            }
        }
    }

    @Override
    public boolean id_class(rRR rRR2) {
        return rRR2.id_protected(this);
    }

    public static /* synthetic */ boolean id_class(rEx_1 rEx_12) {
        return (Boolean)rEx_12.id_throws[20];
    }

    public static /* synthetic */ rLy_1 id_class(rEx_1 rEx_12, rLy_1 rLy_12) {
        rEx_12.id_final = rLy_12;
        return rEx_12.id_final;
    }

    public static boolean id_class(aI_2<rEx_1> aI_22, rRf_1 rRf_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        boolean bl;
        Optional<rqM_2<rYG>> optional = rRf_12.id_protected(rfH_22);
        boolean bl2 = bl = rRf_12.id_abstract() != rRO.PEACEFUL && rEx_1.id_class(rRf_12, rfH_22, random) && (iO_22 == iO_2.SPAWNER || rRf_12.id_break(rfH_22).id_class(rlG_2.id_break));
        if (!Objects.equals(optional, Optional.of(rYl_1.id_private)) && !Objects.equals(optional, Optional.of(rYl_1.id_native))) {
            return random.nextInt(40) == 0 && rEx_1.id_class(rRf_12, rfH_22) && bl;
        }
        return random.nextInt(15) == 0 && bl;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        aU_22 = super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        if (this.id_class(rXQ.OFFHAND).id_class() && ((Random)this.id_throws[40]).nextFloat() < 0.03f) {
            this.id_class(rXQ.OFFHAND, new rdn_3(rdy_3.kK));
            this.id_new[rXQ.OFFHAND.id_break()] = 2.0f;
        }
        return aU_22;
    }

    private static boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        return rfH_22.c_() < rRg_12.id_short() - 5;
    }

    @Override
    public void p() {
        if (!((rYB)this.id_throws[7]).id_continue) {
            if (this.id_try() && this.rT() && this.su()) {
                this.id_final = this.id_class;
                this.id_native(true);
            } else {
                this.id_final = this.id_break;
                this.id_native(false);
            }
        }
    }

    @Override
    protected boolean sd() {
        return false;
    }

    @Override
    public boolean u() {
        return !this.Py();
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        rhD_2 rhD_22 = new rhD_2((rYB)this.id_throws[7], (iB_2)this, new rdn_3(rdy_3.kY));
        double d = iB_22.rx() - this.rx();
        double d2 = iB_22.id_byte(0.3333333333333333) - rhD_22.re();
        double d3 = iB_22.BO() - this.BO();
        double d4 = rfU_2.id_class(d * d + d3 * d3);
        rhD_22.id_byte(d, d2 + d4 * (double)0.2f, d3, 1.6f, 14 - ((rYB)this.id_throws[7]).id_abstract().id_class() * 4);
        this.id_class(rqn_3.BE, 1.0f, 1.0f / (this.Sa().nextFloat() * 0.4f + 0.8f));
        ((rYB)this.id_throws[7]).a_(rhD_22);
    }

    @Override
    protected void id_throws() {
        this.id_package.id_class(1, new rEW(this, 1.0));
        this.id_package.id_class(2, new rEN(this, 1.0, 40, 10.0f));
        this.id_package.id_class(2, new rEd_1(this, 1.0, false));
        this.id_package.id_class(5, new rEk_1(this, 1.0));
        this.id_package.id_class(6, new rEQ(this, 1.0, ((rYB)this.id_throws[7]).id_short()));
        this.id_package.id_class(7, new rBU(this, 1.0));
        this.id_int.id_class(1, new rBc_1(this, rEx_1.class).id_class(rbG_2.class));
        this.id_int.id_class(2, new rBI<rhd_3>(this, rhd_3.class, 10, true, false, this::id_private));
        this.id_int.id_class(3, new rBI<rsy_3>((is_3)this, rsy_3.class, false));
        this.id_int.id_class(3, new rBI<rMZ>((is_3)this, rMZ.class, true));
        this.id_int.id_class(5, new rBI<rON>(this, rON.class, 10, true, false, rON.id_super));
    }

    @Override
    protected boolean L() {
        return false;
    }

    @Override
    protected rdn_3 sx() {
        return rdn_3.id_break;
    }

    protected boolean sk() {
        double d;
        rfH_2 rfH_22;
        rLC rLC2 = this.id_public().id_finally();
        return rLC2 != null && (rfH_22 = rLC2.id_volatile()) != null && (d = this.id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_())) < 4.0;
    }

    @Override
    protected rqA_2 id_static() {
        return this.rT() ? rqn_3.Br : rqn_3.Pi;
    }

    public boolean id_private(iB_2 iB_22) {
        if (iB_22 != null) {
            return !((rYB)this.id_throws[7]).id_strictfp() || iB_22.rT();
        }
        return false;
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        if (this.id_try() && this.rT() && this.su()) {
            this.id_class(0.01f, rjU_22);
            this.id_class(iG_2.SELF, this.rv());
            this.id_byte(this.rv().id_class(0.9));
        } else {
            super.id_private(rjU_22);
        }
    }

    @Override
    protected rqA_2 BB() {
        return rqn_3.Bb;
    }

    @Override
    protected rqA_2 Bt() {
        return this.rT() ? rqn_3.BB : rqn_3.BP;
    }

    @Override
    protected rqA_2 sJ() {
        return rqn_3.BG;
    }

    public boolean su() {
        if (this.id_protected) {
            return true;
        }
        iB_2 iB_22 = this.I_();
        return iB_22 != null && iB_22.rT();
    }
}

