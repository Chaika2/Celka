/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.Ml_1;
import celestial.Nf_1;
import celestial.Np_1;
import celestial.QY;
import celestial.rgN_2;
import celestial.rqn_3;
import celestial.vz_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class Ln_1
extends LF {
    private final boolean id_class;
    private final boolean id_throws;

    public Ln_1(int n, int n2, boolean bl, LL lL, boolean bl2) {
        super(n, n2, 23, 13, rgN_2.id_byte, lL);
        this.id_class = bl;
        this.id_throws = bl2;
    }

    @Override
    public void id_class(Nf_1 nf_1) {
        if (this.id_throws) {
            nf_1.id_class(Np_1.id_class(rqn_3.rS, 1.0f));
        }
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        QY.id_instanceof().A().id_class(vz_3.id_throws);
        int n3 = 0;
        int n4 = 192;
        if (this.B_()) {
            n3 += 23;
        }
        if (!this.id_class) {
            n4 += 13;
        }
        this.id_break(ml_1, this.id_volatile, this.id_final, n3, n4, 23, 13);
    }
}

