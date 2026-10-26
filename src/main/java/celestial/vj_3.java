/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lg_1;
import celestial.Ml_1;
import celestial.ch_3;
import celestial.rCi_1;
import celestial.rdb_3;
import celestial.rxJ_2;
import celestial.vI_2;
import celestial.xd_3;

public class vj_3
extends Lg_1<vj_3> {
    public final /* synthetic */ vI_2 id_class;

    public vj_3(vI_2 vI_22) {
        this.id_class = vI_22;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        int n8;
        rdb_3 rdb_32 = this.id_class.id_extends.id_private.id_catch.get(n);
        this.id_class.id_extends.id_class(ml_1, n3 + 40, n2, rdb_32);
        for (n8 = 0; n8 < this.id_class.id_extends.id_private.id_class.size(); ++n8) {
            rCi_1<xd_3> rCi_12 = rdb_32 instanceof rxJ_2 ? this.id_class.id_extends.id_private.id_class.get(n8).id_break(((rxJ_2)rdb_32).id_catch()) : null;
            this.id_class(ml_1, rCi_12, n3 + this.id_class.id_extends.id_break(n8), n2, n % 2 == 0);
        }
        for (n8 = 0; n8 < this.id_class.id_extends.id_private.id_throws.size(); ++n8) {
            this.id_class(ml_1, this.id_class.id_extends.id_private.id_throws.get(n8).id_break(rdb_32), n3 + this.id_class.id_extends.id_break(n8 + this.id_class.id_extends.id_private.id_class.size()), n2, n % 2 == 0);
        }
    }

    protected void id_class(Ml_1 ml_1, rCi_1<?> rCi_12, int n, int n2, boolean bl) {
        String string = rCi_12 == null ? "-" : rCi_12.id_class(this.id_class.id_extends.id_finally.id_class(rCi_12));
        ch_3.id_byte(ml_1, this.id_class.id_extends.id_super, string, n - this.id_class.id_extends.id_super.id_break(string), n2 + 5, bl ? 0xFFFFFF : 0x909090);
    }
}

