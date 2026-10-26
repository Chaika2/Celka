/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iM_2;
import celestial.kn_3;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rOl_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rSU;
import celestial.rSe_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rZF;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjU_2;
import celestial.rjw_3;
import celestial.rlG_2;
import celestial.rmE_2;
import celestial.rpB_2;
import celestial.rpJ_2;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqI_2;
import celestial.rqT_2;
import celestial.rqn_3;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import java.util.List;
import java.util.Random;

public class rSK
extends an_3 {
    private static final rut_3<Integer> id_class = rmE_2.id_class(rSK.class, ruw_3.id_break);
    private static final rut_3<Integer> id_break = rmE_2.id_class(rSK.class, ruw_3.id_break);
    private static final rut_3<Float> id_protected = rmE_2.id_class(rSK.class, ruw_3.id_byte);
    private static final rut_3<Integer> id_catch = rmE_2.id_class(rSK.class, ruw_3.id_break);
    private static final rut_3<Boolean> id_private = rmE_2.id_class(rSK.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_implements = rmE_2.id_class(rSK.class, ruw_3.id_implements);
    private static final rut_3<Integer> id_finally = rmE_2.id_class(rSK.class, ruw_3.id_break);
    private final float[] id_extends = new float[2];
    private float id_native;
    private float id_volatile;
    private float id_final;
    private int id_package;
    private double id_int;
    private double id_new;
    private double id_continue;
    private double id_super;
    private double id_this;
    private boolean id_else;
    private boolean id_synchronized;
    private boolean id_return;
    private boolean id_public;
    private double id_goto;
    private float id_while;
    private rSU id_try;
    private rSU id_instanceof;
    private double id_throw;
    private boolean id_interface;
    private boolean id_char;
    private float id_abstract;
    private float id_long;
    private float id_float;

    @Override
    public void id_byte(an_3 an_32) {
        if (an_32 instanceof rSK) {
            if (an_32.rN().id_break < this.rN().id_throws) {
                super.id_byte(an_32);
            }
        } else if (an_32.rN().id_break <= this.rN().id_break) {
            super.id_byte(an_32);
        }
    }

    public void id_byte(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_break, n);
    }

    public void id_byte(float f) {
        ((rmE_2)this.id_throws[49]).id_break(id_protected, Float.valueOf(f));
    }

    private void id_int() {
        if (((rYB)this.id_throws[7]).id_continue) {
            int n = this.id_goto();
            this.id_abstract = n > 0 ? (this.id_abstract += 0.05f) : (this.id_abstract -= 0.1f);
            this.id_abstract = rfU_2.id_class(this.id_abstract, 0.0f, 1.0f);
            this.id_float = this.id_long;
            this.id_long = 10.0f * (float)Math.sin(0.5f * (float)((rYB)this.id_throws[7]).r()) * this.id_abstract;
        } else {
            int n;
            if (!this.id_interface) {
                this.id_extends(0);
            }
            if ((n = this.id_goto()) > 0) {
                this.id_extends(--n);
                int n2 = 60 - n - 1;
                if (n2 > 0 && n == 0) {
                    this.id_extends(0);
                    rjU_2 rjU_22 = this.rv();
                    if (this.id_char) {
                        this.id_byte(rjU_22.id_break(0.0, -0.7, 0.0));
                        this.Bn();
                    } else {
                        this.id_catch(rjU_22.id_break, this.id_class(rhd_3.class) ? 2.7 : 0.6, rjU_22.id_protected);
                    }
                }
                this.id_interface = false;
            }
        }
    }

    public rSK(aI_2<? extends rSK> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
        Boolean bl = true;
        this.id_throws[2] = bl;
    }

    public rSK(rYB rYB2, double d, double d2, double d3) {
        this((aI_2<? extends rSK>)aI_2.id_catch, rYB2);
        this.id_new(d, d2, d3);
        this.id_byte(rjU_2.id_class);
        Double d4 = d;
        this.id_throws[8] = d4;
        Double d5 = d2;
        this.id_throws[9] = d5;
        Double d6 = d3;
        this.id_throws[10] = d6;
    }

    @Override
    public void id_this() {
        this.id_instanceof = this.id_try;
        this.id_try = this.id_continue();
        this.id_volatile = this.id_try != rSU.UNDER_WATER && this.id_try != rSU.UNDER_FLOWING_WATER ? 0.0f : (this.id_volatile += 1.0f);
        if (!((rYB)this.id_throws[7]).id_continue && this.id_volatile >= 60.0f) {
            this.Bn();
        }
        if (this.id_implements() > 0) {
            this.id_break(this.id_implements() - 1);
        }
        if (this.id_private() > 0.0f) {
            this.id_byte(this.id_private() - 1.0f);
        }
        super.id_this();
        this.id_new();
        if (this.Po()) {
            if (this.Bh().isEmpty() || !(this.Bh().get(0) instanceof rhd_3)) {
                this.id_class(false, false);
            }
            this.id_return();
            if (((rYB)this.id_throws[7]).id_continue) {
                this.id_public();
                ((rYB)this.id_throws[7]).id_class(new rZF(this.id_class(0), this.id_class(1)));
            }
            this.id_class(iG_2.SELF, this.rv());
        } else {
            this.id_byte(rjU_2.id_class);
        }
        this.id_int();
        for (int i = 0; i <= 1; ++i) {
            if (this.id_class(i)) {
                rqA_2 rqA_22;
                if (!this.BF() && (double)(this.id_extends[i] % ((float)Math.PI * 2)) <= 0.7853981852531433 && ((double)this.id_extends[i] + (double)0.3926991f) % 6.2831854820251465 >= 0.7853981852531433 && (rqA_22 = this.id_throws()) != null) {
                    rjU_2 rjU_22 = this.id_break(1.0f);
                    double d = i == 1 ? -rjU_22.id_protected : rjU_22.id_protected;
                    double d2 = i == 1 ? rjU_22.id_break : -rjU_22.id_break;
                    ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx() + d, this.re(), this.BO() + d2, rqA_22, this.Pr(), 1.0f, 0.8f + 0.4f * ((Random)this.id_throws[40]).nextFloat());
                }
                this.id_extends[i] = (float)((double)this.id_extends[i] + (double)0.3926991f);
                continue;
            }
            this.id_extends[i] = 0.0f;
        }
        this.Px();
        List<an_3> list = ((rYB)this.id_throws[7]).id_break((an_3)this, this.rN().id_byte(0.2f, -0.01f, 0.2f), rpJ_2.id_class(this));
        if (!list.isEmpty()) {
            boolean bl = !((rYB)this.id_throws[7]).id_continue && !(this.rU() instanceof rhd_3);
            for (int i = 0; i < list.size(); ++i) {
                an_3 an_32 = list.get(i);
                if (an_32.id_synchronized(this)) continue;
                if (bl && this.Bh().size() < 2 && !an_32.Pm() && an_32.PN() < this.PN() && an_32 instanceof iB_2 && !(an_32 instanceof rOl_1) && !(an_32 instanceof rhd_3)) {
                    an_32.id_this(this);
                    continue;
                }
                this.id_byte(an_32);
            }
        }
    }

    @Override
    public void id_class(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.id_int = d;
        this.id_new = d2;
        this.id_continue = d3;
        this.id_super = f;
        this.id_this = f2;
        this.id_package = 10;
    }

    @Override
    protected void id_class(double d, boolean bl, xc_3 xc_32, rfH_2 rfH_22) {
        this.id_throw = this.rv().id_byte;
        if (!this.Pm()) {
            if (bl) {
                if (((Float)this.id_throws[31]).floatValue() > 3.0f) {
                    if (this.id_try != rSU.ON_LAND) {
                        Float f = Float.valueOf(0.0f);
                        this.id_throws[31] = f;
                        return;
                    }
                    this.id_class(((Float)this.id_throws[31]).floatValue(), 1.0f);
                    if (!((rYB)this.id_throws[7]).id_continue && !((Boolean)this.id_throws[27]).booleanValue()) {
                        this.PD();
                        if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                            int n;
                            for (n = 0; n < 3; ++n) {
                                this.id_class((rpL_2)this.id_package().id_break());
                            }
                            for (n = 0; n < 2; ++n) {
                                this.id_class(rdy_3.OD);
                            }
                        }
                    }
                }
                Float f = Float.valueOf(0.0f);
                this.id_throws[31] = f;
            } else if (!((rYB)this.id_throws[7]).id_break(this.Bs().id_break()).id_class(rlG_2.id_break) && d < 0.0) {
                Float f = Float.valueOf((float)((double)((Float)this.id_throws[31]).floatValue() - d));
                this.id_throws[31] = f;
            }
        }
    }

    public void id_class(rSe_1 rSe_12) {
        ((rmE_2)this.id_throws[49]).id_break(id_catch, rSe_12.ordinal());
    }

    @Override
    protected float id_class(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break;
    }

    public float id_class(int n, float f) {
        return this.id_class(n) ? (float)rfU_2.id_break((double)this.id_extends[n] - (double)0.3926991f, (double)this.id_extends[n], (double)f) : 0.0f;
    }

    public void id_class(boolean bl, boolean bl2) {
        ((rmE_2)this.id_throws[49]).id_break(id_private, bl);
        ((rmE_2)this.id_throws[49]).id_break(id_implements, bl2);
    }

    public boolean id_class(int n) {
        return ((rmE_2)this.id_throws[49]).id_class(n == 0 ? id_private : id_implements) != false && this.rU() != null;
    }

    public void id_class(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.id_else = bl;
        this.id_synchronized = bl2;
        this.id_return = bl3;
        this.id_public = bl4;
    }

    @Override
    protected rjU_2 id_class(rpB_2 rpB_22, rqT_2 rqT_22) {
        return iB_2.id_implements(super.id_class(rpB_22, rqT_22));
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_class("Type", this.id_package().id_class());
    }

    protected void id_class(an_3 an_32) {
        an_32.id_native(((Float)this.id_throws[15]).floatValue());
        float f = rfU_2.id_catch(((Float)an_32.id_throws[15]).floatValue() - ((Float)this.id_throws[15]).floatValue());
        float f2 = rfU_2.id_class(f, -105.0f, 105.0f);
        an_3 an_33 = an_32;
        Float f3 = Float.valueOf(((Float)an_33.id_throws[17]).floatValue() + (f2 - f));
        an_33.id_throws[17] = f3;
        an_3 an_34 = an_32;
        Float f4 = Float.valueOf(((Float)an_34.id_throws[15]).floatValue() + (f2 - f));
        an_34.id_throws[15] = f4;
        an_32.id_implements(((Float)an_32.id_throws[15]).floatValue());
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        if (rhd_32.sN()) {
            return ryZ_2.PASS;
        }
        if (this.id_volatile < 60.0f) {
            if (!((rYB)this.id_throws[7]).id_continue) {
                return rhd_32.id_this(this) ? ryZ_2.CONSUME : ryZ_2.PASS;
            }
            return ryZ_2.SUCCESS;
        }
        return ryZ_2.PASS;
    }

    public static boolean id_class(an_3 an_32, an_3 an_33) {
        return (an_33.PU() || an_33.rG()) && !an_32.id_return(an_33);
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        if (rcd_32.id_byte("Type", 8)) {
            this.id_class(rSe_1.id_class(rcd_32.id_native("Type")));
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        if (!((rYB)this.id_throws[7]).id_continue && !((Boolean)this.id_throws[27]).booleanValue()) {
            boolean bl;
            this.id_byte(-this.id_final());
            this.id_break(10);
            this.id_byte(this.id_private() + f * 10.0f);
            this.rf();
            boolean bl2 = bl = rye_32.id_extends() instanceof rhd_3 && ((rhx_3)((rhd_3)rye_32.id_extends()).id_implements[18]).id_protected;
            if (bl || this.id_private() > 40.0f) {
                if (!bl && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                    this.id_class(this.id_protected());
                }
                this.PD();
            }
            return true;
        }
        return true;
    }

    public void id_break(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, n);
    }

    protected rqA_2 id_throws() {
        switch (this.id_continue()) {
            case IN_WATER: 
            case UNDER_WATER: 
            case UNDER_FLOWING_WATER: {
                return rqn_3.e;
            }
            case ON_LAND: {
                return rqn_3.U;
            }
        }
        return null;
    }

    @Override
    public boolean W() {
        return this.id_try == rSU.UNDER_WATER || this.id_try == rSU.UNDER_FLOWING_WATER;
    }

    @Override
    public void id_catch(an_3 an_32) {
        if (this.id_synchronized(an_32)) {
            float f = 0.0f;
            float f2 = (float)(((Boolean)this.id_throws[27] != false ? (double)0.01f : this.PS()) + an_32.Pv());
            if (this.Bh().size() > 1) {
                int n = this.Bh().indexOf(an_32);
                f = n == 0 ? 0.2f : -0.6f;
                if (an_32 instanceof rbZ_2) {
                    f = (float)((double)f + 0.2);
                }
            }
            rjU_2 rjU_22 = new rjU_2(f, 0.0, 0.0).id_break(-((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180) - 1.5707964f);
            an_32.id_new(this.rx() + rjU_22.id_break, this.re() + (double)f2, this.BO() + rjU_22.id_protected);
            an_3 an_33 = an_32;
            Float f3 = Float.valueOf(((Float)an_33.id_throws[15]).floatValue() + this.id_final);
            an_33.id_throws[15] = f3;
            an_32.id_implements(an_32.t() + this.id_final);
            this.id_class(an_32);
            if (an_32 instanceof rbZ_2 && this.Bh().size() > 1) {
                int n = an_32.V() % 2 == 0 ? 90 : 270;
                an_32.id_native(((Float)((rbZ_2)an_32).id_private[23]).floatValue() + (float)n);
                an_32.id_implements(an_32.t() + (float)n);
            }
        }
    }

    public float id_catch() {
        rfl_3 rfl_32 = this.rN();
        rfl_3 rfl_33 = new rfl_3(rfl_32.id_class, rfl_32.id_break - 0.001, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_break, rfl_32.id_case);
        int n = rfU_2.id_byte(rfl_33.id_class) - 1;
        int n2 = rfU_2.id_throws(rfl_33.id_protected) + 1;
        int n3 = rfU_2.id_byte(rfl_33.id_break) - 1;
        int n4 = rfU_2.id_throws(rfl_33.id_throws) + 1;
        int n5 = rfU_2.id_byte(rfl_33.id_byte) - 1;
        int n6 = rfU_2.id_throws(rfl_33.id_case) + 1;
        rjC_2 rjC_22 = rjw_3.id_class(rfl_33);
        float f = 0.0f;
        int n7 = 0;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                int n8 = (i != n && i != n2 - 1 ? 0 : 1) + (j != n5 && j != n6 - 1 ? 0 : 1);
                if (n8 == 2) continue;
                for (int k = n3; k < n4; ++k) {
                    if (n8 > 0 && (k == n3 || k == n4 - 1)) continue;
                    rfw_32.id_class(i, k, j);
                    xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfw_32);
                    if (xc_32.id_break() instanceof kn_3 || !rjw_3.id_byte(xc_32.id_extends((rYB)this.id_throws[7], rfw_32).id_class(i, (double)k, (double)j), rjC_22, rjN_2.id_implements)) continue;
                    f += xc_32.id_break().id_final();
                    ++n7;
                }
            }
        }
        return f / (float)n7;
    }

    private void id_extends(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_finally, n);
    }

    private int id_goto() {
        return ((rmE_2)this.id_throws[49]).id_class(id_finally);
    }

    @Override
    protected boolean id_case(an_3 an_32) {
        return this.Bh().size() < 2 && !this.id_class(rlG_2.id_break);
    }

    public float id_case() {
        rfl_3 rfl_32 = this.rN();
        int n = rfU_2.id_byte(rfl_32.id_class);
        int n2 = rfU_2.id_throws(rfl_32.id_protected);
        int n3 = rfU_2.id_byte(rfl_32.id_throws);
        int n4 = rfU_2.id_throws(rfl_32.id_throws - this.id_throw);
        int n5 = rfU_2.id_byte(rfl_32.id_byte);
        int n6 = rfU_2.id_throws(rfl_32.id_case);
        rfw_3 rfw_32 = new rfw_3();
        block0: for (int i = n3; i < n4; ++i) {
            float f = 0.0f;
            for (int j = n; j < n2; ++j) {
                for (int k = n5; k < n6; ++k) {
                    rfw_32.id_class(j, i, k);
                    rXE rXE2 = ((rYB)this.id_throws[7]).id_break(rfw_32);
                    if (rXE2.id_class(rlG_2.id_break)) {
                        f = Math.max(f, rXE2.id_class((rRq_1)((rYB)this.id_throws[7]), (rfH_2)rfw_32));
                    }
                    if (f >= 1.0f) continue block0;
                }
            }
            if (!(f < 1.0f)) continue;
            return (float)rfw_32.c_() + f;
        }
        return n4 + 1;
    }

    private rSU id_continue() {
        rSU rSU2 = this.id_else();
        if (rSU2 != null) {
            this.id_goto = this.rN().id_throws;
            return rSU2;
        }
        if (this.id_super()) {
            return rSU.IN_WATER;
        }
        float f = this.id_catch();
        if (f > 0.0f) {
            this.id_while = f;
            return rSU.ON_LAND;
        }
        return rSU.IN_AIR;
    }

    private rSU id_else() {
        rfl_3 rfl_32 = this.rN();
        double d = rfl_32.id_throws + 0.001;
        int n = rfU_2.id_byte(rfl_32.id_class);
        int n2 = rfU_2.id_throws(rfl_32.id_protected);
        int n3 = rfU_2.id_byte(rfl_32.id_throws);
        int n4 = rfU_2.id_throws(d);
        int n5 = rfU_2.id_byte(rfl_32.id_byte);
        int n6 = rfU_2.id_throws(rfl_32.id_case);
        boolean bl = false;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    rfw_32.id_class(i, j, k);
                    rXE rXE2 = ((rYB)this.id_throws[7]).id_break(rfw_32);
                    if (!rXE2.id_class(rlG_2.id_break) || !(d < (double)((float)rfw_32.c_() + rXE2.id_class((rRq_1)((rYB)this.id_throws[7]), (rfH_2)rfw_32)))) continue;
                    if (!rXE2.id_break()) {
                        return rSU.UNDER_FLOWING_WATER;
                    }
                    bl = true;
                }
            }
        }
        return bl ? rSU.UNDER_WATER : null;
    }

    public int id_implements() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    private void id_new() {
        if (this.Po()) {
            this.id_package = 0;
            this.id_byte(this.rx(), this.re(), this.BO());
        }
        if (this.id_package > 0) {
            double d = this.rx() + (this.id_int - this.rx()) / (double)this.id_package;
            double d2 = this.re() + (this.id_new - this.re()) / (double)this.id_package;
            double d3 = this.BO() + (this.id_continue - this.BO()) / (double)this.id_package;
            double d4 = rfU_2.id_case(this.id_super - (double)((Float)this.id_throws[15]).floatValue());
            Float f = Float.valueOf((float)((double)((Float)this.id_throws[15]).floatValue() + d4 / (double)this.id_package));
            this.id_throws[15] = f;
            Float f2 = Float.valueOf((float)((double)((Float)this.id_throws[16]).floatValue() + (this.id_this - (double)((Float)this.id_throws[16]).floatValue()) / (double)this.id_package));
            this.id_throws[16] = f2;
            --this.id_package;
            this.id_new(d, d2, d3);
            this.id_case(((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
        }
    }

    public rSe_1 id_package() {
        return rSe_1.id_class(((rmE_2)this.id_throws[49]).id_class(id_catch));
    }

    private void id_return() {
        double d = -0.04f;
        double d2 = this.rw() ? 0.0 : (double)-0.04f;
        double d3 = 0.0;
        this.id_native = 0.05f;
        if (this.id_instanceof == rSU.IN_AIR && this.id_try != rSU.IN_AIR && this.id_try != rSU.ON_LAND) {
            this.id_goto = this.id_byte(1.0);
            this.id_new(this.rx(), (double)(this.id_case() - this.Bm()) + 0.101, this.BO());
            this.id_byte(this.rv().id_throws(1.0, 0.0, 1.0));
            this.id_throw = 0.0;
            this.id_try = rSU.IN_WATER;
        } else {
            if (this.id_try == rSU.IN_WATER) {
                d3 = (this.id_goto - this.re()) / (double)this.Bm();
                this.id_native = 0.9f;
            } else if (this.id_try == rSU.UNDER_FLOWING_WATER) {
                d2 = -7.0E-4;
                this.id_native = 0.9f;
            } else if (this.id_try == rSU.UNDER_WATER) {
                d3 = 0.01f;
                this.id_native = 0.45f;
            } else if (this.id_try == rSU.IN_AIR) {
                this.id_native = 0.9f;
            } else if (this.id_try == rSU.ON_LAND) {
                this.id_native = this.id_while;
                if (this.rU() instanceof rhd_3) {
                    this.id_while /= 2.0f;
                }
            }
            rjU_2 rjU_22 = this.rv();
            this.id_catch(rjU_22.id_break * (double)this.id_native, rjU_22.id_byte + d2, rjU_22.id_protected * (double)this.id_native);
            this.id_final *= this.id_native;
            if (d3 > 0.0) {
                rjU_2 rjU_23 = this.rv();
                this.id_catch(rjU_23.id_break, (rjU_23.id_byte + d3 * 0.06153846016296973) * 0.75, rjU_23.id_protected);
            }
        }
    }

    private boolean id_super() {
        rfl_3 rfl_32 = this.rN();
        int n = rfU_2.id_byte(rfl_32.id_class);
        int n2 = rfU_2.id_throws(rfl_32.id_protected);
        int n3 = rfU_2.id_byte(rfl_32.id_break);
        int n4 = rfU_2.id_throws(rfl_32.id_break + 0.001);
        int n5 = rfU_2.id_byte(rfl_32.id_byte);
        int n6 = rfU_2.id_throws(rfl_32.id_case);
        boolean bl = false;
        this.id_goto = Double.MIN_VALUE;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    rfw_32.id_class(i, j, k);
                    rXE rXE2 = ((rYB)this.id_throws[7]).id_break(rfw_32);
                    if (!rXE2.id_class(rlG_2.id_break)) continue;
                    float f = (float)j + rXE2.id_class((rRq_1)((rYB)this.id_throws[7]), (rfH_2)rfw_32);
                    this.id_goto = Math.max((double)f, this.id_goto);
                    bl |= rfl_32.id_break < (double)f;
                }
            }
        }
        return bl;
    }

    @Override
    public boolean id_super(an_3 an_32) {
        return rSK.id_class(this, an_32);
    }

    private void id_public() {
        if (this.BP()) {
            float f = 0.0f;
            if (this.id_else) {
                this.id_final -= 1.0f;
            }
            if (this.id_synchronized) {
                this.id_final += 1.0f;
            }
            if (this.id_synchronized != this.id_else && !this.id_return && !this.id_public) {
                f += 0.005f;
            }
            rSK rSK2 = this;
            Float f2 = Float.valueOf(((Float)rSK2.id_throws[15]).floatValue() + this.id_final);
            rSK2.id_throws[15] = f2;
            if (this.id_return) {
                f += 0.04f;
            }
            if (this.id_public) {
                f -= 0.005f;
            }
            this.id_byte(this.rv().id_break(rfU_2.id_class(-((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)) * f, 0.0, rfU_2.id_break(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)) * f));
            this.id_class(this.id_synchronized && !this.id_else || this.id_return, this.id_else && !this.id_synchronized || this.id_return);
        }
    }

    public float id_protected(float f) {
        return rfU_2.id_catch(f, this.id_float, this.id_long);
    }

    public rdb_3 id_protected() {
        switch (this.id_package()) {
            default: {
                return rdy_3.he;
            }
            case SPRUCE: {
                return rdy_3.ku;
            }
            case BIRCH: {
                return rdy_3.km;
            }
            case JUNGLE: {
                return rdy_3.kZ;
            }
            case ACACIA: {
                return rdy_3.kv;
            }
            case DARK_OAK: 
        }
        return rdy_3.kF;
    }

    @Override
    public void id_private(boolean bl) {
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_interface = true;
            this.id_char = bl;
            if (this.id_goto() == 0) {
                this.id_extends(60);
            }
        }
        ((rYB)this.id_throws[7]).id_class(rLQ.E, this.rx() + (double)((Random)this.id_throws[40]).nextFloat(), this.re() + 0.7, this.BO() + (double)((Random)this.id_throws[40]).nextFloat(), 0.0, 0.0, 0.0);
        if (((Random)this.id_throws[40]).nextInt(20) == 0) {
            ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), this.BJ(), this.Pr(), 1.0f, 0.8f + 0.4f * ((Random)this.id_throws[40]).nextFloat(), false);
        }
    }

    public float id_private() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected).floatValue();
    }

    public int id_final() {
        return ((rmE_2)this.id_throws[49]).id_class(id_break);
    }

    @Override
    public void id_volatile(an_3 an_32) {
        this.id_class(an_32);
    }

    @Override
    public boolean rG() {
        return true;
    }

    @Override
    public an_3 rU() {
        List<an_3> list = this.Bh();
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public double PS() {
        return -0.1;
    }

    @Override
    public void rF() {
        this.id_byte(-this.id_final());
        this.id_break(10);
        this.id_byte(this.id_private() * 11.0f);
    }

    @Override
    public boolean rY() {
        return (Boolean)this.id_throws[27] == false;
    }

    @Override
    public rpr_3 rS() {
        return this.Pg().id_catch();
    }

    @Override
    public boolean PU() {
        return true;
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    public rjU_2 a_(iB_2 iB_22) {
        double d;
        rjU_2 rjU_22 = rSK.id_class(this.PN() * rfU_2.id_class, (double)iB_22.PN(), ((Float)this.id_throws[15]).floatValue());
        double d2 = this.rx() + rjU_22.id_break;
        rfH_2 rfH_22 = new rfH_2(d2, this.rN().id_throws, d = this.BO() + rjU_22.id_protected);
        rfH_2 rfH_23 = rfH_22.id_break();
        if (!((rYB)this.id_throws[7]).id_final(rfH_23)) {
            double d3 = (double)rfH_22.c_() + ((rYB)this.id_throws[7]).id_private(rfH_22);
            double d4 = (double)rfH_22.c_() + ((rYB)this.id_throws[7]).id_private(rfH_23);
            for (iM_2 iM_22 : iB_22.BV()) {
                rjU_2 rjU_23 = rqI_2.id_class((rYB)this.id_throws[7], d2, d3, d, iB_22, iM_22);
                if (rjU_23 != null) {
                    iB_22.id_class(iM_22);
                    return rjU_23;
                }
                rjU_2 rjU_24 = rqI_2.id_class((rYB)this.id_throws[7], d2, d4, d, iB_22, iM_22);
                if (rjU_24 == null) continue;
                iB_22.id_class(iM_22);
                return rjU_24;
            }
        }
        return super.a_(iB_22);
    }

    @Override
    protected void m_() {
        ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_break, 1);
        ((rmE_2)this.id_throws[49]).id_class(id_protected, Float.valueOf(0.0f));
        ((rmE_2)this.id_throws[49]).id_class(id_catch, rSe_1.OAK.ordinal());
        ((rmE_2)this.id_throws[49]).id_class(id_private, false);
        ((rmE_2)this.id_throws[49]).id_class(id_implements, false);
        ((rmE_2)this.id_throws[49]).id_class(id_finally, 0);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

