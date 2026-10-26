/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Optional;

public class rrWQ<L, R> {
    private Optional<L> id_class;
    private Optional<R> id_break;

    private rrWQ(Optional<L> optional, Optional<R> optional2) {
        this.id_class = optional;
        this.id_break = optional2;
        if (!this.id_class.isPresent() && !this.id_break.isPresent()) {
            throw new IllegalArgumentException("Both left and right are not present");
        }
        if (this.id_class.isPresent() && this.id_break.isPresent()) {
            throw new IllegalArgumentException("Both left and right are present");
        }
    }

    public static <L, R> rrWQ<L, R> id_class(L l) {
        return new rrWQ(Optional.of(l), Optional.empty());
    }

    public Optional<L> id_class() {
        return this.id_class;
    }

    public static <L, R> rrWQ id_break(R r) {
        return new rrWQ(Optional.empty(), Optional.of(r));
    }

    public Optional<R> id_break() {
        return this.id_break;
    }
}

