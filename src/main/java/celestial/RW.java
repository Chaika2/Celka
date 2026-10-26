/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.gR_2;
import celestial.gy_3;
import celestial.rgF_2;
import celestial.rgn_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class RW
implements ArgumentType<rgF_2> {
    private static final Collection<String> id_break = Arrays.asList("red", "green");
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("argument.color.invalid", object));

    private RW() {
    }

    public static RW id_class() {
        return new RW();
    }

    public rgF_2 id_class(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        rgF_2 rgF_22 = rgF_2.id_break(string);
        if (rgF_22 != null && !rgF_22.id_break()) {
            return rgF_22;
        }
        throw id_class.create((Object)string);
    }

    public static rgF_2 id_class(CommandContext<gy_3> commandContext, String string) {
        return (rgF_2)((Object)commandContext.getArgument(string, rgF_2.class));
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_break(rgF_2.id_class(true, false), suggestionsBuilder);
    }
}

