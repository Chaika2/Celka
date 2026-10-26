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
import celestial.rns_3;
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

public class Yn_1
implements ArgumentType<Integer> {
    private static final Collection<String> id_break = Arrays.asList("sidebar", "foo.bar");
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("argument.scoreboardDisplaySlot.invalid", object));

    private Yn_1() {
    }

    public static Yn_1 id_class() {
        return new Yn_1();
    }

    public Integer id_class(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        int n = rns_3.id_finally(string);
        if (n == -1) {
            throw id_class.create((Object)string);
        }
        return n;
    }

    public static int id_class(CommandContext<gy_3> commandContext, String string) {
        return (Integer)commandContext.getArgument(string, Integer.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_class(rns_3.id_catch(), suggestionsBuilder);
    }
}

