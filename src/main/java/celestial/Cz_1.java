/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.fY_2;
import celestial.lD_2;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class Cz_1
implements CJ {
    public String toString() {
        return "CUSTOM";
    }

    @Override
    public void id_class(lD_2 lD_22, fY_2 fY_22) {
        RenderSystem.depthMask(true);
        RenderSystem.disableBlend();
    }

    @Override
    public void id_class(yb_3 yb_32) {
    }
}

