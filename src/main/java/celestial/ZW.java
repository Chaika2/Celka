/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Lf_1;
import celestial.Ml_1;
import celestial.ZJ;
import celestial.Zc_1;
import celestial.Zk_1;
import celestial.Zz_1;
import celestial.rRA;
import celestial.rRZ;
import celestial.rRu_1;
import celestial.rgF_2;
import celestial.rgn_3;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ZW
extends Lf_1<Zk_1> {
    public final /* synthetic */ ZJ id_class;

    public ZW(ZJ zJ, rRu_1 rRu_12) {
        this.id_class = zJ;
        super(zJ.id_volatile, zJ.id_package, zJ.id_int, 43, zJ.id_int - 32, 24);
        HashMap hashMap = Maps.newHashMap();
        rRu_1.id_class(new Zz_1(this, zJ, rRu_12, hashMap));
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry2 -> {
            ZJ zJ = this.id_class;
            Objects.requireNonNull(zJ);
            this.id_break(new Zc_1(zJ, new rgn_3(((rRZ)((Object)((Object)entry2.getKey()))).id_class()).id_class(rgF_2.BOLD, rgF_2.YELLOW)));
            ((Map)entry2.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(rRA::id_class))).forEach(entry -> this.id_break((Zk_1)entry.getValue()));
        });
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        Zk_1 zk_1;
        super.id_class(ml_1, n, n2, f);
        if (this.id_break(n, n2) && (zk_1 = (Zk_1)this.id_protected(n, n2)) != null) {
            this.id_class.id_break(zk_1.id_class);
        }
    }
}

