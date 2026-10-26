/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hl_1;
import com.mojang.blaze3d.systems.RenderSystem;

public class HH
extends Hl_1 {
    public HH(boolean bl) {
        super("cull", () -> {
            if (!bl) {
                RenderSystem.disableCull();
            }
        }, () -> {
            if (!bl) {
                RenderSystem.enableCull();
            }
        }, bl);
    }
}

