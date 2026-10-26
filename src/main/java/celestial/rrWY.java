/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWR;
import celestial.rrWo_1;
import java.util.Iterator;

public class rrWY
implements Iterator<rrWo_1<T>> {
    public rrWo_1<T> id_class;
    public final /* synthetic */ rrWR id_break;

    public rrWY(rrWR rrWR2) {
        this.id_break = rrWR2;
        this.id_class = this.id_break.id_break();
    }

    @Override
    public boolean hasNext() {
        return this.id_class != null;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.id_class();
    }

    public rrWo_1<T> id_class() {
        rrWo_1 rrWo_12 = this.id_class;
        if (this.id_class != null) {
            this.id_class = this.id_class.id_byte;
        }
        return rrWo_12;
    }
}

