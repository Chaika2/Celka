/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.gm_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rKZ;
import celestial.rKv_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rje_3;
import celestial.roC_2;
import celestial.yD_2;
import celestial.yX_2;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class pr_3
implements yD_2 {
    private final QY id_class;

    public pr_3(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        gm_3 gm_32 = (gm_3)this.id_class.id_class[56];
        RenderSystem.pushMatrix();
        RenderSystem.disableBlend();
        RenderSystem.disableTexture();
        RenderSystem.enableDepthTest();
        rfH_2 rfH_22 = new rfH_2(d, 0.0, d3);
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(5, ju_3.id_this);
        for (int i = -32; i <= 32; i += 16) {
            for (int j = -32; j <= 32; j += 16) {
                roC_2 roC_22 = gm_32.id_volatile(rfH_22.id_break(i, 0, j));
                for (Map.Entry<rKv_1, rKZ> entry : roC_22.id_native()) {
                    rKv_1 rKv_12 = entry.getKey();
                    rfj_3 rfj_32 = roC_22.id_private();
                    rje_3 rje_32 = this.id_class(rKv_12);
                    for (int k = 0; k < 16; ++k) {
                        for (int i2 = 0; i2 < 16; ++i2) {
                            int n = rfj_32.id_break * 16 + k;
                            int n2 = rfj_32.id_byte * 16 + i2;
                            float f = (float)((double)((float)gm_32.id_class(rKv_12, n, n2) + (float)rKv_12.ordinal() * 0.09375f) - d2);
                            yX_2.id_class(lD_22, (double)((float)n + 0.25f) - d, f, (double)((float)n2 + 0.25f) - d3, (double)((float)n + 0.75f) - d, f + 0.09375f, (double)((float)n2 + 0.75f) - d3, rje_32.id_class(), rje_32.id_break(), rje_32.id_byte(), 1.0f);
                        }
                    }
                }
            }
        }
        yb_32.id_break();
        RenderSystem.enableTexture();
        RenderSystem.popMatrix();
    }

    private rje_3 id_class(rKv_1 rKv_12) {
        switch (rKv_12) {
            case WORLD_SURFACE_WG: {
                return new rje_3(1.0f, 1.0f, 0.0f);
            }
            case OCEAN_FLOOR_WG: {
                return new rje_3(1.0f, 0.0f, 1.0f);
            }
            case WORLD_SURFACE: {
                return new rje_3(0.0f, 0.7f, 0.0f);
            }
            case OCEAN_FLOOR: {
                return new rje_3(0.0f, 0.0f, 0.5f);
            }
            case MOTION_BLOCKING: {
                return new rje_3(0.0f, 0.3f, 0.3f);
            }
            case MOTION_BLOCKING_NO_LEAVES: {
                return new rje_3(0.0f, 0.5f, 0.5f);
            }
        }
        return new rje_3(0.0f, 0.0f, 0.0f);
    }
}

