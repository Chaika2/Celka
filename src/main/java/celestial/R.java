/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.o_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class R
implements o_1 {
    public Object[] id_break;
    private static short[] id_class;
    private static boolean[] id_byte;

    @Override
    public boolean id_byte() {
        return (Boolean)this.id_break[id_class[1]];
    }

    public R() {
        this.id_throws();
    }

    static {
        R.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA8D038D916D58A3EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2FC87D5E;
    }

    private static void id_class() {
        id_class = new short[2];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{70, -93, 66, 105, -4, 69, -92, 90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break() {
        Boolean bl = id_byte[0];
        this.id_break[R.id_class[0]] = bl;
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[1]];
            objectArray[R.id_byte[2]] = id_byte[3];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        R.id_protected();
        R.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[1] = true;
        id_byte = blArray;
    }
}

