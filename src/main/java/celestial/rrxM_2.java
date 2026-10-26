/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJi_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rrxM_2 {
    private static final List<rrJi_1> id_class = Collections.synchronizedList(new ArrayList());
    private static boolean id_break = false;

    protected static void id_class(rrJi_1 rrJi_12) {
        if (!id_break) {
            id_class.add(rrJi_12);
        } else {
            rrJi_12.id_class();
        }
    }

    public static void id_class() {
        if (!id_break) {
            for (rrJi_1 rrJi_12 : id_class) {
                rrJi_12.id_class();
            }
            id_break = true;
        }
    }
}

