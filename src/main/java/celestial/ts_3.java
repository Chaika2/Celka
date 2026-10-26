/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.VG;
import celestial.Vb_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.qE_2;
import celestial.rAF;
import celestial.rAL;
import celestial.rAn_1;
import celestial.rAv_1;
import celestial.rVL;
import celestial.rVu_1;
import celestial.rfU_2;
import celestial.rha_3;
import celestial.rhi_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rsT_2;
import celestial.rsp_3;
import celestial.to_3;
import celestial.tp_3;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;

public class ts_3<T extends iB_2, M extends tp_3<T>>
extends Tf_1<T, M>
implements rAn_1 {
    private static final Int2ObjectMap<rqO_2> id_class = (Int2ObjectMap)rqR_2.id_class(new Int2ObjectOpenHashMap(), int2ObjectOpenHashMap -> {
        int2ObjectOpenHashMap.put(1, (Object)new rqO_2("stone"));
        int2ObjectOpenHashMap.put(2, (Object)new rqO_2("iron"));
        int2ObjectOpenHashMap.put(3, (Object)new rqO_2("gold"));
        int2ObjectOpenHashMap.put(4, (Object)new rqO_2("emerald"));
        int2ObjectOpenHashMap.put(5, (Object)new rqO_2("diamond"));
    });
    private final Object2ObjectMap<rhi_3, Vb_1> id_break = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<rsT_2, Vb_1> id_byte = new Object2ObjectOpenHashMap();
    private final rAv_1 id_protected;
    private final String id_throws;

    public ts_3(qE_2<T, M> qE_22, rAv_1 rAv_12, String string) {
        super(qE_22);
        this.id_protected = rAv_12;
        this.id_throws = string;
        rAv_12.id_class(this);
    }

    @Override
    public void id_class(rAL rAL2) {
        this.id_byte.clear();
        this.id_break.clear();
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!((an_3)t).Pp()) {
            rsp_3 rsp_32 = ((rha_3)t).su();
            rhi_3 rhi_32 = rsp_32.id_class();
            rsT_2 rsT_22 = rsp_32.id_break();
            Vb_1 vb_1 = this.id_class(this.id_break, "type", rVL.X, rhi_32);
            Vb_1 vb_12 = this.id_class(this.id_byte, "profession", rVL.J, rsT_22);
            Object m = this.id_byte();
            ((to_3)m).id_class(vb_12 == Vb_1.NONE || vb_12 == Vb_1.PARTIAL && vb_1 != Vb_1.FULL);
            rqO_2 rqO_22 = this.id_class("type", rVL.X.id_break(rhi_32));
            ts_3.id_class(m, rqO_22, ml_1, hx_1, n, t, 1.0f, 1.0f, 1.0f);
            ((to_3)m).id_class(true);
            if (rsT_22 != rsT_2.id_class && !((iB_2)t).n_()) {
                rqO_2 rqO_23 = this.id_class("profession", rVL.J.id_break(rsT_22));
                ts_3.id_class(m, rqO_23, ml_1, hx_1, n, t, 1.0f, 1.0f, 1.0f);
                if (rsT_22 != rsT_2.id_native) {
                    rqO_2 rqO_24 = this.id_class("profession_level", (rqO_2)id_class.get(rfU_2.id_class(rsp_32.id_byte(), 1, id_class.size())));
                    ts_3.id_class(m, rqO_24, ml_1, hx_1, n, t, 1.0f, 1.0f, 1.0f);
                }
            }
        }
    }

    public <K> Vb_1 id_class(Object2ObjectMap<K, Vb_1> object2ObjectMap, String string, rVu_1<K> rVu_12, K k) {
        return (Vb_1)((Object)object2ObjectMap.computeIfAbsent(k, object2 -> {
            try (rAF rAF2 = this.id_protected.id_class(this.id_class(string, rVu_12.id_break(k)));){
                VG vG = rAF2.id_class(VG.id_class);
                if (vG == null) return Vb_1.NONE;
                Vb_1 vb_1 = vG.id_class();
                return vb_1;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            return Vb_1.NONE;
        }));
    }

    private rqO_2 id_class(String string, rqO_2 rqO_22) {
        return new rqO_2(rqO_22.id_byte(), "textures/entity/" + this.id_throws + "/" + string + "/" + rqO_22.id_break() + ".png");
    }
}

