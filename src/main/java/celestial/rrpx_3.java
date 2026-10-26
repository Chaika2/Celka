/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.FtHelper;
import celestial.q_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rmD_2;
import celestial.rmU_2;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rrIF;
import celestial.rrLB;
import celestial.rrLu_1;
import celestial.rrfP_2;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrfx_3;
import celestial.rrpd_3;
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

public class rrpx_3
extends rrpu_3 {
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_case;
    private static long[] id_catch;
    private static float[] id_private;
    public Object[] id_class;

    @Override
    public rdn_3 id_byte() {
        return ((rrfx_3)((Object)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_protected[41]])).id_break().id_class();
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEC568F40;
    }

    public rrpx_3(FtHelper ftHelper) {
        super(ftHelper);
        this.id_finally();
        rrIF rrIF2 = new rrIF(id_break[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_protected[0]]);
        this.id_class[rrpx_3.id_protected[1]] = rrIF2;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rrpx_3.id_protected[2]] = rrfP_22;
        Integer n = id_case[0];
        this.id_class[rrpx_3.id_protected[3]] = n;
        Setting[] settingArray = new Setting[id_byte[0]];
        settingArray[rrpx_3.id_byte[1]] = (rrIF)this.id_class[id_protected[4]];
        ftHelper.id_class(new GroupSetting(id_break[1], settingArray));
    }

    static {
        rrpx_3.ntfClinit();
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_finally();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[8]])) {
            ((rrfP_2)this.id_class[id_protected[9]]).id_class(rqR_2.id_break() - (Long)this.id_class[id_protected[10]] > id_catch[0] ? id_byte[3] : id_byte[4]);
            if (((Boolean)this.id_class[id_protected[11]]).booleanValue()) {
                int n;
                FtHelper ftHelper = (FtHelper)this.id_continue();
                int n2 = this.id_extends();
                rrpd_3 rrpd_32 = this.id_break(n2);
                if (rrpd_32 == (rrpd_3)((Object)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[12]])) {
                    int n3 = ((cb_3)rrpx_3.id_import.id_class[id_protected[13]]).sK().id_protected(rdy_3.OW);
                    float f = (float)n3 / id_private[0];
                    rrfu_3.id_class(ftHelper, id_break[2], f);
                } else if (rrpd_32 == (rrpd_3)((Object)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[14]]) && (n = this.id_class(n2)) > id_case[1]) {
                    Integer n4 = n;
                    this.id_class[rrpx_3.id_protected[15]] = n4;
                    Integer n5 = id_byte[5];
                    this.id_class[rrpx_3.id_protected[16]] = n5;
                }
                Boolean bl = id_byte[6];
                this.id_class[rrpx_3.id_protected[17]] = bl;
            }
            if ((Integer)this.id_class[id_protected[18]] != id_case[2]) {
                byte by = ((cb_3)rrpx_3.id_import.id_class[id_protected[19]]).sV() || ((cb_3)rrpx_3.id_import.id_class[id_protected[20]]).sZ() ? id_byte[7] : id_case[3];
                rrpx_3 rrpx_32 = this;
                int n = (Integer)rrpx_32.id_class[id_protected[21]] + id_byte[8];
                Integer n6 = n;
                rrpx_32.id_class[rrpx_3.id_protected[22]] = n6;
                if (n > by) {
                    ((Ax_1)rrpx_3.id_import.id_class[id_protected[23]]).id_class((Integer)this.id_class[id_protected[24]]);
                    Integer n7 = id_case[4];
                    this.id_class[rrpx_3.id_protected[25]] = n7;
                    Integer n8 = id_byte[9];
                    this.id_class[rrpx_3.id_protected[26]] = n8;
                }
            }
        }
    }

    private void id_class(rpm_3 rpm_32) {
        boolean bl = ((cb_3)rrpx_3.id_import.id_class[id_protected[47]]).id_boolean();
        if (bl) {
            ((Aq_1)((cb_3)rrpx_3.id_import.id_class[rrpx_3.id_protected[48]]).id_break[id_protected[49]]).id_break(new rmD_2((cb_3)rrpx_3.id_import.id_class[id_protected[50]], rmU_2.RELEASE_SHIFT_KEY));
        }
        rrfo_3.id_class(rpm_32);
        if (bl) {
            ((Aq_1)((cb_3)rrpx_3.id_import.id_class[rrpx_3.id_protected[51]]).id_break[id_protected[52]]).id_break(new rmD_2((cb_3)rrpx_3.id_import.id_class[id_protected[53]], rmU_2.PRESS_SHIFT_KEY));
        }
    }

    private int id_class(int n) {
        this.id_finally();
        if (n == id_case[7]) {
            this.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_case[8]) {
            this.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_case[9]) {
            rrfo_3.id_class(n);
            this.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rrpx_3.id_import.id_class[rrpx_3.id_protected[34]]).id_implements[rrpx_3.id_protected[35]]).id_protected);
            return n;
        }
        if (n >= id_case[10] && n <= id_case[11]) {
            ((rrfP_2)this.id_class[id_protected[36]]).id_class(((rhz_3)((cb_3)rrpx_3.id_import.id_class[rrpx_3.id_protected[37]]).id_implements[rrpx_3.id_protected[38]]).id_protected);
            ((Ax_1)rrpx_3.id_import.id_class[id_protected[39]]).id_class(n);
            this.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_class[rrpx_3.id_protected[40]] = l;
            return n;
        }
        return id_case[12];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2E79CA4B5F987E95L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{42, 20, 116, -54, -88, -4, -98, 29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_finally();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_protected[5]]).id_finally().id_byte()) {
            Boolean bl = id_byte[2];
            this.id_class[rrpx_3.id_protected[6]] = bl;
        }
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_finally();
        ((rrfP_2)this.id_class[id_protected[7]]).id_class(rrLu_12);
    }

    private rrpd_3 id_break(int n) {
        if (n == id_case[6]) {
            return (rrpd_3)((Object)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[30]]);
        }
        if (((cb_3)rrpx_3.id_import.id_class[id_protected[31]]).sK().id_class(rdy_3.OW)) {
            return (rrpd_3)((Object)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[32]]);
        }
        return (rrpd_3)((Object)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[33]]);
    }

    private static void id_break() {
        id_case = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
    }

    @Override
    public rrIF id_throws() {
        this.id_finally();
        return (rrIF)this.id_class[id_protected[42]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrpx_3.id_implements();
        rrpx_3.id_native();
        rrpx_3.id_final();
        rrpx_3.id_case();
        rrpx_3.id_private();
        rrpx_3.id_break();
    }

    private void id_finally() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[2] = false;
            this.id_class[3] = 0L;
            this.id_class[4] = 0;
            this.id_class[5] = 0;
        }
    }

    private int id_extends() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_case[13];
        }
        if (predicate.test(((cb_3)rrpx_3.id_import.id_class[id_protected[43]]).ss())) {
            return id_case[14];
        }
        if (predicate.test(((cb_3)rrpx_3.id_import.id_class[id_protected[44]]).Sn())) {
            return id_case[15];
        }
        for (int i = id_byte[12]; i < id_case[16]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpx_3.id_import.id_class[rrpx_3.id_protected[45]]).id_implements[id_protected[46]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_case[17];
    }

    private static void id_case() {
        short[] sArray = new short[54];
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
        sArray[34] = 57;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[37] = 57;
        sArray[38] = 1;
        sArray[39] = 55;
        sArray[40] = 3;
        sArray[41] = 5;
        sArray[43] = 57;
        sArray[44] = 57;
        sArray[45] = 57;
        sArray[46] = 1;
        sArray[47] = 57;
        sArray[48] = 57;
        sArray[50] = 57;
        sArray[51] = 57;
        sArray[53] = 57;
        id_protected = sArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[20];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[8] = true;
        blArray[14] = true;
        blArray[15] = true;
        id_byte = blArray;
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.OW) {
                return id_byte[13];
            }
            String string = rdn_32.id_continue().id_byte();
            if (string.equalsIgnoreCase(id_break[3]) || string.equalsIgnoreCase(id_break[4])) {
                return id_byte[14];
            }
            if (rdn_32.id_protected(id_break[5]) || rdn_32.id_protected(id_break[6]) || rdn_32.id_protected(id_break[7])) {
                return id_byte[15];
            }
            return id_byte[16];
        };
    }

    private static void id_private() {
        id_private = new float[]{20.0f};
    }

    private static void id_final() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_catch = lArray;
    }

    private static void id_native() {
        id_break = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0422\u0440\u0430\u043f\u043a\u0430"), new String("\u0442\u0440\u0430\u043f\u043a\u0438"), new String("[\u2605] \u0422\u0440\u0430\u043f\u043a\u0430"), new String("[\u2605] \u041d\u043e\u0432\u043e\u0433\u043e\u0434\u043d\u044f\u044f \u043b\u043e\u0432\u0443\u0448\u043a\u0430"), new String("trap"), new String("christmastrap"), new String("spooky-item")};
    }

    @Override
    public boolean aK_() {
        this.id_finally();
        Boolean bl = id_byte[10];
        this.id_class[rrpx_3.id_protected[27]] = bl;
        Integer n = id_case[5];
        this.id_class[rrpx_3.id_protected[28]] = n;
        Integer n2 = id_byte[11];
        this.id_class[rrpx_3.id_protected[29]] = n2;
        return super.aK_();
    }
}

