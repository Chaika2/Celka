/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;
import celestial.xc_3;

public final class xz_3 {
    private final xc_3 id_class;
    private final xc_3 id_break;
    private final rpr_3 id_byte;

    public xz_3(xc_3 xc_32, xc_3 xc_33, rpr_3 rpr_32) {
        this.id_class = xc_32;
        this.id_break = xc_33;
        this.id_byte = rpr_32;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof xz_3)) {
            return false;
        }
        xz_3 xz_32 = (xz_3)object;
        return this.id_class == xz_32.id_class && this.id_break == xz_32.id_break && this.id_byte == xz_32.id_byte;
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        n = 31 * n + this.id_break.hashCode();
        return 31 * n + this.id_byte.hashCode();
    }
}

