/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 */
package celestial;

import celestial.rlO_2;
import celestial.rlW_2;
import celestial.rlb_3;
import celestial.rlm_3;
import celestial.rqO_2;
import com.google.common.collect.BiMap;
import java.util.Map;

public class rlz_3
implements rlW_2<T> {
    private final rlb_3<T> id_break = rlm_3.id_break();
    public final /* synthetic */ BiMap id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rlz_3(BiMap biMap) {
        this.id_class = biMap;
    }

    @Override
    public Map<rqO_2, rlb_3<T>> id_class() {
        return this.id_class;
    }

    @Override
    public rqO_2 id_class(rlb_3<T> rlb_32) {
        return rlb_32 instanceof rlO_2 ? ((rlO_2)rlb_32).id_break() : (rqO_2)this.id_class.inverse().get(rlb_32);
    }

    @Override
    public rlb_3<T> id_break(rqO_2 rqO_22) {
        return (rlb_3)this.id_class.getOrDefault((Object)rqO_22, this.id_break);
    }
}

