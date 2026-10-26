/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.JU;
import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.eA_2;
import celestial.gm_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.id_3;
import celestial.ih_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.rBW;
import celestial.rBz_1;
import celestial.rEB;
import celestial.rEK;
import celestial.rEi_1;
import celestial.rLA;
import celestial.rLQ;
import celestial.rLp_1;
import celestial.rLy_1;
import celestial.rPR;
import celestial.rPY;
import celestial.rPf_1;
import celestial.rPg_1;
import celestial.rRO;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rSK;
import celestial.rXN;
import celestial.rXQ;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcu_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rkB_2;
import celestial.rkO_2;
import celestial.rkQ_2;
import celestial.rkx_3;
import celestial.rlb_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpZ_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.rrEm_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.rsE_2;
import celestial.rsM_2;
import celestial.rsS_2;
import celestial.ruP_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rvA_2;
import celestial.rxJ_2;
import celestial.rxM_2;
import celestial.rxQ_2;
import celestial.rxS_2;
import celestial.rxm_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.rzP_2;
import celestial.xu_3;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public abstract class is_3
extends iB_2 {
    private static final rut_3<Byte> id_class = rmE_2.id_class(is_3.class, ruw_3.id_class);
    public int id_implements;
    protected int id_finally;
    protected rPR id_extends;
    protected rPY id_native;
    protected rPg_1 id_volatile;
    private final rPf_1 id_break;
    protected rLy_1 id_final;
    protected final rBz_1 id_package;
    protected final rBz_1 id_int;
    private iB_2 id_protected;
    private final ih_3 id_super;
    private final rqs_3<rdn_3> id_this = rqs_3.id_class(2, rdn_3.id_break);
    protected final float[] id_new = new float[2];
    private final rqs_3<rdn_3> id_else = rqs_3.id_class(4, rdn_3.id_break);
    protected final float[] id_continue = new float[4];
    private boolean id_synchronized;
    private boolean id_return;
    private final Map<rLp_1, Float> id_public = Maps.newEnumMap(rLp_1.class);
    private rqO_2 id_goto;
    private long id_while;
    private an_3 id_try;
    private int id_instanceof;
    private rcd_3 id_throw;
    private rfH_2 id_interface = rfH_2.id_protected;
    private float id_char = -1.0f;

    protected boolean id_boolean() {
        return false;
    }

    public int id_char() {
        return 80;
    }

    private ryZ_2 id_byte(rhd_3 rhd_32, rpm_3 rpm_32) {
        Object object;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.df && this.id_protected(rhd_32)) {
            this.id_break((an_3)rhd_32, true);
            rdn_32.id_catch(1);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        if (rdn_32.id_break() == rdy_3.dj && ((ryZ_2)((Object)(object = rdn_32.id_class(rhd_32, (iB_2)this, rpm_32)))).id_class()) {
            return object;
        }
        if (rdn_32.id_break() instanceof rkO_2) {
            if ((rYB)this.id_throws[7] instanceof rrEm_1) {
                object = (rkO_2)rdn_32.id_break();
                Optional<is_3> optional = ((rkO_2)object).id_class(rhd_32, this, this.BC(), (rrEm_1)((rYB)this.id_throws[7]), this.Ps(), rdn_32);
                optional.ifPresent(is_32 -> this.id_class(rhd_32, (is_3)is_32));
                return optional.isPresent() ? ryZ_2.SUCCESS : ryZ_2.PASS;
            }
            return ryZ_2.CONSUME;
        }
        return ryZ_2.PASS;
    }

    public void id_byte(boolean bl) {
        this.id_synchronized = bl;
    }

    public void id_byte(iB_2 iB_22) {
        this.id_protected = iB_22;
        rrxr_3.id_class(rrxr_3.rE, this, iB_22);
    }

    @Override
    protected int id_byte(rhd_3 rhd_32) {
        if (this.id_finally > 0) {
            int n;
            int n2 = this.id_finally;
            for (n = 0; n < this.id_else.size(); ++n) {
                if (this.id_else.get(n).id_class() || !(this.id_continue[n] <= 1.0f)) continue;
                n2 += 1 + ((Random)this.id_throws[40]).nextInt(3);
            }
            for (n = 0; n < this.id_this.size(); ++n) {
                if (this.id_this.get(n).id_class() || !(this.id_new[n] <= 1.0f)) continue;
                n2 += 1 + ((Random)this.id_throws[40]).nextInt(3);
            }
            return n2;
        }
        return this.id_finally;
    }

    @Override
    protected void id_byte(rlb_3<rXs_1> rlb_32) {
        if (this.id_public().id_new()) {
            super.id_byte(rlb_32);
        } else {
            this.id_byte(this.rv().id_break(0.0, 0.3, 0.0));
        }
    }

    public static boolean id_byte(rXQ rXQ2, rdn_3 rdn_32) {
        rXQ rXQ3 = is_3.id_finally(rdn_32);
        return rXQ3 == rXQ2 || rXQ3 == rXQ.MAINHAND && rXQ2 == rXQ.OFFHAND || rXQ3 == rXQ.OFFHAND && rXQ2 == rXQ.MAINHAND;
    }

    private float id_byte(float f, float f2, float f3) {
        float f4 = rfU_2.id_catch(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    private List id_byte(rYB rYB2) {
        rYB rYB3 = this.e();
        if (rYB3 instanceof gm_3) {
            gm_3 gm_32 = (gm_3)rYB3;
            return gm_32.id_continue();
        }
        if (rYB3 instanceof rrEm_1) {
            rrEm_1 rrEm_12 = (rrEm_1)rYB3;
            return rrEm_12.id_continue();
        }
        return null;
    }

    protected boolean id_int() {
        return false;
    }

    public void id_long() {
        rqA_2 rqA_22 = this.id_static();
        if (rqA_22 != null) {
            this.id_class(rqA_22, this.Si(), this.SN());
        }
    }

    public void id_float() {
        if (((rYB)this.id_throws[7]).id_continue) {
            for (int i = 0; i < 20; ++i) {
                double d = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                double d4 = 10.0;
                ((rYB)this.id_throws[7]).id_class(rLQ.id_boolean, this.id_catch(1.0) - d * 10.0, this.Ph() - d2 * 10.0, this.id_protected(1.0) - d3 * 10.0, d, d2, d3);
            }
        } else {
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)20);
        }
    }

    protected void id_double() {
    }

    protected is_3(aI_2<? extends is_3> aI_22, rYB rYB2) {
        super((aI_2<? extends iB_2>)aI_22, rYB2);
        this.id_package = new rBz_1();
        this.id_int = new rBz_1();
        this.id_extends = new rPR(this);
        this.id_native = new rPY(this);
        this.id_volatile = new rPg_1(this);
        this.id_break = this.id_new();
        this.id_final = this.id_break(rYB2);
        this.id_super = new ih_3(this);
        Arrays.fill(this.id_continue, 0.085f);
        Arrays.fill(this.id_new, 0.085f);
        if (rYB2 != null && !rYB2.id_continue) {
            this.id_final();
        }
    }

    protected boolean F() {
        if (((rYB)this.id_throws[7]).id_strictfp() && !((rYB)this.id_throws[7]).id_continue) {
            rfH_2 rfH_22;
            float f = this.rX();
            rfH_2 rfH_23 = rfH_22 = this.ra() instanceof rSK ? new rfH_2(this.rx(), Math.round(this.re()), this.BO()).id_final() : new rfH_2(this.rx(), Math.round(this.re()), this.BO());
            if (f > 0.5f && ((Random)this.id_throws[40]).nextFloat() * 30.0f < (f - 0.4f) * 2.0f && ((rYB)this.id_throws[7]).id_case(rfH_22)) {
                return true;
            }
        }
        return false;
    }

    public rfH_2 J() {
        return this.id_interface;
    }

    public int S() {
        return 75;
    }

    public boolean Z() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 2) != 0;
    }

    @Override
    public void id_this() {
        if (rrbb_3.rO() && this.n()) {
            this.sJ();
        } else {
            super.id_this();
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_private();
                if ((Integer)this.id_throws[41] % 5 == 0) {
                    this.id_void();
                }
            }
        }
    }

    public void b() {
        this.id_return = true;
    }

    public int s() {
        return 10;
    }

    public boolean c() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
    }

    private boolean n() {
        double d;
        if (this.n_()) {
            return false;
        }
        if ((Integer)this.id_private[10] > 0) {
            return false;
        }
        if ((Integer)this.id_throws[41] < 20) {
            return false;
        }
        List list = this.id_byte(this.e());
        if (list == null) {
            return false;
        }
        if (list.size() != 1) {
            return false;
        }
        an_3 an_32 = (an_3)list.get(0);
        double d2 = Math.max(Math.abs(this.rx() - an_32.rx()) - 16.0, 0.0);
        double d3 = d2 * d2 + (d = Math.max(Math.abs(this.BO() - an_32.BO()) - 16.0, 0.0)) * d;
        return !this.id_class(d3);
    }

    public float d() {
        return this.id_char;
    }

    @Override
    protected void id_class(rye_3 rye_32, int n, boolean bl) {
        super.id_class(rye_32, n, bl);
        for (rXQ rXQ2 : rXQ.values()) {
            boolean bl2;
            rdn_3 rdn_32 = this.id_class(rXQ2);
            float f = this.id_throws(rXQ2);
            boolean bl3 = bl2 = f > 1.0f;
            if (rdn_32.id_class() || eA_2.id_throws(rdn_32) || !bl && !bl2 || !(Math.max(((Random)this.id_throws[40]).nextFloat() - (float)n * 0.01f, 0.0f) < f)) continue;
            if (!bl2 && rdn_32.id_throws()) {
                rdn_32.id_break(rdn_32.id_private() - ((Random)this.id_throws[40]).nextInt(1 + ((Random)this.id_throws[40]).nextInt(Math.max(rdn_32.id_private() - 3, 1))));
            }
            this.a_(rdn_32);
            this.id_class(rXQ2, rdn_3.id_break);
        }
    }

    protected void id_class(rRh_1 rRh_12) {
        if (((Random)this.id_throws[40]).nextFloat() < 0.15f * rRh_12.id_byte()) {
            float f;
            int n = ((Random)this.id_throws[40]).nextInt(2);
            float f2 = f = ((rYB)this.id_throws[7]).id_abstract() == rRO.HARD ? 0.1f : 0.25f;
            if (((Random)this.id_throws[40]).nextFloat() < 0.095f) {
                ++n;
            }
            if (((Random)this.id_throws[40]).nextFloat() < 0.095f) {
                ++n;
            }
            if (((Random)this.id_throws[40]).nextFloat() < 0.095f) {
                ++n;
            }
            boolean bl = true;
            for (rXQ rXQ2 : rXQ.values()) {
                rdb_3 rdb_32;
                if (rXQ2.id_class() != rXN.ARMOR) continue;
                rdn_3 rdn_32 = this.id_class(rXQ2);
                if (!bl && ((Random)this.id_throws[40]).nextFloat() < f) break;
                bl = false;
                if (!rdn_32.id_class() || (rdb_32 = is_3.id_class(rXQ2, n)) == null) continue;
                this.id_class(rXQ2, new rdn_3(rdb_32));
            }
        }
    }

    public static rdb_3 id_class(rXQ rXQ2, int n) {
        switch (rXQ2) {
            case HEAD: {
                if (n == 0) {
                    return rdy_3.hs;
                }
                if (n == 1) {
                    return rdy_3.hc;
                }
                if (n == 2) {
                    return rdy_3.hM;
                }
                if (n == 3) {
                    return rdy_3.hJ;
                }
                if (n == 4) {
                    return rdy_3.hW;
                }
            }
            case CHEST: {
                if (n == 0) {
                    return rdy_3.hE;
                }
                if (n == 1) {
                    return rdy_3.hu;
                }
                if (n == 2) {
                    return rdy_3.hO;
                }
                if (n == 3) {
                    return rdy_3.hx;
                }
                if (n == 4) {
                    return rdy_3.hz;
                }
            }
            case LEGS: {
                if (n == 0) {
                    return rdy_3.hG;
                }
                if (n == 1) {
                    return rdy_3.hm;
                }
                if (n == 2) {
                    return rdy_3.hh;
                }
                if (n == 3) {
                    return rdy_3.hd;
                }
                if (n == 4) {
                    return rdy_3.hQ;
                }
            }
            case FEET: {
                if (n == 0) {
                    return rdy_3.hb;
                }
                if (n == 1) {
                    return rdy_3.hZ;
                }
                if (n == 2) {
                    return rdy_3.hX;
                }
                if (n == 3) {
                    return rdy_3.hk;
                }
                if (n != 4) break;
                return rdy_3.hN;
            }
        }
        return null;
    }

    protected void id_class(float f, rXQ rXQ2) {
        rdn_3 rdn_32 = this.id_class(rXQ2);
        if (!rdn_32.id_class() && ((Random)this.id_throws[40]).nextFloat() < 0.5f * f) {
            this.id_class(rXQ2, eA_2.id_class((Random)this.id_throws[40], rdn_32, (int)(5.0f + f * (float)((Random)this.id_throws[40]).nextInt(18)), false));
        }
    }

    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_byte(iQ_2.id_break).id_byte(new ix_3("Random spawn bonus", ((Random)this.id_throws[40]).nextGaussian() * 0.05, id_3.MULTIPLY_BASE));
        if (((Random)this.id_throws[40]).nextFloat() < 0.05f) {
            this.id_throws(true);
        } else {
            this.id_throws(false);
        }
        return aU_22;
    }

    public boolean id_class(rRR rRR2) {
        return !rRR2.id_protected(this.rN()) && rRR2.id_protected(this);
    }

    public boolean id_class(rRg_1 rRg_12, iO_2 iO_22) {
        return true;
    }

    public static boolean id_class(aI_2<? extends is_3> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        rfH_2 rfH_23 = rfH_22.id_break();
        return iO_22 == iO_2.SPAWNER || rRg_12.id_byte(rfH_23).id_class((rRq_1)rRg_12, rfH_23, aI_22);
    }

    public void id_class(an_3 an_32, float f, float f2) {
        double d;
        double d2 = an_32.rx() - this.rx();
        double d3 = an_32.BO() - this.BO();
        if (an_32 instanceof iB_2) {
            iB_2 iB_22 = (iB_2)an_32;
            d = iB_22.rH() - this.rH();
        } else {
            d = (an_32.rN().id_break + an_32.rN().id_throws) / 2.0 - this.rH();
        }
        double d4 = rfU_2.id_class(d2 * d2 + d3 * d3);
        float f3 = (float)(rfU_2.id_protected(d3, d2) * 57.2957763671875) - 90.0f;
        float f4 = (float)(-(rfU_2.id_protected(d, d4) * 57.2957763671875));
        Float f5 = Float.valueOf(this.id_byte(((Float)this.id_throws[16]).floatValue(), f4, f2));
        this.id_throws[16] = f5;
        Float f6 = Float.valueOf(this.id_byte(((Float)this.id_throws[15]).floatValue(), f3, f));
        this.id_throws[15] = f6;
    }

    @Override
    public rdn_3 id_class(rXQ rXQ2) {
        switch (rXQ2.id_class()) {
            case HAND: {
                return this.id_this.get(rXQ2.id_break());
            }
            case ARMOR: {
                return this.id_else.get(rXQ2.id_break());
            }
        }
        return rdn_3.id_break;
    }

    @Override
    public void id_class(rXQ rXQ2, rdn_3 rdn_32) {
        switch (rXQ2.id_class()) {
            case HAND: {
                this.id_this.set(rXQ2.id_break(), rdn_32);
                break;
            }
            case ARMOR: {
                this.id_else.set(rXQ2.id_break(), rdn_32);
            }
        }
    }

    public <T extends is_3> T id_class(aI_2<T> aI_22, boolean bl) {
        if (((Boolean)this.id_throws[27]).booleanValue()) {
            return (T)((is_3)null);
        }
        is_3 is_32 = (is_3)aI_22.id_class((rYB)this.id_throws[7]);
        is_32.id_native(this);
        is_32.id_class(this.n_());
        is_32.id_protected(this.c());
        if (this.Bk()) {
            is_32.id_break(this.rD());
            is_32.id_final(this.D());
        }
        if (this.O()) {
            is_32.b();
        }
        is_32.id_catch(this.rg());
        if (bl) {
            is_32.id_byte(this.M());
            for (rXQ rXQ2 : rXQ.values()) {
                rdn_3 rdn_32 = this.id_class(rXQ2);
                if (rdn_32.id_class()) continue;
                is_32.id_class(rXQ2, rdn_32.id_implements());
                is_32.id_class(rXQ2, this.id_throws(rXQ2));
                rdn_32.id_throws(0);
            }
        }
        ((rYB)this.id_throws[7]).a_(is_32);
        if (this.Pm()) {
            an_3 an_32 = this.ra();
            this.BH();
            is_32.id_class(an_32, true);
        }
        this.PD();
        return (T)is_32;
    }

    public void id_class(boolean bl, boolean bl2) {
        if (this.id_try != null) {
            Boolean bl3 = false;
            this.id_throws[6] = bl3;
            if (!(this.id_try instanceof rhd_3)) {
                Boolean bl4 = false;
                this.id_try.id_throws[6] = bl4;
            }
            this.id_try = null;
            this.id_throw = null;
            if (!((rYB)this.id_throws[7]).id_continue && bl2) {
                this.id_class((rpL_2)rdy_3.df);
            }
            if (!((rYB)this.id_throws[7]).id_continue && bl && (rYB)this.id_throws[7] instanceof rrEm_1) {
                ((rrEm_1)((rYB)this.id_throws[7])).id_else().id_break(this, new rvA_2(this, null));
            }
        }
    }

    @Override
    public boolean id_class(an_3 an_32, boolean bl) {
        boolean bl2 = super.id_class(an_32, bl);
        if (bl2 && this.z()) {
            this.id_class(true, true);
        }
        return bl2;
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32) {
        rXQ rXQ2;
        if (n == 98) {
            rXQ2 = rXQ.MAINHAND;
        } else if (n == 99) {
            rXQ2 = rXQ.OFFHAND;
        } else if (n == 100 + rXQ.HEAD.id_break()) {
            rXQ2 = rXQ.HEAD;
        } else if (n == 100 + rXQ.CHEST.id_break()) {
            rXQ2 = rXQ.CHEST;
        } else if (n == 100 + rXQ.LEGS.id_break()) {
            rXQ2 = rXQ.LEGS;
        } else {
            if (n != 100 + rXQ.FEET.id_break()) {
                return false;
            }
            rXQ2 = rXQ.FEET;
        }
        if (!rdn_32.id_class() && !is_3.id_byte(rXQ2, rdn_32) && rXQ2 != rXQ.HEAD) {
            return false;
        }
        this.id_class(rXQ2, rdn_32);
        return true;
    }

    public void id_class(boolean bl) {
    }

    private void id_class(rhd_3 rhd_32, rdn_3 rdn_32, rdn_3 rdn_33) {
        if (!rdn_32.id_class() && !rdn_33.id_class() && rdn_32.id_break() instanceof rxM_2 && rdn_33.id_break() == rdy_3.kN) {
            float f = 0.25f + (float)eA_2.id_case(this) * 0.05f;
            if (((Random)this.id_throws[40]).nextFloat() < f) {
                rhd_32.sK().id_class(rdy_3.kN, 100);
                ((rYB)this.id_throws[7]).id_class((an_3)rhd_32, (byte)30);
            }
        }
    }

    public void id_class(rXQ rXQ2, float f) {
        switch (rXQ2.id_class()) {
            case HAND: {
                this.id_new[rXQ2.id_break()] = f;
                break;
            }
            case ARMOR: {
                this.id_continue[rXQ2.id_break()] = f;
            }
        }
    }

    public void id_class(rLp_1 rLp_12, float f) {
        this.id_public.put(rLp_12, Float.valueOf(f));
    }

    @Override
    public final ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        if (!this.BM()) {
            return ryZ_2.PASS;
        }
        if (this.N() == rhd_32) {
            this.id_class(true, !((rhx_3)rhd_32.id_implements[18]).id_protected);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        ryZ_2 ryZ_22 = this.id_byte(rhd_32, rpm_32);
        if (ryZ_22.id_class()) {
            return ryZ_22;
        }
        ryZ_22 = this.id_break(rhd_32, rpm_32);
        return ryZ_22.id_class() ? ryZ_22 : super.id_class(rhd_32, rpm_32);
    }

    public float id_class(rLp_1 rLp_12) {
        is_3 is_32 = this.ra() instanceof is_3 && ((is_3)this.ra()).id_int() ? (is_3)this.ra() : this;
        Float f = is_32.id_public.get((Object)rLp_12);
        return f == null ? rLp_12.id_class() : f.floatValue();
    }

    protected void id_class(rhd_3 rhd_32, is_3 is_32) {
    }

    public void id_class(rfH_2 rfH_22, int n) {
        this.id_interface = rfH_22;
        this.id_char = n;
    }

    public boolean id_class(rkB_2 rkB_22) {
        return false;
    }

    @Override
    protected void id_class(rye_3 rye_32, boolean bl) {
        super.id_class(rye_32, bl);
        this.id_goto = null;
    }

    @Override
    protected rzP_2 id_class(boolean bl, rye_3 rye_32) {
        return super.id_class(bl, rye_32).id_class(this.id_while, (Random)this.id_throws[40]);
    }

    protected boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        if (rdn_33.id_class()) {
            return true;
        }
        if (rdn_32.id_break() instanceof rkx_3) {
            if (!(rdn_33.id_break() instanceof rkx_3)) {
                return true;
            }
            rkx_3 rkx_32 = (rkx_3)rdn_32.id_break();
            rkx_3 rkx_33 = (rkx_3)rdn_33.id_break();
            if (rkx_32.id_catch() != rkx_33.id_catch()) {
                return rkx_32.id_catch() > rkx_33.id_catch();
            }
            return this.id_break(rdn_32, rdn_33);
        }
        if (rdn_32.id_break() instanceof rxQ_2 && rdn_33.id_break() instanceof rxQ_2) {
            return this.id_break(rdn_32, rdn_33);
        }
        if (rdn_32.id_break() instanceof rxm_3 && rdn_33.id_break() instanceof rxm_3) {
            return this.id_break(rdn_32, rdn_33);
        }
        if (rdn_32.id_break() instanceof rxS_2) {
            if (eA_2.id_protected(rdn_33)) {
                return false;
            }
            if (!(rdn_33.id_break() instanceof rxS_2)) {
                return true;
            }
            rxS_2 rxS_22 = (rxS_2)rdn_32.id_break();
            rxS_2 rxS_23 = (rxS_2)rdn_33.id_break();
            if (rxS_22.id_catch() != rxS_23.id_catch()) {
                return rxS_22.id_catch() > rxS_23.id_catch();
            }
            if (rxS_22.id_private() != rxS_23.id_private()) {
                return rxS_22.id_private() > rxS_23.id_private();
            }
            return this.id_break(rdn_32, rdn_33);
        }
        if (rdn_32.id_break() instanceof rkQ_2) {
            if (rdn_33.id_break() instanceof rxJ_2) {
                return true;
            }
            if (rdn_33.id_break() instanceof rkQ_2) {
                rkQ_2 rkQ_22 = (rkQ_2)rdn_32.id_break();
                rkQ_2 rkQ_23 = (rkQ_2)rdn_33.id_break();
                if (rkQ_22.id_catch() != rkQ_23.id_catch()) {
                    return rkQ_22.id_catch() > rkQ_23.id_catch();
                }
                return this.id_break(rdn_32, rdn_33);
            }
        }
        return false;
    }

    @Override
    public boolean id_class(aI_2<?> aI_22) {
        return aI_22 != aI_2.id_interface;
    }

    @Override
    public void id_class(byte by) {
        if (by == 20) {
            this.id_float();
        } else {
            super.id_class(by);
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("CanPickUpLoot", this.M());
        rcd_32.id_class("PersistenceRequired", this.id_return);
        rcy_3 rcy_32 = new rcy_3();
        for (rdn_3 object22 : this.id_else) {
            rcd_3 rcd_33 = new rcd_3();
            if (!object22.id_class()) {
                object22.id_break(rcd_33);
            }
            rcy_32.add(rcd_33);
        }
        rcd_32.id_class("ArmorItems", rcy_32);
        rcy_3 rcy_33 = new rcy_3();
        for (rdn_3 rdn_32 : this.id_this) {
            rcd_3 rcd_34 = new rcd_3();
            if (!rdn_32.id_class()) {
                rdn_32.id_break(rcd_34);
            }
            rcy_33.add(rcd_34);
        }
        rcd_32.id_class("HandItems", rcy_33);
        rcy_3 rcy_34 = new rcy_3();
        for (float f : this.id_continue) {
            rcy_34.add(rcu_3.id_class(f));
        }
        rcd_32.id_class("ArmorDropChances", rcy_34);
        rcy_3 rcy_35 = new rcy_3();
        for (float f : this.id_new) {
            rcy_35.add(rcu_3.id_class(f));
        }
        rcd_32.id_class("HandDropChances", rcy_35);
        if (this.id_try != null) {
            Object object = new rcd_3();
            if (this.id_try instanceof iB_2) {
                UUID uUID = this.id_try.ro();
                ((rcd_3)object).id_class("UUID", uUID);
            } else if (this.id_try instanceof rsS_2) {
                rfH_2 rfH_22 = ((rsS_2)this.id_try).id_implements();
                ((rcd_3)object).id_break("X", rfH_22.b_());
                ((rcd_3)object).id_break("Y", rfH_22.c_());
                ((rcd_3)object).id_break("Z", rfH_22.d_());
            }
            rcd_32.id_class("Leash", (rcZ_2)object);
        } else if (this.id_throw != null) {
            rcd_32.id_class("Leash", this.id_throw.id_catch());
        }
        rcd_32.id_class("LeftHanded", this.Z());
        if (this.id_goto != null) {
            rcd_32.id_class("DeathLootTable", this.id_goto.toString());
            if (this.id_while != 0L) {
                rcd_32.id_class("DeathLootTableSeed", this.id_while);
            }
        }
        if (this.c()) {
            rcd_32.id_class("NoAI", this.c());
        }
    }

    public boolean k() {
        return this.id_char != -1.0f;
    }

    @Override
    public void id_default() {
        super.id_default();
        boolean bl = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break);
        if (rrxr_3.g.id_byte()) {
            bl = rrxr_3.id_break(rrxr_3.g, (rYB)this.id_throws[7], this);
        }
        if (!((rYB)this.id_throws[7]).id_continue && this.M() && this.BM() && !((Boolean)this.id_private[32]).booleanValue() && bl) {
            for (rsE_2 rsE_22 : ((rYB)this.id_throws[7]).id_class(rsE_2.class, this.rN().id_byte(1.0, 0.0, 1.0))) {
                if (((Boolean)rsE_22.id_throws[27]).booleanValue() || rsE_22.id_protected().id_class() || rsE_22.id_package() || !this.id_implements(rsE_22.id_protected())) continue;
                this.id_break(rsE_22);
            }
        }
    }

    public boolean v() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 4) != 0;
    }

    protected rqO_2 id_short() {
        return super.By();
    }

    public boolean z() {
        return this.id_try != null;
    }

    protected void id_void() {
        boolean bl = !(this.rU() instanceof is_3);
        boolean bl2 = !(this.ra() instanceof rSK);
        this.id_package.id_class(rBW.MOVE, bl);
        this.id_package.id_class(rBW.JUMP, bl && bl2);
        this.id_package.id_class(rBW.LOOK, bl);
    }

    public int r() {
        return 40;
    }

    public an_3 N() {
        if (this.id_try == null && this.id_instanceof != 0 && ((rYB)this.id_throws[7]).id_continue) {
            this.id_try = ((rYB)this.id_throws[7]).id_break(this.id_instanceof);
        }
        return this.id_try;
    }

    public void id_break(an_3 an_32, boolean bl) {
        this.id_try = an_32;
        this.id_throw = null;
        Boolean bl2 = true;
        this.id_throws[6] = bl2;
        if (!(this.id_try instanceof rhd_3)) {
            Boolean bl3 = true;
            this.id_try.id_throws[6] = bl3;
        }
        if (!((rYB)this.id_throws[7]).id_continue && bl && (rYB)this.id_throws[7] instanceof rrEm_1) {
            ((rrEm_1)((rYB)this.id_throws[7])).id_else().id_break(this, new rvA_2(this, this.id_try));
        }
        if (this.Pm()) {
            this.BH();
        }
    }

    protected void id_break(rsE_2 rsE_22) {
        rdn_3 rdn_32 = rsE_22.id_protected();
        if (this.id_catch(rdn_32)) {
            this.id_class(rsE_22);
            this.id_class((an_3)rsE_22, rdn_32.id_char());
            rsE_22.PD();
        }
    }

    protected void id_break(rRh_1 rRh_12) {
        float f = rRh_12.id_byte();
        this.id_instanceof(f);
        for (rXQ rXQ2 : rXQ.values()) {
            if (rXQ2.id_class() != rXN.ARMOR) continue;
            this.id_class(f, rXQ2);
        }
    }

    @Override
    protected float id_break(float f, float f2, float f3) {
        this.id_break.id_class();
        return f2;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        int n;
        rcy_3 rcy_32;
        super.id_break(rcd_32);
        if (rcd_32.id_byte("CanPickUpLoot", 1)) {
            this.id_byte(rcd_32.id_new("CanPickUpLoot"));
        }
        this.id_return = rcd_32.id_new("PersistenceRequired");
        if (rcd_32.id_byte("ArmorItems", 9)) {
            rcy_32 = rcd_32.id_protected("ArmorItems", 10);
            for (n = 0; n < this.id_else.size(); ++n) {
                this.id_else.set(n, rdn_3.id_class(rcy_32.id_class(n)));
            }
        }
        if (rcd_32.id_byte("HandItems", 9)) {
            rcy_32 = rcd_32.id_protected("HandItems", 10);
            for (n = 0; n < this.id_this.size(); ++n) {
                this.id_this.set(n, rdn_3.id_class(rcy_32.id_class(n)));
            }
        }
        if (rcd_32.id_byte("ArmorDropChances", 9)) {
            rcy_32 = rcd_32.id_protected("ArmorDropChances", 5);
            for (n = 0; n < rcy_32.size(); ++n) {
                this.id_continue[n] = rcy_32.id_private(n);
            }
        }
        if (rcd_32.id_byte("HandDropChances", 9)) {
            rcy_32 = rcd_32.id_protected("HandDropChances", 5);
            for (n = 0; n < rcy_32.size(); ++n) {
                this.id_new[n] = rcy_32.id_private(n);
            }
        }
        if (rcd_32.id_byte("Leash", 10)) {
            this.id_throw = rcd_32.id_int("Leash");
        }
        this.id_throws(rcd_32.id_new("LeftHanded"));
        if (rcd_32.id_byte("DeathLootTable", 8)) {
            this.id_goto = new rqO_2(rcd_32.id_native("DeathLootTable"));
            this.id_while = rcd_32.id_implements("DeathLootTableSeed");
        }
        this.id_protected(rcd_32.id_new("NoAI"));
    }

    protected rLy_1 id_break(rYB rYB2) {
        return new rLA(this, rYB2);
    }

    protected void id_break(rXQ rXQ2, rdn_3 rdn_32) {
        this.id_class(rXQ2, rdn_32);
        this.id_protected(rXQ2);
        this.id_return = true;
    }

    public boolean id_break(rdn_3 rdn_32, rdn_3 rdn_33) {
        if (rdn_32.id_catch() >= rdn_33.id_catch() && (!rdn_32.id_final() || rdn_33.id_final())) {
            if (rdn_32.id_final() && rdn_33.id_final()) {
                return rdn_32.id_package().id_protected().stream().anyMatch(string -> !string.equals("Damage")) && !rdn_33.id_package().id_protected().stream().anyMatch(string -> !string.equals("Damage"));
            }
            return false;
        }
        return true;
    }

    public boolean id_break(rLp_1 rLp_12) {
        return rLp_12 != rLp_1.DANGER_FIRE && rLp_12 != rLp_1.DANGER_CACTUS && rLp_12 != rLp_1.DANGER_OTHER && rLp_12 != rLp_1.WALKABLE_DOOR;
    }

    protected ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        return ryZ_2.PASS;
    }

    public void id_throws(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_class);
        ((rmE_2)this.id_throws[49]).id_break(id_class, bl ? (byte)(by | 2) : (byte)(by & 0xFFFFFFFD));
    }

    @Override
    protected void id_throws(rye_3 rye_32) {
        this.id_implements();
        super.id_throws(rye_32);
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        return this.id_class(rXQ2).id_class() && this.M();
    }

    protected float id_throws(rXQ rXQ2) {
        return switch (rXQ2.id_class()) {
            case rXN.HAND -> this.id_new[rXQ2.id_break()];
            case rXN.ARMOR -> this.id_continue[rXQ2.id_break()];
            default -> 0.0f;
        };
    }

    private void L() {
        if (this.id_throw != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
            if (this.id_throw.id_break("UUID")) {
                UUID uUID = this.id_throw.id_class("UUID");
                an_3 an_32 = ((rrEm_1)((rYB)this.id_throws[7])).id_break(uUID);
                if (an_32 != null) {
                    this.id_break(an_32, true);
                    return;
                }
            } else if (this.id_throw.id_byte("X", 99) && this.id_throw.id_byte("Y", 99) && this.id_throw.id_byte("Z", 99)) {
                rfH_2 rfH_22 = new rfH_2(this.id_throw.id_private("X"), this.id_throw.id_private("Y"), this.id_throw.id_private("Z"));
                this.id_break(rsM_2.id_class((rYB)this.id_throws[7], rfH_22), true);
                return;
            }
            if ((Integer)this.id_throws[41] > 100) {
                this.id_class((rpL_2)rdy_3.df);
                this.id_throw = null;
            }
        }
    }

    @Override
    public boolean Po() {
        return this.G() && super.Po();
    }

    @Override
    protected void Pi() {
        super.Pi();
        this.id_class(true, false);
    }

    public boolean M() {
        return this.id_synchronized;
    }

    public static rXQ id_finally(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        if (!(rdb_32 == xu_3.Br.id_case() || rdb_32 instanceof rxJ_2 && ((rxJ_2)rdb_32).id_catch() instanceof JU)) {
            if (rdb_32 instanceof rxS_2) {
                return ((rxS_2)rdb_32).id_byte();
            }
            if (rdb_32 == rdy_3.kc) {
                return rXQ.CHEST;
            }
            return rdn_32.id_break() == rdy_3.kN ? rXQ.OFFHAND : rXQ.MAINHAND;
        }
        return rXQ.HEAD;
    }

    public boolean id_catch(rdn_3 rdn_32) {
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        rdn_3 rdn_33 = this.id_class(rXQ2);
        boolean bl = this.id_class(rdn_32, rdn_33);
        if (bl && this.id_private(rdn_32)) {
            double d = this.id_throws(rXQ2);
            if (!rdn_33.id_class() && (double)Math.max(((Random)this.id_throws[40]).nextFloat() - 0.1f, 0.0f) < d) {
                this.a_(rdn_33);
            }
            this.id_break(rXQ2, rdn_32);
            this.id_break(rdn_32);
            return true;
        }
        return false;
    }

    public void id_catch(float f) {
        Float f2 = Float.valueOf(f);
        this.id_private[44] = f2;
    }

    @Override
    public boolean id_catch(iB_2 iB_22) {
        return iB_22.BC() == aI_2.rM && ((rhx_3)((rhd_3)iB_22).id_implements[18]).id_class ? false : super.id_catch(iB_22);
    }

    public boolean G() {
        return false;
    }

    public boolean O() {
        return this.id_return;
    }

    public ih_3 id_goto() {
        return this.id_super;
    }

    public void id_case(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_class);
        ((rmE_2)this.id_throws[49]).id_break(id_class, bl ? (byte)(by | 4) : (byte)(by & 0xFFFFFFFB));
    }

    public boolean id_continue(int n) {
        return false;
    }

    public rPR id_continue() {
        return this.id_extends;
    }

    public rPg_1 id_else() {
        return this.id_volatile;
    }

    protected void id_for() {
        ruP_2.id_class((rYB)this.id_throws[7], this, this.id_package);
    }

    private void id_implements() {
        this.id_implements = -this.id_char();
    }

    public boolean id_implements(rdn_3 rdn_32) {
        return this.id_private(rdn_32);
    }

    public void id_instanceof() {
    }

    protected void id_instanceof(float f) {
        if (!this.ss().id_class() && ((Random)this.id_throws[40]).nextFloat() < 0.25f * f) {
            this.id_class(rXQ.MAINHAND, eA_2.id_class((Random)this.id_throws[40], this.ss(), (int)(5.0f + f * (float)((Random)this.id_throws[40]).nextInt(18)), false));
        }
    }

    protected rPf_1 id_new() {
        return new rPf_1(this);
    }

    public static iz_3 id_package() {
        return iB_2.SD().id_class(iQ_2.id_break, 16.0).id_class(iQ_2.id_catch);
    }

    public void id_super(int n) {
        this.id_instanceof = n;
        this.id_class(false, false);
    }

    public rPY id_super() {
        if (this.Pm() && this.ra() instanceof is_3) {
            is_3 is_32 = (is_3)this.ra();
            return is_32.id_super();
        }
        return this.id_native;
    }

    @Override
    public void id_super(float f) {
        super.id_super(f);
        this.id_catch(f);
    }

    public void id_try(float f) {
        Float f2 = Float.valueOf(f);
        this.id_private[42] = f2;
    }

    @Override
    public boolean id_try() {
        return super.id_try() && !this.c();
    }

    public void id_while(float f) {
        Float f2 = Float.valueOf(f);
        this.id_private[43] = f2;
    }

    @Override
    public Iterable<rdn_3> rs() {
        return this.id_this;
    }

    protected rqA_2 id_static() {
        return null;
    }

    public rLy_1 id_public() {
        if (this.Pm() && this.ra() instanceof is_3) {
            is_3 is_32 = (is_3)this.ra();
            return is_32.id_public();
        }
        return this.id_final;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        boolean bl;
        int n;
        float f = (float)this.id_class(iQ_2.id_case);
        float f2 = (float)this.id_class(iQ_2.id_catch);
        if (an_32 instanceof iB_2) {
            f += eA_2.id_class(this.ss(), ((iB_2)an_32).sG());
            f2 += (float)eA_2.id_break(this);
        }
        if ((n = eA_2.id_byte(this)) > 0) {
            an_32.id_case(n * 4);
        }
        if (bl = an_32.id_break(rye_3.id_byte(this), f)) {
            if (f2 > 0.0f && an_32 instanceof iB_2) {
                ((iB_2)an_32).id_class(f2 * 0.5f, (double)rfU_2.id_class(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)), (double)(-rfU_2.id_break(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180))));
                this.id_byte(this.rv().id_throws(0.6, 1.0, 0.6));
            }
            if (an_32 instanceof rhd_3) {
                rhd_3 rhd_32 = (rhd_3)an_32;
                this.id_class(rhd_32, this.ss(), rhd_32.id_return() ? rhd_32.sX() : rdn_3.id_break);
            }
            this.id_class((iB_2)this, an_32);
            this.id_try(an_32);
        }
        return bl;
    }

    public void id_protected(rXQ rXQ2) {
        switch (rXQ2.id_class()) {
            case HAND: {
                this.id_new[rXQ2.id_break()] = 2.0f;
                break;
            }
            case ARMOR: {
                this.id_continue[rXQ2.id_break()] = 2.0f;
            }
        }
    }

    public boolean id_protected(rhd_3 rhd_32) {
        return !this.z() && !(this instanceof rEK);
    }

    public void id_protected(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_class);
        ((rmE_2)this.id_throws[49]).id_break(id_class, bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE));
    }

    public boolean id_private(rfH_2 rfH_22) {
        if (this.id_char == -1.0f) {
            return true;
        }
        return this.id_interface.id_private(rfH_22) < (double)(this.id_char * this.id_char);
    }

    protected void id_private() {
        if (this.id_throw != null) {
            this.L();
        }
        if (!(this.id_try == null || this.BM() && this.id_try.BM())) {
            this.id_class(true, true);
        }
    }

    public boolean id_private(double d) {
        return true;
    }

    public boolean id_private(rdn_3 rdn_32) {
        return true;
    }

    protected void id_final() {
    }

    public boolean id_strictfp() {
        return this.Pm();
    }

    public int E() {
        return 4;
    }

    @Override
    public int rp() {
        if (this.I_() == null) {
            return 3;
        }
        int n = (int)(this.Ss() - this.SK() * 0.33f);
        if ((n -= (3 - ((rYB)this.id_throws[7]).id_abstract().id_class()) * 4) < 0) {
            n = 0;
        }
        return n + 3;
    }

    public boolean X() {
        return this.id_private(this.Bs());
    }

    @Override
    protected final void Q() {
        is_3 is_32 = this;
        Integer n = (Integer)is_32.id_private[33] + 1;
        is_32.id_private[33] = n;
        this.id_super.id_class();
        this.id_int.id_class();
        this.id_package.id_class();
        this.id_final.id_class();
        this.id_double();
        this.id_native.id_class();
        this.id_extends.id_class();
        this.id_volatile.id_break();
        this.id_for();
    }

    public iB_2 I_() {
        return this.id_protected;
    }

    @Override
    public void Pn() {
        super.Pn();
        if (this.BM() && ((Random)this.id_throws[40]).nextInt(1000) < this.id_implements++) {
            this.id_implements();
            this.id_long();
        }
    }

    @Override
    public void rA() {
        if (((rYB)this.id_throws[7]).id_abstract() == rRO.PEACEFUL && this.id_boolean()) {
            this.PD();
        } else if (!this.O() && !this.id_strictfp()) {
            rhd_3 rhd_32 = ((rYB)this.id_throws[7]).id_class((an_3)this, -1.0);
            if (rhd_32 != null) {
                int n;
                int n2;
                double d = rhd_32.id_int(this);
                if (d > (double)(n2 = (n = this.BC().id_throws().id_case()) * n) && this.id_private(d)) {
                    this.PD();
                }
                int n3 = this.BC().id_throws().id_catch();
                int n4 = n3 * n3;
                if ((Integer)this.id_private[33] > 600 && ((Random)this.id_throws[40]).nextInt(800) == 0 && d > (double)n4 && this.id_private(d)) {
                    this.PD();
                } else if (d < (double)n4) {
                    Integer n5 = 0;
                    this.id_private[33] = n5;
                }
            }
        } else {
            Integer n = 0;
            this.id_private[33] = n;
        }
    }

    @Override
    public Iterable<rdn_3> PV() {
        return this.id_else;
    }

    @Override
    public final rqO_2 By() {
        return this.id_goto == null ? this.id_short() : this.id_goto;
    }

    private void sJ() {
        is_3 is_32 = this;
        Integer n = (Integer)is_32.id_private[33] + 1;
        is_32.id_private[33] = n;
        if (this instanceof rEi_1) {
            float f = this.rX();
            boolean bl = this instanceof rEB;
            if (f > 0.5f || bl) {
                is_3 is_33 = this;
                Integer n2 = (Integer)is_33.id_private[33] + 2;
                is_33.id_private[33] = n2;
            }
        }
    }

    @Override
    public rpZ_2 Su() {
        return this.Z() ? rpZ_2.LEFT : rpZ_2.RIGHT;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
    }
}

