/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.QY;
import celestial.rgP_2;

public abstract class Lv_1
extends LZ {
    @Override
    public void id_byte(double d, double d2) {
        this.id_catch();
    }

    public Lv_1(int n, int n2, int n3, int n4, rgP_2 rgP_22) {
        super(n, n2, n3, n4, rgP_22);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (this.id_int && this.id_new) {
            if (n != 257 && n != 32 && n != 335) {
                return false;
            }
            this.id_class(QY.id_instanceof().c());
            this.id_catch();
            return true;
        }
        return false;
    }

    public abstract void id_catch();
}

