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
import celestial.rrpS_2;
import celestial.rrpu_3;
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

public class rrpB_2
extends rrpu_3 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;
    private static long[] id_protected;
    private static float[] id_case;
    private static boolean[] id_catch;
    private static String[] id_private;

    @Override
    public rdn_3 id_byte() {
        return ((rrfx_3)((Object)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_break[35]])).id_break().id_class();
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x53A7A1AA;
    }

    public rrpB_2(FtHelper ftHelper) {
        super(ftHelper);
        this.id_finally();
        rrIF rrIF2 = new rrIF(id_private[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_break[0]]);
        this.id_class[rrpB_2.id_break[1]] = rrIF2;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rrpB_2.id_break[2]] = rrfP_22;
        Integer n = id_byte[0];
        this.id_class[rrpB_2.id_break[3]] = n;
        Setting[] settingArray = new Setting[id_catch[0]];
        settingArray[rrpB_2.id_catch[1]] = (rrIF)this.id_class[id_break[4]];
        ftHelper.id_class(new GroupSetting(id_private[1], settingArray));
    }

    static {
        rrpB_2.ntfClinit();
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_finally();
        ((rrfP_2)this.id_class[id_break[7]]).id_class(rrLu_12);
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_finally();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[8]])) {
            ((rrfP_2)this.id_class[id_break[9]]).id_class(rqR_2.id_break() - (Long)this.id_class[id_break[10]] > id_protected[0] ? id_catch[3] : id_catch[4]);
            if (((Boolean)this.id_class[id_break[11]]).booleanValue()) {
                int n;
                FtHelper ftHelper = (FtHelper)this.id_continue();
                int n2 = this.id_private();
                rrpS_2 rrpS_22 = this.id_break(n2);
                if (rrpS_22 == (rrpS_2)((Object)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[12]])) {
                    int n3 = ((cb_3)rrpB_2.id_import.id_class[id_break[13]]).sK().id_protected(rdy_3.kk);
                    float f = (float)n3 / id_case[0];
                    rrfu_3.id_class(ftHelper, id_private[2], f);
                } else if (rrpS_22 == (rrpS_2)((Object)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[14]]) && (n = this.id_class(n2)) > id_byte[1]) {
                    Integer n4 = n;
                    this.id_class[rrpB_2.id_break[15]] = n4;
                    Integer n5 = id_catch[5];
                    this.id_class[rrpB_2.id_break[16]] = n5;
                }
                Boolean bl = id_catch[6];
                this.id_class[rrpB_2.id_break[17]] = bl;
            }
            if ((Integer)this.id_class[id_break[18]] != id_byte[2]) {
                byte by = ((cb_3)rrpB_2.id_import.id_class[id_break[19]]).sV() || ((cb_3)rrpB_2.id_import.id_class[id_break[20]]).sZ() ? id_catch[7] : id_byte[3];
                rrpB_2 rrpB_22 = this;
                int n = (Integer)rrpB_22.id_class[id_break[21]] + id_catch[8];
                Integer n6 = n;
                rrpB_22.id_class[rrpB_2.id_break[22]] = n6;
                if (n > by) {
                    ((Ax_1)rrpB_2.id_import.id_class[id_break[23]]).id_class((Integer)this.id_class[id_break[24]]);
                    Integer n7 = id_byte[4];
                    this.id_class[rrpB_2.id_break[25]] = n7;
                    Integer n8 = id_catch[9];
                    this.id_class[rrpB_2.id_break[26]] = n8;
                }
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{74, 38, -104, 49, 79, 112, -2, 17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_finally();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_break[5]]).id_finally().id_byte()) {
            Boolean bl = id_catch[2];
            this.id_class[rrpB_2.id_break[6]] = bl;
        }
    }

    private int id_class(int n) {
        this.id_finally();
        if (n == id_byte[7]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_byte[8]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_byte[9]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rrpB_2.id_import.id_class[rrpB_2.id_break[36]]).id_implements[rrpB_2.id_break[37]]).id_protected);
            return n;
        }
        if (n >= id_byte[10] && n <= id_byte[11]) {
            ((rrfP_2)this.id_class[id_break[38]]).id_class(((rhz_3)((cb_3)rrpB_2.id_import.id_class[rrpB_2.id_break[39]]).id_implements[rrpB_2.id_break[40]]).id_protected);
            ((Ax_1)rrpB_2.id_import.id_class[id_break[41]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_class[rrpB_2.id_break[42]] = l;
            return n;
        }
        return id_byte[12];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x952591FB2D70E285L;
    }

    private rrpS_2 id_break(int n) {
        if (n == id_byte[6]) {
            return (rrpS_2)((Object)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[30]]);
        }
        if (((cb_3)rrpB_2.id_import.id_class[id_break[31]]).sK().id_class(rdy_3.kk)) {
            return (rrpS_2)((Object)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[32]]);
        }
        return (rrpS_2)((Object)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[33]]);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[20];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[8] = true;
        blArray[14] = true;
        blArray[15] = true;
        id_catch = blArray;
    }

    @Override
    public rrIF id_throws() {
        this.id_finally();
        return (rrIF)this.id_class[id_break[34]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrpB_2.id_break();
        rrpB_2.id_native();
        rrpB_2.id_case();
        rrpB_2.id_final();
        rrpB_2.id_implements();
        rrpB_2.id_extends();
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

    private static void id_extends() {
        id_byte = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
    }

    private static void id_case() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_protected = lArray;
    }

    private static void id_implements() {
        id_case = new float[]{20.0f};
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.kk) {
                return id_catch[13];
            }
            if (rdn_32.id_continue().id_byte().equalsIgnoreCase(id_private[3])) {
                return id_catch[14];
            }
            List<rLR> list = Arrays.stream(((rrfO_2)((Object)((Object)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[id_break[47]]))).id_class()).map(rLY::id_class).collect(Collectors.toList());
            if (rAB.id_break(rdn_32, list)) {
                return id_catch[15];
            }
            return id_catch[16];
        };
    }

    private int id_private() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_byte[13];
        }
        if (predicate.test(((cb_3)rrpB_2.id_import.id_class[id_break[43]]).ss())) {
            return id_byte[14];
        }
        if (predicate.test(((cb_3)rrpB_2.id_import.id_class[id_break[44]]).Sn())) {
            return id_byte[15];
        }
        for (int i = id_catch[12]; i < id_byte[16]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpB_2.id_import.id_class[rrpB_2.id_break[45]]).id_implements[id_break[46]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_byte[17];
    }

    private static void id_final() {
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
        sArray[35] = 39;
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
        sArray[47] = 3;
        id_break = sArray;
    }

    private static void id_native() {
        id_private = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0417\u0435\u043b\u044c\u0435 \u043f\u0430\u043b\u043b\u0430\u0434\u0438\u043d\u0430"), new String("\u0437\u0435\u043b\u044c\u044f \u043f\u0430\u043b\u043b\u0430\u0434\u0438\u043d\u0430"), new String("[\u2605] \u0417\u0435\u043b\u044c\u0435 \u041f\u0430\u043b\u043b\u0430\u0434\u0438\u043d\u0430")};
    }

    @Override
    public boolean aK_() {
        this.id_finally();
        Boolean bl = id_catch[10];
        this.id_class[rrpB_2.id_break[27]] = bl;
        Integer n = id_byte[5];
        this.id_class[rrpB_2.id_break[28]] = n;
        Integer n2 = id_catch[11];
        this.id_class[rrpB_2.id_break[29]] = n2;
        return super.aK_();
    }
}

