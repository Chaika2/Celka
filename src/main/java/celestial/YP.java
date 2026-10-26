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

import celestial.YB;
import celestial.gy_3;
import celestial.rgP_2;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class YP
implements ArgumentType<YB> {
    private static final Collection<String> id_class = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

    public YB id_class(StringReader stringReader) throws CommandSyntaxException {
        return YB.id_class(stringReader, true);
    }

    public static YP id_class() {
        return new YP();
    }

    public static rgP_2 id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((YB)commandContext.getArgument(string, YB.class)).id_class((gy_3)commandContext.getSource(), ((gy_3)commandContext.getSource()).id_class(2));
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }
}

