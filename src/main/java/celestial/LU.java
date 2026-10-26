/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LK;
import celestial.LL;
import celestial.LR;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgn_3;

public class LU
extends LF {
    public final /* synthetic */ LR id_class;
    public final /* synthetic */ rgP_2 id_throws;

    public LU(LK lK, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL, LR lR, rgP_2 rgP_23) {
        this.id_class = lR;
        this.id_throws = rgP_23;
        super(n, n2, n3, n4, rgP_22, lL);
    }

    @Override
    protected rVi_1 A_() {
        return new rgn_3("narrator.controls.reset", this.id_throws);
    }
}

