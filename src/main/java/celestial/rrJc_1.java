/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJF;
import celestial.rrJL;
import celestial.rrJQ;
import java.util.Map;

public class rrJc_1
implements rrJQ {
    public final /* synthetic */ Map id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrJc_1(Map map) {
        this.id_class = map;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void id_class(rrJF rrJF2, rrJL rrJL2) {
        Map map = this.id_class;
        synchronized (map) {
            this.id_class.put("Response", rrJL2);
            this.id_class.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void id_class(rrJF rrJF2, Exception exception) {
        Map map = this.id_class;
        synchronized (map) {
            this.id_class.put("Exception", exception);
            this.id_class.notifyAll();
        }
    }
}

