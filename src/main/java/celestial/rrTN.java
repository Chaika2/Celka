/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rJr_1;
import celestial.rXA;
import celestial.rXi_1;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rrTc_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTN
extends rJr_1
implements rXi_1 {
    public static Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_catch;
    public Object[] id_break;

    private void id_byte() {
        this.id_throws();
        for (int i = id_byte[1]; i < id_catch[3]; ++i) {
            for (int j = id_byte[2]; j < id_catch[4]; ++j) {
                int n = j + i * id_catch[5];
                int n2 = id_catch[6] + j * id_catch[7];
                int n3 = id_catch[8] + i * id_catch[9];
                this.id_break(new rrTc_1((rXu_1)this.id_break[id_protected[1]], n, n2, n3));
            }
        }
    }

    public rrTN(List<rdn_3> list) {
        super(null, id_catch[0]);
        this.id_throws();
        rXu_1 rXu_12 = this.id_break(list);
        this.id_break[rrTN.id_protected[0]] = rXu_12;
        this.id_byte();
    }

    static {
        rrTN.ntfClinit();
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return id_byte[4];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-44, 110, -117, -33, -105, 63, -26, 78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        return rdn_3.id_break;
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return id_byte[3];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x540A7FDC23158031L;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{27};
        id_class = objectArray;
    }

    private rXu_1 id_break(List<rdn_3> list) {
        rXA rXA2 = new rXA(id_catch[1]);
        for (int i = id_byte[0]; i < Math.min(list.size(), id_catch[2]); ++i) {
            rdn_3 rdn_32 = list.get(i);
            if (rdn_32 == null || rdn_32.id_class()) continue;
            rXA2.id_break(i, rdn_32.id_implements());
        }
        return rXA2;
    }

    private void id_throws() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrTN.id_class();
        rrTN.id_case();
        rrTN.id_protected();
        rrTN.id_break();
    }

    private static void id_case() {
        id_protected = new short[2];
    }

    private static int id_protected(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB04BAFFD;
    }

    private static void id_protected() {
        id_catch = new byte[]{-1, 27, 27, 3, 9, 9, 8, 18, 18, 18, 27};
    }
}

