/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 */
package celestial;

import celestial.RI;
import celestial.rqO_2;
import com.mojang.brigadier.arguments.ArgumentType;

public class Rb_1<T extends ArgumentType<?>> {
    public final Class<T> id_class;
    public final RI<T> id_break;
    public final rqO_2 id_byte;

    public Rb_1(Class<T> clazz, RI<T> rI, rqO_2 rqO_22) {
        this.id_class = clazz;
        this.id_break = rI;
        this.id_byte = rqO_22;
    }
}

