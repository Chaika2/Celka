/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdb_3;
import celestial.rlr_3;
import celestial.rxJ_2;
import celestial.vI_2;
import java.util.Comparator;

public class vf_3
implements Comparator<rdb_3> {
    public final /* synthetic */ vI_2 id_class;

    public vf_3(vI_2 vI_22) {
        this.id_class = vI_22;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rdb_3)object, (rdb_3)object2);
    }

    public int id_class(rdb_3 rdb_32, rdb_3 rdb_33) {
        int n;
        int n2;
        if (this.id_class.id_implements == null) {
            n2 = 0;
            n = 0;
        } else if (this.id_class.id_class.contains(this.id_class.id_implements)) {
            rlr_3<?> rlr_32 = this.id_class.id_implements;
            n2 = rdb_32 instanceof rxJ_2 ? this.id_class.id_extends.id_finally.id_class(rlr_32, ((rxJ_2)rdb_32).id_catch()) : -1;
            n = rdb_33 instanceof rxJ_2 ? this.id_class.id_extends.id_finally.id_class(rlr_32, ((rxJ_2)rdb_33).id_catch()) : -1;
        } else {
            rlr_3<?> rlr_33 = this.id_class.id_implements;
            n2 = this.id_class.id_extends.id_finally.id_class(rlr_33, rdb_32);
            n = this.id_class.id_extends.id_finally.id_class(rlr_33, rdb_33);
        }
        return n2 == n ? this.id_class.id_finally * Integer.compare(rdb_3.id_class(rdb_32), rdb_3.id_class(rdb_33)) : this.id_class.id_finally * Integer.compare(n2, n);
    }
}

