/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
package celestial;

import celestial.XC;
import celestial.XF;
import celestial.XG;
import celestial.Xh_1;
import celestial.hT_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWH;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rpL_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;

public class Xb_1
extends hZ_2 {
    private final XF id_class;
    private final XF id_break;
    private final XF id_byte;
    private final Xh_1[] id_protected;

    public Xb_1(ho_3 ho_32, XF xF, XF xF2, XF xF3, Xh_1[] xh_1Array) {
        super(XG.id_class, ho_32);
        this.id_class = xF;
        this.id_break = xF2;
        this.id_byte = xF3;
        this.id_protected = xh_1Array;
    }

    @Override
    public JsonObject id_class(rWH rWH2) {
        JsonObject jsonObject;
        JsonObject jsonObject2 = super.id_class(rWH2);
        if (!(this.id_class.id_byte() && this.id_break.id_byte() && this.id_byte.id_byte())) {
            jsonObject = new JsonObject();
            jsonObject.add("occupied", this.id_class.id_protected());
            jsonObject.add("full", this.id_break.id_protected());
            jsonObject.add("empty", this.id_byte.id_protected());
            jsonObject2.add("slots", (JsonElement)jsonObject);
        }
        if (this.id_protected.length > 0) {
            jsonObject = new JsonArray();
            for (Xh_1 xh_1 : this.id_protected) {
                jsonObject.add(xh_1.id_class());
            }
            jsonObject2.add("items", (JsonElement)jsonObject);
        }
        return jsonObject2;
    }

    public boolean id_class(rhz_3 rhz_32, rdn_3 rdn_32, int n, int n2, int n3) {
        if (!this.id_break.id_byte(n)) {
            return false;
        }
        if (!this.id_byte.id_byte(n2)) {
            return false;
        }
        if (!this.id_class.id_byte(n3)) {
            return false;
        }
        int n4 = this.id_protected.length;
        if (n4 == 0) {
            return true;
        }
        if (n4 != 1) {
            ObjectArrayList objectArrayList = new ObjectArrayList((Object[])this.id_protected);
            int n5 = rhz_32.id_else();
            for (int i = 0; i < n5; ++i) {
                if (objectArrayList.isEmpty()) {
                    return true;
                }
                rdn_3 rdn_33 = rhz_32.id_extends(i);
                if (rdn_33.id_class()) continue;
                objectArrayList.removeIf(xh_1 -> xh_1.id_class(rdn_33));
            }
            return objectArrayList.isEmpty();
        }
        return !rdn_32.id_class() && this.id_protected[0].id_class(rdn_32);
    }

    public static Xb_1 id_class(rpL_2 ... rpL_2Array) {
        Xh_1[] xh_1Array = new Xh_1[rpL_2Array.length];
        for (int i = 0; i < rpL_2Array.length; ++i) {
            xh_1Array[i] = new Xh_1(null, rpL_2Array[i].id_case(), XF.id_throws, XF.id_throws, hT_2.id_break, hT_2.id_break, null, XC.id_class);
        }
        return Xb_1.id_class(xh_1Array);
    }

    public static Xb_1 id_class(Xh_1 ... xh_1Array) {
        return new Xb_1(ho_3.id_class, XF.id_throws, XF.id_throws, XF.id_throws, xh_1Array);
    }
}

