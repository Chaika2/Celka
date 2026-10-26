/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.FtHelper;
import celestial.q_1;
import celestial.rAB;
import celestial.rLD;
import celestial.rLR;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rrIF;
import celestial.rrLB;
import celestial.rrLu_1;
import celestial.rrfP_2;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrfx_3;
import celestial.rrpP_2;
import celestial.rrpu_3;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpr_3
extends rrpu_3 {
    private static long[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static float[] id_protected;
    private static String[] id_case;
    private static byte[] id_catch;
    private static short[] id_private;

    @Override
    public rdn_3 id_byte() {
        return ((rrfx_3)((Object)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_private[34]])).id_break().id_class();
    }

    private rrpP_2 id_byte(int n) {
        if (n == id_catch[6]) {
            return (rrpP_2)((Object)rrpP_2.staticFieldsc884105b69f333058e091d3dfd5ffa8a[id_private[30]]);
        }
        if (((cb_3)rrpr_3.id_import.id_class[id_private[31]]).sK().id_class(rdy_3.kk)) {
            return (rrpP_2)((Object)rrpP_2.staticFieldsc884105b69f333058e091d3dfd5ffa8a[id_private[32]]);
        }
        return (rrpP_2)((Object)rrpP_2.staticFieldsc884105b69f333058e091d3dfd5ffa8a[id_private[33]]);
    }

    public rrpr_3(FtHelper ftHelper) {
        super(ftHelper);
        this.id_extends();
        rrIF rrIF2 = new rrIF(id_case[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_private[0]]);
        this.id_class[rrpr_3.id_private[1]] = rrIF2;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rrpr_3.id_private[2]] = rrfP_22;
        Integer n = id_catch[0];
        this.id_class[rrpr_3.id_private[3]] = n;
        Setting[] settingArray = new Setting[id_byte[0]];
        settingArray[rrpr_3.id_byte[1]] = (rrIF)this.id_class[id_private[4]];
        ftHelper.id_class(new GroupSetting(id_case[1], settingArray));
    }

    static {
        rrpr_3.ntfClinit();
    }

    private int id_class(int n) {
        this.id_extends();
        if (n == id_catch[7]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_catch[8]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_catch[9]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rrpr_3.id_import.id_class[rrpr_3.id_private[36]]).id_implements[rrpr_3.id_private[37]]).id_protected);
            return n;
        }
        if (n >= id_catch[10] && n <= id_catch[11]) {
            ((rrfP_2)this.id_class[id_private[38]]).id_class(((rhz_3)((cb_3)rrpr_3.id_import.id_class[rrpr_3.id_private[39]]).id_implements[rrpr_3.id_private[40]]).id_protected);
            ((Ax_1)rrpr_3.id_import.id_class[id_private[41]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_class[rrpr_3.id_private[42]] = l;
            return n;
        }
        return id_catch[12];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-99, 14, -12, -89, -26, 72, 25, 110}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_extends();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_private[5]]).id_finally().id_byte()) {
            Boolean bl = id_byte[2];
            this.id_class[rrpr_3.id_private[6]] = bl;
        }
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_extends();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[8]])) {
            ((rrfP_2)this.id_class[id_private[9]]).id_class(rqR_2.id_break() - (Long)this.id_class[id_private[10]] > id_break[0] ? id_byte[3] : id_byte[4]);
            if (((Boolean)this.id_class[id_private[11]]).booleanValue()) {
                int n;
                FtHelper ftHelper = (FtHelper)this.id_continue();
                int n2 = this.id_native();
                rrpP_2 rrpP_22 = this.id_byte(n2);
                if (rrpP_22 == (rrpP_2)((Object)rrpP_2.staticFieldsc884105b69f333058e091d3dfd5ffa8a[id_private[12]])) {
                    int n3 = ((cb_3)rrpr_3.id_import.id_class[id_private[13]]).sK().id_protected(rdy_3.kk);
                    float f = (float)n3 / id_protected[0];
                    rrfu_3.id_class(ftHelper, id_case[2], f);
                } else if (rrpP_22 == (rrpP_2)((Object)rrpP_2.staticFieldsc884105b69f333058e091d3dfd5ffa8a[id_private[14]]) && (n = this.id_class(n2)) > id_catch[1]) {
                    Integer n4 = n;
                    this.id_class[rrpr_3.id_private[15]] = n4;
                    Integer n5 = id_byte[5];
                    this.id_class[rrpr_3.id_private[16]] = n5;
                }
                Boolean bl = id_byte[6];
                this.id_class[rrpr_3.id_private[17]] = bl;
            }
            if ((Integer)this.id_class[id_private[18]] != id_catch[2]) {
                byte by = ((cb_3)rrpr_3.id_import.id_class[id_private[19]]).sV() || ((cb_3)rrpr_3.id_import.id_class[id_private[20]]).sZ() ? id_byte[7] : id_catch[3];
                rrpr_3 rrpr_32 = this;
                int n = (Integer)rrpr_32.id_class[id_private[21]] + id_byte[8];
                Integer n6 = n;
                rrpr_32.id_class[rrpr_3.id_private[22]] = n6;
                if (n > by) {
                    ((Ax_1)rrpr_3.id_import.id_class[id_private[23]]).id_class((Integer)this.id_class[id_private[24]]);
                    Integer n7 = id_catch[4];
                    this.id_class[rrpr_3.id_private[25]] = n7;
                    Integer n8 = id_byte[9];
                    this.id_class[rrpr_3.id_private[26]] = n8;
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_extends();
        ((rrfP_2)this.id_class[id_private[7]]).id_class(rrLu_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9CBA9C1F1D443260L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x31D7AAF5;
    }

    private static void id_break() {
        id_protected = new float[]{20.0f};
    }

    @Override
    public rrIF id_throws() {
        this.id_extends();
        return (rrIF)this.id_class[id_private[35]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrpr_3.id_finally();
        rrpr_3.id_final();
        rrpr_3.id_implements();
        rrpr_3.id_private();
        rrpr_3.id_break();
        rrpr_3.id_case();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[8] = true;
        blArray[14] = true;
        id_byte = blArray;
    }

    private void id_extends() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[2] = false;
            this.id_class[3] = 0L;
            this.id_class[4] = 0;
            this.id_class[5] = 0;
        }
    }

    private static void id_case() {
        id_catch = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
    }

    private static void id_implements() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_break = lArray;
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.kk) {
                return id_byte[13];
            }
            rLR[] rLRArray = new rLR[id_byte[14]];
            rLRArray[rrpr_3.id_byte[15]] = rLD.id_private;
            return rAB.id_class(rdn_32, rLRArray);
        };
    }

    private static void id_private() {
        short[] sArray = new short[47];
        sArray[2] = 1;
        sArray[3] = 4;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[10] = 3;
        sArray[11] = 2;
        sArray[12] = 2;
        sArray[13] = 57;
        sArray[15] = 4;
        sArray[16] = 5;
        sArray[17] = 2;
        sArray[18] = 4;
        sArray[19] = 57;
        sArray[20] = 57;
        sArray[21] = 5;
        sArray[22] = 5;
        sArray[23] = 55;
        sArray[24] = 4;
        sArray[25] = 4;
        sArray[26] = 5;
        sArray[27] = 2;
        sArray[28] = 4;
        sArray[29] = 5;
        sArray[30] = 1;
        sArray[31] = 57;
        sArray[32] = 2;
        sArray[34] = 40;
        sArray[36] = 57;
        sArray[37] = 1;
        sArray[38] = 1;
        sArray[39] = 57;
        sArray[40] = 1;
        sArray[41] = 55;
        sArray[42] = 3;
        sArray[43] = 57;
        sArray[44] = 57;
        sArray[45] = 57;
        sArray[46] = 1;
        id_private = sArray;
    }

    private static void id_final() {
        id_case = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0417\u0435\u043b\u044c\u0435 \u043f\u0440\u044b\u0433\u0443\u0447\u0435\u0441\u0442\u0438"), new String("\u0437\u0435\u043b\u044c\u044f \u043f\u0440\u044b\u0433\u0443\u0447\u0435\u0441\u0442\u0438")};
    }

    private int id_native() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_catch[13];
        }
        if (predicate.test(((cb_3)rrpr_3.id_import.id_class[id_private[43]]).ss())) {
            return id_catch[14];
        }
        if (predicate.test(((cb_3)rrpr_3.id_import.id_class[id_private[44]]).Sn())) {
            return id_catch[15];
        }
        for (int i = id_byte[12]; i < id_catch[16]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpr_3.id_import.id_class[rrpr_3.id_private[45]]).id_implements[id_private[46]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_catch[17];
    }

    @Override
    public boolean aK_() {
        this.id_extends();
        Boolean bl = id_byte[10];
        this.id_class[rrpr_3.id_private[27]] = bl;
        Integer n = id_catch[5];
        this.id_class[rrpr_3.id_private[28]] = n;
        Integer n2 = id_byte[11];
        this.id_class[rrpr_3.id_private[29]] = n2;
        return super.aK_();
    }
}

