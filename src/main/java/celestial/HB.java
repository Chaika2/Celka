/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package celestial;

import celestial.HU;
import celestial.Hd_1;
import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Hz_1;
import celestial.IQ;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.Y;
import celestial.cG_2;
import celestial.cb_3;
import celestial.fZ_2;
import celestial.gm_3;
import celestial.iB_2;
import celestial.pg_3;
import celestial.ql_3;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rhz_3;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rkB_2;
import celestial.rpZ_2;
import celestial.rpm_3;
import celestial.rqO_2;
import celestial.rrAi_1;
import celestial.rrGb_1;
import celestial.rrQX;
import celestial.rrbb_3;
import celestial.rrby_3;
import celestial.rrdZ;
import celestial.rrxr_3;
import celestial.rxI_2;
import celestial.rxm_3;
import com.google.common.base.MoreObjects;
import java.util.Objects;

public class HB {
    private static final HU id_class = HU.id_int(new rqO_2("textures/map/map_background.png"));
    private static final HU id_break = HU.id_int(new rqO_2("textures/map/map_background_checkerboard.png"));
    private final QY id_byte;
    private rdn_3 id_protected = rdn_3.id_break;
    private rdn_3 id_throws = rdn_3.id_break;
    private float id_case;
    private float id_catch;
    private float id_private;
    private float id_implements;
    private final pg_3 id_finally;
    private final Hz_1 id_extends;

    public HB(QY qY) {
        this.id_byte = qY;
        this.id_finally = qY.id_case();
        this.id_extends = qY.id_float();
    }

    private void id_class(cG_2 cG_22, float f, float f2, rpm_3 rpm_32, float f3, rdn_3 rdn_32, float f4, Ml_1 ml_1, Hx_1 hx_1, int n) {
        if (!rrbb_3.rs() || !rrdZ.id_class(rpm_32)) {
            boolean bl = rpm_32 == rpm_3.MAIN_HAND;
            rpZ_2 rpZ_22 = bl ? cG_22.Su() : cG_22.Su().id_class();
            ml_1.id_class();
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAi_1.id_class((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]), ml_1, rpm_32, rpZ_22, rdn_32, f3));
            float f5 = -0.2f * rfU_2.id_class(f3 * (float)Math.PI);
            if (rdn_32.id_class()) {
                if (bl) {
                    this.id_class(ml_1, hx_1, n, f4, f3, rpZ_22);
                }
            } else if (rdn_32.id_break() instanceof rxI_2) {
                if (bl && this.id_throws.id_class()) {
                    this.id_class(ml_1, hx_1, n, f2, f4, f3);
                } else {
                    this.id_class(ml_1, hx_1, n, f4, rpZ_22, f3, rdn_32);
                }
            } else if (rdn_32.id_break() instanceof rxm_3) {
                int n2;
                boolean bl2 = rxm_3.id_protected(rdn_32);
                boolean bl3 = rpZ_22 == rpZ_2.RIGHT;
                int n3 = n2 = bl3 ? 1 : -1;
                if (cG_22.id_return() && cG_22.SH() > 0 && cG_22.P() == rpm_32) {
                    this.id_break(ml_1, rpZ_22, f4);
                    ml_1.id_class((double)((float)n2 * -0.4785682f), (double)-0.094387f, 0.05731530860066414);
                    ml_1.id_class(rje_3.id_break.id_byte(-11.935f));
                    ml_1.id_class(rje_3.id_protected.id_byte((float)n2 * 65.3f));
                    ml_1.id_class(rje_3.id_case.id_byte((float)n2 * -9.785f));
                    float f6 = (float)rdn_32.id_extends() - ((float)((cb_3)this.id_byte.id_class[57]).SH() - f + 1.0f);
                    float f7 = f6 / (float)rxm_3.id_private(rdn_32);
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (f7 > 0.1f) {
                        float f8 = rfU_2.id_class((f6 - 0.1f) * 1.3f);
                        float f9 = f7 - 0.1f;
                        float f10 = f8 * f9;
                        ml_1.id_class((double)(f10 * 0.0f), (double)(f10 * 0.004f), (double)(f10 * 0.0f));
                    }
                    ml_1.id_class((double)(f7 * 0.0f), (double)(f7 * 0.0f), (double)(f7 * 0.04f));
                    ml_1.id_class(1.0f, 1.0f, 1.0f + f7 * 0.2f);
                    ml_1.id_class(rje_3.id_byte.id_byte((float)n2 * 45.0f));
                } else {
                    float f11 = -0.4f * rfU_2.id_class(rfU_2.id_byte(f3) * (float)Math.PI);
                    float f12 = 0.2f * rfU_2.id_class(rfU_2.id_byte(f3) * ((float)Math.PI * 2));
                    float f13 = -0.2f * rfU_2.id_class(f3 * (float)Math.PI);
                    ml_1.id_class((double)((float)n2 * f11), (double)f12, (double)f13);
                    this.id_break(ml_1, rpZ_22, f4);
                    this.id_class(ml_1, rpZ_22, f3);
                    if (bl2 && f3 < 0.001f) {
                        ml_1.id_class((double)((float)n2 * -0.641864f), 0.0, 0.0);
                        ml_1.id_class(rje_3.id_protected.id_byte((float)n2 * 10.0f));
                    }
                }
                this.id_class(cG_22, rdn_32, bl3 ? IQ.FIRST_PERSON_RIGHT_HAND : IQ.FIRST_PERSON_LEFT_HAND, !bl3, ml_1, hx_1, n);
            } else {
                boolean bl4;
                boolean bl5 = bl4 = rpZ_22 == rpZ_2.RIGHT;
                if (cG_22.id_return() && cG_22.SH() > 0 && cG_22.P() == rpm_32) {
                    int n4 = bl4 ? 1 : -1;
                    switch (rdn_32.id_native()) {
                        case NONE: {
                            this.id_break(ml_1, rpZ_22, f4);
                            break;
                        }
                        case EAT: 
                        case DRINK: {
                            this.id_class(ml_1, f, rpZ_22, rdn_32);
                            this.id_break(ml_1, rpZ_22, f4);
                            break;
                        }
                        case BLOCK: {
                            this.id_break(ml_1, rpZ_22, f4);
                            break;
                        }
                        case BOW: {
                            this.id_break(ml_1, rpZ_22, f4);
                            ml_1.id_class((double)((float)n4 * -0.2785682f), 0.18344387412071228, 0.15731531381607056);
                            ml_1.id_class(rje_3.id_break.id_byte(-13.935f));
                            ml_1.id_class(rje_3.id_protected.id_byte((float)n4 * 35.3f));
                            ml_1.id_class(rje_3.id_case.id_byte((float)n4 * -9.785f));
                            float f14 = (float)rdn_32.id_extends() - ((float)((cb_3)this.id_byte.id_class[57]).SH() - f + 1.0f);
                            float f15 = f14 / 20.0f;
                            f15 = (f15 * f15 + f15 * 2.0f) / 3.0f;
                            if (f15 > 1.0f) {
                                f15 = 1.0f;
                            }
                            if (f15 > 0.1f) {
                                float f16 = rfU_2.id_class((f14 - 0.1f) * 1.3f);
                                float f17 = f15 - 0.1f;
                                float f18 = f16 * f17;
                                ml_1.id_class((double)(f18 * 0.0f), (double)(f18 * 0.004f), (double)(f18 * 0.0f));
                            }
                            ml_1.id_class((double)(f15 * 0.0f), (double)(f15 * 0.0f), (double)(f15 * 0.04f));
                            ml_1.id_class(1.0f, 1.0f, 1.0f + f15 * 0.2f);
                            ml_1.id_class(rje_3.id_byte.id_byte((float)n4 * 45.0f));
                            break;
                        }
                        case SPEAR: {
                            this.id_break(ml_1, rpZ_22, f4);
                            ml_1.id_class((double)((float)n4 * -0.5f), (double)0.7f, (double)0.1f);
                            ml_1.id_class(rje_3.id_break.id_byte(-55.0f));
                            ml_1.id_class(rje_3.id_protected.id_byte((float)n4 * 35.3f));
                            ml_1.id_class(rje_3.id_case.id_byte((float)n4 * -9.785f));
                            float f19 = (float)rdn_32.id_extends() - ((float)((cb_3)this.id_byte.id_class[57]).SH() - f + 1.0f);
                            float f20 = f19 / 10.0f;
                            if (f20 > 1.0f) {
                                f20 = 1.0f;
                            }
                            if (f20 > 0.1f) {
                                float f21 = rfU_2.id_class((f19 - 0.1f) * 1.3f);
                                float f22 = f20 - 0.1f;
                                float f23 = f21 * f22;
                                ml_1.id_class((double)(f23 * 0.0f), (double)(f23 * 0.004f), (double)(f23 * 0.0f));
                            }
                            ml_1.id_class(0.0, 0.0, (double)(f20 * 0.2f));
                            ml_1.id_class(1.0f, 1.0f, 1.0f + f20 * 0.2f);
                            ml_1.id_class(rje_3.id_byte.id_byte((float)n4 * 45.0f));
                        }
                    }
                } else if (cG_22.Sz()) {
                    this.id_break(ml_1, rpZ_22, f4);
                    int n5 = bl4 ? 1 : -1;
                    ml_1.id_class((double)((float)n5 * -0.4f), (double)0.8f, (double)0.3f);
                    ml_1.id_class(rje_3.id_protected.id_byte((float)n5 * 65.0f));
                    ml_1.id_class(rje_3.id_case.id_byte((float)n5 * -85.0f));
                } else {
                    rrAi_1 rrAi_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAi_1.id_class((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]), ml_1, rpm_32, rpZ_22, rdn_32, f3));
                    if (!rrAi_12.id_byte()) {
                        float f24 = -0.4f * rfU_2.id_class(rfU_2.id_byte(f3) * (float)Math.PI);
                        float f25 = 0.2f * rfU_2.id_class(rfU_2.id_byte(f3) * ((float)Math.PI * 2));
                        float f26 = bl4 ? 1.0f : -1.0f;
                        ml_1.id_class((double)(f26 * f24), (double)f25, (double)f5);
                        this.id_break(ml_1, rpZ_22, f4);
                        this.id_class(ml_1, rpZ_22, f3);
                    }
                }
                this.id_class(cG_22, rdn_32, bl4 ? IQ.FIRST_PERSON_RIGHT_HAND : IQ.FIRST_PERSON_LEFT_HAND, !bl4, ml_1, hx_1, n);
            }
            ml_1.id_break();
        }
    }

    public void id_class(float f, Ml_1 ml_1, Hd_1 hd_1, cb_3 cb_32, int n) {
        float f2 = cb_32.id_goto(f);
        rpm_3 rpm_32 = (rpm_3)((Object)MoreObjects.firstNonNull((Object)((Object)((rpm_3)((Object)cb_32.id_private[6]))), (Object)((Object)rpm_3.MAIN_HAND)));
        float f3 = ((Float)cb_32.id_throws[16]).floatValue();
        boolean bl = true;
        boolean bl2 = true;
        if (cb_32.id_return()) {
            rdn_3 rdn_32;
            var11_11 = cb_32.sX();
            if (var11_11.id_break() instanceof rkB_2) {
                bl = cb_32.P() == rpm_3.MAIN_HAND;
                boolean bl3 = bl2 = !bl;
            }
            if ((var12_14 = cb_32.P()) == rpm_3.MAIN_HAND && (rdn_32 = cb_32.Sn()).id_break() instanceof rxm_3 && rxm_3.id_protected(rdn_32)) {
                bl2 = false;
            }
        } else {
            var11_11 = cb_32.ss();
            var12_14 = cb_32.Sn();
            if (var11_11.id_break() instanceof rxm_3 && rxm_3.id_protected(var11_11)) {
                boolean bl4 = bl2 = !bl;
            }
            if (((rdn_3)var12_14).id_break() instanceof rxm_3 && rxm_3.id_protected((rdn_3)var12_14)) {
                bl = !var11_11.id_class();
                boolean bl5 = bl2 = !bl;
            }
        }
        if (bl) {
            float f4 = rpm_32 == rpm_3.MAIN_HAND ? f2 : 0.0f;
            float f5 = 1.0f - rfU_2.id_catch(f, this.id_catch, this.id_case);
            if (!rrxr_3.rf.id_byte() || !rrxr_3.id_break(rrxr_3.rf, new Object[]{rpm_3.MAIN_HAND, ml_1, hd_1, n, Float.valueOf(f), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), this.id_protected})) {
                this.id_class(cb_32, f, f3, rpm_3.MAIN_HAND, f4, this.id_protected, f5, ml_1, hd_1, n);
            }
        }
        if (bl2) {
            float f6 = rpm_32 == rpm_3.OFF_HAND ? f2 : 0.0f;
            float f7 = 1.0f - rfU_2.id_catch(f, this.id_implements, this.id_private);
            if (!rrxr_3.rf.id_byte() || !rrxr_3.id_break(rrxr_3.rf, new Object[]{rpm_3.OFF_HAND, ml_1, hd_1, n, Float.valueOf(f), Float.valueOf(f3), Float.valueOf(f6), Float.valueOf(f7), this.id_throws})) {
                this.id_class(cb_32, f, f3, rpm_3.OFF_HAND, f6, this.id_throws, f7, ml_1, hd_1, n);
            }
        }
        hd_1.id_break();
    }

    private void id_class(Ml_1 ml_1, rpZ_2 rpZ_22, float f) {
        int n = rpZ_22 == rpZ_2.RIGHT ? 1 : -1;
        float f2 = rfU_2.id_class(f * f * (float)Math.PI);
        ml_1.id_class(rje_3.id_protected.id_byte((float)n * (45.0f + f2 * -20.0f)));
        float f3 = rfU_2.id_class(rfU_2.id_byte(f) * (float)Math.PI);
        ml_1.id_class(rje_3.id_case.id_byte((float)n * f3 * -20.0f));
        ml_1.id_class(rje_3.id_break.id_byte(f3 * -80.0f));
        ml_1.id_class(rje_3.id_protected.id_byte((float)n * -45.0f));
    }

    public void id_class(iB_2 iB_22, rdn_3 rdn_32, IQ iQ, boolean bl, Ml_1 ml_1, Hx_1 hx_1, int n) {
        rrby_3.id_class(bl);
        if (!rdn_32.id_class()) {
            this.id_extends.id_class(iB_22, rdn_32, iQ, bl, ml_1, hx_1, (rYB)iB_22.id_throws[7], n, fZ_2.id_class);
        }
        rrby_3.id_class(false);
    }

    public void id_class() {
        this.id_catch = this.id_case;
        this.id_implements = this.id_private;
        cb_3 cb_32 = (cb_3)this.id_byte.id_class[57];
        rdn_3 rdn_32 = cb_32.ss();
        rdn_3 rdn_33 = cb_32.Sn();
        if (rdn_3.id_break(this.id_protected, rdn_32)) {
            this.id_protected = rdn_32;
        }
        if (rdn_3.id_break(this.id_throws, rdn_33)) {
            this.id_throws = rdn_33;
        }
        if (cb_32.id_long()) {
            this.id_case = rfU_2.id_class(this.id_case - 0.4f, 0.0f, 1.0f);
            this.id_private = rfU_2.id_class(this.id_private - 0.4f, 0.0f, 1.0f);
        } else {
            float f = cb_32.id_class(1.0f, false);
            if (rrxr_3.rV.id_byte()) {
                boolean bl = rrxr_3.id_break(rrxr_3.rV, this.id_protected, rdn_32, ((rhz_3)cb_32.id_implements[1]).id_protected);
                boolean bl2 = rrxr_3.id_break(rrxr_3.rV, this.id_throws, rdn_33, -1);
                if (!bl && !Objects.equals(this.id_protected, rdn_32)) {
                    this.id_protected = rdn_32;
                }
                if (!bl2 && !Objects.equals(this.id_throws, rdn_33)) {
                    this.id_throws = rdn_33;
                }
            }
            this.id_case += rfU_2.id_class((this.id_protected == rdn_32 ? f * f * f : 0.0f) - this.id_case, -0.4f, 0.4f);
            this.id_private += rfU_2.id_class((float)(this.id_throws == rdn_33 ? 1 : 0) - this.id_private, -0.4f, 0.4f);
        }
        if (this.id_case < 0.1f) {
            this.id_protected = rdn_32;
            if (rrbb_3.rs()) {
                rrdZ.id_class(this.id_protected);
            }
        }
        if (this.id_private < 0.1f) {
            this.id_throws = rdn_33;
            if (rrbb_3.rs()) {
                rrdZ.id_break(this.id_throws);
            }
        }
    }

    public void id_class(rpm_3 rpm_32) {
        if (rpm_32 == rpm_3.MAIN_HAND) {
            this.id_case = 0.0f;
        } else {
            this.id_private = 0.0f;
        }
    }

    private void id_class(Ml_1 ml_1, float f, rpZ_2 rpZ_22, rdn_3 rdn_32) {
        float f2;
        float f3 = (float)((cb_3)this.id_byte.id_class[57]).SH() - f + 1.0f;
        float f4 = f3 / (float)rdn_32.id_extends();
        if (f4 < 0.8f) {
            f2 = rfU_2.id_throws(rfU_2.id_break(f3 / 4.0f * (float)Math.PI) * 0.1f);
            ml_1.id_class(0.0, (double)f2, 0.0);
        }
        f2 = 1.0f - (float)Math.pow(f4, 27.0);
        int n = rpZ_22 == rpZ_2.RIGHT ? 1 : -1;
        ml_1.id_class((double)(f2 * 0.6f * (float)n), (double)(f2 * -0.5f), (double)(f2 * 0.0f));
        ml_1.id_class(rje_3.id_protected.id_byte((float)n * f2 * 90.0f));
        ml_1.id_class(rje_3.id_break.id_byte(f2 * 10.0f));
        ml_1.id_class(rje_3.id_case.id_byte((float)n * f2 * 30.0f));
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, float f, float f2, float f3) {
        float f4 = rfU_2.id_byte(f3);
        float f5 = -0.2f * rfU_2.id_class(f3 * (float)Math.PI);
        float f6 = -0.4f * rfU_2.id_class(f4 * (float)Math.PI);
        ml_1.id_class(0.0, (double)(-f5 / 2.0f), (double)f6);
        float f7 = this.id_class(f);
        ml_1.id_class(0.0, (double)(0.04f + f2 * -1.2f + f7 * -0.5f), (double)-0.72f);
        ml_1.id_class(rje_3.id_break.id_byte(f7 * -85.0f));
        if (!((cb_3)this.id_byte.id_class[57]).Pp()) {
            ml_1.id_class();
            ml_1.id_class(rje_3.id_protected.id_byte(90.0f));
            this.id_class(ml_1, hx_1, n, rpZ_2.RIGHT);
            this.id_class(ml_1, hx_1, n, rpZ_2.LEFT);
            ml_1.id_break();
        }
        float f8 = rfU_2.id_class(f4 * (float)Math.PI);
        ml_1.id_class(rje_3.id_break.id_byte(f8 * 20.0f));
        ml_1.id_class(2.0f, 2.0f, 2.0f);
        this.id_class(ml_1, hx_1, n, this.id_protected);
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, float f, rpZ_2 rpZ_22, float f2, rdn_3 rdn_32) {
        float f3 = rpZ_22 == rpZ_2.RIGHT ? 1.0f : -1.0f;
        ml_1.id_class((double)(f3 * 0.125f), -0.125, 0.0);
        ml_1.id_class();
        ml_1.id_class(rje_3.id_case.id_byte(f3 * 10.0f));
        this.id_class(ml_1, hx_1, n, f, f2, rpZ_22);
        ml_1.id_break();
        ml_1.id_class();
        ml_1.id_class((double)(f3 * 0.51f), (double)(-0.08f + f * -1.2f), -0.75);
        float f4 = rfU_2.id_byte(f2);
        float f5 = rfU_2.id_class(f4 * (float)Math.PI);
        float f6 = -0.5f * f5;
        float f7 = 0.4f * rfU_2.id_class(f4 * ((float)Math.PI * 2));
        float f8 = -0.3f * rfU_2.id_class(f2 * (float)Math.PI);
        ml_1.id_class((double)(f3 * f6), (double)(f7 - 0.3f * f5), (double)f8);
        ml_1.id_class(rje_3.id_break.id_byte(f5 * -45.0f));
        ml_1.id_class(rje_3.id_protected.id_byte(f3 * f5 * -30.0f));
        this.id_class(ml_1, hx_1, n, rdn_32);
        ml_1.id_break();
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rpZ_2 rpZ_22) {
        this.id_byte.A().id_class(((cb_3)this.id_byte.id_class[57]).id_final());
        ql_3 ql_32 = (ql_3)this.id_finally.id_class((cb_3)this.id_byte.id_class[57]);
        ml_1.id_class();
        float f = rpZ_22 == rpZ_2.RIGHT ? 1.0f : -1.0f;
        ml_1.id_class(rje_3.id_protected.id_byte(92.0f));
        ml_1.id_class(rje_3.id_break.id_byte(45.0f));
        ml_1.id_class(rje_3.id_case.id_byte(f * -41.0f));
        ml_1.id_class((double)(f * 0.3f), (double)-1.1f, (double)0.45f);
        if (rpZ_22 == rpZ_2.RIGHT) {
            ql_32.id_class(ml_1, hx_1, n, (cb_3)this.id_byte.id_class[57]);
        } else {
            ql_32.id_break(ml_1, hx_1, n, (cb_3)this.id_byte.id_class[57]);
        }
        ml_1.id_break();
    }

    private float id_class(float f) {
        float f2 = 1.0f - f / 45.0f + 0.1f;
        f2 = rfU_2.id_class(f2, 0.0f, 1.0f);
        return -rfU_2.id_break(f2 * (float)Math.PI) * 0.5f + 0.5f;
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rdn_3 rdn_32) {
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
        ml_1.id_class(rje_3.id_case.id_byte(180.0f));
        ml_1.id_class(0.38f, 0.38f, 0.38f);
        ml_1.id_class(-0.5, -0.5, 0.0);
        ml_1.id_class(0.0078125f, 0.0078125f, 0.0078125f);
        rrGb_1 rrGb_12 = rxI_2.id_break(rdn_32, (gm_3)this.id_byte.id_class[56]);
        Ok_1 ok_1 = hx_1.getBuffer(rrGb_12 == null ? id_class : id_break);
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        ok_1.id_class(rjV_22, -7.0f, 135.0f, 0.0f).id_break(255, 255, 255, 255).id_class(0.0f, 1.0f).id_break(n).id_class();
        ok_1.id_class(rjV_22, 135.0f, 135.0f, 0.0f).id_break(255, 255, 255, 255).id_class(1.0f, 1.0f).id_break(n).id_class();
        ok_1.id_class(rjV_22, 135.0f, -7.0f, 0.0f).id_break(255, 255, 255, 255).id_class(1.0f, 0.0f).id_break(n).id_class();
        ok_1.id_class(rjV_22, -7.0f, -7.0f, 0.0f).id_break(255, 255, 255, 255).id_class(0.0f, 0.0f).id_break(n).id_class();
        if (rrGb_12 != null) {
            ((Hh_1)this.id_byte.id_class[16]).id_catch().id_class(ml_1, hx_1, rrGb_12, false, n);
        }
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, float f, float f2, rpZ_2 rpZ_22) {
        boolean bl = rpZ_22 != rpZ_2.LEFT;
        float f3 = bl ? 1.0f : -1.0f;
        float f4 = rfU_2.id_byte(f2);
        float f5 = -0.3f * rfU_2.id_class(f4 * (float)Math.PI);
        float f6 = 0.4f * rfU_2.id_class(f4 * ((float)Math.PI * 2));
        float f7 = -0.4f * rfU_2.id_class(f2 * (float)Math.PI);
        ml_1.id_class((double)(f3 * (f5 + 0.64000005f)), (double)(f6 + -0.6f + f * -0.6f), (double)(f7 + -0.71999997f));
        ml_1.id_class(rje_3.id_protected.id_byte(f3 * 45.0f));
        float f8 = rfU_2.id_class(f2 * f2 * (float)Math.PI);
        float f9 = rfU_2.id_class(f4 * (float)Math.PI);
        ml_1.id_class(rje_3.id_protected.id_byte(f3 * f9 * 70.0f));
        ml_1.id_class(rje_3.id_case.id_byte(f3 * f8 * -20.0f));
        cb_3 cb_32 = (cb_3)this.id_byte.id_class[57];
        this.id_byte.A().id_class(cb_32.id_final());
        ml_1.id_class((double)(f3 * -1.0f), (double)3.6f, 3.5);
        ml_1.id_class(rje_3.id_case.id_byte(f3 * 120.0f));
        ml_1.id_class(rje_3.id_break.id_byte(200.0f));
        ml_1.id_class(rje_3.id_protected.id_byte(f3 * -135.0f));
        ml_1.id_class((double)(f3 * 5.6f), 0.0, 0.0);
        ql_3 ql_32 = (ql_3)this.id_finally.id_class(cb_32);
        if (bl) {
            ql_32.id_class(ml_1, hx_1, n, cb_32);
        } else {
            ql_32.id_break(ml_1, hx_1, n, cb_32);
        }
    }

    private void id_break(Ml_1 ml_1, rpZ_2 rpZ_22, float f) {
        int n = rpZ_22 == rpZ_2.RIGHT ? 1 : -1;
        ml_1.id_class((double)((float)n * 0.56f), (double)(-0.52f + f * -0.6f), (double)-0.72f);
    }
}

