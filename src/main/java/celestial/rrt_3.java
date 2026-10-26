/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Random;

public class rrt_3 {
    private final Random id_class;
    private long id_break;
    private long id_byte;
    private int id_protected;

    public boolean id_byte(long l) {
        return l >= this.id_byte;
    }

    public rrt_3(Random random, long l) {
        this.id_class = random;
        this.id_class(l);
    }

    public String toString() {
        return "RetryMarker{, previousAttemptAt=" + this.id_break + ", nextScheduledAttemptAt=" + this.id_byte + ", currentDelay=" + this.id_protected + "}";
    }

    public void id_class(long l) {
        this.id_break = l;
        int n = this.id_protected + this.id_class.nextInt(40) + 40;
        this.id_protected = Math.min(n, 400);
        this.id_byte = l + (long)this.id_protected;
    }

    public boolean id_break(long l) {
        return l - this.id_break < 400L;
    }
}

