/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.XJ;
import celestial.hK_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rzr_3;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Xx_1
extends hZ_2 {
    private final ho_3[] id_class;
    private final XF id_break;

    public Xx_1(ho_3 ho_32, ho_3[] ho_3Array, XF xF) {
        super(XJ.id_class, ho_32);
        this.id_class = ho_3Array;
        this.id_break = xF;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject = super.id_class(rWH2);
        jsonObject.add("victims", ho_3.id_class(this.id_class, rWH2));
        jsonObject.add("unique_entity_types", this.id_break.id_protected());
        return jsonObject;
    }

    public boolean id_class(Collection<rzr_3> collection, int n) {
        if (this.id_class.length > 0) {
            ArrayList arrayList = Lists.newArrayList(collection);
            for (ho_3 ho_32 : this.id_class) {
                boolean bl = false;
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    rzr_3 rzr_32 = (rzr_3)iterator.next();
                    if (!ho_32.id_class(rzr_32)) continue;
                    iterator.remove();
                    bl = true;
                    break;
                }
                if (bl) continue;
                return false;
            }
        }
        return this.id_break.id_byte(n);
    }

    public static Xx_1 id_class(XF xF) {
        ho_3[] ho_3Array = new ho_3[]{};
        return new Xx_1(ho_3.id_class, ho_3Array, xF);
    }

    public static Xx_1 id_class(hK_2 ... hK_2Array) {
        ho_3[] ho_3Array = new ho_3[hK_2Array.length];
        for (int i = 0; i < hK_2Array.length; ++i) {
            hK_2 hK_22 = hK_2Array[i];
            ho_3Array[i] = ho_3.id_class(hK_22.id_break());
        }
        return new Xx_1(ho_3.id_class, ho_3Array, XF.id_throws);
    }
}

