/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.function.Supplier;

public class rpo_3<T> {
    private Supplier<T> id_class;
    private T id_break;

    public rpo_3(Supplier<T> supplier) {
        this.id_class = supplier;
    }

    public T id_class() {
        Supplier<T> supplier = this.id_class;
        if (supplier != null) {
            this.id_break = supplier.get();
            this.id_class = null;
        }
        return this.id_break;
    }
}

