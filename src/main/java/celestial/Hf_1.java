/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hh_1;
import celestial.Hl_1;
import celestial.QY;

public class Hf_1
extends Hl_1 {
    public Hf_1(boolean bl) {
        super("overlay", () -> {
            if (bl) {
                ((Hh_1)QY.id_instanceof().id_class[16]).id_native().id_class();
            }
        }, () -> {
            if (bl) {
                ((Hh_1)QY.id_instanceof().id_class[16]).id_native().id_break();
            }
        }, bl);
    }
}

