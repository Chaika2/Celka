/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rqO_2;
import celestial.vJ_2;
import celestial.vd_3;
import celestial.vx_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class vh_3 {
    public final rAt_1 id_class;
    public final List<rAp_1> id_protected;
    public final List<rAp_1> id_throws;
    public final Function<rAp_1, rqO_2> id_case;
    public Runnable id_break;
    public final Consumer<rAt_1> id_byte;

    public void id_byte() {
        this.id_class.id_class((Collection)Lists.reverse(this.id_protected).stream().map(rAp_1::id_throws).collect(ImmutableList.toImmutableList()));
        this.id_byte.accept(this.id_class);
    }

    public vh_3(Runnable runnable, Function<rAp_1, rqO_2> function, rAt_1 rAt_12, Consumer<rAt_1> consumer) {
        this.id_break = runnable;
        this.id_case = function;
        this.id_class = rAt_12;
        this.id_protected = Lists.newArrayList(rAt_12.id_throws());
        Collections.reverse(this.id_protected);
        this.id_throws = Lists.newArrayList(rAt_12.id_byte());
        this.id_throws.removeAll(this.id_protected);
        this.id_byte = consumer;
    }

    public Stream<vd_3> id_class() {
        return this.id_throws.stream().map(rAp_12 -> new vJ_2(this, (rAp_1)rAp_12));
    }

    public Stream<vd_3> id_break() {
        return this.id_protected.stream().map(rAp_12 -> new vx_3(this, (rAp_1)rAp_12));
    }

    public void id_protected() {
        this.id_class.id_class();
        this.id_protected.retainAll(this.id_class.id_byte());
        this.id_throws.clear();
        this.id_throws.addAll(this.id_class.id_byte());
        this.id_throws.removeAll(this.id_protected);
    }
}

