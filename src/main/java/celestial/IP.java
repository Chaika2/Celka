/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package celestial;

import celestial.IB;
import celestial.ID;
import celestial.IK;
import celestial.IU;
import celestial.Ie_1;
import celestial.Ir_1;
import celestial.fM_2;
import celestial.fS_2;
import celestial.fb_3;
import celestial.fs_3;
import celestial.rCF;
import celestial.xc_3;
import celestial.xd_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class IP {
    protected final Gson id_class = new GsonBuilder().registerTypeAdapter(Ir_1.class, (Object)new IB()).registerTypeAdapter(IK.class, (Object)new ID()).registerTypeAdapter(IU.class, (Object)new Ie_1()).registerTypeAdapter(fS_2.class, (Object)new fs_3(this)).registerTypeAdapter(fb_3.class, (Object)new fM_2()).create();
    private rCF<xd_3, xc_3> id_break;

    public rCF<xd_3, xc_3> id_class() {
        return this.id_break;
    }

    public void id_class(rCF<xd_3, xc_3> rCF2) {
        this.id_break = rCF2;
    }
}

