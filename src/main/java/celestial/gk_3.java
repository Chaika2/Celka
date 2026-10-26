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

public class gk_3<T>
extends AbstractIterator<T> {
    private final PeekingIterator<T> id_class;
    private final PeekingIterator<T> id_break;
    private final Comparator<T> id_byte;

    public gk_3(Iterator<T> iterator, Iterator<T> iterator2, Comparator<T> comparator) {
        this.id_class = Iterators.peekingIterator(iterator);
        this.id_break = Iterators.peekingIterator(iterator2);
        this.id_byte = comparator;
    }

    protected T computeNext() {
        while (this.id_class.hasNext() && this.id_break.hasNext()) {
            int n = this.id_byte.compare(this.id_class.peek(), this.id_break.peek());
            if (n == 0) {
                this.id_break.next();
                return (T)this.id_class.next();
            }
            if (n < 0) {
                this.id_class.next();
                continue;
            }
            this.id_break.next();
        }
        return (T)this.endOfData();
    }
}

