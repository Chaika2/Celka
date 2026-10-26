/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHR;
import celestial.rpF_2;

public class rHo_1
implements rpF_2 {
    public final /* synthetic */ rHR id_class;

    public rHo_1(rHR rHR2) {
        this.id_class = rHR2;
    }

    @Override
    public int id_class() {
        return 1;
    }

    @Override
    public void id_class(int n, int n2) {
        if (n == 0) {
            this.id_class.id_class(n2);
        }
    }

    @Override
    public int id_class(int n) {
        return n == 0 ? this.id_class.id_protected : 0;
    }
}

