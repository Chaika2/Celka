/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLY;
import celestial.rdn_3;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFi_1 {
    private static byte[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    public static Object[] id_break;
    private static boolean[] id_throws;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrFi_1()};
        id_break = objectArray;
    }

    public rrFi_1() {
        this.id_case();
    }

    static {
        rrFi_1.ntfClinit();
    }

    public static rrFi_1 id_class(rdn_3 rdn_32, List<rLY> list) {
        rrFi_1 rrFi_12 = rrFi_1.id_break(rdn_32, list);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[5]]).id_finally().id_class(rrFi_12);
        return rrFi_12;
    }

    public void id_class(List<rLY> list) {
        List<rLY> list2;
        this.id_class[rrFi_1.id_protected[9]] = list2 = list;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x944420DA0A92E470L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{17, 83, -106, -100, -123, -95, -70, -115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF64EA61;
    }

    public void id_class(rdn_3 rdn_32) {
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrFi_1.id_protected[8]] = rdn_33;
    }

    public rdn_3 id_class() {
        return (rdn_3)this.id_class[id_protected[6]];
    }

    private static rrFi_1 id_break(rdn_3 rdn_32, List<rLY> list) {
        List<rLY> list2;
        rdn_3 rdn_33 = rdn_32;
        ((rrFi_1)rrFi_1.id_break[rrFi_1.id_protected[0]]).id_class[rrFi_1.id_protected[1]] = rdn_33;
        ((rrFi_1)rrFi_1.id_break[rrFi_1.id_protected[2]]).id_class[rrFi_1.id_protected[3]] = list2 = list;
        return (rrFi_1)id_break[id_protected[4]];
    }

    public List<rLY> id_break() {
        return (List)this.id_class[id_protected[7]];
    }

    private static void id_throws() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrFi_1.id_protected();
        rrFi_1.id_catch();
        rrFi_1.id_throws();
        rrFi_1.id_byte();
    }

    private static void id_catch() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        id_protected = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }
}

