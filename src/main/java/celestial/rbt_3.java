/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.rBl_1;
import celestial.rbF_2;

public class rbt_3
extends rBl_1 {
    public final /* synthetic */ rbF_2 id_break;

    public rbt_3(rbF_2 rbF_22, aA_2 aA_22, double d, boolean bl) {
        this.id_break = rbF_22;
        super(aA_22, d, bl);
    }

    @Override
    public boolean id_class() {
        return super.id_class() && this.id_break.T_() && !this.id_break.su();
    }

    @Override
    public boolean id_break() {
        return super.id_break() && this.id_break.T_() && !this.id_break.su();
    }
}

