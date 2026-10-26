/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.C_throws;
import celestial.Fc_1;
import celestial.Fu_1;
import celestial.Ml_1;
import celestial.PJ;
import celestial.Ps_1;
import celestial.Y;
import celestial.cb_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.gm_3;
import celestial.ju_3;
import celestial.module.Module;
import celestial.module.player.ChestStealer;
import celestial.q_1;
import celestial.rHu_1;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rmD_2;
import celestial.rmU_2;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rqr_3;
import celestial.rrFo_1;
import celestial.rrLM;
import celestial.rrNV;
import celestial.rrNh_1;
import celestial.rrTF;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTp_1;
import celestial.rrfD_2;
import celestial.rrfu_3;
import celestial.rrjc_3;
import celestial.rrlK_2;
import celestial.rrnF_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.vm_3;
import celestial.xu_3;
import celestial.yX_2;
import com.google.common.collect.ComparisonChain;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class rrlo_3
extends rrTF<ChestStealer>
implements rrnF_2 {
    private static boolean[] id_break;
    private static String[] id_byte;
    private static byte[] id_protected;
    private static float[] id_case;
    private static short[] id_catch;
    public Object[] id_class;

    public rrlK_2 id_int() {
        this.id_try();
        return (rrlK_2)this.id_class[id_catch[57]];
    }

    public rrlo_3(ChestStealer chestStealer) {
        super(chestStealer);
        HashMap hashMap;
        this.id_try();
        rrTT rrTT2 = new rrTT(this);
        this.id_class[rrlo_3.id_catch[0]] = rrTT2;
        this.id_class[rrlo_3.id_catch[1]] = hashMap = new HashMap();
    }

    static {
        rrlo_3.ntfClinit();
    }

    private static void id_this() {
        boolean[] blArray = new boolean[37];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[22] = true;
        blArray[28] = true;
        blArray[32] = true;
        blArray[33] = true;
        id_break = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x52618CD5;
    }

    private rrlK_2 id_class(Collection<rrlK_2> collection) {
        if (collection.isEmpty()) {
            return null;
        }
        rrlK_2 rrlK_24 = this.id_int();
        if (rrlK_24 != null && collection.contains(rrlK_24)) {
            return rrlK_24;
        }
        ArrayList<rrlK_2> arrayList = new ArrayList<rrlK_2>(collection);
        arrayList.sort((rrlK_22, rrlK_23) -> {
            rHu_1 rHu_12 = rrlK_22.id_throws();
            rHu_1 rHu_13 = rrlK_23.id_throws();
            return ComparisonChain.start().compare(rrlK_22.id_break(), rrlK_23.id_break()).compare(((cb_3)rrlo_3.id_import.id_class[id_catch[60]]).id_break(rHu_12.id_char()), ((cb_3)rrlo_3.id_import.id_class[id_catch[61]]).id_break(rHu_13.id_char())).result();
        });
        return (rrlK_2)arrayList.get(id_break[20]);
    }

    private boolean id_class(rfH_2 rfH_22) {
        return ((gm_3)rrlo_3.id_import.id_class[id_catch[42]]).id_byte(rfH_22).id_break() == xu_3.re ? id_break[22] : id_break[23];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB303FF789E87806CL;
    }

    @EventTarget
    public void id_class(rrLM rrLM2) {
        ((ChestStealer)this.id_continue()).id_byte(id_break[19]);
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_try();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[2]])) {
            Iterator iterator;
            Object object;
            Object object2;
            Object object3;
            Map.Entry entry2;
            if (!this.id_public()) {
                ((ChestStealer)this.id_continue()).id_byte(id_break[0]);
                return;
            }
            rrNV rrNV2 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_catch[3]])).id_throws().id_switch();
            if (rrNV2 != null) {
                return;
            }
            Ps_1 ps_1 = C_throws.id_byte().id_throw();
            for (Map.Entry entry2 : ((gm_3)rrlo_3.id_import.id_class[rrlo_3.id_catch[4]]).id_case) {
                if (!(entry2 instanceof rHu_1) || (object3 = (rrlK_2)((Map)this.id_class[id_catch[5]]).get(((ryO_2)(object2 = (rHu_1)((Object)entry2))).id_char())) != null || !this.id_class(ps_1, ((rrlK_2)(object = new rrlK_2((rHu_1)object2))).id_case())) continue;
                ((Map)this.id_class[id_catch[6]]).put(((ryO_2)object2).id_char(), object);
            }
            if (!((Map)this.id_class[id_catch[7]]).isEmpty()) {
                iterator = ((Map)this.id_class[id_catch[8]]).entrySet().iterator();
                while (iterator.hasNext()) {
                    entry2 = iterator.next();
                    object2 = (rrlK_2)entry2.getValue();
                    object3 = ((rrlK_2)object2).id_case();
                    if (!this.id_class((rfH_2)object3)) {
                        if (((rrlK_2)object2).equals(this.id_int())) {
                            this.id_new();
                        }
                        iterator.remove();
                        continue;
                    }
                    if (this.id_class(ps_1, ((rrlK_2)object2).id_case())) continue;
                    iterator.remove();
                }
            }
            iterator = ((Map)this.id_class[id_catch[9]]).values();
            this.id_class(this.id_class((Collection<rrlK_2>)((Object)iterator)));
            entry2 = this.id_int();
            ((rrTT)this.id_class[id_catch[10]]).id_final();
            Boolean bl = id_break[1];
            this.id_class[rrlo_3.id_catch[11]] = bl;
            if (entry2 != null && ps_1 != null) {
                object2 = PJ.id_class(ps_1, ((rrlK_2)((Object)entry2)).id_case(), xc_32 -> xc_32.id_break() == xu_3.re ? id_break[33] : id_break[34]);
                ((Optional)object2).ifPresent(px_1 -> {
                    this.id_try();
                    ((rrTT)this.id_class[id_catch[62]]).id_class(px_1::id_class, (rrTI)((Object)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_catch[63]])));
                });
                Boolean bl2 = id_break[2];
                this.id_class[rrlo_3.id_catch[12]] = bl2;
                Object object4 = (vm_3)rrlo_3.id_import.id_class[id_catch[13]];
                if (object4 instanceof Fc_1) {
                    object3 = (Fc_1)object4;
                    ((rqr_3)((cb_3)rrlo_3.id_import.id_class[rrlo_3.id_catch[14]]).id_break[rrlo_3.id_catch[15]]).id_finally = id_break[3];
                    object4 = ((Fu_1)object3).G_();
                    List<rJY> list = ((rJr_1)object4).id_class((rJY rJY2) -> {
                        if (!rJY2.id_break()) {
                            return id_break[30];
                        }
                        if (rJY2.id_protected < id_protected[0] || rJY2.id_protected > id_protected[1]) {
                            return id_break[31];
                        }
                        return id_break[32];
                    });
                    for (rJY rJY3 : list) {
                        ((Ax_1)rrlo_3.id_import.id_class[id_catch[16]]).id_class(((rJr_1)object4).id_case, rJY3.id_protected, id_break[4], rXa_1.QUICK_MOVE, id_break[5]);
                    }
                    rrlo_3 rrlo_32 = this;
                    int n = (Integer)rrlo_32.id_class[id_catch[17]] + id_break[6];
                    Integer n2 = n;
                    rrlo_32.id_class[rrlo_3.id_catch[18]] = n2;
                    if (n > id_break[7] && iterator.size() > id_break[8] && list.isEmpty()) {
                        this.id_new();
                        Integer n3 = id_break[9];
                        this.id_class[rrlo_3.id_catch[19]] = n3;
                    }
                } else if (!((rrlK_2)((Object)entry2)).id_byte() && !((cb_3)rrlo_3.id_import.id_class[id_catch[20]]).sL() && ((Optional)object2).isPresent() && (object4 = ((Optional)object2).get().id_break()) instanceof rff_3 && this.id_class(((rff_3)(object = (rff_3)object4)).id_class())) {
                    boolean bl3 = ((cb_3)rrlo_3.id_import.id_class[id_catch[21]]).id_boolean();
                    if (bl3) {
                        ((rqr_3)((cb_3)rrlo_3.id_import.id_class[rrlo_3.id_catch[22]]).id_break[rrlo_3.id_catch[23]]).id_implements = id_break[10];
                        ((Aq_1)((cb_3)rrlo_3.id_import.id_class[rrlo_3.id_catch[24]]).id_break[id_catch[25]]).id_class(new rmD_2((cb_3)rrlo_3.id_import.id_class[id_catch[26]], rmU_2.RELEASE_SHIFT_KEY));
                    }
                    rpm_3[] rpm_3Array = rpm_3.values();
                    int n = rpm_3Array.length;
                    for (int i = id_break[11]; i < n; ++i) {
                        rpm_3 rpm_32 = rpm_3Array[i];
                        if (rpm_32 == rpm_3.MAIN_HAND && ((cb_3)rrlo_3.id_import.id_class[id_catch[27]]).id_protected(rpm_32).id_continue().id_byte().contains(id_byte[0])) continue;
                        ryZ_2 ryZ_22 = ((Ax_1)rrlo_3.id_import.id_class[id_catch[28]]).id_class((cb_3)rrlo_3.id_import.id_class[id_catch[29]], (gm_3)rrlo_3.id_import.id_class[id_catch[30]], rpm_32, (rff_3)object);
                        if (ryZ_22.id_class()) {
                            if (!ryZ_22.id_break()) break;
                            ((cb_3)rrlo_3.id_import.id_class[id_catch[31]]).id_class(rpm_32, id_break[12]);
                            break;
                        }
                        if (ryZ_22 == ryZ_2.FAIL) break;
                    }
                    ((rrlK_2)((Object)entry2)).id_class(rqR_2.id_break());
                    ((rrlK_2)((Object)entry2)).id_class(id_break[13]);
                    if (bl3) {
                        ((rqr_3)((cb_3)rrlo_3.id_import.id_class[rrlo_3.id_catch[32]]).id_break[rrlo_3.id_catch[33]]).id_implements = id_break[14];
                        ((Aq_1)((cb_3)rrlo_3.id_import.id_class[rrlo_3.id_catch[34]]).id_break[id_catch[35]]).id_class(new rmD_2((cb_3)rrlo_3.id_import.id_class[id_catch[36]], rmU_2.PRESS_SHIFT_KEY));
                    }
                }
            }
        }
    }

    @EventTarget
    public void id_class(RenderEvent renderEvent) {
        this.id_try();
        Ml_1 ml_1 = renderEvent.id_class();
        for (rrlK_2 rrlK_22 : ((Map)this.id_class[id_catch[37]]).values()) {
            rfH_2 rfH_22 = rrlK_22.id_case();
            rfl_3 rfl_32 = rrjc_3.id_class(rrlK_22.id_class(), rfH_22).id_protected(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
            if (!((yX_2)rrlo_3.id_import.id_class[id_catch[38]]).id_static().id_class(rfl_32)) continue;
            double d = id_void.id_case();
            double d2 = id_void.id_catch();
            double d3 = id_void.id_private();
            ml_1.id_class();
            GL11.glEnable((int)id_catch[39]);
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableBlend();
            RenderSystem.lineWidth(id_case[0]);
            RenderSystem.disableTexture();
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(id_break[15]);
            id_strictfp.id_class(id_break[16], ju_3.id_this);
            rrfD_2.id_class(ml_1, rfl_32.id_protected(-d, -d2, -d3), rrlK_22 == (rrlK_2)this.id_class[id_catch[40]] ? Color.RED.getRGB() : Color.YELLOW.getRGB());
            id_default.id_break();
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(id_break[17]);
            RenderSystem.disableBlend();
            GL11.glDisable((int)id_catch[41]);
            ml_1.id_break();
        }
    }

    @EventTarget
    public void id_class(rrFo_1 rrFo_12) {
        rrlK_2 rrlK_22 = this.id_int();
        if (rrlK_22 != null) {
            rrlK_22.id_class(id_break[18]);
        }
    }

    private boolean id_class(Ps_1 ps_1, rfH_2 rfH_22) {
        if (ps_1 == null) {
            return id_break[21];
        }
        return PJ.id_class(ps_1, rfH_22, xc_32 -> xc_32.id_break() == xu_3.re ? id_break[28] : id_break[29]).isPresent();
    }

    public void id_class(rrlK_2 rrlK_22) {
        this.id_try();
        if (rrlK_22 == null && (rrlK_2)this.id_class[id_catch[47]] != null) {
            ((rrTT)this.id_class[id_catch[48]]).id_finally();
        }
        rrlK_2 rrlK_23 = rrlK_22;
        this.id_class[rrlo_3.id_catch[49]] = rrlK_23;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-8, 123, -89, -37, 17, -94, 62, 108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public float id_break() {
        return id_case[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrlo_3.id_this();
        rrlo_3.id_synchronized();
        rrlo_3.id_goto();
        rrlo_3.id_else();
        rrlo_3.id_return();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_catch[56]]);
    }

    private static void id_goto() {
        short[] sArray = new short[64];
        sArray[1] = 2;
        sArray[4] = 56;
        sArray[5] = 2;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[11] = 3;
        sArray[12] = 3;
        sArray[13] = 73;
        sArray[14] = 57;
        sArray[15] = 17;
        sArray[16] = 55;
        sArray[17] = 4;
        sArray[18] = 4;
        sArray[19] = 4;
        sArray[20] = 57;
        sArray[21] = 57;
        sArray[22] = 57;
        sArray[23] = 17;
        sArray[24] = 57;
        sArray[26] = 57;
        sArray[27] = 57;
        sArray[28] = 55;
        sArray[29] = 57;
        sArray[30] = 56;
        sArray[31] = 57;
        sArray[32] = 57;
        sArray[33] = 17;
        sArray[34] = 57;
        sArray[36] = 57;
        sArray[37] = 2;
        sArray[38] = 8;
        sArray[39] = 2848;
        sArray[40] = 1;
        sArray[41] = 2848;
        sArray[42] = 56;
        sArray[43] = 3;
        sArray[44] = 73;
        sArray[45] = 57;
        sArray[46] = 3;
        sArray[47] = 1;
        sArray[49] = 1;
        sArray[50] = 3;
        sArray[51] = 2;
        sArray[53] = 19;
        sArray[55] = 3000;
        sArray[57] = 1;
        sArray[58] = 2;
        sArray[59] = 3;
        sArray[60] = 57;
        sArray[61] = 57;
        id_catch = sArray;
    }

    private static void id_else() {
        id_case = new float[]{1.5f, -1.0f, -1.0f};
    }

    private void id_new() {
        this.id_try();
        if (((Boolean)this.id_class[id_catch[43]]).booleanValue()) {
            if ((vm_3)rrlo_3.id_import.id_class[id_catch[44]] != null) {
                ((cb_3)rrlo_3.id_import.id_class[id_catch[45]]).id_strictfp();
            }
            this.id_class((rrlK_2)null);
            Boolean bl = id_break[24];
            this.id_class[rrlo_3.id_catch[46]] = bl;
        }
    }

    public boolean id_package() {
        this.id_try();
        return (Boolean)this.id_class[id_catch[59]];
    }

    private static void id_return() {
        id_protected = new byte[]{9, 35, 5, 3, 4};
    }

    private void id_try() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
            this.id_class[3] = false;
            this.id_class[4] = 0;
        }
    }

    private void id_while() {
        this.id_try();
        this.id_class((rrlK_2)null);
        Boolean bl = id_break[25];
        this.id_class[rrlo_3.id_catch[50]] = bl;
        ((Map)this.id_class[id_catch[51]]).clear();
        ((rrTT)this.id_class[id_catch[52]]).id_final();
    }

    private boolean id_public() {
        return ((cq_3)rrlo_3.id_import.id_class[id_catch[53]]).id_extends().id_class(id_byte[1]);
    }

    @Override
    public float id_private() {
        return id_case[2];
    }

    public Map<rfH_2, rrlK_2> id_final() {
        this.id_try();
        return (Map)this.id_class[id_catch[58]];
    }

    private static void id_synchronized() {
        id_byte = new String[]{new String("[\u2744]"), new String("\u042d\u043a\u0441\u043f\u0440\u0435\u0441\u0441 - "), new String("\u0420\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u0442\u043e\u043b\u044c\u043a\u043e \u043d\u0430 \u0441\u043e\u0431\u044b\u0442\u0438\u0438 \"\u041d\u043e\u0432\u043e\u0433\u043e\u0434\u043d\u0438\u0439 \u042d\u043a\u0441\u043f\u0440\u0435\u0441\u0441\"")};
    }

    @Override
    public boolean aI_() {
        if (!this.id_public()) {
            String string = id_byte[2];
            rrfu_3.id_byte(rrfu_3.id_class((Module)this.id_continue()) + string);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[54]]).id_class(new rrtx_3(((ChestStealer)this.id_continue()).id_final(), string, (int)id_catch[55]));
            ((ChestStealer)this.id_continue()).id_byte(id_break[26]);
            return id_break[27];
        }
        return super.aI_();
    }

    @Override
    public boolean aK_() {
        this.id_while();
        return super.aK_();
    }
}

