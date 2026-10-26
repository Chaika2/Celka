/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.Fc_1;
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
import celestial.rrFo_1;
import celestial.rrIF;
import celestial.rrLB;
import celestial.rrLY;
import celestial.rrQX;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrjk_3;
import celestial.rrmi_3;
import celestial.rrpI_2;
import celestial.rrpi_3;
import celestial.rrpw_3;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpt_3
extends rrpi_3 {
    public static Object[] id_class;
    private static float[] id_byte;
    private static byte[] id_protected;
    private static short[] id_case;
    private static boolean[] id_catch;
    private static String[] id_private;
    public Object[] id_break;

    private rrpI_2 id_byte(int n) {
        if (n == id_protected[5]) {
            return (rrpI_2)((Object)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[id_case[34]]);
        }
        if (((cb_3)rrpt_3.id_import.id_class[id_case[35]]).sK().id_class(rdy_3.Gu)) {
            return (rrpI_2)((Object)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[id_case[36]]);
        }
        return (rrpI_2)((Object)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[id_case[37]]);
    }

    @Override
    public rdn_3 id_byte() {
        return (rdn_3)id_class[id_case[50]];
    }

    public rrpt_3(HwHelper hwHelper) {
        super(hwHelper);
        this.id_break();
        rrIF rrIF2 = new rrIF(id_private[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_case[0]]);
        this.id_break[rrpt_3.id_case[1]] = rrIF2;
        Integer n = id_protected[0];
        this.id_break[rrpt_3.id_case[2]] = n;
        rrmi_3 rrmi_32 = new rrmi_3();
        this.id_break[rrpt_3.id_case[3]] = rrmi_32;
        Setting[] settingArray = new Setting[id_catch[0]];
        settingArray[rrpt_3.id_catch[1]] = (rrIF)this.id_break[id_case[4]];
        hwHelper.id_class(new GroupSetting(id_private[1], settingArray));
    }

    static {
        rrpt_3.ntfClinit();
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_break();
        if (rrLB2.id_break() == ((rrIF)this.id_break[id_case[5]]).id_finally().id_byte()) {
            Boolean bl = id_catch[2];
            this.id_break[rrpt_3.id_case[6]] = bl;
        }
    }

    @EventTarget
    public void id_class(rrFo_1 rrFo_12) {
        Fc_1 fc_1;
        this.id_break();
        vm_3 vm_32 = rrFo_12.id_break();
        if (vm_32 instanceof Fc_1 && (fc_1 = (Fc_1)vm_32).id_new().id_byte().contains(id_private[3]) && ((rrmi_3)this.id_break[id_case[23]]).id_class()) {
            int n = ((rrmi_3)this.id_break[id_case[24]]).id_break();
            String[] stringArray = new String[id_catch[4]];
            stringArray[rrpt_3.id_catch[5]] = id_private[4];
            int n2 = ((rrmi_3)this.id_break[id_case[25]]).id_class(id_catch[3], stringArray);
            if (n2 != id_protected[3]) {
                ((Ax_1)rrpt_3.id_import.id_class[id_case[26]]).id_class(((rJr_1)((cb_3)rrpt_3.id_import.id_class[rrpt_3.id_case[27]]).id_implements[rrpt_3.id_case[28]]).id_case, n, n2, rXa_1.SWAP);
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[29]]).id_finally().id_class(rrLY.id_class());
            }
            ((rrmi_3)this.id_break[id_case[30]]).id_throws();
        }
    }

    private int id_class(int n) {
        this.id_break();
        if (n == id_protected[6]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_protected[7]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_protected[8]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rrpt_3.id_import.id_class[rrpt_3.id_case[38]]).id_implements[rrpt_3.id_case[39]]).id_protected);
            return n;
        }
        if (n >= id_protected[9] && n <= id_protected[10]) {
            if (!((rrmi_3)this.id_break[id_case[40]]).id_class()) {
                rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpt_3.id_import.id_class[rrpt_3.id_case[41]]).id_implements[id_case[42]]).id_extends(n);
                ((rrmi_3)this.id_break[id_case[43]]).id_class(rdn_32, n);
            }
            ((Ax_1)rrpt_3.id_import.id_class[id_case[44]]).id_class(((rJr_1)((cb_3)rrpt_3.id_import.id_class[rrpt_3.id_case[45]]).id_implements[rrpt_3.id_case[46]]).id_case, n, ((rhz_3)((cb_3)rrpt_3.id_import.id_class[rrpt_3.id_case[47]]).id_implements[rrpt_3.id_case[48]]).id_protected, rXa_1.SWAP);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[49]]).id_finally().id_class(rrLY.id_class());
            return n;
        }
        return id_protected[11];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{99, 46, 89, 56, -128, 35, -79, 92}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD3E31CC12C67CFB3L;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_break();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[7]]) && ((Boolean)this.id_break[id_case[8]]).booleanValue()) {
            HwHelper hwHelper = (HwHelper)this.id_continue();
            int n = this.id_implements();
            rrpI_2 rrpI_22 = this.id_byte(n);
            switch (((int[])rrpw_3.id_class[id_case[9]])[rrpI_22.ordinal()]) {
                case 1: {
                    int n2 = ((cb_3)rrpt_3.id_import.id_class[id_case[10]]).sK().id_protected(rdy_3.Gu);
                    float f = (float)n2 / id_byte[0];
                    rrfu_3.id_class(hwHelper, id_private[2], f);
                    this.id_extends();
                    return;
                }
                case 2: {
                    this.id_extends();
                    return;
                }
            }
            if (rrpI_22 == (rrpI_2)((Object)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[id_case[11]])) {
                if ((Integer)this.id_break[id_case[12]] == id_protected[1]) {
                    Integer n3 = this.id_class(n);
                    this.id_break[rrpt_3.id_case[13]] = n3;
                }
                if ((Integer)this.id_break[id_case[14]] > id_protected[2]) {
                    if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[15]]).id_private().P().id_super()) {
                        rrfo_3.id_class(rpm_3.MAIN_HAND);
                        ((Ax_1)rrpt_3.id_import.id_class[id_case[16]]).id_class(((rJr_1)((cb_3)rrpt_3.id_import.id_class[rrpt_3.id_case[17]]).id_implements[rrpt_3.id_case[18]]).id_case, (Integer)this.id_break[id_case[19]], ((rhz_3)((cb_3)rrpt_3.id_import.id_class[rrpt_3.id_case[20]]).id_implements[rrpt_3.id_case[21]]).id_protected, rXa_1.SWAP);
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[22]]).id_finally().id_class(rrLY.id_class());
                        this.id_extends();
                    }
                } else {
                    this.id_extends();
                }
            }
        }
    }

    private void id_break() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
            this.id_break[1] = false;
            this.id_break[2] = 0;
        }
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA0242BCA;
    }

    @Override
    public rrIF id_throws() {
        this.id_break();
        return (rrIF)this.id_break[id_case[51]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrpt_3.id_case();
        rrpt_3.id_package();
        rrpt_3.id_finally();
        rrpt_3.id_native();
        rrpt_3.id_private();
        rrpt_3.id_final();
    }

    private static void id_finally() {
        short[] sArray = new short[56];
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[10] = 57;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[16] = 55;
        sArray[17] = 57;
        sArray[18] = 4;
        sArray[19] = 2;
        sArray[20] = 57;
        sArray[21] = 1;
        sArray[23] = 3;
        sArray[24] = 3;
        sArray[25] = 3;
        sArray[26] = 55;
        sArray[27] = 57;
        sArray[28] = 4;
        sArray[30] = 3;
        sArray[31] = 3;
        sArray[32] = 1;
        sArray[33] = 2;
        sArray[34] = 1;
        sArray[35] = 57;
        sArray[36] = 2;
        sArray[38] = 57;
        sArray[39] = 1;
        sArray[40] = 3;
        sArray[41] = 57;
        sArray[42] = 1;
        sArray[43] = 3;
        sArray[44] = 55;
        sArray[45] = 57;
        sArray[46] = 4;
        sArray[47] = 57;
        sArray[48] = 1;
        sArray[52] = 57;
        sArray[53] = 57;
        sArray[54] = 57;
        sArray[55] = 1;
        id_case = sArray;
    }

    private void id_extends() {
        this.id_break();
        Boolean bl = id_catch[6];
        this.id_break[rrpt_3.id_case[32]] = bl;
        Integer n = id_protected[4];
        this.id_break[rrpt_3.id_case[33]] = n;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[13] = true;
        id_catch = blArray;
    }

    private int id_implements() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_protected[12];
        }
        if (predicate.test(((cb_3)rrpt_3.id_import.id_class[id_case[52]]).ss())) {
            return id_protected[13];
        }
        if (predicate.test(((cb_3)rrpt_3.id_import.id_class[id_case[53]]).Sn())) {
            return id_protected[14];
        }
        for (int i = id_catch[7]; i < id_protected[15]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpt_3.id_import.id_class[rrpt_3.id_case[54]]).id_implements[id_case[55]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_protected[16];
    }

    private static void id_package() {
        id_private = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0420\u044e\u043a\u0437\u0430\u043a"), new String("\u0440\u044e\u043a\u0437\u0430\u043a\u0430"), new String("\u0420\u044e\u043a\u0437\u0430\u043a"), new String("backpack-inventory")};
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> rrjk_3.id_throws(rdn_32);
    }

    private static void id_private() {
        id_protected = new byte[]{-1, -1, 8, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 4, 2};
    }

    private static void id_final() {
        Object[] objectArray = new Object[]{new rdn_3(rdy_3.Gu, 1)};
        id_class = objectArray;
    }

    private static void id_native() {
        id_byte = new float[]{20.0f};
    }

    @Override
    public boolean aK_() {
        this.id_break();
        this.id_extends();
        ((rrmi_3)this.id_break[id_case[31]]).id_throws();
        return super.aK_();
    }
}

