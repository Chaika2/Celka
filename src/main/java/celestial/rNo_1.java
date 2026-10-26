/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNl_1;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.rzL_2;
import celestial.rzO_2;
import celestial.rzr_3;
import celestial.rzx_3;

public class rNo_1
extends rzO_2 {
    public final rqO_2 id_break;
    public final long id_byte;

    public rNo_1(rQz_1[] rQz_1Array, rqO_2 rqO_22, long l) {
        super(rQz_1Array);
        this.id_break = rqO_22;
        this.id_byte = l;
    }

    @Override
    public void id_class(rQs_1 rQs_12) {
        if (rQs_12.id_class(this.id_break)) {
            rQs_12.id_class("Table " + this.id_break + " is recursively called");
        } else {
            super.id_class(rQs_12);
            rzL_2 rzL_22 = rQs_12.id_byte(this.id_break);
            if (rzL_22 == null) {
                rQs_12.id_class("Unknown loot table called " + this.id_break);
            } else {
                rzL_22.id_class(rQs_12.id_class("->{" + this.id_break + "}", this.id_break));
            }
        }
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_new;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        if (rdn_32.id_class()) {
            return rdn_32;
        }
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("LootTable", this.id_break.toString());
        if (this.id_byte != 0L) {
            rcd_32.id_class("LootTableSeed", this.id_byte);
        }
        rdn_32.id_int().id_class("BlockEntityTag", rcd_32);
        return rdn_32;
    }
}

