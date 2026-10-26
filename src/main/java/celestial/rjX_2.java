/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfR_2;
import celestial.rjh_3;
import java.util.Spliterators;
import java.util.function.Consumer;

public class rjX_2
extends Spliterators.AbstractSpliterator<rjh_3> {
    public final rfR_2 id_class;
    public final /* synthetic */ int id_break;
    public final /* synthetic */ int id_byte;
    public final /* synthetic */ int id_protected;
    public final /* synthetic */ int id_throws;
    public final /* synthetic */ int id_case;
    public final /* synthetic */ int id_catch;

    public rjX_2(long l, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
        this.id_throws = n5;
        this.id_case = n6;
        this.id_catch = n7;
        super(l, n);
        this.id_class = new rfR_2(this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
    }

    @Override
    public boolean tryAdvance(Consumer<? super rjh_3> consumer) {
        if (this.id_class.id_class()) {
            consumer.accept(new rjh_3(this.id_class.id_break(), this.id_class.id_byte(), this.id_class.id_protected()));
            return true;
        }
        return false;
    }
}

