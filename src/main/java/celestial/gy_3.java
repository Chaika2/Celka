/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ResultConsumer
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.Rm_1;
import celestial.an_3;
import celestial.gR_2;
import celestial.gV_2;
import celestial.rRJ;
import celestial.rRu_1;
import celestial.rVL;
import celestial.rVi_1;
import celestial.rVm_1;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rnW_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrEm_1;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class gy_3
implements gR_2 {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("permissions.requires.player"));
    public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("permissions.requires.entity"));
    private final gV_2 id_byte;
    private final rjU_2 id_protected;
    private final rrEm_1 id_throws;
    private final int id_case;
    private final String id_catch;
    private final rgP_2 id_private;
    private final rnW_2 id_implements;
    private final boolean id_finally;
    private final an_3 id_extends;
    private final ResultConsumer<gy_3> id_native;
    private final Rm_1 id_volatile;
    private final rjK_2 id_final;

    public gy_3 id_byte(int n) {
        return n <= this.id_case ? this : new gy_3(this.id_byte, this.id_protected, this.id_final, this.id_throws, n, this.id_catch, this.id_private, this.id_implements, this.id_extends, this.id_finally, this.id_native, this.id_volatile);
    }

    @Override
    public Collection<String> id_byte() {
        return this.id_implements.R().id_protected();
    }

    public an_3 id_int() throws CommandSyntaxException {
        if (this.id_extends == null) {
            throw id_break.create();
        }
        return this.id_extends;
    }

    protected gy_3(gV_2 gV_22, rjU_2 rjU_22, rjK_2 rjK_22, rrEm_1 rrEm_12, int n, String string, rgP_2 rgP_22, rnW_2 rnW_22, an_3 an_32, boolean bl, ResultConsumer<gy_3> resultConsumer, Rm_1 rm_1) {
        this.id_byte = gV_22;
        this.id_protected = rjU_22;
        this.id_throws = rrEm_12;
        this.id_finally = bl;
        this.id_extends = an_32;
        this.id_case = n;
        this.id_catch = string;
        this.id_private = rgP_22;
        this.id_implements = rnW_22;
        this.id_native = resultConsumer;
        this.id_volatile = rm_1;
        this.id_final = rjK_22;
    }

    public gy_3(gV_2 gV_22, rjU_2 rjU_22, rjK_2 rjK_22, rrEm_1 rrEm_12, int n2, String string, rgP_2 rgP_22, rnW_2 rnW_22, an_3 an_32) {
        this(gV_22, rjU_22, rjK_22, rrEm_12, n2, string, rgP_22, rnW_22, an_32, false, (ResultConsumer<gy_3>)((ResultConsumer)(commandContext, bl, n) -> {}), Rm_1.FEET);
    }

    public Rm_1 id_this() {
        return this.id_volatile;
    }

    public gy_3 id_class(rjK_2 rjK_22) {
        return this.id_final.id_class(rjK_22) ? this : new gy_3(this.id_byte, this.id_protected, rjK_22, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_extends, this.id_finally, this.id_native, this.id_volatile);
    }

    public gy_3 id_class(an_3 an_32) {
        return this.id_extends == an_32 ? this : new gy_3(this.id_byte, this.id_protected, this.id_final, this.id_throws, this.id_case, an_32.g().getString(), an_32.L_(), this.id_implements, an_32, this.id_finally, this.id_native, this.id_volatile);
    }

    public gy_3 id_class(rjU_2 rjU_22) {
        return this.id_protected.equals(rjU_22) ? this : new gy_3(this.id_byte, rjU_22, this.id_final, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_extends, this.id_finally, this.id_native, this.id_volatile);
    }

    @Override
    public CompletableFuture<Suggestions> id_class(CommandContext<gR_2> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return null;
    }

    @Override
    public boolean id_class(int n) {
        return this.id_case >= n;
    }

    public void id_class(rgP_2 rgP_22) {
        if (this.id_byte.l() && !this.id_finally) {
            this.id_byte.id_class(new rgN_2("").id_class(rgP_22).id_class(rgF_2.RED), rqR_2.id_break);
        }
    }

    public void id_class(rgP_2 rgP_22, boolean bl) {
        if (this.id_byte.C() && !this.id_finally) {
            this.id_byte.id_class(rgP_22, rqR_2.id_break);
        }
        if (bl && this.id_byte.H() && !this.id_finally) {
            this.id_break(rgP_22);
        }
    }

    public void id_class(CommandContext<gy_3> commandContext, boolean bl, int n) {
        if (this.id_native != null) {
            this.id_native.onCommandComplete(commandContext, bl, n);
        }
    }

    @Override
    public Collection<String> id_class() {
        return Lists.newArrayList((Object[])this.id_implements.id_private());
    }

    public gy_3 id_class(an_3 an_32, Rm_1 rm_1) throws CommandSyntaxException {
        return this.id_break(rm_1.id_class(an_32));
    }

    public gy_3 id_class(rrEm_1 rrEm_12) {
        if (rrEm_12 == this.id_throws) {
            return this;
        }
        double d = rRJ.id_class(this.id_throws.id_default(), rrEm_12.id_default());
        rjU_2 rjU_22 = new rjU_2(this.id_protected.id_break * d, this.id_protected.id_byte, this.id_protected.id_protected * d);
        return new gy_3(this.id_byte, rjU_22, this.id_final, rrEm_12, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_extends, this.id_finally, this.id_native, this.id_volatile);
    }

    public gy_3 id_class(ResultConsumer<gy_3> resultConsumer, BinaryOperator<ResultConsumer<gy_3>> binaryOperator) {
        ResultConsumer resultConsumer2 = (ResultConsumer)binaryOperator.apply(this.id_native, resultConsumer);
        return this.id_class((ResultConsumer<gy_3>)resultConsumer2);
    }

    public gy_3 id_class(ResultConsumer<gy_3> resultConsumer) {
        return this.id_native.equals(resultConsumer) ? this : new gy_3(this.id_byte, this.id_protected, this.id_final, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_extends, this.id_finally, resultConsumer, this.id_volatile);
    }

    public gy_3 id_class(Rm_1 rm_1) {
        return rm_1 == this.id_volatile ? this : new gy_3(this.id_byte, this.id_protected, this.id_final, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_extends, this.id_finally, this.id_native, rm_1);
    }

    public gy_3 id_break(int n) {
        return n == this.id_case ? this : new gy_3(this.id_byte, this.id_protected, this.id_final, this.id_throws, n, this.id_catch, this.id_private, this.id_implements, this.id_extends, this.id_finally, this.id_native, this.id_volatile);
    }

    private void id_break(rgP_2 rgP_22) {
        rVi_1 rVi_12 = new rgn_3("chat.type.admin", this.id_extends(), rgP_22).id_class(rgF_2.GRAY, rgF_2.ITALIC);
        if (this.id_implements.D().id_break(rRu_1.id_final)) {
            for (rhN_2 rhN_22 : this.id_implements.x().id_super()) {
                if (rhN_22 == this.id_byte || !this.id_implements.x().id_case(rhN_22.sv())) continue;
                rhN_22.id_class((rgP_2)rVi_12, rqR_2.id_break);
            }
        }
        if (this.id_byte != this.id_implements && this.id_implements.D().id_break(rRu_1.id_extends)) {
            this.id_implements.id_class(rVi_12, rqR_2.id_break);
        }
    }

    public gy_3 id_break(rjU_2 rjU_22) throws CommandSyntaxException {
        rjU_2 rjU_23 = this.id_volatile.id_class(this);
        double d = rjU_22.id_break - rjU_23.id_break;
        double d2 = rjU_22.id_byte - rjU_23.id_byte;
        double d3 = rjU_22.id_protected - rjU_23.id_protected;
        double d4 = rfU_2.id_class(d * d + d3 * d3);
        float f = rfU_2.id_catch((float)(-(rfU_2.id_protected(d2, d4) * 57.2957763671875)));
        float f2 = rfU_2.id_catch((float)(rfU_2.id_protected(d3, d) * 57.2957763671875) - 90.0f);
        return this.id_class(new rjK_2(f, f2));
    }

    @Override
    public Stream<rqO_2> id_throws() {
        return this.id_implements.V().id_byte();
    }

    public gy_3 id_finally() {
        return this.id_finally ? this : new gy_3(this.id_byte, this.id_protected, this.id_final, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_extends, true, this.id_native, this.id_volatile);
    }

    public rgP_2 id_extends() {
        return this.id_private;
    }

    public rjK_2 id_continue() {
        return this.id_final;
    }

    @Override
    public rVm_1 id_implements() {
        return this.id_implements.rS();
    }

    public rhN_2 id_new() throws CommandSyntaxException {
        if (!(this.id_extends instanceof rhN_2)) {
            throw id_class.create();
        }
        return (rhN_2)this.id_extends;
    }

    public an_3 id_package() {
        return this.id_extends;
    }

    public rnW_2 id_super() {
        return this.id_implements;
    }

    @Override
    public Collection<rqO_2> id_protected() {
        return rVL.id_short.id_protected();
    }

    @Override
    public Set<rqM_2<rYB>> id_private() {
        return this.id_implements.id_long();
    }

    public rrEm_1 id_final() {
        return this.id_throws;
    }

    public rjU_2 id_volatile() {
        return this.id_protected;
    }

    public String id_native() {
        return this.id_catch;
    }
}

