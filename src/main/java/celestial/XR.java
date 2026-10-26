/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 */
package celestial;

import celestial.XF;
import celestial.XY;
import celestial.Xj_1;
import celestial.rCi_1;
import celestial.rRl_1;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Map;

public class XR {
    private XF id_class = XF.id_throws;
    private rRl_1 id_break = rRl_1.NOT_SET;
    private final Map<rCi_1<?>, XF> id_byte = Maps.newHashMap();
    private final Object2BooleanMap<rqO_2> id_protected = new Object2BooleanOpenHashMap();
    private final Map<rqO_2, XY> id_throws = Maps.newHashMap();

    public Xj_1 id_class() {
        return new Xj_1(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
    }
}

