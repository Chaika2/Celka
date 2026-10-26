/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hh_1;
import celestial.Hl_1;
import celestial.QY;

public class Ht_1
extends Hl_1 {
    public Ht_1(boolean bl) {
        super("lightmap", () -> {
            if (bl) {
                ((Hh_1)QY.id_instanceof().id_class[16]).id_extends().id_byte();
            }
        }, () -> {
            if (bl) {
                ((Hh_1)QY.id_instanceof().id_class[16]).id_extends().id_break();
            }
        }, bl);
    }
}

