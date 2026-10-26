/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.Rf_1;
import celestial.Ri_1;
import celestial.Yr_1;
import celestial.gy_3;
import celestial.rgn_3;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class YZ
implements ArgumentType<Rf_1> {
    private static final Collection<String> id_break = Arrays.asList("0 0", "~ ~", "~-5 ~5");
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.rotation.incomplete"));

    public Rf_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        if (!stringReader.canRead()) {
            throw id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        Yr_1 yr_1 = Yr_1.id_class(stringReader, false);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            Yr_1 yr_12 = Yr_1.id_class(stringReader, false);
            return new Ri_1(yr_12, yr_1, new Yr_1(true, 0.0));
        }
        stringReader.setCursor(n);
        throw id_class.createWithContext((ImmutableStringReader)stringReader);
    }

    public static YZ id_class() {
        return new YZ();
    }

    public static Rf_1 id_class(CommandContext<gy_3> commandContext, String string) {
        return (Rf_1)commandContext.getArgument(string, Rf_1.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }
}

