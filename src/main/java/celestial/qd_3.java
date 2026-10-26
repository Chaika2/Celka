/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.In_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.Tf_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.fZ_2;
import celestial.iB_2;
import celestial.iM_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qE_2;
import celestial.rSY;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rhQ_2;
import celestial.rhd_3;
import celestial.rje_3;
import celestial.rnM_2;
import celestial.rnX_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrAV;
import celestial.rrMo_1;
import celestial.rrQX;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.tp_3;
import celestial.yX_2;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class qd_3<T extends iB_2, M extends tp_3<T>>
extends pV_2<T>
implements qE_2<T, M> {
    private static final Logger id_class = LogManager.getLogger();
    public M id_throws;
    protected final List<Tf_1<T, M>> id_case = Lists.newArrayList();
    public iB_2 id_catch;
    public float id_private;
    public float id_implements;
    public float id_finally;
    public float id_extends;
    public float id_native;
    public float id_volatile;
    public static final boolean id_final = Boolean.getBoolean("animate.model.living");

    public static int id_byte(iB_2 iB_22, float f) {
        return fZ_2.id_class(fZ_2.id_class(f), fZ_2.id_class((Integer)iB_22.id_private[10] > 0 || (Integer)iB_22.id_private[13] > 0));
    }

    protected float id_byte(T t) {
        return 90.0f;
    }

    public qd_3(pg_3 pg_32, M m, float f) {
        super(pg_32);
        this.id_throws = m;
        this.id_byte = f;
    }

    @Override
    public M id_class() {
        return this.id_throws;
    }

    protected float id_class(T t, float f) {
        return (float)((Integer)((iB_2)t).id_throws[41]).intValue() + f;
    }

    public final boolean id_class(Tf_1<T, M> tf_1) {
        return this.id_case.add(tf_1);
    }

    protected void id_class(T t, Ml_1 ml_1, float f) {
    }

    protected void id_class(T t, Ml_1 ml_1, float f, float f2, float f3) {
        String string;
        iM_2 iM_22;
        if (this.id_class(t)) {
            f2 += (float)(Math.cos((double)((Integer)((iB_2)t).id_throws[41]).intValue() * 3.25) * Math.PI * (double)0.4f);
        }
        if ((iM_22 = ((an_3)t).Pb()) != iM_2.SLEEPING) {
            ml_1.id_class(rje_3.id_protected.id_byte(180.0f - f2));
        }
        if ((Integer)((iB_2)t).id_private[13] > 0) {
            float f4 = ((float)((Integer)((iB_2)t).id_private[13]).intValue() + f3 - 1.0f) / 20.0f * 1.6f;
            if ((f4 = rfU_2.id_byte(f4)) > 1.0f) {
                f4 = 1.0f;
            }
            ml_1.id_class(rje_3.id_case.id_byte(f4 * this.id_byte(t)));
        } else if (((iB_2)t).Sz()) {
            ml_1.id_class(rje_3.id_break.id_byte(-90.0f - ((Float)((iB_2)t).id_throws[16]).floatValue()));
            ml_1.id_class(rje_3.id_protected.id_byte(((float)((Integer)((iB_2)t).id_throws[41]).intValue() + f3) * -75.0f));
        } else if (iM_22 == iM_2.SLEEPING) {
            rpr_3 rpr_32 = ((iB_2)t).Bi();
            float f5 = rpr_32 != null ? qd_3.id_class(rpr_32) : f2;
            ml_1.id_class(rje_3.id_protected.id_byte(f5));
            ml_1.id_class(rje_3.id_case.id_byte(this.id_byte(t)));
            ml_1.id_class(rje_3.id_protected.id_byte(270.0f));
        } else if ((((an_3)t).Bk() || t instanceof rhd_3) && ("Dinnerbone".equals(string = rgF_2.id_class(((an_3)t).g().getString())) || "Grumm".equals(string)) && (!(t instanceof rhd_3) || ((rhd_3)t).id_class(rhQ_2.CAPE))) {
            ml_1.id_class(0.0, (double)(((an_3)t).Bm() + 0.1f), 0.0);
            ml_1.id_class(rje_3.id_case.id_byte(180.0f));
        }
    }

    private float id_class(an_3 an_32, boolean bl) {
        if (bl) {
            if (an_32 instanceof rSY) {
                return 0.0f;
            }
            return 0.5f;
        }
        return 1.0f;
    }

    protected HU id_class(T t, boolean bl, boolean bl2, boolean bl3) {
        rqO_2 rqO_22 = this.id_class(t);
        if (this.id_protected() != null) {
            rqO_22 = this.id_protected();
        }
        if (bl2) {
            return HU.id_case(rqO_22);
        }
        if (bl) {
            return ((In_1)this.id_throws).id_class(rqO_22);
        }
        if (((an_3)t).w() && !((yX_2)rrbb_3.X().id_class[8]).id_protected()) {
            return ((In_1)this.id_throws).id_class(rqO_22);
        }
        return bl3 ? HU.id_final(rqO_22) : null;
    }

    @Override
    public void id_class(T t, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        boolean bl;
        boolean bl2;
        float f3;
        float f4;
        Object object;
        if (id_final) {
            Float f5 = Float.valueOf(1.0f);
            ((iB_2)t).id_private[18] = f5;
        }
        ml_1.id_class();
        ((tp_3)this.id_throws).id_final = this.id_protected(t, f2);
        ((tp_3)this.id_throws).id_package = ((an_3)t).Pm();
        ((tp_3)this.id_throws).id_int = ((iB_2)t).n_();
        float f6 = rfU_2.id_private(f2, ((Float)((iB_2)t).id_private[24]).floatValue(), ((Float)((iB_2)t).id_private[23]).floatValue());
        float f7 = rfU_2.id_private(f2, ((Float)((iB_2)t).id_private[27]).floatValue(), ((Float)((iB_2)t).id_private[25]).floatValue());
        float f8 = f7 - f6;
        if (((tp_3)this.id_throws).id_package && (object = ((an_3)t).ra()) instanceof iB_2) {
            iB_2 iB_22 = (iB_2)object;
            f6 = rfU_2.id_private(f2, ((Float)iB_22.id_private[24]).floatValue(), ((Float)iB_22.id_private[23]).floatValue());
            f8 = f7 - f6;
            float f9 = rfU_2.id_catch(f8);
            if (f9 < -85.0f) {
                f9 = -85.0f;
            }
            if (f9 >= 85.0f) {
                f9 = 85.0f;
            }
            f6 = f7 - f9;
            if (f9 * f9 > 2500.0f) {
                f6 += f9 * 0.2f;
            }
            f8 = f7 - f6;
        }
        float f5 = f4 = t == this.id_break().id_break.id_catch() ? ((Float)((iB_2)t).id_private[28]).floatValue() + (((Float)((iB_2)t).id_private[26]).floatValue() - ((Float)((iB_2)t).id_private[28]).floatValue()) * f2 : ((Float)((iB_2)t).id_throws[18]).floatValue() + (((Float)((iB_2)t).id_throws[16]).floatValue() - ((Float)((iB_2)t).id_throws[18]).floatValue()) * f2;
        if (((an_3)t).Pb() == iM_2.SLEEPING && (object = ((iB_2)t).Bi()) != null) {
            f3 = ((an_3)t).id_byte(iM_2.STANDING) - 0.1f;
            ml_1.id_class((double)((float)(-((rpr_3)object).id_implements()) * f3), 0.0, (double)((float)(-((rpr_3)object).id_extends()) * f3));
        }
        float f11 = this.id_class(t, f2);
        this.id_class(t, ml_1, f11, f6, f2);
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        this.id_class(t, ml_1, f2);
        ml_1.id_class(0.0, (double)-1.501f, 0.0);
        f3 = 0.0f;
        float f12 = 0.0f;
        if (!((an_3)t).Pm() && ((iB_2)t).BM()) {
            f3 = rfU_2.id_catch(f2, ((Float)((iB_2)t).id_private[17]).floatValue(), ((Float)((iB_2)t).id_private[18]).floatValue());
            f12 = ((Float)((iB_2)t).id_private[19]).floatValue() - ((Float)((iB_2)t).id_private[18]).floatValue() * (1.0f - f2);
            if (((iB_2)t).n_()) {
                f12 *= 3.0f;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
        }
        ((tp_3)this.id_throws).id_class(t, f12, f3, f2);
        ((tp_3)this.id_throws).id_class(t, f12, f3, f11, f8, f4);
        if (rrMo_1.id_break()) {
            this.id_catch = t;
            this.id_private = f12;
            this.id_implements = f3;
            this.id_finally = f11;
            this.id_extends = f8;
            this.id_native = f4;
            this.id_volatile = f2;
        }
        boolean bl3 = rrbb_3.rs();
        QY qY = QY.id_instanceof();
        boolean bl4 = !(bl2 = this.id_protected(t));
        HU hU = this.id_class(t, bl2, bl4, bl = qY.id_class((an_3)t));
        if (hU != null) {
            Ok_1 ok_1 = hx_1.getBuffer(hU);
            float f13 = this.id_break(t, f2);
            if (bl3) {
                if ((Integer)((iB_2)t).id_private[10] > 0 || (Integer)((iB_2)t).id_private[13] > 0) {
                    rrdZ.id_break(1.0f, 0.0f, 0.0f, 0.3f);
                }
                if (f13 > 0.0f) {
                    rrdZ.id_break(f13, f13, f13, 0.5f);
                }
            }
            int n2 = qd_3.id_byte(t, f13);
            ((In_1)this.id_throws).id_class(ml_1, ok_1, n, n2, 1.0f, 1.0f, 1.0f, this.id_class((an_3)t, bl4));
        }
        if (!((an_3)t).id_native()) {
            for (Tf_1 tf_1 : this.id_case) {
                tf_1.id_class(ml_1, hx_1, n, t, f12, f3, f2, f11, f8, f4);
            }
        }
        if (t == (cb_3)QY.id_instanceof().id_class[57]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAV.id_class(t, this.id_throws, ml_1, f2));
        }
        if (rrbb_3.rs()) {
            rrdZ.id_break(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (rrMo_1.id_break()) {
            this.id_catch = null;
        }
        ml_1.id_break();
        super.id_class(t, f, f2, ml_1, hx_1, n);
    }

    private static float id_class(rpr_3 rpr_32) {
        switch (rpr_32) {
            case SOUTH: {
                return 90.0f;
            }
            case WEST: {
                return 0.0f;
            }
            case NORTH: {
                return 270.0f;
            }
            case EAST: {
                return 180.0f;
            }
        }
        return 0.0f;
    }

    protected boolean id_class(T t) {
        return false;
    }

    @Override
    protected boolean id_break(T t) {
        boolean bl;
        float f;
        double d = this.id_break.id_break((an_3)t);
        float f2 = f = ((an_3)t).Pw() ? 32.0f : 64.0f;
        if (d >= (double)(f * f)) {
            return false;
        }
        QY qY = QY.id_instanceof();
        cb_3 cb_32 = (cb_3)qY.id_class[57];
        boolean bl2 = bl = !((an_3)t).a_(cb_32);
        if (t != cb_32) {
            rnM_2 rnM_22 = ((an_3)t).BG();
            rnM_2 rnM_23 = cb_32.BG();
            if (rnM_22 != null) {
                rnX_2 rnX_22 = rnM_22.id_implements();
                switch (rnX_22) {
                    case ALWAYS: {
                        return bl;
                    }
                    case NEVER: {
                        return false;
                    }
                    case HIDE_FOR_OTHER_TEAMS: {
                        return rnM_23 == null ? bl : rnM_22.id_class(rnM_23) && (rnM_22.id_private() || bl);
                    }
                    case HIDE_FOR_OWN_TEAM: {
                        return rnM_23 == null ? bl : !rnM_22.id_class(rnM_23) && bl;
                    }
                }
                return true;
            }
        }
        return QY.id_public() && t != qY.id_catch() && bl && !((an_3)t).BP();
    }

    protected float id_break(T t, float f) {
        return 0.0f;
    }

    public List<Tf_1<T, M>> id_throws() {
        return this.id_case;
    }

    protected float id_protected(T t, float f) {
        return ((iB_2)t).id_goto(f);
    }

    protected boolean id_protected(T t) {
        return !((an_3)t).Pp();
    }
}

