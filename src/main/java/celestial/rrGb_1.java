/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rRJ;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rja_3;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrGE;
import celestial.rrGM;
import celestial.rrGO;
import celestial.rrGX;
import celestial.rrGc_1;
import celestial.rrGh_1;
import celestial.rsG_2;
import celestial.ruS_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGb_1
extends rrGc_1 {
    private static final Logger id_extends = LogManager.getLogger();
    public int id_class;
    public int id_break;
    public rqM_2<rYB> id_byte;
    public boolean id_protected;
    public boolean id_throws;
    public byte id_case;
    public byte[] id_catch = new byte[16384];
    public boolean id_private;
    public final List<rrGM> id_implements = Lists.newArrayList();
    private final Map<rhd_3, rrGM> id_native = Maps.newHashMap();
    private final Map<String, rrGE> id_volatile = Maps.newHashMap();
    public final Map<String, rrGO> id_finally = Maps.newLinkedHashMap();
    private final Map<String, rrGX> id_final = Maps.newHashMap();

    @Override
    public rcd_3 id_byte(rcd_3 rcd_32) {
        rqO_2.id_class.encodeStart((DynamicOps)rcf_3.id_class, (Object)this.id_byte.id_class()).resultOrPartial(arg_0 -> ((Logger)id_extends).error(arg_0)).ifPresent(rcZ_22 -> rcd_32.id_class("dimension", (rcZ_2)rcZ_22));
        rcd_32.id_break("xCenter", this.id_class);
        rcd_32.id_break("zCenter", this.id_break);
        rcd_32.id_class("scale", this.id_case);
        rcd_32.id_class("colors", this.id_catch);
        rcd_32.id_class("trackingPosition", this.id_protected);
        rcd_32.id_class("unlimitedTracking", this.id_throws);
        rcd_32.id_class("locked", this.id_private);
        rcy_3 rcy_32 = new rcy_3();
        for (rrGE object : this.id_volatile.values()) {
            rcy_32.add(object.id_protected());
        }
        rcd_32.id_class("banners", rcy_32);
        rcy_3 rcy_33 = new rcy_3();
        for (rrGX rrGX2 : this.id_final.values()) {
            rcy_33.add(rrGX2.id_class());
        }
        rcd_32.id_class("frames", rcy_33);
        return rcd_32;
    }

    public rrGb_1(String string) {
        super(string);
    }

    public void id_class(rRq_1 rRq_12, int n, int n2) {
        Iterator<rrGE> iterator = this.id_volatile.values().iterator();
        while (iterator.hasNext()) {
            rrGE rrGE2;
            rrGE rrGE3 = iterator.next();
            if (rrGE3.id_class().b_() != n || rrGE3.id_class().d_() != n2 || rrGE3.equals(rrGE2 = rrGE.id_class(rRq_12, rrGE3.id_class()))) continue;
            iterator.remove();
            this.id_finally.remove(rrGE3.id_throws());
        }
    }

    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        double d = (double)rfH_22.b_() + 0.5;
        double d2 = (double)rfH_22.d_() + 0.5;
        int n = 1 << this.id_case;
        double d3 = (d - (double)this.id_class) / (double)n;
        double d4 = (d2 - (double)this.id_break) / (double)n;
        int n2 = 63;
        boolean bl = false;
        if (d3 >= -63.0 && d4 >= -63.0 && d3 <= 63.0 && d4 <= 63.0) {
            rrGE rrGE2 = rrGE.id_class(rRg_12, rfH_22);
            if (rrGE2 == null) {
                return;
            }
            boolean bl2 = true;
            if (this.id_volatile.containsKey(rrGE2.id_throws()) && this.id_volatile.get(rrGE2.id_throws()).equals(rrGE2)) {
                this.id_volatile.remove(rrGE2.id_throws());
                this.id_finally.remove(rrGE2.id_throws());
                bl2 = false;
                bl = true;
            }
            if (bl2) {
                this.id_volatile.put(rrGE2.id_throws(), rrGE2);
                this.id_class(rrGE2.id_break(), rRg_12, rrGE2.id_throws(), d, d2, 180.0, rrGE2.id_byte());
                bl = true;
            }
            if (bl) {
                this.id_byte();
            }
        }
    }

    public rrGM id_class(rhd_3 rhd_32) {
        rrGM rrGM2 = this.id_native.get(rhd_32);
        if (rrGM2 == null) {
            rrGM2 = new rrGM(this, rhd_32);
            this.id_native.put(rhd_32, rrGM2);
            this.id_implements.add(rrGM2);
        }
        return rrGM2;
    }

    public void id_class(int n, int n2) {
        this.id_byte();
        for (rrGM rrGM2 : this.id_implements) {
            rrGM2.id_class(n, n2);
        }
    }

    public void id_class(rfH_2 rfH_22, int n) {
        this.id_finally.remove("frame-" + n);
        this.id_final.remove(rrGX.id_class(rfH_22));
    }

    public ruS_2<?> id_class(rdn_3 rdn_32, rRq_1 rRq_12, rhd_3 rhd_32) {
        rrGM rrGM2 = this.id_native.get(rhd_32);
        return rrGM2 == null ? null : rrGM2.id_class(rdn_32);
    }

    public void id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        rcd_3 rcd_32;
        Object object;
        Object object2;
        Object object3;
        if (!this.id_native.containsKey(rhd_32)) {
            rrGM rrGM2 = new rrGM(this, rhd_32);
            this.id_native.put(rhd_32, rrGM2);
            this.id_implements.add(rrGM2);
        }
        if (!((rhz_3)rhd_32.id_implements[1]).id_implements(rdn_32)) {
            this.id_finally.remove(rhd_32.g().getString());
        }
        for (int i = 0; i < this.id_implements.size(); ++i) {
            object3 = this.id_implements.get(i);
            object2 = ((rrGM)object3).id_class.g().getString();
            if (!((Boolean)((rrGM)object3).id_class.id_throws[27]).booleanValue() && (((rhz_3)((rrGM)object3).id_class.id_implements[1]).id_implements(rdn_32) || rdn_32.id_goto())) {
                if (rdn_32.id_goto() || ((rYB)((rrGM)object3).id_class.id_throws[7]).E() != this.id_byte || !this.id_protected) continue;
                this.id_class(rrGh_1.PLAYER, (rYB)((rrGM)object3).id_class.id_throws[7], (String)object2, ((rrGM)object3).id_class.rx(), ((rrGM)object3).id_class.BO(), ((Float)((rrGM)object3).id_class.id_throws[15]).floatValue(), null);
                continue;
            }
            this.id_native.remove(((rrGM)object3).id_class);
            this.id_implements.remove(object3);
            this.id_finally.remove(object2);
        }
        if (rdn_32.id_goto() && this.id_protected) {
            rsG_2 rsG_22 = rdn_32.id_while();
            object3 = rsG_22.id_implements();
            object2 = this.id_final.get(rrGX.id_class((rfH_2)object3));
            if (object2 != null && rsG_22.V() != ((rrGX)object2).id_protected() && this.id_final.containsKey(((rrGX)object2).id_throws())) {
                this.id_finally.remove("frame-" + ((rrGX)object2).id_protected());
            }
            object = new rrGX((rfH_2)object3, rsG_22.Pg().id_protected() * 90, rsG_22.V());
            this.id_class(rrGh_1.FRAME, (rYB)rhd_32.id_throws[7], "frame-" + rsG_22.V(), ((rja_3)object3).b_(), ((rja_3)object3).d_(), rsG_22.Pg().id_protected() * 90, null);
            this.id_final.put(((rrGX)object).id_throws(), (rrGX)object);
        }
        if ((rcd_32 = rdn_32.id_package()) != null && rcd_32.id_byte("Decorations", 9)) {
            object3 = rcd_32.id_protected("Decorations", 10);
            for (int i = 0; i < ((rcy_3)object3).size(); ++i) {
                object = ((rcy_3)object3).id_class(i);
                if (this.id_finally.containsKey(((rcd_3)object).id_native("id"))) continue;
                this.id_class(rrGh_1.id_class(((rcd_3)object).id_case("type")), (rYB)rhd_32.id_throws[7], ((rcd_3)object).id_native("id"), ((rcd_3)object).id_extends("x"), ((rcd_3)object).id_extends("z"), ((rcd_3)object).id_extends("rot"), null);
            }
        }
    }

    public void id_class(rrGb_1 rrGb_12) {
        this.id_private = true;
        this.id_class = rrGb_12.id_class;
        this.id_break = rrGb_12.id_break;
        this.id_volatile.putAll(rrGb_12.id_volatile);
        this.id_finally.putAll(rrGb_12.id_finally);
        System.arraycopy(rrGb_12.id_catch, 0, this.id_catch, 0, rrGb_12.id_catch.length);
        this.id_byte();
    }

    public void id_class(double d, double d2, int n) {
        int n2 = 128 * (1 << n);
        int n3 = rfU_2.id_byte((d + 64.0) / (double)n2);
        int n4 = rfU_2.id_byte((d2 + 64.0) / (double)n2);
        this.id_class = n3 * n2 + n2 / 2 - 64;
        this.id_break = n4 * n2 + n2 / 2 - 64;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_byte = (rqM_2)rRJ.id_class(new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_32.id_byte("dimension"))).resultOrPartial(arg_0 -> ((Logger)id_extends).error(arg_0)).orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + rcd_32.id_byte("dimension")));
        this.id_class = rcd_32.id_private("xCenter");
        this.id_break = rcd_32.id_private("zCenter");
        this.id_case = (byte)rfU_2.id_class((int)rcd_32.id_case("scale"), 0, 4);
        this.id_protected = !rcd_32.id_byte("trackingPosition", 1) || rcd_32.id_new("trackingPosition");
        this.id_throws = rcd_32.id_new("unlimitedTracking");
        this.id_private = rcd_32.id_new("locked");
        this.id_catch = rcd_32.id_volatile("colors");
        if (this.id_catch.length != 16384) {
            this.id_catch = new byte[16384];
        }
        rcy_3 rcy_32 = rcd_32.id_protected("banners", 10);
        for (int i = 0; i < rcy_32.size(); ++i) {
            rrGE rrGE2 = rrGE.id_class(rcy_32.id_class(i));
            this.id_volatile.put(rrGE2.id_throws(), rrGE2);
            this.id_class(rrGE2.id_break(), null, rrGE2.id_throws(), rrGE2.id_class().b_(), rrGE2.id_class().d_(), 180.0, rrGE2.id_byte());
        }
        rcy_3 rcy_33 = rcd_32.id_protected("frames", 10);
        for (int i = 0; i < rcy_33.size(); ++i) {
            rrGX rrGX2 = rrGX.id_class(rcy_33.id_class(i));
            this.id_final.put(rrGX2.id_throws(), rrGX2);
            this.id_class(rrGh_1.FRAME, null, "frame-" + rrGX2.id_protected(), rrGX2.id_break().b_(), rrGX2.id_break().d_(), rrGX2.id_byte(), null);
        }
    }

    public void id_class(int n, int n2, int n3, boolean bl, boolean bl2, rqM_2<rYB> rqM_22) {
        this.id_case = (byte)n3;
        this.id_class(n, (double)n2, (int)this.id_case);
        this.id_byte = rqM_22;
        this.id_protected = bl;
        this.id_throws = bl2;
        this.id_byte();
    }

    private void id_class(rrGh_1 rrGh_12, rRg_1 rRg_12, String string, double d, double d2, double d3, rgP_2 rgP_22) {
        byte by;
        int n = 1 << this.id_case;
        float f = (float)(d - (double)this.id_class) / (float)n;
        float f2 = (float)(d2 - (double)this.id_break) / (float)n;
        byte by2 = (byte)((double)(f * 2.0f) + 0.5);
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.5);
        int n2 = 63;
        if (f >= -63.0f && f2 >= -63.0f && f <= 63.0f && f2 <= 63.0f) {
            by = (byte)((d3 += d3 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.id_byte == rYB.id_protected && rRg_12 != null) {
                int n3 = (int)(rRg_12.id_public().id_case() / 10L);
                by = (byte)(n3 * n3 * 34187121 + n3 * 121 >> 15 & 0xF);
            }
        } else {
            if (rrGh_12 != rrGh_1.PLAYER) {
                this.id_finally.remove(string);
                return;
            }
            int n4 = 320;
            if (Math.abs(f) < 320.0f && Math.abs(f2) < 320.0f) {
                rrGh_12 = rrGh_1.PLAYER_OFF_MAP;
            } else {
                if (!this.id_throws) {
                    this.id_finally.remove(string);
                    return;
                }
                rrGh_12 = rrGh_1.PLAYER_OFF_LIMITS;
            }
            by = 0;
            if (f <= -63.0f) {
                by2 = -128;
            }
            if (f2 <= -63.0f) {
                by3 = -128;
            }
            if (f >= 63.0f) {
                by2 = 127;
            }
            if (f2 >= 63.0f) {
                by3 = 127;
            }
        }
        this.id_finally.put(string, new rrGO(rrGh_12, by2, by3, by, rgP_22));
    }

    public static void id_class(rdn_3 rdn_32, rfH_2 rfH_22, String string, rrGh_1 rrGh_12) {
        rcy_3 rcy_32;
        if (rdn_32.id_final() && rdn_32.id_package().id_byte("Decorations", 9)) {
            rcy_32 = rdn_32.id_package().id_protected("Decorations", 10);
        } else {
            rcy_32 = new rcy_3();
            rdn_32.id_class("Decorations", rcy_32);
        }
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("type", rrGh_12.id_class());
        rcd_32.id_class("id", string);
        rcd_32.id_class("x", (double)rfH_22.b_());
        rcd_32.id_class("z", (double)rfH_22.d_());
        rcd_32.id_class("rot", 180.0);
        rcy_32.add(rcd_32);
        if (rrGh_12.id_byte()) {
            rcd_3 rcd_33 = rdn_32.id_class("display");
            rcd_33.id_break("MapColor", rrGh_12.id_protected());
        }
    }
}

