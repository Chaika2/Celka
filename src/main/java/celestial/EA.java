/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.En_1;
import celestial.Pm_1;
import celestial.rk_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EA {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    public rk_3 id_byte() {
        return (rk_3)((Object)this.id_class[id_byte[3]]);
    }

    public EA() {
        HashMap hashMap;
        this.id_throws();
        En_1 en_1 = new En_1();
        this.id_class[EA.id_byte[0]] = en_1;
        this.id_class[EA.id_byte[1]] = hashMap = new HashMap();
    }

    static {
        EA.ntfClinit();
    }

    public EA id_class(Pm_1 pm_1, boolean bl) {
        ((Map)this.id_class[id_byte[6]]).put(pm_1, bl);
        return this;
    }

    public EA id_class(En_1 en_1) {
        En_1 en_12 = en_1;
        this.id_class[EA.id_byte[5]] = en_12;
        return this;
    }

    public EA id_class(rk_3 rk_32) {
        rk_3 rk_33 = rk_32;
        this.id_class[EA.id_byte[2]] = rk_33;
        return this;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-103, -13, 26, -50, -101, -86, -64, 53}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3C60E8FD;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4CFF5CE705BA1F76L;
    }

    public En_1 id_class() {
        return (En_1)this.id_class[id_byte[4]];
    }

    public Map<Pm_1, Boolean> id_break() {
        return (Map)this.id_class[id_byte[7]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        EA.id_protected();
        EA.id_case();
    }

    private static void id_case() {
        id_break = new byte[]{3};
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        id_byte = sArray;
    }
}

