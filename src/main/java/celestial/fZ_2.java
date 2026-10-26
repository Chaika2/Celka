/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.fk_3;
import celestial.rrdZ;
import com.mojang.blaze3d.systems.RenderSystem;

public class fZ_2
implements AutoCloseable {
    public static final int id_class = fZ_2.id_class(0, 10);
    private final fk_3 id_break = new fk_3(16, 16, false);

    public fZ_2() {
        fN_2 fN_22 = this.id_break.id_break();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                if (i < 8) {
                    fN_22.id_class(j, i, -1308622593);
                    continue;
                }
                int n = (int)((1.0f - (float)j / 15.0f * 0.75f) * 255.0f);
                fN_22.id_class(j, i, n << 24 | 0xFFFFFF);
            }
        }
        RenderSystem.activeTexture(33985);
        this.id_break.id_super();
        RenderSystem.matrixMode(5890);
        RenderSystem.loadIdentity();
        float f = 0.06666667f;
        RenderSystem.scalef(0.06666667f, 0.06666667f, 0.06666667f);
        RenderSystem.matrixMode(5888);
        this.id_break.id_super();
        fN_22.id_class(0, 0, 0, 0, 0, fN_22.id_class(), fN_22.id_break(), false, true, false, false);
        RenderSystem.activeTexture(33984);
    }

    public static int id_class(boolean bl) {
        return bl ? 3 : 10;
    }

    public static int id_class(float f, boolean bl) {
        return fZ_2.id_class(fZ_2.id_class(f), fZ_2.id_class(bl));
    }

    public static int id_class(int n, int n2) {
        return n | n2 << 16;
    }

    public void id_class() {
        if (!rrdZ.a()) {
            RenderSystem.setupOverlayColor(this.id_break::id_new, 16);
        }
    }

    public static int id_class(float f) {
        return (int)(f * 15.0f);
    }

    @Override
    public void close() {
        this.id_break.close();
    }

    public void id_break() {
        if (!rrdZ.a()) {
            RenderSystem.teardownOverlayColor();
        }
    }
}

