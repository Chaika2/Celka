/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.gy_3;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Supplier;

@FunctionalInterface
public interface YF {
    public Collection<String> getNames(gy_3 var1, Supplier<Collection<String>> var2) throws CommandSyntaxException;
}

