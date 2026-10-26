/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Hx_1;
import celestial.MK;
import celestial.Ml_1;
import celestial.OP;
import celestial.rfH_2;
import celestial.rqR_2;
import celestial.yD_2;
import celestial.yK_2;
import celestial.yi_3;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class ya_3
implements yD_2 {
    private final Map<rfH_2, yi_3> id_class = Maps.newHashMap();

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        long l = rqR_2.id_break();
        this.id_class.entrySet().removeIf(entry -> l > ((yi_3)entry.getValue()).id_byte);
        this.id_class.forEach(this::id_class);
    }

    private void id_class(rfH_2 rfH_22, yi_3 yi_32) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
        RenderSystem.color4f(0.0f, 1.0f, 0.0f, 0.75f);
        RenderSystem.disableTexture();
        yK_2.id_class(rfH_22, 0.02f, yi_32.id_class(), yi_32.id_break(), yi_32.id_byte(), yi_32.id_protected());
        if (!yi_32.id_break.isEmpty()) {
            double d = (double)rfH_22.b_() + 0.5;
            double d2 = (double)rfH_22.c_() + 1.2;
            double d3 = (double)rfH_22.d_() + 0.5;
            yK_2.id_class(yi_32.id_break, d, d2, d3, -1, 0.01f, true, 0.0f, true);
        }
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.popMatrix();
    }

    @Override
    public void id_class() {
        this.id_class.clear();
    }

    public void id_class(rfH_2 rfH_22, int n, String string, int n2) {
        this.id_class.put(rfH_22, new yi_3(n, string, rqR_2.id_break() + (long)n2));
    }
}

