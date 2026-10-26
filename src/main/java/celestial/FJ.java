/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fh_1;
import celestial.Lv_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.rgN_2;
import com.mojang.blaze3d.systems.RenderSystem;

public abstract class FJ
extends Lv_1 {
    private boolean id_class;

    protected FJ(int n, int n2) {
        super(n, n2, 22, 22, rgN_2.id_byte);
    }

    public void id_class(boolean bl) {
        this.id_class = bl;
    }

    protected abstract void id_class(Ml_1 var1);

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        QY.id_instanceof().A().id_class(Fh_1.id_class);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = 219;
        int n4 = 0;
        if (!this.id_int) {
            n4 += this.id_extends * 2;
        } else if (this.id_class) {
            n4 += this.id_extends * 1;
        } else if (this.B_()) {
            n4 += this.id_extends * 3;
        }
        this.id_break(ml_1, this.id_volatile, this.id_final, n4, 219, this.id_extends, this.id_native);
        this.id_class(ml_1);
    }

    public boolean id_private() {
        return this.id_class;
    }
}

