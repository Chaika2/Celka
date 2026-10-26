/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fo_1;
import celestial.LA;
import celestial.LL;
import celestial.Ll_1;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rqO_2;

public class FK
extends Ll_1 {
    public final /* synthetic */ Fo_1 id_class;

    public FK(Fo_1 fo_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, rqO_2 rqO_22, int n8, int n9, LL lL, LA lA, rgP_2 rgP_22) {
        this.id_class = fo_1;
        super(n, n2, n3, n4, n5, n6, n7, rqO_22, n8, n9, lL, lA, rgP_22);
    }

    @Override
    protected rVi_1 A_() {
        return this.id_class.id_class(super.A_());
    }
}

