/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.iG_2;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rhN_2;
import celestial.rhT_2;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rhj_3;
import celestial.rht_3;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rlB_2;
import celestial.rlG_2;
import celestial.rlc_3;
import celestial.rmE_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rsP_2;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzl_3;
import celestial.rzz_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class rhp_3
extends rhf_3 {
    private final Random id_class = new Random();
    private boolean id_break;
    private int id_protected;
    private static final rut_3<Integer> id_catch = rmE_2.id_class(rhp_3.class, ruw_3.id_break);
    private static final rut_3<Boolean> id_private = rmE_2.id_class(rhp_3.class, ruw_3.id_implements);
    private int id_implements;
    private int id_finally;
    private int id_extends;
    private int id_native;
    private float id_volatile;
    private boolean id_final = true;
    private an_3 id_package;
    private rhT_2 id_int = rhT_2.FLYING;
    private final int id_new;
    private final int id_continue;

    private boolean id_byte(rhd_3 rhd_32) {
        boolean bl;
        rdn_3 rdn_32 = rhd_32.ss();
        rdn_3 rdn_33 = rhd_32.Sn();
        boolean bl2 = rdn_32.id_break() == rdy_3.Xd;
        boolean bl3 = bl = rdn_33.id_break() == rdy_3.Xd;
        if (!((Boolean)rhd_32.id_throws[27]).booleanValue() && rhd_32.BM() && (bl2 || bl) && !(this.id_int(rhd_32) > 1024.0)) {
            return false;
        }
        this.PD();
        return true;
    }

    private rhp_3(rYB rYB2, rhd_3 rhd_32, int n, int n2) {
        super((aI_2<? extends rhf_3>)aI_2.rO, rYB2);
        Boolean bl = true;
        this.id_throws[56] = bl;
        this.id_break(rhd_32);
        rhp_3 rhp_32 = this;
        rhd_32.id_implements[29] = rhp_32;
        this.id_new = Math.max(0, n);
        this.id_continue = Math.max(0, n2);
    }

    public rhp_3(rhd_3 rhd_32, rYB rYB2, int n, int n2) {
        this(rYB2, rhd_32, n, n2);
        float f = ((Float)rhd_32.id_throws[16]).floatValue();
        float f2 = ((Float)rhd_32.id_throws[15]).floatValue();
        float f3 = rfU_2.id_break(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = rfU_2.id_class(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -rfU_2.id_break(-f * ((float)Math.PI / 180));
        float f6 = rfU_2.id_class(-f * ((float)Math.PI / 180));
        double d = rhd_32.rx() - (double)f4 * 0.3;
        double d2 = rhd_32.rH();
        double d3 = rhd_32.BO() - (double)f3 * 0.3;
        this.id_class(d, d2, d3, f2, f);
        rjU_2 rjU_22 = new rjU_2(-f4, rfU_2.id_class(-(f6 / f5), -5.0f, 5.0f), -f3);
        double d4 = rjU_22.id_case();
        rjU_22 = rjU_22.id_throws(0.6 / d4 + 0.5 + ((Random)this.id_throws[40]).nextGaussian() * 0.0045, 0.6 / d4 + 0.5 + ((Random)this.id_throws[40]).nextGaussian() * 0.0045, 0.6 / d4 + 0.5 + ((Random)this.id_throws[40]).nextGaussian() * 0.0045);
        this.id_byte(rjU_22);
        Float f7 = Float.valueOf((float)(rfU_2.id_protected(rjU_22.id_break, rjU_22.id_protected) * 57.2957763671875));
        this.id_throws[15] = f7;
        Float f8 = Float.valueOf((float)(rfU_2.id_protected(rjU_22.id_byte, (double)rfU_2.id_class(rhp_3.id_case(rjU_22))) * 57.2957763671875));
        this.id_throws[16] = f8;
        Float f9 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_throws[17] = f9;
        Float f10 = Float.valueOf(((Float)this.id_throws[16]).floatValue());
        this.id_throws[18] = f10;
    }

    public rhp_3(rYB rYB2, rhd_3 rhd_32, double d, double d2, double d3) {
        this(rYB2, rhd_32, 0, 0);
        this.id_new(d, d2, d3);
        Double d4 = this.rx();
        this.id_throws[8] = d4;
        Double d5 = this.re();
        this.id_throws[9] = d5;
        Double d6 = this.BO();
        this.id_throws[10] = d6;
    }

    @Override
    public boolean I() {
        return false;
    }

    @Override
    public void id_this() {
        this.id_class.setSeed(this.ro().getLeastSignificantBits() ^ ((rYB)this.id_throws[7]).r());
        super.id_this();
        rhd_3 rhd_32 = this.id_case();
        if (rhd_32 == null) {
            this.PD();
        } else if (((rYB)this.id_throws[7]).id_continue || !this.id_byte(rhd_32)) {
            boolean bl;
            if (((Boolean)this.id_throws[20]).booleanValue()) {
                ++this.id_implements;
                if (this.id_implements >= 1200) {
                    this.PD();
                    return;
                }
            } else {
                this.id_implements = 0;
            }
            float f = 0.0f;
            rfH_2 rfH_22 = this.Bs();
            rXE rXE2 = ((rYB)this.id_throws[7]).id_break(rfH_22);
            if (rXE2.id_class(rlG_2.id_break)) {
                f = rXE2.id_class((rRq_1)((rYB)this.id_throws[7]), rfH_22);
            }
            boolean bl2 = bl = f > 0.0f;
            if (this.id_int == rhT_2.FLYING) {
                if (this.id_package != null) {
                    this.id_byte(rjU_2.id_class);
                    this.id_int = rhT_2.HOOKED_IN_ENTITY;
                    return;
                }
                if (bl) {
                    this.id_byte(this.rv().id_throws(0.3, 0.2, 0.3));
                    this.id_int = rhT_2.BOBBING;
                    return;
                }
                this.id_final();
            } else {
                if (this.id_int == rhT_2.HOOKED_IN_ENTITY) {
                    if (this.id_package != null) {
                        if (((Boolean)this.id_package.id_throws[27]).booleanValue()) {
                            this.id_package = null;
                            this.id_int = rhT_2.FLYING;
                        } else {
                            this.id_new(this.id_package.rx(), this.id_package.id_byte(0.8), this.id_package.BO());
                        }
                    }
                    return;
                }
                if (this.id_int == rhT_2.BOBBING) {
                    rjU_2 rjU_22 = this.rv();
                    double d = this.re() + rjU_22.id_byte - (double)rfH_22.c_() - (double)f;
                    if (Math.abs(d) < 0.01) {
                        d += Math.signum(d) * 0.1;
                    }
                    this.id_catch(rjU_22.id_break * 0.9, rjU_22.id_byte - d * (double)((Random)this.id_throws[40]).nextFloat() * 0.2, rjU_22.id_protected * 0.9);
                    if (this.id_finally <= 0 && this.id_native <= 0) {
                        this.id_final = true;
                    } else {
                        boolean bl3 = this.id_final = this.id_final && this.id_protected < 10 && this.id_throws(rfH_22);
                    }
                    if (bl) {
                        this.id_protected = Math.max(0, this.id_protected - 1);
                        if (this.id_break) {
                            this.id_byte(this.rv().id_break(0.0, -0.1 * (double)this.id_class.nextFloat() * (double)this.id_class.nextFloat(), 0.0));
                        }
                        if (!((rYB)this.id_throws[7]).id_continue) {
                            this.id_class(rfH_22);
                        }
                    } else {
                        this.id_protected = Math.min(10, this.id_protected + 1);
                    }
                }
            }
            if (!rXE2.id_class(rlG_2.id_break)) {
                this.id_byte(this.rv().id_break(0.0, -0.03, 0.0));
            }
            this.id_class(iG_2.SELF, this.rv());
            this.id_return();
            if (this.id_int == rhT_2.FLYING && (((Boolean)this.id_throws[20]).booleanValue() || ((Boolean)this.id_throws[23]).booleanValue())) {
                this.id_byte(rjU_2.id_class);
            }
            double d = 0.92;
            this.id_byte(this.rv().id_class(0.92));
            this.PX();
        }
    }

    private void id_class(rfH_2 rfH_22) {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_throws[7]);
        int n = 1;
        rfH_2 rfH_23 = rfH_22.id_final();
        if (((Random)this.id_throws[40]).nextFloat() < 0.25f && ((rYB)this.id_throws[7]).id_while(rfH_23)) {
            ++n;
        }
        if (((Random)this.id_throws[40]).nextFloat() < 0.5f && !((rYB)this.id_throws[7]).id_case(rfH_23)) {
            --n;
        }
        if (this.id_finally > 0) {
            --this.id_finally;
            if (this.id_finally <= 0) {
                this.id_extends = 0;
                this.id_native = 0;
                this.BQ().id_break(id_private, false);
            }
        } else if (this.id_native > 0) {
            this.id_native -= n;
            if (this.id_native > 0) {
                double d;
                double d2;
                this.id_volatile = (float)((double)this.id_volatile + ((Random)this.id_throws[40]).nextGaussian() * 4.0);
                float f = this.id_volatile * ((float)Math.PI / 180);
                float f2 = rfU_2.id_class(f);
                float f3 = rfU_2.id_break(f);
                double d3 = this.rx() + (double)(f2 * (float)this.id_native * 0.1f);
                xc_3 xc_32 = rrEm_12.id_byte(new rfH_2(d3, (d2 = (double)((float)rfU_2.id_byte(this.re()) + 1.0f)) - 1.0, d = this.BO() + (double)(f3 * (float)this.id_native * 0.1f)));
                if (xc_32.id_class(xu_3.id_try)) {
                    if (((Random)this.id_throws[40]).nextFloat() < 0.15f) {
                        rrEm_12.id_class(rLQ.id_throws, d3, d2 - (double)0.1f, d, 1, (double)f2, 0.1, f3, 0.0);
                    }
                    float f4 = f2 * 0.04f;
                    float f5 = f3 * 0.04f;
                    rrEm_12.id_class(rLQ.id_while, d3, d2, d, 0, (double)f5, 0.01, -f4, 1.0);
                    rrEm_12.id_class(rLQ.id_while, d3, d2, d, 0, (double)(-f5), 0.01, f4, 1.0);
                }
            } else {
                this.id_class(rqn_3.SQ, 0.25f, 1.0f + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.4f);
                double d = this.re() + 0.5;
                rrEm_12.id_class(rLQ.id_throws, this.rx(), d, this.BO(), (int)(1.0f + this.PN() * 20.0f), (double)this.PN(), 0.0, this.PN(), 0.2f);
                rrEm_12.id_class(rLQ.id_while, this.rx(), d, this.BO(), (int)(1.0f + this.PN() * 20.0f), (double)this.PN(), 0.0, this.PN(), 0.2f);
                this.id_finally = rfU_2.id_class((Random)this.id_throws[40], 20, 40);
                this.BQ().id_break(id_private, true);
            }
        } else if (this.id_extends > 0) {
            this.id_extends -= n;
            float f = 0.15f;
            if (this.id_extends < 20) {
                f = (float)((double)f + (double)(20 - this.id_extends) * 0.05);
            } else if (this.id_extends < 40) {
                f = (float)((double)f + (double)(40 - this.id_extends) * 0.02);
            } else if (this.id_extends < 60) {
                f = (float)((double)f + (double)(60 - this.id_extends) * 0.01);
            }
            if (((Random)this.id_throws[40]).nextFloat() < f) {
                double d;
                double d4;
                float f6 = rfU_2.id_class((Random)this.id_throws[40], 0.0f, 360.0f) * ((float)Math.PI / 180);
                float f7 = rfU_2.id_class((Random)this.id_throws[40], 25.0f, 60.0f);
                double d5 = this.rx() + (double)(rfU_2.id_class(f6) * f7 * 0.1f);
                xc_3 xc_33 = rrEm_12.id_byte(new rfH_2(d5, (d4 = (double)((float)rfU_2.id_byte(this.re()) + 1.0f)) - 1.0, d = this.BO() + (double)(rfU_2.id_break(f6) * f7 * 0.1f)));
                if (xc_33.id_class(xu_3.id_try)) {
                    rrEm_12.id_class(rLQ.E, d5, d4, d, 2 + ((Random)this.id_throws[40]).nextInt(2), (double)0.1f, 0.0, 0.1f, 0.0);
                }
            }
            if (this.id_extends <= 0) {
                this.id_volatile = rfU_2.id_class((Random)this.id_throws[40], 0.0f, 360.0f);
                this.id_native = rfU_2.id_class((Random)this.id_throws[40], 20, 80);
            }
        } else {
            this.id_extends = rfU_2.id_class((Random)this.id_throws[40], 100, 600);
            this.id_extends -= this.id_continue * 20 * 5;
        }
    }

    private rht_3 id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        return rfH_2.id_break(rfH_22, rfH_23).map(this::id_case).reduce((rht_32, rht_33) -> rht_32 == rht_33 ? rht_32 : rht_3.INVALID).orElse(rht_3.INVALID);
    }

    @Override
    protected void id_class(rff_3 rff_32) {
        super.id_class(rff_32);
        this.id_byte(this.rv().id_protected().id_class(rff_32.id_class(this)));
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
    }

    @Override
    public void id_class(byte by) {
        if (by == 31 && ((rYB)this.id_throws[7]).id_continue && this.id_package instanceof rhd_3 && ((rhd_3)this.id_package).id_char()) {
            this.id_throws();
        }
        super.id_class(by);
    }

    @Override
    public void id_class(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_catch.equals(rut_32)) {
            int n = this.BQ().id_class(id_catch);
            an_3 an_32 = this.id_package = n > 0 ? ((rYB)this.id_throws[7]).id_break(n - 1) : null;
        }
        if (id_private.equals(rut_32)) {
            this.id_break = this.BQ().id_class(id_private);
            if (this.id_break) {
                this.id_catch(this.rv().id_break, -0.4f * rfU_2.id_class(this.id_class, 0.6f, 1.0f), this.rv().id_protected);
            }
        }
        super.id_class(rut_32);
    }

    @Override
    protected boolean id_class(an_3 an_32) {
        return super.id_class(an_32) || an_32.BM() && an_32 instanceof rsE_2;
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_package = rfo_32.id_class();
            this.id_package();
        }
    }

    @Override
    public boolean id_class(double d) {
        double d2 = 64.0;
        return d < 4096.0;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
    }

    public int id_break(rdn_3 rdn_32) {
        rhd_3 rhd_32 = this.id_case();
        if (!((rYB)this.id_throws[7]).id_continue && rhd_32 != null) {
            int n = 0;
            if (this.id_package != null) {
                this.id_throws();
                Oo_1.id_interface.id_class((rhN_2)rhd_32, rdn_32, this, Collections.emptyList());
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)31);
                n = this.id_package instanceof rsE_2 ? 3 : 5;
            } else if (this.id_finally > 0) {
                rzP_2 rzP_22 = new rzP_2((rrEm_1)((rYB)this.id_throws[7])).id_class(rzQ_2.id_case, this.Ps()).id_class(rzQ_2.id_implements, rdn_32).id_class(rzQ_2.id_class, this).id_class((Random)this.id_throws[40]).id_class((float)this.id_new + rhd_32.sY());
                rzL_2 rzL_22 = ((rYB)this.id_throws[7]).id_const().o().id_class(rzl_3.J);
                List<rdn_3> list = rzL_22.id_class(rzP_22.id_class(rzz_3.id_throws));
                Oo_1.id_interface.id_class((rhN_2)rhd_32, rdn_32, this, list);
                for (rdn_3 rdn_33 : list) {
                    rsE_2 rsE_22 = new rsE_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), rdn_33);
                    double d = rhd_32.rx() - this.rx();
                    double d2 = rhd_32.re() - this.re();
                    double d3 = rhd_32.BO() - this.BO();
                    double d4 = 0.1;
                    rsE_22.id_catch(d * 0.1, d2 * 0.1 + Math.sqrt(Math.sqrt(d * d + d2 * d2 + d3 * d3)) * 0.08, d3 * 0.1);
                    ((rYB)this.id_throws[7]).a_(rsE_22);
                    ((rYB)rhd_32.id_throws[7]).a_(new rsP_2((rYB)rhd_32.id_throws[7], rhd_32.rx(), rhd_32.re() + 0.5, rhd_32.BO() + 0.5, ((Random)this.id_throws[40]).nextInt(6) + 1));
                    if (!rdn_33.id_break().id_class(rlc_3.id_switch)) continue;
                    rhd_32.id_class(rlB_2.id_transient, 1);
                }
                n = 1;
            }
            if (((Boolean)this.id_throws[20]).booleanValue()) {
                n = 2;
            }
            this.PD();
            return n;
        }
        return 0;
    }

    private boolean id_throws(rfH_2 rfH_22) {
        rht_3 rht_32 = rht_3.INVALID;
        for (int i = -1; i <= 2; ++i) {
            rht_3 rht_33 = this.id_class(rfH_22.id_break(-2, i, -2), rfH_22.id_break(2, i, 2));
            switch (rht_33) {
                case INVALID: {
                    return false;
                }
                case ABOVE_WATER: {
                    if (rht_32 != rht_3.INVALID) break;
                    return false;
                }
                case INSIDE_WATER: {
                    if (rht_32 != rht_3.ABOVE_WATER) break;
                    return false;
                }
            }
            rht_32 = rht_33;
        }
        return true;
    }

    protected void id_throws() {
        an_3 an_32 = this.id_else();
        if (an_32 != null) {
            rjU_2 rjU_22 = new rjU_2(an_32.rx() - this.rx(), an_32.re() - this.re(), an_32.BO() - this.BO()).id_class(0.1);
            this.id_package.id_byte(this.id_package.rv().id_throws(rjU_22));
        }
    }

    @Override
    public void PD() {
        super.PD();
        rhd_3 rhd_32 = this.id_case();
        if (rhd_32 != null) {
            Object var6_2 = null;
            rhd_32.id_implements[29] = var6_2;
        }
    }

    public an_3 id_catch() {
        return this.id_package;
    }

    public rhd_3 id_case() {
        an_3 an_32 = this.id_else();
        return an_32 instanceof rhd_3 ? (rhd_3)an_32 : null;
    }

    private rht_3 id_case(rfH_2 rfH_22) {
        xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_22);
        if (!xc_32.id_catch() && !xc_32.id_class(xu_3.Sr)) {
            rXE rXE2 = xc_32.id_volatile();
            return rXE2.id_class(rlG_2.id_break) && rXE2.id_break() && xc_32.id_extends((rYB)this.id_throws[7], rfH_22).id_break() ? rht_3.INSIDE_WATER : rht_3.INVALID;
        }
        return rht_3.ABOVE_WATER;
    }

    public boolean id_implements() {
        return this.id_break;
    }

    private void id_package() {
        this.BQ().id_break(id_catch, this.id_package.V() + 1);
    }

    public boolean id_protected() {
        return this.id_final;
    }

    public rhT_2 id_private() {
        return this.id_int;
    }

    private void id_final() {
        rjG_2 rjG_22 = rhj_3.id_class((an_3)this, this::id_class);
        this.id_class(rjG_22);
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected void m_() {
        this.BQ().id_class(id_catch, 0);
        this.BQ().id_class(id_private, false);
    }

    @Override
    public ruS_2<?> p_() {
        an_3 an_32 = this.id_else();
        return new rFJ(this, an_32 == null ? this.V() : an_32.V());
    }
}

