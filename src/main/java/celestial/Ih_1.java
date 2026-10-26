/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HP;
import celestial.Hr_1;
import celestial.IG;
import celestial.IM;
import celestial.Io_1;
import celestial.Ix_1;
import celestial.fj_3;
import celestial.ju_3;
import celestial.li_3;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rja_3;
import celestial.rje_3;
import celestial.rji_3;
import celestial.rjj_3;
import celestial.rjo_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrJy_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wD_2;
import celestial.wK_2;

public class Ih_1 {
    private static final float id_class = 1.0f / (float)Math.cos(0.3926991f) - 1.0f;
    private static final float id_break = 1.0f / (float)Math.cos(0.7853981852531433) - 1.0f;

    public void id_class(rje_3 rje_32, rjo_3 rjo_32) {
        if (rjo_32 != rjo_3.id_class()) {
            this.id_class(rje_32, new rje_3(0.5f, 0.5f, 0.5f), rjo_32.id_byte(), new rje_3(1.0f, 1.0f, 1.0f));
        }
    }

    private void id_class(rje_3 rje_32, rje_3 rje_33, rjV_2 rjV_22, rje_3 rje_34) {
        rji_3 rji_32 = new rji_3(rje_32.id_class() - rje_33.id_class(), rje_32.id_break() - rje_33.id_break(), rje_32.id_byte() - rje_33.id_byte(), 1.0f);
        rji_32.id_class(rjV_22);
        rji_32.id_class(rje_34);
        rje_32.id_break(rji_32.id_class() + rje_33.id_class(), rji_32.id_break() + rje_33.id_break(), rji_32.id_byte() + rje_33.id_byte());
    }

    public static rpr_3 id_class(int[] nArray) {
        int n = nArray.length / 4;
        int n2 = n * 2;
        rje_3 rje_32 = new rje_3(Float.intBitsToFloat(nArray[0]), Float.intBitsToFloat(nArray[1]), Float.intBitsToFloat(nArray[2]));
        rje_3 rje_33 = new rje_3(Float.intBitsToFloat(nArray[n]), Float.intBitsToFloat(nArray[n + 1]), Float.intBitsToFloat(nArray[n + 2]));
        rje_3 rje_34 = new rje_3(Float.intBitsToFloat(nArray[n2]), Float.intBitsToFloat(nArray[n2 + 1]), Float.intBitsToFloat(nArray[n2 + 2]));
        rje_3 rje_35 = rje_32.id_throws();
        rje_35.id_break(rje_33);
        rje_3 rje_36 = rje_34.id_throws();
        rje_36.id_break(rje_33);
        rje_3 rje_37 = rje_36.id_throws();
        rje_37.id_protected(rje_35);
        rje_37.id_protected();
        rpr_3 rpr_32 = null;
        float f = 0.0f;
        for (rpr_3 rpr_33 : rpr_3.values()) {
            rja_3 rja_32 = rpr_33.id_int();
            rje_3 rje_38 = new rje_3(rja_32.b_(), rja_32.c_(), rja_32.d_());
            float f2 = rje_37.id_byte(rje_38);
            if (!(f2 >= 0.0f) || !(f2 > f)) continue;
            f = f2;
            rpr_32 = rpr_33;
        }
        return rpr_32 == null ? rpr_3.UP : rpr_32;
    }

    private void id_class(int[] nArray, rpr_3 rpr_32) {
        float f;
        int n;
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        float[] fArray = new float[rpr_3.values().length];
        fArray[Hr_1.id_case] = 999.0f;
        fArray[Hr_1.id_throws] = 999.0f;
        fArray[Hr_1.id_protected] = 999.0f;
        fArray[Hr_1.id_byte] = -999.0f;
        fArray[Hr_1.id_break] = -999.0f;
        fArray[Hr_1.id_class] = -999.0f;
        int n2 = nArray.length / 4;
        for (int i = 0; i < 4; ++i) {
            n = n2 * i;
            float f2 = Float.intBitsToFloat(nArray2[n]);
            float f3 = Float.intBitsToFloat(nArray2[n + 1]);
            f = Float.intBitsToFloat(nArray2[n + 2]);
            if (f2 < fArray[Hr_1.id_case]) {
                fArray[Hr_1.id_case] = f2;
            }
            if (f3 < fArray[Hr_1.id_throws]) {
                fArray[Hr_1.id_throws] = f3;
            }
            if (f < fArray[Hr_1.id_protected]) {
                fArray[Hr_1.id_protected] = f;
            }
            if (f2 > fArray[Hr_1.id_byte]) {
                fArray[Hr_1.id_byte] = f2;
            }
            if (f3 > fArray[Hr_1.id_break]) {
                fArray[Hr_1.id_break] = f3;
            }
            if (!(f > fArray[Hr_1.id_class])) continue;
            fArray[Hr_1.id_class] = f;
        }
        li_3 li_32 = li_3.id_class(rpr_32);
        for (n = 0; n < 4; ++n) {
            int n3 = n2 * n;
            HP hP = li_32.id_class(n);
            f = fArray[hP.id_class];
            float f4 = fArray[hP.id_break];
            float f5 = fArray[hP.id_byte];
            nArray[n3] = Float.floatToRawIntBits(f);
            nArray[n3 + 1] = Float.floatToRawIntBits(f4);
            nArray[n3 + 2] = Float.floatToRawIntBits(f5);
            for (int i = 0; i < 4; ++i) {
                int n4 = n2 * i;
                float f6 = Float.intBitsToFloat(nArray2[n4]);
                float f7 = Float.intBitsToFloat(nArray2[n4 + 1]);
                float f8 = Float.intBitsToFloat(nArray2[n4 + 2]);
                if (!rfU_2.id_class(f, f6) || !rfU_2.id_class(f4, f7) || !rfU_2.id_class(f5, f8)) continue;
                nArray[n3 + 4] = nArray2[n4 + 4];
                nArray[n3 + 4 + 1] = nArray2[n4 + 4 + 1];
            }
        }
    }

    private void id_class(rje_3 rje_32, IM iM) {
        if (iM != null) {
            rje_3 rje_33;
            rje_3 rje_34 = switch (iM.id_break) {
                case rpB_2.X -> {
                    rje_33 = new rje_3(1.0f, 0.0f, 0.0f);
                    yield new rje_3(0.0f, 1.0f, 1.0f);
                }
                case rpB_2.Y -> {
                    rje_33 = new rje_3(0.0f, 1.0f, 0.0f);
                    yield new rje_3(1.0f, 0.0f, 1.0f);
                }
                case rpB_2.Z -> {
                    rje_33 = new rje_3(0.0f, 0.0f, 1.0f);
                    yield new rje_3(1.0f, 1.0f, 0.0f);
                }
                default -> throw new IllegalArgumentException("There are only 3 axes");
            };
            rjY_2 rjY_22 = new rjY_2(rje_33, iM.id_byte, true);
            if (iM.id_protected) {
                if (Math.abs(iM.id_byte) == 22.5f) {
                    rje_34.id_class(id_class);
                } else {
                    rje_34.id_class(id_break);
                }
                rje_34.id_byte(1.0f, 1.0f, 1.0f);
            } else {
                rje_34.id_break(1.0f, 1.0f, 1.0f);
            }
            this.id_class(rje_32, iM.id_class.id_throws(), new rjV_2(rjY_22), rje_34);
        }
    }

    public static wD_2 id_class(wD_2 wD_22, rpr_3 rpr_32, rjo_3 rjo_32, rqO_2 rqO_22) {
        float f;
        float f2;
        float f3;
        float f4;
        rjV_2 rjV_22 = Io_1.id_class(rjo_32, rpr_32, () -> "Unable to resolve UVLock for model: " + rqO_22).id_byte();
        float f5 = wD_22.id_class(wD_22.id_byte(0));
        float f6 = wD_22.id_break(wD_22.id_byte(0));
        rji_3 rji_32 = new rji_3(f5 / 16.0f, f6 / 16.0f, 0.0f, 1.0f);
        rji_32.id_class(rjV_22);
        float f7 = 16.0f * rji_32.id_class();
        float f8 = 16.0f * rji_32.id_break();
        float f9 = wD_22.id_class(wD_22.id_byte(2));
        float f10 = wD_22.id_break(wD_22.id_byte(2));
        rji_3 rji_33 = new rji_3(f9 / 16.0f, f10 / 16.0f, 0.0f, 1.0f);
        rji_33.id_class(rjV_22);
        float f11 = 16.0f * rji_33.id_class();
        float f12 = 16.0f * rji_33.id_break();
        if (Math.signum(f9 - f5) == Math.signum(f11 - f7)) {
            f4 = f7;
            f3 = f11;
        } else {
            f4 = f11;
            f3 = f7;
        }
        if (Math.signum(f10 - f6) == Math.signum(f12 - f8)) {
            f2 = f8;
            f = f12;
        } else {
            f2 = f12;
            f = f8;
        }
        float f13 = (float)Math.toRadians(wD_22.id_break);
        rje_3 rje_32 = new rje_3(rfU_2.id_break(f13), rfU_2.id_class(f13), 0.0f);
        rjj_3 rjj_32 = new rjj_3(rjV_22);
        rje_32.id_class(rjj_32);
        int n = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2(rje_32.id_break(), rje_32.id_class())) / 90.0)) * 90, 360);
        return new wD_2(new float[]{f4, f2, f3, f}, n);
    }

    private int[] id_class(wD_2 wD_22, fj_3 fj_32, rpr_3 rpr_32, float[] fArray, rjo_3 rjo_32, IM iM, boolean bl) {
        int n = rrbb_3.rs() ? ju_3.id_volatile : ju_3.id_native;
        int[] nArray = new int[n];
        for (int i = 0; i < 4; ++i) {
            this.id_class(nArray, i, rpr_32, wD_22, fArray, fj_32, rjo_32, iM, bl);
        }
        return nArray;
    }

    private float[] id_class(rje_3 rje_32, rje_3 rje_33) {
        float[] fArray = new float[rpr_3.values().length];
        fArray[Hr_1.id_case] = rje_32.id_class() / 16.0f;
        fArray[Hr_1.id_throws] = rje_32.id_break() / 16.0f;
        fArray[Hr_1.id_protected] = rje_32.id_byte() / 16.0f;
        fArray[Hr_1.id_byte] = rje_33.id_class() / 16.0f;
        fArray[Hr_1.id_break] = rje_33.id_break() / 16.0f;
        fArray[Hr_1.id_class] = rje_33.id_byte() / 16.0f;
        return fArray;
    }

    private void id_class(int[] nArray, int n, rpr_3 rpr_32, wD_2 wD_22, float[] fArray, fj_3 fj_32, rjo_3 rjo_32, IM iM, boolean bl) {
        HP hP = li_3.id_class(rpr_32).id_class(n);
        rje_3 rje_32 = new rje_3(fArray[hP.id_class], fArray[hP.id_break], fArray[hP.id_byte]);
        this.id_class(rje_32, iM);
        this.id_class(rje_32, rjo_32);
        rrJy_1.id_class(rje_32);
        this.id_class(nArray, n, rje_32, fj_32, wD_22);
    }

    private void id_class(int[] nArray, int n, rje_3 rje_32, fj_3 fj_32, wD_2 wD_22) {
        int n2 = nArray.length / 4;
        int n3 = n * n2;
        nArray[n3] = Float.floatToRawIntBits(rje_32.id_class());
        nArray[n3 + 1] = Float.floatToRawIntBits(rje_32.id_break());
        nArray[n3 + 2] = Float.floatToRawIntBits(rje_32.id_byte());
        nArray[n3 + 3] = -1;
        nArray[n3 + 4] = Float.floatToRawIntBits(fj_32.id_class((double)wD_22.id_class(n)));
        nArray[n3 + 4 + 1] = Float.floatToRawIntBits(fj_32.id_break((double)wD_22.id_break(n)));
    }

    public wK_2 id_class(rje_3 rje_32, rje_3 rje_33, IG iG, fj_3 fj_32, rpr_3 rpr_32, Ix_1 ix_1, IM iM, boolean bl, rqO_2 rqO_22) {
        wD_2 wD_22 = iG.id_protected;
        if (ix_1.id_break()) {
            wD_22 = Ih_1.id_class(iG.id_protected, rpr_32, ix_1.id_class(), rqO_22);
        }
        float[] fArray = new float[wD_22.id_class.length];
        System.arraycopy(wD_22.id_class, 0, fArray, 0, fArray.length);
        float f = fj_32.id_final();
        float f2 = (wD_22.id_class[0] + wD_22.id_class[0] + wD_22.id_class[2] + wD_22.id_class[2]) / 4.0f;
        float f3 = (wD_22.id_class[1] + wD_22.id_class[1] + wD_22.id_class[3] + wD_22.id_class[3]) / 4.0f;
        wD_22.id_class[0] = rfU_2.id_catch(f, wD_22.id_class[0], f2);
        wD_22.id_class[2] = rfU_2.id_catch(f, wD_22.id_class[2], f2);
        wD_22.id_class[1] = rfU_2.id_catch(f, wD_22.id_class[1], f3);
        wD_22.id_class[3] = rfU_2.id_catch(f, wD_22.id_class[3], f3);
        boolean bl2 = rrxr_3.rx.id_byte() ? false : bl;
        int[] nArray = this.id_class(wD_22, fj_32, rpr_32, this.id_class(rje_32, rje_33), ix_1.id_class(), iM, bl2);
        rpr_3 rpr_33 = Ih_1.id_class(nArray);
        System.arraycopy(fArray, 0, wD_22.id_class, 0, fArray.length);
        if (iM == null) {
            this.id_class(nArray, rpr_33);
        }
        return new wK_2(nArray, iG.id_break, rpr_33, fj_32, bl);
    }
}

