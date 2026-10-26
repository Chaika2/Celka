/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rrPp_1;
import celestial.xd_3;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class rrPT {
    private final List<rrPp_1> id_class;
    private final Map<xd_3, List<rrPp_1>> id_break = Maps.newHashMap();

    public rrPT(List<rrPp_1> list) {
        this.id_class = list;
    }

    public List<rrPp_1> id_class(xd_3 xd_33) {
        return this.id_break.computeIfAbsent(xd_33, xd_32 -> this.id_class.stream().filter(rrPp_12 -> rrPp_12.id_break.id_class((xd_3)xd_32)).collect(Collectors.toList()));
    }

    public List<rrPp_1> id_class() {
        return this.id_class;
    }
}

