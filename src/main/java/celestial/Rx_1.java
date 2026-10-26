/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.Rd_1;
import celestial.Rk_1;
import celestial.gy_3;
import celestial.rls_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class Rx_1
implements ArgumentType<Rd_1> {
    private static final Collection<String> id_class = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");

    public static Rx_1 id_class() {
        return new Rx_1();
    }

    public static Rd_1 id_class(CommandContext<gy_3> commandContext, String string) {
        return (Rd_1)commandContext.getArgument(string, Rd_1.class);
    }

    public Rd_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        Rk_1 rk_1 = new Rk_1(stringReader, false).id_class(true);
        return new Rd_1(rk_1.id_break(), rk_1.id_class().keySet(), rk_1.id_byte());
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
        stringReader.setCursor(suggestionsBuilder.getStart());
        Rk_1 rk_1 = new Rk_1(stringReader, false);
        try {
            rk_1.id_class(true);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return rk_1.id_class(suggestionsBuilder, rls_3.id_class());
    }
}

