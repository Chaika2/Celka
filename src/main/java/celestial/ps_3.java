/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rqR_2;
import celestial.yD_2;
import celestial.yK_2;
import celestial.yb_3;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Locale;
import java.util.Map;

public class ps_3
implements yD_2 {
    private final Map<Integer, rLC> id_class = Maps.newHashMap();
    private final Map<Integer, Float> id_break = Maps.newHashMap();
    private final Map<Integer, Long> id_byte = Maps.newHashMap();

    public static void id_class(rLC rLC2, float f, boolean bl, boolean bl2, double d, double d2, double d3) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.color4f(0.0f, 1.0f, 0.0f, 0.75f);
        RenderSystem.disableTexture();
        RenderSystem.lineWidth(6.0f);
        ps_3.id_break(rLC2, f, bl, bl2, d, d2, d3);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.popMatrix();
    }

    public static void id_class(rLC rLC2, double d, double d2, double d3) {
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(3, ju_3.id_this);
        for (int i = 0; i < rLC2.id_throws(); ++i) {
            rLq_1 rLq_12 = rLC2.id_class(i);
            if (ps_3.id_class(rLq_12.id_byte(), d, d2, d3) > 80.0f) continue;
            float f = (float)i / (float)rLC2.id_throws() * 0.33f;
            int n = i == 0 ? 0 : rfU_2.id_case(f, 0.9f, 0.9f);
            int n2 = n >> 16 & 0xFF;
            int n3 = n >> 8 & 0xFF;
            int n4 = n & 0xFF;
            lD_22.id_class((double)rLq_12.id_class - d + 0.5, (double)rLq_12.id_break - d2 + 0.5, (double)rLq_12.id_byte - d3 + 0.5).id_break(n2, n3, n4, 255).id_class();
        }
        yb_32.id_break();
    }

    private static float id_class(rfH_2 rfH_22, double d, double d2, double d3) {
        return (float)(Math.abs((double)rfH_22.b_() - d) + Math.abs((double)rfH_22.c_() - d2) + Math.abs((double)rfH_22.d_() - d3));
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        if (!this.id_class.isEmpty()) {
            long l = rqR_2.id_break();
            for (Integer n : this.id_class.keySet()) {
                rLC rLC2 = this.id_class.get(n);
                float f = this.id_break.get(n).floatValue();
                ps_3.id_class(rLC2, f, true, true, d, d2, d3);
            }
            for (Integer n : this.id_byte.keySet().toArray(new Integer[0])) {
                if (l - this.id_byte.get(n) <= 5000L) continue;
                this.id_class.remove(n);
                this.id_byte.remove(n);
            }
        }
    }

    public void id_class(int n, rLC rLC2, float f) {
        this.id_class.put(n, rLC2);
        this.id_byte.put(n, rqR_2.id_break());
        this.id_break.put(n, Float.valueOf(f));
    }

    private static void id_break(rLC rLC2, float f, boolean bl, boolean bl2, double d, double d2, double d3) {
        int n;
        ps_3.id_class(rLC2, d, d2, d3);
        rfH_2 rfH_22 = rLC2.id_volatile();
        if (ps_3.id_class(rfH_22, d, d2, d3) <= 80.0f) {
            yK_2.id_class(new rfl_3((float)rfH_22.b_() + 0.25f, (float)rfH_22.c_() + 0.25f, (double)rfH_22.d_() + 0.25, (float)rfH_22.b_() + 0.75f, (float)rfH_22.c_() + 0.75f, (float)rfH_22.d_() + 0.75f).id_protected(-d, -d2, -d3), 0.0f, 1.0f, 0.0f, 0.5f);
            for (n = 0; n < rLC2.id_throws(); ++n) {
                rLq_1 rLq_12 = rLC2.id_class(n);
                if (!(ps_3.id_class(rLq_12.id_byte(), d, d2, d3) <= 80.0f)) continue;
                float f2 = n == rLC2.id_case() ? 1.0f : 0.0f;
                float f3 = n == rLC2.id_case() ? 0.0f : 1.0f;
                yK_2.id_class(new rfl_3((float)rLq_12.id_class + 0.5f - f, (float)rLq_12.id_break + 0.01f * (float)n, (float)rLq_12.id_byte + 0.5f - f, (float)rLq_12.id_class + 0.5f + f, (float)rLq_12.id_break + 0.25f + 0.01f * (float)n, (float)rLq_12.id_byte + 0.5f + f).id_protected(-d, -d2, -d3), f2, 0.0f, f3, 0.5f);
            }
        }
        if (bl) {
            for (rLq_1 rLq_13 : rLC2.id_native()) {
                if (!(ps_3.id_class(rLq_13.id_byte(), d, d2, d3) <= 80.0f)) continue;
                yK_2.id_class(new rfl_3((float)rLq_13.id_class + 0.5f - f / 2.0f, (float)rLq_13.id_break + 0.01f, (float)rLq_13.id_byte + 0.5f - f / 2.0f, (float)rLq_13.id_class + 0.5f + f / 2.0f, (double)rLq_13.id_break + 0.1, (float)rLq_13.id_byte + 0.5f + f / 2.0f).id_protected(-d, -d2, -d3), 1.0f, 0.8f, 0.8f, 0.5f);
            }
            for (rLq_1 rLq_14 : rLC2.id_extends()) {
                if (!(ps_3.id_class(rLq_14.id_byte(), d, d2, d3) <= 80.0f)) continue;
                yK_2.id_class(new rfl_3((float)rLq_14.id_class + 0.5f - f / 2.0f, (float)rLq_14.id_break + 0.01f, (float)rLq_14.id_byte + 0.5f - f / 2.0f, (float)rLq_14.id_class + 0.5f + f / 2.0f, (double)rLq_14.id_break + 0.1, (float)rLq_14.id_byte + 0.5f + f / 2.0f).id_protected(-d, -d2, -d3), 0.8f, 1.0f, 1.0f, 0.5f);
            }
        }
        if (bl2) {
            for (n = 0; n < rLC2.id_throws(); ++n) {
                rLq_1 rLq_15 = rLC2.id_class(n);
                if (!(ps_3.id_class(rLq_15.id_byte(), d, d2, d3) <= 80.0f)) continue;
                yK_2.id_class(String.format("%s", new Object[]{rLq_15.id_native}), (double)rLq_15.id_class + 0.5, (double)rLq_15.id_break + 0.75, (double)rLq_15.id_byte + 0.5, -1, 0.02f, true, 0.0f, true);
                yK_2.id_class(String.format(Locale.ROOT, "%.2f", Float.valueOf(rLq_15.id_extends)), (double)rLq_15.id_class + 0.5, (double)rLq_15.id_break + 0.25, (double)rLq_15.id_byte + 0.5, -1, 0.02f, true, 0.0f, true);
            }
        }
    }
}

