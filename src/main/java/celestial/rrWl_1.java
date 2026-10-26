/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LN;
import celestial.LZ;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rjV_2;
import celestial.rrWC;
import celestial.yb_3;
import celestial.yk_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class rrWl_1 {
    public static void id_class(rjV_2 rjV_22, rrWC[] rrWCArray, int n) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        lD_2 lD_22 = yb_3.id_class().id_byte();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.defaultBlendFunc();
        lD_22.id_class(7, ju_3.id_this);
        for (int i = 0; i < rrWCArray.length; ++i) {
            int n2;
            rrWC rrWC2 = rrWCArray[i];
            if (rrWC2 == null) continue;
            int n3 = rrWC2.id_class();
            int n4 = rrWC2.id_break();
            int n5 = rrWC2.id_byte();
            int n6 = rrWC2.id_protected();
            if (n3 < n5) {
                n2 = n3;
                n3 = n5;
                n5 = n2;
            }
            if (n4 < n6) {
                n2 = n4;
                n4 = n6;
                n6 = n2;
            }
            lD_22.id_class(rjV_22, (float)n3, (float)n6, 0.0f).id_class(f2, f3, f4, f).id_class();
            lD_22.id_class(rjV_22, (float)n5, (float)n6, 0.0f).id_class(f2, f3, f4, f).id_class();
            lD_22.id_class(rjV_22, (float)n5, (float)n4, 0.0f).id_class(f2, f3, f4, f).id_class();
            lD_22.id_class(rjV_22, (float)n3, (float)n4, 0.0f).id_class(f2, f3, f4, f).id_class();
        }
        lD_22.id_finally();
        yk_3.id_class(lD_22);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }

    public static int id_class(LZ lZ) {
        return LN.id_class(lZ);
    }

    public static int id_break(LZ lZ) {
        return LN.id_break(lZ);
    }
}

