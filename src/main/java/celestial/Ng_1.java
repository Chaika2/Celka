/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.NI;
import celestial.NR;
import celestial.NT;
import celestial.NY;
import celestial.Nf_1;
import celestial.Nq_1;
import celestial.Nt_1;
import celestial.rAL;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import java.util.Map;

public class Ng_1 {
    public final Map<rqO_2, NI> id_class = Maps.newHashMap();

    protected Ng_1() {
    }

    public void id_class(rqO_2 rqO_22, NY nY, rAL rAL2) {
        boolean bl;
        NI nI = this.id_class.get(rqO_22);
        boolean bl2 = bl = nI == null;
        if (bl || nY.id_break()) {
            if (!bl) {
                Nf_1.id_break.debug("Replaced sound event location {}", (Object)rqO_22);
            }
            nI = new NI(rqO_22, nY.id_byte());
            this.id_class.put(rqO_22, nI);
        }
        block4: for (Nq_1 nq_1 : nY.id_class()) {
            rqO_2 rqO_23 = nq_1.id_byte();
            nI.id_class(switch (nq_1.id_private()) {
                case NT.FILE -> {
                    if (!Nf_1.id_class(nq_1, rqO_22, rAL2)) continue block4;
                    yield nq_1;
                }
                case NT.SOUND_EVENT -> new NR(this, rqO_23, nq_1);
                default -> throw new IllegalStateException("Unknown SoundEventRegistration type: " + nq_1.id_private());
            });
        }
    }

    public void id_class(Map<rqO_2, NI> map, Nt_1 nt_1) {
        map.clear();
        for (Map.Entry<rqO_2, NI> entry : this.id_class.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
            entry.getValue().id_class(nt_1);
        }
    }
}

