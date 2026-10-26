/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hn_1;
import com.mojang.blaze3d.systems.RenderSystem;

public class Hy_1
extends Hn_1 {
    private final String S;
    private final int s;

    public Hy_1(String string, int n) {
        super("depth_test", () -> {
            if (n != 519) {
                RenderSystem.enableDepthTest();
                RenderSystem.depthFunc(n);
            }
        }, () -> {
            if (n != 519) {
                RenderSystem.disableDepthTest();
                RenderSystem.depthFunc(515);
            }
        });
        this.S = string;
        this.s = n;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Hy_1 hy_1 = (Hy_1)object;
            return this.s == hy_1.s;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id_class + "[" + this.S + "]";
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.s);
    }
}

