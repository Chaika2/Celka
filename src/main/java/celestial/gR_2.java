/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.gY_2;
import celestial.rVm_1;
import celestial.rYB;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface gR_2 {
    public Collection<String> id_byte();

    public static CompletableFuture<Suggestions> id_class(Stream<rqO_2> stream, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_class(stream::iterator, suggestionsBuilder);
    }

    public static CompletableFuture<Suggestions> id_class(String string, Collection<gY_2> collection, SuggestionsBuilder suggestionsBuilder, Predicate<String> predicate) {
        ArrayList arrayList;
        block4: {
            String[] stringArray;
            block5: {
                block3: {
                    arrayList = Lists.newArrayList();
                    if (!Strings.isNullOrEmpty((String)string)) break block3;
                    for (gY_2 gY_22 : collection) {
                        String string2 = gY_22.id_byte + " " + gY_22.id_protected + " " + gY_22.id_throws;
                        if (!predicate.test(string2)) continue;
                        arrayList.add(gY_22.id_byte);
                        arrayList.add(gY_22.id_byte + " " + gY_22.id_protected);
                        arrayList.add(string2);
                    }
                    break block4;
                }
                stringArray = string.split(" ");
                if (stringArray.length != 1) break block5;
                for (gY_2 gY_23 : collection) {
                    String string3 = stringArray[0] + " " + gY_23.id_protected + " " + gY_23.id_throws;
                    if (!predicate.test(string3)) continue;
                    arrayList.add(stringArray[0] + " " + gY_23.id_protected);
                    arrayList.add(string3);
                }
                break block4;
            }
            if (stringArray.length != 2) break block4;
            for (gY_2 gY_24 : collection) {
                String string4 = stringArray[0] + " " + stringArray[1] + " " + gY_24.id_throws;
                if (!predicate.test(string4)) continue;
                arrayList.add(string4);
            }
        }
        return gR_2.id_break(arrayList, suggestionsBuilder);
    }

    public static <T> CompletableFuture<Suggestions> id_class(Stream<T> stream, SuggestionsBuilder suggestionsBuilder, Function<T, rqO_2> function, Function<T, Message> function2) {
        return gR_2.id_class(stream::iterator, suggestionsBuilder, function, function2);
    }

    public static <T> CompletableFuture<Suggestions> id_class(Iterable<T> iterable, SuggestionsBuilder suggestionsBuilder, Function<T, rqO_2> function, Function<T, Message> function2) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        gR_2.id_class(iterable, string, function, (T object) -> suggestionsBuilder.suggest(((rqO_2)function.apply(object)).toString(), (Message)function2.apply(object)));
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> id_class(Iterable<rqO_2> iterable, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        gR_2.id_class(iterable, string, (T rqO_22) -> rqO_22, (T rqO_22) -> suggestionsBuilder.suggest(rqO_22.toString()));
        return suggestionsBuilder.buildFuture();
    }

    public static CompletableFuture<Suggestions> id_class(Iterable<rqO_2> iterable, SuggestionsBuilder suggestionsBuilder, String string) {
        String string2 = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        gR_2.id_class(iterable, string2, string, rqO_22 -> rqO_22, rqO_22 -> suggestionsBuilder.suggest(string + rqO_22));
        return suggestionsBuilder.buildFuture();
    }

    public static boolean id_class(String string, String string2) {
        int n = 0;
        while (!string2.startsWith(string, n)) {
            if ((n = string2.indexOf(95, n)) < 0) {
                return false;
            }
            ++n;
        }
        return true;
    }

    public static CompletableFuture<Suggestions> id_class(String[] stringArray, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (String string2 : stringArray) {
            if (!gR_2.id_class(string, string2.toLowerCase(Locale.ROOT))) continue;
            suggestionsBuilder.suggest(string2);
        }
        return suggestionsBuilder.buildFuture();
    }

    public CompletableFuture<Suggestions> id_class(CommandContext<gR_2> var1, SuggestionsBuilder var2);

    public Collection<String> id_class();

    public boolean id_class(int var1);

    public static <T> void id_class(Iterable<T> iterable, String string, String string2, Function<T, rqO_2> function, Consumer<T> consumer) {
        if (string.isEmpty()) {
            iterable.forEach(consumer);
        } else {
            String string3 = Strings.commonPrefix((CharSequence)string, (CharSequence)string2);
            if (!string3.isEmpty()) {
                String string4 = string.substring(string3.length());
                gR_2.id_class(iterable, string4, function, consumer);
            }
        }
    }

    public static <T> void id_class(Iterable<T> iterable, String string, Function<T, rqO_2> function, Consumer<T> consumer) {
        boolean bl = string.indexOf(58) > -1;
        for (T t : iterable) {
            rqO_2 rqO_22 = function.apply(t);
            if (bl) {
                String string2 = rqO_22.toString();
                if (!gR_2.id_class(string, string2)) continue;
                consumer.accept(t);
                continue;
            }
            if (!gR_2.id_class(string, rqO_22.id_byte()) && (!rqO_22.id_byte().equals("minecraft") || !gR_2.id_class(string, rqO_22.id_break()))) continue;
            consumer.accept(t);
        }
    }

    public static CompletableFuture<Suggestions> id_break(Stream<String> stream, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        stream.filter(string2 -> gR_2.id_class(string, string2.toLowerCase(Locale.ROOT))).forEach(arg_0 -> ((SuggestionsBuilder)suggestionsBuilder).suggest(arg_0));
        return suggestionsBuilder.buildFuture();
    }

    default public Collection<String> id_break() {
        return Collections.emptyList();
    }

    public static CompletableFuture<Suggestions> id_break(String string, Collection<gY_2> collection, SuggestionsBuilder suggestionsBuilder, Predicate<String> predicate) {
        ArrayList arrayList;
        block3: {
            block2: {
                arrayList = Lists.newArrayList();
                if (!Strings.isNullOrEmpty((String)string)) break block2;
                for (gY_2 gY_22 : collection) {
                    String string2 = gY_22.id_byte + " " + gY_22.id_throws;
                    if (!predicate.test(string2)) continue;
                    arrayList.add(gY_22.id_byte);
                    arrayList.add(string2);
                }
                break block3;
            }
            String[] stringArray = string.split(" ");
            if (stringArray.length != 1) break block3;
            for (gY_2 gY_23 : collection) {
                String string3 = stringArray[0] + " " + gY_23.id_throws;
                if (!predicate.test(string3)) continue;
                arrayList.add(string3);
            }
        }
        return gR_2.id_break(arrayList, suggestionsBuilder);
    }

    public static CompletableFuture<Suggestions> id_break(Iterable<String> iterable, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (String string2 : iterable) {
            if (!gR_2.id_class(string, string2.toLowerCase(Locale.ROOT))) continue;
            suggestionsBuilder.suggest(string2);
        }
        return suggestionsBuilder.buildFuture();
    }

    public Stream<rqO_2> id_throws();

    default public Collection<gY_2> id_catch() {
        return Collections.singleton(gY_2.id_break);
    }

    default public Collection<gY_2> id_case() {
        return Collections.singleton(gY_2.id_break);
    }

    public rVm_1 id_implements();

    public Collection<rqO_2> id_protected();

    public Set<rqM_2<rYB>> id_private();
}

