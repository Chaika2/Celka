/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HY;
import celestial.rqR_2;
import com.mojang.blaze3d.systems.RenderSystem;

public final class Hj_1
extends HY {
    private final int S;

    public Hj_1(int n) {
        super("portal_texturing", () -> {
            RenderSystem.matrixMode(5890);
            RenderSystem.pushMatrix();
            RenderSystem.loadIdentity();
            RenderSystem.translatef(0.5f, 0.5f, 0.0f);
            RenderSystem.scalef(0.5f, 0.5f, 1.0f);
            RenderSystem.translatef(17.0f / (float)n, (2.0f + (float)n / 1.5f) * ((float)(rqR_2.id_break() % 800000L) / 800000.0f), 0.0f);
            RenderSystem.rotatef(((float)(n * n) * 4321.0f + (float)n * 9.0f) * 2.0f, 0.0f, 0.0f, 1.0f);
            RenderSystem.scalef(4.5f - (float)n / 4.0f, 4.5f - (float)n / 4.0f, 1.0f);
            RenderSystem.mulTextureByProjModelView();
            RenderSystem.matrixMode(5888);
            RenderSystem.setupEndPortalTexGen();
        }, () -> {
            RenderSystem.matrixMode(5890);
            RenderSystem.popMatrix();
            RenderSystem.matrixMode(5888);
            RenderSystem.clearTexGen();
        });
        this.S = n;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Hj_1 hj_1 = (Hj_1)object;
            return this.S == hj_1.S;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.S);
    }
}

