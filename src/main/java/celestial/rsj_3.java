/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rVL;
import celestial.rdI_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rha_3;
import celestial.rhi_3;
import celestial.rsR_2;
import java.util.Map;
import java.util.Random;

public class rsj_3
implements rsR_2 {
    private final Map<rhi_3, rdb_3> id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;

    public rsj_3(int n, int n2, int n3, Map<rhi_3, rdb_3> map) {
        rVL.X.id_case().filter(rhi_32 -> !map.containsKey(rhi_32)).findAny().ifPresent(rhi_32 -> {
            throw new IllegalStateException("Missing trade for villager type: " + rVL.X.id_break((rhi_3)rhi_32));
        });
        this.id_class = map;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        if (an_32 instanceof rha_3) {
            rdn_3 rdn_32 = new rdn_3(this.id_class.get(((rha_3)((Object)an_32)).su().id_class()), this.id_break);
            return new rdI_2(rdn_32, new rdn_3(rdy_3.dP), this.id_byte, this.id_protected, 0.05f);
        }
        return null;
    }
}

