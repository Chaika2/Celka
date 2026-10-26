/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rrNw_1;
import celestial.rrcX_2;
import celestial.rrfI_2;
import celestial.rrfM_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcJ_2
extends rrfI_2<rrfM_2> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    @Override
    public boolean id_byte() {
        this.id_case();
        return this.id_break() == (rrfM_2)((Object)((rrcX_2)this.id_class[rrcJ_2.id_byte[4]]).id_class[id_byte[5]]) ? id_break[0] : id_break[1];
    }

    public rrcJ_2(rrcX_2 rrcX_22, rrNw_1 rrNw_12) {
        this.id_case();
        rrcX_2 rrcX_23 = rrcX_22;
        this.id_class[rrcJ_2.id_byte[0]] = rrcX_23;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcJ_2.id_byte[1]] = rrNw_13;
    }

    static {
        rrcJ_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5D752631;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{61, 30, -94, -43, -88, 32, 117, 21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x913A5BAE7C47FF78L;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public rrfM_2 id_break() {
        this.id_case();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
        return rrfM_2.id_class(rJY2 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : rJY2.id_class());
    }

    private static void id_throws() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[4] = 1;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcJ_2.id_protected();
        rrcJ_2.id_throws();
        rrcJ_2.id_catch();
    }

    private static void id_catch() {
        id_protected = new byte[]{2};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_break = blArray;
    }
}

