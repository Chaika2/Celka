/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lg_1;
import celestial.Ml_1;
import celestial.Ze_1;
import celestial.jj_3;

public class Za_1
extends Lg_1<Za_1> {
    public final jj_3 id_break;
    public final /* synthetic */ Ze_1 id_class;

    public Za_1(Ze_1 ze_1, jj_3 jj_32) {
        this.id_class = ze_1;
        this.id_break = jj_32;
    }

    private void id_class() {
        this.id_class.id_class(this);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        String string = this.id_break.toString();
        this.id_class.id_class.id_super.id_break(ml_1, string, Ze_1.id_class(this.id_class) / 2 - this.id_class.id_class.id_super.id_break(string) / 2, (float)n2 + 2.5f, 0xFFFFFF, true);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (n == 0) {
            this.id_class();
            return true;
        }
        return false;
    }
}

