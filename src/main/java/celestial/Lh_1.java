/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LS;
import celestial.Lb_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cY_2;
import celestial.ch_3;
import celestial.rgP_2;

public class Lh_1
implements LS {
    private final int id_class;
    private final boolean id_break;

    @Override
    public rgP_2 id_byte() {
        return this.id_class < 0 ? Lb_1.id_catch : Lb_1.id_private;
    }

    public Lh_1(int n, boolean bl) {
        this.id_class = n;
        this.id_break = bl;
    }

    @Override
    public void id_class(Lb_1 lb_1) {
        lb_1.id_native += this.id_class;
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, int n) {
        QY.id_instanceof().A().id_class(cY_2.id_class);
        if (this.id_class < 0) {
            ch_3.id_class(ml_1, 0, 0, 144.0f, 0.0f, 16, 16, 256, 256);
        } else {
            ch_3.id_class(ml_1, 0, 0, 160.0f, 0.0f, 16, 16, 256, 256);
        }
    }

    @Override
    public boolean id_protected() {
        return this.id_break;
    }
}

