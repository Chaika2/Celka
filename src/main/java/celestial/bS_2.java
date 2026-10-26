/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.C_class;
import celestial.JI;
import celestial.JV;
import celestial.Ji_1;
import celestial.Ml_1;
import celestial.Ps_1;
import celestial.QY;
import celestial.T;
import celestial.Wp_1;
import celestial.Y;
import celestial.bE_2;
import celestial.bM_2;
import celestial.bb_3;
import celestial.bs_3;
import celestial.dv_3;
import celestial.jI_2;
import celestial.ju_3;
import celestial.q_1;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rZR;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rjC_2;
import celestial.rrIk_1;
import celestial.rrLu_1;
import celestial.rrfD_2;
import celestial.rrjc_3;
import celestial.ruS_2;
import celestial.rvC_2;
import celestial.ryO_2;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xs_3;
import celestial.yX_2;
import celestial.yt_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class bS_2
extends bb_3
implements MinecraftAccessor {
    public Object[] id_class;
    private static boolean[] id_break;
    private static String[] id_protected;
    private static short[] id_throws;
    private static float[] id_case;
    private static byte[] id_catch;

    public bS_2(C_class c_class, bM_2 bM_22) {
        super(c_class, bM_22);
        HashMap hashMap;
        HashMap hashMap2;
        ConcurrentHashMap concurrentHashMap;
        this.id_implements();
        this.id_class[bS_2.id_throws[0]] = concurrentHashMap = new ConcurrentHashMap();
        this.id_class[bS_2.id_throws[1]] = hashMap2 = new HashMap();
        this.id_class[bS_2.id_throws[2]] = hashMap = new HashMap();
        bs_3 bs_32 = (rfH_22, xc_32) -> {
            this.id_implements();
            xd_3 xd_32 = xc_32.id_break();
            if (xd_32 instanceof JI) {
                return ((rrIk_1)((Map)this.id_class[id_throws[21]]).get((Object)((bE_2)((Object)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[22]]))))).id_class();
            }
            if (xd_32 instanceof Wp_1) {
                return ((rrIk_1)((Map)this.id_class[id_throws[23]]).get((Object)((bE_2)((Object)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[24]]))))).id_class();
            }
            if (xd_32 instanceof Ji_1) {
                return ((rrIk_1)((Map)this.id_class[id_throws[25]]).get((Object)((bE_2)((Object)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[26]]))))).id_class();
            }
            if (xd_32 instanceof dv_3) {
                return ((rrIk_1)((Map)this.id_class[id_throws[27]]).get((Object)((bE_2)((Object)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[28]]))))).id_class();
            }
            if (xd_32 instanceof xs_3) {
                return ((rrIk_1)((Map)this.id_class[id_throws[29]]).get((Object)((bE_2)((Object)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[30]]))))).id_class();
            }
            if (xd_32 instanceof JV) {
                return ((rrIk_1)((Map)this.id_class[id_throws[31]]).get((Object)((bE_2)((Object)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[32]]))))).id_class();
            }
            return id_break[7];
        };
        this.id_class[bS_2.id_throws[3]] = bs_32;
    }

    static {
        bS_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2524713ED8F40DB8L;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_implements();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[9]])) {
            if (((Map)this.id_class[id_throws[10]]).isEmpty()) {
                return;
            }
            Ps_1 ps_1 = this.id_byte().id_throw();
            rYB rYB2 = ps_1.id_case();
            ((Map)this.id_class[id_throws[11]]).entrySet().removeIf(entry -> {
                this.id_implements();
                rfH_2 rfH_22 = (rfH_2)entry.getKey();
                xd_3 xd_32 = (xd_3)entry.getValue();
                if (rYB2.id_byte(rfH_22).id_break() == xd_32) {
                    ((Map)this.id_class[id_throws[18]]).put(rfH_22, xd_32);
                    return id_break[4];
                }
                if (((Map)this.id_class[id_throws[19]]).containsKey(rfH_22)) {
                    ((Map)this.id_class[id_throws[20]]).remove(rfH_22);
                    return id_break[5];
                }
                return id_break[6];
            });
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, 83, 25, -35, 113, 69, 51, 117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvC_2) {
            rvC_2 rvC_22 = (rvC_2)ruS_22;
            rvC_22.id_class((rfH_2 rfH_22, xc_3 xc_32) -> this.id_break((rfH_2)rfH_22, (xc_3)xc_32));
        } else if (ruS_22 instanceof rZR) {
            rZR rZR2 = (rZR)ruS_22;
            this.id_break(rZR2.id_byte(), rZR2.id_break());
        }
    }

    public void id_class(Map<bE_2, rrIk_1> map) {
        this.id_implements();
        ((Map)this.id_class[id_throws[14]]).clear();
        ((Map)this.id_class[id_throws[15]]).putAll(map);
    }

    @Override
    public void id_class() {
        this.id_implements();
        super.id_class();
        ((Map)this.id_class[id_throws[12]]).clear();
        ((Map)this.id_class[id_throws[13]]).clear();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4DB7F02;
    }

    @Override
    public void id_class(T t) {
        this.id_implements();
        if (((Map)this.id_class[id_throws[4]]).isEmpty()) {
            return;
        }
        Ps_1 ps_1 = this.id_byte().id_throw();
        QY qY = ps_1.id_throws();
        yt_3 yt_32 = ((yX_2)qY.id_class[id_throws[5]]).id_static();
        rYB rYB2 = ps_1.id_case();
        Ml_1 ml_1 = t.id_byte();
        float f = t.id_break();
        ml_1.id_class();
        GL11.glEnable((int)id_throws[6]);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableBlend();
        RenderSystem.lineWidth(id_case[0]);
        RenderSystem.disableTexture();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(id_break[0]);
        id_strictfp.id_class(id_break[1], ju_3.id_this);
        double d = id_void.id_case();
        double d2 = id_void.id_catch();
        double d3 = id_void.id_private();
        for (Map.Entry entry : ((Map)this.id_class[id_throws[7]]).entrySet()) {
            rfl_3 rfl_32;
            rfH_2 rfH_22 = (rfH_2)entry.getKey();
            xd_3 xd_32 = (xd_3)entry.getValue();
            double d4 = rfH_22.b_();
            double d5 = rfH_22.c_();
            double d6 = rfH_22.d_();
            ryO_2 ryO_22 = rYB2.id_class(rfH_22);
            if (ryO_22 != null) {
                xc_3 xc_32 = ryO_22.id_abstract();
                rjC_2 rjC_22 = rrjc_3.id_class(ryO_22, rfH_22, xc_32, f);
                if (rjC_22 == null) continue;
                rfl_32 = rjC_22.id_class().id_protected(d4, d5, d6);
            } else {
                rfl_32 = rrjc_3.id_class(xd_32.id_continue(), rfH_22).id_protected(d4, d5, d6);
            }
            if (!yt_32.id_class(rfl_32)) continue;
            rrfD_2.id_class(ml_1, rfl_32.id_protected(-d, -d2, -d3), (int)id_catch[0]);
        }
        id_default.id_break();
        RenderSystem.enableTexture();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(id_break[2]);
        RenderSystem.disableBlend();
        GL11.glDisable((int)id_throws[8]);
        ml_1.id_break();
    }

    private void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_implements();
        if (xc_32.id_catch()) {
            return;
        }
        xd_3 xd_32 = xc_32.id_break();
        if (((bs_3)this.id_class[id_throws[16]]).test(rfH_22, xc_32) && ((Map)this.id_class[id_throws[17]]).putIfAbsent(rfH_22.id_int(), xd_32) == null) {
            rVi_1 rVi_12 = new rgN_2(id_protected[0]).id_class(rgF_2.GRAY).id_break(id_protected[1]).id_class(new rgN_2(jI_2.id_class(id_protected[2], xd_32.id_volatile(), new Object[id_break[3]])).id_class(rgF_2.RED)).id_break(id_protected[3]);
            this.id_class(rVi_12);
        }
    }

    private static void id_throws() {
        short[] sArray = new short[33];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 8;
        sArray[6] = 2848;
        sArray[8] = 2848;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 2;
        sArray[16] = 3;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[23] = 2;
        sArray[24] = 1;
        sArray[25] = 2;
        sArray[26] = 2;
        sArray[27] = 2;
        sArray[28] = 3;
        sArray[29] = 2;
        sArray[30] = 4;
        sArray[31] = 2;
        sArray[32] = 5;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bS_2.id_private();
        bS_2.id_finally();
        bS_2.id_throws();
        bS_2.id_case();
        bS_2.id_catch();
    }

    private static void id_finally() {
        id_protected = new String[]{new String(""), new String("\u041d\u0430\u0439\u0434\u0435\u043d \u0431\u043b\u043e\u043a '"), new String("ru_ru"), new String("'")};
    }

    private static void id_catch() {
        id_catch = new byte[]{-1, 4};
    }

    private static void id_case() {
        id_case = new float[]{1.5f};
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_catch[1]];
        }
    }

    private static void id_private() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_break = blArray;
    }
}

