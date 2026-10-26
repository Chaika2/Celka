/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hn_1;
import celestial.rrWX;
import com.mojang.blaze3d.systems.RenderSystem;

public class HK
extends Hn_1 {
    private final boolean S;
    private final boolean s;

    public HK(boolean bl, boolean bl2) {
        super("write_mask_state", () -> {
            if (!bl2) {
                RenderSystem.depthMask(bl2);
            }
            if (!bl) {
                RenderSystem.colorMask(bl, bl, bl, bl);
            }
        }, () -> {
            if (!bl2) {
                RenderSystem.depthMask(true);
            }
            if (!bl) {
                RenderSystem.colorMask(true, true, true, true);
            }
        });
        this.S = bl;
        this.s = bl2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            HK hK = (HK)object;
            return this.S == hK.S && this.s == hK.s;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id_class + "[writeColor=" + this.S + ", writeDepth=" + this.s + "]";
    }

    @Override
    public int hashCode() {
        return rrWX.id_class(this.S, this.s);
    }
}

