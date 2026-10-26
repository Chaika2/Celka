/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rlO_2;
import celestial.rlb_3;
import celestial.rqO_2;
import java.util.List;
import java.util.function.Function;

public class rlL_2<T>
implements rlO_2<T> {
    private rlb_3<T> id_break;
    protected final rqO_2 id_class;

    private rlb_3<T> id_byte() {
        if (this.id_break == null) {
            throw new IllegalStateException("Tag " + this.id_class + " used before it was bound");
        }
        return this.id_break;
    }

    public rlL_2(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    @Override
    public List<T> id_class() {
        return this.id_byte().id_class();
    }

    @Override
    public boolean id_class(T t) {
        return this.id_byte().id_class(t);
    }

    public void id_class(Function<rqO_2, rlb_3<T>> function) {
        this.id_break = function.apply(this.id_class);
    }

    @Override
    public rqO_2 id_break() {
        return this.id_class;
    }
}

