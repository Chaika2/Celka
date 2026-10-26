/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdG;
import java.util.ArrayDeque;
import java.util.Deque;

public class rrdb_1 {
    private Deque<rrdG> id_class = new ArrayDeque<rrdG>();

    public void id_class(rrdG rrdG2) {
        this.id_class.addLast(rrdG2);
        if (this.id_class.size() > 100) {
            throw new RuntimeException("Program stack overflow: " + this.id_class.size());
        }
    }

    public rrdG id_class() {
        if (this.id_class.isEmpty()) {
            throw new RuntimeException("Program stack empty");
        }
        return this.id_class.pollLast();
    }
}

