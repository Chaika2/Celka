/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNH;
import celestial.rNL;
import celestial.rzV_2;
import celestial.rzh_3;

public class rNy_1
extends rzh_3<rNy_1> {
    private final rzV_2 id_class;
    private int id_break = 0;

    public rNy_1(rzV_2 rzV_22) {
        this.id_class = rzV_22;
    }

    public rNy_1 id_class(int n) {
        this.id_break = n;
        return this;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rNy_1 id_throws() {
        return this;
    }

    @Override
    public rNL id_case() {
        return new rNH(this.id_byte(), this.id_class, this.id_break);
    }
}

