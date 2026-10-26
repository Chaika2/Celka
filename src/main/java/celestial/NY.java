/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Nq_1;
import java.util.Collections;
import java.util.List;

public class NY {
    private final List<Nq_1> id_class;
    private final boolean id_break;
    private final String id_byte;

    public String id_byte() {
        return this.id_byte;
    }

    public NY(List<Nq_1> list, boolean bl, String string) {
        this.id_class = list;
        this.id_break = bl;
        this.id_byte = string;
    }

    public NY(Nq_1 nq_1, boolean bl, String string) {
        this.id_class = Collections.singletonList(nq_1);
        this.id_break = bl;
        this.id_byte = string;
    }

    public List<Nq_1> id_class() {
        return this.id_class;
    }

    public boolean id_break() {
        return this.id_break;
    }
}

