/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.fJ_2;
import celestial.fY_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class Cd_1
implements CJ {
    public String toString() {
        return "PARTICLE_SHEET_OPAQUE";
    }

    @Override
    public void id_class(lD_2 lD_22, fY_2 fY_22) {
        RenderSystem.disableBlend();
        RenderSystem.depthMask(true);
        fY_22.id_class(fJ_2.id_break);
        lD_22.id_class(7, ju_3.id_continue);
    }

    @Override
    public void id_class(yb_3 yb_32) {
        yb_32.id_break();
    }
}

