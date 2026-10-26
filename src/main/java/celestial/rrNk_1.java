/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rrIk_1;
import celestial.rrNX;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrfA_2;
import celestial.util.FuntimeEnchantment;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNk_1 {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[1]];
            objectArray[rrNk_1.id_protected[3]] = id_protected[4];
            objectArray[rrNk_1.id_break[2]] = id_protected[5];
            objectArray[rrNk_1.id_break[3]] = id_protected[6];
            objectArray[rrNk_1.id_break[4]] = id_protected[7];
            objectArray[rrNk_1.id_break[5]] = id_protected[8];
            objectArray[rrNk_1.id_break[6]] = id_protected[9];
            objectArray[rrNk_1.id_break[7]] = id_protected[10];
            objectArray[rrNk_1.id_break[8]] = id_protected[11];
        }
    }

    public rrNk_1 id_byte(String string) {
        String string2 = string;
        this.id_class[rrNk_1.id_byte[48]] = string2;
        return this;
    }

    public rrNk_1 id_byte(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrNk_1.id_byte[49]] = bl2;
        return this;
    }

    public rrNk_1 id_byte(List<String> list) {
        ((List)this.id_class[id_byte[46]]).addAll(list);
        return this;
    }

    public rrNk_1 id_byte(FuntimeEnchantment funtimeEnchantment) {
        ((List)this.id_class[id_byte[29]]).add(funtimeEnchantment);
        return this;
    }

    public rrNk_1 id_byte(rrfA_2 rrfA_22) {
        ((List)this.id_class[id_byte[30]]).add(rrfA_22);
        return this;
    }

    public rrNk_1 id_byte(int n) {
        Integer n2 = n;
        this.id_class[rrNk_1.id_byte[55]] = n2;
        return this;
    }

    public rrNk_1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        this.id_byte();
        Integer n = id_protected[0];
        this.id_class[rrNk_1.id_byte[0]] = n;
        Integer n2 = id_break[0];
        this.id_class[rrNk_1.id_byte[1]] = n2;
        this.id_class[rrNk_1.id_byte[2]] = arrayList13 = new ArrayList();
        this.id_class[rrNk_1.id_byte[3]] = arrayList12 = new ArrayList();
        this.id_class[rrNk_1.id_byte[4]] = arrayList11 = new ArrayList();
        this.id_class[rrNk_1.id_byte[5]] = arrayList10 = new ArrayList();
        this.id_class[rrNk_1.id_byte[6]] = arrayList9 = new ArrayList();
        this.id_class[rrNk_1.id_byte[7]] = arrayList8 = new ArrayList();
        this.id_class[rrNk_1.id_byte[8]] = arrayList7 = new ArrayList();
        this.id_class[rrNk_1.id_byte[9]] = arrayList6 = new ArrayList();
        this.id_class[rrNk_1.id_byte[10]] = arrayList5 = new ArrayList();
        this.id_class[rrNk_1.id_byte[11]] = arrayList4 = new ArrayList();
        this.id_class[rrNk_1.id_byte[12]] = arrayList3 = new ArrayList();
        this.id_class[rrNk_1.id_byte[13]] = arrayList2 = new ArrayList();
        this.id_class[rrNk_1.id_byte[14]] = arrayList = new ArrayList();
        Boolean bl = id_protected[1];
        this.id_class[rrNk_1.id_byte[15]] = bl;
    }

    static {
        rrNk_1.ntfClinit();
    }

    public rrNk_1 id_class(rrIk_1 rrIk_12) {
        rrIk_1 rrIk_13 = rrIk_12;
        this.id_class[rrNk_1.id_byte[54]] = rrIk_13;
        return this;
    }

    public rrNk_1 id_class(rrcT_2<?> rrcT_22) {
        ((List)this.id_class[id_byte[42]]).add(rrcT_22);
        return this;
    }

    public rrNk_1 id_class() {
        Boolean bl = id_protected[2];
        this.id_class[rrNk_1.id_byte[58]] = bl;
        return this;
    }

    public rrNk_1 id_class(rrNw_1 rrNw_12) {
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrNk_1.id_byte[50]] = rrNw_13;
        return this;
    }

    public rrNk_1 id_class(rdn_3 rdn_32) {
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrNk_1.id_byte[44]] = rdn_33;
        return this;
    }

    public rrNk_1 id_class(rrNX rrNX2) {
        rrNX rrNX3 = rrNX2;
        this.id_class[rrNk_1.id_byte[51]] = rrNX3;
        return this;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCAD353FA5D17B587L;
    }

    public rrNk_1 id_class(rrfA_2 rrfA_22) {
        ((List)this.id_class[id_byte[23]]).add(rrfA_22);
        return this;
    }

    public rrNk_1 id_class(List<String> list) {
        ((List)this.id_class[id_byte[39]]).addAll(list);
        return this;
    }

    public rrNk_1 id_class(rdb_3 rdb_32) {
        rdb_3 rdb_33 = rdb_32;
        this.id_class[rrNk_1.id_byte[16]] = rdb_33;
        return this;
    }

    public rrNk_1 id_class(int n) {
        Integer n2 = n;
        this.id_class[rrNk_1.id_byte[17]] = n2;
        return this;
    }

    public rrNk_1 id_class(String string) {
        ((List)this.id_class[id_byte[38]]).add(string);
        return this;
    }

    public rrNk_1 id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrNk_1.id_byte[56]] = bl2;
        return this;
    }

    public rrNk_1 id_class(FuntimeEnchantment funtimeEnchantment) {
        ((List)this.id_class[id_byte[25]]).add(funtimeEnchantment);
        return this;
    }

    public rrNk_1 id_break(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrNk_1.id_byte[57]] = bl2;
        return this;
    }

    public rrNk_1 id_break(String string) {
        String string2 = string;
        this.id_class[rrNk_1.id_byte[47]] = string2;
        return this;
    }

    public rrNk_1 id_break(int n) {
        Integer n2 = n;
        this.id_class[rrNk_1.id_byte[19]] = n2;
        return this;
    }

    public rrNk_1 id_break(List<FuntimeEnchantment> list) {
        ((List)this.id_class[id_byte[27]]).addAll(list);
        return this;
    }

    public rrNd_1 id_break() {
        return new rrNd_1(this);
    }

    public rrNk_1 id_break(FuntimeEnchantment funtimeEnchantment) {
        ((List)this.id_class[id_byte[26]]).add(funtimeEnchantment);
        return this;
    }

    public rrNk_1 id_break(rrfA_2 rrfA_22) {
        ((List)this.id_class[id_byte[31]]).add(rrfA_22);
        return this;
    }

    public rrNk_1 id_throws(List<rrfA_2> list) {
        ((List)this.id_class[id_byte[21]]).addAll(list);
        return this;
    }

    private static int id_throws(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x148EDB81;
    }

    private static void id_throws() {
        short[] sArray = new short[59];
        sArray[0] = 3;
        sArray[1] = 4;
        sArray[2] = 5;
        sArray[3] = 6;
        sArray[4] = 7;
        sArray[5] = 8;
        sArray[6] = 9;
        sArray[7] = 10;
        sArray[8] = 11;
        sArray[9] = 12;
        sArray[10] = 13;
        sArray[11] = 14;
        sArray[12] = 15;
        sArray[13] = 16;
        sArray[14] = 18;
        sArray[15] = 25;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 5;
        sArray[21] = 6;
        sArray[22] = 7;
        sArray[23] = 5;
        sArray[24] = 8;
        sArray[25] = 8;
        sArray[26] = 9;
        sArray[27] = 9;
        sArray[28] = 10;
        sArray[29] = 10;
        sArray[30] = 6;
        sArray[31] = 7;
        sArray[32] = 11;
        sArray[33] = 11;
        sArray[34] = 12;
        sArray[35] = 12;
        sArray[36] = 13;
        sArray[37] = 13;
        sArray[38] = 14;
        sArray[39] = 14;
        sArray[40] = 15;
        sArray[41] = 15;
        sArray[42] = 16;
        sArray[43] = 16;
        sArray[44] = 17;
        sArray[45] = 18;
        sArray[46] = 18;
        sArray[47] = 19;
        sArray[48] = 20;
        sArray[49] = 21;
        sArray[50] = 22;
        sArray[51] = 23;
        sArray[52] = 25;
        sArray[53] = 26;
        sArray[54] = 28;
        sArray[55] = 4;
        sArray[56] = 27;
        sArray[57] = 24;
        sArray[58] = 24;
        id_byte = sArray;
    }

    public rrNk_1 id_throws(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrNk_1.id_byte[53]] = bl2;
        return this;
    }

    public rrNk_1 id_throws(String string) {
        ((List)this.id_class[id_byte[35]]).add(string);
        return this;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNk_1.id_protected();
        rrNk_1.id_throws();
        rrNk_1.id_case();
    }

    public rrNk_1 id_finally(List<FuntimeEnchantment> list) {
        ((List)this.id_class[id_byte[28]]).addAll(list);
        return this;
    }

    public rrNk_1 id_catch(List<rrcT_2<?>> list) {
        ((List)this.id_class[id_byte[43]]).addAll(list);
        return this;
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-128, -33, 0, 106, -5, 9, 108, -77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrNk_1 id_extends(List<String> list) {
        ((List)this.id_class[id_byte[37]]).addAll(list);
        return this;
    }

    private static void id_case() {
        id_break = new byte[]{50, 29, 2, 3, 4, 21, 24, 25, 26};
    }

    public rrNk_1 id_case(List<String> list) {
        ((List)this.id_class[id_byte[34]]).addAll(list);
        return this;
    }

    public rrNk_1 id_case(String string) {
        ((List)this.id_class[id_byte[40]]).add(string);
        return this;
    }

    public rrNk_1 id_implements(String string) {
        ((List)this.id_class[id_byte[45]]).add(string);
        return this;
    }

    public rrNk_1 id_implements(List<FuntimeEnchantment> list) {
        ((List)this.id_class[id_byte[24]]).addAll(list);
        return this;
    }

    public rrNk_1 id_protected(String string) {
        ((List)this.id_class[id_byte[33]]).add(string);
        return this;
    }

    public rrNk_1 id_protected(int n) {
        Integer n2 = n;
        this.id_class[rrNk_1.id_byte[18]] = n2;
        return this;
    }

    public rrNk_1 id_protected(List<rrfA_2> list) {
        ((List)this.id_class[id_byte[22]]).addAll(list);
        return this;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[12];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    public rrNk_1 id_protected(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrNk_1.id_byte[52]] = bl2;
        return this;
    }

    public rrNk_1 id_private(String string) {
        ((List)this.id_class[id_byte[36]]).add(string);
        return this;
    }

    public rrNk_1 id_private(List<String> list) {
        ((List)this.id_class[id_byte[32]]).addAll(list);
        return this;
    }

    public rrNk_1 id_volatile(List<String> list) {
        ((List)this.id_class[id_byte[41]]).addAll(list);
        return this;
    }

    public rrNk_1 id_native(List<rrfA_2> list) {
        ((List)this.id_class[id_byte[20]]).addAll(list);
        return this;
    }
}

