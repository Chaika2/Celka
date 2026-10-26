/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.an_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.yD_2;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class yg_3
implements yD_2 {
    private final QY id_class;

    public yg_3(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        if (!rrdZ.id_new) {
            int n;
            if (rrbb_3.rs()) {
                rrdZ.Z();
            }
            RenderSystem.enableDepthTest();
            RenderSystem.shadeModel(7425);
            RenderSystem.enableAlphaTest();
            RenderSystem.defaultAlphaFunc();
            an_3 an_32 = ((Hh_1)this.id_class.id_class[16]).id_finally().id_catch();
            yb_3 yb_32 = yb_3.id_class();
            lD_2 lD_22 = yb_32.id_byte();
            double d4 = 0.0 - d2;
            double d5 = 256.0 - d2;
            RenderSystem.disableTexture();
            RenderSystem.disableBlend();
            double d6 = (double)((Integer)an_32.id_throws[51] << 4) - d;
            double d7 = (double)((Integer)an_32.id_throws[53] << 4) - d3;
            RenderSystem.lineWidth(1.0f);
            lD_22.id_class(3, ju_3.id_this);
            for (n = -16; n <= 32; n += 16) {
                for (int i = -16; i <= 32; i += 16) {
                    lD_22.id_class(d6 + (double)n, d4, d7 + (double)i).id_class(1.0f, 0.0f, 0.0f, 0.0f).id_class();
                    lD_22.id_class(d6 + (double)n, d4, d7 + (double)i).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d6 + (double)n, d5, d7 + (double)i).id_class(1.0f, 0.0f, 0.0f, 0.5f).id_class();
                    lD_22.id_class(d6 + (double)n, d5, d7 + (double)i).id_class(1.0f, 0.0f, 0.0f, 0.0f).id_class();
                }
            }
            for (n = 2; n < 16; n += 2) {
                lD_22.id_class(d6 + (double)n, d4, d7).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
                lD_22.id_class(d6 + (double)n, d4, d7).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6 + (double)n, d5, d7).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6 + (double)n, d5, d7).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
                lD_22.id_class(d6 + (double)n, d4, d7 + 16.0).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
                lD_22.id_class(d6 + (double)n, d4, d7 + 16.0).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6 + (double)n, d5, d7 + 16.0).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6 + (double)n, d5, d7 + 16.0).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
            }
            for (n = 2; n < 16; n += 2) {
                lD_22.id_class(d6, d4, d7 + (double)n).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
                lD_22.id_class(d6, d4, d7 + (double)n).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6, d5, d7 + (double)n).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6, d5, d7 + (double)n).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
                lD_22.id_class(d6 + 16.0, d4, d7 + (double)n).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
                lD_22.id_class(d6 + 16.0, d4, d7 + (double)n).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6 + 16.0, d5, d7 + (double)n).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6 + 16.0, d5, d7 + (double)n).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
            }
            for (n = 0; n <= 256; n += 2) {
                double d8 = (double)n - d2;
                lD_22.id_class(d6, d8, d7).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
                lD_22.id_class(d6, d8, d7).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6, d8, d7 + 16.0).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6 + 16.0, d8, d7 + 16.0).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6 + 16.0, d8, d7).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6, d8, d7).id_class(1.0f, 1.0f, 0.0f, 1.0f).id_class();
                lD_22.id_class(d6, d8, d7).id_class(1.0f, 1.0f, 0.0f, 0.0f).id_class();
            }
            yb_32.id_break();
            RenderSystem.lineWidth(2.0f);
            lD_22.id_class(3, ju_3.id_this);
            for (n = 0; n <= 16; n += 16) {
                for (int i = 0; i <= 16; i += 16) {
                    lD_22.id_class(d6 + (double)n, d4, d7 + (double)i).id_class(0.25f, 0.25f, 1.0f, 0.0f).id_class();
                    lD_22.id_class(d6 + (double)n, d4, d7 + (double)i).id_class(0.25f, 0.25f, 1.0f, 1.0f).id_class();
                    lD_22.id_class(d6 + (double)n, d5, d7 + (double)i).id_class(0.25f, 0.25f, 1.0f, 1.0f).id_class();
                    lD_22.id_class(d6 + (double)n, d5, d7 + (double)i).id_class(0.25f, 0.25f, 1.0f, 0.0f).id_class();
                }
            }
            for (n = 0; n <= 256; n += 16) {
                double d9 = (double)n - d2;
                lD_22.id_class(d6, d9, d7).id_class(0.25f, 0.25f, 1.0f, 0.0f).id_class();
                lD_22.id_class(d6, d9, d7).id_class(0.25f, 0.25f, 1.0f, 1.0f).id_class();
                lD_22.id_class(d6, d9, d7 + 16.0).id_class(0.25f, 0.25f, 1.0f, 1.0f).id_class();
                lD_22.id_class(d6 + 16.0, d9, d7 + 16.0).id_class(0.25f, 0.25f, 1.0f, 1.0f).id_class();
                lD_22.id_class(d6 + 16.0, d9, d7).id_class(0.25f, 0.25f, 1.0f, 1.0f).id_class();
                lD_22.id_class(d6, d9, d7).id_class(0.25f, 0.25f, 1.0f, 1.0f).id_class();
                lD_22.id_class(d6, d9, d7).id_class(0.25f, 0.25f, 1.0f, 0.0f).id_class();
            }
            yb_32.id_break();
            RenderSystem.lineWidth(1.0f);
            RenderSystem.enableBlend();
            RenderSystem.enableTexture();
            RenderSystem.shadeModel(7424);
            if (rrbb_3.rs()) {
                rrdZ.v();
            }
        }
    }
}

