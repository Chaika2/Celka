/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXs_1;
import celestial.rlA_2;
import celestial.rlF_2;
import celestial.rlO_2;
import celestial.rlQ_2;
import celestial.rqO_2;
import java.util.List;

public final class rlG_2 {
    protected static final rlF_2<rXs_1> id_class = rlA_2.id_class(new rqO_2("fluid"), rlQ_2::id_byte);
    public static final rlO_2<rXs_1> id_break = rlG_2.id_class("water");
    public static final rlO_2<rXs_1> id_byte = rlG_2.id_class("lava");

    private static rlO_2<rXs_1> id_class(String string) {
        return id_class.id_class(string);
    }

    public static List<? extends rlO_2<rXs_1>> id_class() {
        return id_class.id_byte();
    }
}

