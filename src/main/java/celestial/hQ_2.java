/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.hz_3;
import celestial.rWH;
import celestial.rzr_3;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.stream.Stream;

public class hQ_2
extends hZ_2 {
    private final ho_3[] id_class;

    public hQ_2(ho_3 ho_32, ho_3[] ho_3Array) {
        super(hz_3.id_class, ho_32);
        this.id_class = ho_3Array;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("victims", ho_3.id_class(this.id_class, rWH2));
        return jsonObject;
    }

    public boolean id_class(Collection<? extends rzr_3> collection) {
        for (ho_3 ho_32 : this.id_class) {
            boolean bl = false;
            for (rzr_3 rzr_32 : collection) {
                if (!ho_32.id_class(rzr_32)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public static hQ_2 id_class(hY_2 ... hY_2Array) {
        return new hQ_2(ho_3.id_class, (ho_3[])Stream.of(hY_2Array).map(ho_3::id_class).toArray(ho_3[]::new));
    }
}

