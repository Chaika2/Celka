/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rT_2;
import celestial.rpB_2;
import celestial.xc_3;
import java.util.List;

public interface rq_3 {
    public int id_byte();

    public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5);

    default public boolean id_class(int n, int n2, int n3, xc_3 xc_32) {
        return n >= 0 && n < this.id_break() && n2 >= 0 && n2 < this.id_class() && n3 >= 0 && n3 < this.id_byte();
    }

    default public int id_class(rpB_2 rpB_22) {
        switch (((int[])rT_2.id_class[0])[rpB_22.ordinal()]) {
            case 1: {
                return this.id_break();
            }
            case 2: {
                return this.id_class();
            }
            case 3: {
                return this.id_byte();
            }
        }
        throw new UnsupportedOperationException("" + rpB_22);
    }

    public int id_class();

    public int id_break();

    default public void id_protected() {
    }
}

