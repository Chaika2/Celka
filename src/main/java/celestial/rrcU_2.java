/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNw_1;
import celestial.rrcD_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcU_2
extends rrfI_2<Boolean> {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static String[] id_protected;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcU_2(rrcD_2 rrcD_22, rrNw_1 rrNw_12) {
        this.id_throws();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcU_2.id_byte[0]] = rrNw_13;
    }

    static {
        rrcU_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCDFC05B2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1A97402850069695L;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, 44, 8, -15, 64, 29, -107, 67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Boolean id_break() {
        this.id_throws();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[1]]).id_throws();
        rdn_3 rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_byte[2]]).id_protected() : rJY2.id_class();
        return rdn_32.id_continue().getString().equals(id_protected[0]) || rdn_32.id_protected(id_protected[1]) ? id_break[0] : id_break[1];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[2]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrcU_2.id_catch();
        rrcU_2.id_case();
        rrcU_2.id_protected();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    private static void id_case() {
        id_protected = new String[]{new String("[\u2605] \u0421\u0435\u0440\u0435\u0431\u0440\u043e"), new String("isSilver")};
    }

    private static void id_protected() {
        id_byte = new short[3];
    }
}

