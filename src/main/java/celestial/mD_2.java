/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.mo_3;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgn_3;

public class mD_2
extends LF {
    public final /* synthetic */ mo_3 id_class;

    public mD_2(mo_3 mo_32, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL) {
        this.id_class = mo_32;
        super(n, n2, n3, n4, rgP_22, lL);
    }

    @Override
    protected rVi_1 A_() {
        return super.A_().id_break(". ").id_class(this.id_class.S).id_break(" ").id_class(this.id_class.s);
    }

    @Override
    public rgP_2 C_() {
        return new rgn_3("options.generic_value", mo_3.id_private, new rgn_3("selectWorld.gameMode." + this.id_class.id_try.field_228217_e_));
    }
}

