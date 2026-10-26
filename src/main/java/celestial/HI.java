/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HY;
import celestial.rrWX;
import com.mojang.blaze3d.systems.RenderSystem;

public final class HI
extends HY {
    private final float S;
    private final float s;

    public HI(float f, float f2) {
        super("offset_texturing", () -> {
            RenderSystem.matrixMode(5890);
            RenderSystem.pushMatrix();
            RenderSystem.loadIdentity();
            RenderSystem.translatef(f, f2, 0.0f);
            RenderSystem.matrixMode(5888);
        }, () -> {
            RenderSystem.matrixMode(5890);
            RenderSystem.popMatrix();
            RenderSystem.matrixMode(5888);
        });
        this.S = f;
        this.s = f2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            HI hI = (HI)object;
            return Float.compare(hI.S, this.S) == 0 && Float.compare(hI.s, this.s) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return rrWX.id_class(this.S, this.s);
    }
}

