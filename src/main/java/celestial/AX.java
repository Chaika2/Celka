/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.Aq_1;
import celestial.Aw_1;
import celestial.QY;
import celestial.cb_3;
import celestial.gR_2;
import celestial.gY_2;
import celestial.rVm_1;
import celestial.rYB;
import celestial.rZL;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class AX
implements gR_2 {
    private final Aq_1 id_class;
    private final QY id_break;
    private int id_byte = -1;
    private CompletableFuture<Suggestions> id_protected;

    @Override
    public Collection<String> id_byte() {
        return this.id_class.id_finally().id_package().id_protected();
    }

    public AX(Aq_1 aq_1, QY qY) {
        this.id_class = aq_1;
        this.id_break = qY;
    }

    @Override
    public boolean id_class(int n) {
        cb_3 cb_32 = (cb_3)this.id_break.id_class[57];
        return cb_32 != null ? cb_32.id_catch(n) : n == 0;
    }

    @Override
    public CompletableFuture<Suggestions> id_class(CommandContext<gR_2> commandContext, SuggestionsBuilder suggestionsBuilder) {
        if (this.id_protected != null) {
            this.id_protected.cancel(false);
        }
        this.id_protected = new CompletableFuture();
        int n = ++this.id_byte;
        this.id_class.id_class(new rZL(n, commandContext.getInput()));
        return this.id_protected;
    }

    public void id_class(int n, Suggestions suggestions) {
        if (n == this.id_byte) {
            this.id_protected.complete(suggestions);
            this.id_protected = null;
            this.id_byte = -1;
        }
    }

    private static String id_class(double d) {
        return String.format(Locale.ROOT, "%.2f", d);
    }

    @Override
    public Collection<String> id_class() {
        ArrayList arrayList = Lists.newArrayList();
        for (Aw_1 aw_1 : this.id_class.id_throws()) {
            arrayList.add(aw_1.id_class().getName());
        }
        return arrayList;
    }

    private static String id_break(int n) {
        return Integer.toString(n);
    }

    @Override
    public Collection<String> id_break() {
        return (rjG_2)this.id_break.id_class[64] != null && ((rjG_2)this.id_break.id_class[64]).id_byte() == rjM_2.ENTITY ? Collections.singleton(((rfo_3)((rjG_2)this.id_break.id_class[64])).id_class().rz()) : Collections.emptyList();
    }

    @Override
    public Stream<rqO_2> id_throws() {
        return this.id_class.id_protected().id_byte();
    }

    @Override
    public Collection<gY_2> id_catch() {
        rjG_2 rjG_22 = (rjG_2)this.id_break.id_class[64];
        if (rjG_22 != null && rjG_22.id_byte() == rjM_2.BLOCK) {
            rjU_2 rjU_22 = rjG_22.id_case();
            return Collections.singleton(new gY_2(AX.id_class(rjU_22.id_break), AX.id_class(rjU_22.id_byte), AX.id_class(rjU_22.id_protected)));
        }
        return gR_2.super.id_catch();
    }

    @Override
    public Collection<gY_2> id_case() {
        rjG_2 rjG_22 = (rjG_2)this.id_break.id_class[64];
        if (rjG_22 != null && rjG_22.id_byte() == rjM_2.BLOCK) {
            rfH_2 rfH_22 = ((rff_3)rjG_22).id_class();
            return Collections.singleton(new gY_2(AX.id_break(rfH_22.b_()), AX.id_break(rfH_22.c_()), AX.id_break(rfH_22.d_())));
        }
        return gR_2.super.id_case();
    }

    @Override
    public rVm_1 id_implements() {
        return this.id_class.id_package();
    }

    @Override
    public Collection<rqO_2> id_protected() {
        return this.id_break.c().id_class();
    }

    @Override
    public Set<rqM_2<rYB>> id_private() {
        return this.id_class.id_final();
    }
}

