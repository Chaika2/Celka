/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
package celestial;

import celestial.gy_3;
import celestial.rVi_1;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgn_3;
import com.google.gson.JsonParseException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class RQ
implements ArgumentType<rgP_2> {
    private static final Collection<String> id_break = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("argument.component.invalid", object));

    private RQ() {
    }

    public static rgP_2 id_class(CommandContext<gy_3> commandContext, String string) {
        return (rgP_2)commandContext.getArgument(string, rgP_2.class);
    }

    public rgP_2 id_class(StringReader stringReader) throws CommandSyntaxException {
        try {
            rVi_1 rVi_12 = rgB_2.id_class(stringReader);
            if (rVi_12 == null) {
                throw id_class.createWithContext((ImmutableStringReader)stringReader, (Object)"empty");
            }
            return rVi_12;
        }
        catch (JsonParseException jsonParseException) {
            String string = jsonParseException.getCause() != null ? jsonParseException.getCause().getMessage() : jsonParseException.getMessage();
            throw id_class.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
    }

    public static RQ id_class() {
        return new RQ();
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }
}

