/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lu_1;
import celestial.cm_3;
import celestial.mo_3;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgn_3;

public class mK_2
extends Lu_1 {
    public final /* synthetic */ mo_3 id_class;

    public mK_2(mo_3 mo_32, cm_3 cm_32, int n, int n2, int n3, int n4, rgP_2 rgP_22) {
        this.id_class = mo_32;
        super(cm_32, n, n2, n3, n4, rgP_22);
    }

    @Override
    protected rVi_1 A_() {
        return super.A_().id_break(". ").id_class(new rgn_3("selectWorld.resultFolder")).id_break(" ").id_break(this.id_class.id_while);
    }
}

