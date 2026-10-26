/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Oo_1;
import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.eA_2;
import celestial.iO_2;
import celestial.rLD;
import celestial.rLY;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rVL;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbB_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfw_3;
import celestial.rhN_2;
import celestial.rha_3;
import celestial.rhd_3;
import celestial.rhi_3;
import celestial.rhx_3;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsC_2;
import celestial.rsT_2;
import celestial.rsp_3;
import celestial.rsq_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xb_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.Logger;

public class rbE_2
extends rbB_2
implements rha_3 {
    private static final rut_3<Boolean> id_class = rmE_2.id_class(rbE_2.class, ruw_3.id_implements);
    private static final rut_3<rsp_3> id_break = rmE_2.id_class(rbE_2.class, ruw_3.id_new);
    private int id_protected;
    private UUID id_super;
    private rcZ_2 id_this;
    private rcd_3 id_else;
    private int id_synchronized;

    private void id_byte(rrEm_1 rrEm_12) {
        rsq_3 rsq_32 = this.id_class(aI_2.D, false);
        Object object = rXQ.values();
        int n = ((rXQ[])object).length;
        for (int i = 0; i < n; ++i) {
            rXQ rXQ2 = object[i];
            rdn_3 rdn_32 = this.id_class(rXQ2);
            if (rdn_32.id_class()) continue;
            if (eA_2.id_protected(rdn_32)) {
                rsq_32.id_class(rXQ2.id_break() + 300, rdn_32);
                continue;
            }
            double d = this.id_throws(rXQ2);
            if (!(d > 1.0)) continue;
            this.a_(rdn_32);
        }
        rsq_32.id_class(this.su());
        if (this.id_this != null) {
            rsq_32.id_class(this.id_this);
        }
        if (this.id_else != null) {
            rsq_32.id_break(new rdf_3(this.id_else));
        }
        rsq_32.id_else(this.id_synchronized);
        rsq_32.id_class(rrEm_12, rrEm_12.id_throws(rsq_32.Bs()), iO_2.CONVERSION, (aU_2)null, (rcd_3)null);
        if (this.id_super != null && (object = rrEm_12.id_class(this.id_super)) instanceof rhN_2) {
            Oo_1.id_continue.id_class((rhN_2)object, this, rsq_32);
            rrEm_12.id_class(rsC_2.id_class, (an_3)object, rsq_32);
        }
        rsq_32.id_break(new rLY(rLD.id_implements, 200, 0));
        if (!this.BF()) {
            rrEm_12.id_class((rhd_3)null, 1027, this.Bs(), 0);
        }
    }

    @Override
    public rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.zM;
    }

    public rbE_2(aI_2<? extends rbE_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rbB_2>)aI_22, rYB2);
        this.id_class(this.su().id_class(rVL.J.id_class((Random)this.id_throws[40])));
    }

    @Override
    public void id_this() {
        if (!((rYB)this.id_throws[7]).id_continue && this.BM() && this.sZ()) {
            int n = this.sv();
            this.id_protected -= n;
            if (this.id_protected <= 0) {
                this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
            }
        }
        super.id_this();
    }

    public void id_class(int n) {
        this.id_synchronized = n;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rsp_3.id_class.encodeStart((DynamicOps)rcf_3.id_class, (Object)this.su()).resultOrPartial(arg_0 -> ((Logger)((Logger)id_case[0])).error(arg_0)).ifPresent(rcZ_22 -> rcd_32.id_class("VillagerData", (rcZ_2)rcZ_22));
        if (this.id_else != null) {
            rcd_32.id_class("Offers", this.id_else);
        }
        if (this.id_this != null) {
            rcd_32.id_class("Gossips", this.id_this);
        }
        rcd_32.id_break("ConversionTime", this.sZ() ? this.id_protected : -1);
        if (this.id_super != null) {
            rcd_32.id_class("ConversionPlayer", this.id_super);
        }
        rcd_32.id_break("Xp", this.id_synchronized);
    }

    @Override
    public void id_class(byte by) {
        if (by == 16) {
            if (!this.BF()) {
                ((rYB)this.id_throws[7]).id_class(this.rx(), this.rH(), this.BO(), rqn_3.zG, this.Pr(), 1.0f + ((Random)this.id_throws[40]).nextFloat(), ((Random)this.id_throws[40]).nextFloat() * 0.7f + 0.3f, false);
            }
        } else {
            super.id_class(by);
        }
    }

    public void id_class(rcZ_2 rcZ_22) {
        this.id_this = rcZ_22;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_class(this.su().id_class(rhi_3.id_class(rRf_12.id_protected(this.Bs()))));
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    public void id_class(rsp_3 rsp_32) {
        rsp_3 rsp_33 = this.su();
        if (rsp_33.id_break() != rsp_32.id_break()) {
            this.id_else = null;
        }
        ((rmE_2)this.id_throws[49]).id_break(id_break, rsp_32);
    }

    private void id_class(UUID uUID, int n) {
        this.id_super = uUID;
        this.id_protected = n;
        this.BQ().id_break(id_class, true);
        this.id_protected(rLD.id_continue);
        this.id_break(new rLY(rLD.id_throws, n, Math.min(((rYB)this.id_throws[7]).id_abstract().id_class() - 1, 0)));
        ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)16);
    }

    @Override
    protected boolean sd() {
        return false;
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.hy) {
            if (this.id_break(rLD.id_continue)) {
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
                if (!((rYB)this.id_throws[7]).id_continue) {
                    this.id_class(rhd_32.ro(), ((Random)this.id_throws[40]).nextInt(2401) + 3600);
                }
                return ryZ_2.SUCCESS;
            }
            return ryZ_2.CONSUME;
        }
        return super.id_break(rhd_32, rpm_32);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("VillagerData", 10)) {
            DataResult dataResult = rsp_3.id_class.parse(new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_32.id_byte("VillagerData")));
            dataResult.resultOrPartial(arg_0 -> ((Logger)((Logger)id_case[0])).error(arg_0)).ifPresent(this::id_class);
        }
        if (rcd_32.id_byte("Offers", 10)) {
            this.id_else = rcd_32.id_int("Offers");
        }
        if (rcd_32.id_byte("Gossips", 10)) {
            this.id_this = rcd_32.id_protected("Gossips", 10);
        }
        if (rcd_32.id_byte("ConversionTime", 99) && rcd_32.id_private("ConversionTime") > -1) {
            this.id_class(rcd_32.id_break("ConversionPlayer") ? rcd_32.id_class("ConversionPlayer") : null, rcd_32.id_private("ConversionTime"));
        }
        if (rcd_32.id_byte("Xp", 3)) {
            this.id_synchronized = rcd_32.id_private("Xp");
        }
    }

    @Override
    protected rdn_3 sx() {
        return rdn_3.id_break;
    }

    private int sv() {
        int n = 1;
        if (((Random)this.id_throws[40]).nextFloat() < 0.01f) {
            int n2 = 0;
            rfw_3 rfw_32 = new rfw_3();
            for (int i = (int)this.rx() - 4; i < (int)this.rx() + 4 && n2 < 14; ++i) {
                for (int j = (int)this.re() - 4; j < (int)this.re() + 4 && n2 < 14; ++j) {
                    for (int k = (int)this.BO() - 4; k < (int)this.BO() + 4 && n2 < 14; ++k) {
                        xd_3 xd_32 = ((rYB)this.id_throws[7]).id_byte(rfw_32.id_class(i, j, k)).id_break();
                        if (xd_32 != xu_3.Bf && !(xd_32 instanceof xb_3)) continue;
                        if (((Random)this.id_throws[40]).nextFloat() < 0.3f) {
                            ++n;
                        }
                        ++n2;
                    }
                }
            }
        }
        return n;
    }

    public void id_catch(rcd_3 rcd_32) {
        this.id_else = rcd_32;
    }

    @Override
    public rqA_2 id_static() {
        return rqn_3.zs;
    }

    @Override
    public boolean id_private(double d) {
        return !this.sZ() && this.id_synchronized == 0;
    }

    @Override
    public rqA_2 Bt() {
        return rqn_3.zb;
    }

    @Override
    public rqA_2 sJ() {
        return rqn_3.zO;
    }

    @Override
    protected float SN() {
        return this.n_() ? (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 2.0f : (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f;
    }

    @Override
    public rsp_3 su() {
        return ((rmE_2)this.id_throws[49]).id_class(id_break);
    }

    public boolean sZ() {
        return this.BQ().id_class(id_class);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, false);
        ((rmE_2)this.id_throws[49]).id_class(id_break, new rsp_3(rhi_3.id_byte, rsT_2.id_class, 1));
    }
}

