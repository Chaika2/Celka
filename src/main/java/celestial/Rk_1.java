/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.gR_2;
import celestial.rCF;
import celestial.rCZ;
import celestial.rVL;
import celestial.rcH_2;
import celestial.rcd_3;
import celestial.rgn_3;
import celestial.rlW_2;
import celestial.rlb_3;
import celestial.rqO_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class Rk_1 {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.block.tag.disallowed"));
    public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("argument.block.id.invalid", object));
    public static final Dynamic2CommandExceptionType id_byte = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.block.property.unknown", object, object2));
    public static final Dynamic2CommandExceptionType id_protected = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.block.property.duplicate", object2, object));
    public static final Dynamic3CommandExceptionType id_throws = new Dynamic3CommandExceptionType((object, object2, object3) -> new rgn_3("argument.block.property.invalid", object, object3, object2));
    public static final Dynamic2CommandExceptionType id_case = new Dynamic2CommandExceptionType((object, object2) -> new rgn_3("argument.block.property.novalue", object, object2));
    public static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType((Message)new rgn_3("argument.block.property.unclosed"));
    private static final BiFunction<SuggestionsBuilder, rlW_2<xd_3>, CompletableFuture<Suggestions>> id_private = (suggestionsBuilder, rlW_22) -> suggestionsBuilder.buildFuture();
    private final StringReader id_implements;
    private final boolean id_finally;
    private final Map<rCZ<?>, Comparable<?>> id_extends = Maps.newHashMap();
    private final Map<String, String> id_native = Maps.newHashMap();
    private rqO_2 id_volatile = new rqO_2("");
    private rCF<xd_3, xc_3> id_final;
    private xc_3 id_package;
    private rcd_3 id_int;
    private rqO_2 id_new = new rqO_2("");
    private int id_continue;
    private BiFunction<SuggestionsBuilder, rlW_2<xd_3>, CompletableFuture<Suggestions>> id_super = id_private;

    private CompletableFuture<Suggestions> id_byte(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        return this.id_throws(suggestionsBuilder, rlW_22);
    }

    public rcd_3 id_byte() {
        return this.id_int;
    }

    public Rk_1(StringReader stringReader, boolean bl) {
        this.id_implements = stringReader;
        this.id_finally = bl;
    }

    private CompletableFuture<Suggestions> id_class(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22, String string) {
        rlb_3<xd_3> rlb_32;
        boolean bl = false;
        if (this.id_new != null && !this.id_new.id_break().isEmpty() && (rlb_32 = rlW_22.id_class(this.id_new)) != null) {
            block0: for (xd_3 xd_32 : rlb_32.id_class()) {
                rCZ<?> rCZ2 = xd_32.id_new().id_class(string);
                if (rCZ2 != null) {
                    Rk_1.id_class(suggestionsBuilder, rCZ2);
                }
                if (bl) continue;
                for (rCZ<?> rCZ3 : xd_32.id_new().id_protected()) {
                    if (this.id_native.containsKey(rCZ3.id_throws())) continue;
                    bl = true;
                    continue block0;
                }
            }
        }
        if (bl) {
            suggestionsBuilder.suggest(String.valueOf(','));
        }
        suggestionsBuilder.suggest(String.valueOf(']'));
        return suggestionsBuilder.buildFuture();
    }

    private static <T extends Comparable<T>> SuggestionsBuilder id_class(SuggestionsBuilder suggestionsBuilder, rCZ<T> rCZ2) {
        for (Comparable comparable : rCZ2.id_class()) {
            if (comparable instanceof Integer) {
                suggestionsBuilder.suggest(((Integer)comparable).intValue());
                continue;
            }
            suggestionsBuilder.suggest(rCZ2.id_class(comparable));
        }
        return suggestionsBuilder;
    }

    private <T extends Comparable<T>> void id_class(rCZ<T> rCZ2, String string, int n) throws CommandSyntaxException {
        Optional<T> optional = rCZ2.id_break(string);
        if (!optional.isPresent()) {
            this.id_implements.setCursor(n);
            throw id_throws.createWithContext((ImmutableStringReader)this.id_implements, (Object)this.id_volatile.toString(), (Object)rCZ2.id_throws(), (Object)string);
        }
        this.id_package = (xc_3)this.id_package.id_class(rCZ2, (Comparable)optional.get());
        this.id_extends.put(rCZ2, (Comparable)optional.get());
    }

    public static String id_class(xc_3 xc_32) {
        StringBuilder stringBuilder = new StringBuilder(rVL.id_strictfp.id_break(xc_32.id_break()).toString());
        if (!xc_32.id_public().isEmpty()) {
            stringBuilder.append('[');
            boolean bl = false;
            for (Map.Entry entry : xc_32.id_goto().entrySet()) {
                if (bl) {
                    stringBuilder.append(',');
                }
                Rk_1.id_class(stringBuilder, (rCZ)entry.getKey(), (Comparable)entry.getValue());
                bl = true;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    private static <T extends Comparable<T>> void id_class(StringBuilder stringBuilder, rCZ<T> rCZ2, Comparable<?> comparable) {
        stringBuilder.append(rCZ2.id_throws());
        stringBuilder.append('=');
        stringBuilder.append(rCZ2.id_class(comparable));
    }

    public CompletableFuture<Suggestions> id_class(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        return this.id_super.apply(suggestionsBuilder.createOffset(this.id_implements.getCursor()), rlW_22);
    }

    public Rk_1 id_class(boolean bl) throws CommandSyntaxException {
        this.id_super = this::id_native;
        if (this.id_implements.canRead() && this.id_implements.peek() == '#') {
            this.id_case();
            this.id_super = this::id_implements;
            if (this.id_implements.canRead() && this.id_implements.peek() == '[') {
                this.id_private();
                this.id_super = this::id_case;
            }
        } else {
            this.id_throws();
            this.id_super = this::id_finally;
            if (this.id_implements.canRead() && this.id_implements.peek() == '[') {
                this.id_catch();
                this.id_super = this::id_case;
            }
        }
        if (bl && this.id_implements.canRead() && this.id_implements.peek() == '{') {
            this.id_super = id_private;
            this.id_implements();
        }
        return this;
    }

    public Map<rCZ<?>, Comparable<?>> id_class() {
        return this.id_extends;
    }

    private boolean id_class(rlW_2<xd_3> rlW_22) {
        rlb_3<xd_3> rlb_32;
        if (this.id_package != null) {
            return this.id_package.id_break().id_protected();
        }
        if (this.id_new != null && (rlb_32 = rlW_22.id_class(this.id_new)) != null) {
            for (xd_3 xd_32 : rlb_32.id_class()) {
                if (!xd_32.id_protected()) continue;
                return true;
            }
        }
        return false;
    }

    private CompletableFuture<Suggestions> id_break(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        return this.id_protected(suggestionsBuilder, rlW_22);
    }

    public xc_3 id_break() {
        return this.id_package;
    }

    public void id_throws() throws CommandSyntaxException {
        int n = this.id_implements.getCursor();
        this.id_volatile = rqO_2.id_class(this.id_implements);
        xd_3 xd_32 = rVL.id_strictfp.id_break(this.id_volatile).orElseThrow(() -> {
            this.id_implements.setCursor(n);
            return id_break.createWithContext((ImmutableStringReader)this.id_implements, (Object)this.id_volatile.toString());
        });
        this.id_final = xd_32.id_new();
        this.id_package = xd_32.id_continue();
    }

    private CompletableFuture<Suggestions> id_throws(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        rlb_3<xd_3> rlb_32;
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        if (this.id_new != null && !this.id_new.id_break().isEmpty() && (rlb_32 = rlW_22.id_class(this.id_new)) != null) {
            for (xd_3 xd_32 : rlb_32.id_class()) {
                for (rCZ<?> rCZ2 : xd_32.id_new().id_protected()) {
                    if (this.id_native.containsKey(rCZ2.id_throws()) || !rCZ2.id_throws().startsWith(string)) continue;
                    suggestionsBuilder.suggest(rCZ2.id_throws() + "=");
                }
            }
        }
        return suggestionsBuilder.buildFuture();
    }

    public Map<String, String> id_finally() {
        return this.id_native;
    }

    private CompletableFuture<Suggestions> id_finally(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            if (!this.id_package.id_break().id_new().id_protected().isEmpty()) {
                suggestionsBuilder.suggest(String.valueOf('['));
            }
            if (this.id_package.id_break().id_protected()) {
                suggestionsBuilder.suggest(String.valueOf('{'));
            }
        }
        return suggestionsBuilder.buildFuture();
    }

    private CompletableFuture<Suggestions> id_catch(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf('='));
        }
        return suggestionsBuilder.buildFuture();
    }

    public void id_catch() throws CommandSyntaxException {
        this.id_implements.skip();
        this.id_super = this::id_break;
        this.id_implements.skipWhitespace();
        while (this.id_implements.canRead() && this.id_implements.peek() != ']') {
            this.id_implements.skipWhitespace();
            int n = this.id_implements.getCursor();
            String string = this.id_implements.readString();
            rCZ<?> rCZ2 = this.id_final.id_class(string);
            if (rCZ2 == null) {
                this.id_implements.setCursor(n);
                throw id_byte.createWithContext((ImmutableStringReader)this.id_implements, (Object)this.id_volatile.toString(), (Object)string);
            }
            if (this.id_extends.containsKey(rCZ2)) {
                this.id_implements.setCursor(n);
                throw id_protected.createWithContext((ImmutableStringReader)this.id_implements, (Object)this.id_volatile.toString(), (Object)string);
            }
            this.id_implements.skipWhitespace();
            this.id_super = this::id_catch;
            if (!this.id_implements.canRead() || this.id_implements.peek() != '=') {
                throw id_case.createWithContext((ImmutableStringReader)this.id_implements, (Object)this.id_volatile.toString(), (Object)string);
            }
            this.id_implements.skip();
            this.id_implements.skipWhitespace();
            this.id_super = (suggestionsBuilder, rlW_22) -> Rk_1.id_class(suggestionsBuilder, rCZ2).buildFuture();
            int n2 = this.id_implements.getCursor();
            this.id_class(rCZ2, this.id_implements.readString(), n2);
            this.id_super = this::id_private;
            this.id_implements.skipWhitespace();
            if (!this.id_implements.canRead()) continue;
            if (this.id_implements.peek() == ',') {
                this.id_implements.skip();
                this.id_super = this::id_protected;
                continue;
            }
            if (this.id_implements.peek() == ']') break;
            throw id_catch.createWithContext((ImmutableStringReader)this.id_implements);
        }
        if (this.id_implements.canRead()) {
            this.id_implements.skip();
            return;
        }
        throw id_catch.createWithContext((ImmutableStringReader)this.id_implements);
    }

    private CompletableFuture<Suggestions> id_extends(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        return gR_2.id_class(rlW_22.id_break(), suggestionsBuilder.createOffset(this.id_continue).add(suggestionsBuilder));
    }

    public void id_case() throws CommandSyntaxException {
        if (!this.id_finally) {
            throw id_class.create();
        }
        this.id_super = this::id_extends;
        this.id_implements.expect('#');
        this.id_continue = this.id_implements.getCursor();
        this.id_new = rqO_2.id_class(this.id_implements);
    }

    private CompletableFuture<Suggestions> id_case(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        if (suggestionsBuilder.getRemaining().isEmpty() && this.id_class(rlW_22)) {
            suggestionsBuilder.suggest(String.valueOf('{'));
        }
        return suggestionsBuilder.buildFuture();
    }

    private CompletableFuture<Suggestions> id_implements(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        rlb_3<xd_3> rlb_32;
        if (suggestionsBuilder.getRemaining().isEmpty() && (rlb_32 = rlW_22.id_class(this.id_new)) != null) {
            xd_3 xd_32;
            boolean bl = false;
            boolean bl2 = false;
            Iterator<xd_3> iterator = rlb_32.id_class().iterator();
            while (!(!iterator.hasNext() || (bl |= !(xd_32 = iterator.next()).id_new().id_protected().isEmpty()) && (bl2 |= xd_32.id_protected()))) {
            }
            if (bl) {
                suggestionsBuilder.suggest(String.valueOf('['));
            }
            if (bl2) {
                suggestionsBuilder.suggest(String.valueOf('{'));
            }
        }
        return this.id_extends(suggestionsBuilder, rlW_22);
    }

    public void id_implements() throws CommandSyntaxException {
        this.id_int = new rcH_2(this.id_implements).id_case();
    }

    private CompletableFuture<Suggestions> id_protected(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (rCZ rCZ2 : this.id_package.id_public()) {
            if (this.id_extends.containsKey(rCZ2) || !rCZ2.id_throws().startsWith(string)) continue;
            suggestionsBuilder.suggest(rCZ2.id_throws() + "=");
        }
        return suggestionsBuilder.buildFuture();
    }

    public rqO_2 id_protected() {
        return this.id_new;
    }

    public void id_private() throws CommandSyntaxException {
        this.id_implements.skip();
        this.id_super = this::id_byte;
        int n = -1;
        this.id_implements.skipWhitespace();
        while (this.id_implements.canRead() && this.id_implements.peek() != ']') {
            this.id_implements.skipWhitespace();
            int n2 = this.id_implements.getCursor();
            String string = this.id_implements.readString();
            if (this.id_native.containsKey(string)) {
                this.id_implements.setCursor(n2);
                throw id_protected.createWithContext((ImmutableStringReader)this.id_implements, (Object)this.id_volatile.toString(), (Object)string);
            }
            this.id_implements.skipWhitespace();
            if (!this.id_implements.canRead() || this.id_implements.peek() != '=') {
                this.id_implements.setCursor(n2);
                throw id_case.createWithContext((ImmutableStringReader)this.id_implements, (Object)this.id_volatile.toString(), (Object)string);
            }
            this.id_implements.skip();
            this.id_implements.skipWhitespace();
            this.id_super = (suggestionsBuilder, rlW_22) -> this.id_class((SuggestionsBuilder)suggestionsBuilder, (rlW_2<xd_3>)rlW_22, string);
            n = this.id_implements.getCursor();
            String string2 = this.id_implements.readString();
            this.id_native.put(string, string2);
            this.id_implements.skipWhitespace();
            if (!this.id_implements.canRead()) continue;
            n = -1;
            if (this.id_implements.peek() == ',') {
                this.id_implements.skip();
                this.id_super = this::id_throws;
                continue;
            }
            if (this.id_implements.peek() == ']') break;
            throw id_catch.createWithContext((ImmutableStringReader)this.id_implements);
        }
        if (this.id_implements.canRead()) {
            this.id_implements.skip();
            return;
        }
        if (n >= 0) {
            this.id_implements.setCursor(n);
        }
        throw id_catch.createWithContext((ImmutableStringReader)this.id_implements);
    }

    private CompletableFuture<Suggestions> id_private(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        if (suggestionsBuilder.getRemaining().isEmpty() && this.id_extends.size() < this.id_package.id_public().size()) {
            suggestionsBuilder.suggest(String.valueOf(','));
        }
        return suggestionsBuilder.buildFuture();
    }

    private CompletableFuture<Suggestions> id_native(SuggestionsBuilder suggestionsBuilder, rlW_2<xd_3> rlW_22) {
        if (this.id_finally) {
            gR_2.id_class(rlW_22.id_break(), suggestionsBuilder, String.valueOf('#'));
        }
        gR_2.id_class(rVL.id_strictfp.id_protected(), suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }
}

