/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.is_3;
import celestial.rBc_1;
import celestial.rbF_2;

public class rbA_2
extends rBc_1 {
    public final /* synthetic */ rbF_2 id_class;

    public rbA_2(rbF_2 rbF_22, rbF_2 rbF_23) {
        this.id_class = rbF_22;
        super(rbF_23, new Class[0]);
    }

    @Override
    protected void id_class(is_3 is_32, iB_2 iB_22) {
        if (is_32 instanceof rbF_2 && this.id_throws.id_while(iB_22)) {
            is_32.id_byte(iB_22);
        }
    }

    @Override
    public boolean id_break() {
        return this.id_class.T_() && super.id_break();
    }
}

