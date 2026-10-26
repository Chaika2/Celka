/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.ZJ;
import celestial.Zx_1;
import celestial.cN_2;
import celestial.rRm_1;
import celestial.rVi_1;
import celestial.rgP_2;

public class Zd_1
extends LF {
    public final /* synthetic */ ZJ id_class;
    public final /* synthetic */ rgP_2 id_throws;
    public final /* synthetic */ rRm_1 id_case;
    public final /* synthetic */ String id_catch;

    public Zd_1(Zx_1 zx_1, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL, ZJ zJ, rgP_2 rgP_23, rRm_1 rRm_12, String string) {
        this.id_class = zJ;
        this.id_throws = rgP_23;
        this.id_case = rRm_12;
        this.id_catch = string;
        super(n, n2, n3, n4, rgP_22, lL);
    }

    @Override
    protected rVi_1 A_() {
        return cN_2.id_class(this.id_throws, this.id_case.id_class()).id_break("\n").id_break(this.id_catch);
    }
}

