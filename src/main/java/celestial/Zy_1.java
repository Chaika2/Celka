/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LV;
import celestial.QY;
import celestial.Zl_1;
import celestial.Zp_1;

public class Zy_1
extends LV<Zp_1> {
    public final /* synthetic */ Zl_1 id_class;

    public Zy_1(Zl_1 zl_1) {
        this.id_class = zl_1;
        super(zl_1.id_volatile, zl_1.id_package, zl_1.id_int, 80, zl_1.id_int - 37, 24);
        for (int i = 0; i < Zl_1.id_throws.size(); ++i) {
            this.id_break(new Zp_1(this));
        }
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if ((n == 257 || n == 335) && this.id_finally() != null) {
            ((Zp_1)this.id_finally()).id_class();
        }
        return false;
    }

    public static /* synthetic */ QY id_class(Zy_1 zy_1) {
        return zy_1.id_native;
    }

    @Override
    protected boolean id_class() {
        return this.id_class.id_catch() == this;
    }

    @Override
    public void id_class(Zp_1 zp_1) {
        super.id_class(zp_1);
        this.id_class.id_byte(zp_1 != null);
    }
}

