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
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rVL;
import celestial.rgn_3;
import celestial.rqO_2;
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

public class Yc_1
implements ArgumentType<rLx_1> {
    private static final Collection<String> id_break = Arrays.asList("foo", "foo:bar", "particle with options");
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("particle.notFound", object));

    public static Yc_1 id_class() {
        return new Yc_1();
    }

    private static <T extends rLx_1> T id_class(StringReader stringReader, rLz_1<T> rLz_12) throws CommandSyntaxException {
        return rLz_12.id_case().id_break(rLz_12, stringReader);
    }

    public rLx_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        return Yc_1.id_break(stringReader);
    }

    public static rLx_1 id_class(CommandContext<gy_3> commandContext, String string) {
        return (rLx_1)commandContext.getArgument(string, rLx_1.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public static rLx_1 id_break(StringReader stringReader) throws CommandSyntaxException {
        rqO_2 rqO_22 = rqO_2.id_class(stringReader);
        rLz_1<?> rLz_12 = rVL.id_switch.id_break(rqO_22).orElseThrow(() -> id_class.create((Object)rqO_22));
        return Yc_1.id_class(stringReader, rLz_12);
    }

    public Collection<String> getExamples() {
        return id_break;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_class(rVL.id_switch.id_protected(), suggestionsBuilder);
    }
}

