/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.Rf_1;
import celestial.Ri_1;
import celestial.Yr_1;
import celestial.gR_2;
import celestial.gY_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rjK_2;
import celestial.rjU_2;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class Yt_1
implements ArgumentType<Rf_1> {
    private static final Collection<String> id_break = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.pos2d.incomplete"));
    private final boolean id_byte;

    public Yt_1(boolean bl) {
        this.id_byte = bl;
    }

    public static Yt_1 id_class() {
        return new Yt_1(true);
    }

    public Rf_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        if (!stringReader.canRead()) {
            throw id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        Yr_1 yr_1 = Yr_1.id_class(stringReader, this.id_byte);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            Yr_1 yr_12 = Yr_1.id_class(stringReader, this.id_byte);
            return new Ri_1(yr_1, new Yr_1(true, 0.0), yr_12);
        }
        stringReader.setCursor(n);
        throw id_class.createWithContext((ImmutableStringReader)stringReader);
    }

    public static rjK_2 id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        rjU_2 rjU_22 = ((Rf_1)commandContext.getArgument(string, Rf_1.class)).id_class((gy_3)commandContext.getSource());
        return new rjK_2((float)rjU_22.id_break, (float)rjU_22.id_protected);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (!(commandContext.getSource() instanceof gR_2)) {
            return Suggestions.empty();
        }
        String string = suggestionsBuilder.getRemaining();
        Collection<gY_2> collection = !string.isEmpty() && string.charAt(0) == '^' ? Collections.singleton(gY_2.id_class) : ((gR_2)commandContext.getSource()).id_catch();
        return gR_2.id_break(string, collection, suggestionsBuilder, gp_3.id_class(this::id_class));
    }
}

