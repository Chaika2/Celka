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
import celestial.rrpV_2;
import celestial.rrpi_3;
import celestial.rrpj_3;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpf_3
extends rrpi_3 {
    private static float[] id_byte;
    private static String[] id_protected;
    public Object[] id_class;
    private static short[] id_case;
    private static boolean[] id_catch;
    private static byte[] id_private;
    public static Object[] id_break;

    @Override
    public rdn_3 id_byte() {
        return (rdn_3)id_break[id_case[36]];
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8981D476;
    }

    public rrpf_3(HwHelper hwHelper) {
        super(hwHelper);
        this.id_break();
        rrIF rrIF2 = new rrIF(id_protected[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_case[0]]);
        this.id_class[rrpf_3.id_case[1]] = rrIF2;
        Integer n = id_private[0];
        this.id_class[rrpf_3.id_case[2]] = n;
        Setting[] settingArray = new Setting[id_catch[0]];
        settingArray[rrpf_3.id_catch[1]] = (rrIF)this.id_class[id_case[3]];
        hwHelper.id_class(new GroupSetting(id_protected[1], settingArray));
    }

    static {
        rrpf_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-25, -64, 3, -51, -28, -114, 32, -12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE4693E7C1F46D6ECL;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_break();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[6]]) && ((Boolean)this.id_class[id_case[7]]).booleanValue()) {
            HwHelper hwHelper = (HwHelper)this.id_continue();
            int n = this.id_finally();
            rrpV_2 rrpV_22 = this.id_break(n);
            switch (((int[])rrpj_3.id_class[id_case[8]])[rrpV_22.ordinal()]) {
                case 1: {
                    int n2 = ((cb_3)rrpf_3.id_import.id_class[id_case[9]]).sK().id_protected(rdy_3.xa);
                    float f = (float)n2 / id_byte[0];
                    rrfu_3.id_class(hwHelper, id_protected[2], f);
                    this.id_native();
                    return;
                }
                case 2: {
                    this.id_native();
                    return;
                }
            }
            if (rrpV_22 == (rrpV_2)((Object)rrpV_2.staticFields649a111ee07f3ad0a4df26e70aad6781[id_case[10]])) {
                if ((Integer)this.id_class[id_case[11]] == id_private[1]) {
                    Integer n3 = this.id_class(n);
                    this.id_class[rrpf_3.id_case[12]] = n3;
                }
                if ((Integer)this.id_class[id_case[13]] > id_private[2]) {
                    if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[14]]).id_private().P().id_super()) {
                        rrfo_3.id_class(rpm_3.MAIN_HAND);
                        ((Ax_1)rrpf_3.id_import.id_class[id_case[15]]).id_class(((rJr_1)((cb_3)rrpf_3.id_import.id_class[rrpf_3.id_case[16]]).id_implements[rrpf_3.id_case[17]]).id_case, (Integer)this.id_class[id_case[18]], ((rhz_3)((cb_3)rrpf_3.id_import.id_class[rrpf_3.id_case[19]]).id_implements[rrpf_3.id_case[20]]).id_protected, rXa_1.SWAP);
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[21]]).id_finally().id_class(rrLY.id_class());
                        this.id_native();
                    }
                } else {
                    this.id_native();
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_break();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_case[4]]).id_finally().id_byte()) {
            Boolean bl = id_catch[2];
            this.id_class[rrpf_3.id_case[5]] = bl;
        }
    }

    private int id_class(int n) {
        if (n == id_private[5]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_private[6]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_private[7]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rrpf_3.id_import.id_class[rrpf_3.id_case[28]]).id_implements[rrpf_3.id_case[29]]).id_protected);
            return n;
        }
        if (n >= id_private[8] && n <= id_private[9]) {
            ((Ax_1)rrpf_3.id_import.id_class[id_case[30]]).id_class(((rJr_1)((cb_3)rrpf_3.id_import.id_class[rrpf_3.id_case[31]]).id_implements[rrpf_3.id_case[32]]).id_case, n, ((rhz_3)((cb_3)rrpf_3.id_import.id_class[rrpf_3.id_case[33]]).id_implements[rrpf_3.id_case[34]]).id_protected, rXa_1.SWAP);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[35]]).id_finally().id_class(rrLY.id_class());
            return n;
        }
        return id_private[10];
    }

    private rrpV_2 id_break(int n) {
        if (n == id_private[4]) {
            return (rrpV_2)((Object)rrpV_2.staticFields649a111ee07f3ad0a4df26e70aad6781[id_case[24]]);
        }
        if (((cb_3)rrpf_3.id_import.id_class[id_case[25]]).sK().id_class(rdy_3.xa)) {
            return (rrpV_2)((Object)rrpV_2.staticFields649a111ee07f3ad0a4df26e70aad6781[id_case[26]]);
        }
        return (rrpV_2)((Object)rrpV_2.staticFields649a111ee07f3ad0a4df26e70aad6781[id_case[27]]);
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[1] = false;
            this.id_class[2] = 0;
        }
    }

    @Override
    public rrIF id_throws() {
        this.id_break();
        return (rrIF)this.id_class[id_case[37]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrpf_3.id_private();
        rrpf_3.id_implements();
        rrpf_3.id_extends();
        rrpf_3.id_final();
        rrpf_3.id_case();
        rrpf_3.id_package();
    }

    private int id_finally() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_private[11];
        }
        if (predicate.test(((cb_3)rrpf_3.id_import.id_class[id_case[38]]).ss())) {
            return id_private[12];
        }
        if (predicate.test(((cb_3)rrpf_3.id_import.id_class[id_case[39]]).Sn())) {
            return id_private[13];
        }
        for (int i = id_catch[4]; i < id_private[14]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpf_3.id_import.id_class[rrpf_3.id_case[40]]).id_implements[id_case[41]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_private[15];
    }

    private static void id_extends() {
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
        id_case = sArray;
    }

    private static void id_case() {
        id_private = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 3, 2};
    }

    private static void id_implements() {
        id_protected = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0448\u0442\u0443\u0447\u043a\u0430"), new String("\u0432\u0437\u0440\u044b\u0432\u043d\u043e\u0439 \u0448\u0442\u0443\u0447\u043a\u0438")};
    }

    private static void id_package() {
        Object[] objectArray = new Object[]{new rdn_3(rdy_3.xa, 1)};
        id_break = objectArray;
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> rrjk_3.id_break(rdn_32);
    }

    private static void id_private() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[10] = true;
        id_catch = blArray;
    }

    private static void id_final() {
        id_byte = new float[]{20.0f};
    }

    private void id_native() {
        this.id_break();
        Boolean bl = id_catch[3];
        this.id_class[rrpf_3.id_case[22]] = bl;
        Integer n = id_private[3];
        this.id_class[rrpf_3.id_case[23]] = n;
    }

    @Override
    public boolean aK_() {
        this.id_native();
        return super.aK_();
    }
}

