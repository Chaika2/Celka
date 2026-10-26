/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rrbP_2;
import java.util.Iterator;

public class rrbr_3
implements Iterable {
    public final /* synthetic */ rfH_2 id_class;
    public final /* synthetic */ rfH_2 id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrbr_3(rfH_2 rfH_22, rfH_2 rfH_23) {
        this.id_class = rfH_22;
        this.id_break = rfH_23;
    }

    public Iterator iterator() {
        return new rrbP_2(this);
    }
}

