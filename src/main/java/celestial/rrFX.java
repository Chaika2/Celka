/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rVi_1;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rnO_2;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFX {
    private static boolean[] id_break;
    public Object[] id_class;
    private static float[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    private static String[] id_case;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3053967B;
    }

    public rdn_3 id_byte() {
        return (rdn_3)this.id_class[id_throws[16]];
    }

    public rrFX(iB_2 iB_22, rdn_3 rdn_32) {
        this.id_finally();
        AnimValue animValue = new AnimValue(id_byte[0], id_break[0]);
        this.id_class[rrFX.id_throws[0]] = animValue;
        iB_2 iB_23 = iB_22;
        this.id_class[rrFX.id_throws[1]] = iB_23;
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrFX.id_throws[2]] = rdn_33;
        Integer n = rdn_32.id_char();
        this.id_class[rrFX.id_throws[3]] = n;
    }

    static {
        rrFX.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[4];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[5];
        }
        rrFX rrFX2 = (rrFX)object;
        return Objects.equals((iB_2)this.id_class[id_throws[9]], (iB_2)rrFX2.id_class[id_throws[10]]) && Objects.equals(((rdn_3)this.id_class[id_throws[11]]).id_continue().getString(), ((rdn_3)rrFX2.id_class[id_throws[12]]).id_continue().getString()) ? id_break[6] : id_break[7];
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_protected[1]];
        objectArray[rrFX.id_break[8]] = (iB_2)this.id_class[id_throws[13]];
        objectArray[rrFX.id_break[9]] = ((rdn_3)this.id_class[id_throws[14]]).id_continue().getString();
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3C9A95C8CE9D3E97L;
    }

    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_throws[4]]).id_class(bl);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{46, 125, 60, 50, 118, 32, -99, -92}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(int n) {
        Integer n2 = n;
        this.id_class[rrFX.id_throws[20]] = n2;
    }

    public iB_2 id_class() {
        return (iB_2)this.id_class[id_throws[15]];
    }

    public int id_break() {
        return (Integer)this.id_class[id_throws[18]];
    }

    public void id_break(int n) {
        Integer n2 = n;
        this.id_class[rrFX.id_throws[21]] = n2;
    }

    public rVi_1 id_throws() {
        rgN_2 rgN_22 = new rgN_2(id_case[0]);
        rnO_2[] rnO_2Array = new rnO_2[id_protected[0]];
        rnO_2Array[rrFX.id_break[1]] = rnO_2.PREFIX;
        rnO_2Array[rrFX.id_break[2]] = rnO_2.NAME;
        rgN_22.id_class(((iB_2)this.id_class[id_throws[5]]).id_class(rnO_2Array)).id_break(rgF_2.GRAY + " \u00bb ").id_class(((rdn_3)this.id_class[id_throws[6]]).id_continue());
        if ((Integer)this.id_class[id_throws[7]] > id_break[3]) {
            rgN_22.id_break(rgF_2.RED + " x" + (Integer)this.id_class[id_throws[8]]);
        }
        return rgN_22;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFX.id_catch();
        rrFX.id_private();
        rrFX.id_native();
        rrFX.id_extends();
        rrFX.id_implements();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[2]];
            objectArray[rrFX.id_protected[3]] = id_break[10];
            objectArray[rrFX.id_protected[4]] = id_break[11];
        }
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[12];
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_break = blArray;
    }

    private static void id_extends() {
        short[] sArray = new short[22];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 4;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[19] = 4;
        sArray[20] = 2;
        sArray[21] = 3;
        id_throws = sArray;
    }

    public int id_case() {
        return (Integer)this.id_class[id_throws[17]];
    }

    private static void id_implements() {
        id_protected = new byte[]{2, 2, 5, 2, 3};
    }

    public AnimValue id_protected() {
        return (AnimValue)this.id_class[id_throws[19]];
    }

    private static void id_private() {
        id_case = new String[]{new String("")};
    }

    private static void id_native() {
        id_byte = new float[]{0.5f};
    }
}

