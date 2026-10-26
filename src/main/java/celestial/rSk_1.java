/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.iX_2;
import celestial.rBU;
import celestial.rjU_2;

public class rSk_1
extends rBU {
    protected final float id_private;

    public rSk_1(aA_2 aA_22, double d) {
        this(aA_22, d, 0.001f);
    }

    public rSk_1(aA_2 aA_22, double d, float f) {
        super(aA_22, d);
        this.id_private = f;
    }

    @Override
    protected rjU_2 id_catch() {
        if (this.id_class.Pa()) {
            rjU_2 rjU_22 = iX_2.id_break(this.id_class, 15, 7);
            return rjU_22 == null ? super.id_catch() : rjU_22;
        }
        return this.id_class.Sa().nextFloat() >= this.id_private ? iX_2.id_break(this.id_class, 10, 7) : super.id_catch();
    }
}

