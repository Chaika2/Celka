/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.cN_2;
import celestial.mo_3;
import celestial.rgP_2;
import celestial.vK_2;

public class ve_3
extends LF {
    public final /* synthetic */ mo_3 id_class;
    public final /* synthetic */ vK_2 id_throws;

    public ve_3(vK_2 vK_22, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL, mo_3 mo_32) {
        this.id_throws = vK_22;
        this.id_class = mo_32;
        super(n, n2, n3, n4, rgP_22, lL);
    }

    @Override
    public rgP_2 C_() {
        return cN_2.id_class(super.C_(), this.id_throws.id_package.id_byte() && !this.id_class.id_class);
    }
}

