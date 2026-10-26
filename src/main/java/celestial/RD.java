/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.gy_3;
import celestial.rdn_3;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Predicate;

public interface RD {
    public Predicate<rdn_3> create(CommandContext<gy_3> var1) throws CommandSyntaxException;
}

