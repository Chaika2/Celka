/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rXB;
import celestial.rXE;
import celestial.rdb_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjz_3;

public interface rjm_3 {
    public boolean id_class(rdb_3 var1);

    public boolean id_class(rXE var1, rXB var2);

    public boolean id_class();

    public static rjm_3 id_class(an_3 an_32) {
        return new rjz_3(an_32);
    }

    public boolean id_class(rjC_2 var1, rfH_2 var2, boolean var3);

    public static rjm_3 id_break() {
        return rjz_3.id_class;
    }
}

