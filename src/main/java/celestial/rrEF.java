/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrEl_1;
import java.util.Objects;

public final class rrEF<T>
implements Comparable<rrEF<?>> {
    private final rrEl_1<T> id_class;
    private final int id_break;
    private final T id_byte;
    private long id_protected;

    protected rrEF(rrEl_1<T> rrEl_12, int n, T t) {
        this.id_class = rrEl_12;
        this.id_break = n;
        this.id_byte = t;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rrEF)) {
            return false;
        }
        rrEF rrEF2 = (rrEF)object;
        return this.id_break == rrEF2.id_break && Objects.equals(this.id_class, rrEF2.id_class) && Objects.equals(this.id_byte, rrEF2.id_byte);
    }

    public String toString() {
        return "Ticket[" + this.id_class + " " + this.id_break + " (" + this.id_byte + ")] at " + this.id_protected;
    }

    public int hashCode() {
        return Objects.hash(this.id_class, this.id_break, this.id_byte);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_class((rrEF)object);
    }

    public rrEl_1<T> id_class() {
        return this.id_class;
    }

    protected void id_class(long l) {
        this.id_protected = l;
    }

    public int id_class(rrEF<?> rrEF2) {
        int n = Integer.compare(this.id_break, rrEF2.id_break);
        if (n != 0) {
            return n;
        }
        int n2 = Integer.compare(System.identityHashCode(this.id_class), System.identityHashCode(rrEF2.id_class));
        return n2 != 0 ? n2 : this.id_class.id_class().compare(this.id_byte, rrEF2.id_byte);
    }

    protected boolean id_break(long l) {
        long l2 = this.id_class.id_break();
        return l2 != 0L && l - this.id_protected > l2;
    }

    public int id_break() {
        return this.id_break;
    }
}

