/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 */
package celestial;

import celestial.Af_1;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgm_3;
import celestial.rpY_2;
import celestial.rpd_3;
import celestial.ruC_2;
import celestial.ruH_2;
import celestial.ruS_2;
import celestial.rul_3;
import celestial.run_3;
import celestial.rup_3;
import celestial.ruu_3;
import celestial.ruy_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import java.io.IOException;

public class rLb_1
implements ruS_2<Af_1> {
    private static final Gson id_class = new GsonBuilder().registerTypeAdapter(ruy_3.class, (Object)new rup_3()).registerTypeAdapter(ruC_2.class, (Object)new rul_3()).registerTypeAdapter(run_3.class, (Object)new ruH_2()).registerTypeHierarchyAdapter(rgP_2.class, (Object)new rgB_2()).registerTypeHierarchyAdapter(rgc_3.class, (Object)new rgm_3()).registerTypeAdapterFactory((TypeAdapterFactory)new rpd_3()).create();
    private run_3 id_break;

    public rLb_1() {
    }

    public rLb_1(run_3 run_32) {
        this.id_break = run_32;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_break = rpY_2.id_class(id_class, ruu_32.id_throws(Short.MAX_VALUE), run_3.class);
    }

    @Override
    public void id_class(Af_1 af_1) {
        af_1.id_class(this);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(id_class.toJson((Object)this.id_break));
    }

    public run_3 id_break() {
        return this.id_break;
    }
}

