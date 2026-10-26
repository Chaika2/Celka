/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.ly_3;
import celestial.rfH_2;
import celestial.yD_2;
import celestial.yK_2;
import celestial.ye_3;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Map;

public class yU_2
implements yD_2 {
    private final QY id_class;
    private final Map<Integer, List<ye_3>> id_break = Maps.newHashMap();

    public yU_2(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        ly_3 ly_32 = ((Hh_1)this.id_class.id_class[16]).id_finally();
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        rfH_2 rfH_22 = new rfH_2(ly_32.id_break().id_break, 0.0, ly_32.id_break().id_protected);
        this.id_break.forEach((n, list) -> {
            for (int i = 0; i < list.size(); ++i) {
                ye_3 ye_32 = (ye_3)list.get(i);
                if (!rfH_22.id_class(ye_32.id_class, 160.0)) continue;
                double d = (double)ye_32.id_class.b_() + 0.5;
                double d2 = (double)ye_32.id_class.c_() + 2.0 + (double)i * 0.25;
                double d3 = (double)ye_32.id_class.d_() + 0.5;
                int n2 = ye_32.id_protected ? -16711936 : -3355444;
                yK_2.id_class(ye_32.id_byte, d, d2, d3, n2);
            }
        });
        RenderSystem.enableDepthTest();
        RenderSystem.enableTexture();
        RenderSystem.popMatrix();
    }

    @Override
    public void id_class() {
        this.id_break.clear();
    }

    public void id_class(int n, List<ye_3> list) {
        this.id_break.put(n, list);
    }
}

