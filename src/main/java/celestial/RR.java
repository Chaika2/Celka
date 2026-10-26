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

import celestial.RY;
import celestial.Ro_1;
import celestial.rlc_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class RR
implements ArgumentType<RY> {
    private static final Collection<String> id_class = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");

    public static RR id_class() {
        return new RR();
    }

    public static <S> RY id_class(CommandContext<S> commandContext, String string) {
        return (RY)commandContext.getArgument(string, RY.class);
    }

    public RY id_class(StringReader stringReader) throws CommandSyntaxException {
        Ro_1 ro_1 = new Ro_1(stringReader, false).id_catch();
        return new RY(ro_1.id_class(), ro_1.id_break());
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
        Ro_1 ro_1 = new Ro_1(stringReader, false);
        try {
            ro_1.id_catch();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return ro_1.id_class(suggestionsBuilder, rlc_3.id_class());
    }
}

