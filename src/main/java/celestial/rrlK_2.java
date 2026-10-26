/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gm_3;
import celestial.rHu_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlK_2 {
    private static byte[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static long[] id_protected;
    private static short[] id_throws;

    public boolean id_byte() {
        return (Boolean)this.id_class[id_throws[6]];
    }

    public rrlK_2(rHu_1 rHu_12) {
        this.id_extends();
        rHu_1 rHu_13 = rHu_12;
        this.id_class[rrlK_2.id_throws[0]] = rHu_13;
    }

    static {
        rrlK_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[1];
        }
        rrlK_2 rrlK_22 = (rrlK_2)object;
        return this.id_case().equals(rrlK_22.id_case());
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[2]];
        objectArray[rrlK_2.id_byte[3]] = this.id_case();
        return Objects.hash(objectArray);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{33, 127, 56, 37, -115, 11, -114, 28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(long l) {
        Long l2 = l;
        this.id_class[rrlK_2.id_throws[7]] = l2;
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrlK_2.id_throws[8]] = bl2;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDA336750;
    }

    public xc_3 id_class() {
        return ((rHu_1)this.id_class[id_throws[3]]).id_abstract();
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9985C815D73705DDL;
    }

    public long id_break() {
        return (Long)this.id_class[id_throws[5]];
    }

    public rHu_1 id_throws() {
        return (rHu_1)this.id_class[id_throws[4]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrlK_2.id_private();
        rrlK_2.id_catch();
        rrlK_2.id_implements();
        rrlK_2.id_finally();
    }

    private static void id_finally() {
        id_break = new byte[]{3, 2};
    }

    private static void id_catch() {
        id_protected = new long[1];
    }

    private void id_extends() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[1] = 0L;
            this.id_class[2] = false;
        }
    }

    public rfH_2 id_case() {
        return ((rHu_1)this.id_class[id_throws[2]]).id_char();
    }

    private static void id_implements() {
        short[] sArray = new short[9];
        sArray[1] = 56;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        id_throws = sArray;
    }

    public rfl_3 id_protected() {
        xc_3 xc_32 = this.id_class();
        rfH_2 rfH_22 = this.id_case();
        rjC_2 rjC_22 = xc_32.id_break().id_class(xc_32, (rRq_1)((gm_3)MinecraftAccessor.id_import.id_class[id_throws[1]]), rfH_22, rjm_3.id_break());
        return rjC_22.id_class().id_class(rfH_22);
    }

    private static void id_private() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }
}

