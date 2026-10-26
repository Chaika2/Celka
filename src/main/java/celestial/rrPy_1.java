/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqE_2;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Iterator;

public class rrPy_1
implements Iterable<xc_3> {
    public static final xc_3 id_class = xu_3.id_class.id_continue();
    private final rqE_2<xc_3> id_break = new rqE_2(16);
    private int id_byte;

    @Override
    public Iterator<xc_3> iterator() {
        return this.id_break.iterator();
    }

    public xc_3 id_class(int n) {
        xc_3 xc_32 = this.id_break.id_class(n);
        return xc_32 == null ? id_class : xc_32;
    }

    public void id_class(xc_3 xc_32, int n) {
        this.id_break.id_class(xc_32, n);
    }

    public int id_class(xc_3 xc_32) {
        int n = this.id_break.id_class(xc_32);
        if (n == -1) {
            n = this.id_byte++;
            this.id_break.id_class(xc_32, n);
        }
        return n;
    }
}

