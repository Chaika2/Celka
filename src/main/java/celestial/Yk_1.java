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
import celestial.rnG_2;
import celestial.rnP_2;
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

public class Yk_1
implements ArgumentType<String> {
    private static final Collection<String> id_break = Arrays.asList("foo", "*", "012");
    private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(object -> new rgn_3("arguments.objective.notFound", object));
    private static final DynamicCommandExceptionType id_protected = new DynamicCommandExceptionType(object -> new rgn_3("arguments.objective.readonly", object));
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("commands.scoreboard.objectives.add.longName", object));

    public static Yk_1 id_class() {
        return new Yk_1();
    }

    public String id_class(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        if (string.length() > 16) {
            throw id_class.create((Object)16);
        }
        return string;
    }

    public static rnP_2 id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        String string2 = (String)commandContext.getArgument(string, String.class);
        rnG_2 rnG_22 = ((gy_3)commandContext.getSource()).id_super().R();
        rnP_2 rnP_22 = rnG_22.id_byte(string2);
        if (rnP_22 == null) {
            throw id_byte.create((Object)string2);
        }
        return rnP_22;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public static rnP_2 id_break(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        rnP_2 rnP_22 = Yk_1.id_class(commandContext, string);
        if (rnP_22.id_byte().id_break()) {
            throw id_protected.create((Object)rnP_22.id_break());
        }
        return rnP_22;
    }

    public Collection<String> getExamples() {
        return id_break;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof gy_3) {
            return gR_2.id_break(((gy_3)commandContext.getSource()).id_super().R().id_break(), suggestionsBuilder);
        }
        if (commandContext.getSource() instanceof gR_2) {
            gR_2 gR_22 = (gR_2)commandContext.getSource();
            return gR_22.id_class(commandContext, suggestionsBuilder);
        }
        return Suggestions.empty();
    }
}

