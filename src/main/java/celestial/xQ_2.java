/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.xd_3;

public class xQ_2 {
    private final rfH_2 id_class;
    private final xd_3 id_break;
    private final int id_byte;
    private final int id_protected;

    public int id_byte() {
        return this.id_byte;
    }

    public xQ_2(rfH_2 rfH_22, xd_3 xd_32, int n, int n2) {
        this.id_class = rfH_22;
        this.id_break = xd_32;
        this.id_byte = n;
        this.id_protected = n2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof xQ_2)) {
            return false;
        }
        xQ_2 xQ_22 = (xQ_2)object;
        return this.id_class.equals(xQ_22.id_class) && this.id_byte == xQ_22.id_byte && this.id_protected == xQ_22.id_protected && this.id_break == xQ_22.id_break;
    }

    public String toString() {
        return "TE(" + this.id_class + ")," + this.id_byte + "," + this.id_protected + "," + this.id_break;
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        n = 31 * n + this.id_break.hashCode();
        n = 31 * n + this.id_byte;
        return 31 * n + this.id_protected;
    }

    public rfH_2 id_class() {
        return this.id_class;
    }

    public xd_3 id_break() {
        return this.id_break;
    }

    public int id_protected() {
        return this.id_protected;
    }
}

