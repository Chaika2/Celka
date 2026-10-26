/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IC;
import celestial.Ok_1;
import celestial.QY;
import celestial.Wg_1;
import celestial.fj_3;
import celestial.kZ_2;
import celestial.rCo_1;
import celestial.rRp_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXs_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjw_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrdk_1;
import celestial.rrxF_2;
import celestial.rrxr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xm_3;
import celestial.xu_3;
import celestial.yX_2;

public class Hs_1 {
    private final fj_3[] id_class = new fj_3[2];
    private final fj_3[] id_break = new fj_3[2];
    private fj_3 id_byte;

    private void id_class(Ok_1 ok_1, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, int n) {
        ok_1.id_class(d, d2, d3).id_class(f, f2, f3, 1.0f).id_class(f4, f5).id_break(n).id_class(0.0f, 1.0f, 0.0f).id_class();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean id_class(rRp_1 rRp_12, rfH_2 rfH_22, Ok_1 ok_1, rXE rXE2) {
        boolean bl;
        xc_3 xc_32 = rXE2.id_catch();
        try {
            Object object;
            fj_3[] fj_3Array;
            boolean bl2;
            if (rrbb_3.rs()) {
                rrdk_1.id_class(xc_32, ok_1);
            }
            fj_3[] fj_3Array2 = (bl2 = rXE2.id_class(rlG_2.id_byte)) ? this.id_class : this.id_break;
            xc_3 xc_33 = rRp_12.id_byte(rfH_22);
            if (rrxr_3.rc.id_byte() && (fj_3Array = (fj_3[])rrxr_3.id_private(rrxr_3.rc, rRp_12, rfH_22, rXE2)) != null) {
                fj_3Array2 = fj_3Array;
            }
            fj_3Array = ok_1.id_class(xc_32, rfH_22);
            int n = -1;
            float f = 1.0f;
            if (rrxr_3.L.id_byte() && (object = rrxr_3.id_private(rXE2.id_class(), rrxr_3.L, new Object[0])) != null && rrxr_3.T.id_byte()) {
                n = rrxr_3.id_byte(object, rrxr_3.T, rRp_12, rfH_22);
                f = (float)(n >> 24 & 0xFF) / 255.0f;
            }
            boolean bl3 = !Hs_1.id_class((rRq_1)rRp_12, rfH_22, rpr_3.UP, rXE2);
            boolean bl4 = Hs_1.id_class(rRp_12, rfH_22, rXE2, xc_33, rpr_3.DOWN) && !Hs_1.id_class((rRq_1)rRp_12, rfH_22, rpr_3.DOWN, 0.8888889f);
            boolean bl5 = Hs_1.id_class(rRp_12, rfH_22, rXE2, xc_33, rpr_3.NORTH);
            boolean bl6 = Hs_1.id_class(rRp_12, rfH_22, rXE2, xc_33, rpr_3.SOUTH);
            boolean bl7 = Hs_1.id_class(rRp_12, rfH_22, rXE2, xc_33, rpr_3.WEST);
            boolean bl8 = Hs_1.id_class(rRp_12, rfH_22, rXE2, xc_33, rpr_3.EAST);
            if (bl3 || bl4 || bl8 || bl7 || bl5 || bl6) {
                float f2;
                float f3;
                float f4;
                float f5;
                float f6;
                float f7;
                int n2;
                int n3;
                if (n < 0) {
                    n = rrbN_2.id_class(rRp_12, xc_32, rfH_22, (rrxF_2)fj_3Array);
                }
                float f8 = (float)(n >> 16 & 0xFF) / 255.0f;
                float f9 = (float)(n >> 8 & 0xFF) / 255.0f;
                float f10 = (float)(n & 0xFF) / 255.0f;
                int n4 = 0;
                float f11 = rRp_12.id_class(rpr_3.DOWN, true);
                float f12 = rRp_12.id_class(rpr_3.UP, true);
                float f13 = rRp_12.id_class(rpr_3.NORTH, true);
                float f14 = rRp_12.id_class(rpr_3.WEST, true);
                float f15 = this.id_class(rRp_12, rfH_22, rXE2.id_class());
                float f16 = this.id_class(rRp_12, rfH_22.id_protected(), rXE2.id_class());
                float f17 = this.id_class(rRp_12, rfH_22.id_extends().id_protected(), rXE2.id_class());
                float f18 = this.id_class(rRp_12, rfH_22.id_extends(), rXE2.id_class());
                double d = rfH_22.b_() & 0xF;
                double d2 = rfH_22.c_() & 0xF;
                double d3 = rfH_22.d_() & 0xF;
                if (rrbb_3.ry()) {
                    int n5 = rfH_22.b_() >> 4 << 4;
                    int n6 = rfH_22.c_() >> 4 << 4;
                    n3 = rfH_22.d_() >> 4 << 4;
                    int n7 = 8;
                    int n8 = n5 >> n7 << n7;
                    int n9 = n3 >> n7 << n7;
                    n2 = n5 - n8;
                    int n10 = n3 - n9;
                    d += (double)n2;
                    d2 += (double)n6;
                    d3 += (double)n10;
                }
                if (rrbb_3.rs() && rrdZ.q) {
                    ok_1.id_byte((float)(d + 0.5), (float)(d2 + 0.5), (float)(d3 + 0.5));
                }
                float f19 = 0.001f;
                float f20 = f7 = bl4 ? 0.001f : 0.0f;
                if (bl3 && !Hs_1.id_class((rRq_1)rRp_12, rfH_22, rpr_3.UP, Math.min(Math.min(f15, f16), Math.min(f17, f18)))) {
                    float f21;
                    float f22;
                    float f23;
                    float f24;
                    float f25;
                    float f26;
                    float f27;
                    float f28;
                    float f29;
                    n4 = 1;
                    f15 -= 0.001f;
                    f16 -= 0.001f;
                    f17 -= 0.001f;
                    f18 -= 0.001f;
                    rjU_2 rjU_22 = rXE2.id_byte(rRp_12, rfH_22);
                    if (rjU_22.id_break == 0.0 && rjU_22.id_protected == 0.0) {
                        var47_60 = fj_3Array2[0];
                        ok_1.id_break(var47_60);
                        f29 = var47_60.id_class(0.0);
                        f28 = var47_60.id_break(0.0);
                        f27 = f29;
                        f6 = var47_60.id_break(16.0);
                        f5 = var47_60.id_class(16.0);
                        f26 = f6;
                        f4 = f5;
                        f25 = f28;
                    } else {
                        var47_60 = fj_3Array2[1];
                        ok_1.id_break(var47_60);
                        f24 = (float)rfU_2.id_protected(rjU_22.id_protected, rjU_22.id_break) - 1.5707964f;
                        f23 = rfU_2.id_class(f24) * 0.25f;
                        f22 = rfU_2.id_break(f24) * 0.25f;
                        f21 = 8.0f;
                        f29 = var47_60.id_class((double)(8.0f + (-f22 - f23) * 16.0f));
                        f28 = var47_60.id_break((double)(8.0f + (-f22 + f23) * 16.0f));
                        f27 = var47_60.id_class((double)(8.0f + (-f22 + f23) * 16.0f));
                        f6 = var47_60.id_break((double)(8.0f + (f22 + f23) * 16.0f));
                        f5 = var47_60.id_class((double)(8.0f + (f22 + f23) * 16.0f));
                        f26 = var47_60.id_break((double)(8.0f + (f22 - f23) * 16.0f));
                        f4 = var47_60.id_class((double)(8.0f + (f22 - f23) * 16.0f));
                        f25 = var47_60.id_break((double)(8.0f + (-f22 - f23) * 16.0f));
                    }
                    float f30 = (f29 + f27 + f5 + f4) / 4.0f;
                    f24 = (f28 + f6 + f26 + f25) / 4.0f;
                    f23 = (float)fj_3Array2[0].id_protected() / (fj_3Array2[0].id_catch() - fj_3Array2[0].id_case());
                    f22 = (float)fj_3Array2[0].id_throws() / (fj_3Array2[0].id_implements() - fj_3Array2[0].id_private());
                    f21 = 4.0f / Math.max(f22, f23);
                    f29 = rfU_2.id_catch(f21, f29, f30);
                    f27 = rfU_2.id_catch(f21, f27, f30);
                    f5 = rfU_2.id_catch(f21, f5, f30);
                    f4 = rfU_2.id_catch(f21, f4, f30);
                    f28 = rfU_2.id_catch(f21, f28, f24);
                    f6 = rfU_2.id_catch(f21, f6, f24);
                    f26 = rfU_2.id_catch(f21, f26, f24);
                    f25 = rfU_2.id_catch(f21, f25, f24);
                    int n11 = this.id_class(rRp_12, rfH_22);
                    f3 = f12 * f8;
                    f2 = f12 * f9;
                    float f31 = f12 * f10;
                    this.id_class(ok_1, d + 0.0, d2 + (double)f15, d3 + 0.0, f3, f2, f31, f, f29, f28, n11);
                    this.id_class(ok_1, d + 0.0, d2 + (double)f16, d3 + 1.0, f3, f2, f31, f, f27, f6, n11);
                    this.id_class(ok_1, d + 1.0, d2 + (double)f17, d3 + 1.0, f3, f2, f31, f, f5, f26, n11);
                    this.id_class(ok_1, d + 1.0, d2 + (double)f18, d3 + 0.0, f3, f2, f31, f, f4, f25, n11);
                    if (rXE2.id_break(rRp_12, rfH_22.id_final())) {
                        this.id_class(ok_1, d + 0.0, d2 + (double)f15, d3 + 0.0, f3, f2, f31, f, f29, f28, n11);
                        this.id_class(ok_1, d + 1.0, d2 + (double)f18, d3 + 0.0, f3, f2, f31, f, f4, f25, n11);
                        this.id_class(ok_1, d + 1.0, d2 + (double)f17, d3 + 1.0, f3, f2, f31, f, f5, f26, n11);
                        this.id_class(ok_1, d + 0.0, d2 + (double)f16, d3 + 1.0, f3, f2, f31, f, f27, f6, n11);
                    }
                }
                if (bl4) {
                    ok_1.id_break(fj_3Array2[0]);
                    float f32 = fj_3Array2[0].id_case();
                    float f33 = fj_3Array2[0].id_catch();
                    float f34 = fj_3Array2[0].id_private();
                    float f35 = fj_3Array2[0].id_implements();
                    n2 = this.id_class(rRp_12, rfH_22.id_break());
                    float f36 = rRp_12.id_class(rpr_3.DOWN, true);
                    f5 = f36 * f8;
                    f4 = f36 * f9;
                    f6 = f36 * f10;
                    this.id_class(ok_1, d, d2 + (double)f7, d3 + 1.0, f5, f4, f6, f, f32, f35, n2);
                    this.id_class(ok_1, d, d2 + (double)f7, d3, f5, f4, f6, f, f32, f34, n2);
                    this.id_class(ok_1, d + 1.0, d2 + (double)f7, d3, f5, f4, f6, f, f33, f34, n2);
                    this.id_class(ok_1, d + 1.0, d2 + (double)f7, d3 + 1.0, f5, f4, f6, f, f33, f35, n2);
                    n4 = 1;
                }
                for (n3 = 0; n3 < 4; ++n3) {
                    boolean bl9;
                    boolean bl10;
                    rpr_3 rpr_32;
                    double d4;
                    double d5;
                    double d6;
                    double d7;
                    float f37;
                    float f38;
                    if (n3 == 0) {
                        f38 = f15;
                        f37 = f18;
                        d7 = d;
                        d6 = d + 1.0;
                        d5 = d3 + (double)0.001f;
                        d4 = d3 + (double)0.001f;
                        rpr_32 = rpr_3.NORTH;
                        bl10 = bl5;
                    } else if (n3 == 1) {
                        f38 = f17;
                        f37 = f16;
                        d7 = d + 1.0;
                        d6 = d;
                        d5 = d3 + 1.0 - (double)0.001f;
                        d4 = d3 + 1.0 - (double)0.001f;
                        rpr_32 = rpr_3.SOUTH;
                        bl10 = bl6;
                    } else if (n3 == 2) {
                        f38 = f16;
                        f37 = f15;
                        d7 = d + (double)0.001f;
                        d6 = d + (double)0.001f;
                        d5 = d3 + 1.0;
                        d4 = d3;
                        rpr_32 = rpr_3.WEST;
                        bl10 = bl7;
                    } else {
                        f38 = f18;
                        f37 = f17;
                        d7 = d + 1.0 - (double)0.001f;
                        d6 = d + 1.0 - (double)0.001f;
                        d5 = d3;
                        d4 = d3 + 1.0;
                        rpr_32 = rpr_3.EAST;
                        bl10 = bl8;
                    }
                    if (!bl10 || Hs_1.id_class((rRq_1)rRp_12, rfH_22, rpr_32, Math.max(f38, f37))) continue;
                    n4 = 1;
                    rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
                    fj_3 fj_32 = fj_3Array2[1];
                    f3 = 0.0f;
                    f2 = 0.0f;
                    boolean bl11 = bl9 = !bl2;
                    if (rrxr_3.v.id_byte()) {
                        boolean bl12 = bl9 = fj_3Array2[2] != null;
                    }
                    if (bl9) {
                        xc_3 xc_34 = rRp_12.id_byte(rfH_23);
                        xd_3 xd_32 = xc_34.id_break();
                        boolean bl13 = false;
                        if (rrxr_3.v.id_byte()) {
                            bl13 = rrxr_3.id_break((Object)xc_34, rrxr_3.v, rRp_12, rfH_23, rXE2);
                        }
                        if (bl13 || xd_32 instanceof xm_3 || xd_32 instanceof kZ_2 || xd_32 == xu_3.Sv) {
                            fj_32 = this.id_byte;
                        }
                        if (xd_32 == xu_3.PS || xd_32 == xu_3.bt) {
                            f3 = 0.9375f;
                            f2 = 0.9375f;
                        }
                        if (xd_32 instanceof Wg_1) {
                            Wg_1 wg_1 = (Wg_1)xd_32;
                            if (xc_34.id_byte(Wg_1.id_volatile) == rCo_1.BOTTOM) {
                                f3 = 0.5f;
                                f2 = 0.5f;
                            }
                        }
                    }
                    ok_1.id_break(fj_32);
                    if (f38 <= f3 && f37 <= f2) continue;
                    f3 = Math.min(f3, f38);
                    f2 = Math.min(f2, f37);
                    if (f3 > f19) {
                        f3 -= f19;
                    }
                    if (f2 > f19) {
                        f2 -= f19;
                    }
                    float f39 = fj_32.id_break((double)((1.0f - f3) * 16.0f * 0.5f));
                    float f40 = fj_32.id_break((double)((1.0f - f2) * 16.0f * 0.5f));
                    float f41 = fj_32.id_class(0.0);
                    float f42 = fj_32.id_class(8.0);
                    float f43 = fj_32.id_break((double)((1.0f - f38) * 16.0f * 0.5f));
                    float f44 = fj_32.id_break((double)((1.0f - f37) * 16.0f * 0.5f));
                    float f45 = fj_32.id_break(8.0);
                    int n12 = this.id_class(rRp_12, rfH_23);
                    float f46 = n3 < 2 ? rRp_12.id_class(rpr_3.NORTH, true) : rRp_12.id_class(rpr_3.WEST, true);
                    float f47 = 1.0f * f46 * f8;
                    float f48 = 1.0f * f46 * f9;
                    float f49 = 1.0f * f46 * f10;
                    this.id_class(ok_1, d7, d2 + (double)f38, d5, f47, f48, f49, f, f41, f43, n12);
                    this.id_class(ok_1, d6, d2 + (double)f37, d4, f47, f48, f49, f, f42, f44, n12);
                    this.id_class(ok_1, d6, d2 + (double)f7, d4, f47, f48, f49, f, f42, f40, n12);
                    this.id_class(ok_1, d7, d2 + (double)f7, d5, f47, f48, f49, f, f41, f39, n12);
                    if (fj_32 == this.id_byte) continue;
                    this.id_class(ok_1, d7, d2 + (double)f7, d5, f47, f48, f49, f, f41, f39, n12);
                    this.id_class(ok_1, d6, d2 + (double)f7, d4, f47, f48, f49, f, f42, f40, n12);
                    this.id_class(ok_1, d6, d2 + (double)f37, d4, f47, f48, f49, f, f42, f44, n12);
                    this.id_class(ok_1, d7, d2 + (double)f38, d5, f47, f48, f49, f, f41, f43, n12);
                }
                ok_1.id_break(null);
                n3 = n4;
                return n3 != 0;
            }
            bl = false;
        }
        finally {
            if (rrbb_3.rs()) {
                rrdk_1.id_class(ok_1);
            }
        }
        return bl;
    }

    public static boolean id_class(rRp_1 rRp_12, rfH_2 rfH_22, rXE rXE2, xc_3 xc_32, rpr_3 rpr_32) {
        return !Hs_1.id_class((rRq_1)rRp_12, rfH_22, xc_32, rpr_32) && !Hs_1.id_class((rRq_1)rRp_12, rfH_22, rpr_32, rXE2);
    }

    private void id_class(Ok_1 ok_1, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        ok_1.id_class(d, d2, d3).id_class(f, f2, f3, f4).id_class(f5, f6).id_break(n).id_class(0.0f, 1.0f, 0.0f).id_class();
    }

    private int id_class(rRp_1 rRp_12, rfH_2 rfH_22) {
        int n = yX_2.id_class(rRp_12, rfH_22);
        int n2 = yX_2.id_class(rRp_12, rfH_22.id_final());
        int n3 = n & 0xFF;
        int n4 = n2 & 0xFF;
        int n5 = n >> 16 & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        return (n3 > n4 ? n3 : n4) | (n5 > n6 ? n5 : n6) << 16;
    }

    private float id_class(rRq_1 rRq_12, rfH_2 rfH_22, rXs_1 rXs_12) {
        int n = 0;
        float f = 0.0f;
        for (int i = 0; i < 4; ++i) {
            rfH_2 rfH_23 = rfH_22.id_break(-(i & 1), 0, -(i >> 1 & 1));
            if (rRq_12.id_break(rfH_23.id_final()).id_class().id_class(rXs_12)) {
                return 1.0f;
            }
            rXE rXE2 = rRq_12.id_break(rfH_23);
            if (rXE2.id_class().id_class(rXs_12)) {
                float f2 = rXE2.id_class(rRq_12, rfH_23);
                if (f2 >= 0.8f) {
                    f += f2 * 10.0f;
                    n += 10;
                    continue;
                }
                f += f2;
                ++n;
                continue;
            }
            if (rRq_12.id_byte(rfH_23).id_byte().id_break()) continue;
            ++n;
        }
        return f / (float)n;
    }

    protected void id_class() {
        this.id_class[0] = QY.id_instanceof().id_extends().id_byte().id_break(xu_3.id_instanceof.id_continue()).id_throws();
        this.id_class[1] = IC.id_byte.id_byte();
        this.id_break[0] = QY.id_instanceof().id_extends().id_byte().id_break(xu_3.id_try.id_continue()).id_throws();
        this.id_break[1] = IC.id_protected.id_byte();
        this.id_byte = IC.id_throws.id_byte();
    }

    private static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32, rXE rXE2) {
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        rXE rXE3 = rRq_12.id_break(rfH_23);
        return rXE3.id_class().id_class(rXE2.id_class());
    }

    private static boolean id_class(rRq_1 rRq_12, rpr_3 rpr_32, float f, rfH_2 rfH_22, xc_3 xc_32) {
        if (xc_32.id_native()) {
            rjC_2 rjC_22 = rjw_3.id_class(0.0, 0.0, 0.0, 1.0, f, 1.0);
            rjC_2 rjC_23 = xc_32.id_byte(rRq_12, rfH_22);
            return rjw_3.id_class(rjC_22, rjC_23, rpr_32);
        }
        return false;
    }

    private static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32, float f) {
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        xc_3 xc_32 = rRq_12.id_byte(rfH_23);
        return Hs_1.id_class(rRq_12, rpr_32, f, rfH_23, xc_32);
    }

    private static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rpr_3 rpr_32) {
        return Hs_1.id_class(rRq_12, rpr_32.id_case(), 1.0f, rfH_22, xc_32);
    }
}

