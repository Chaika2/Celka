/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandExceptionType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.gR_2;
import celestial.gy_3;
import celestial.rgN_2;
import celestial.rlR_2;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class rli_3
implements ArgumentType<String> {
    private static final Collection<String> id_class = Arrays.asList("techtests", "mobtests");

    public String id_class(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        if (rlR_2.id_break(string)) {
            return string;
        }
        rgN_2 rgN_22 = new rgN_2("No such test class: " + string);
        throw new CommandSyntaxException((CommandExceptionType)new SimpleCommandExceptionType((Message)rgN_22), (Message)rgN_22);
    }

    public static String id_class(CommandContext<gy_3> commandContext, String string) {
        return (String)commandContext.getArgument(string, String.class);
    }

    public static rli_3 id_class() {
        return new rli_3();
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_break(rlR_2.id_break().stream(), suggestionsBuilder);
    }
}

