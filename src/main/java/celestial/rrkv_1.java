/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXf_1;
import celestial.rrkm_1;

public class rrkv_1
implements rrXf_1 {
    private rrkm_1 id_class;
    private int id_break;
    private int id_byte;

    public rrkv_1(rrkm_1 rrkm_12, int n, int n2) {
        this.id_class = rrkm_12;
        this.id_break = n;
        this.id_byte = n2;
    }

    public rrkv_1(rrkm_1 rrkm_12, int n) {
        this(rrkm_12, n, 0);
    }

    public rrkv_1(rrkm_1 rrkm_12) {
        this(rrkm_12, 0, 0);
    }

    public String toString() {
        if (this.id_class.id_byte() == null) {
            return "" + this.id_class;
        }
        return this.id_class.id_protected() == null ? this.id_class + "." + this.id_class.id_byte()[this.id_break] : this.id_class + "." + this.id_class.id_byte()[this.id_break] + "." + this.id_class.id_protected()[this.id_byte];
    }

    @Override
    public float id_class() {
        return this.id_class.id_class(this.id_break, this.id_byte);
    }
}

