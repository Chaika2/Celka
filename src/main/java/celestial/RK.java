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

import celestial.RD;
import celestial.RU;
import celestial.Re_1;
import celestial.Ro_1;
import celestial.gy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgn_3;
import celestial.rlb_3;
import celestial.rlc_3;
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
import java.util.function.Predicate;

public class RK
implements ArgumentType<RD> {
    private static final Collection<String> id_class = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("arguments.item.tag.unknown", object));

    public static RK id_class() {
        return new RK();
    }

    public static Predicate<rdn_3> id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((RD)commandContext.getArgument(string, RD.class)).create(commandContext);
    }

    public RD id_class(StringReader stringReader) throws CommandSyntaxException {
        Ro_1 ro_1 = new Ro_1(stringReader, true).id_catch();
        if (ro_1.id_class() != null) {
            RU rU = new RU(ro_1.id_class(), ro_1.id_break());
            return commandContext -> rU;
        }
        rqO_2 rqO_22 = ro_1.id_byte();
        return commandContext -> {
            rlb_3<rdb_3> rlb_32 = ((gy_3)commandContext.getSource()).id_super().g().id_break().id_class(rqO_22);
            if (rlb_32 == null) {
                throw id_break.create((Object)rqO_22.toString());
            }
            return new Re_1(rlb_32, ro_1.id_break());
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
        Ro_1 ro_1 = new Ro_1(stringReader, true);
        try {
            ro_1.id_catch();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return ro_1.id_class(suggestionsBuilder, rlc_3.id_class());
    }
}

