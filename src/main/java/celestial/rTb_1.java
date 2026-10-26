/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTG;
import celestial.rcd_3;
import celestial.rqO_2;

public class rTb_1
extends rTG {
    private final rcd_3 id_class;

    public rTb_1(int n, rcd_3 rcd_32) {
        super(n);
        this.id_class = rcd_32;
        rqO_2 rqO_22 = rqO_2.id_break(rcd_32.id_native("id"));
        if (rqO_22 != null) {
            rcd_32.id_class("id", rqO_22.toString());
        } else {
            rcd_32.id_class("id", "minecraft:pig");
        }
    }

    public rTb_1(rcd_3 rcd_32) {
        this(rcd_32.id_byte("Weight", 99) ? rcd_32.id_private("Weight") : 1, rcd_32.id_int("Entity"));
    }

    public rTb_1() {
        super(1);
        this.id_class = new rcd_3();
        this.id_class.id_class("id", "minecraft:pig");
    }

    public rcd_3 id_class() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("Entity", this.id_class);
        rcd_32.id_break("Weight", this.id_byte);
        return rcd_32;
    }

    public rcd_3 id_break() {
        return this.id_class;
    }
}

