/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.rfH_2;
import celestial.rjh_3;
import celestial.yD_2;
import celestial.yK_2;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Set;

public class pX_2
implements yD_2 {
    private final Set<rjh_3> id_class = Sets.newHashSet();

    private static void id_byte(rjh_3 rjh_32) {
        float f = 1.0f;
        rfH_2 rfH_22 = rjh_32.id_int();
        rfH_2 rfH_23 = rfH_22.id_byte(-1.0, -1.0, -1.0);
        rfH_2 rfH_24 = rfH_22.id_byte(1.0, 1.0, 1.0);
        yK_2.id_class(rfH_23, rfH_24, 0.2f, 1.0f, 0.2f, 0.15f);
    }

    private void id_class(double d, double d2, double d3) {
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        this.id_class.forEach(rjh_32 -> {
            if (rfH_22.id_class(rjh_32.id_int(), 60.0)) {
                pX_2.id_byte(rjh_32);
            }
        });
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        this.id_class(d, d2, d3);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.popMatrix();
    }

    public void id_class(rjh_3 rjh_32) {
        this.id_class.add(rjh_32);
    }

    @Override
    public void id_class() {
        this.id_class.clear();
    }

    public void id_break(rjh_3 rjh_32) {
        this.id_class.remove(rjh_32);
    }
}

