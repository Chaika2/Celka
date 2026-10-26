/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXc_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;

public class rHg_1
extends ryO_2
implements rXc_1 {
    private rdn_3 id_class = rdn_3.id_break;

    public rHg_1() {
        super(ryW_2.id_throws);
    }

    public void id_class(rdn_3 rdn_32) {
        this.id_class = rdn_32;
        this.id_break();
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (!this.id_throws().id_class()) {
            rcd_32.id_class("RecordItem", this.id_throws().id_break(new rcd_3()));
        }
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        if (rcd_32.id_byte("RecordItem", 10)) {
            this.id_class(rdn_3.id_class(rcd_32.id_int("RecordItem")));
        }
    }

    public rdn_3 id_throws() {
        return this.id_class;
    }

    @Override
    public void id_public() {
        this.id_class(rdn_3.id_break);
    }
}

