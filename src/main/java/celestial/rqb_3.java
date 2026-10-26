/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Random;

public class rqb_3 {
    private final int id_class;
    private final int id_break;

    public rqb_3(int n, int n2) {
        if (n2 < n) {
            throw new IllegalArgumentException("max must be >= minInclusive! Given minInclusive: " + n + ", Given max: " + n2);
        }
        this.id_class = n;
        this.id_break = n2;
    }

    public String toString() {
        return "IntRange[" + this.id_class + "-" + this.id_break + "]";
    }

    public int id_class() {
        return this.id_class;
    }

    public static rqb_3 id_class(int n, int n2) {
        return new rqb_3(n, n2);
    }

    public int id_class(Random random) {
        return this.id_class == this.id_break ? this.id_class : random.nextInt(this.id_break - this.id_class + 1) + this.id_class;
    }

    public int id_break() {
        return this.id_break;
    }
}

