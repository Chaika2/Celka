/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rl_3;
import celestial.rw_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MM
extends rl_3
implements rw_3 {
    public Object[] id_byte;
    private static short[] id_break;
    private static boolean[] id_protected;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-111, -105, -64, 66, -93, 117, 29, 36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public MM() {
        this.id_catch();
    }

    static {
        MM.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x806CFFD3;
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32, List<xc_3> list) {
        this.id_catch();
        return ((xc_3[][][])this.id_byte[id_break[0]])[n][n3][n2];
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3) {
        this.id_catch();
        return ((xc_3[][][])this.id_byte[id_break[1]])[n][n3][n2];
    }

    @Override
    public xc_3[] id_class(int n, int n2) {
        this.id_catch();
        return ((xc_3[][][])this.id_byte[id_break[2]])[n][n2];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB15A1CCCBCF1620AL;
    }

    private static void id_throws() {
        id_protected = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        MM.id_throws();
        MM.id_case();
    }

    private void id_catch() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[0]];
        }
    }

    private static void id_case() {
        id_break = new short[3];
    }
}

