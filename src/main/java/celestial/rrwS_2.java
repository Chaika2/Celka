/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrtn_3;
import celestial.rruv_1;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwS_2
implements rrtn_3 {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    public String id_byte() {
        return (String)this.id_class[id_byte[9]];
    }

    public rrwS_2(Setting<?> setting, String string) {
        Setting<?> setting2;
        this.id_catch();
        rruv_1 rruv_12 = (rruv_1)rruv_1.id_class[id_byte[0]];
        this.id_class[rrwS_2.id_byte[1]] = rruv_12;
        this.id_class[rrwS_2.id_byte[2]] = setting2 = setting;
        String string2 = string;
        this.id_class[rrwS_2.id_byte[3]] = string2;
    }

    static {
        rrwS_2.ntfClinit();
    }

    public void id_class(rruv_1 rruv_12) {
        rruv_1 rruv_13 = rruv_12;
        this.id_class[rrwS_2.id_byte[5]] = rruv_13;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE1176C0;
    }

    @Override
    public rruv_1 id_class() {
        return (rruv_1)this.id_class[id_byte[4]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-82, 82, -110, -76, -10, 11, 66, -9}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x97D983921CA1F773L;
    }

    public boolean id_break() {
        return ((String)this.id_class[id_byte[6]]).equals(((Setting)this.id_class[id_byte[7]]).id_byte());
    }

    private static void id_throws() {
        short[] sArray = new short[10];
        sArray[1] = 2;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[9] = 1;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwS_2.id_throws();
        rrwS_2.id_case();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_case() {
        id_break = new byte[]{3};
    }

    public Setting<?> id_protected() {
        return (Setting)this.id_class[id_byte[8]];
    }
}

