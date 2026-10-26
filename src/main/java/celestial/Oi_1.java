/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oa_1;
import celestial.gj_3;
import celestial.gy_3;
import java.util.ArrayDeque;

public class Oi_1 {
    private final Oa_1 id_class;
    private final gy_3 id_break;
    private final gj_3 id_byte;

    public Oi_1(Oa_1 oa_1, gy_3 gy_32, gj_3 gj_32) {
        this.id_class = oa_1;
        this.id_break = gy_32;
        this.id_byte = gj_32;
    }

    public String toString() {
        return this.id_byte.toString();
    }

    public void id_class(ArrayDeque<Oi_1> arrayDeque, int n) {
        try {
            this.id_byte.id_class(this.id_class, this.id_break, arrayDeque, n);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }
}

