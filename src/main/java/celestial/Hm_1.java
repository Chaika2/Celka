/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.QY;
import celestial.an_3;
import celestial.cb_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rjV_2;
import celestial.rlG_2;
import celestial.rqO_2;
import celestial.rrMh_1;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrxr_3;
import celestial.yb_3;
import celestial.yk_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class Hm_1 {
    private static final rqO_2 id_class = new rqO_2("textures/misc/underwater.png");

    public static void id_class(QY qY, Ml_1 ml_1) {
        RenderSystem.disableAlphaTest();
        cb_3 cb_32 = (cb_3)qY.id_class[57];
        if (!((cb_3)qY.id_class[57]).id_native() && ((an_3)((cb_3)qY.id_class[57])).id_class(rlG_2.id_break) && !rrxr_3.K.id_break(cb_32, ml_1)) {
            Hm_1.id_break(qY, ml_1);
        }
        RenderSystem.enableAlphaTest();
    }

    private static void id_break(QY qY, Ml_1 ml_1) {
        if (!rrbb_3.rs() || rrdZ.id_int()) {
            RenderSystem.enableTexture();
            qY.A().id_class(id_class);
            if (rrMh_1.id_class()) {
                rrMh_1.id_class(qY.A().id_break(id_class).id_new());
            }
            lD_2 lD_22 = yb_3.id_class().id_byte();
            float f = ((cb_3)qY.id_class[57]).rX();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            float f2 = -((Float)((cb_3)qY.id_class[57]).id_throws[15]).floatValue() / 64.0f;
            float f3 = ((Float)((cb_3)qY.id_class[57]).id_throws[16]).floatValue() / 64.0f;
            rjV_2 rjV_22 = ml_1.id_byte().id_class();
            lD_22.id_class(7, ju_3.id_return);
            lD_22.id_class(rjV_22, -1.0f, -1.0f, -0.5f).id_class(f, f, f, 0.1f).id_class(4.0f + f2, 4.0f + f3).id_class();
            lD_22.id_class(rjV_22, 1.0f, -1.0f, -0.5f).id_class(f, f, f, 0.1f).id_class(0.0f + f2, 4.0f + f3).id_class();
            lD_22.id_class(rjV_22, 1.0f, 1.0f, -0.5f).id_class(f, f, f, 0.1f).id_class(0.0f + f2, 0.0f + f3).id_class();
            lD_22.id_class(rjV_22, -1.0f, 1.0f, -0.5f).id_class(f, f, f, 0.1f).id_class(4.0f + f2, 0.0f + f3).id_class();
            lD_22.id_finally();
            yk_3.id_class(lD_22);
            RenderSystem.disableBlend();
        }
    }
}

