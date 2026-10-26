/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.rZW;
import celestial.rZk_1;
import celestial.rcd_3;
import celestial.rfH_2;
import java.util.function.Consumer;

public class gG_2 {
    private final Aq_1 id_class;
    private int id_break = -1;
    private Consumer<rcd_3> id_byte;

    public gG_2(Aq_1 aq_1) {
        this.id_class = aq_1;
    }

    public void id_class(rfH_2 rfH_22, Consumer<rcd_3> consumer) {
        int n = this.id_class(consumer);
        this.id_class.id_class(new rZW(n, rfH_22));
    }

    public void id_class(int n, Consumer<rcd_3> consumer) {
        int n2 = this.id_class(consumer);
        this.id_class.id_class(new rZk_1(n2, n));
    }

    private int id_class(Consumer<rcd_3> consumer) {
        this.id_byte = consumer;
        return ++this.id_break;
    }

    public boolean id_class(int n, rcd_3 rcd_32) {
        if (this.id_break == n && this.id_byte != null) {
            this.id_byte.accept(rcd_32);
            this.id_byte = null;
            return true;
        }
        return false;
    }
}

