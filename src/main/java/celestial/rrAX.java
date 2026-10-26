/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.PX;
import celestial.cb_3;
import celestial.rrQX;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAX
implements MinecraftAccessor {
    private static short[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    public Object[] id_break;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrAX()};
        id_class = objectArray;
    }

    public rrAX() {
        this.id_protected();
    }

    static {
        rrAX.ntfClinit();
    }

    public static rrAX id_class() {
        rrAX rrAX2 = rrAX.id_break(new PX(((Float)((cb_3)rrAX.id_import.id_class[rrAX.id_byte[3]]).id_throws[id_byte[4]]).floatValue(), ((Float)((cb_3)rrAX.id_import.id_class[rrAX.id_byte[5]]).id_throws[id_byte[6]]).floatValue()));
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(rrAX2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[8]]).id_class(rrAX2);
        return rrAX2;
    }

    public void id_class(PX pX) {
        PX pX2 = pX;
        this.id_break[rrAX.id_byte[9]] = pX2;
        Float f = Float.valueOf(pX.id_throws());
        ((cb_3)rrAX.id_import.id_class[rrAX.id_byte[10]]).id_private[rrAX.id_byte[11]] = f;
        Float f2 = Float.valueOf(pX.id_protected());
        ((cb_3)rrAX.id_import.id_class[rrAX.id_byte[12]]).id_private[rrAX.id_byte[13]] = f2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCA8EF84EA9DA5F33L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{7, -94, -82, 113, 50, -46, 0, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC2217207;
    }

    public static rrAX id_break(PX pX) {
        PX pX2 = pX;
        ((rrAX)rrAX.id_class[rrAX.id_byte[0]]).id_break[rrAX.id_byte[1]] = pX2;
        return (rrAX)id_class[id_byte[2]];
    }

    public PX id_break() {
        return (PX)this.id_break[id_byte[14]];
    }

    private static void id_throws() {
        short[] sArray = new short[15];
        sArray[3] = 57;
        sArray[4] = 15;
        sArray[5] = 57;
        sArray[6] = 16;
        sArray[10] = 57;
        sArray[11] = 25;
        sArray[12] = 57;
        sArray[13] = 26;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAX.id_case();
        rrAX.id_throws();
        rrAX.id_byte();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
        }
    }
}

