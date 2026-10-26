/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;
import celestial.rdb_3;
import celestial.rqO_2;
import celestial.xd_3;

public class DK {
    public static rqO_2 id_class(xd_3 xd_32) {
        rqO_2 rqO_22 = rVL.id_strictfp.id_break(xd_32);
        return new rqO_2(rqO_22.id_byte(), "block/" + rqO_22.id_break());
    }

    public static rqO_2 id_class(rdb_3 rdb_32) {
        rqO_2 rqO_22 = rVL.id_for.id_break(rdb_32);
        return new rqO_2(rqO_22.id_byte(), "item/" + rqO_22.id_break());
    }

    public static rqO_2 id_class(rdb_3 rdb_32, String string) {
        rqO_2 rqO_22 = rVL.id_for.id_break(rdb_32);
        return new rqO_2(rqO_22.id_byte(), "item/" + rqO_22.id_break() + string);
    }

    public static rqO_2 id_class(xd_3 xd_32, String string) {
        rqO_2 rqO_22 = rVL.id_strictfp.id_break(xd_32);
        return new rqO_2(rqO_22.id_byte(), "block/" + rqO_22.id_break() + string);
    }

    @Deprecated
    public static rqO_2 id_class(String string) {
        return new rqO_2("minecraft", "block/" + string);
    }

    public static rqO_2 id_break(String string) {
        return new rqO_2("minecraft", "item/" + string);
    }
}

