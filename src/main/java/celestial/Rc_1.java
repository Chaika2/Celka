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

import celestial.ev_3;
import celestial.gR_2;
import celestial.gy_3;
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

public class Rc_1
implements ArgumentType<ev_3> {
    private static final Collection<String> id_break = Arrays.asList("unbreaking", "silk_touch");
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("enchantment.unknown", object));

    public static Rc_1 id_class() {
        return new Rc_1();
    }

    public ev_3 id_class(StringReader stringReader) throws CommandSyntaxException {
        rqO_2 rqO_22 = rqO_2.id_class(stringReader);
        return rVL.id_boolean.id_break(rqO_22).orElseThrow(() -> id_class.create((Object)rqO_22));
    }

    public static ev_3 id_class(CommandContext<gy_3> commandContext, String string) {
        return (ev_3)commandContext.getArgument(string, ev_3.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_class(rVL.id_boolean.id_protected(), suggestionsBuilder);
    }
}

