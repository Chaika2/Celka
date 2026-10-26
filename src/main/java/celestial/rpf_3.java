/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 */
package celestial;

import celestial.rfU_2;
import celestial.rpn_3;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;

public class rpf_3<K>
implements rpn_3<K> {
    private static final Object id_class = null;
    private K[] id_break;
    private int[] id_byte;
    private K[] id_protected;
    private int id_throws;
    private int id_case;

    private int id_byte() {
        while (this.id_throws < this.id_protected.length && this.id_protected[this.id_throws] != null) {
            ++this.id_throws;
        }
        return this.id_throws;
    }

    private int id_byte(K k) {
        return (rfU_2.id_catch(System.identityHashCode(k)) & Integer.MAX_VALUE) % this.id_break.length;
    }

    private void id_byte(int n) {
        K[] KArray = this.id_break;
        int[] nArray = this.id_byte;
        this.id_break = new Object[n];
        this.id_byte = new int[n];
        this.id_protected = new Object[n];
        this.id_throws = 0;
        this.id_case = 0;
        for (int i = 0; i < KArray.length; ++i) {
            if (KArray[i] == null) continue;
            this.id_class(KArray[i], nArray[i]);
        }
    }

    public rpf_3(int n) {
        n = (int)((float)n / 0.8f);
        this.id_break = new Object[n];
        this.id_byte = new int[n];
        this.id_protected = new Object[n];
    }

    @Override
    public Iterator<K> iterator() {
        return Iterators.filter((Iterator)Iterators.forArray((Object[])this.id_protected), (Predicate)Predicates.notNull());
    }

    @Override
    public int id_class(K k) {
        return this.id_break(this.id_break(k, this.id_byte(k)));
    }

    public void id_class() {
        Arrays.fill(this.id_break, null);
        Arrays.fill(this.id_protected, null);
        this.id_throws = 0;
        this.id_case = 0;
    }

    public void id_class(K k, int n) {
        int n2;
        int n3 = Math.max(n, this.id_case + 1);
        if ((float)n3 >= (float)this.id_break.length * 0.8f) {
            for (n2 = this.id_break.length << 1; n2 < n; n2 <<= 1) {
            }
            this.id_byte(n2);
        }
        n2 = this.id_protected(this.id_byte(k));
        this.id_break[n2] = k;
        this.id_byte[n2] = n;
        this.id_protected[n] = k;
        ++this.id_case;
        if (n == this.id_throws) {
            ++this.id_throws;
        }
    }

    @Override
    public K id_class(int n) {
        return n >= 0 && n < this.id_protected.length ? (K)this.id_protected[n] : null;
    }

    public int id_break() {
        return this.id_case;
    }

    private int id_break(int n) {
        return n == -1 ? -1 : this.id_byte[n];
    }

    private int id_break(K k, int n) {
        int n2;
        for (n2 = n; n2 < this.id_break.length; ++n2) {
            if (this.id_break[n2] == k) {
                return n2;
            }
            if (this.id_break[n2] != id_class) continue;
            return -1;
        }
        for (n2 = 0; n2 < n; ++n2) {
            if (this.id_break[n2] == k) {
                return n2;
            }
            if (this.id_break[n2] != id_class) continue;
            return -1;
        }
        return -1;
    }

    public int id_break(K k) {
        int n = this.id_byte();
        this.id_class(k, n);
        return n;
    }

    private int id_protected(int n) {
        int n2;
        for (n2 = n; n2 < this.id_break.length; ++n2) {
            if (this.id_break[n2] != id_class) continue;
            return n2;
        }
        for (n2 = 0; n2 < n; ++n2) {
            if (this.id_break[n2] != id_class) continue;
            return n2;
        }
        throw new RuntimeException("Overflowed :(");
    }
}

