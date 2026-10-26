/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rLx_1;
import celestial.rLz_1;
import celestial.ruu_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

@Deprecated
public interface rLd_1<T extends rLx_1> {
    public T id_break(rLz_1<T> var1, StringReader var2) throws CommandSyntaxException;

    public T id_break(rLz_1<T> var1, ruu_3 var2);
}

