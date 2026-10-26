/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LK;
import celestial.LL;
import celestial.LR;
import celestial.Vu_1;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgn_3;

public class LD
extends LF {
    public final /* synthetic */ LR id_class;
    public final /* synthetic */ Vu_1 id_throws;
    public final /* synthetic */ rgP_2 id_case;

    public LD(LK lK, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL, LR lR, Vu_1 vu_1, rgP_2 rgP_23) {
        this.id_class = lR;
        this.id_throws = vu_1;
        this.id_case = rgP_23;
        super(n, n2, n3, n4, rgP_22, lL);
    }

    @Override
    protected rVi_1 A_() {
        return this.id_throws.id_extends() ? new rgn_3("narrator.controls.unbound", this.id_case) : new rgn_3("narrator.controls.bound", this.id_case, super.A_());
    }
}

