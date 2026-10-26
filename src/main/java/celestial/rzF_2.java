/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.GsonBuilder
 */
package celestial;

import celestial.rNL;
import celestial.rNl_1;
import celestial.rQF;
import celestial.rQz_1;
import celestial.rWC;
import celestial.rWD;
import celestial.rWU;
import celestial.rWn_1;
import celestial.rWp_1;
import celestial.rWy_1;
import celestial.rzB_2;
import celestial.rzE_2;
import celestial.rzL_2;
import celestial.rzM_2;
import celestial.rzN_2;
import celestial.rzS_2;
import celestial.rzV_2;
import celestial.rzg_3;
import celestial.rzn_3;
import celestial.rzu_3;
import com.google.gson.GsonBuilder;

public class rzF_2 {
    public static GsonBuilder id_byte() {
        return rzF_2.id_break().registerTypeAdapter(rzN_2.class, (Object)new rzu_3()).registerTypeAdapter(rzL_2.class, (Object)new rzn_3());
    }

    public static GsonBuilder id_class() {
        return new GsonBuilder().registerTypeAdapter(rzV_2.class, (Object)new rzg_3()).registerTypeAdapter(rWn_1.class, (Object)new rWC()).registerTypeAdapter(rWy_1.class, (Object)new rWp_1()).registerTypeHierarchyAdapter(rQz_1.class, rQF.id_class()).registerTypeHierarchyAdapter(rzB_2.class, (Object)new rzS_2());
    }

    public static GsonBuilder id_break() {
        return rzF_2.id_class().registerTypeAdapter(rWD.class, (Object)new rWU()).registerTypeHierarchyAdapter(rzE_2.class, rzM_2.id_class()).registerTypeHierarchyAdapter(rNL.class, rNl_1.id_class());
    }
}

