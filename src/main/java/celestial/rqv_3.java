/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrays
 */
package celestial;

import celestial.rqF_2;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class rqv_3<T>
extends AbstractSet<T> {
    private final Comparator<T> id_class;
    public T[] id_break;
    public int id_byte;

    private void id_byte(int n) {
        if (n > this.id_break.length) {
            if (this.id_break != ObjectArrays.DEFAULT_EMPTY_ARRAY) {
                n = (int)Math.max(Math.min((long)this.id_break.length + (long)(this.id_break.length >> 1), 0x7FFFFFF7L), (long)n);
            } else if (n < 10) {
                n = 10;
            }
            Object[] objectArray = new Object[n];
            System.arraycopy(this.id_break, 0, objectArray, 0, this.id_byte);
            this.id_break = rqv_3.id_class(objectArray);
        }
    }

    public rqv_3(int n, Comparator<T> comparator) {
        this.id_class = comparator;
        if (n < 0) {
            throw new IllegalArgumentException("Initial capacity (" + n + ") is negative");
        }
        this.id_break = rqv_3.id_class(new Object[n]);
    }

    @Override
    public boolean remove(Object object) {
        int n = this.id_break(object);
        if (n >= 0) {
            this.id_protected(n);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.id_byte;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof rqv_3) {
            rqv_3 rqv_32 = (rqv_3)object;
            if (this.id_class.equals(rqv_32.id_class)) {
                return this.id_byte == rqv_32.id_byte && Arrays.equals(this.id_break, rqv_32.id_break);
            }
        }
        return super.equals(object);
    }

    @Override
    public void clear() {
        Arrays.fill(this.id_break, 0, this.id_byte, null);
        this.id_byte = 0;
    }

    @Override
    public boolean add(T t) {
        int n = this.id_break(t);
        if (n >= 0) {
            return false;
        }
        int n2 = rqv_3.id_break(n);
        this.id_class(t, n2);
        return true;
    }

    @Override
    public Object[] toArray() {
        return (Object[])this.id_break.clone();
    }

    @Override
    public <U> U[] toArray(U[] UArray) {
        if (UArray.length < this.id_byte) {
            return Arrays.copyOf(this.id_break, this.id_byte, UArray.getClass());
        }
        System.arraycopy(this.id_break, 0, UArray, 0, this.id_byte);
        if (UArray.length > this.id_byte) {
            UArray[this.id_byte] = null;
        }
        return UArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new rqF_2(this);
    }

    @Override
    public boolean contains(Object object) {
        int n = this.id_break(object);
        return n >= 0;
    }

    public static <T extends Comparable<T>> rqv_3<T> id_class(int n) {
        return new rqv_3(n, Comparator.naturalOrder());
    }

    public T id_class(T t) {
        int n = this.id_break(t);
        if (n >= 0) {
            return this.id_throws(n);
        }
        this.id_class(t, rqv_3.id_break(n));
        return t;
    }

    private void id_class(T t, int n) {
        this.id_byte(this.id_byte + 1);
        if (n != this.id_byte) {
            System.arraycopy(this.id_break, n, this.id_break, n + 1, this.id_byte - n);
        }
        this.id_break[n] = t;
        ++this.id_byte;
    }

    private static <T> T[] id_class(Object[] objectArray) {
        return objectArray;
    }

    public T id_class() {
        return this.id_throws(0);
    }

    private static int id_break(int n) {
        return -n - 1;
    }

    private int id_break(T t) {
        return Arrays.binarySearch(this.id_break, 0, this.id_byte, t, this.id_class);
    }

    private T id_throws(int n) {
        return this.id_break[n];
    }

    public void id_protected(int n) {
        --this.id_byte;
        if (n != this.id_byte) {
            System.arraycopy(this.id_break, n + 1, this.id_break, n, this.id_byte - n);
        }
        this.id_break[this.id_byte] = null;
    }
}

