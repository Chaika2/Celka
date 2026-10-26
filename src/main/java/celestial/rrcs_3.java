/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rrNw_1;
import celestial.rrcS_2;
import celestial.rrfI_2;
import celestial.rrfs_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcs_3
extends rrfI_2<rrfs_3> {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;

    @Override
    public boolean id_byte() {
        this.id_catch();
        return this.id_break() == (rrfs_3)((Object)((rrcS_2)this.id_class[rrcs_3.id_byte[4]]).id_class[id_byte[5]]) ? id_protected[0] : id_protected[1];
    }

    public rrcs_3(rrcS_2 rrcS_22, rrNw_1 rrNw_12) {
        this.id_catch();
        rrcS_2 rrcS_23 = rrcS_22;
        this.id_class[rrcs_3.id_byte[0]] = rrcS_23;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcs_3.id_byte[1]] = rrNw_13;
    }

    static {
        rrcs_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x204B1B9A39FAD29DL;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{89, -90, 4, -122, -7, 121, -84, -115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAE71C6C2;
    }

    public rrfs_3 id_break() {
        this.id_catch();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
        return rrfs_3.id_class(rJY2 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : rJY2.id_class());
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcs_3.id_throws();
        rrcs_3.id_protected();
        rrcs_3.id_case();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_case() {
        id_break = new byte[]{2};
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[4] = 1;
        id_byte = sArray;
    }
}

