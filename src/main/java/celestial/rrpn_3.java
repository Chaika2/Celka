/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.Fc_1;
import celestial.Y;
import celestial.cb_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.module.util.GriefJoiner;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rXe_1;
import celestial.rZd_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rpm_3;
import celestial.rqs_3;
import celestial.rrAl_1;
import celestial.rrFY;
import celestial.rrfY_2;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrpC_2;
import celestial.rrpl_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.util.MinecraftAccessor;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpn_3
extends rrpl_3 {
    private static float[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static String[] id_case;
    private static short[] id_catch;

    private boolean id_byte() {
        rgP_2 rgP_22 = ((cq_3)rrpn_3.id_import.id_class[id_catch[23]]).id_implements().id_protected();
        return rgP_22 != null && rgP_22.id_byte().contains(id_case[7]) ? id_protected[8] : id_protected[9];
    }

    public rrpn_3(GriefJoiner griefJoiner) {
        super(griefJoiner);
        this.id_throws();
    }

    static {
        rrpn_3.ntfClinit();
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_throws();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[0]])) {
            GriefJoiner griefJoiner;
            String string;
            if ((rrpC_2)((Object)this.id_class[id_catch[1]]) != (rrpC_2)((Object)rrpC_2.staticFields58cea7ed1d8d31da9b1cc2bca3fc3669[id_catch[2]])) {
                return;
            }
            if (((Boolean)this.id_class[id_catch[3]]).booleanValue() && (Integer)((cb_3)rrpn_3.id_import.id_class[rrpn_3.id_catch[4]]).id_throws[id_catch[5]] % id_byte[0] == 0) {
                Boolean bl = id_protected[0];
                this.id_class[rrpn_3.id_catch[6]] = bl;
            }
            boolean bl = (string = (griefJoiner = (GriefJoiner)this.id_continue()).id_new()).equalsIgnoreCase(id_case[0]) || string.equalsIgnoreCase(id_case[1]) ? id_protected[1] : id_protected[2];
            Object object = (vm_3)rrpn_3.id_import.id_class[id_catch[7]];
            if (object instanceof Fc_1) {
                rdn_3 rdn_32;
                Fc_1 fc_1 = (Fc_1)object;
                object = fc_1.id_new().id_byte().toLowerCase();
                rqs_3<rdn_3> rqs_32 = ((rXe_1)fc_1.G_()).id_extends();
                if (bl) {
                    rdn_3 rdn_33 = this.id_break(rqs_32);
                    if (rdn_33 != null) {
                        this.id_class(rqs_32, rdn_33);
                    }
                    return;
                }
                if (((String)object).contains(id_case[2])) {
                    rdn_3 rdn_34 = this.id_class(rqs_32);
                    if (rdn_34 != null) {
                        this.id_class(rqs_32, rdn_34);
                    }
                    return;
                }
                if (((String)object).contains(id_case[3]) && (rdn_32 = this.id_class(string, rqs_32)) != null) {
                    this.id_class(rqs_32, rdn_32);
                }
            } else if (!((Boolean)this.id_class[id_catch[8]]).booleanValue()) {
                this.id_private();
                Boolean bl2 = id_protected[3];
                this.id_class[rrpn_3.id_catch[9]] = bl2;
            }
        }
    }

    private rdn_3 id_class(rqs_3<rdn_3> rqs_32) {
        for (rdn_3 rdn_32 : rqs_32) {
            String string = rdn_32.id_continue().id_byte().toLowerCase();
            if (!string.contains(id_case[9])) continue;
            return rdn_32;
        }
        return null;
    }

    @EventTarget
    public void id_class(rrFY rrFY2) {
        String string;
        vm_3 vm_32 = rrFY2.id_class();
        if (vm_32 instanceof Fc_1 && ((string = vm_32.id_new().id_byte().toLowerCase()).contains(id_case[4]) || string.contains(id_case[5]))) {
            ((GriefJoiner)this.id_continue()).id_byte(id_protected[4]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBA9CD3FD847D7A4DL;
    }

    private void id_class(rqs_3<rdn_3> rqs_32, rdn_3 rdn_32) {
        ((Ax_1)rrpn_3.id_import.id_class[id_catch[24]]).id_class(((rJr_1)((cb_3)rrpn_3.id_import.id_class[rrpn_3.id_catch[25]]).id_implements[rrpn_3.id_catch[26]]).id_case, rqs_32.indexOf(rdn_32), id_protected[10], rXa_1.PICKUP);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A8895CE;
    }

    @Override
    public void id_class() {
        this.id_throws();
        GriefJoiner griefJoiner = (GriefJoiner)this.id_continue();
        if (!this.id_byte()) {
            griefJoiner.id_byte(id_protected[7]);
            String string = id_case[6];
            rrfu_3.id_byte(rrfu_3.id_class(griefJoiner) + string);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[18]]).id_class(new rrtx_3(griefJoiner.id_final(), string, (int)id_catch[19]));
            return;
        }
        rrpC_2 rrpC_22 = (rrpC_2)((Object)rrpC_2.staticFields58cea7ed1d8d31da9b1cc2bca3fc3669[id_catch[20]]);
        this.id_class[rrpn_3.id_catch[21]] = rrpC_22;
    }

    @EventTarget
    public void id_class(rrAl_1 rrAl_12) {
        if (rrAl_12.id_class() > id_break[0]) {
            GriefJoiner griefJoiner = (GriefJoiner)this.id_continue();
            griefJoiner.id_byte(id_protected[5]);
            String string = "\u0412\u044b \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0437\u0430\u0448\u043b\u0438 \u043d\u0430 " + griefJoiner.id_new() + " \u0433\u0440\u0438\u0444";
            String string2 = rrfu_3.id_class(griefJoiner) + string;
            rrfu_3.id_byte(string2);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[16]]).id_class(new rrtQ_2(griefJoiner.id_final(), string, (int)id_catch[17]));
            MinecraftAccessor.a_(string2, id_protected[6]);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{86, 32, 43, 51, 84, 21, -73, 49}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private rdn_3 id_class(String string, List<rdn_3> list) {
        try {
            int n = Integer.parseInt(string);
            for (rdn_3 rdn_32 : list) {
                if (rdn_32.id_class() || !rdn_32.id_continue().id_byte().contains("#" + n)) continue;
                return rdn_32;
            }
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return null;
    }

    private static void id_break() {
        id_byte = new byte[]{25, -1, -2, -3, 2};
    }

    private rdn_3 id_break(rqs_3<rdn_3> rqs_32) {
        for (rdn_3 rdn_32 : rqs_32) {
            String string = rdn_32.id_continue().id_byte().toLowerCase();
            if (!string.contains(id_case[8])) continue;
            return rdn_32;
        }
        return null;
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = false;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrpn_3.id_implements();
        rrpn_3.id_finally();
        rrpn_3.id_protected();
        rrpn_3.id_case();
        rrpn_3.id_break();
    }

    private static void id_finally() {
        id_case = new String[]{new String("mega"), new String("\u043c\u0435\u0433\u0430"), new String("\u0432\u044b\u0431\u043e\u0440 \u0441\u0435\u0440\u0432\u0435\u0440\u0430"), new String("\u0432\u044b\u0431\u043e\u0440 \u043c\u0438\u0440\u0430 \u0433\u0440\u0438\u0444\u0430"), new String("\u0432\u044b\u0431\u043e\u0440 \u0441\u0435\u0440\u0432\u0435\u0440\u0430"), new String("\u0432\u044b\u0431\u043e\u0440 \u043c\u0438\u0440\u0430 \u0433\u0440\u0438\u0444\u0430"), new String("\u0412\u044b \u043d\u0435 \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0435\u0441\u044c \u0432 \u0445\u0430\u0431\u0435"), new String("\u0412\u044b \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0435\u0441\u044c \u0432: Lobby"), new String("\u043c\u0435\u0433\u0430 \u0433\u0440\u0438\u0444"), new String("\u0433\u0440\u0438\u0444\u0435\u0440\u0441\u043a\u043e\u0435 \u0432\u044b\u0436\u0438\u0432\u0430\u043d\u0438\u0435")};
    }

    private static void id_case() {
        id_break = new float[]{10.0f};
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[13];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[27];
        sArray[3] = 1;
        sArray[4] = 57;
        sArray[5] = 41;
        sArray[6] = 1;
        sArray[7] = 73;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 57;
        sArray[12] = 57;
        sArray[14] = 57;
        sArray[17] = 2000;
        sArray[19] = 2000;
        sArray[23] = 19;
        sArray[24] = 55;
        sArray[25] = 57;
        sArray[26] = 4;
        id_catch = sArray;
    }

    private void id_private() {
        int n = rrfY_2.id_break(rdy_3.Xx);
        if (n == id_byte[1]) {
            return;
        }
        if (n == id_byte[2]) {
            ((Aq_1)((cb_3)rrpn_3.id_import.id_class[rrpn_3.id_catch[10]]).id_break[id_catch[11]]).id_class(new rZd_1(rpm_3.MAIN_HAND));
            return;
        }
        if (n == id_byte[3]) {
            ((Aq_1)((cb_3)rrpn_3.id_import.id_class[rrpn_3.id_catch[12]]).id_break[id_catch[13]]).id_class(new rZd_1(rpm_3.OFF_HAND));
            return;
        }
        rrfo_3.id_class(n);
        ((Aq_1)((cb_3)rrpn_3.id_import.id_class[rrpn_3.id_catch[14]]).id_break[id_catch[15]]).id_class(new rZd_1(rpm_3.MAIN_HAND));
    }

    @Override
    public boolean aK_() {
        this.id_throws();
        Object var5_1 = null;
        this.id_class[rrpn_3.id_catch[22]] = var5_1;
        return super.aK_();
    }
}

