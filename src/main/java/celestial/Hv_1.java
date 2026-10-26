/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.lD_2;
import java.util.Map;
import java.util.stream.Collectors;

public class Hv_1 {
    private final Map<HU, lD_2> id_class = HU.id_public().stream().collect(Collectors.toMap(hU -> hU, hU -> new lD_2(hU.id_goto())));

    public void id_class() {
        this.id_class.values().forEach(lD_2::id_native);
    }

    public lD_2 id_class(HU hU) {
        return this.id_class.get(hU);
    }

    public void id_break() {
        this.id_class.values().forEach(lD_2::id_volatile);
    }
}

