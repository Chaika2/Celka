/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.rfj_3;
import celestial.rng_3;
import celestial.rqR_2;
import celestial.yD_2;
import celestial.yK_2;
import celestial.yY_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class yR_2
implements yD_2 {
    public final QY id_class;
    private double id_break = Double.MIN_VALUE;
    private final int id_byte;
    private yY_2 id_protected;

    public yR_2(QY qY) {
        this.id_byte = 12;
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        Object object;
        double d4 = rqR_2.id_byte();
        if (d4 - this.id_break > 3.0E9) {
            this.id_break = d4;
            object = this.id_class.id_this();
            this.id_protected = object != null ? new yY_2(this, (rng_3)object, d, d3) : null;
        }
        if (this.id_protected != null) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.lineWidth(2.0f);
            RenderSystem.disableTexture();
            RenderSystem.depthMask(false);
            object = this.id_protected.id_break.getNow(null);
            double d5 = ((Hh_1)this.id_class.id_class[16]).id_finally().id_break().id_byte * 0.85;
            for (Map.Entry<rfj_3, String> entry : this.id_protected.id_class.entrySet()) {
                rfj_3 rfj_32 = entry.getKey();
                Object object2 = entry.getValue();
                if (object != null) {
                    object2 = (String)object2 + (String)object.get(rfj_32);
                }
                String[] stringArray = ((String)object2).split("\n");
                int n = 0;
                for (String string : stringArray) {
                    yK_2.id_class(string, (double)((rfj_32.id_break << 4) + 8), d5 + (double)n, (double)((rfj_32.id_byte << 4) + 8), -1, 0.15f);
                    n -= 2;
                }
            }
            RenderSystem.depthMask(true);
            RenderSystem.enableTexture();
            RenderSystem.disableBlend();
        }
    }
}

