/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Module;
import celestial.module.util.AutoAccept;
import celestial.q_1;
import celestial.rrIk_1;
import celestial.rrLO;
import celestial.rrTF;
import celestial.rrfZ_2;
import celestial.rrfu_3;
import celestial.rrlw_3;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlt_3
extends rrTF<AutoAccept> {
    private static short[] id_byte;
    public Object[] id_class;
    private static String[] id_protected;
    private static boolean[] id_case;
    public static Object[] id_break;
    private static byte[] id_catch;

    private static void id_byte() {
        Object[] objectArray = new Object[1];
        String[] stringArray = new String[]{id_protected[5], id_protected[6], id_protected[7], id_protected[8], id_protected[9], id_protected[10], id_protected[11], id_protected[12], id_protected[13], id_protected[14], id_protected[15]};
        objectArray[0] = stringArray;
        id_break = objectArray;
    }

    public rrlt_3(AutoAccept autoAccept) {
        super(autoAccept);
        this.id_throws();
        rrIk_1 rrIk_12 = new rrIk_1(id_protected[0], id_case[0]);
        this.id_class[rrlt_3.id_byte[0]] = rrIk_12;
        rrIk_1 rrIk_13 = new rrIk_1(id_protected[1], id_case[1]);
        this.id_class[rrlt_3.id_byte[1]] = rrIk_13;
        Setting[] settingArray = new Setting[id_catch[0]];
        settingArray[rrlt_3.id_case[2]] = (rrIk_1)this.id_class[id_byte[2]];
        settingArray[rrlt_3.id_case[3]] = (rrIk_1)this.id_class[id_byte[3]];
        autoAccept.id_class(new GroupSetting(id_protected[2], settingArray));
    }

    static {
        rrlt_3.ntfClinit();
    }

    @EventTarget
    public void id_class(rrLO rrLO2) {
        this.id_throws();
        if (!((rrIk_1)this.id_class[id_byte[4]]).id_class().booleanValue()) {
            return;
        }
        String string = rrLO2.id_protected().toLowerCase();
        if (Arrays.stream((String[])id_break[id_byte[5]]).map(String::toLowerCase).noneMatch(string::contains)) {
            return;
        }
        if (!this.id_class(rrLO2, string)) {
            return;
        }
        if (rrfZ_2.id_byte()) {
            rrfu_3.id_byte(rrfu_3.id_class((Module)this.id_continue()) + "\u0412\u044b \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0435\u0441\u044c \u0432 PvP \u0440\u0435\u0436\u0438\u043c\u0435!");
            rrlw_3 rrlw_32 = (rrlw_3)((Object)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[id_byte[6]]);
            this.id_class[rrlt_3.id_byte[7]] = rrlw_32;
            return;
        }
        this.id_case();
    }

    private boolean id_class(rrLO rrLO2, String string) {
        this.id_throws();
        if (((rrIk_1)this.id_class[id_byte[11]]).id_class().booleanValue()) {
            if (rrLO2.id_class() != null) {
                return id_case[4];
            }
            if (!((AutoAccept)this.id_continue()).id_class(string.split(id_protected[3]))) {
                return id_case[5];
            }
        }
        return id_case[6];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6B380285F86D1FCDL;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_throws();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[8]]) && (rrlw_3)((Object)this.id_class[id_byte[9]]) == (rrlw_3)((Object)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[id_byte[10]]) && !rrfZ_2.id_byte()) {
            this.id_case();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6B8DB303;
    }

    private static void id_class() {
        id_protected = new String[]{new String("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e"), new String("\u0422\u043e\u043b\u044c\u043a\u043e \u043e\u0442 \u0434\u0440\u0443\u0437\u0435\u0439"), new String("\u0417\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442"), new String("\\s+"), new String("/tpaccept"), new String("has requested teleport"), new String("\u043f\u0440\u043e\u0441\u0438\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f"), new String("\u043f\u0440\u043e\u0441\u0438\u0442 \u043a \u0432\u0430\u043c \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f"), new String("\u0445\u043e\u0447\u0435\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u043a \u0432\u0430\u043c"), new String("\u0437\u0430\u043f\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442 \u043a \u0432\u0430\u043c"), new String("\u043a\u0438\u043d\u0443\u043b \u0437\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430\u0446\u0438\u044e"), new String("\u043a\u0438\u043d\u0443\u043b \u0437\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442"), new String("\u043a\u0438\u043d\u0443\u043b \u0437\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0442\u043f"), new String("\u043a\u0438\u043d\u0443\u043b \u0437\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0442\u043f \u043a \u0432\u0430\u043c"), new String("\u043a\u0438\u043d\u0443\u043b \u0437\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442 \u043a \u0432\u0430\u043c"), new String("\u043a\u0438\u043d\u0443\u043b \u0437\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430\u0446\u0438\u044e \u043a \u0432\u0430\u043c")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, -102, 114, 118, 31, -19, -103, -43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        this.id_throws();
        ((cb_3)rrlt_3.id_import.id_class[id_byte[12]]).id_case(id_protected[4]);
        rrlw_3 rrlw_32 = (rrlw_3)((Object)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[id_byte[13]]);
        this.id_class[rrlt_3.id_byte[14]] = rrlw_32;
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrlt_3.id_private();
        rrlt_3.id_class();
        rrlt_3.id_implements();
        rrlt_3.id_protected();
        rrlt_3.id_byte();
    }

    private void id_case() {
        this.id_break();
    }

    private static void id_implements() {
        short[] sArray = new short[16];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[7] = 2;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 57;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 2;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_catch = new byte[]{2, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_case = blArray;
    }

    @Override
    public boolean aK_() {
        this.id_throws();
        Object var5_1 = null;
        this.id_class[rrlt_3.id_byte[15]] = var5_1;
        return super.aK_();
    }
}

