/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.iB_2;
import celestial.rLY;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLI {
    public static Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;

    public iB_2 id_byte() {
        return (iB_2)this.id_break[id_byte[9]];
    }

    public rrLI() {
        this.id_case();
    }

    static {
        rrLI.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x72654190;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7576DB54B208C537L;
    }

    public boolean id_class() {
        return (Boolean)this.id_break[id_byte[11]];
    }

    public static rrLI id_class(iB_2 iB_22, rLY rLY2, boolean bl) {
        iB_2 iB_23 = iB_22;
        ((rrLI)rrLI.id_class[rrLI.id_byte[0]]).id_break[rrLI.id_byte[1]] = iB_23;
        rLY rLY3 = rLY2;
        ((rrLI)rrLI.id_class[rrLI.id_byte[2]]).id_break[rrLI.id_byte[3]] = rLY3;
        Boolean bl2 = bl;
        ((rrLI)rrLI.id_class[rrLI.id_byte[4]]).id_break[rrLI.id_byte[5]] = bl2;
        return (rrLI)id_class[id_byte[6]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{77, 100, -28, 122, 127, -95, -26, 96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_break(iB_2 iB_22, rLY rLY2, boolean bl) {
        rrLI rrLI2 = rrLI.id_class(iB_22, rLY2, bl);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(rrLI2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[8]]).id_class(rrLI2);
    }

    public rLY id_break() {
        return (rLY)this.id_break[id_byte[10]];
    }

    private static void id_throws() {
        short[] sArray = new short[12];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLI.id_protected();
        rrLI.id_throws();
        rrLI.id_private();
        rrLI.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrLI()};
        id_class = objectArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrLI.id_throws[1]] = id_protected[1];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }

    private static void id_private() {
        id_throws = new byte[]{3, 2};
    }
}

