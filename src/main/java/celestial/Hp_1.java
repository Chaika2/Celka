/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HF;
import celestial.Hl_1;

public class Hp_1
extends Hl_1 {
    public Hp_1(boolean bl) {
        super("diffuse_lighting", () -> {
            if (bl) {
                HF.id_class();
            }
        }, () -> {
            if (bl) {
                HF.id_break();
            }
        }, bl);
    }
}

