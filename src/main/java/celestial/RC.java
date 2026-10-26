/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
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

import celestial.RF;
import celestial.RL;
import celestial.Rn_1;
import celestial.XF;
import celestial.XL;
import celestial.Xm_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rjU_2;
import com.google.common.primitives.Doubles;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class RC {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.invalid"));
    public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("argument.entity.selector.unknown", object));
    public static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.selector.not_allowed"));
    public static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.selector.missing"));
    public static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.options.unterminated"));
    public static final DynamicCommandExceptionType id_case = new DynamicCommandExceptionType(object -> new rgn_3("argument.entity.options.valueless", object));
    public static final BiConsumer<rjU_2, List<? extends an_3>> id_catch = (rjU_22, list) -> {};
    public static final BiConsumer<rjU_2, List<? extends an_3>> id_private = (rjU_22, list) -> list.sort((an_32, an_33) -> Doubles.compare((double)an_32.id_break((rjU_2)rjU_22), (double)an_33.id_break((rjU_2)rjU_22)));
    public static final BiConsumer<rjU_2, List<? extends an_3>> id_implements = (rjU_22, list) -> list.sort((an_32, an_33) -> Doubles.compare((double)an_33.id_break((rjU_2)rjU_22), (double)an_32.id_break((rjU_2)rjU_22)));
    public static final BiConsumer<rjU_2, List<? extends an_3>> id_finally = (rjU_22, list) -> Collections.shuffle(list);
    public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> id_extends = (suggestionsBuilder, consumer) -> suggestionsBuilder.buildFuture();
    private final StringReader id_native;
    private final boolean id_volatile;
    private int id_final;
    private boolean id_package;
    private boolean id_int;
    private Xm_1 id_new = Xm_1.id_throws;
    private XF id_continue = XF.id_throws;
    private Double id_super;
    private Double id_this;
    private Double id_else;
    private Double id_synchronized;
    private Double id_return;
    private Double id_public;
    private XL id_goto = XL.id_class;
    private XL id_while = XL.id_class;
    private Predicate<an_3> id_try = an_32 -> true;
    private BiConsumer<rjU_2, List<? extends an_3>> id_instanceof = id_catch;
    private boolean id_throw;
    private String id_interface;
    private int id_char;
    private UUID id_abstract;
    private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> id_long = id_extends;
    private boolean id_float;
    private boolean id_void;
    private boolean id_static;
    private boolean id_import;
    private boolean id_short;
    private boolean id_default;
    private boolean id_const;
    private boolean id_strictfp;
    private aI_2<?> id_boolean;
    private boolean id_transient;
    private boolean id_for;
    private boolean id_double;
    private boolean id_switch;

    public boolean id_char() {
        return this.id_for;
    }

    private CompletableFuture<Suggestions> id_byte(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        SuggestionsBuilder suggestionsBuilder2 = suggestionsBuilder.createOffset(this.id_char);
        consumer.accept(suggestionsBuilder2);
        return suggestionsBuilder.add(suggestionsBuilder2).buildFuture();
    }

    public void id_byte(double d) {
        this.id_else = d;
    }

    protected void id_byte() throws CommandSyntaxException {
        if (this.id_native.canRead()) {
            this.id_long = this::id_byte;
        }
        int n = this.id_native.getCursor();
        String string = this.id_native.readString();
        try {
            this.id_abstract = UUID.fromString(string);
            this.id_package = true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            if (string.isEmpty() || string.length() > 16) {
                this.id_native.setCursor(n);
                throw id_class.createWithContext((ImmutableStringReader)this.id_native);
            }
            this.id_package = false;
            this.id_interface = string;
        }
        this.id_final = 1;
    }

    public void id_byte(boolean bl) {
        this.id_void = bl;
    }

    public Double id_int() {
        return this.id_synchronized;
    }

    private void id_long() {
        if (this.id_goto != XL.id_class) {
            this.id_try = this.id_try.and(this.id_class(this.id_goto, (an_3 an_32) -> ((Float)an_32.id_throws[16]).floatValue()));
        }
        if (this.id_while != XL.id_class) {
            this.id_try = this.id_try.and(this.id_class(this.id_while, (an_3 an_32) -> ((Float)an_32.id_throws[15]).floatValue()));
        }
        if (!this.id_continue.id_byte()) {
            this.id_try = this.id_try.and(an_32 -> !(an_32 instanceof rhN_2) ? false : this.id_continue.id_byte((Integer)((rhN_2)an_32).id_implements[19]));
        }
    }

    public RC(StringReader stringReader) {
        this(stringReader, true);
    }

    public RC(StringReader stringReader, boolean bl) {
        this.id_native = stringReader;
        this.id_volatile = bl;
    }

    public boolean id_this() {
        return this.id_throw;
    }

    public boolean id_interface() {
        return this.id_transient;
    }

    public void id_class(aI_2<?> aI_22) {
        this.id_boolean = aI_22;
    }

    private Predicate<an_3> id_class(XL xL, ToDoubleFunction<an_3> toDoubleFunction) {
        double d = rfU_2.id_catch(xL.id_class() == null ? 0.0f : xL.id_class().floatValue());
        double d2 = rfU_2.id_catch(xL.id_break() == null ? 359.0f : xL.id_break().floatValue());
        return an_32 -> {
            double d3 = rfU_2.id_case(toDoubleFunction.applyAsDouble((an_3)an_32));
            if (d > d2) {
                return d3 >= d || d3 <= d2;
            }
            return d3 >= d && d3 <= d2;
        };
    }

    public void id_class(Predicate<an_3> predicate) {
        this.id_try = this.id_try.and(predicate);
    }

    private rfl_3 id_class(double d, double d2, double d3) {
        boolean bl = d < 0.0;
        boolean bl2 = d2 < 0.0;
        boolean bl3 = d3 < 0.0;
        double d4 = bl ? d : 0.0;
        double d5 = bl2 ? d2 : 0.0;
        double d6 = bl3 ? d3 : 0.0;
        double d7 = (bl ? 0.0 : d) + 1.0;
        double d8 = (bl2 ? 0.0 : d2) + 1.0;
        double d9 = (bl3 ? 0.0 : d3) + 1.0;
        return new rfl_3(d4, d5, d6, d7, d8, d9);
    }

    public void id_class(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> biFunction) {
        this.id_long = biFunction;
    }

    public CompletableFuture<Suggestions> id_class(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        return this.id_long.apply(suggestionsBuilder.createOffset(this.id_native.getCursor()), consumer);
    }

    private static void id_class(SuggestionsBuilder suggestionsBuilder) {
        suggestionsBuilder.suggest("@p", (Message)new rgn_3("argument.entity.selector.nearestPlayer"));
        suggestionsBuilder.suggest("@a", (Message)new rgn_3("argument.entity.selector.allPlayers"));
        suggestionsBuilder.suggest("@r", (Message)new rgn_3("argument.entity.selector.randomPlayer"));
        suggestionsBuilder.suggest("@s", (Message)new rgn_3("argument.entity.selector.self"));
        suggestionsBuilder.suggest("@e", (Message)new rgn_3("argument.entity.selector.allEntities"));
    }

    public void id_class(BiConsumer<rjU_2, List<? extends an_3>> biConsumer) {
        this.id_instanceof = biConsumer;
    }

    public void id_class(boolean bl) {
        this.id_package = bl;
    }

    public void id_class(int n) {
        this.id_final = n;
    }

    public void id_class(XL xL) {
        this.id_goto = xL;
    }

    public Rn_1 id_class() {
        rfl_3 rfl_32;
        if (this.id_synchronized == null && this.id_return == null && this.id_public == null) {
            if (this.id_new.id_break() != null) {
                float f = ((Float)this.id_new.id_break()).floatValue();
                rfl_32 = new rfl_3(-f, -f, -f, f + 1.0f, f + 1.0f, f + 1.0f);
            } else {
                rfl_32 = null;
            }
        } else {
            rfl_32 = this.id_class(this.id_synchronized == null ? 0.0 : this.id_synchronized, this.id_return == null ? 0.0 : this.id_return, this.id_public == null ? 0.0 : this.id_public);
        }
        Function<rjU_2, rjU_2> function = this.id_super == null && this.id_this == null && this.id_else == null ? rjU_22 -> rjU_22 : rjU_22 -> new rjU_2(this.id_super == null ? rjU_22.id_break : this.id_super, this.id_this == null ? rjU_22.id_byte : this.id_this, this.id_else == null ? rjU_22.id_protected : this.id_else);
        return new Rn_1(this.id_final, this.id_package, this.id_int, this.id_try, this.id_new, function, rfl_32, this.id_instanceof, this.id_throw, this.id_interface, this.id_abstract, this.id_boolean, this.id_switch);
    }

    public void id_class(XF xF) {
        this.id_continue = xF;
    }

    public void id_class(Xm_1 xm_1) {
        this.id_new = xm_1;
    }

    public void id_class(double d) {
        this.id_super = d;
    }

    public void id_break(boolean bl) {
        this.id_float = bl;
    }

    protected void id_break() throws CommandSyntaxException {
        this.id_switch = true;
        this.id_long = this::id_protected;
        if (!this.id_native.canRead()) {
            throw id_protected.createWithContext((ImmutableStringReader)this.id_native);
        }
        int n = this.id_native.getCursor();
        char c = this.id_native.read();
        if (c == 'p') {
            this.id_final = 1;
            this.id_package = false;
            this.id_instanceof = id_private;
            this.id_class(aI_2.rM);
        } else if (c == 'a') {
            this.id_final = Integer.MAX_VALUE;
            this.id_package = false;
            this.id_instanceof = id_catch;
            this.id_class(aI_2.rM);
        } else if (c == 'r') {
            this.id_final = 1;
            this.id_package = false;
            this.id_instanceof = id_finally;
            this.id_class(aI_2.rM);
        } else if (c == 's') {
            this.id_final = 1;
            this.id_package = true;
            this.id_throw = true;
        } else {
            if (c != 'e') {
                this.id_native.setCursor(n);
                throw id_break.createWithContext((ImmutableStringReader)this.id_native, (Object)("@" + String.valueOf(c)));
            }
            this.id_final = Integer.MAX_VALUE;
            this.id_package = true;
            this.id_instanceof = id_catch;
            this.id_try = an_3::BM;
        }
        this.id_long = this::id_throws;
        if (this.id_native.canRead() && this.id_native.peek() == '[') {
            this.id_native.skip();
            this.id_long = this::id_case;
            this.id_protected();
        }
    }

    public void id_break(double d) {
        this.id_this = d;
    }

    public void id_break(XL xL) {
        this.id_while = xL;
    }

    private CompletableFuture<Suggestions> id_break(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        consumer.accept(suggestionsBuilder);
        if (this.id_volatile) {
            RC.id_class(suggestionsBuilder);
        }
        return suggestionsBuilder.buildFuture();
    }

    private CompletableFuture<Suggestions> id_throws(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf('['));
        return suggestionsBuilder.buildFuture();
    }

    public void id_throws(double d) {
        this.id_return = d;
    }

    public void id_throws(boolean bl) {
        this.id_import = bl;
    }

    public boolean id_throws() {
        this.id_native.skipWhitespace();
        if (this.id_native.canRead() && this.id_native.peek() == '!') {
            this.id_native.skip();
            this.id_native.skipWhitespace();
            return true;
        }
        return false;
    }

    public XF id_finally() {
        return this.id_continue;
    }

    public void id_finally(boolean bl) {
        this.id_for = bl;
    }

    public StringReader id_catch() {
        return this.id_native;
    }

    public void id_catch(boolean bl) {
        this.id_default = bl;
    }

    private CompletableFuture<Suggestions> id_catch(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        RF.id_class(this, suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }

    public XL id_extends() {
        return this.id_goto;
    }

    public void id_extends(boolean bl) {
        this.id_double = bl;
    }

    public boolean id_goto() {
        return this.id_short;
    }

    public boolean id_case() {
        this.id_native.skipWhitespace();
        if (this.id_native.canRead() && this.id_native.peek() == '#') {
            this.id_native.skip();
            this.id_native.skipWhitespace();
            return true;
        }
        return false;
    }

    public void id_case(double d) {
        this.id_public = d;
    }

    public void id_case(boolean bl) {
        this.id_short = bl;
    }

    private CompletableFuture<Suggestions> id_case(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf(']'));
        RF.id_class(this, suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }

    public Double id_continue() {
        return this.id_public;
    }

    public boolean id_else() {
        return this.id_float;
    }

    public Xm_1 id_implements() {
        return this.id_new;
    }

    public void id_implements(boolean bl) {
        this.id_strictfp = bl;
    }

    public void id_instanceof() {
        this.id_transient = true;
    }

    public Double id_new() {
        return this.id_return;
    }

    public Double id_package() {
        return this.id_else;
    }

    public boolean id_return() {
        return this.id_static;
    }

    public Rn_1 id_super() throws CommandSyntaxException {
        this.id_char = this.id_native.getCursor();
        this.id_long = this::id_break;
        if (this.id_native.canRead() && this.id_native.peek() == '@') {
            if (!this.id_volatile) {
                throw id_byte.createWithContext((ImmutableStringReader)this.id_native);
            }
            this.id_native.skip();
            this.id_break();
        } else {
            this.id_byte();
        }
        this.id_long();
        return this.id_class();
    }

    public boolean id_throw() {
        return this.id_boolean != null;
    }

    public boolean id_try() {
        return this.id_const;
    }

    public boolean id_while() {
        return this.id_default;
    }

    public boolean id_public() {
        return this.id_import;
    }

    public void id_protected(boolean bl) {
        this.id_static = bl;
    }

    protected void id_protected() throws CommandSyntaxException {
        this.id_long = this::id_catch;
        this.id_native.skipWhitespace();
        while (this.id_native.canRead() && this.id_native.peek() != ']') {
            this.id_native.skipWhitespace();
            int n = this.id_native.getCursor();
            String string = this.id_native.readString();
            RL rL = RF.id_class(this, string, n);
            this.id_native.skipWhitespace();
            if (!this.id_native.canRead() || this.id_native.peek() != '=') {
                this.id_native.setCursor(n);
                throw id_case.createWithContext((ImmutableStringReader)this.id_native, (Object)string);
            }
            this.id_native.skip();
            this.id_native.skipWhitespace();
            this.id_long = id_extends;
            rL.handle(this);
            this.id_native.skipWhitespace();
            this.id_long = this::id_private;
            if (!this.id_native.canRead()) continue;
            if (this.id_native.peek() == ',') {
                this.id_native.skip();
                this.id_long = this::id_catch;
                continue;
            }
            if (this.id_native.peek() == ']') break;
            throw id_throws.createWithContext((ImmutableStringReader)this.id_native);
        }
        if (this.id_native.canRead()) {
            this.id_native.skip();
            this.id_long = id_extends;
            return;
        }
        throw id_throws.createWithContext((ImmutableStringReader)this.id_native);
    }

    public void id_protected(double d) {
        this.id_synchronized = d;
    }

    private CompletableFuture<Suggestions> id_protected(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        SuggestionsBuilder suggestionsBuilder2 = suggestionsBuilder.createOffset(suggestionsBuilder.getStart() - 1);
        RC.id_class(suggestionsBuilder2);
        suggestionsBuilder.add(suggestionsBuilder2);
        return suggestionsBuilder.buildFuture();
    }

    public void id_private(boolean bl) {
        this.id_const = bl;
    }

    private CompletableFuture<Suggestions> id_private(SuggestionsBuilder suggestionsBuilder, Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf(','));
        suggestionsBuilder.suggest(String.valueOf(']'));
        return suggestionsBuilder.buildFuture();
    }

    public void id_private() {
        this.id_int = true;
    }

    public boolean id_abstract() {
        return this.id_double;
    }

    public Double id_final() {
        return this.id_this;
    }

    public Double id_volatile() {
        return this.id_super;
    }

    public boolean id_synchronized() {
        return this.id_void;
    }

    public XL id_native() {
        return this.id_while;
    }
}

