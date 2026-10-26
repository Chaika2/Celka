/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hn_1;
import celestial.rrWX;
import com.mojang.blaze3d.systems.RenderSystem;

public class HC
extends Hn_1 {
    private final float S;

    public HC(float f) {
        super("alpha", () -> {
            if (f > 0.0f) {
                RenderSystem.enableAlphaTest();
                RenderSystem.alphaFunc(516, f);
            } else {
                RenderSystem.disableAlphaTest();
            }
        }, () -> {
            RenderSystem.disableAlphaTest();
            RenderSystem.defaultAlphaFunc();
        });
        this.S = f;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            if (!super.equals(object)) {
                return false;
            }
            return this.S == ((HC)object).S;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id_class + "[" + this.S + "]";
    }

    @Override
    public int hashCode() {
        return rrWX.id_class(super.hashCode(), this.S);
    }
}

