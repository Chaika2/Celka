/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import java.util.UUID;

public class jH_2 {
    private static final rqO_2 id_class = new rqO_2("textures/entity/steve.png");
    private static final rqO_2 id_break = new rqO_2("textures/entity/alex.png");

    private static boolean id_byte(UUID uUID) {
        return (uUID.hashCode() & 1) == 1;
    }

    public static rqO_2 id_class(UUID uUID) {
        return jH_2.id_byte(uUID) ? id_break : id_class;
    }

    public static rqO_2 id_class() {
        return id_class;
    }

    public static String id_break(UUID uUID) {
        return jH_2.id_byte(uUID) ? "slim" : "default";
    }
}

