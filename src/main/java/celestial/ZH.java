/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKQ;
import celestial.rVL;
import celestial.rYG;
import celestial.rdb_3;
import celestial.rgP_2;
import java.util.function.Function;

public class ZH {
    public final rdb_3 id_class;
    public final rgP_2 id_break;
    public final Function<rVL<rYG>, rKQ> id_byte;

    public ZH(rdb_3 rdb_32, rgP_2 rgP_22, Function<rVL<rYG>, rKQ> function) {
        this.id_class = rdb_32;
        this.id_break = rgP_22;
        this.id_byte = function;
    }

    public rgP_2 id_class() {
        return this.id_break;
    }
}

