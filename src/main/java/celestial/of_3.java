/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.gy_3;
import celestial.oI_2;
import celestial.rdn_3;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

@FunctionalInterface
public interface of_3 {
    public int accept(CommandContext<gy_3> var1, List<rdn_3> var2, oI_2 var3) throws CommandSyntaxException;
}

