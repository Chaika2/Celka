/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
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
import celestial.rAi_1;
import celestial.rCi_1;
import celestial.rVL;
import celestial.rgn_3;
import celestial.rlr_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class YW
implements ArgumentType<rAi_1> {
    private static final Collection<String> id_break = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
    public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(object -> new rgn_3("argument.criteria.invalid", object));

    private YW() {
    }

    public static YW id_class() {
        return new YW();
    }

    public <T> String id_class(rlr_3<T> rlr_32, Object object) {
        return rCi_1.id_class(rlr_32, object);
    }

    public rAi_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        return rAi_1.id_class(string).orElseThrow(() -> {
            stringReader.setCursor(n);
            return id_class.create((Object)string);
        });
    }

    public static rAi_1 id_class(CommandContext<gy_3> commandContext, String string) {
        return (rAi_1)commandContext.getArgument(string, rAi_1.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        ArrayList arrayList = Lists.newArrayList(rAi_1.id_class.keySet());
        for (rlr_3 rlr_32 : rVL.h) {
            for (Object e : rlr_32.id_class()) {
                String string = this.id_class(rlr_32, e);
                arrayList.add(string);
            }
        }
        return gR_2.id_break(arrayList, suggestionsBuilder);
    }
}

