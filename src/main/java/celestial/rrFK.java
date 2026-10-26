/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rgP_2;
import celestial.rrFD;
import celestial.rrQX;
import celestial.rrfc_3;
import celestial.rrfp_3;
import celestial.rud_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFK {
    public Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;
    private static String[] id_case;
    public static Object[] id_break;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public rrFK() {
        this.id_throws();
        rgP_2 rgP_22 = rgP_2.id_byte(id_case[0]);
        this.id_class[rrFK.id_throws[0]] = rgP_22;
        rrFD rrFD2 = (rrFD)((Object)rrFD.staticFields1658baa549203f63991cdcef51acf497[id_throws[1]]);
        this.id_class[rrFK.id_throws[2]] = rrFD2;
    }

    static {
        rrFK.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC2DB9E6;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{122, -86, -7, 31, -49, 30, -13, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9A4F45F090B8F8AAL;
    }

    public static rrFK id_class(rrFD rrFD2, rgP_2 rgP_22) {
        rgP_2 rgP_23 = rgP_22;
        ((rrFK)rrFK.id_break[rrFK.id_throws[3]]).id_class[rrFK.id_throws[4]] = rgP_23;
        rrFD rrFD3 = rrFD2;
        ((rrFK)rrFK.id_break[rrFK.id_throws[5]]).id_class[rrFK.id_throws[6]] = rrFD3;
        return (rrFK)id_break[id_throws[7]];
    }

    public rrFD id_class() {
        return (rrFD)((Object)this.id_class[id_throws[13]]);
    }

    public static void id_class(rrFD rrFD2, rgP_2 rgP_22, rud_3 rud_32) {
        rrFK rrFK2 = rrFK.id_class(rrFD2, rgP_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[8]]).id_finally().id_class(rrFK2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[9]]).id_class(rrFK2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[10]]).id_byte().id_class(rrFK2);
        rrfp_3.id_break(rrFD2 == (rrFD)((Object)rrFD.staticFields1658baa549203f63991cdcef51acf497[id_throws[11]]) ? rrfp_3.id_break() : null, rud_32);
        rrfc_3.id_class();
    }

    public rgP_2 id_break() {
        return (rgP_2)this.id_class[id_throws[12]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFK.id_private();
        rrFK.id_catch();
        rrFK.id_protected();
        rrFK.id_byte();
        rrFK.id_case();
    }

    private static void id_catch() {
        id_case = new String[]{new String("")};
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrFK()};
        id_break = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[14];
        sArray[2] = 1;
        sArray[6] = 1;
        sArray[13] = 1;
        id_throws = sArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }
}

