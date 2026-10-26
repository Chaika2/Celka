/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.cN_2;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.vK_2;

public class vD_2
extends LF {
    public final /* synthetic */ vK_2 id_class;

    public vD_2(vK_2 vK_22, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL) {
        this.id_class = vK_22;
        super(n, n2, n3, n4, rgP_22, lL);
    }

    @Override
    protected rVi_1 A_() {
        return super.A_().id_break(". ").id_class(new rgn_3("selectWorld.mapFeatures.info"));
    }

    @Override
    public rgP_2 C_() {
        return cN_2.id_class(super.C_(), this.id_class.id_package.id_break());
    }
}

