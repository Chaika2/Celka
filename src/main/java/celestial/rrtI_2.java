/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrtu_3;
import celestial.rrtw_3;
import celestial.rruv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtI_2 {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static float[] id_protected;
    private static boolean[] id_throws;

    public float id_byte() {
        return ((rrtw_3)this.id_class[id_break[11]]).id_final();
    }

    public rrtI_2(rrtw_3 rrtw_32) {
        this.id_catch();
        rrtw_3 rrtw_33 = rrtw_32;
        this.id_class[rrtI_2.id_break[0]] = rrtw_33;
    }

    static {
        rrtI_2.ntfClinit();
    }

    public boolean id_class(rrtu_3 rrtu_32, float f, float f2, int n, int n2, int n3) {
        if (!((rrtw_3)this.id_class[id_break[2]]).id_return().id_protected()) {
            return id_throws[0];
        }
        boolean bl = ((rrtw_3)this.id_class[id_break[3]]).id_class(rrtu_32, this, f, f2, n, n2, n3);
        if (!bl && n3 < id_byte[0]) {
            ((rrtw_3)this.id_class[id_break[4]]).id_class(!((rrtw_3)this.id_class[id_break[5]]).id_class() ? id_throws[1] : id_throws[2]);
        }
        return bl;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE4E36DC4D7C7198EL;
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3) {
        if (!((rrtw_3)this.id_class[id_break[6]]).id_return().id_case()) {
            return id_throws[3];
        }
        if (rrtu_32.id_class(((rrtw_3)this.id_class[id_break[7]]).id_private(), n, n2)) {
            ((rrtw_3)this.id_class[id_break[8]]).id_class(id_throws[4]);
            return id_throws[5];
        }
        return id_throws[6];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x37E5AD7B;
    }

    public void id_class(Ml_1 ml_1, int n, int n2) {
        ((rrtw_3)this.id_class[id_break[1]]).id_class(ml_1, this, n, n2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{24, 119, 44, -99, 22, -121, -66, -75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public float id_class() {
        return Math.max(id_protected[0], ((rrtw_3)this.id_class[id_break[12]]).id_class(id_protected[1], id_protected[2]));
    }

    public float id_break() {
        return ((rrtw_3)this.id_class[id_break[9]]).id_package() + ((rrtw_3)this.id_class[id_break[10]]).id_new() - this.id_private();
    }

    public float id_throws() {
        return this.id_private();
    }

    private static /* synthetic */ void ntfClinit() {
        rrtI_2.id_case();
        rrtI_2.id_finally();
        rrtI_2.id_implements();
        rrtI_2.id_extends();
    }

    private static void id_finally() {
        id_break = new short[14];
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[7]];
        }
    }

    private static void id_extends() {
        id_byte = new byte[]{3};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_throws = blArray;
    }

    private static void id_implements() {
        float[] fArray = new float[3];
        fArray[0] = 10.0f;
        fArray[1] = 10.0f;
        id_protected = fArray;
    }

    public rruv_1 id_protected() {
        return new rruv_1(this.id_break(), this.id_byte(), this.id_throws(), this.id_class());
    }

    private float id_private() {
        return ((rrtw_3)this.id_class[id_break[13]]).id_public();
    }
}

