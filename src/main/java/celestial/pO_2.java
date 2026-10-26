/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cb_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.yD_2;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class pO_2
implements yD_2 {
    private final QY id_class;

    public pO_2(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        rYB rYB2 = (rYB)((cb_3)this.id_class.id_class[57]).id_throws[7];
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.lineWidth(2.0f);
        RenderSystem.disableTexture();
        RenderSystem.depthMask(false);
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_break(-6, -6, -6), rfH_22.id_break(6, 6, 6))) {
            xc_3 xc_32 = rYB2.id_byte(rfH_23);
            if (xc_32.id_class(xu_3.id_class)) continue;
            rjC_2 rjC_22 = xc_32.id_finally(rYB2, rfH_23);
            for (rfl_3 rfl_32 : rjC_22.id_protected()) {
                lD_2 lD_22;
                yb_3 yb_32;
                rfl_3 rfl_33 = rfl_32.id_class(rfH_23).id_class(0.002).id_protected(-d, -d2, -d3);
                double d4 = rfl_33.id_class;
                double d5 = rfl_33.id_break;
                double d6 = rfl_33.id_byte;
                double d7 = rfl_33.id_protected;
                double d8 = rfl_33.id_throws;
                double d9 = rfl_33.id_case;
                float f = 1.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.5f;
                if (xc_32.id_protected(rYB2, rfH_23, rpr_3.WEST)) {
                    yb_32 = yb_3.id_class();
                    lD_22 = yb_32.id_byte();
                    lD_22.id_class(5, ju_3.id_this);
                    lD_22.id_class(d4, d5, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d4, d5, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d4, d8, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d4, d8, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    yb_32.id_break();
                }
                if (xc_32.id_protected(rYB2, rfH_23, rpr_3.SOUTH)) {
                    yb_32 = yb_3.id_class();
                    lD_22 = yb_32.id_byte();
                    lD_22.id_class(5, ju_3.id_this);
                    lD_22.id_class(d4, d8, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d4, d5, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d7, d8, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d7, d5, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    yb_32.id_break();
                }
                if (xc_32.id_protected(rYB2, rfH_23, rpr_3.EAST)) {
                    yb_32 = yb_3.id_class();
                    lD_22 = yb_32.id_byte();
                    lD_22.id_class(5, ju_3.id_this);
                    lD_22.id_class(d7, d5, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d7, d5, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d7, d8, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d7, d8, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    yb_32.id_break();
                }
                if (xc_32.id_protected(rYB2, rfH_23, rpr_3.NORTH)) {
                    yb_32 = yb_3.id_class();
                    lD_22 = yb_32.id_byte();
                    lD_22.id_class(5, ju_3.id_this);
                    lD_22.id_class(d7, d8, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d7, d5, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d4, d8, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d4, d5, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    yb_32.id_break();
                }
                if (xc_32.id_protected(rYB2, rfH_23, rpr_3.DOWN)) {
                    yb_32 = yb_3.id_class();
                    lD_22 = yb_32.id_byte();
                    lD_22.id_class(5, ju_3.id_this);
                    lD_22.id_class(d4, d5, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d7, d5, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d4, d5, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d7, d5, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    yb_32.id_break();
                }
                if (!xc_32.id_protected(rYB2, rfH_23, rpr_3.UP)) continue;
                yb_32 = yb_3.id_class();
                lD_22 = yb_32.id_byte();
                lD_22.id_class(5, ju_3.id_this);
                lD_22.id_class(d4, d8, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                lD_22.id_class(d4, d8, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                lD_22.id_class(d7, d8, d6).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                lD_22.id_class(d7, d8, d9).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                yb_32.id_break();
            }
        }
        RenderSystem.depthMask(true);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
}

