/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.Rm_1;
import celestial.gR_2;
import celestial.gy_3;
import celestial.rgn_3;
import com.mojang.brigadier.ImmutableStringReader;
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

public class Ru_1
implements ArgumentType<Rm_1> {
    private static final Collection<String> id_class = Arrays.asList("eyes", "feet");
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("argument.anchor.invalid", object));

    public static Rm_1 id_class(CommandContext<gy_3> commandContext, String string) {
        return (Rm_1)((Object)commandContext.getArgument(string, Rm_1.class));
    }

    public Rm_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        String string = stringReader.readUnquotedString();
        Rm_1 rm_1 = Rm_1.id_class(string);
        if (rm_1 == null) {
            stringReader.setCursor(n);
            throw id_break.createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
        return rm_1;
    }

    public static Ru_1 id_class() {
        return new Ru_1();
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_break(Rm_1.BY_NAME.keySet(), suggestionsBuilder);
    }
}

