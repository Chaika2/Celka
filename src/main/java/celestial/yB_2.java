/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 */
package celestial;

import celestial.HU;
import celestial.Hc_1;
import celestial.Hd_1;
import celestial.Hv_1;
import celestial.Hx_1;
import celestial.IC;
import celestial.lD_2;
import celestial.lp_3;
import celestial.rqR_2;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class yB_2 {
    private final Hv_1 id_class = new Hv_1();
    private final SortedMap<HU, lD_2> id_break = (SortedMap)rqR_2.id_class(new Object2ObjectLinkedOpenHashMap(), (T object2ObjectLinkedOpenHashMap) -> {
        object2ObjectLinkedOpenHashMap.put((Object)lp_3.id_catch(), (Object)this.id_class.id_class(HU.id_case()));
        object2ObjectLinkedOpenHashMap.put((Object)lp_3.id_private(), (Object)this.id_class.id_class(HU.id_private()));
        object2ObjectLinkedOpenHashMap.put((Object)lp_3.id_class(), (Object)this.id_class.id_class(HU.id_catch()));
        object2ObjectLinkedOpenHashMap.put((Object)lp_3.id_finally(), (Object)this.id_class.id_class(HU.id_implements()));
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, lp_3.id_break());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, lp_3.id_byte());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, lp_3.id_protected());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, lp_3.id_throws());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, lp_3.id_case());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_extends());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_final());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_package());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_new());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_continue());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_int());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_super());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_this());
        yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, HU.id_volatile());
        IC.id_extends.forEach(hU -> yB_2.id_class((Object2ObjectLinkedOpenHashMap<HU, lD_2>)object2ObjectLinkedOpenHashMap, hU));
    });
    private final Hd_1 id_byte = Hx_1.id_class(this.id_break, new lD_2(256));
    private final Hd_1 id_protected = Hx_1.id_class(new lD_2(256));
    private final Hc_1 id_throws = new Hc_1(this.id_byte);

    public Hd_1 id_byte() {
        return this.id_protected;
    }

    private static void id_class(Object2ObjectLinkedOpenHashMap<HU, lD_2> object2ObjectLinkedOpenHashMap, HU hU) {
        object2ObjectLinkedOpenHashMap.put((Object)hU, (Object)new lD_2(hU.id_goto()));
    }

    public Hv_1 id_class() {
        return this.id_class;
    }

    public Hd_1 id_break() {
        return this.id_byte;
    }

    public Hc_1 id_protected() {
        return this.id_throws;
    }
}

