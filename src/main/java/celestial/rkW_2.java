/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdG_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;

public class rkW_2
extends rdb_3 {
    private final rdG_2 id_class;

    public rkW_2(rdG_2 rdG_22, rdO_2 rdO_22) {
        super(rdO_22.id_break(rdG_22.id_class()));
        this.id_class = rdG_22;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return this.id_class.id_case().id_class(rdn_33) || super.id_class(rdn_32, rdn_33);
    }

    @Override
    public int id_protected() {
        return this.id_class.id_throws();
    }

    public rdG_2 id_private() {
        return this.id_class;
    }
}

