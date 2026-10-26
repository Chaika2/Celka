/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rfH_2;
import celestial.yD_2;
import celestial.yX_2;
import celestial.yb_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Map;

public class yV_2
implements yD_2 {
    private final Map<rfH_2, rfH_2> id_class = Maps.newHashMap();
    private final Map<rfH_2, Float> id_break = Maps.newHashMap();
    private final List<rfH_2> id_byte = Lists.newArrayList();

    public void id_class(rfH_2 rfH_22, List<rfH_2> list, List<Float> list2) {
        for (int i = 0; i < list.size(); ++i) {
            this.id_class.put(list.get(i), rfH_22);
            this.id_break.put(list.get(i), list2.get(i));
        }
        this.id_byte.add(rfH_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        rfH_2 rfH_22 = new rfH_2(d, 0.0, d3);
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(5, ju_3.id_this);
        for (Map.Entry<rfH_2, rfH_2> object : this.id_class.entrySet()) {
            rfH_2 rfH_23 = object.getKey();
            rfH_2 rfH_24 = object.getValue();
            float f = (float)(rfH_24.b_() * 128 % 256) / 256.0f;
            float f2 = (float)(rfH_24.c_() * 128 % 256) / 256.0f;
            float f3 = (float)(rfH_24.d_() * 128 % 256) / 256.0f;
            float f4 = this.id_break.get(rfH_23).floatValue();
            if (!rfH_22.id_class(rfH_23, 160.0)) continue;
            yX_2.id_class(lD_22, (double)((float)rfH_23.b_() + 0.5f) - d - (double)f4, (double)((float)rfH_23.c_() + 0.5f) - d2 - (double)f4, (double)((float)rfH_23.d_() + 0.5f) - d3 - (double)f4, (double)((float)rfH_23.b_() + 0.5f) - d + (double)f4, (double)((float)rfH_23.c_() + 0.5f) - d2 + (double)f4, (double)((float)rfH_23.d_() + 0.5f) - d3 + (double)f4, f, f2, f3, 0.5f);
        }
        for (rfH_2 rfH_25 : this.id_byte) {
            if (!rfH_22.id_class(rfH_25, 160.0)) continue;
            yX_2.id_class(lD_22, (double)rfH_25.b_() - d, (double)rfH_25.c_() - d2, (double)rfH_25.d_() - d3, (double)((float)rfH_25.b_() + 1.0f) - d, (double)((float)rfH_25.c_() + 1.0f) - d2, (double)((float)rfH_25.d_() + 1.0f) - d3, 1.0f, 1.0f, 1.0f, 1.0f);
        }
        yb_32.id_break();
        RenderSystem.enableDepthTest();
        RenderSystem.enableTexture();
        RenderSystem.popMatrix();
    }
}

