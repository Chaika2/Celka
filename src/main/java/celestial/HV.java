/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hn_1;
import com.mojang.blaze3d.systems.RenderSystem;

public class HV
extends Hn_1 {
    private final boolean S;

    public HV(boolean bl) {
        super("shade_model", () -> RenderSystem.shadeModel(bl ? 7425 : 7424), () -> RenderSystem.shadeModel(7424));
        this.S = bl;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            HV hV = (HV)object;
            return this.S == hV.S;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id_class + "[" + (this.S ? "smooth" : "flat") + "]";
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.S);
    }
}

