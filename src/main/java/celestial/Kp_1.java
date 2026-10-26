/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.KI;
import celestial.gy_3;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public interface Kp_1 {
    public KI id_class(CommandContext<gy_3> var1) throws CommandSyntaxException;

    public ArgumentBuilder<gy_3, ?> id_class(ArgumentBuilder<gy_3, ?> var1, Function<ArgumentBuilder<gy_3, ?>, ArgumentBuilder<gy_3, ?>> var2);
}

