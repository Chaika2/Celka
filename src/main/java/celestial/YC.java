/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
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
import celestial.rXQ;
import celestial.rgn_3;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class YC
implements ArgumentType<Integer> {
    private static final Collection<String> id_class = Arrays.asList("container.5", "12", "weapon");
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("slot.unknown", object));
    private static final Map<String, Integer> id_byte = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
        int n;
        for (n = 0; n < 54; ++n) {
            hashMap.put("container." + n, n);
        }
        for (n = 0; n < 9; ++n) {
            hashMap.put("hotbar." + n, n);
        }
        for (n = 0; n < 27; ++n) {
            hashMap.put("inventory." + n, 9 + n);
        }
        for (n = 0; n < 27; ++n) {
            hashMap.put("enderchest." + n, 200 + n);
        }
        for (n = 0; n < 8; ++n) {
            hashMap.put("villager." + n, 300 + n);
        }
        for (n = 0; n < 15; ++n) {
            hashMap.put("horse." + n, 500 + n);
        }
        hashMap.put("weapon", 98);
        hashMap.put("weapon.mainhand", 98);
        hashMap.put("weapon.offhand", 99);
        hashMap.put("armor.head", 100 + rXQ.HEAD.id_break());
        hashMap.put("armor.chest", 100 + rXQ.CHEST.id_break());
        hashMap.put("armor.legs", 100 + rXQ.LEGS.id_break());
        hashMap.put("armor.feet", 100 + rXQ.FEET.id_break());
        hashMap.put("horse.saddle", 400);
        hashMap.put("horse.armor", 401);
        hashMap.put("horse.chest", 499);
    });

    public static YC id_class() {
        return new YC();
    }

    public Integer id_class(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.readUnquotedString();
        if (!id_byte.containsKey(string)) {
            throw id_break.create((Object)string);
        }
        return id_byte.get(string);
    }

    public static int id_class(CommandContext<gy_3> commandContext, String string) {
        return (Integer)commandContext.getArgument(string, Integer.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_break(id_byte.keySet(), suggestionsBuilder);
    }
}

