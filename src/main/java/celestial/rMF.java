/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.aI_2;
import celestial.au_3;
import celestial.dI_2;
import celestial.iO_2;
import celestial.iP_2;
import celestial.rLQ;
import celestial.rLR;
import celestial.rML;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rSg_1;
import celestial.rYB;
import celestial.rbY_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rkJ_2;
import celestial.rlc_3;
import celestial.rmE_2;
import celestial.rpO_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxJ_2;
import celestial.ryZ_2;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.tuple.Pair;

public class rMF
extends rbY_2
implements iP_2 {
    private static final rut_3<String> id_super = rmE_2.id_class(rMF.class, ruw_3.id_protected);
    private rLR id_this;
    private int id_else;
    private UUID id_synchronized;

    public rMF id_byte(rrEm_1 rrEm_12, au_3 au_32) {
        rMF rMF2 = aI_2.b.id_class(rrEm_12);
        rMF2.id_class(this.id_class((rMF)au_32));
        return rMF2;
    }

    public rMF(aI_2<? extends rMF> aI_22, rYB rYB2) {
        super((aI_2<? extends rbY_2>)aI_22, rYB2);
    }

    public rML n() {
        return rML.id_class(((rmE_2)this.id_throws[49]).id_class(id_super));
    }

    private void id_class(rML rML2) {
        ((rmE_2)this.id_throws[49]).id_break(id_super, rML2.name);
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        return rRR2.id_byte(rfH_22.id_break()).id_class(xu_3.Bi) ? 10.0f : rRR2.id_native(rfH_22) - 0.5f;
    }

    private rML id_class(rMF rMF2) {
        rML rML2;
        rML rML3 = this.n();
        rML rML4 = rML3 == (rML2 = rMF2.n()) && ((Random)this.id_throws[40]).nextInt(1024) == 0 ? (rML3 == rML.BROWN ? rML.RED : rML.BROWN) : (((Random)this.id_throws[40]).nextBoolean() ? rML3 : rML2);
        return rML4;
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_byte(rrEm_12, au_32);
    }

    @Override
    public void id_class(rqL_2 rqL_22) {
        ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.GK, rqL_22, 1.0f, 1.0f);
        if (!((rYB)this.id_throws[7]).id_import()) {
            ((rrEm_1)((rYB)this.id_throws[7])).id_class(rLQ.id_return, this.rx(), this.id_byte(0.5), this.BO(), 1, 0.0, 0.0, 0.0, 0.0);
            this.PD();
            rbY_2 rbY_22 = aI_2.id_native.id_class((rYB)this.id_throws[7]);
            rbY_22.id_class(this.rx(), this.re(), this.BO(), ((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
            rbY_22.id_public(this.Ss());
            Float f = Float.valueOf(((Float)this.id_private[23]).floatValue());
            rbY_22.id_private[23] = f;
            if (this.Bk()) {
                rbY_22.id_break(this.rD());
                rbY_22.id_final(this.D());
            }
            if (this.O()) {
                rbY_22.b();
            }
            rbY_22.id_catch(this.rg());
            ((rYB)this.id_throws[7]).a_(rbY_22);
            for (int i = 0; i < 5; ++i) {
                ((rYB)this.id_throws[7]).a_(new rsE_2((rYB)this.id_throws[7], this.rx(), this.id_byte(1.0), this.BO(), new rdn_3(this.n().renderState.id_break())));
            }
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Type", this.n().name);
        if (this.id_this != null) {
            rcd_32.id_class("EffectId", (byte)rLR.id_class(this.id_this));
            rcd_32.id_break("EffectDuration", this.id_else);
        }
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, rSg_1 rSg_12) {
        UUID uUID = rSg_12.ro();
        if (!uUID.equals(this.id_synchronized)) {
            this.id_class(this.n() == rML.RED ? rML.BROWN : rML.RED);
            this.id_synchronized = uUID;
            this.id_class(rqn_3.Gg, 2.0f, 1.0f);
        }
    }

    @Override
    public boolean id_class() {
        return this.BM() && !this.n_();
    }

    @Override
    public /* synthetic */ rbY_2 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_byte(rrEm_12, au_32);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class(rML.id_class(rcd_32.id_native("Type")));
        if (rcd_32.id_byte("EffectId", 1)) {
            this.id_this = rLR.id_class(rcd_32.id_case("EffectId"));
        }
        if (rcd_32.id_byte("EffectDuration", 3)) {
            this.id_else = rcd_32.id_private("EffectDuration");
        }
    }

    public static boolean id_break(aI_2<rMF> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRg_12.id_byte(rfH_22.id_break()).id_class(xu_3.Bi) && rRg_12.id_class(rfH_22, 0) > 8;
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_33, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.OU && !this.n_()) {
            rdn_3 rdn_33;
            boolean bl = false;
            if (this.id_this != null) {
                bl = true;
                rdn_33 = new rdn_3(rdy_3.ke);
                rkJ_2.id_class(rdn_33, this.id_this, this.id_else);
                this.id_this = null;
                this.id_else = 0;
            } else {
                rdn_33 = new rdn_3(rdy_3.Oe);
            }
            rdn_3 rdn_34 = rpO_2.id_class(rdn_32, rhd_33, rdn_33, false);
            rhd_33.id_class(rpm_32, rdn_34);
            rqA_2 rqA_22 = bl ? rqn_3.Go : rqn_3.GY;
            this.id_class(rqA_22, 1.0f, 1.0f);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        if (rdn_32.id_break() == rdy_3.JJ && this.id_class()) {
            this.id_class(rqL_2.PLAYERS);
            if (!((rYB)this.id_throws[7]).id_continue) {
                rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        if (this.n() == rML.BROWN && rdn_32.id_break().id_class(rlc_3.id_void)) {
            if (this.id_this != null) {
                for (int i = 0; i < 2; ++i) {
                    ((rYB)this.id_throws[7]).id_class(rLQ.id_double, this.rx() + ((Random)this.id_throws[40]).nextDouble() / 2.0, this.id_byte(0.5), this.BO() + ((Random)this.id_throws[40]).nextDouble() / 2.0, 0.0, ((Random)this.id_throws[40]).nextDouble() / 5.0, 0.0);
                }
            } else {
                Optional<Pair<rLR, Integer>> optional = this.id_native(rdn_32);
                if (!optional.isPresent()) {
                    return ryZ_2.PASS;
                }
                Pair<rLR, Integer> pair = optional.get();
                if (!((rhx_3)rhd_33.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
                for (int i = 0; i < 4; ++i) {
                    ((rYB)this.id_throws[7]).id_class(rLQ.id_int, this.rx() + ((Random)this.id_throws[40]).nextDouble() / 2.0, this.id_byte(0.5), this.BO() + ((Random)this.id_throws[40]).nextDouble() / 2.0, 0.0, ((Random)this.id_throws[40]).nextDouble() / 5.0, 0.0);
                }
                this.id_this = (rLR)pair.getLeft();
                this.id_else = (Integer)pair.getRight();
                this.id_class(rqn_3.GR, 2.0f, 1.0f);
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_33, rpm_32);
    }

    private Optional<Pair<rLR, Integer>> id_native(rdn_3 rdn_32) {
        xd_3 xd_32;
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 instanceof rxJ_2 && (xd_32 = ((rxJ_2)rdb_32).id_catch()) instanceof dI_2) {
            dI_2 dI_22 = (dI_2)xd_32;
            return Optional.of(Pair.of((Object)dI_22.id_break(), (Object)dI_22.id_implements()));
        }
        return Optional.empty();
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, rML.RED.name);
    }
}

