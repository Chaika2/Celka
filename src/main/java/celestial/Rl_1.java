/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
package celestial;

import celestial.aI_2;
import celestial.gy_3;
import celestial.rVL;
import celestial.rgn_3;
import celestial.rqO_2;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class Rl_1
implements ArgumentType<rqO_2> {
    private static final Collection<String> id_break = Arrays.asList("minecraft:pig", "cow");
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("entity.notFound", object));

    public static Rl_1 id_class() {
        return new Rl_1();
    }

    public rqO_2 id_class(StringReader stringReader) throws CommandSyntaxException {
        return Rl_1.id_class(rqO_2.id_class(stringReader));
    }

    private static rqO_2 id_class(rqO_2 rqO_22) throws CommandSyntaxException {
        rVL.id_transient.id_break(rqO_22).filter(aI_2::id_break).orElseThrow(() -> id_class.create((Object)rqO_22));
        return rqO_22;
    }

    public static rqO_2 id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return Rl_1.id_class((rqO_2)commandContext.getArgument(string, rqO_2.class));
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }
}

