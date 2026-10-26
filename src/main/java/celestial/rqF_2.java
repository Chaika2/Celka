/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqv_3;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class rqF_2
implements Iterator<T> {
    private int id_break;
    private int id_byte = -1;
    public final /* synthetic */ rqv_3 id_class;

    public rqF_2(rqv_3 rqv_32) {
        this.id_class = rqv_32;
    }

    @Override
    public void remove() {
        if (this.id_byte == -1) {
            throw new IllegalStateException();
        }
        this.id_class.id_protected(this.id_byte);
        --this.id_break;
        this.id_byte = -1;
    }

    @Override
    public boolean hasNext() {
        return this.id_break < this.id_class.id_byte;
    }

    @Override
    public T next() {
        if (this.id_break >= this.id_class.id_byte) {
            throw new NoSuchElementException();
        }
        this.id_byte = this.id_break++;
        return this.id_class.id_break[this.id_byte];
    }
}

