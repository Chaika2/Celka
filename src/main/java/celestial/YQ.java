/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.YN;
import celestial.rAa_1;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface YQ
extends YN {
    public int apply(int var1, int var2) throws CommandSyntaxException;

    @Override
    default public void apply(rAa_1 rAa_12, rAa_1 rAa_13) throws CommandSyntaxException {
        rAa_12.id_break(this.apply(rAa_12.id_break(), rAa_13.id_break()));
    }
}

