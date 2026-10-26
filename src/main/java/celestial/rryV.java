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
import celestial.rLR;
import celestial.rLY;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rrIF;
import celestial.rrLB;
import celestial.rrLu_1;
import celestial.rrfO_2;
import celestial.rrfP_2;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrfx_3;
import celestial.rrpu_3;
import celestial.rryg_1;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryV
extends rrpu_3 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static String[] id_byte;
    private static long[] id_protected;
    private static short[] id_case;
    private static byte[] id_catch;
    private static float[] id_private;

    @Override
    public rdn_3 id_byte() {
        return ((rrfx_3)((Object)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_case[34]])).id_break().id_class();
    }

    private int id_byte(int n) {
        this.id_final();
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
            rrfo_3.id_class(((rhz_3)((cb_3)rryV.id_import.id_class[rryV.id_case[36]]).id_implements[rryV.id_case[37]]).id_protected);
            return n;
        }
        if (n >= id_catch[10] && n <= id_catch[11]) {
            ((rrfP_2)this.id_class[id_case[38]]).id_class(((rhz_3)((cb_3)rryV.id_import.id_class[rryV.id_case[39]]).id_implements[rryV.id_case[40]]).id_protected);
            ((Ax_1)rryV.id_import.id_class[id_case[41]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_class[rryV.id_case[42]] = l;
            return n;
        }
        return id_catch[12];
    }

    public rryV(FtHelper ftHelper) {
        super(ftHelper);
        this.id_final();
        rrIF rrIF2 = new rrIF(id_byte[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_case[0]]);
        this.id_class[rryV.id_case[1]] = rrIF2;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rryV.id_case[2]] = rrfP_22;
        Integer n = id_catch[0];
        this.id_class[rryV.id_case[3]] = n;
        Setting[] settingArray = new Setting[id_break[0]];
        settingArray[rryV.id_break[1]] = (rrIF)this.id_class[id_case[4]];
        ftHelper.id_class(new GroupSetting(id_byte[1], settingArray));
    }

    static {
        rryV.ntfClinit();
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_final();
        ((rrfP_2)this.id_class[id_case[7]]).id_class(rrLu_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE1BE684A8CBA8299L;
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_final();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_case[5]]).id_finally().id_byte()) {
            Boolean bl = id_break[2];
            this.id_class[rryV.id_case[6]] = bl;
        }
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_final();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[8]])) {
            ((rrfP_2)this.id_class[id_case[9]]).id_class(rqR_2.id_break() - (Long)this.id_class[id_case[10]] > id_protected[0] ? id_break[3] : id_break[4]);
            if (((Boolean)this.id_class[id_case[11]]).booleanValue()) {
                int n;
                FtHelper ftHelper = (FtHelper)this.id_continue();
                int n2 = this.id_finally();
                rryg_1 rryg_12 = this.id_break(n2);
                if (rryg_12 == (rryg_1)((Object)rryg_1.staticFields024e8373b551338f96ec40891e552616[id_case[12]])) {
                    int n3 = ((cb_3)rryV.id_import.id_class[id_case[13]]).sK().id_protected(rdy_3.kk);
                    float f = (float)n3 / id_private[0];
                    rrfu_3.id_class(ftHelper, id_byte[2], f);
                } else if (rryg_12 == (rryg_1)((Object)rryg_1.staticFields024e8373b551338f96ec40891e552616[id_case[14]]) && (n = this.id_byte(n2)) > id_catch[1]) {
                    Integer n4 = n;
                    this.id_class[rryV.id_case[15]] = n4;
                    Integer n5 = id_break[5];
                    this.id_class[rryV.id_case[16]] = n5;
                }
                Boolean bl = id_break[6];
                this.id_class[rryV.id_case[17]] = bl;
            }
            if ((Integer)this.id_class[id_case[18]] != id_catch[2]) {
                byte by = ((cb_3)rryV.id_import.id_class[id_case[19]]).sV() || ((cb_3)rryV.id_import.id_class[id_case[20]]).sZ() ? id_break[7] : id_catch[3];
                rryV rryV2 = this;
                int n = (Integer)rryV2.id_class[id_case[21]] + id_break[8];
                Integer n6 = n;
                rryV2.id_class[rryV.id_case[22]] = n6;
                if (n > by) {
                    ((Ax_1)rryV.id_import.id_class[id_case[23]]).id_class((Integer)this.id_class[id_case[24]]);
                    Integer n7 = id_catch[4];
                    this.id_class[rryV.id_case[25]] = n7;
                    Integer n8 = id_break[9];
                    this.id_class[rryV.id_case[26]] = n8;
                }
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA4C3078C;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-122, 11, 36, 95, -77, 43, 119, 51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private rryg_1 id_break(int n) {
        if (n == id_catch[6]) {
            return (rryg_1)((Object)rryg_1.staticFields024e8373b551338f96ec40891e552616[id_case[30]]);
        }
        if (((cb_3)rryV.id_import.id_class[id_case[31]]).sK().id_class(rdy_3.kk)) {
            return (rryg_1)((Object)rryg_1.staticFields024e8373b551338f96ec40891e552616[id_case[32]]);
        }
        return (rryg_1)((Object)rryg_1.staticFields024e8373b551338f96ec40891e552616[id_case[33]]);
    }

    private static void id_break() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_protected = lArray;
    }

    @Override
    public rrIF id_throws() {
        this.id_final();
        return (rrIF)this.id_class[id_case[35]];
    }

    private static /* synthetic */ void ntfClinit() {
        rryV.id_extends();
        rryV.id_implements();
        rryV.id_break();
        rryV.id_native();
        rryV.id_case();
        rryV.id_private();
    }

    private int id_finally() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_catch[13];
        }
        if (predicate.test(((cb_3)rryV.id_import.id_class[id_case[43]]).ss())) {
            return id_catch[14];
        }
        if (predicate.test(((cb_3)rryV.id_import.id_class[id_case[44]]).Sn())) {
            return id_catch[15];
        }
        for (int i = id_break[12]; i < id_catch[16]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rryV.id_import.id_class[rryV.id_case[45]]).id_implements[id_case[46]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_catch[17];
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[20];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[8] = true;
        blArray[14] = true;
        blArray[15] = true;
        id_break = blArray;
    }

    private static void id_case() {
        id_private = new float[]{20.0f};
    }

    private static void id_implements() {
        id_byte = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0425\u043b\u043e\u043f\u0443\u0448\u043a\u0430"), new String("\u0445\u043b\u043e\u043f\u0443\u0448\u043a\u0438"), new String("[\u2605] \u0425\u043b\u043e\u043f\u0443\u0448\u043a\u0430")};
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.kk) {
                return id_break[13];
            }
            String string = rdn_32.id_continue().id_byte();
            if (string.equalsIgnoreCase(id_byte[3])) {
                return id_break[14];
            }
            List<rLR> list = Arrays.stream(((rrfO_2)((Object)((Object)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[id_case[47]]))).id_class()).map(rLY::id_class).collect(Collectors.toList());
            if (rAB.id_break(rdn_32, list)) {
                return id_break[15];
            }
            return id_break[16];
        };
    }

    private static void id_private() {
        id_catch = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
    }

    private void id_final() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[2] = false;
            this.id_class[3] = 0L;
            this.id_class[4] = 0;
            this.id_class[5] = 0;
        }
    }

    private static void id_native() {
        short[] sArray = new short[48];
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
        sArray[34] = 36;
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
        id_case = sArray;
    }

    @Override
    public boolean aK_() {
        this.id_final();
        Boolean bl = id_break[10];
        this.id_class[rryV.id_case[27]] = bl;
        Integer n = id_catch[5];
        this.id_class[rryV.id_case[28]] = n;
        Integer n2 = id_break[11];
        this.id_class[rryV.id_case[29]] = n2;
        return super.aK_();
    }
}

