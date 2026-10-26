/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rpr_3;
import celestial.rrTj_1;

public class rfo_3
extends rjG_2 {
    private final an_3 id_break;
    private rpr_3 id_byte;

    @Override
    public rjM_2 id_byte() {
        return rjM_2.ENTITY;
    }

    public rfo_3(an_3 an_32) {
        this(an_32, rpr_3.UP, an_32.Ps());
    }

    public rfo_3(an_3 an_32, rpr_3 rpr_32, rjU_2 rjU_22) {
        super(rjU_22);
        this.id_break = an_32;
        this.id_byte = rpr_32;
    }

    public rfo_3(an_3 an_32, rjU_2 rjU_22) {
        super(rjU_22);
        this.id_break = an_32;
    }

    public an_3 id_class() {
        return this.id_break;
    }

    public rpr_3 id_break() {
        return this.id_byte;
    }

    @Override
    public rrTj_1 id_protected() {
        return this.id_break;
    }
}

