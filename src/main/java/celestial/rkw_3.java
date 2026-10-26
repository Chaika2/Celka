/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXu_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkj_3;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.xu_3;

public interface rkw_3<C extends rXu_1> {
    public rdn_3 id_byte();

    default public rqs_3<rkg_3> id_class() {
        return rqs_3.id_class();
    }

    public boolean id_class(C var1, rYB var2);

    public rdn_3 id_class(C var1);

    public boolean id_class(int var1, int var2);

    default public rqs_3<rdn_3> id_break(C c) {
        rqs_3<rdn_3> rqs_32 = rqs_3.id_class(c.id_else(), rdn_3.id_break);
        for (int i = 0; i < rqs_32.size(); ++i) {
            rdb_3 rdb_32 = c.id_extends(i).id_break();
            if (!rdb_32.id_int()) continue;
            rqs_32.set(i, new rdn_3(rdb_32.id_package()));
        }
        return rqs_32;
    }

    public rkj_3<?> id_catch();

    public rqO_2 id_case();

    default public boolean id_implements() {
        return false;
    }

    default public String id_protected() {
        return "";
    }

    default public rdn_3 id_private() {
        return new rdn_3(xu_3.PP);
    }

    public rkf_3<?> W_();
}

