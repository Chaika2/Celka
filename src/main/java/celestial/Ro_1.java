/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.gR_2;
import celestial.rCZ;
import celestial.rVL;
import celestial.rcH_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rgn_3;
import celestial.rlW_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class Ro_1 {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.item.tag.disallowed"));
    public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("argument.item.id.invalid", object));
    private static final BiFunction<SuggestionsBuilder, rlW_2<rdb_3>, CompletableFuture<Suggestions>> id_byte = (suggestionsBuilder, rlW_22) -> suggestionsBuilder.buildFuture();
    private final StringReader id_protected;
    private final boolean id_throws;
    private final Map<rCZ<?>, Comparable<?>> id_case = Maps.newHashMap();
    private rdb_3 id_catch;
    private rcd_3 id_private;
    private rqO_2 id_implements = new rqO_2("");
    private int id_finally;
    private BiFunction<SuggestionsBuilder, rlW_2<rdb_3>, CompletableFuture<Suggestions>> id_extends = id_byte;

    public rqO_2 id_byte() {
        return this.id_implements;
    }

    private CompletableFuture<Suggestions> id_byte(SuggestionsBuilder suggestionsBuilder, rlW_2<rdb_3> rlW_22) {
        return gR_2.id_class(rlW_22.id_break(), suggestionsBuilder.createOffset(this.id_finally));
    }

    public Ro_1(StringReader stringReader, boolean bl) {
        this.id_protected = stringReader;
        this.id_throws = bl;
    }

    public CompletableFuture<Suggestions> id_class(SuggestionsBuilder suggestionsBuilder, rlW_2<rdb_3> rlW_22) {
        return this.id_extends.apply(suggestionsBuilder.createOffset(this.id_protected.getCursor()), rlW_22);
    }

    public rdb_3 id_class() {
        return this.id_catch;
    }

    private CompletableFuture<Suggestions> id_break(SuggestionsBuilder suggestionsBuilder, rlW_2<rdb_3> rlW_22) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf('{'));
        }
        return suggestionsBuilder.buildFuture();
    }

    public rcd_3 id_break() {
        return this.id_private;
    }

    public void id_throws() throws CommandSyntaxException {
        if (!this.id_throws) {
            throw id_class.create();
        }
        this.id_extends = this::id_byte;
        this.id_protected.expect('#');
        this.id_finally = this.id_protected.getCursor();
        this.id_implements = rqO_2.id_class(this.id_protected);
    }

    public Ro_1 id_catch() throws CommandSyntaxException {
        this.id_extends = this::id_protected;
        if (this.id_protected.canRead() && this.id_protected.peek() == '#') {
            this.id_throws();
        } else {
            this.id_protected();
            this.id_extends = this::id_break;
        }
        if (this.id_protected.canRead() && this.id_protected.peek() == '{') {
            this.id_extends = id_byte;
            this.id_case();
        }
        return this;
    }

    public void id_case() throws CommandSyntaxException {
        this.id_private = new rcH_2(this.id_protected).id_case();
    }

    public void id_protected() throws CommandSyntaxException {
        int n = this.id_protected.getCursor();
        rqO_2 rqO_22 = rqO_2.id_class(this.id_protected);
        this.id_catch = rVL.id_for.id_break(rqO_22).orElseThrow(() -> {
            this.id_protected.setCursor(n);
            return id_break.createWithContext((ImmutableStringReader)this.id_protected, (Object)rqO_22.toString());
        });
    }

    private CompletableFuture<Suggestions> id_protected(SuggestionsBuilder suggestionsBuilder, rlW_2<rdb_3> rlW_22) {
        if (this.id_throws) {
            gR_2.id_class(rlW_22.id_break(), suggestionsBuilder, String.valueOf('#'));
        }
        return gR_2.id_class(rVL.id_for.id_protected(), suggestionsBuilder);
    }
}

