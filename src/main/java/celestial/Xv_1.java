/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Xu_1;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface Xv_1<T extends Number, R extends Xu_1<T>> {
    public R create(StringReader var1, T var2, T var3) throws CommandSyntaxException;
}

