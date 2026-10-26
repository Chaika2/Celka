/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.HwHelper;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rrIF;
import celestial.rrLB;
import celestial.rrLY;
import celestial.rrQX;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrjk_3;
import celestial.rrpT_2;
import celestial.rrpi_3;
import celestial.rrpq_3;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpp_3
extends rrpi_3 {
    private static String[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    public Object[] id_break;
    private static float[] id_case;
    private static byte[] id_catch;
    private static short[] id_private;

    private int id_byte(int n) {
        if (n == id_catch[5]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_catch[6]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_catch[7]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rrpp_3.id_import.id_class[rrpp_3.id_private[28]]).id_implements[rrpp_3.id_private[29]]).id_protected);
            return n;
        }
        if (n >= id_catch[8] && n <= id_catch[9]) {
            ((Ax_1)rrpp_3.id_import.id_class[id_private[30]]).id_class(((rJr_1)((cb_3)rrpp_3.id_import.id_class[rrpp_3.id_private[31]]).id_implements[rrpp_3.id_private[32]]).id_case, n, ((rhz_3)((cb_3)rrpp_3.id_import.id_class[rrpp_3.id_private[33]]).id_implements[rrpp_3.id_private[34]]).id_protected, rXa_1.SWAP);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[35]]).id_finally().id_class(rrLY.id_class());
            return n;
        }
        return id_catch[10];
    }

    @Override
    public rdn_3 id_byte() {
        return (rdn_3)id_class[id_private[36]];
    }

    public rrpp_3(HwHelper hwHelper) {
        super(hwHelper);
        this.id_case();
        rrIF rrIF2 = new rrIF(id_byte[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_private[0]]);
        this.id_break[rrpp_3.id_private[1]] = rrIF2;
        Integer n = id_catch[0];
        this.id_break[rrpp_3.id_private[2]] = n;
        Setting[] settingArray = new Setting[id_protected[0]];
        settingArray[rrpp_3.id_protected[1]] = (rrIF)this.id_break[id_private[3]];
        hwHelper.id_class(new GroupSetting(id_byte[1], settingArray));
    }

    static {
        rrpp_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-54, -31, -124, -79, 89, -55, -128, -37}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4DBCE50A0D11E79L;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_case();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[6]]) && ((Boolean)this.id_break[id_private[7]]).booleanValue()) {
            HwHelper hwHelper = (HwHelper)this.id_continue();
            int n = this.id_native();
            rrpT_2 rrpT_22 = this.id_break(n);
            switch (((int[])rrpq_3.id_class[id_private[8]])[rrpT_22.ordinal()]) {
                case 1: {
                    int n2 = ((cb_3)rrpp_3.id_import.id_class[id_private[9]]).sK().id_protected(rdy_3.kh);
                    float f = (float)n2 / id_case[0];
                    rrfu_3.id_class(hwHelper, id_byte[2], f);
                    this.id_implements();
                    return;
                }
                case 2: {
                    this.id_implements();
                    return;
                }
            }
            if (rrpT_22 == (rrpT_2)((Object)rrpT_2.staticFields40114faa3468399f904240e789c63c91[id_private[10]])) {
                if ((Integer)this.id_break[id_private[11]] == id_catch[1]) {
                    Integer n3 = this.id_byte(n);
                    this.id_break[rrpp_3.id_private[12]] = n3;
                }
                if ((Integer)this.id_break[id_private[13]] > id_catch[2]) {
                    if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[14]]).id_private().P().id_super()) {
                        rrfo_3.id_class(rpm_3.MAIN_HAND);
                        ((Ax_1)rrpp_3.id_import.id_class[id_private[15]]).id_class(((rJr_1)((cb_3)rrpp_3.id_import.id_class[rrpp_3.id_private[16]]).id_implements[rrpp_3.id_private[17]]).id_case, (Integer)this.id_break[id_private[18]], ((rhz_3)((cb_3)rrpp_3.id_import.id_class[rrpp_3.id_private[19]]).id_implements[rrpp_3.id_private[20]]).id_protected, rXa_1.SWAP);
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[21]]).id_finally().id_class(rrLY.id_class());
                        this.id_implements();
                    }
                } else {
                    this.id_implements();
                }
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x51DEA2D7;
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_case();
        if (rrLB2.id_break() == ((rrIF)this.id_break[id_private[4]]).id_finally().id_byte()) {
            Boolean bl = id_protected[2];
            this.id_break[rrpp_3.id_private[5]] = bl;
        }
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rdn_3(rdy_3.kh, 1)};
        id_class = objectArray;
    }

    private rrpT_2 id_break(int n) {
        if (n == id_catch[4]) {
            return (rrpT_2)((Object)rrpT_2.staticFields40114faa3468399f904240e789c63c91[id_private[24]]);
        }
        if (((cb_3)rrpp_3.id_import.id_class[id_private[25]]).sK().id_class(rdy_3.kh)) {
            return (rrpT_2)((Object)rrpT_2.staticFields40114faa3468399f904240e789c63c91[id_private[26]]);
        }
        return (rrpT_2)((Object)rrpT_2.staticFields40114faa3468399f904240e789c63c91[id_private[27]]);
    }

    @Override
    public rrIF id_throws() {
        this.id_case();
        return (rrIF)this.id_break[id_private[37]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrpp_3.id_finally();
        rrpp_3.id_extends();
        rrpp_3.id_package();
        rrpp_3.id_final();
        rrpp_3.id_private();
        rrpp_3.id_break();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[10] = true;
        id_protected = blArray;
    }

    private static void id_extends() {
        id_byte = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0422\u0440\u0430\u043f\u043a\u0430"), new String("\u0442\u0440\u0430\u043f\u043a\u0438")};
    }

    private void id_case() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
            this.id_break[1] = false;
            this.id_break[2] = 0;
        }
    }

    private void id_implements() {
        this.id_case();
        Boolean bl = id_protected[3];
        this.id_break[rrpp_3.id_private[22]] = bl;
        Integer n = id_catch[3];
        this.id_break[rrpp_3.id_private[23]] = n;
    }

    private static void id_package() {
        short[] sArray = new short[42];
        sArray[2] = 2;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[9] = 57;
        sArray[11] = 2;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[15] = 55;
        sArray[16] = 57;
        sArray[17] = 4;
        sArray[18] = 2;
        sArray[19] = 57;
        sArray[20] = 1;
        sArray[22] = 1;
        sArray[23] = 2;
        sArray[24] = 1;
        sArray[25] = 57;
        sArray[26] = 2;
        sArray[28] = 57;
        sArray[29] = 1;
        sArray[30] = 55;
        sArray[31] = 57;
        sArray[32] = 4;
        sArray[33] = 57;
        sArray[34] = 1;
        sArray[38] = 57;
        sArray[39] = 57;
        sArray[40] = 57;
        sArray[41] = 1;
        id_private = sArray;
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> rrjk_3.id_byte(rdn_32);
    }

    private static void id_private() {
        id_catch = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 3, 2};
    }

    private static void id_final() {
        id_case = new float[]{20.0f};
    }

    private int id_native() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_catch[11];
        }
        if (predicate.test(((cb_3)rrpp_3.id_import.id_class[id_private[38]]).ss())) {
            return id_catch[12];
        }
        if (predicate.test(((cb_3)rrpp_3.id_import.id_class[id_private[39]]).Sn())) {
            return id_catch[13];
        }
        for (int i = id_protected[4]; i < id_catch[14]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpp_3.id_import.id_class[rrpp_3.id_private[40]]).id_implements[id_private[41]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_catch[15];
    }

    @Override
    public boolean aK_() {
        this.id_implements();
        return super.aK_();
    }
}

