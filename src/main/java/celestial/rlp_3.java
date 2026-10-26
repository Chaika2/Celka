/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rlj_3;
import celestial.rrEm_1;
import java.util.Collection;
import java.util.function.Consumer;

public class rlp_3 {
    private final String id_class;
    private final Collection<rlj_3> id_break;
    private final Consumer<rrEm_1> id_byte;

    public rlp_3(String string, Collection<rlj_3> collection, Consumer<rrEm_1> consumer) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
        }
        this.id_class = string;
        this.id_break = collection;
        this.id_byte = consumer;
    }

    public void id_class(rrEm_1 rrEm_12) {
        if (this.id_byte != null) {
            this.id_byte.accept(rrEm_12);
        }
    }

    public String id_class() {
        return this.id_class;
    }

    public Collection<rlj_3> id_break() {
        return this.id_break;
    }
}

