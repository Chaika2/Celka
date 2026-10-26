/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.AutoAccept;
import celestial.rrIk_1;
import celestial.rrLO;
import celestial.rrTF;
import celestial.rrZW;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlp_3
extends rrTF<AutoAccept> {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static short[] id_case;
    public static Object[] id_break;
    private static String[] id_catch;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }

    public rrlp_3(AutoAccept autoAccept) {
        super(autoAccept);
        this.id_byte();
        rrIk_1 rrIk_12 = new rrIk_1(id_catch[0], id_protected[0]);
        this.id_class[rrlp_3.id_case[0]] = rrIk_12;
        rrIk_1 rrIk_13 = new rrIk_1(id_catch[1], id_protected[1]);
        this.id_class[rrlp_3.id_case[1]] = rrIk_13;
        Setting[] settingArray = new Setting[id_byte[0]];
        settingArray[rrlp_3.id_protected[2]] = (rrIk_1)this.id_class[id_case[2]];
        settingArray[rrlp_3.id_protected[3]] = (rrIk_1)this.id_class[id_case[3]];
        autoAccept.id_class(new GroupSetting(id_catch[2], settingArray));
    }

    static {
        rrlp_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-19, 109, -64, -110, -72, 61, -31, 127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLO rrLO2) {
        this.id_byte();
        if (!((rrIk_1)this.id_class[id_case[4]]).id_class().booleanValue()) {
            return;
        }
        Aw_1 aw_1 = rrLO2.id_break();
        if (aw_1 == null) {
            return;
        }
        String string = rrLO2.id_protected().toLowerCase();
        if (Arrays.stream((String[])id_break[id_case[5]]).map(String::toLowerCase).noneMatch(string::contains)) {
            return;
        }
        String string2 = aw_1.id_class().getName();
        if (!this.id_class(rrLO2, string2)) {
            return;
        }
        this.id_break(string2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEEDDDC866B15DD88L;
    }

    private boolean id_class(rrLO rrLO2, String string) {
        this.id_byte();
        if (((rrIk_1)this.id_class[id_case[6]]).id_class().booleanValue()) {
            if (rrLO2.id_class() != null) {
                return id_protected[4];
            }
            if (!((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_case[7]]).id_break(string)) {
                return id_protected[5];
            }
        }
        return id_protected[6];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x260D94D;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[10] = true;
        id_protected = blArray;
    }

    private void id_break(String string) {
        ((cb_3)rrlp_3.id_import.id_class[id_case[8]]).id_case("/clan accept " + string);
    }

    private static void id_break() {
        short[] sArray = new short[9];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[8] = 57;
        id_case = sArray;
    }

    private static void id_throws() {
        id_catch = new String[]{new String("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e"), new String("\u0422\u043e\u043b\u044c\u043a\u043e \u043e\u0442 \u0434\u0440\u0443\u0437\u0435\u0439"), new String("\u0417\u0430\u043f\u0440\u043e\u0441 \u0432 \u043a\u043b\u0430\u043d"), new String("\u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0430\u0435\u0442 \u0432\u0430\u0441 \u0432 \u043a\u043b\u0430\u043d")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrlp_3.id_class();
        rrlp_3.id_throws();
        rrlp_3.id_break();
        rrlp_3.id_case();
        rrlp_3.id_protected();
    }

    private static void id_case() {
        id_byte = new byte[]{2, 2};
    }

    private static void id_protected() {
        Object[] objectArray = new Object[1];
        String[] stringArray = new String[]{id_catch[3]};
        objectArray[0] = stringArray;
        id_break = objectArray;
    }
}

