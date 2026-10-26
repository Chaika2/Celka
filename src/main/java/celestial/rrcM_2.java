/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rrNw_1;
import celestial.rrcb_3;
import celestial.rrfE_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcM_2
extends rrfI_2<rrfE_2> {
    private static boolean[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;
    private static short[] id_protected;

    @Override
    public boolean id_byte() {
        this.id_case();
        return this.id_break() == (rrfE_2)((Object)((rrcb_3)this.id_class[rrcM_2.id_protected[4]]).id_class[id_protected[5]]) ? id_break[0] : id_break[1];
    }

    public rrcM_2(rrcb_3 rrcb_32, rrNw_1 rrNw_12) {
        this.id_case();
        rrcb_3 rrcb_33 = rrcb_32;
        this.id_class[rrcM_2.id_protected[0]] = rrcb_33;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcM_2.id_protected[1]] = rrNw_13;
    }

    static {
        rrcM_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7D23107AAD4C4E18L;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2E249642;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{117, 4, -115, -108, -46, 107, -89, -122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrfE_2 id_break() {
        this.id_case();
        rJY rJY2 = ((rrNw_1)this.id_class[id_protected[2]]).id_throws();
        return rrfE_2.id_class(rJY2 == null ? ((rrNw_1)this.id_class[id_protected[3]]).id_protected() : rJY2.id_class());
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcM_2.id_throws();
        rrcM_2.id_protected();
        rrcM_2.id_catch();
    }

    private static void id_catch() {
        id_byte = new byte[]{2};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[4] = 1;
        id_protected = sArray;
    }
}

