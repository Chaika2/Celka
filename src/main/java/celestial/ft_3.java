/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fT_2;
import celestial.fV_2;

public class ft_3 {
    public final fV_2 id_class;
    public final int id_break;
    public final int id_byte;

    public ft_3(fV_2 fV_22, int n) {
        this.id_class = fV_22;
        this.id_break = fT_2.id_class(fV_22.id_break(), n);
        this.id_byte = fT_2.id_class(fV_22.id_byte(), n);
    }

    public String toString() {
        return "Holder{width=" + this.id_break + ", height=" + this.id_byte + ", name=" + this.id_class.id_class() + "}";
    }
}

