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
import celestial.rcZ_2;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Yd_1
implements ArgumentType<rcZ_2> {
    private static final Collection<String> id_class = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

    private Yd_1() {
    }

    public rcZ_2 id_class(StringReader stringReader) throws CommandSyntaxException {
        return new rcH_2(stringReader).id_protected();
    }

    public static Yd_1 id_class() {
        return new Yd_1();
    }

    public static <S> rcZ_2 id_class(CommandContext<S> commandContext, String string) {
        return (rcZ_2)commandContext.getArgument(string, rcZ_2.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }
}

