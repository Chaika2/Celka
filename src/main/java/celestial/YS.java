/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Rn_1;
import celestial.gy_3;
import celestial.rgP_2;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class YS {
    private final int id_class;
    private final int id_break;
    private final Rn_1 id_byte;

    public YS(int n, int n2, Rn_1 rn_1) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = rn_1;
    }

    public rgP_2 id_class(gy_3 gy_32) throws CommandSyntaxException {
        return Rn_1.id_class(this.id_byte.id_break(gy_32));
    }

    public int id_class() {
        return this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }
}

