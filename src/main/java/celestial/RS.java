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

import celestial.Rs_1;
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

public class RS
implements ArgumentType<Rs_1> {
    private static final Collection<String> id_break = Arrays.asList("0", "~", "~-5");
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.angle.incomplete"));

    public Rs_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        boolean bl = Yr_1.id_break(stringReader);
        float f = stringReader.canRead() && stringReader.peek() != ' ' ? stringReader.readFloat() : 0.0f;
        return new Rs_1(f, bl);
    }

    public static RS id_class() {
        return new RS();
    }

    public static float id_class(CommandContext<gy_3> commandContext, String string) {
        return ((Rs_1)commandContext.getArgument(string, Rs_1.class)).id_class((gy_3)commandContext.getSource());
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }
}

