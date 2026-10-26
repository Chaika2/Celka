/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rqO_2;

public class rdP_2
extends rdb_3 {
    private final int id_class;
    private final String id_break;

    public rdP_2(int n, String string, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_class = n;
        this.id_break = "textures/entity/horse/armor/horse_armor_" + string + ".png";
    }

    public rqO_2 id_catch() {
        return new rqO_2(this.id_break);
    }

    public int id_private() {
        return this.id_class;
    }
}

