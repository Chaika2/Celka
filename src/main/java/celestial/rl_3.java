/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rl_3
implements rq_3 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    @Override
    public int id_byte() {
        return (Integer)this.id_class[id_protected[5]];
    }

    public rl_3() {
        this(id_break[0], id_break[1], id_break[2]);
    }

    public rl_3(int n, int n2, int n3) {
        this.id_private();
        Integer n4 = n;
        this.id_class[rl_3.id_protected[0]] = n4;
        Integer n5 = n2;
        this.id_class[rl_3.id_protected[1]] = n5;
        Integer n6 = n3;
        this.id_class[rl_3.id_protected[2]] = n6;
    }

    static {
        rl_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x696800E04E59A935L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-113, 108, -86, -107, -4, -57, -11, -78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF561BC0C;
    }

    @Override
    public int id_class() {
        return (Integer)this.id_class[id_protected[4]];
    }

    @Override
    public int id_break() {
        return (Integer)this.id_class[id_protected[3]];
    }

    private static void id_throws() {
        id_byte = new byte[]{3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rl_3.id_catch();
        rl_3.id_case();
        rl_3.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[8];
        blArray[5] = true;
        id_break = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_protected = sArray;
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rl_3.id_break[3]] = id_break[4];
            objectArray[rl_3.id_break[5]] = id_break[6];
            objectArray[rl_3.id_byte[1]] = id_break[7];
        }
    }
}

