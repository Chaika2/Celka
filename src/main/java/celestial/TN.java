/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.an_3;
import celestial.fZ_2;
import celestial.iB_2;
import celestial.qd_3;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rqO_2;
import celestial.tB_2;
import celestial.wh_3;

public class TN<T extends iB_2, M extends wh_3<T>>
extends tB_2<T, M> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/bee/bee_stinger.png");

    public TN(qd_3<T, M> qd_32) {
        super(qd_32);
    }

    @Override
    protected int id_class(T t) {
        return ((iB_2)t).SM();
    }

    private static void id_class(Ok_1 ok_1, rjV_2 rjV_22, rjj_3 rjj_32, float f, int n, float f2, float f3, int n2) {
        ok_1.id_class(rjV_22, f, (float)n, 0.0f).id_break(255, 255, 255, 255).id_class(f2, f3).id_byte(fZ_2.id_class).id_break(n2).id_class(rjj_32, 0.0f, 1.0f, 0.0f).id_class();
    }

    @Override
    protected void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, an_3 an_32, float f, float f2, float f3, float f4) {
        float f5 = rfU_2.id_byte(f * f + f3 * f3);
        float f6 = (float)(Math.atan2(f, f3) * 57.2957763671875);
        float f7 = (float)(Math.atan2(f2, f5) * 57.2957763671875);
        ml_1.id_class(0.0, 0.0, 0.0);
        ml_1.id_class(rje_3.id_protected.id_byte(f6 - 90.0f));
        ml_1.id_class(rje_3.id_case.id_byte(f7));
        float f8 = 0.0f;
        float f9 = 0.125f;
        float f10 = 0.0f;
        float f11 = 0.0625f;
        float f12 = 0.03125f;
        ml_1.id_class(rje_3.id_break.id_byte(45.0f));
        ml_1.id_class(0.03125f, 0.03125f, 0.03125f);
        ml_1.id_class(2.5, 0.0, 0.0);
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_protected(id_class));
        for (int i = 0; i < 4; ++i) {
            ml_1.id_class(rje_3.id_break.id_byte(90.0f));
            MH mH = ml_1.id_byte();
            rjV_2 rjV_22 = mH.id_class();
            rjj_3 rjj_32 = mH.id_break();
            TN.id_class(ok_1, rjV_22, rjj_32, -4.5f, -1, 0.0f, 0.0f, n);
            TN.id_class(ok_1, rjV_22, rjj_32, 4.5f, -1, 0.125f, 0.0f, n);
            TN.id_class(ok_1, rjV_22, rjj_32, 4.5f, 1, 0.125f, 0.0625f, n);
            TN.id_class(ok_1, rjV_22, rjj_32, -4.5f, 1, 0.0f, 0.0625f, n);
        }
    }
}

