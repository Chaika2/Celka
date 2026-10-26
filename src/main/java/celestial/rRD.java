/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYr_1;
import celestial.rfH_2;
import java.util.Comparator;

public class rRD<T> {
    private static long id_protected;
    private final T id_throws;
    public final rfH_2 id_class;
    public final long id_break;
    public final rYr_1 id_byte;
    private final long id_case = id_protected++;

    public rRD(rfH_2 rfH_22, T t) {
        this(rfH_22, t, 0L, rYr_1.NORMAL);
    }

    public rRD(rfH_2 rfH_22, T t, long l, rYr_1 rYr_12) {
        this.id_class = rfH_22.id_int();
        this.id_throws = t;
        this.id_break = l;
        this.id_byte = rYr_12;
    }

    public boolean equals(Object object) {
        if (!(object instanceof rRD)) {
            return false;
        }
        rRD rRD2 = (rRD)object;
        return this.id_class.equals(rRD2.id_class) && this.id_throws == rRD2.id_throws;
    }

    public String toString() {
        return this.id_throws + ": " + this.id_class + ", " + this.id_break + ", " + this.id_byte + ", " + this.id_case;
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    public static <T> Comparator<rRD<T>> id_class() {
        return Comparator.comparingLong(rRD2 -> rRD2.id_break).thenComparing(rRD2 -> rRD2.id_byte).thenComparingLong(rRD2 -> rRD2.id_case);
    }

    public T id_break() {
        return this.id_throws;
    }
}

