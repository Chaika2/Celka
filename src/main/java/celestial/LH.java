/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.Ly_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.rVi_1;
import celestial.rgn_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class LH
extends LF {
    private boolean id_class;

    public void id_byte(boolean bl) {
        this.id_class = bl;
    }

    public LH(int n, int n2, LL lL) {
        super(n, n2, 20, 20, new rgn_3("narrator.button.difficulty_lock"), lL);
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        QY.id_instanceof().A().id_class(LF.id_finally);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        Ly_1 ly_1 = !this.id_int ? (this.id_class ? Ly_1.LOCKED_DISABLED : Ly_1.UNLOCKED_DISABLED) : (this.B_() ? (this.id_class ? Ly_1.LOCKED_HOVER : Ly_1.UNLOCKED_HOVER) : (this.id_class ? Ly_1.LOCKED : Ly_1.UNLOCKED));
        this.id_break(ml_1, this.id_volatile, this.id_final, ly_1.id_class(), ly_1.id_break(), this.id_extends, this.id_native);
    }

    public boolean id_private() {
        return this.id_class;
    }

    @Override
    protected rVi_1 A_() {
        return super.A_().id_break(". ").id_class(this.id_private() ? new rgn_3("narrator.button.difficulty_lock.locked") : new rgn_3("narrator.button.difficulty_lock.unlocked"));
    }
}

