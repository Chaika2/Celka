/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rLR;
import celestial.rNL;
import celestial.rcP_2;
import celestial.rzV_2;
import celestial.rzh_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class rcB_2
extends rzh_3<rcB_2> {
    private final Map<rLR, rzV_2> id_class = Maps.newHashMap();

    public rcB_2 id_class(rLR rLR2, rzV_2 rzV_22) {
        this.id_class.put(rLR2, rzV_22);
        return this;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rcB_2 id_throws() {
        return this;
    }

    @Override
    public rNL id_case() {
        return new rcP_2(this.id_byte(), this.id_class);
    }
}

