/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.aR_2;
import celestial.aa_3;
import celestial.an_3;
import celestial.ay_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rBe_1;
import celestial.rEi_1;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rRM;
import celestial.rRO;
import celestial.rRb_1;
import celestial.rRu_1;
import celestial.rRz_1;
import celestial.rSc_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rhN_2;
import celestial.rhU_2;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEQ;
import celestial.rsE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class rSN
extends rEi_1
implements aR_2,
aa_3 {
    private static final rut_3<Integer> id_class = rmE_2.id_class(rSN.class, ruw_3.id_break);
    private static final rut_3<Integer> id_break = rmE_2.id_class(rSN.class, ruw_3.id_break);
    private static final rut_3<Integer> id_protected = rmE_2.id_class(rSN.class, ruw_3.id_break);
    private static final List<rut_3<Integer>> id_super = ImmutableList.of(id_class, id_break, id_protected);
    private static final rut_3<Integer> id_this = rmE_2.id_class(rSN.class, ruw_3.id_break);
    private final float[] id_else = new float[2];
    private final float[] id_synchronized = new float[2];
    private final float[] id_return = new float[2];
    private final float[] id_public = new float[2];
    private final int[] id_goto = new int[2];
    private final int[] id_while = new int[2];
    private int id_try;
    private final rrEQ id_instanceof = (rrEQ)new rrEQ(this.L_(), rRb_1.PURPLE, rRM.PROGRESS).id_class(true);
    private static final Predicate<iB_2> id_throw = iB_22 -> iB_22.sG() != aL_2.id_break && iB_22.Sq();
    private static final ay_3 id_interface = new ay_3().id_class(20.0).id_class(id_throw);

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.ki;
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

    public static boolean id_byte(xc_3 xc_32) {
        return !xc_32.id_catch() && !rls_3.x.id_class(xc_32.id_break());
    }

    @Override
    protected void id_double() {
        if (this.n() > 0) {
            int n = this.n() - 1;
            if (n <= 0) {
                rRz_1 rRz_12 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) ? rRz_1.DESTROY : rRz_1.NONE;
                ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.rH(), this.BO(), 7.0f, false, rRz_12);
                if (!this.BF()) {
                    ((rYB)this.id_throws[7]).id_break(1023, this.Bs(), 0);
                }
            }
            this.id_this(n);
            if ((Integer)this.id_throws[41] % 10 == 0) {
                this.id_protected(10.0f);
            }
        } else {
            int n;
            int n2;
            super.id_double();
            block0: for (n2 = 1; n2 < 3; ++n2) {
                Object object;
                if ((Integer)this.id_throws[41] < this.id_goto[n2 - 1]) continue;
                this.id_goto[n2 - 1] = (Integer)this.id_throws[41] + 10 + ((Random)this.id_throws[40]).nextInt(10);
                if (((rYB)this.id_throws[7]).id_abstract() == rRO.NORMAL || ((rYB)this.id_throws[7]).id_abstract() == rRO.HARD) {
                    n = n2 - 1;
                    int n3 = this.id_while[n2 - 1];
                    this.id_while[n] = this.id_while[n2 - 1] + 1;
                    if (n3 > 15) {
                        float f = 10.0f;
                        float f2 = 5.0f;
                        double d = rfU_2.id_class((Random)this.id_throws[40], this.rx() - 10.0, this.rx() + 10.0);
                        double d2 = rfU_2.id_class((Random)this.id_throws[40], this.re() - 5.0, this.re() + 5.0);
                        double d3 = rfU_2.id_class((Random)this.id_throws[40], this.BO() - 10.0, this.BO() + 10.0);
                        this.id_class(n2 + 1, d, d2, d3, true);
                        this.id_while[n2 - 1] = 0;
                    }
                }
                if ((n = this.id_else(n2)) > 0) {
                    object = ((rYB)this.id_throws[7]).id_break(n);
                    if (object != null && ((an_3)object).BM() && !(this.id_int((an_3)object) > 900.0) && this.id_while((an_3)object)) {
                        if (object instanceof rhd_3 && ((rhx_3)((rhd_3)object).id_implements[18]).id_class) {
                            this.id_class(n2, 0);
                            continue;
                        }
                        this.id_class(n2 + 1, (iB_2)object);
                        this.id_goto[n2 - 1] = (Integer)this.id_throws[41] + 40 + ((Random)this.id_throws[40]).nextInt(20);
                        this.id_while[n2 - 1] = 0;
                        continue;
                    }
                    this.id_class(n2, 0);
                    continue;
                }
                object = ((rYB)this.id_throws[7]).id_class(iB_2.class, id_interface, this, this.rN().id_byte(20.0, 8.0, 20.0));
                for (int i = 0; i < 10 && !object.isEmpty(); ++i) {
                    iB_2 iB_22 = (iB_2)object.get(((Random)this.id_throws[40]).nextInt(object.size()));
                    if (iB_22 != this && iB_22.BM() && this.id_while(iB_22)) {
                        if (iB_22 instanceof rhd_3) {
                            if (((rhx_3)((rhd_3)iB_22).id_implements[18]).id_class) continue block0;
                            this.id_class(n2, iB_22.V());
                            continue block0;
                        }
                        this.id_class(n2, iB_22.V());
                        continue block0;
                    }
                    object.remove(iB_22);
                }
            }
            if (this.I_() != null) {
                this.id_class(0, this.I_().V());
            } else {
                this.id_class(0, 0);
            }
            if (this.id_try > 0) {
                --this.id_try;
                if (this.id_try == 0 && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) {
                    n2 = rfU_2.id_byte(this.re());
                    n = rfU_2.id_byte(this.rx());
                    int n4 = rfU_2.id_byte(this.BO());
                    boolean bl = false;
                    for (int i = -1; i <= 1; ++i) {
                        for (int j = -1; j <= 1; ++j) {
                            for (int k = 0; k <= 3; ++k) {
                                int n5 = n + i;
                                int n6 = n2 + k;
                                int n7 = n4 + j;
                                rfH_2 rfH_22 = new rfH_2(n5, n6, n7);
                                xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_22);
                                if (!rSN.id_byte(xc_32)) continue;
                                bl = ((rYB)this.id_throws[7]).id_class(rfH_22, true, this) || bl;
                            }
                        }
                    }
                    if (bl) {
                        ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1022, this.Bs(), 0);
                    }
                }
            }
            if ((Integer)this.id_throws[41] % 20 == 0) {
                this.id_protected(1.0f);
            }
            this.id_instanceof.id_class(this.Ss() / this.SK());
        }
    }

    public rSN(aI_2<? extends rSN> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
        this.id_public(this.SK());
        this.id_public().id_byte(true);
        this.id_finally = 50;
    }

    @Override
    public boolean I() {
        return false;
    }

    public void id_this(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_this, n);
    }

    public int n() {
        return ((rmE_2)this.id_throws[49]).id_class(id_this);
    }

    private void id_class(int n, iB_2 iB_22) {
        this.id_class(n, iB_22.rx(), iB_22.re() + (double)iB_22.Bx() * 0.5, iB_22.BO(), n == 0 && ((Random)this.id_throws[40]).nextFloat() < 0.001f);
    }

    private void id_class(int n, double d, double d2, double d3, boolean bl) {
        if (!this.BF()) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1024, this.Bs(), 0);
        }
        double d4 = this.id_synchronized(n);
        double d5 = this.id_return(n);
        double d6 = this.id_public(n);
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        rhU_2 rhU_22 = new rhU_2((rYB)this.id_throws[7], this, d7, d8, d9);
        rhU_22.id_break(this);
        if (bl) {
            rhU_22.id_class(true);
        }
        rhU_22.id_volatile(d4, d5, d6);
        ((rYB)this.id_throws[7]).a_(rhU_22);
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    public float id_class(int n) {
        return this.id_synchronized[n];
    }

    @Override
    public boolean id_class() {
        return this.Ss() <= this.SK() / 2.0f;
    }

    public void id_class(int n, int n2) {
        ((rmE_2)this.id_throws[49]).id_break(id_super.get(n), n2);
    }

    @Override
    public void id_class(rhN_2 rhN_22) {
        super.id_class(rhN_22);
        this.id_instanceof.id_class(rhN_22);
    }

    @Override
    protected void id_class(rye_3 rye_32, int n, boolean bl) {
        super.id_class(rye_32, n, bl);
        rsE_2 rsE_22 = this.id_class((rpL_2)rdy_3.dQ);
        if (rsE_22 != null) {
            rsE_22.id_int();
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rjU_2 rjU_22) {
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Invul", this.n());
    }

    @Override
    public void id_default() {
        int n;
        int n2;
        an_3 an_32;
        rjU_2 rjU_22 = this.rv().id_throws(1.0, 0.6, 1.0);
        if (!((rYB)this.id_throws[7]).id_continue && this.id_else(0) > 0 && (an_32 = ((rYB)this.id_throws[7]).id_break(this.id_else(0))) != null) {
            double d = rjU_22.id_byte;
            if (this.re() < an_32.re() || !this.id_class() && this.re() < an_32.re() + 5.0) {
                d = Math.max(0.0, d);
                d += 0.3 - d * (double)0.6f;
            }
            rjU_22 = new rjU_2(rjU_22.id_break, d, rjU_22.id_protected);
            rjU_2 rjU_23 = new rjU_2(an_32.rx() - this.rx(), 0.0, an_32.BO() - this.BO());
            if (rSN.id_case(rjU_23) > 9.0) {
                rjU_2 rjU_24 = rjU_23.id_protected();
                rjU_22 = rjU_22.id_break(rjU_24.id_break * 0.3 - rjU_22.id_break * 0.6, 0.0, rjU_24.id_protected * 0.3 - rjU_22.id_protected * 0.6);
            }
        }
        this.id_byte(rjU_22);
        if (rSN.id_case(rjU_22) > 0.05) {
            Float f = Float.valueOf((float)rfU_2.id_protected(rjU_22.id_protected, rjU_22.id_break) * 57.295776f - 90.0f);
            this.id_throws[15] = f;
        }
        super.id_default();
        for (n2 = 0; n2 < 2; ++n2) {
            this.id_public[n2] = this.id_synchronized[n2];
            this.id_return[n2] = this.id_else[n2];
        }
        for (n2 = 0; n2 < 2; ++n2) {
            int n3 = this.id_else(n2 + 1);
            an_3 an_33 = null;
            if (n3 > 0) {
                an_33 = ((rYB)this.id_throws[7]).id_break(n3);
            }
            if (an_33 != null) {
                double d = this.id_synchronized(n2 + 1);
                double d2 = this.id_return(n2 + 1);
                double d3 = this.id_public(n2 + 1);
                double d4 = an_33.rx() - d;
                double d5 = an_33.rH() - d2;
                double d6 = an_33.BO() - d3;
                double d7 = rfU_2.id_class(d4 * d4 + d6 * d6);
                float f = (float)(rfU_2.id_protected(d6, d4) * 57.2957763671875) - 90.0f;
                float f2 = (float)(-(rfU_2.id_protected(d5, d7) * 57.2957763671875));
                this.id_else[n2] = this.id_byte(this.id_else[n2], f2, 40.0f);
                this.id_synchronized[n2] = this.id_byte(this.id_synchronized[n2], f, 10.0f);
                continue;
            }
            this.id_synchronized[n2] = this.id_byte(this.id_synchronized[n2], ((Float)this.id_private[23]).floatValue(), 10.0f);
        }
        n2 = this.id_class() ? 1 : 0;
        for (n = 0; n < 3; ++n) {
            double d = this.id_synchronized(n);
            double d8 = this.id_return(n);
            double d9 = this.id_public(n);
            ((rYB)this.id_throws[7]).id_class(rLQ.id_double, d + ((Random)this.id_throws[40]).nextGaussian() * (double)0.3f, d8 + ((Random)this.id_throws[40]).nextGaussian() * (double)0.3f, d9 + ((Random)this.id_throws[40]).nextGaussian() * (double)0.3f, 0.0, 0.0, 0.0);
            if (n2 == 0 || ((rYB)this.id_throws[7]).id_int.nextInt(4) != 0) continue;
            ((rYB)this.id_throws[7]).id_class(rLQ.id_else, d + ((Random)this.id_throws[40]).nextGaussian() * (double)0.3f, d8 + ((Random)this.id_throws[40]).nextGaussian() * (double)0.3f, d9 + ((Random)this.id_throws[40]).nextGaussian() * (double)0.3f, (double)0.7f, (double)0.7f, 0.5);
        }
        if (this.n() > 0) {
            for (n = 0; n < 3; ++n) {
                ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.rx() + ((Random)this.id_throws[40]).nextGaussian(), this.re() + (double)(((Random)this.id_throws[40]).nextFloat() * 3.3f), this.BO() + ((Random)this.id_throws[40]).nextGaussian(), (double)0.7f, (double)0.7f, 0.9f);
            }
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        if (rye_32 != rye_3.id_private && !(rye_32.id_extends() instanceof rSN)) {
            an_3 an_32;
            if (this.n() > 0 && rye_32 != rye_3.id_volatile) {
                return false;
            }
            if (this.id_class() && (an_32 = rye_32.id_finally()) instanceof rhm_3) {
                return false;
            }
            an_32 = rye_32.id_extends();
            if (an_32 != null && !(an_32 instanceof rhd_3) && an_32 instanceof iB_2 && ((iB_2)an_32).sG() == this.sG()) {
                return false;
            }
            if (this.id_try <= 0) {
                this.id_try = 20;
            }
            int n = 0;
            while (n < this.id_while.length) {
                int n2 = n++;
                this.id_while[n2] = this.id_while[n2] + 3;
            }
            return super.id_break(rye_32, f);
        }
        return false;
    }

    @Override
    public void id_break(rhN_2 rhN_22) {
        super.id_break(rhN_22);
        this.id_instanceof.id_break(rhN_22);
    }

    public float id_break(int n) {
        return this.id_else[n];
    }

    @Override
    public boolean id_break(rLY rLY2) {
        return false;
    }

    @Override
    public void id_break(rgP_2 rgP_22) {
        super.id_break(rgP_22);
        this.id_instanceof.id_class(this.L_());
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_private("Invul"));
        if (this.Bk()) {
            this.id_instanceof.id_class(this.L_());
        }
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        this.id_class(0, iB_22);
    }

    @Override
    public boolean id_throws(rLY rLY2) {
        return rLY2.id_class() == rLD.id_this ? false : super.id_throws(rLY2);
    }

    public void id_throws() {
        this.id_this(220);
        this.id_public(this.SK() / 3.0f);
    }

    public static iz_3 L() {
        return rEi_1.sm().id_class(iQ_2.id_class, 300.0).id_class(iQ_2.id_protected, 0.6f).id_class(iQ_2.id_break, 40.0).id_class(iQ_2.id_implements, 4.0);
    }

    public int id_else(int n) {
        return ((rmE_2)this.id_throws[49]).id_class(id_super.get(n));
    }

    @Override
    protected boolean id_new(an_3 an_32) {
        return false;
    }

    private double id_return(int n) {
        return n <= 0 ? this.re() + 3.0 : this.re() + 2.2;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.kU;
    }

    private double id_public(int n) {
        if (n <= 0) {
            return this.BO();
        }
        float f = (((Float)this.id_private[23]).floatValue() + (float)(180 * (n - 1))) * ((float)Math.PI / 180);
        float f2 = rfU_2.id_class(f);
        return this.BO() + (double)f2 * 1.3;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rSc_1(this));
        this.id_package.id_class(2, new rBe_1(this, 1.0, 40, 20.0f));
        this.id_package.id_class(5, new rSk_1(this, 1.0));
        this.id_package.id_class(6, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(7, new rBC(this));
        this.id_int.id_class(1, new rBc_1(this, new Class[0]));
        this.id_int.id_class(2, new rBI<is_3>(this, is_3.class, 0, false, false, id_throw));
    }

    private double id_synchronized(int n) {
        if (n <= 0) {
            return this.rx();
        }
        float f = (((Float)this.id_private[23]).floatValue() + (float)(180 * (n - 1))) * ((float)Math.PI / 180);
        float f2 = rfU_2.id_break(f);
        return this.rx() + (double)f2 * 1.3;
    }

    @Override
    public void rA() {
        if (((rYB)this.id_throws[7]).id_abstract() == rRO.PEACEFUL && this.id_boolean()) {
            this.PD();
        } else {
            Integer n = 0;
            this.id_private[33] = n;
        }
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.ka;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_break;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_break, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_protected, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
    }
}

