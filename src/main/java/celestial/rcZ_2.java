/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcv_3;
import celestial.rgF_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;

public interface rcZ_2 {
    public static final rgF_2 id_protected = rgF_2.AQUA;
    public static final rgF_2 id_throws = rgF_2.GREEN;
    public static final rgF_2 id_case = rgF_2.GOLD;
    public static final rgF_2 id_catch = rgF_2.RED;

    public rcZ_2 id_byte();

    public String toString();

    public void id_class(DataOutput var1) throws IOException;

    public rgP_2 id_class(String var1, int var2);

    public byte id_class();

    public rcv_3<?> id_break();

    default public rgP_2 id_volatile() {
        return this.id_class("", 0);
    }

    default public String id_native() {
        return this.toString();
    }
}

