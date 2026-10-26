/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rrNw_1;
import celestial.rrcx_3;
import celestial.rrfI_2;
import celestial.rrfO_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcd_3
extends rrfI_2<rrfO_2> {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    @Override
    public boolean id_byte() {
        this.id_case();
        return this.id_break() == (rrfO_2)((Object)((rrcx_3)this.id_class[rrcd_3.id_protected[4]]).id_class[id_protected[5]]) ? id_byte[0] : id_byte[1];
    }

    public rrcd_3(rrcx_3 rrcx_32, rrNw_1 rrNw_12) {
        this.id_case();
        rrcx_3 rrcx_33 = rrcx_32;
        this.id_class[rrcd_3.id_protected[0]] = rrcx_33;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcd_3.id_protected[1]] = rrNw_13;
    }

    static {
        rrcd_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD176BBAB;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDDA0613C623EDF99L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-87, -92, -10, 92, 92, 86, 52, 77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public rrfO_2 id_break() {
        this.id_case();
        rJY rJY2 = ((rrNw_1)this.id_class[id_protected[2]]).id_throws();
        return rrfO_2.id_class(rJY2 == null ? ((rrNw_1)this.id_class[id_protected[3]]).id_protected() : rJY2.id_class());
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcd_3.id_throws();
        rrcd_3.id_protected();
        rrcd_3.id_catch();
    }

    private static void id_catch() {
        id_break = new byte[]{2};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[4] = 1;
        id_protected = sArray;
    }
}

