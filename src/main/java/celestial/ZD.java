/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.Zo_1;
import celestial.cN_2;
import celestial.rgP_2;

public class ZD
extends LF {
    public final /* synthetic */ Zo_1 id_class;

    public ZD(Zo_1 zo_1, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL) {
        this.id_class = zo_1;
        super(n, n2, n3, n4, rgP_22, lL);
    }

    @Override
    public rgP_2 C_() {
        return cN_2.id_class(super.C_(), this.id_class.id_goto);
    }
}

