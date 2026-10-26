/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rrGi_1;
import celestial.rrdB;
import celestial.yO_2;
import celestial.yQ_2;
import java.util.Iterator;

public class rrds_1
implements Iterator<yQ_2> {
    private yO_2 id_class;
    private rrdB id_break;
    private rrGi_1 id_byte = new rrGi_1(0, 0, 0);

    public rrds_1(yO_2 yO_22, rfH_2 rfH_22, rfH_2 rfH_23, int n, int n2) {
        this.id_class = yO_22;
        this.id_break = new rrdB(rfH_22, rfH_23, n, n2);
    }

    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean hasNext() {
        return this.id_break.hasNext();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.id_class();
    }

    public yQ_2 id_class() {
        rfH_2 rfH_22 = this.id_break.id_class();
        this.id_byte.id_class(rfH_22.b_() << 4, rfH_22.c_() << 4, rfH_22.d_() << 4);
        return this.id_class.id_class(this.id_byte);
    }
}

