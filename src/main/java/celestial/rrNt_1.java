/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNV;
import celestial.rrNw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNt_1
extends rrNw_1 {
    private static short[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;

    public rrNV id_byte() {
        this.id_finally();
        return (rrNV)this.id_class[id_byte[0]];
    }

    public rrNt_1(rdn_3 rdn_32) {
        super(rdn_32);
        this.id_finally();
    }

    public rrNt_1(rdn_3 rdn_32, String string, int n) {
        super(rdn_32, string, n);
        this.id_finally();
    }

    public rrNt_1(rJY rJY2, String string, int n) {
        super(rJY2, string, n);
        this.id_finally();
    }

    static {
        rrNt_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-40, -24, -73, 12, -18, 117, 37, -51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrNV rrNV2) {
        this.id_finally();
        rrNV rrNV3 = rrNV2;
        this.id_class[rrNt_1.id_byte[3]] = rrNV3;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC6308ABD99CE3278L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE566319A;
    }

    public void id_class(List<rrNt_1> list) {
        List<rrNt_1> list2;
        this.id_finally();
        this.id_class[rrNt_1.id_byte[4]] = list2 = list;
    }

    public List<rJY> id_class() {
        this.id_finally();
        return (List)this.id_class[id_byte[2]];
    }

    public void id_break(List<rJY> list) {
        List<rJY> list2;
        this.id_finally();
        this.id_class[rrNt_1.id_byte[5]] = list2 = list;
    }

    public List<rrNt_1> id_break() {
        this.id_finally();
        return (List)this.id_class[id_byte[1]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrNt_1.id_private();
        rrNt_1.id_implements();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_implements() {
        id_protected = new byte[]{3};
    }

    private static void id_private() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_byte = sArray;
    }
}

