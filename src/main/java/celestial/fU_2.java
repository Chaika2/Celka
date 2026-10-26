/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rHO;
import celestial.rHX;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rqO_2;
import java.util.List;

public class fU_2
extends jW_2<rHO> {
    public static final rqO_2 id_class = new rqO_2("textures/entity/beacon_beam.png");

    public fU_2(jz_3 jz_32) {
        super(jz_32);
    }

    private static void id_class(rjV_2 rjV_22, rjj_3 rjj_32, Ok_1 ok_1, float f, float f2, float f3, float f4, int n, float f5, float f6, float f7, float f8) {
        ok_1.id_class(rjV_22, f5, (float)n, f6).id_class(f, f2, f3, f4).id_class(f7, f8).id_byte(fZ_2.id_class).id_break(0xF000F0).id_class(rjj_32, 0.0f, 1.0f, 0.0f).id_class();
    }

    @Override
    public boolean id_class(rHO rHO2) {
        return true;
    }

    private static void id_class(rjV_2 rjV_22, rjj_3 rjj_32, Ok_1 ok_1, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        fU_2.id_class(rjV_22, rjj_32, ok_1, f, f2, f3, f4, n2, f5, f6, f10, f11);
        fU_2.id_class(rjV_22, rjj_32, ok_1, f, f2, f3, f4, n, f5, f6, f10, f12);
        fU_2.id_class(rjV_22, rjj_32, ok_1, f, f2, f3, f4, n, f7, f8, f9, f12);
        fU_2.id_class(rjV_22, rjj_32, ok_1, f, f2, f3, f4, n2, f7, f8, f9, f11);
    }

    private static void id_class(Ml_1 ml_1, Hx_1 hx_1, float f, long l, int n, int n2, float[] fArray) {
        fU_2.id_class(ml_1, hx_1, id_class, f, 1.0f, l, n, n2, fArray, 0.2f, 0.25f);
    }

    public static void id_class(Ml_1 ml_1, Hx_1 hx_1, rqO_2 rqO_22, float f, float f2, long l, int n, int n2, float[] fArray, float f3, float f4) {
        int n3 = n + n2;
        ml_1.id_class();
        ml_1.id_class(0.5, 0.0, 0.5);
        float f5 = (float)Math.floorMod(l, 40L) + f;
        float f6 = n2 < 0 ? f5 : -f5;
        float f7 = rfU_2.id_private(f6 * 0.2f - (float)rfU_2.id_protected(f6 * 0.1f));
        float f8 = fArray[0];
        float f9 = fArray[1];
        float f10 = fArray[2];
        ml_1.id_class();
        ml_1.id_class(rje_3.id_protected.id_byte(f5 * 2.25f - 45.0f));
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = -f3;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = -f3;
        float f17 = 0.0f;
        float f18 = 1.0f;
        float f19 = -1.0f + f7;
        float f20 = (float)n2 * f2 * (0.5f / f3) + f19;
        fU_2.id_class(ml_1, hx_1.getBuffer(HU.id_protected(rqO_22, false)), f8, f9, f10, 1.0f, n, n3, 0.0f, f3, f3, 0.0f, f13, 0.0f, 0.0f, f16, 0.0f, 1.0f, f20, f19);
        ml_1.id_break();
        f11 = -f4;
        float f21 = -f4;
        f12 = -f4;
        f13 = -f4;
        f17 = 0.0f;
        f18 = 1.0f;
        f19 = -1.0f + f7;
        f20 = (float)n2 * f2 + f19;
        fU_2.id_class(ml_1, hx_1.getBuffer(HU.id_protected(rqO_22, true)), f8, f9, f10, 0.125f, n, n3, f11, f21, f4, f12, f13, f4, f4, f4, 0.0f, 1.0f, f20, f19);
        ml_1.id_break();
    }

    private static void id_class(Ml_1 ml_1, Ok_1 ok_1, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        MH mH = ml_1.id_byte();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        fU_2.id_class(rjV_22, rjj_32, ok_1, f, f2, f3, f4, n, n2, f5, f6, f7, f8, f13, f14, f15, f16);
        fU_2.id_class(rjV_22, rjj_32, ok_1, f, f2, f3, f4, n, n2, f11, f12, f9, f10, f13, f14, f15, f16);
        fU_2.id_class(rjV_22, rjj_32, ok_1, f, f2, f3, f4, n, n2, f7, f8, f11, f12, f13, f14, f15, f16);
        fU_2.id_class(rjV_22, rjj_32, ok_1, f, f2, f3, f4, n, n2, f9, f10, f5, f6, f13, f14, f15, f16);
    }

    @Override
    public void id_class(rHO rHO2, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        long l = rHO2.id_while().r();
        List<rHX> list = rHO2.id_catch();
        int n3 = 0;
        for (int i = 0; i < list.size(); ++i) {
            rHX rHX2 = list.get(i);
            fU_2.id_class(ml_1, hx_1, f, l, n3, i == list.size() - 1 ? 1024 : rHX2.id_byte(), rHX2.id_break());
            n3 += rHX2.id_byte();
        }
    }
}

