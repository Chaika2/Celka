/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C;
import celestial.C_class;
import celestial.Pv_1;
import celestial.rrfZ_2;
import celestial.rrfv_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BM
extends Pv_1 {
    private static short[] id_byte;
    private static String[] id_protected;
    public static Object[] id_break;
    private static byte[] id_throws;
    private static boolean[] id_case;

    private static void id_byte() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_byte = sArray;
    }

    public BM(C_class c_class) {
        super(c_class);
    }

    static {
        BM.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC0FEC579;
    }

    @Override
    public void id_class(C c) {
        super.id_class(c);
        boolean bl = rrfZ_2.id_byte();
        if (!bl) {
            return;
        }
        String string = c.id_class().toLowerCase().trim();
        if ((((Pattern)id_break[id_byte[0]]).matcher(string).find() || ((Pattern)id_break[id_byte[1]]).matcher(string).find()) && rrfv_3.id_class(string, id_case[0])) {
            c.id_break();
        }
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{Pattern.compile(id_protected[0], 0), Pattern.compile(id_protected[1])};
        id_break = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD3831135E37A50C2L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{56, -83, -109, 79, 69, -109, -79, 76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_throws = new byte[]{2};
    }

    private static void id_throws() {
        id_protected = new String[]{new String("^/(an|anarchy|grf|grief)(\\d+).*"), new String("^/(hub).*")};
    }

    private static /* synthetic */ void ntfClinit() {
        BM.id_protected();
        BM.id_throws();
        BM.id_byte();
        BM.id_break();
        BM.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_case = blArray;
    }
}

