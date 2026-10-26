/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.rdn_3;
import celestial.rql_3;
import celestial.rrvK;
import celestial.rrvU;
import celestial.util.AnimValue;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvD
implements rrvU {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static float[] id_throws;

    @Override
    public boolean id_byte() {
        return id_byte[3];
    }

    public rrvD(rdn_3 rdn_32) {
        this.id_final();
        AnimValue animValue = new AnimValue(id_throws[0], id_byte[0]);
        this.id_class[rrvD.id_break[0]] = animValue;
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrvD.id_break[1]] = rdn_33;
        String string = rrvK.id_byte(rdn_32.id_continue().id_byte());
        this.id_class[rrvD.id_break[2]] = string;
        String string2 = this.id_extends();
        this.id_class[rrvD.id_break[3]] = string2;
        Integer n = this.id_implements();
        this.id_class[rrvD.id_break[4]] = n;
    }

    static {
        rrvD.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[5];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[6];
        }
        rrvD rrvD2 = (rrvD)object;
        return Objects.equals(((rdn_3)this.id_class[id_break[17]]).id_continue(), ((rdn_3)rrvD2.id_class[id_break[18]]).id_continue());
    }

    public int hashCode() {
        return Objects.hashCode(((rdn_3)this.id_class[id_break[19]]).id_continue());
    }

    @Override
    public String id_class() {
        return (String)this.id_class[id_break[6]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x74C5532F340AD980L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC631D603;
    }

    @Override
    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_break[7]]).id_class(bl);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{8, 77, 85, 104, 119, 35, 115, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public AnimValue id_break() {
        return (AnimValue)this.id_class[id_break[22]];
    }

    public void id_throws() {
        Integer n = this.id_implements();
        this.id_class[rrvD.id_break[9]] = n;
        String string = this.id_extends();
        this.id_class[rrvD.id_break[10]] = string;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvD.id_volatile();
        rrvD.id_native();
        rrvD.id_finally();
        rrvD.id_package();
    }

    private static void id_finally() {
        short[] sArray = new short[23];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 4;
        sArray[8] = 3;
        sArray[9] = 3;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[15] = 57;
        sArray[21] = 3;
        sArray[22] = 4;
        id_break = sArray;
    }

    @Override
    public boolean id_catch() {
        return (Integer)this.id_class[id_break[8]] > 0 ? id_byte[1] : id_byte[2];
    }

    private String id_extends() {
        return rql_3.id_class((Integer)this.id_class[id_break[11]]);
    }

    @Override
    public String id_case() {
        return (String)this.id_class[id_break[5]];
    }

    public int id_implements() {
        if ((cb_3)MinecraftAccessor.id_import.id_class[id_break[12]] == null) {
            return id_byte[4];
        }
        return Math.max(((cb_3)MinecraftAccessor.id_import.id_class[id_break[13]]).sK().id_protected(((rdn_3)this.id_class[id_break[14]]).id_break()), ((cb_3)MinecraftAccessor.id_import.id_class[id_break[15]]).r().id_byte((rdn_3)this.id_class[id_break[16]]));
    }

    private static void id_package() {
        id_protected = new byte[]{5, 3};
    }

    public int id_protected() {
        return (Integer)this.id_class[id_break[21]];
    }

    public rdn_3 id_private() {
        return (rdn_3)this.id_class[id_break[20]];
    }

    private void id_final() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrvD.id_protected[1]] = id_byte[7];
        }
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private static void id_native() {
        id_throws = new float[]{0.5f};
    }
}

