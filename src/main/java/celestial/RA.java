/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.RC;
import celestial.RL;
import celestial.rgP_2;
import java.util.function.Predicate;

public class RA {
    public final RL id_class;
    public final Predicate<RC> id_break;
    public final rgP_2 id_byte;

    public RA(RL rL, Predicate<RC> predicate, rgP_2 rgP_22) {
        this.id_class = rL;
        this.id_break = predicate;
        this.id_byte = rgP_22;
    }
}

