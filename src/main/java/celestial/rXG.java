/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;
import celestial.rXB;
import celestial.rXE;
import celestial.rXJ;
import celestial.rXM;
import celestial.rXO;
import celestial.rXP;
import celestial.rXX;
import celestial.rXs_1;

public class rXG {
    public static final rXs_1 id_class = rXG.id_class("empty", new rXP());
    public static final rXB id_break = rXG.id_class("flowing_water", new rXX());
    public static final rXB id_byte = rXG.id_class("water", new rXJ());
    public static final rXB id_protected = rXG.id_class("flowing_lava", new rXM());
    public static final rXB id_throws = rXG.id_class("lava", new rXO());

    static {
        for (rXs_1 rXs_12 : rVL.id_default) {
            for (rXE rXE2 : rXs_12.id_catch().id_class()) {
                rXs_1.id_byte.id_break(rXE2);
            }
        }
    }

    private static <T extends rXs_1> T id_class(String string, T t) {
        return (T)rVL.id_class(rVL.id_default, string, t);
    }
}

