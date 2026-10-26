/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.C_if;
import celestial.iq_3;
import celestial.iw_3;
import celestial.rVL;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class it_3 {
    public static final it_3 id_class = it_3.id_class("empty").id_class(0, iq_3.id_break).id_class();
    public static final it_3 id_break = it_3.id_class("simple").id_class(5000, iq_3.id_byte).id_class(11000, iq_3.id_throws).id_class();
    public static final it_3 id_byte = it_3.id_class("villager_baby").id_class(10, iq_3.id_break).id_class(3000, iq_3.id_protected).id_class(6000, iq_3.id_break).id_class(10000, iq_3.id_protected).id_class(12000, iq_3.id_throws).id_class();
    public static final it_3 id_protected = it_3.id_class("villager_default").id_class(10, iq_3.id_break).id_class(2000, iq_3.id_byte).id_class(9000, iq_3.id_case).id_class(11000, iq_3.id_break).id_class(12000, iq_3.id_throws).id_class();
    private final Map<iq_3, C_if> id_throws = Maps.newHashMap();

    protected List<C_if> id_byte(iq_3 iq_32) {
        return this.id_throws.entrySet().stream().filter(entry -> entry.getKey() != iq_32).map(Map.Entry::getValue).collect(Collectors.toList());
    }

    protected void id_class(iq_3 iq_32) {
        if (!this.id_throws.containsKey(iq_32)) {
            this.id_throws.put(iq_32, new C_if());
        }
    }

    public iq_3 id_class(int n) {
        return this.id_throws.entrySet().stream().max(Comparator.comparingDouble(entry -> ((C_if)entry.getValue()).id_class(n))).map(Map.Entry::getKey).orElse(iq_3.id_break);
    }

    protected static iw_3 id_class(String string) {
        it_3 it_32 = rVL.id_class(rVL.W, string, new it_3());
        return new iw_3(it_32);
    }

    protected C_if id_break(iq_3 iq_32) {
        return this.id_throws.get(iq_32);
    }
}

