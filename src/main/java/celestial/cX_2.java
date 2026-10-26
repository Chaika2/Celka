/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.uI_2;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import javax.annotation.Nullable;

public class cX_2 {
    private final Deque<uI_2> id_class = new ArrayDeque<uI_2>();

    public boolean id_class(int n, int n2) {
        return this.id_class.isEmpty() || this.id_class.peek().id_class(n, n2);
    }

    @Nullable
    public uI_2 id_class() {
        if (this.id_class.isEmpty()) {
            throw new IllegalStateException("Scissor stack underflow");
        }
        this.id_class.removeLast();
        return this.id_class.peekLast();
    }

    public uI_2 id_class(uI_2 uI_22) {
        uI_2 uI_23 = this.id_class.peekLast();
        if (uI_23 != null) {
            uI_2 uI_24 = Objects.requireNonNullElse(uI_22.id_break(uI_23), uI_2.id_class());
            this.id_class.addLast(uI_24);
            return uI_24;
        }
        this.id_class.addLast(uI_22);
        return uI_22;
    }
}

