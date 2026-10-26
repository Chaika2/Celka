/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.reflect.TypeToken
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.NI;
import celestial.NQ;
import celestial.NT;
import celestial.NY;
import celestial.Ng_1;
import celestial.Nj_1;
import celestial.Nm_1;
import celestial.No_1;
import celestial.Nq_1;
import celestial.Nt_1;
import celestial.Nu_1;
import celestial.Qw_1;
import celestial.jI_2;
import celestial.jY_2;
import celestial.ly_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rVL;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpY_2;
import celestial.rqL_2;
import celestial.rqO_2;
import celestial.rrIH;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Nf_1
extends jY_2<Ng_1> {
    public static final Nq_1 id_class = new Nq_1("meta:missing_sound", 1.0f, 1.0f, 1, NT.FILE, false, false, 16);
    public static final Logger id_break = LogManager.getLogger();
    private static final Gson id_byte = new GsonBuilder().registerTypeHierarchyAdapter(rgP_2.class, (Object)new rgB_2()).registerTypeAdapter(NY.class, (Object)new No_1()).create();
    private static final TypeToken<Map<String, NY>> id_protected = new Nj_1();
    private final Map<rqO_2, NI> id_throws = Maps.newHashMap();
    private final Nt_1 id_case;

    public void id_byte() {
        this.id_case.id_byte();
    }

    public boolean id_byte(NQ nQ) {
        return this.id_case.id_break(nQ);
    }

    public Nf_1(rAL rAL2, Qw_1 qw_1) {
        this.id_case = new Nt_1(this, qw_1, rAL2);
    }

    public void id_class(rqL_2 rqL_22, float f) {
        if (rqL_22 == rqL_2.MASTER && f <= 0.0f) {
            this.id_byte();
        }
        this.id_case.id_class(rqL_22, f);
    }

    public void id_class(boolean bl) {
        this.id_case.id_class(bl);
    }

    @Override
    protected void id_class(Ng_1 ng_1, rAL rAL2) {
        ng_1.id_class(this.id_throws, this.id_case);
        for (rqO_2 rqO_22 : this.id_throws.keySet()) {
            String string;
            NI nI = this.id_throws.get(rqO_22);
            if (!(nI.id_protected() instanceof rgn_3) || jI_2.id_class(string = ((rgn_3)nI.id_protected()).id_implements())) continue;
            id_break.debug("Missing subtitle {} for event: {}", (Object)string, (Object)rqO_22);
        }
        if (id_break.isDebugEnabled()) {
            for (rqO_2 rqO_22 : this.id_throws.keySet()) {
                if (rVL.id_short.id_byte(rqO_22)) continue;
                id_break.debug("Not having sound event for: {}", (Object)rqO_22);
            }
        }
        this.id_case.id_class();
    }

    public static boolean id_class(Nq_1 nq_1, rqO_2 rqO_22, rAL rAL2) {
        rqO_2 rqO_23 = nq_1.id_protected();
        if (!rAL2.id_break(rqO_23)) {
            id_break.warn("{} - File {} does not exist, cannot add it to event {}", (Object)rAL2.getClass().getSimpleName(), (Object)rqO_23, (Object)rqO_22);
            return false;
        }
        return true;
    }

    public void id_class(rqO_2 rqO_22, rqL_2 rqL_22) {
        this.id_case.id_class(rqO_22, rqL_22);
    }

    public void id_class(Nu_1 nu_1) {
        this.id_case.id_class(nu_1);
    }

    protected Ng_1 id_class(rAL rAL2) {
        Ng_1 ng_1 = new Ng_1();
        for (String string : rAL2.id_class()) {
            try {
                for (rAF rAF2 : rAL2.id_byte(new rqO_2(string, "sounds.json"))) {
                    try {
                        InputStream inputStream = rAF2.id_break();
                        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);){
                            Map<String, NY> map = rpY_2.id_class(id_byte, (Reader)inputStreamReader, id_protected);
                            for (Map.Entry<String, NY> entry : map.entrySet()) {
                                ng_1.id_class(new rqO_2(string, entry.getKey()), entry.getValue(), rAL2);
                            }
                        }
                        finally {
                            if (inputStream == null) continue;
                            inputStream.close();
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        id_break.warn("Invalid sounds.json in resourcepack: '{}'", (Object)rAF2.id_byte(), (Object)runtimeException);
                    }
                }
                ((rrIH)((Object)rrIH.staticFields0d29566e59ec37698621b18f09fc7b34[0])).id_class(ng_1, rAL2);
            }
            catch (IOException iOException) {}
        }
        return ng_1;
    }

    public void id_class(NQ nQ, int n) {
        this.id_case.id_class(nQ, n);
    }

    public NI id_class(rqO_2 rqO_22) {
        return this.id_throws.get(rqO_22);
    }

    public void id_class(Nm_1 nm_1) {
        this.id_case.id_class(nm_1);
    }

    public Collection<rqO_2> id_class() {
        return this.id_throws.keySet();
    }

    public void id_class(ly_3 ly_32) {
        this.id_case.id_class(ly_32);
    }

    public void id_class(NQ nQ) {
        this.id_case.id_byte(nQ);
    }

    public void id_break(Nu_1 nu_1) {
        this.id_case.id_break(nu_1);
    }

    public void id_break() {
        this.id_case.id_protected();
    }

    @Override
    protected /* synthetic */ Object id_break(rAL rAL2) {
        return this.id_class(rAL2);
    }

    public void id_break(NQ nQ) {
        this.id_case.id_class(nQ);
    }

    public void id_throws() {
        this.id_case.id_throws();
    }

    public String id_case() {
        return this.id_case.id_case();
    }

    public void id_protected() {
        this.id_case.id_break();
    }
}

