/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rfV_2;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rfj_3 {
    public static final long id_class = rfj_3.id_class(1875016, 1875016);
    public final int id_break;
    public final int id_byte;
    private int id_protected = 0;

    public int id_byte() {
        return this.id_byte << 4;
    }

    public rfj_3(int n, int n2) {
        this.id_break = n;
        this.id_byte = n2;
    }

    public rfj_3(long l) {
        this.id_break = (int)l;
        this.id_byte = (int)(l >> 32);
    }

    public rfj_3(rfH_2 rfH_22) {
        this.id_break = rfH_22.b_() >> 4;
        this.id_byte = rfH_22.d_() >> 4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rfj_3)) {
            return false;
        }
        rfj_3 rfj_32 = (rfj_3)object;
        return this.id_break == rfj_32.id_break && this.id_byte == rfj_32.id_byte;
    }

    public String toString() {
        return "[" + this.id_break + ", " + this.id_byte + "]";
    }

    public int hashCode() {
        if (this.id_protected != 0) {
            return this.id_protected;
        }
        int n = 1664525 * this.id_break + 1013904223;
        int n2 = 1664525 * (this.id_byte ^ 0xDEADBEEF) + 1013904223;
        this.id_protected = n ^ n2;
        return this.id_protected;
    }

    public static Stream<rfj_3> id_class(rfj_3 rfj_32, rfj_3 rfj_33) {
        int n = Math.abs(rfj_32.id_break - rfj_33.id_break) + 1;
        int n2 = Math.abs(rfj_32.id_byte - rfj_33.id_byte) + 1;
        int n3 = rfj_32.id_break < rfj_33.id_break ? 1 : -1;
        int n4 = rfj_32.id_byte < rfj_33.id_byte ? 1 : -1;
        return StreamSupport.stream(new rfV_2(n * n2, 64, rfj_32, rfj_33, n4, n3), false);
    }

    public static Stream<rfj_3> id_class(rfj_3 rfj_32, int n) {
        return rfj_3.id_class(new rfj_3(rfj_32.id_break - n, rfj_32.id_byte - n), new rfj_3(rfj_32.id_break + n, rfj_32.id_byte + n));
    }

    public int id_class(rfj_3 rfj_32) {
        return Math.max(Math.abs(this.id_break - rfj_32.id_break), Math.abs(this.id_byte - rfj_32.id_byte));
    }

    public static int id_class(long l) {
        return (int)(l & 0xFFFFFFFFL);
    }

    public long id_class() {
        return rfj_3.id_class(this.id_break, this.id_byte);
    }

    public static long id_class(int n, int n2) {
        return (long)n & 0xFFFFFFFFL | ((long)n2 & 0xFFFFFFFFL) << 32;
    }

    public static int id_break(long l) {
        return (int)(l >>> 32 & 0xFFFFFFFFL);
    }

    public int id_break() {
        return this.id_break << 4;
    }

    public int id_throws() {
        return (this.id_byte << 4) + 15;
    }

    public rfH_2 id_finally() {
        return new rfH_2(this.id_break(), 0, this.id_byte());
    }

    public int id_catch() {
        return this.id_byte >> 5;
    }

    public int id_case() {
        return this.id_break >> 5;
    }

    public int id_implements() {
        return this.id_byte & 0x1F;
    }

    public int id_protected() {
        return (this.id_break << 4) + 15;
    }

    public int id_private() {
        return this.id_break & 0x1F;
    }
}

