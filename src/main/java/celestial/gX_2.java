/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.PeekingIterator
 */
package celestial;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class gX_2<T>
extends AbstractIterator<T> {
    private final PeekingIterator<T> id_class;
    private final PeekingIterator<T> id_break;
    private final Comparator<T> id_byte;

    public gX_2(Iterator<T> iterator, Iterator<T> iterator2, Comparator<T> comparator) {
        this.id_class = Iterators.peekingIterator(iterator);
        this.id_break = Iterators.peekingIterator(iterator2);
        this.id_byte = comparator;
    }

    protected T computeNext() {
        boolean bl;
        boolean bl2 = !this.id_class.hasNext();
        boolean bl3 = bl = !this.id_break.hasNext();
        if (bl2 && bl) {
            return (T)this.endOfData();
        }
        if (bl2) {
            return (T)this.id_break.next();
        }
        if (bl) {
            return (T)this.id_class.next();
        }
        int n = this.id_byte.compare(this.id_class.peek(), this.id_break.peek());
        if (n == 0) {
            this.id_break.next();
        }
        return (T)(n <= 0 ? this.id_class.next() : this.id_break.next());
    }
}

