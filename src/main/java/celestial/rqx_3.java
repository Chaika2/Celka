/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqJ_2;
import java.util.Spliterators;
import java.util.function.Consumer;

public class rqx_3
extends Spliterators.AbstractSpliterator<T> {
    private int id_break;
    public final /* synthetic */ rqJ_2 id_class;

    public rqx_3(rqJ_2 rqJ_22, long l, int n) {
        this.id_class = rqJ_22;
        super(l, n);
    }

    @Override
    public boolean tryAdvance(Consumer<? super T> consumer) {
        while (this.id_break >= this.id_class.id_class.size()) {
            if (this.id_class.id_break.tryAdvance(this.id_class.id_class::add)) continue;
            return false;
        }
        consumer.accept(this.id_class.id_class.get(this.id_break++));
        return true;
    }
}

