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
import celestial.rgn_3;
import celestial.rnB_2;
import celestial.rnG_2;
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

public class Yp_1
implements ArgumentType<String> {
    private static final Collection<String> id_class = Arrays.asList("foo", "123");
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("team.notFound", object));

    public static Yp_1 id_class() {
        return new Yp_1();
    }

    public String id_class(StringReader stringReader) throws CommandSyntaxException {
        return stringReader.readUnquotedString();
    }

    public static rnB_2 id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        String string2 = (String)commandContext.getArgument(string, String.class);
        rnG_2 rnG_22 = ((gy_3)commandContext.getSource()).id_super().R();
        rnB_2 rnB_22 = rnG_22.id_throws(string2);
        if (rnB_22 == null) {
            throw id_break.create((Object)string2);
        }
        return rnB_22;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return commandContext.getSource() instanceof gR_2 ? gR_2.id_break(((gR_2)commandContext.getSource()).id_byte(), suggestionsBuilder) : Suggestions.empty();
    }
}

