/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import org.lwjgl.opengl.GL11;

public class Mf_1 {
    private final int id_class;
    public boolean id_break;

    public Mf_1(int n) {
        this.id_class = n;
    }

    public void id_class(boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        if (bl != this.id_break) {
            this.id_break = bl;
            if (bl) {
                GL11.glEnable((int)this.id_class);
            } else {
                GL11.glDisable((int)this.id_class);
            }
        }
    }

    public void id_class() {
        this.id_class(false);
    }

    public void id_break() {
        this.id_class(true);
    }
}

