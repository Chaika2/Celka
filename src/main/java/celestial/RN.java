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
import celestial.rVL;
import celestial.rYB;
import celestial.rgn_3;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RN
implements ArgumentType<rqO_2> {
    private static final Collection<String> id_class = Stream.of(rYB.id_byte, rYB.id_protected).map(rqM_22 -> rqM_22.id_class().toString()).collect(Collectors.toList());
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("argument.dimension.invalid", object));

    public rqO_2 id_class(StringReader stringReader) throws CommandSyntaxException {
        return rqO_2.id_class(stringReader);
    }

    public static RN id_class() {
        return new RN();
    }

    public static rrEm_1 id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        rqO_2 rqO_22 = (rqO_2)commandContext.getArgument(string, rqO_2.class);
        rqM_2<rYB> rqM_22 = rqM_2.id_class(rVL.id_static, rqO_22);
        rrEm_1 rrEm_12 = ((gy_3)commandContext.getSource()).id_super().id_class(rqM_22);
        if (rrEm_12 == null) {
            throw id_break.create((Object)rqO_22);
        }
        return rrEm_12;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return commandContext.getSource() instanceof gR_2 ? gR_2.id_class(((gR_2)commandContext.getSource()).id_private().stream().map(rqM_2::id_class), suggestionsBuilder) : Suggestions.empty();
    }
}

