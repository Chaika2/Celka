/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rrqB_2;
import celestial.rrqr_3;
import celestial.rrqs_3;
import celestial.uR_2;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqP_2
implements rrqr_3 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static String[] id_throws;
    private static float[] id_case;
    public Object[] id_class;

    @Override
    public rgP_2 id_byte() {
        return ((rrqs_3)this.id_class[id_protected[9]]).id_byte().id_class();
    }

    private static void id_int() {
        short[] sArray = new short[22];
        sArray[0] = 4;
        sArray[1] = 5;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 3;
        sArray[7] = 4;
        sArray[8] = 4;
        sArray[9] = 3;
        sArray[10] = 3;
        sArray[11] = 5;
        sArray[12] = 5;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 4;
        sArray[21] = 5;
        id_protected = sArray;
    }

    public rrqP_2(rrqB_2 rrqB_22, Aw_1 aw_1, String string) {
        this.id_continue();
        rgN_2 rgN_22 = new rgN_2(id_throws[0]);
        this.id_class[rrqP_2.id_protected[0]] = rgN_22;
        AnimValue animValue = new AnimValue(id_case[0], id_byte[0]);
        this.id_class[rrqP_2.id_protected[1]] = animValue;
        rrqB_2 rrqB_23 = rrqB_22;
        this.id_class[rrqP_2.id_protected[2]] = rrqB_23;
        Aw_1 aw_12 = aw_1;
        this.id_class[rrqP_2.id_protected[3]] = aw_12;
        String string2 = string;
        this.id_class[rrqP_2.id_protected[4]] = string2;
        rrqs_3 rrqs_32 = new rrqs_3(this);
        this.id_class[rrqP_2.id_protected[5]] = rrqs_32;
    }

    static {
        rrqP_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[4];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[5];
        }
        rrqP_2 rrqP_22 = (rrqP_2)object;
        return Objects.equals(((Aw_1)this.id_class[id_protected[13]]).id_class().getName(), ((Aw_1)rrqP_22.id_class[id_protected[14]]).id_class().getName());
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[6]];
        objectArray[rrqP_2.id_byte[7]] = ((Aw_1)this.id_class[id_protected[15]]).id_class().getName();
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFFA6B5C413ECCFC9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x33B7BC81;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-20, -77, -101, 97, 111, 101, 45, 123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_protected[11]]).id_class(bl);
    }

    public Aw_1 id_class() {
        return (Aw_1)this.id_class[id_protected[16]];
    }

    @Override
    public AnimValue id_break() {
        return (AnimValue)this.id_class[id_protected[21]];
    }

    @Override
    public boolean id_throws() {
        return id_byte[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrqP_2.id_final();
        rrqP_2.id_package();
        rrqP_2.id_int();
        rrqP_2.id_volatile();
        rrqP_2.id_new();
    }

    public rrqs_3 id_finally() {
        return (rrqs_3)this.id_class[id_protected[19]];
    }

    @Override
    public boolean id_catch() {
        return !((AnimValue)this.id_class[id_protected[12]]).id_new() ? id_byte[1] : id_byte[2];
    }

    public String id_extends() {
        return (String)this.id_class[id_protected[17]];
    }

    public rrqB_2 id_case() {
        return (rrqB_2)this.id_class[id_protected[18]];
    }

    private void id_continue() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
        }
    }

    public rVi_1 id_implements() {
        rgP_2 rgP_22 = uR_2.id_break((Aw_1)this.id_class[id_protected[6]]);
        rgN_2 rgN_22 = new rgN_2(id_throws[1]);
        rgN_2 rgN_23 = new rgN_2(id_throws[2]);
        if (!rgN_22.id_protected().isEmpty()) {
            rgN_23.id_class(rgN_22);
        }
        if (!((rgN_2)this.id_class[id_protected[7]]).id_protected().isEmpty()) {
            rgN_23.id_class((rgN_2)this.id_class[id_protected[8]]);
        }
        rgN_23.id_class(rgP_22);
        return rgN_23;
    }

    private static void id_new() {
        id_break = new byte[]{6};
    }

    private static void id_package() {
        id_throws = new String[]{new String(""), new String(""), new String("")};
    }

    @Override
    public /* synthetic */ rgP_2 id_protected() {
        return this.id_implements();
    }

    @Override
    public String id_private() {
        return ((rrqs_3)this.id_class[id_protected[10]]).id_byte().id_break();
    }

    private static void id_final() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    private static void id_volatile() {
        id_case = new float[]{0.5f};
    }

    public rgN_2 id_native() {
        return (rgN_2)this.id_class[id_protected[20]];
    }
}

