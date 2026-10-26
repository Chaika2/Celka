/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rcH_2;
import celestial.rcd_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Ys_1
implements ArgumentType<rcd_3> {
    private static final Collection<String> id_class = Arrays.asList("{}", "{foo=bar}");

    private Ys_1() {
    }

    public rcd_3 id_class(StringReader stringReader) throws CommandSyntaxException {
        return new rcH_2(stringReader).id_case();
    }

    public static Ys_1 id_class() {
        return new Ys_1();
    }

    public static <S> rcd_3 id_class(CommandContext<S> commandContext, String string) {
        return (rcd_3)commandContext.getArgument(string, rcd_3.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }
}

