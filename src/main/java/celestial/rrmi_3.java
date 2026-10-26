/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrfY_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmi_3 {
    private static byte[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static boolean[] id_throws;

    public rdn_3 id_byte() {
        return (rdn_3)this.id_class[id_protected[15]];
    }

    public rrmi_3() {
        this.id_implements();
        Integer n = id_break[5];
        this.id_class[rrmi_3.id_protected[10]] = n;
        rdb_3 rdb_32 = rdy_3.id_class;
        this.id_class[rrmi_3.id_protected[11]] = rdb_32;
        rdn_3 rdn_32 = rdn_3.id_break;
        this.id_class[rrmi_3.id_protected[12]] = rdn_32;
    }

    static {
        rrmi_3.ntfClinit();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return id_throws[2];
        }
        if (!(object instanceof rrmi_3)) {
            return id_throws[3];
        }
        rrmi_3 rrmi_32 = (rrmi_3)object;
        if (!rrmi_32.id_class(this)) {
            return id_throws[4];
        }
        if (this.id_break() != rrmi_32.id_break()) {
            return id_throws[5];
        }
        rdb_3 rdb_32 = this.id_protected();
        rdb_3 rdb_33 = rrmi_32.id_protected();
        if (rdb_32 == null ? rdb_33 != null : !rdb_32.equals(rdb_33)) {
            return id_throws[6];
        }
        rdn_3 rdn_32 = this.id_byte();
        rdn_3 rdn_33 = rrmi_32.id_byte();
        if (rdn_32 == null ? rdn_33 != null : !rdn_32.equals(rdn_33)) {
            return id_throws[7];
        }
        return id_throws[8];
    }

    public String toString() {
        return "SavedItemData(savedSlot=" + this.id_break() + ", savedItem=" + this.id_protected() + ", savedStack=" + this.id_byte() + ")";
    }

    public int hashCode() {
        byte by = id_break[6];
        int n = id_throws[9];
        n = n * id_break[7] + this.id_break();
        rdb_3 rdb_32 = this.id_protected();
        n = n * id_break[8] + (rdb_32 == null ? id_break[9] : rdb_32.hashCode());
        rdn_3 rdn_32 = this.id_byte();
        n = n * id_break[10] + (rdn_32 == null ? id_break[11] : rdn_32.hashCode());
        return n;
    }

    public boolean id_class() {
        return (Integer)this.id_class[id_protected[3]] != id_break[0] && (rdb_3)this.id_class[id_protected[4]] != rdy_3.id_class ? id_throws[0] : id_throws[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, 85, 102, -52, 126, 67, 81, -87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class(Object object) {
        return object instanceof rrmi_3;
    }

    public void id_class(rdn_3 rdn_32) {
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrmi_3.id_protected[18]] = rdn_33;
    }

    public void id_class(rdn_3 rdn_32, int n) {
        Integer n2 = n;
        this.id_class[rrmi_3.id_protected[0]] = n2;
        rdb_3 rdb_32 = rdn_32.id_break();
        this.id_class[rrmi_3.id_protected[1]] = rdb_32;
        rdn_3 rdn_33 = rdn_32.id_implements();
        this.id_class[rrmi_3.id_protected[2]] = rdn_33;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5C5397E412252724L;
    }

    public int id_class(boolean bl, String ... stringArray) {
        if (!this.id_class()) {
            return id_break[1];
        }
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(id_byte[0]);
        if (stringArray != null && stringArray.length > 0) {
            hashSet.addAll(Arrays.asList(stringArray));
        }
        int n = rrfY_2.id_class((rdn_3)this.id_class[id_protected[5]], (rdb_3)this.id_class[id_protected[6]], hashSet);
        return bl ? (n >= 0 && n < id_break[2] ? n + id_break[3] : n) : n;
    }

    public void id_class(int n) {
        Integer n2 = n;
        this.id_class[rrmi_3.id_protected[16]] = n2;
    }

    public void id_class(rdb_3 rdb_32) {
        rdb_3 rdb_33 = rdb_32;
        this.id_class[rrmi_3.id_protected[17]] = rdb_33;
    }

    public int id_break() {
        return (Integer)this.id_class[id_protected[13]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x76FEF6C2;
    }

    public void id_throws() {
        Integer n = id_break[4];
        this.id_class[rrmi_3.id_protected[7]] = n;
        rdb_3 rdb_32 = rdy_3.id_class;
        this.id_class[rrmi_3.id_protected[8]] = rdb_32;
        rdn_3 rdn_32 = rdn_3.id_break;
        this.id_class[rrmi_3.id_protected[9]] = rdn_32;
    }

    private static /* synthetic */ void ntfClinit() {
        rrmi_3.id_private();
        rrmi_3.id_finally();
        rrmi_3.id_catch();
        rrmi_3.id_case();
    }

    private static void id_finally() {
        id_byte = new String[]{new String("Damage")};
    }

    private static void id_catch() {
        short[] sArray = new short[19];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[17] = 1;
        sArray[18] = 2;
        id_protected = sArray;
    }

    private static void id_case() {
        id_break = new byte[]{-1, -1, 9, 36, -1, -1, 59, 59, 59, 43, 59, 43, 3};
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[12]];
            objectArray[rrmi_3.id_throws[10]] = id_throws[11];
        }
    }

    public rdb_3 id_protected() {
        return (rdb_3)this.id_class[id_protected[14]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[12];
        blArray[0] = true;
        blArray[2] = true;
        blArray[8] = true;
        blArray[9] = true;
        id_throws = blArray;
    }
}

