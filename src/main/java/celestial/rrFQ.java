/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLK;
import celestial.rLY;
import celestial.rgF_2;
import celestial.rrFz_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFQ
implements rrFz_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static float[] id_throws;
    public Object[] id_class;

    @Override
    public boolean id_byte() {
        return id_protected[5];
    }

    private static void id_int() {
        id_throws = new float[]{0.5f, 1.0f};
    }

    public rrFQ(rLY rLY2) {
        this.id_final();
        AnimValue animValue = new AnimValue(id_throws[0], id_protected[0]);
        this.id_class[rrFQ.id_byte[0]] = animValue;
        rLY rLY3 = rLY2;
        this.id_class[rrFQ.id_byte[1]] = rLY3;
        String string = this.id_extends();
        this.id_class[rrFQ.id_byte[2]] = string;
        String string2 = this.id_native();
        this.id_class[rrFQ.id_byte[3]] = string2;
    }

    static {
        rrFQ.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[6];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[7];
        }
        rrFQ rrFQ2 = (rrFQ)object;
        return Objects.equals(((rLY)this.id_class[id_byte[12]]).id_class(), ((rLY)rrFQ2.id_class[id_byte[13]]).id_class());
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_protected[8]];
        objectArray[rrFQ.id_protected[9]] = ((rLY)this.id_class[id_byte[14]]).id_class();
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x98174D8C25FE9C7L;
    }

    @Override
    public AnimValue id_class() {
        return (AnimValue)this.id_class[id_byte[18]];
    }

    public void id_class(rLY rLY2) {
        rLY rLY3 = rLY2;
        this.id_class[rrFQ.id_byte[10]] = rLY3;
        this.id_case();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, -28, -33, -14, 80, 53, -119, -33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE3FA7A7A;
    }

    @Override
    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_byte[4]]).id_class(bl);
    }

    @Override
    public String id_break() {
        return (String)this.id_class[id_byte[17]];
    }

    @Override
    public boolean id_throws() {
        return !((AnimValue)this.id_class[id_byte[11]]).id_new() ? id_protected[3] : id_protected[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rrFQ.id_volatile();
        rrFQ.id_int();
        rrFQ.id_finally();
        rrFQ.id_package();
    }

    private static void id_finally() {
        short[] sArray = new short[19];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[11] = 3;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 3;
        id_byte = sArray;
    }

    public void id_catch() {
        String string = this.id_native();
        this.id_class[rrFQ.id_byte[5]] = string;
    }

    private String id_extends() {
        int n = Math.max(id_protected[1], ((rLY)this.id_class[id_byte[8]]).id_byte()) + id_protected[2];
        return ((rLY)this.id_class[id_byte[9]]).id_final() + " " + this.id_implements() + n;
    }

    public void id_case() {
        String string = this.id_extends();
        this.id_class[rrFQ.id_byte[6]] = string;
    }

    public rgF_2 id_implements() {
        return rgF_2.RED;
    }

    private static void id_package() {
        id_break = new byte[]{4};
    }

    @Override
    public String id_protected() {
        return (String)this.id_class[id_byte[16]];
    }

    public rLY id_private() {
        return (rLY)this.id_class[id_byte[15]];
    }

    private void id_final() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[10];
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[8] = true;
        id_protected = blArray;
    }

    private String id_native() {
        return rLK.id_class((rLY)this.id_class[id_byte[7]], id_throws[1]);
    }
}

