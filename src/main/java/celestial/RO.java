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

import celestial.RJ;
import celestial.RX;
import celestial.Rh_1;
import celestial.Rk_1;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rlb_3;
import celestial.rls_3;
import celestial.rqO_2;
import celestial.ryw_3;
import celestial.xd_3;
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
import java.util.function.Predicate;

public class RO
implements ArgumentType<RX> {
    private static final Collection<String> id_class = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("arguments.block.tag.unknown", object));

    public static RO id_class() {
        return new RO();
    }

    public static Predicate<ryw_3> id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((RX)commandContext.getArgument(string, RX.class)).create(((gy_3)commandContext.getSource()).id_super().g());
    }

    public RX id_class(StringReader stringReader) throws CommandSyntaxException {
        Rk_1 rk_1 = new Rk_1(stringReader, true).id_class(true);
        if (rk_1.id_break() != null) {
            Rh_1 rh_1 = new Rh_1(rk_1.id_break(), rk_1.id_class().keySet(), rk_1.id_byte());
            return rlQ_22 -> rh_1;
        }
        rqO_2 rqO_22 = rk_1.id_protected();
        return rlQ_22 -> {
            rlb_3<xd_3> rlb_32 = rlQ_22.id_class().id_class(rqO_22);
            if (rlb_32 == null) {
                throw id_break.create((Object)rqO_22.toString());
            }
            return new RJ(rlb_32, rk_1.id_finally(), rk_1.id_byte());
        };
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
        Rk_1 rk_1 = new Rk_1(stringReader, true);
        try {
            rk_1.id_class(true);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return rk_1.id_class(suggestionsBuilder, rls_3.id_class());
    }
}

