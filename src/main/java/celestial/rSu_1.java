/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QP;
import celestial.aI_2;
import celestial.an_3;
import celestial.ay_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rEK;
import celestial.rKG;
import celestial.rKv_1;
import celestial.rLC;
import celestial.rLH;
import celestial.rLQ;
import celestial.rLY;
import celestial.rLq_1;
import celestial.rRu_1;
import celestial.rST;
import celestial.rSa_1;
import celestial.rSl_1;
import celestial.rSm_1;
import celestial.rSq_1;
import celestial.rUs_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rpJ_2;
import celestial.rpX_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsP_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSu_1
extends is_3
implements rEK {
    private static final Logger id_while = LogManager.getLogger();
    public static final rut_3<Integer> id_class = rmE_2.id_class(rSu_1.class, ruw_3.id_break);
    private static final ay_3 id_try = new ay_3().id_class(64.0);
    public final double[][] id_break = new double[64][3];
    public int id_protected = -1;
    private final rSm_1[] id_instanceof;
    public final rSm_1 id_super;
    private final rSm_1 id_throw;
    private final rSm_1 id_interface;
    private final rSm_1 id_char;
    private final rSm_1 id_abstract;
    private final rSm_1 id_long;
    private final rSm_1 id_float;
    private final rSm_1 id_void;
    public float id_this;
    public float id_else;
    public boolean id_synchronized;
    public int id_return;
    public float id_public;
    public rSa_1 id_goto;
    private final rKG id_static;
    private final rSq_1 id_import;
    private int id_short = 100;
    private int id_default;
    private final rLq_1[] id_const = new rLq_1[24];
    private final int[] id_strictfp = new int[24];
    private final rLH id_boolean = new rLH();

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.BL;
    }

    public rjU_2 id_byte(float f) {
        rjU_2 rjU_22;
        rSl_1 rSl_12 = this.id_import.id_class();
        rST<? extends rSl_1> rST2 = rSl_12.id_protected();
        if (rST2 != rST.id_protected && rST2 != rST.id_throws) {
            if (rSl_12.M_()) {
                float f2 = ((Float)this.id_throws[16]).floatValue();
                float f3 = 1.5f;
                Float f4 = Float.valueOf(-45.0f);
                this.id_throws[16] = f4;
                rjU_22 = this.id_break(f);
                Float f5 = Float.valueOf(f2);
                this.id_throws[16] = f5;
            } else {
                rjU_22 = this.id_break(f);
            }
        } else {
            rfH_2 rfH_22 = ((rYB)this.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class);
            float f6 = Math.max(rfU_2.id_class(rfH_22.id_class((eX_2)this.Ps(), true)) / 4.0f, 1.0f);
            float f7 = 6.0f / f6;
            float f8 = ((Float)this.id_throws[16]).floatValue();
            float f9 = 1.5f;
            Float f10 = Float.valueOf(-f7 * 1.5f * 5.0f);
            this.id_throws[16] = f10;
            rjU_22 = this.id_break(f);
            Float f11 = Float.valueOf(f8);
            this.id_throws[16] = f11;
        }
        return rjU_22;
    }

    public rSu_1(aI_2<? extends rSu_1> aI_22, rYB rYB2) {
        super((aI_2<? extends is_3>)aI_2.id_this, rYB2);
        this.id_super = new rSm_1(this, "head", 1.0f, 1.0f);
        this.id_throw = new rSm_1(this, "neck", 3.0f, 3.0f);
        this.id_interface = new rSm_1(this, "body", 5.0f, 3.0f);
        this.id_char = new rSm_1(this, "tail", 2.0f, 2.0f);
        this.id_abstract = new rSm_1(this, "tail", 2.0f, 2.0f);
        this.id_long = new rSm_1(this, "tail", 2.0f, 2.0f);
        this.id_float = new rSm_1(this, "wing", 4.0f, 2.0f);
        this.id_void = new rSm_1(this, "wing", 4.0f, 2.0f);
        this.id_instanceof = new rSm_1[]{this.id_super, this.id_throw, this.id_interface, this.id_char, this.id_abstract, this.id_long, this.id_float, this.id_void};
        this.id_public(this.SK());
        Boolean bl = true;
        this.id_throws[38] = bl;
        Boolean bl2 = true;
        this.id_throws[56] = bl2;
        this.id_static = rYB2 instanceof rrEm_1 ? ((rrEm_1)rYB2).Q() : null;
        this.id_import = new rSq_1(this);
    }

    @Override
    public boolean I() {
        return false;
    }

    public rKG n() {
        return this.id_static;
    }

    private rLC id_class(rLq_1 rLq_12, rLq_1 rLq_13) {
        ArrayList arrayList = Lists.newArrayList();
        rLq_1 rLq_14 = rLq_13;
        arrayList.add(0, rLq_13);
        while (rLq_14.id_private != null) {
            rLq_14 = rLq_14.id_private;
            arrayList.add(0, rLq_14);
        }
        return new rLC(arrayList, new rfH_2(rLq_13.id_class, rLq_13.id_break, rLq_13.id_byte), true);
    }

    public rLC id_class(int n, int n2, rLq_1 rLq_12) {
        rLq_1 rLq_13;
        for (int i = 0; i < 24; ++i) {
            rLq_13 = this.id_const[i];
            rLq_13.id_implements = false;
            rLq_13.id_catch = 0.0f;
            rLq_13.id_throws = 0.0f;
            rLq_13.id_case = 0.0f;
            rLq_13.id_private = null;
            rLq_13.id_protected = -1;
        }
        rLq_1 rLq_14 = this.id_const[n];
        rLq_13 = this.id_const[n2];
        rLq_14.id_throws = 0.0f;
        rLq_14.id_catch = rLq_14.id_case = rLq_14.id_class(rLq_13);
        this.id_boolean.id_class();
        this.id_boolean.id_class(rLq_14);
        rLq_1 rLq_15 = rLq_14;
        int n3 = 0;
        if (this.id_static == null || this.id_static.id_byte() == 0) {
            n3 = 12;
        }
        while (!this.id_boolean.id_byte()) {
            int n4;
            rLq_1 rLq_16 = this.id_boolean.id_break();
            if (rLq_16.equals(rLq_13)) {
                if (rLq_12 != null) {
                    rLq_12.id_private = rLq_13;
                    rLq_13 = rLq_12;
                }
                return this.id_class(rLq_14, rLq_13);
            }
            if (rLq_16.id_class(rLq_13) < rLq_15.id_class(rLq_13)) {
                rLq_15 = rLq_16;
            }
            rLq_16.id_implements = true;
            int n5 = 0;
            for (n4 = 0; n4 < 24; ++n4) {
                if (this.id_const[n4] != rLq_16) continue;
                n5 = n4;
                break;
            }
            for (n4 = n3; n4 < 24; ++n4) {
                if ((this.id_strictfp[n5] & 1 << n4) <= 0) continue;
                rLq_1 rLq_17 = this.id_const[n4];
                if (rLq_17.id_implements) continue;
                float f = rLq_16.id_throws + rLq_16.id_class(rLq_17);
                if (rLq_17.id_protected() && !(f < rLq_17.id_throws)) continue;
                rLq_17.id_private = rLq_16;
                rLq_17.id_throws = f;
                rLq_17.id_case = rLq_17.id_class(rLq_13);
                if (rLq_17.id_protected()) {
                    this.id_boolean.id_class(rLq_17, rLq_17.id_throws + rLq_17.id_case);
                    continue;
                }
                rLq_17.id_catch = rLq_17.id_throws + rLq_17.id_case;
                this.id_boolean.id_class(rLq_17);
            }
        }
        if (rLq_15 == rLq_14) {
            return null;
        }
        id_while.debug("Failed to find path from {} to {}", (Object)n, (Object)n2);
        if (rLq_12 != null) {
            rLq_12.id_private = rLq_15;
            rLq_15 = rLq_12;
        }
        return this.id_class(rLq_14, rLq_15);
    }

    public double[] id_class(int n, float f) {
        if (this.Sl()) {
            f = 0.0f;
        }
        f = 1.0f - f;
        int n2 = this.id_protected - n & 0x3F;
        int n3 = this.id_protected - n - 1 & 0x3F;
        double[] dArray = new double[3];
        double d = this.id_break[n2][0];
        double d2 = rfU_2.id_case(this.id_break[n3][0] - d);
        dArray[0] = d + d2 * (double)f;
        d = this.id_break[n2][1];
        d2 = this.id_break[n3][1] - d;
        dArray[1] = d + d2 * (double)f;
        dArray[2] = rfU_2.id_protected((double)f, this.id_break[n2][2], this.id_break[n3][2]);
        return dArray;
    }

    private void id_class(int n) {
        while (n > 0) {
            int n2 = rsP_2.id_class(n);
            n -= n2;
            ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), n2));
        }
    }

    public float id_class(int n, double[] dArray, double[] dArray2) {
        double d;
        rSl_1 rSl_12 = this.id_import.id_class();
        rST<? extends rSl_1> rST2 = rSl_12.id_protected();
        if (rST2 != rST.id_protected && rST2 != rST.id_throws) {
            d = rSl_12.M_() ? (double)n : (n == 6 ? 0.0 : dArray2[1] - dArray[1]);
        } else {
            rfH_2 rfH_22 = ((rYB)this.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class);
            float f = Math.max(rfU_2.id_class(rfH_22.id_class((eX_2)this.Ps(), true)) / 4.0f, 1.0f);
            d = (float)n / f;
        }
        return (float)d;
    }

    public void id_class(rSa_1 rSa_12, rfH_2 rfH_22, rye_3 rye_32) {
        rhd_3 rhd_32 = rye_32.id_extends() instanceof rhd_3 ? (rhd_3)rye_32.id_extends() : ((rYB)this.id_throws[7]).id_class(id_try, (double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_());
        if (rSa_12 == this.id_goto) {
            this.id_class(this.id_super, rye_3.id_protected(rhd_32), 10.0f);
        }
        this.id_import.id_class().id_class(rSa_12, rfH_22, rye_32, rhd_32);
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_class.equals(rut_32) && ((rYB)this.id_throws[7]).id_continue) {
            this.id_import.id_class(rST.id_class(this.BQ().id_class(id_class)));
        }
        super.id_class(rut_32);
    }

    public boolean id_class(rSm_1 rSm_12, rye_3 rye_32, float f) {
        if (this.id_import.id_class().id_protected() == rST.id_finally) {
            return false;
        }
        f = this.id_import.id_class().id_class(rye_32, f);
        if (rSm_12 != this.id_super) {
            f = f / 4.0f + Math.min(f, 1.0f);
        }
        if (f < 0.01f) {
            return false;
        }
        if (rye_32.id_extends() instanceof rhd_3 || rye_32.id_protected()) {
            float f2 = this.Ss();
            this.id_case(rye_32, f);
            if (this.Sl() && !this.id_import.id_class().M_()) {
                this.id_public(1.0f);
                this.id_import.id_class(rST.id_finally);
            }
            if (this.id_import.id_class().M_()) {
                this.id_default = (int)((float)this.id_default + (f2 - this.Ss()));
                if ((float)this.id_default > 0.25f * this.SK()) {
                    this.id_default = 0;
                    this.id_import.id_class(rST.id_throws);
                }
            }
        }
        return true;
    }

    private void id_class(List<an_3> list) {
        double d = (this.id_interface.rN().id_class + this.id_interface.rN().id_protected) / 2.0;
        double d2 = (this.id_interface.rN().id_byte + this.id_interface.rN().id_case) / 2.0;
        for (an_3 an_32 : list) {
            if (!(an_32 instanceof iB_2)) continue;
            double d3 = an_32.rx() - d;
            double d4 = an_32.BO() - d2;
            double d5 = Math.max(d3 * d3 + d4 * d4, 0.1);
            an_32.id_implements(d3 / d5 * 4.0, 0.2f, d4 / d5 * 4.0);
            if (this.id_import.id_class().M_() || ((iB_2)an_32).Sb() >= (Integer)an_32.id_throws[41] - 2) continue;
            an_32.id_break(rye_3.id_byte(this), 5.0f);
            this.id_class((iB_2)this, an_32);
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("DragonPhase", this.id_import.id_class().id_protected().id_break());
    }

    private void id_class(rSm_1 rSm_12, double d, double d2, double d3) {
        rSm_12.id_new(this.rx() + d, this.re() + d2, this.BO() + d3);
    }

    @Override
    public void id_default() {
        float f;
        float f2;
        if (((rYB)this.id_throws[7]).id_continue) {
            this.id_public(this.Ss());
            if (!this.BF()) {
                f2 = rfU_2.id_break(this.id_else * ((float)Math.PI * 2));
                f = rfU_2.id_break(this.id_this * ((float)Math.PI * 2));
                if (f <= -0.3f && f2 >= -0.3f) {
                    ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.Bv, this.Pr(), 5.0f, 0.8f + ((Random)this.id_throws[40]).nextFloat() * 0.3f, false);
                }
                if (!this.id_import.id_class().M_() && --this.id_short < 0) {
                    ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.BF, this.Pr(), 2.5f, 0.8f + ((Random)this.id_throws[40]).nextFloat() * 0.3f, false);
                    this.id_short = 200 + ((Random)this.id_throws[40]).nextInt(200);
                }
            }
        }
        this.id_this = this.id_else;
        if (this.Sl()) {
            f2 = (((Random)this.id_throws[40]).nextFloat() - 0.5f) * 8.0f;
            f = (((Random)this.id_throws[40]).nextFloat() - 0.5f) * 4.0f;
            float f3 = (((Random)this.id_throws[40]).nextFloat() - 0.5f) * 8.0f;
            ((rYB)this.id_throws[7]).id_class(rLQ.id_return, this.rx() + (double)f2, this.re() + 2.0 + (double)f, this.BO() + (double)f3, 0.0, 0.0, 0.0);
        } else {
            this.sx();
            rjU_2 rjU_22 = this.rv();
            f = 0.2f / (rfU_2.id_class(rSu_1.id_case(rjU_22)) * 10.0f + 1.0f);
            this.id_else = this.id_import.id_class().M_() ? (this.id_else += 0.1f) : (this.id_synchronized ? (this.id_else += f * 0.5f) : (this.id_else += (f *= (float)Math.pow(2.0, rjU_22.id_byte))));
            Float f4 = Float.valueOf(rfU_2.id_catch(((Float)this.id_throws[15]).floatValue()));
            this.id_throws[15] = f4;
            if (this.c()) {
                this.id_else = 0.5f;
            } else {
                int n;
                float f5;
                float f6;
                if (this.id_protected < 0) {
                    for (int i = 0; i < this.id_break.length; ++i) {
                        this.id_break[i][0] = ((Float)this.id_throws[15]).floatValue();
                        this.id_break[i][1] = this.re();
                    }
                }
                if (++this.id_protected == this.id_break.length) {
                    this.id_protected = 0;
                }
                this.id_break[this.id_protected][0] = ((Float)this.id_throws[15]).floatValue();
                this.id_break[this.id_protected][1] = this.re();
                if (((rYB)this.id_throws[7]).id_continue) {
                    if ((Integer)this.id_private[45] > 0) {
                        double d = this.rx() + ((Double)this.id_private[46] - this.rx()) / (double)((Integer)this.id_private[45]).intValue();
                        var5_10 = this.re() + ((Double)this.id_private[47] - this.re()) / (double)((Integer)this.id_private[45]).intValue();
                        var7_12 = this.BO() + ((Double)this.id_private[48] - this.BO()) / (double)((Integer)this.id_private[45]).intValue();
                        var9_14 = rfU_2.id_case((Double)this.id_private[49] - (double)((Float)this.id_throws[15]).floatValue());
                        Float f7 = Float.valueOf((float)((double)((Float)this.id_throws[15]).floatValue() + var9_14 / (double)((Integer)this.id_private[45]).intValue()));
                        this.id_throws[15] = f7;
                        Float f8 = Float.valueOf((float)((double)((Float)this.id_throws[16]).floatValue() + ((Double)this.id_private[50] - (double)((Float)this.id_throws[16]).floatValue()) / (double)((Integer)this.id_private[45]).intValue()));
                        this.id_throws[16] = f8;
                        rSu_1 rSu_12 = this;
                        Integer n2 = (Integer)rSu_12.id_private[45] - 1;
                        rSu_12.id_private[45] = n2;
                        this.id_new(d, var5_10, var7_12);
                        this.id_case(((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
                    }
                    this.id_import.id_class().id_class();
                } else {
                    rjU_2 rjU_23;
                    rSl_1 rSl_12 = this.id_import.id_class();
                    rSl_12.id_break();
                    if (this.id_import.id_class() != rSl_12) {
                        rSl_12 = this.id_import.id_class();
                        rSl_12.id_break();
                    }
                    if ((rjU_23 = rSl_12.id_case()) != null) {
                        var5_10 = rjU_23.id_break - this.rx();
                        var7_12 = rjU_23.id_byte - this.re();
                        var9_14 = rjU_23.id_protected - this.BO();
                        double d = var5_10 * var5_10 + var7_12 * var7_12 + var9_14 * var9_14;
                        float f9 = rSl_12.id_throws();
                        double d2 = rfU_2.id_class(var5_10 * var5_10 + var9_14 * var9_14);
                        if (d2 > 0.0) {
                            var7_12 = rfU_2.id_class(var7_12 / d2, (double)(-f9), (double)f9);
                        }
                        this.id_byte(this.rv().id_break(0.0, var7_12 * 0.01, 0.0));
                        Float f10 = Float.valueOf(rfU_2.id_catch(((Float)this.id_throws[15]).floatValue()));
                        this.id_throws[15] = f10;
                        double d3 = rfU_2.id_class(rfU_2.id_case(180.0 - rfU_2.id_protected(var5_10, var9_14) * 57.2957763671875 - (double)((Float)this.id_throws[15]).floatValue()), -50.0, 50.0);
                        rjU_2 rjU_24 = rjU_23.id_class(this.rx(), this.re(), this.BO()).id_protected();
                        rjU_2 rjU_25 = new rjU_2(rfU_2.id_class(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)), this.rv().id_byte, -rfU_2.id_break(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180))).id_protected();
                        f6 = Math.max(((float)rjU_25.id_break(rjU_24) + 0.5f) / 1.5f, 0.0f);
                        this.id_public *= 0.8f;
                        this.id_public = (float)((double)this.id_public + d3 * (double)rSl_12.id_implements());
                        rSu_1 rSu_13 = this;
                        Float f11 = Float.valueOf(((Float)rSu_13.id_throws[15]).floatValue() + this.id_public * 0.1f);
                        rSu_13.id_throws[15] = f11;
                        f5 = (float)(2.0 / (d + 1.0));
                        float f12 = 0.06f;
                        this.id_class(0.06f * (f6 * f5 + (1.0f - f5)), new rjU_2(0.0, 0.0, -1.0));
                        if (this.id_synchronized) {
                            this.id_class(iG_2.SELF, this.rv().id_class((double)0.8f));
                        } else {
                            this.id_class(iG_2.SELF, this.rv());
                        }
                        rjU_2 rjU_26 = this.rv().id_protected();
                        double d4 = 0.8 + 0.15 * (rjU_26.id_break(rjU_25) + 1.0) / 2.0;
                        this.id_byte(this.rv().id_throws(d4, 0.91f, d4));
                    }
                }
                Float f13 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
                this.id_private[23] = f13;
                rjU_2[] rjU_2Array = new rjU_2[this.id_instanceof.length];
                for (int i = 0; i < this.id_instanceof.length; ++i) {
                    rjU_2Array[i] = new rjU_2(this.id_instanceof[i].rx(), this.id_instanceof[i].re(), this.id_instanceof[i].BO());
                }
                float f14 = (float)(this.id_class(5, 1.0f)[1] - this.id_class(10, 1.0f)[1]) * 10.0f * ((float)Math.PI / 180);
                float f15 = rfU_2.id_break(f14);
                float f16 = rfU_2.id_class(f14);
                float f17 = ((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180);
                float f18 = rfU_2.id_class(f17);
                float f19 = rfU_2.id_break(f17);
                this.id_class(this.id_interface, (double)(f18 * 0.5f), 0.0, (double)(-f19 * 0.5f));
                this.id_class(this.id_float, (double)(f19 * 4.5f), 2.0, (double)(f18 * 4.5f));
                this.id_class(this.id_void, (double)(f19 * -4.5f), 2.0, (double)(f18 * -4.5f));
                if (!((rYB)this.id_throws[7]).id_continue && (Integer)this.id_private[10] == 0) {
                    this.id_class(((rYB)this.id_throws[7]).id_break((an_3)this, this.id_float.rN().id_byte(4.0, 2.0, 4.0).id_protected(0.0, -2.0, 0.0), rpJ_2.id_throws));
                    this.id_class(((rYB)this.id_throws[7]).id_break((an_3)this, this.id_void.rN().id_byte(4.0, 2.0, 4.0).id_protected(0.0, -2.0, 0.0), rpJ_2.id_throws));
                    this.id_break(((rYB)this.id_throws[7]).id_break((an_3)this, this.id_super.rN().id_class(1.0), rpJ_2.id_throws));
                    this.id_break(((rYB)this.id_throws[7]).id_break((an_3)this, this.id_throw.rN().id_class(1.0), rpJ_2.id_throws));
                }
                float f20 = rfU_2.id_class(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180) - this.id_public * 0.01f);
                float f21 = rfU_2.id_break(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180) - this.id_public * 0.01f);
                float f22 = this.sJ();
                this.id_class(this.id_super, (double)(f20 * 6.5f * f15), (double)(f22 + f16 * 6.5f), (double)(-f21 * 6.5f * f15));
                this.id_class(this.id_throw, (double)(f20 * 5.5f * f15), (double)(f22 + f16 * 5.5f), (double)(-f21 * 5.5f * f15));
                double[] dArray = this.id_class(5, 1.0f);
                for (n = 0; n < 3; ++n) {
                    rSm_1 rSm_12 = null;
                    if (n == 0) {
                        rSm_12 = this.id_char;
                    }
                    if (n == 1) {
                        rSm_12 = this.id_abstract;
                    }
                    if (n == 2) {
                        rSm_12 = this.id_long;
                    }
                    double[] dArray2 = this.id_class(12 + n * 2, 1.0f);
                    float f23 = ((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180) + this.id_implements(dArray2[0] - dArray[0]) * ((float)Math.PI / 180);
                    float f24 = rfU_2.id_class(f23);
                    float f25 = rfU_2.id_break(f23);
                    f6 = 1.5f;
                    f5 = (float)(n + 1) * 2.0f;
                    this.id_class(rSm_12, (double)(-(f18 * 1.5f + f24 * f5) * f15), dArray2[1] - dArray[1] - (double)((f5 + 1.5f) * f16) + 1.5, (double)((f19 * 1.5f + f25 * f5) * f15));
                }
                if (!((rYB)this.id_throws[7]).id_continue) {
                    this.id_synchronized = this.id_break(this.id_super.rN()) | this.id_break(this.id_throw.rN()) | this.id_break(this.id_interface.rN());
                    if (this.id_static != null) {
                        this.id_static.id_break(this);
                    }
                }
                for (n = 0; n < this.id_instanceof.length; ++n) {
                    Double d = rjU_2Array[n].id_break;
                    this.id_instanceof[n].id_throws[8] = d;
                    Double d5 = rjU_2Array[n].id_byte;
                    this.id_instanceof[n].id_throws[9] = d5;
                    Double d6 = rjU_2Array[n].id_protected;
                    this.id_instanceof[n].id_throws[10] = d6;
                    Double d7 = rjU_2Array[n].id_break;
                    this.id_instanceof[n].id_throws[34] = d7;
                    Double d8 = rjU_2Array[n].id_byte;
                    this.id_instanceof[n].id_throws[35] = d8;
                    Double d9 = rjU_2Array[n].id_protected;
                    this.id_instanceof[n].id_throws[36] = d9;
                }
            }
        }
    }

    @Override
    public void j() {
        this.PD();
        if (this.id_static != null) {
            this.id_static.id_break(this);
            this.id_static.id_class(this);
        }
    }

    private void id_break(List<an_3> list) {
        for (an_3 an_32 : list) {
            if (!(an_32 instanceof iB_2)) continue;
            an_32.id_break(rye_3.id_byte(this), 10.0f);
            this.id_class((iB_2)this, an_32);
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_throws("DragonPhase")) {
            this.id_import.id_class(rST.id_class(rcd_32.id_private("DragonPhase")));
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (rye_32 instanceof rpX_2 && ((rpX_2)rye_32).id_goto()) {
            this.id_class(this.id_interface, rye_32, f);
        }
        return false;
    }

    @Override
    public boolean id_break(rLY rLY2) {
        return false;
    }

    private boolean id_break(rfl_3 rfl_32) {
        int n = rfU_2.id_byte(rfl_32.id_class);
        int n2 = rfU_2.id_byte(rfl_32.id_break);
        int n3 = rfU_2.id_byte(rfl_32.id_byte);
        int n4 = rfU_2.id_byte(rfl_32.id_protected);
        int n5 = rfU_2.id_byte(rfl_32.id_throws);
        int n6 = rfU_2.id_byte(rfl_32.id_case);
        boolean bl = false;
        boolean bl2 = false;
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    rfH_2 rfH_22 = new rfH_2(i, j, k);
                    xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_22);
                    xd_3 xd_32 = xc_32.id_break();
                    if (xc_32.id_catch() || xc_32.id_byte() == QP.id_final) continue;
                    if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) && !rls_3.J.id_class(xd_32)) {
                        bl2 = ((rYB)this.id_throws[7]).id_class(rfH_22, false) || bl2;
                        continue;
                    }
                    bl = true;
                }
            }
        }
        if (bl2) {
            rfH_2 rfH_23 = new rfH_2(n + ((Random)this.id_throws[40]).nextInt(n4 - n + 1), n2 + ((Random)this.id_throws[40]).nextInt(n5 - n2 + 1), n3 + ((Random)this.id_throws[40]).nextInt(n6 - n3 + 1));
            ((rYB)this.id_throws[7]).id_byte(2008, rfH_23, 0);
        }
        return bl;
    }

    public static iz_3 id_throws() {
        return is_3.id_package().id_class(iQ_2.id_class, 200.0);
    }

    public rSq_1 L() {
        return this.id_import;
    }

    private void sx() {
        if (this.id_goto != null) {
            if (((Boolean)this.id_goto.id_throws[27]).booleanValue()) {
                this.id_goto = null;
            } else if ((Integer)this.id_throws[41] % 10 == 0 && this.Ss() < this.SK()) {
                this.id_public(this.Ss() + 1.0f);
            }
        }
        if (((Random)this.id_throws[40]).nextInt(10) == 0) {
            List<rSa_1> list = ((rYB)this.id_throws[7]).id_class(rSa_1.class, this.rN().id_class(32.0));
            rSa_1 rSa_12 = null;
            double d = Double.MAX_VALUE;
            for (rSa_1 rSa_13 : list) {
                double d2 = rSa_13.id_int(this);
                if (!(d2 < d)) continue;
                d = d2;
                rSa_12 = rSa_13;
            }
            this.id_goto = rSa_12;
        }
    }

    public int id_catch() {
        if (this.id_const[0] == null) {
            for (int i = 0; i < 24; ++i) {
                int n;
                int n2;
                int n3;
                int n4 = 5;
                if (i < 12) {
                    n3 = rfU_2.id_protected(60.0f * rfU_2.id_break(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)i)));
                    n2 = rfU_2.id_protected(60.0f * rfU_2.id_class(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)i)));
                } else if (i < 20) {
                    n = i - 12;
                    n3 = rfU_2.id_protected(40.0f * rfU_2.id_break(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)n)));
                    n2 = rfU_2.id_protected(40.0f * rfU_2.id_class(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)n)));
                    n4 += 10;
                } else {
                    n = i - 20;
                    n3 = rfU_2.id_protected(20.0f * rfU_2.id_break(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)n)));
                    n2 = rfU_2.id_protected(20.0f * rfU_2.id_class(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)n)));
                }
                n = Math.max(((rYB)this.id_throws[7]).id_short() + 10, ((rYB)this.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, new rfH_2(n3, 0, n2)).c_() + n4);
                this.id_const[i] = new rLq_1(n3, n, n2);
            }
            this.id_strictfp[0] = 6146;
            this.id_strictfp[1] = 8197;
            this.id_strictfp[2] = 8202;
            this.id_strictfp[3] = 16404;
            this.id_strictfp[4] = 32808;
            this.id_strictfp[5] = 32848;
            this.id_strictfp[6] = 65696;
            this.id_strictfp[7] = 131392;
            this.id_strictfp[8] = 131712;
            this.id_strictfp[9] = 263424;
            this.id_strictfp[10] = 526848;
            this.id_strictfp[11] = 525313;
            this.id_strictfp[12] = 1581057;
            this.id_strictfp[13] = 3166214;
            this.id_strictfp[14] = 2138120;
            this.id_strictfp[15] = 6373424;
            this.id_strictfp[16] = 4358208;
            this.id_strictfp[17] = 12910976;
            this.id_strictfp[18] = 9044480;
            this.id_strictfp[19] = 9706496;
            this.id_strictfp[20] = 15216640;
            this.id_strictfp[21] = 0xD0E000;
            this.id_strictfp[22] = 11763712;
            this.id_strictfp[23] = 0x7E0000;
        }
        return this.id_continue(this.rx(), this.re(), this.BO());
    }

    protected boolean id_case(rye_3 rye_32, float f) {
        return super.id_break(rye_32, f);
    }

    public int id_continue(double d, double d2, double d3) {
        float f = 10000.0f;
        int n = 0;
        rLq_1 rLq_12 = new rLq_1(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3));
        int n2 = 0;
        if (this.id_static == null || this.id_static.id_byte() == 0) {
            n2 = 12;
        }
        for (int i = n2; i < 24; ++i) {
            float f2;
            if (this.id_const[i] == null || !((f2 = this.id_const[i].id_break(rLq_12)) < f)) continue;
            f = f2;
            n = i;
        }
        return n;
    }

    private float id_implements(double d) {
        return (float)rfU_2.id_case(d);
    }

    public rSm_1[] id_implements() {
        return this.id_instanceof;
    }

    @Override
    protected boolean id_new(an_3 an_32) {
        return false;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Bu;
    }

    @Override
    public void rA() {
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.HOSTILE;
    }

    @Override
    public boolean rY() {
        return false;
    }

    private float sJ() {
        if (this.id_import.id_class().M_()) {
            return -1.0f;
        }
        double[] dArray = this.id_class(5, 1.0f);
        double[] dArray2 = this.id_class(0, 1.0f);
        return (float)(dArray[1] - dArray2[1]);
    }

    @Override
    protected void St() {
        if (this.id_static != null) {
            this.id_static.id_break(this);
        }
        ++this.id_return;
        if (this.id_return >= 180 && this.id_return <= 200) {
            float f = (((Random)this.id_throws[40]).nextFloat() - 0.5f) * 8.0f;
            float f2 = (((Random)this.id_throws[40]).nextFloat() - 0.5f) * 4.0f;
            float f3 = (((Random)this.id_throws[40]).nextFloat() - 0.5f) * 8.0f;
            ((rYB)this.id_throws[7]).id_class(rLQ.id_synchronized, this.rx() + (double)f, this.re() + 2.0 + (double)f2, this.BO() + (double)f3, 0.0, 0.0, 0.0);
        }
        boolean bl = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_throws);
        int n = 500;
        if (this.id_static != null && !this.id_static.id_protected()) {
            n = 12000;
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            if (this.id_return > 150 && this.id_return % 5 == 0 && bl) {
                this.id_class(rfU_2.id_protected((float)n * 0.08f));
            }
            if (this.id_return == 1 && !this.BF()) {
                ((rYB)this.id_throws[7]).id_break(1028, this.Bs(), 0);
            }
        }
        this.id_class(iG_2.SELF, new rjU_2(0.0, 0.1f, 0.0));
        rSu_1 rSu_12 = this;
        Float f = Float.valueOf(((Float)rSu_12.id_throws[15]).floatValue() + 20.0f);
        rSu_12.id_throws[15] = f;
        Float f4 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_private[23] = f4;
        if (this.id_return == 200 && !((rYB)this.id_throws[7]).id_continue) {
            if (bl) {
                this.id_class(rfU_2.id_protected((float)n * 0.2f));
            }
            if (this.id_static != null) {
                this.id_static.id_class(this);
            }
            this.PD();
        }
    }

    @Override
    protected float Si() {
        return 5.0f;
    }

    @Override
    protected void m_() {
        super.m_();
        this.BQ().id_class(id_class, rST.id_extends.id_break());
    }
}

