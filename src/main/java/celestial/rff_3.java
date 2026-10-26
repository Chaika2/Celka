/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rpr_3;
import celestial.rrTj_1;

public class rff_3
extends rjG_2 {
    private rpr_3 id_break;
    private rfH_2 id_byte;
    private final boolean id_protected;
    private final boolean id_throws;

    @Override
    public rjM_2 id_byte() {
        return this.id_protected ? rjM_2.MISS : rjM_2.BLOCK;
    }

    private rff_3(boolean bl, rjU_2 rjU_22, rpr_3 rpr_32, rfH_2 rfH_22, boolean bl2) {
        super(rjU_22);
        this.id_protected = bl;
        this.id_break = rpr_32;
        this.id_byte = rfH_22;
        this.id_throws = bl2;
    }

    public rff_3(rjU_2 rjU_22, rpr_3 rpr_32, rfH_2 rfH_22, boolean bl) {
        this(false, rjU_22, rpr_32, rfH_22, bl);
    }

    public rfH_2 id_class() {
        return this.id_byte;
    }

    public rff_3 id_class(rjU_2 rjU_22) {
        return new rff_3(this.id_protected, rjU_22, this.id_break, new rfH_2(rjU_22), this.id_throws);
    }

    public static rff_3 id_class(rjU_2 rjU_22, rpr_3 rpr_32, rfH_2 rfH_22) {
        return new rff_3(true, rjU_22, rpr_32, rfH_22, false);
    }

    public rff_3 id_class(rpr_3 rpr_32) {
        return new rff_3(this.id_protected, this.id_class, rpr_32, this.id_byte, this.id_throws);
    }

    public rff_3 id_class(rfH_2 rfH_22) {
        return new rff_3(this.id_protected, this.id_class, this.id_break, rfH_22, this.id_throws);
    }

    public void id_break(rfH_2 rfH_22) {
        this.id_byte = rfH_22;
    }

    public void id_break(rpr_3 rpr_32) {
        this.id_break = rpr_32;
    }

    public rpr_3 id_break() {
        return this.id_break;
    }

    public boolean id_throws() {
        return this.id_throws;
    }

    @Override
    public rrTj_1 id_protected() {
        return this.id_byte;
    }
}

