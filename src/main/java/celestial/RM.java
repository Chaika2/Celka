/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

import celestial.Ra_1;
import celestial.Rf_1;
import celestial.Ri_1;
import celestial.gR_2;
import celestial.gY_2;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rrEm_1;
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

public class RM
implements ArgumentType<Rf_1> {
    private static final Collection<String> id_byte = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.pos.unloaded"));
    public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("argument.pos.outofworld"));

    public Rf_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        return stringReader.canRead() && stringReader.peek() == '^' ? Ra_1.id_class(stringReader) : Ri_1.id_class(stringReader);
    }

    public static RM id_class() {
        return new RM();
    }

    public static rfH_2 id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        rfH_2 rfH_22 = ((Rf_1)commandContext.getArgument(string, Rf_1.class)).id_byte((gy_3)commandContext.getSource());
        if (!((gy_3)commandContext.getSource()).id_final().id_int(rfH_22)) {
            throw id_class.create();
        }
        ((gy_3)commandContext.getSource()).id_final();
        if (!rrEm_1.id_new(rfH_22)) {
            throw id_break.create();
        }
        return rfH_22;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public static rfH_2 id_break(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((Rf_1)commandContext.getArgument(string, Rf_1.class)).id_byte((gy_3)commandContext.getSource());
    }

    public Collection<String> getExamples() {
        return id_byte;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (!(commandContext.getSource() instanceof gR_2)) {
            return Suggestions.empty();
        }
        String string = suggestionsBuilder.getRemaining();
        Collection<gY_2> collection = !string.isEmpty() && string.charAt(0) == '^' ? Collections.singleton(gY_2.id_class) : ((gR_2)commandContext.getSource()).id_case();
        return gR_2.id_class(string, collection, suggestionsBuilder, gp_3.id_class(this::id_class));
    }
}

