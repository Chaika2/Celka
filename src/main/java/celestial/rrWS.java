/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;
import celestial.xc_3;

public final class rrWS {
    private xc_3 id_class;
    private xc_3 id_break;
    private rpr_3 id_byte;
    private int id_protected;

    public rrWS(xc_3 xc_32, xc_3 xc_33, rpr_3 rpr_32) {
        this.id_class = xc_32;
        this.id_break = xc_33;
        this.id_byte = rpr_32;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rrWS)) {
            return false;
        }
        rrWS rrWS2 = (rrWS)object;
        return this.id_class == rrWS2.id_class && this.id_break == rrWS2.id_break && this.id_byte == rrWS2.id_byte;
    }

    public int hashCode() {
        if (this.id_protected == 0) {
            this.id_protected = 31 * this.id_protected + this.id_class.hashCode();
            this.id_protected = 31 * this.id_protected + this.id_break.hashCode();
            this.id_protected = 31 * this.id_protected + this.id_byte.hashCode();
        }
        return this.id_protected;
    }

    private void id_class(xc_3 xc_32, xc_3 xc_33, rpr_3 rpr_32) {
        this.id_class = xc_32;
        this.id_break = xc_33;
        this.id_byte = rpr_32;
        this.id_protected = 0;
    }

    public rrWS id_class() {
        return new rrWS(this.id_class, this.id_break, this.id_byte);
    }
}

