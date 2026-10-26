/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.gm_3;
import celestial.rRo_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjh_3;
import celestial.yD_2;
import celestial.yK_2;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class pB_2
implements yD_2 {
    private final QY id_class;

    public pB_2(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        gm_3 gm_32 = (gm_3)this.id_class.id_class[56];
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_break(-10, -10, -10), rfH_22.id_break(10, 10, 10))) {
            int n = gm_32.id_class(rRo_1.SKY, rfH_23);
            float f = (float)(15 - n) / 15.0f * 0.5f + 0.16f;
            int n2 = rfU_2.id_case(f, 0.9f, 0.9f);
            long l = rjh_3.id_throws(rfH_23.id_package());
            if (longOpenHashSet.add(l)) {
                yK_2.id_class(gm_32.id_goto().id_class().id_class(rRo_1.SKY, rjh_3.id_class(l)), (double)(rjh_3.id_break(l) * 16 + 8), (double)(rjh_3.id_byte(l) * 16 + 8), (double)(rjh_3.id_protected(l) * 16 + 8), 0xFF0000, 0.3f);
            }
            if (n == 15) continue;
            yK_2.id_class(String.valueOf(n), (double)rfH_23.b_() + 0.5, (double)rfH_23.c_() + 0.25, (double)rfH_23.d_() + 0.5, n2);
        }
        RenderSystem.enableTexture();
        RenderSystem.popMatrix();
    }
}

