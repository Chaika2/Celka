/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cb_3;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rlG_2;
import celestial.yD_2;
import celestial.yK_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class pJ_2
implements yD_2 {
    private final QY id_class;

    public pJ_2(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        rXE rXE2;
        rfH_2 rfH_22 = ((cb_3)this.id_class.id_class[57]).Bs();
        rYB rYB2 = (rYB)((cb_3)this.id_class.id_class[57]).id_throws[7];
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.color4f(0.0f, 1.0f, 0.0f, 0.75f);
        RenderSystem.disableTexture();
        RenderSystem.lineWidth(6.0f);
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_break(-10, -10, -10), rfH_22.id_break(10, 10, 10))) {
            rXE2 = rYB2.id_break(rfH_23);
            if (!rXE2.id_class(rlG_2.id_break)) continue;
            double d4 = (float)rfH_23.c_() + rXE2.id_class((rRq_1)rYB2, rfH_23);
            yK_2.id_class(new rfl_3((float)rfH_23.b_() + 0.01f, (float)rfH_23.c_() + 0.01f, (float)rfH_23.d_() + 0.01f, (float)rfH_23.b_() + 0.99f, d4, (float)rfH_23.d_() + 0.99f).id_protected(-d, -d2, -d3), 1.0f, 1.0f, 1.0f, 0.2f);
        }
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_break(-10, -10, -10), rfH_22.id_break(10, 10, 10))) {
            rXE2 = rYB2.id_break(rfH_23);
            if (!rXE2.id_class(rlG_2.id_break)) continue;
            yK_2.id_class(String.valueOf(rXE2.id_throws()), (double)rfH_23.b_() + 0.5, (double)((float)rfH_23.c_() + rXE2.id_class((rRq_1)rYB2, rfH_23)), (double)rfH_23.d_() + 0.5, -16777216);
        }
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
}

