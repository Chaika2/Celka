/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 */
package celestial;

import celestial.RV;
import celestial.Rg_1;
import celestial.Xu_1;
import com.mojang.brigadier.arguments.ArgumentType;

public interface Rj_1<T extends Xu_1<?>>
extends ArgumentType<T> {
    public static Rg_1 id_class() {
        return new Rg_1();
    }

    public static RV id_break() {
        return new RV();
    }
}

