/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.gy_3;
import celestial.rgn_3;
import celestial.rpB_2;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class Yy_1
implements ArgumentType<EnumSet<rpB_2>> {
    private static final Collection<String> id_class = Arrays.asList("xyz", "x");
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("arguments.swizzle.invalid"));

    public EnumSet<rpB_2> id_class(StringReader stringReader) throws CommandSyntaxException {
        EnumSet<rpB_2> enumSet = EnumSet.noneOf(rpB_2.class);
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            char c = stringReader.read();
            rpB_2 rpB_22 = switch (c) {
                case 'x' -> rpB_2.X;
                case 'y' -> rpB_2.Y;
                case 'z' -> rpB_2.Z;
                default -> throw id_break.create();
            };
            if (enumSet.contains(rpB_22)) {
                throw id_break.create();
            }
            enumSet.add(rpB_22);
        }
        return enumSet;
    }

    public static Yy_1 id_class() {
        return new Yy_1();
    }

    public static EnumSet<rpB_2> id_class(CommandContext<gy_3> commandContext, String string) {
        return (EnumSet)commandContext.getArgument(string, EnumSet.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }
}

