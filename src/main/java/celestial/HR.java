/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hn_1;
import celestial.QY;
import celestial.fY_2;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;

public class HR
extends Hn_1 {
    private final Optional<rqO_2> S;
    private final boolean s;
    private final boolean E;

    public HR(rqO_2 rqO_22, boolean bl, boolean bl2) {
        super("texture", () -> {
            RenderSystem.enableTexture();
            fY_2 fY_22 = QY.id_instanceof().A();
            fY_22.id_class(rqO_22);
            fY_22.id_byte().id_class(bl, bl2);
        }, () -> {});
        this.S = Optional.of(rqO_22);
        this.s = bl;
        this.E = bl2;
    }

    public HR() {
        super("texture", () -> RenderSystem.disableTexture(), () -> RenderSystem.enableTexture());
        this.S = Optional.empty();
        this.s = false;
        this.E = false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            HR hR = (HR)object;
            return this.S.equals(hR.S) && this.s == hR.s && this.E == hR.E;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id_class + "[" + this.S + "(blur=" + this.s + ", mipmap=" + this.E + ")]";
    }

    @Override
    public int hashCode() {
        return this.S.hashCode();
    }

    public boolean id_throws() {
        return this.s;
    }

    public boolean id_case() {
        return this.E;
    }

    protected Optional<rqO_2> id_protected() {
        return this.S;
    }
}

