/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQO;
import celestial.rrzH_2;
import celestial.rrzf_3;
import celestial.rrzi_3;
import celestial.rrzt_3;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.security.Key;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzY_2
extends rrzi_3
implements rrzt_3 {
    private static byte[] id_throws;
    private static boolean[] id_case;
    private static long[] id_catch;
    private static String[] id_private;
    private static short[] id_implements;
    public Object[] id_class;
    private static int[] id_finally;
    public static Object[] id_break;

    public int id_byte(OutputStream outputStream) throws IOException {
        this.id_final();
        rrQO.id_break(outputStream, (Long)rrzH_2.id_class[id_implements[169]]);
        rrQO.id_break(outputStream, (Long)this.id_class[id_implements[170]]);
        if ((Long)this.id_class[id_implements[171]] >= id_catch[47] || (Long)this.id_class[id_implements[172]] >= id_catch[48]) {
            rrQO.id_class(outputStream, (Long)this.id_class[id_implements[173]]);
            rrQO.id_class(outputStream, (Long)this.id_class[id_implements[174]]);
            return id_throws[42];
        }
        rrQO.id_break(outputStream, (Long)this.id_class[id_implements[175]]);
        rrQO.id_break(outputStream, (Long)this.id_class[id_implements[176]]);
        return id_throws[43];
    }

    @Override
    public byte[] id_byte() {
        this.id_final();
        if ((byte[])this.id_class[id_implements[226]] != null) {
            return Arrays.copyOf((byte[])this.id_class[id_implements[227]], ((byte[])this.id_class[id_implements[228]]).length);
        }
        return null;
    }

    private static void id_int() {
        short[] sArray = new short[234];
        sArray[0] = 2;
        sArray[1] = 5;
        sArray[2] = 6;
        sArray[3] = 7;
        sArray[4] = 8;
        sArray[5] = 9;
        sArray[6] = 10;
        sArray[7] = 11;
        sArray[8] = 12;
        sArray[9] = 2;
        sArray[10] = 8;
        sArray[11] = 9;
        sArray[12] = 7;
        sArray[13] = 10;
        sArray[14] = 12;
        sArray[15] = 11;
        sArray[16] = 6;
        sArray[17] = 2;
        sArray[18] = 5;
        sArray[19] = 1;
        sArray[20] = 6;
        sArray[21] = 2;
        sArray[22] = 5;
        sArray[23] = 6;
        sArray[24] = 7;
        sArray[25] = 8;
        sArray[26] = 9;
        sArray[27] = 10;
        sArray[28] = 11;
        sArray[29] = 12;
        sArray[31] = 2;
        sArray[32] = 2;
        sArray[33] = 3;
        sArray[34] = 3;
        sArray[35] = 9;
        sArray[36] = 9;
        sArray[37] = 8;
        sArray[38] = 8;
        sArray[39] = 7;
        sArray[40] = 7;
        sArray[41] = 10;
        sArray[42] = 10;
        sArray[43] = 12;
        sArray[44] = 12;
        sArray[45] = 11;
        sArray[46] = 11;
        sArray[47] = 6;
        sArray[48] = 6;
        sArray[49] = 13;
        sArray[50] = 13;
        sArray[51] = 14;
        sArray[52] = 14;
        sArray[53] = 15;
        sArray[54] = 15;
        sArray[55] = 5;
        sArray[56] = 5;
        sArray[57] = 2;
        sArray[58] = 2;
        sArray[59] = 5;
        sArray[60] = 6;
        sArray[61] = 7;
        sArray[62] = 8;
        sArray[63] = 9;
        sArray[64] = 10;
        sArray[65] = 11;
        sArray[66] = 12;
        sArray[67] = 6;
        sArray[68] = 6;
        sArray[69] = 5;
        sArray[70] = 768;
        sArray[71] = 255;
        sArray[72] = 21;
        sArray[73] = 3;
        sArray[74] = 3;
        sArray[75] = 4;
        sArray[76] = 6;
        sArray[77] = 7;
        sArray[78] = 10;
        sArray[79] = 11;
        sArray[80] = 12;
        sArray[81] = 4095;
        sArray[82] = 5;
        sArray[83] = 14;
        sArray[86] = 2;
        sArray[87] = 2;
        sArray[88] = 1;
        sArray[89] = 1;
        sArray[90] = 13;
        sArray[91] = 15;
        sArray[92] = 11;
        sArray[93] = 12;
        sArray[94] = 14;
        sArray[95] = 2;
        sArray[98] = 13;
        sArray[99] = 13;
        sArray[100] = 15;
        sArray[101] = 15;
        sArray[102] = 11;
        sArray[103] = 12;
        sArray[104] = 14;
        sArray[105] = 13;
        sArray[106] = 13;
        sArray[107] = 21589;
        sArray[109] = 12;
        sArray[110] = 4;
        sArray[111] = 6;
        sArray[112] = 7;
        sArray[113] = 10;
        sArray[114] = 15;
        sArray[115] = 5;
        sArray[116] = 5;
        sArray[117] = 12;
        sArray[118] = 11;
        sArray[119] = 14;
        sArray[120] = 7;
        sArray[121] = 8;
        sArray[122] = 9;
        sArray[123] = 21589;
        sArray[124] = 9;
        sArray[125] = 7;
        sArray[126] = 13;
        sArray[127] = 13;
        sArray[128] = 15;
        sArray[129] = 15;
        sArray[130] = 2;
        sArray[133] = 13;
        sArray[134] = 13;
        sArray[135] = 10;
        sArray[136] = 4;
        sArray[137] = 4;
        sArray[138] = 6;
        sArray[139] = 7;
        sArray[140] = 11;
        sArray[141] = 12;
        sArray[142] = 4;
        sArray[143] = 6;
        sArray[144] = 7;
        sArray[145] = 10;
        sArray[146] = 11;
        sArray[147] = 12;
        sArray[148] = 13;
        sArray[149] = 13;
        sArray[150] = 21589;
        sArray[152] = 8;
        sArray[153] = 9;
        sArray[154] = 12;
        sArray[155] = 11;
        sArray[156] = 7;
        sArray[157] = 8;
        sArray[158] = 9;
        sArray[159] = 21589;
        sArray[160] = 8;
        sArray[161] = 9;
        sArray[162] = 7;
        sArray[163] = 8;
        sArray[164] = 8;
        sArray[165] = 9;
        sArray[166] = 9;
        sArray[167] = 13;
        sArray[168] = 13;
        sArray[169] = 11;
        sArray[170] = 10;
        sArray[171] = 11;
        sArray[172] = 12;
        sArray[173] = 11;
        sArray[174] = 12;
        sArray[175] = 11;
        sArray[176] = 12;
        sArray[177] = 13;
        sArray[178] = 13;
        sArray[179] = 13;
        sArray[180] = 13;
        sArray[181] = 12;
        sArray[182] = 13;
        sArray[183] = 12;
        sArray[184] = 11;
        sArray[185] = 13;
        sArray[186] = 11;
        sArray[187] = 14;
        sArray[188] = 13;
        sArray[189] = 14;
        sArray[190] = 13;
        sArray[191] = 13;
        sArray[192] = 13;
        sArray[193] = 7;
        sArray[194] = 13;
        sArray[195] = 8;
        sArray[196] = 13;
        sArray[197] = 9;
        sArray[198] = 6;
        sArray[199] = 13;
        sArray[200] = 7;
        sArray[201] = 14;
        sArray[202] = 13;
        sArray[203] = 13;
        sArray[204] = 13;
        sArray[205] = 13;
        sArray[206] = 13;
        sArray[207] = 13;
        sArray[208] = 14;
        sArray[209] = 14;
        sArray[210] = 21589;
        sArray[211] = 7;
        sArray[212] = 8;
        sArray[213] = 9;
        sArray[214] = 1024;
        sArray[215] = 9;
        sArray[216] = 7;
        sArray[217] = 9;
        sArray[218] = 8;
        sArray[219] = 7;
        sArray[220] = 8;
        sArray[221] = 7;
        sArray[222] = 12;
        sArray[223] = 11;
        sArray[224] = 10;
        sArray[225] = 6;
        sArray[226] = 13;
        sArray[227] = 13;
        sArray[228] = 13;
        sArray[229] = 15;
        sArray[230] = 15;
        sArray[231] = 15;
        sArray[232] = 5;
        sArray[233] = 5;
        id_implements = sArray;
    }

    public rrzY_2(rrzf_3 rrzf_32, rrzi_3 rrzi_32) throws IOException {
        this.id_final();
        Integer n = id_case[5];
        this.id_class[rrzY_2.id_implements[58]] = n;
        Integer n2 = id_throws[4];
        this.id_class[rrzY_2.id_implements[59]] = n2;
        Integer n3 = id_throws[5];
        this.id_class[rrzY_2.id_implements[60]] = n3;
        Long l = id_catch[15];
        this.id_class[rrzY_2.id_implements[61]] = l;
        Long l2 = id_catch[16];
        this.id_class[rrzY_2.id_implements[62]] = l2;
        Long l3 = id_catch[17];
        this.id_class[rrzY_2.id_implements[63]] = l3;
        Long l4 = id_catch[18];
        this.id_class[rrzY_2.id_implements[64]] = l4;
        Long l5 = id_catch[19];
        this.id_class[rrzY_2.id_implements[65]] = l5;
        Long l6 = id_catch[20];
        this.id_class[rrzY_2.id_implements[66]] = l6;
        this.id_class(rrzf_32, rrzi_32);
    }

    public rrzY_2(byte[] byArray, boolean bl, int n) {
        this.id_final();
        Integer n2 = id_case[0];
        this.id_class[rrzY_2.id_implements[0]] = n2;
        Integer n3 = id_throws[0];
        this.id_class[rrzY_2.id_implements[1]] = n3;
        Integer n4 = id_throws[1];
        this.id_class[rrzY_2.id_implements[2]] = n4;
        Long l = id_catch[0];
        this.id_class[rrzY_2.id_implements[3]] = l;
        Long l2 = id_catch[1];
        this.id_class[rrzY_2.id_implements[4]] = l2;
        Long l3 = id_catch[2];
        this.id_class[rrzY_2.id_implements[5]] = l3;
        Long l4 = id_catch[3];
        this.id_class[rrzY_2.id_implements[6]] = l4;
        Long l5 = id_catch[4];
        this.id_class[rrzY_2.id_implements[7]] = l5;
        Long l6 = id_catch[5];
        this.id_class[rrzY_2.id_implements[8]] = l6;
        this.id_break(byArray);
        Boolean bl2 = bl;
        this.id_protected[rrzY_2.id_implements[9]] = bl2;
        long l7 = System.currentTimeMillis();
        Long l8 = l7;
        this.id_class[rrzY_2.id_implements[10]] = l8;
        Long l9 = l7;
        this.id_class[rrzY_2.id_implements[11]] = l9;
        Long l10 = l7;
        this.id_class[rrzY_2.id_implements[12]] = l10;
        Long l11 = id_catch[6];
        this.id_class[rrzY_2.id_implements[13]] = l11;
        Long l12 = id_catch[7];
        this.id_class[rrzY_2.id_implements[14]] = l12;
        Long l13 = id_catch[8];
        this.id_class[rrzY_2.id_implements[15]] = l13;
        Integer n5 = n;
        this.id_class[rrzY_2.id_implements[16]] = n5;
    }

    public rrzY_2(rrzY_2 rrzY_22, int n, int n2) {
        this(rrzY_22, n);
        Integer n3 = n2;
        this.id_class[rrzY_2.id_implements[20]] = n3;
    }

    public rrzY_2(byte[] byArray, Path path, int n, FileAttribute<?> ... fileAttributeArray) {
        this(byArray, n, id_case[2], id_case[3], fileAttributeArray);
        Path path2 = path;
        this.id_class[rrzY_2.id_implements[19]] = path2;
    }

    public rrzY_2(byte[] byArray, int n, boolean bl, int n2, FileAttribute<?> ... fileAttributeArray) {
        this(byArray, bl, n2);
        Integer n3 = n;
        this.id_class[rrzY_2.id_implements[17]] = n3;
        FileAttribute<?>[] fileAttributeArray2 = fileAttributeArray;
        int n4 = fileAttributeArray2.length;
        for (int i = id_case[1]; i < n4; ++i) {
            FileAttribute<?> fileAttribute = fileAttributeArray2[i];
            String string = fileAttribute.name();
            if (!string.equals(id_private[0])) continue;
            Integer n5 = rrQO.id_class((Set)fileAttribute.value());
            this.id_class[rrzY_2.id_implements[18]] = n5;
        }
    }

    public rrzY_2(rrzY_2 rrzY_22, int n) {
        this.id_final();
        Integer n2 = id_case[4];
        this.id_class[rrzY_2.id_implements[21]] = n2;
        Integer n3 = id_throws[2];
        this.id_class[rrzY_2.id_implements[22]] = n3;
        Integer n4 = id_throws[3];
        this.id_class[rrzY_2.id_implements[23]] = n4;
        Long l = id_catch[9];
        this.id_class[rrzY_2.id_implements[24]] = l;
        Long l2 = id_catch[10];
        this.id_class[rrzY_2.id_implements[25]] = l2;
        Long l3 = id_catch[11];
        this.id_class[rrzY_2.id_implements[26]] = l3;
        Long l4 = id_catch[12];
        this.id_class[rrzY_2.id_implements[27]] = l4;
        Long l5 = id_catch[13];
        this.id_class[rrzY_2.id_implements[28]] = l5;
        Long l6 = id_catch[14];
        this.id_class[rrzY_2.id_implements[29]] = l6;
        this.id_break((byte[])rrzY_22.id_protected[id_implements[30]]);
        Boolean bl = (boolean)((Boolean)rrzY_22.id_protected[id_implements[31]]);
        this.id_protected[rrzY_2.id_implements[32]] = bl;
        Integer n5 = (int)((Integer)rrzY_22.id_class[id_implements[33]]);
        this.id_class[rrzY_2.id_implements[34]] = n5;
        Long l7 = (long)((Long)rrzY_22.id_class[id_implements[35]]);
        this.id_class[rrzY_2.id_implements[36]] = l7;
        Long l8 = (long)((Long)rrzY_22.id_class[id_implements[37]]);
        this.id_class[rrzY_2.id_implements[38]] = l8;
        Long l9 = (long)((Long)rrzY_22.id_class[id_implements[39]]);
        this.id_class[rrzY_2.id_implements[40]] = l9;
        Long l10 = (long)((Long)rrzY_22.id_class[id_implements[41]]);
        this.id_class[rrzY_2.id_implements[42]] = l10;
        Long l11 = (long)((Long)rrzY_22.id_class[id_implements[43]]);
        this.id_class[rrzY_2.id_implements[44]] = l11;
        Long l12 = (long)((Long)rrzY_22.id_class[id_implements[45]]);
        this.id_class[rrzY_2.id_implements[46]] = l12;
        Integer n6 = (int)((Integer)rrzY_22.id_class[id_implements[47]]);
        this.id_class[rrzY_2.id_implements[48]] = n6;
        byte[] byArray = (byte[])rrzY_22.id_class[id_implements[49]];
        this.id_class[rrzY_2.id_implements[50]] = byArray;
        Long l13 = (long)((Long)rrzY_22.id_class[id_implements[51]]);
        this.id_class[rrzY_2.id_implements[52]] = l13;
        byte[] byArray2 = (byte[])rrzY_22.id_class[id_implements[53]];
        this.id_class[rrzY_2.id_implements[54]] = byArray2;
        Integer n7 = (int)((Integer)rrzY_22.id_class[id_implements[55]]);
        this.id_class[rrzY_2.id_implements[56]] = n7;
        Integer n8 = n;
        this.id_class[rrzY_2.id_implements[57]] = n8;
    }

    static {
        rrzY_2.ntfClinit();
    }

    @Override
    public long size() {
        this.id_final();
        return (Long)this.id_class[id_implements[222]];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(id_implements[214]);
        Formatter formatter = new Formatter(stringBuilder);
        Object[] objectArray = new Object[id_case[52]];
        objectArray[rrzY_2.id_case[53]] = this.id_private();
        formatter.format(id_private[5], objectArray);
        Object[] objectArray2 = new Object[id_case[54]];
        objectArray2[rrzY_2.id_case[55]] = this.creationTime().toMillis();
        formatter.format(id_private[6], objectArray2);
        Object[] objectArray3 = new Object[id_case[56]];
        objectArray3[rrzY_2.id_case[57]] = this.lastAccessTime().toMillis();
        formatter.format(id_private[7], objectArray3);
        Object[] objectArray4 = new Object[id_case[58]];
        objectArray4[rrzY_2.id_case[59]] = this.lastModifiedTime().toMillis();
        formatter.format(id_private[8], objectArray4);
        Object[] objectArray5 = new Object[id_case[60]];
        objectArray5[rrzY_2.id_case[61]] = this.isRegularFile();
        formatter.format(id_private[9], objectArray5);
        Object[] objectArray6 = new Object[id_case[62]];
        objectArray6[rrzY_2.id_case[63]] = this.isDirectory();
        formatter.format(id_private[10], objectArray6);
        Object[] objectArray7 = new Object[id_case[64]];
        objectArray7[rrzY_2.id_case[65]] = this.isSymbolicLink();
        formatter.format(id_private[11], objectArray7);
        Object[] objectArray8 = new Object[id_case[66]];
        objectArray8[rrzY_2.id_case[67]] = this.isOther();
        formatter.format(id_private[12], objectArray8);
        Object[] objectArray9 = new Object[id_case[68]];
        objectArray9[rrzY_2.id_case[69]] = this.fileKey();
        formatter.format(id_private[13], objectArray9);
        Object[] objectArray10 = new Object[id_case[70]];
        objectArray10[rrzY_2.id_case[71]] = this.size();
        formatter.format(id_private[14], objectArray10);
        Object[] objectArray11 = new Object[id_case[72]];
        objectArray11[rrzY_2.id_case[73]] = this.id_protected();
        formatter.format(id_private[15], objectArray11);
        Object[] objectArray12 = new Object[id_case[74]];
        objectArray12[rrzY_2.id_case[75]] = this.id_case();
        formatter.format(id_private[16], objectArray12);
        Object[] objectArray13 = new Object[id_case[76]];
        objectArray13[rrzY_2.id_case[77]] = this.id_break();
        formatter.format(id_private[17], objectArray13);
        Set set = this.id_class().orElse(null);
        if (set != null) {
            Object[] objectArray14 = new Object[id_case[78]];
            objectArray14[rrzY_2.id_case[79]] = set;
            formatter.format(id_private[18], objectArray14);
        }
        formatter.close();
        return stringBuilder.toString();
    }

    private void id_class(rrzf_3 rrzf_32, rrzi_3 rrzi_32) throws IOException {
        this.id_final();
        byte[] byArray = (byte[])rrzf_32.id_break[id_implements[72]];
        int n = (Integer)rrzi_32.id_protected[id_implements[73]];
        if (!rrzH_2.id_break(byArray, n)) {
            throw new ZipException(id_private[2]);
        }
        Integer n2 = rrzH_2.id_interface(byArray, n);
        this.id_class[rrzY_2.id_implements[74]] = n2;
        Integer n3 = rrzH_2.id_else(byArray, n);
        this.id_class[rrzY_2.id_implements[75]] = n3;
        Integer n4 = rrzH_2.id_synchronized(byArray, n);
        this.id_class[rrzY_2.id_implements[76]] = n4;
        Long l = rrQO.id_break(rrzH_2.id_volatile(byArray, n));
        this.id_class[rrzY_2.id_implements[77]] = l;
        Long l2 = rrzH_2.id_protected(byArray, n);
        this.id_class[rrzY_2.id_implements[78]] = l2;
        Long l3 = rrzH_2.id_finally(byArray, n);
        this.id_class[rrzY_2.id_implements[79]] = l3;
        Long l4 = rrzH_2.id_int(byArray, n);
        this.id_class[rrzY_2.id_implements[80]] = l4;
        int n5 = rrzH_2.id_super(byArray, n);
        int n6 = rrzH_2.id_instanceof(byArray, n);
        int n7 = rrzH_2.id_implements(byArray, n);
        if (rrzH_2.id_private(byArray, n) == id_throws[10]) {
            Integer n8 = rrzH_2.id_byte(byArray, n) & id_implements[81];
            this.id_class[rrzY_2.id_implements[82]] = n8;
        }
        Long l5 = rrzH_2.id_throw(byArray, n);
        this.id_class[rrzY_2.id_implements[83]] = l5;
        n += 46;
        byte[] byArray2 = (byte[])rrzi_32.id_protected[id_implements[84]];
        this.id_protected[rrzY_2.id_implements[85]] = byArray2;
        Boolean bl = (boolean)((Boolean)rrzi_32.id_protected[id_implements[86]]);
        this.id_protected[rrzY_2.id_implements[87]] = bl;
        Integer n9 = (int)((Integer)rrzi_32.id_protected[id_implements[88]]);
        this.id_protected[rrzY_2.id_implements[89]] = n9;
        n += n5;
        if (n6 > 0) {
            byte[] byArray3 = Arrays.copyOfRange(byArray, n, n + n6);
            this.id_class[rrzY_2.id_implements[90]] = byArray3;
            n += n6;
            this.id_break(rrzf_32);
        }
        if (n7 > 0) {
            byte[] byArray4 = Arrays.copyOfRange(byArray, n, n + n7);
            this.id_class[rrzY_2.id_implements[91]] = byArray4;
        }
    }

    public int id_class(OutputStream outputStream) throws IOException {
        int n;
        this.id_final();
        long l = (Long)this.id_class[id_implements[92]];
        long l2 = (Long)this.id_class[id_implements[93]];
        long l3 = (Long)this.id_class[id_implements[94]];
        int n2 = id_case[6];
        byte by = id_case[7];
        byte by2 = id_case[8];
        boolean bl = id_case[9];
        byte[] byArray = (Boolean)this.id_protected[id_implements[95]] != false ? rrQO.id_class((byte[])this.id_protected[id_implements[96]]) : (byte[])this.id_protected[id_implements[97]];
        int n3 = byArray != null ? byArray.length - id_case[10] : id_case[11];
        int n4 = (byte[])this.id_class[id_implements[98]] != null ? ((byte[])this.id_class[id_implements[99]]).length : id_case[12];
        int n5 = id_case[13];
        int n6 = n = (byte[])this.id_class[id_implements[100]] != null ? ((byte[])this.id_class[id_implements[101]]).length : id_case[14];
        if ((Long)this.id_class[id_implements[102]] >= id_catch[21]) {
            l = id_catch[22];
            n2 += 8;
        }
        if ((Long)this.id_class[id_implements[103]] >= id_catch[23]) {
            l2 = id_catch[24];
            n2 += 8;
        }
        if ((Long)this.id_class[id_implements[104]] >= id_catch[25]) {
            l3 = id_catch[26];
            n2 += 8;
        }
        if (n2 != 0) {
            n2 += 4;
        }
        boolean bl2 = n2 != 0 ? id_case[15] : id_case[16];
        int n7 = this.id_class(bl2);
        while (n5 + id_throws[11] < n4) {
            int n8 = rrzH_2.id_while((byte[])this.id_class[id_implements[105]], n5);
            int n9 = rrzH_2.id_while((byte[])this.id_class[id_implements[106]], n5 + id_throws[12]);
            if (n8 == id_implements[107] || n8 == id_throws[13]) {
                bl = id_case[17];
            }
            n5 += id_throws[14] + n9;
        }
        if (!bl) {
            if (((Boolean)rrzf_3.id_class[id_implements[108]]).booleanValue()) {
                by = id_throws[15];
            } else {
                by2 = id_throws[16];
            }
        }
        rrQO.id_break(outputStream, (Long)rrzH_2.id_class[id_implements[109]]);
        rrQO.id_class(outputStream, this.id_break(n7));
        rrQO.id_class(outputStream, n7);
        rrQO.id_class(outputStream, (int)((Integer)this.id_class[id_implements[110]]));
        rrQO.id_class(outputStream, (int)((Integer)this.id_class[id_implements[111]]));
        rrQO.id_break(outputStream, (int)rrQO.id_case((Long)this.id_class[id_implements[112]]));
        rrQO.id_break(outputStream, (Long)this.id_class[id_implements[113]]);
        rrQO.id_break(outputStream, l);
        rrQO.id_break(outputStream, l2);
        rrQO.id_class(outputStream, n3);
        rrQO.id_class(outputStream, n4 + n2 + by + by2);
        if ((byte[])this.id_class[id_implements[114]] != null) {
            rrQO.id_class(outputStream, Math.min(n, id_finally[0]));
        } else {
            rrQO.id_class(outputStream, id_case[18]);
        }
        rrQO.id_class(outputStream, id_case[19]);
        rrQO.id_class(outputStream, id_case[20]);
        rrQO.id_break(outputStream, (Integer)this.id_class[id_implements[115]] > 0 ? (long)((Integer)this.id_class[id_implements[116]] << id_throws[17]) : id_catch[27]);
        rrQO.id_break(outputStream, l3);
        rrQO.id_class(outputStream, byArray, id_case[21], n3);
        if (bl2) {
            rrQO.id_class(outputStream, id_case[22]);
            rrQO.id_class(outputStream, n2 - id_throws[18]);
            if (l2 == id_catch[28]) {
                rrQO.id_class(outputStream, (Long)this.id_class[id_implements[117]]);
            }
            if (l == id_catch[29]) {
                rrQO.id_class(outputStream, (Long)this.id_class[id_implements[118]]);
            }
            if (l3 == id_catch[30]) {
                rrQO.id_class(outputStream, (Long)this.id_class[id_implements[119]]);
            }
        }
        if (by != 0) {
            rrQO.id_class(outputStream, (int)id_throws[19]);
            rrQO.id_class(outputStream, by - id_throws[20]);
            rrQO.id_break(outputStream, id_catch[31]);
            rrQO.id_class(outputStream, id_case[23]);
            rrQO.id_class(outputStream, (int)id_throws[21]);
            rrQO.id_class(outputStream, rrQO.id_class((Long)this.id_class[id_implements[120]]));
            rrQO.id_class(outputStream, rrQO.id_class((Long)this.id_class[id_implements[121]]));
            rrQO.id_class(outputStream, rrQO.id_class((Long)this.id_class[id_implements[122]]));
        }
        if (by2 != 0) {
            rrQO.id_class(outputStream, (int)id_implements[123]);
            rrQO.id_class(outputStream, by2 - id_throws[22]);
            if ((Long)this.id_class[id_implements[124]] == id_catch[32]) {
                outputStream.write(id_throws[23]);
            } else {
                outputStream.write(id_throws[24]);
            }
            rrQO.id_break(outputStream, rrQO.id_byte((Long)this.id_class[id_implements[125]]));
        }
        if ((byte[])this.id_class[id_implements[126]] != null) {
            rrQO.id_class(outputStream, (byte[])this.id_class[id_implements[127]]);
        }
        if ((byte[])this.id_class[id_implements[128]] != null) {
            rrQO.id_class(outputStream, (byte[])this.id_class[id_implements[129]]);
        }
        return id_throws[25] + n3 + n4 + n + n2 + by + by2;
    }

    private int id_class(boolean bl) throws ZipException {
        this.id_final();
        if (bl) {
            return id_throws[6];
        }
        if ((Integer)this.id_class[id_implements[67]] == id_throws[7]) {
            return id_throws[8];
        }
        if ((Integer)this.id_class[id_implements[68]] == 0) {
            return id_throws[9];
        }
        throw new ZipException(id_private[1]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{95, 88, -40, 53, -29, 0, -20, 109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Optional<Set<PosixFilePermission>> id_class() {
        this.id_final();
        HashSet<PosixFilePermission> hashSet = null;
        if ((Integer)this.id_class[id_implements[232]] != id_throws[67]) {
            hashSet = new HashSet<PosixFilePermission>(PosixFilePermission.values().length);
            PosixFilePermission[] posixFilePermissionArray = PosixFilePermission.values();
            int n = posixFilePermissionArray.length;
            for (int i = id_case[84]; i < n; ++i) {
                PosixFilePermission posixFilePermission = posixFilePermissionArray[i];
                if (((Integer)this.id_class[id_implements[233]] & rrQO.id_class(posixFilePermission)) == 0) continue;
                hashSet.add(posixFilePermission);
            }
        }
        return Optional.ofNullable(hashSet);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5D6210EB;
    }

    private void id_class(rrzf_3 rrzf_32) throws IOException {
        this.id_final();
        byte[] byArray = new byte[id_throws[59]];
        if (rrzf_32.id_class(byArray, id_case[46], byArray.length, (Long)this.id_class[id_implements[208]]) != (long)byArray.length) {
            throw new ZipException(id_private[3]);
        }
        if (!rrzH_2.id_new(byArray, id_case[47])) {
            throw new ZipException("R" + Long.toString(rrzH_2.id_case(byArray, id_case[48]), id_throws[60]));
        }
        int n = rrzH_2.id_volatile(byArray);
        if (n < id_throws[61]) {
            return;
        }
        int n2 = rrzH_2.id_extends(byArray);
        byArray = new byte[n];
        if (rrzf_32.id_class(byArray, id_case[49], byArray.length, (Long)this.id_class[id_implements[209]] + id_catch[53] + (long)n2) != (long)byArray.length) {
            throw new ZipException(id_private[4]);
        }
        int n3 = id_case[50];
        while (n3 + id_throws[62] < byArray.length) {
            int n4;
            int n5 = rrzH_2.id_while(byArray, n3);
            int n6 = rrzH_2.id_while(byArray, n3 + id_throws[63]);
            n3 += 4;
            if (n5 != id_implements[210]) {
                n3 += n6;
                continue;
            }
            int n7 = n3 + n6 - id_throws[64];
            if (((n4 = rrzH_2.id_final(byArray, n3++)) & id_case[51]) != 0 && n3 <= n7) {
                Long l = rrQO.id_throws(rrzH_2.id_try(byArray, n3));
                this.id_class[rrzY_2.id_implements[211]] = l;
                n3 += 4;
            }
            if ((n4 & id_throws[65]) != 0 && n3 <= n7) {
                Long l = rrQO.id_throws(rrzH_2.id_try(byArray, n3));
                this.id_class[rrzY_2.id_implements[212]] = l;
                n3 += 4;
            }
            if ((n4 & id_throws[66]) == 0 || n3 > n7) break;
            Long l = rrQO.id_throws(rrzH_2.id_try(byArray, n3));
            this.id_class[rrzY_2.id_implements[213]] = l;
            break;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5A938F185DFABB03L;
    }

    private int id_break(int n) {
        this.id_final();
        return (Integer)this.id_class[id_implements[69]] < 0 ? n : id_implements[70] | n & id_implements[71];
    }

    @Override
    public int id_break() {
        this.id_final();
        return (Integer)this.id_class[id_implements[225]];
    }

    private void id_break(rrzf_3 rrzf_32) throws IOException {
        this.id_final();
        if ((byte[])this.id_class[id_implements[177]] == null) {
            return;
        }
        int n = ((byte[])this.id_class[id_implements[178]]).length;
        int n2 = id_case[40];
        int n3 = id_case[41];
        boolean bl = id_case[42];
        while (n2 + id_throws[44] < n) {
            int n4;
            int n5 = n2;
            int n6 = rrzH_2.id_while((byte[])this.id_class[id_implements[179]], n5);
            if ((n5 += 4) + (n4 = rrzH_2.id_while((byte[])this.id_class[id_implements[180]], n5 + id_throws[45])) > n) break;
            switch (n6) {
                case 1: {
                    if ((Long)this.id_class[id_implements[181]] == id_catch[49]) {
                        if (n5 + id_throws[46] > n) break;
                        Long l = rrzH_2.id_catch((byte[])this.id_class[id_implements[182]], n5);
                        this.id_class[rrzY_2.id_implements[183]] = l;
                        n5 += 8;
                    }
                    if ((Long)this.id_class[id_implements[184]] == id_catch[50]) {
                        if (n5 + id_throws[47] > n) break;
                        Long l = rrzH_2.id_catch((byte[])this.id_class[id_implements[185]], n5);
                        this.id_class[rrzY_2.id_implements[186]] = l;
                        n5 += 8;
                    }
                    if ((Long)this.id_class[id_implements[187]] != id_catch[51] || n5 + id_throws[48] > n) break;
                    Long l = rrzH_2.id_catch((byte[])this.id_class[id_implements[188]], n5);
                    this.id_class[rrzY_2.id_implements[189]] = l;
                    break;
                }
                case 10: {
                    if (n4 < id_throws[49] || rrzH_2.id_while((byte[])this.id_class[id_implements[190]], n5 += 4) != id_case[43] || rrzH_2.id_while((byte[])this.id_class[id_implements[191]], n5 + id_throws[50]) != id_throws[51]) break;
                    Long l = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[id_implements[192]], n5 + id_throws[52]));
                    this.id_class[rrzY_2.id_implements[193]] = l;
                    Long l2 = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[id_implements[194]], n5 + id_throws[53]));
                    this.id_class[rrzY_2.id_implements[195]] = l2;
                    Long l3 = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[id_implements[196]], n5 + id_throws[54]));
                    this.id_class[rrzY_2.id_implements[197]] = l3;
                    break;
                }
                case 21589: {
                    if (((Boolean)rrzf_32.id_break[id_implements[198]]).booleanValue()) {
                        if (n4 != id_throws[55]) break;
                        Long l = rrQO.id_throws(rrzH_2.id_try((byte[])this.id_class[id_implements[199]], n5 + id_case[44]));
                        this.id_class[rrzY_2.id_implements[200]] = l;
                        break;
                    }
                    if ((Long)this.id_class[id_implements[201]] != id_catch[52]) {
                        this.id_class(rrzf_32);
                        break;
                    }
                    bl = id_case[45];
                    break;
                }
                default: {
                    System.arraycopy((byte[])this.id_class[id_implements[202]], n2, (byte[])this.id_class[id_implements[203]], n3, n4 + id_throws[56]);
                    n3 += n4 + id_throws[57];
                }
            }
            n2 += n4 + id_throws[58];
        }
        if (bl) {
            this.id_class(rrzf_32);
        }
        if (n3 != 0 && n3 != ((byte[])this.id_class[id_implements[204]]).length) {
            byte[] byArray = Arrays.copyOf((byte[])this.id_class[id_implements[205]], n3);
            this.id_class[rrzY_2.id_implements[206]] = byArray;
        } else {
            Object var21_17 = null;
            this.id_class[rrzY_2.id_implements[207]] = var21_17;
        }
    }

    public int id_break(OutputStream outputStream) throws IOException {
        int n;
        this.id_final();
        byte[] byArray = (Boolean)this.id_protected[id_implements[130]] != false ? rrQO.id_class((byte[])this.id_protected[id_implements[131]]) : (byte[])this.id_protected[id_implements[132]];
        int n2 = byArray != null ? byArray.length - id_case[24] : id_case[25];
        int n3 = (byte[])this.id_class[id_implements[133]] != null ? ((byte[])this.id_class[id_implements[134]]).length : id_case[26];
        boolean bl = id_case[27];
        int n4 = id_case[28];
        byte by = id_case[29];
        boolean bl2 = id_case[30];
        int n5 = id_case[31];
        int n6 = id_case[32];
        rrQO.id_break(outputStream, (Long)rrzH_2.id_class[id_implements[135]]);
        if (((Integer)this.id_class[id_implements[136]] & id_throws[26]) != 0) {
            rrQO.id_class(outputStream, this.id_class(id_case[33]));
            rrQO.id_class(outputStream, (int)((Integer)this.id_class[id_implements[137]]));
            rrQO.id_class(outputStream, (int)((Integer)this.id_class[id_implements[138]]));
            rrQO.id_break(outputStream, (int)rrQO.id_case((Long)this.id_class[id_implements[139]]));
            rrQO.id_break(outputStream, id_catch[33]);
            rrQO.id_break(outputStream, id_catch[34]);
            rrQO.id_break(outputStream, id_catch[35]);
        } else {
            if ((Long)this.id_class[id_implements[140]] >= id_catch[36] || (Long)this.id_class[id_implements[141]] >= id_catch[37]) {
                by = id_throws[27];
                bl2 = id_case[34];
            }
            rrQO.id_class(outputStream, this.id_class(bl2));
            rrQO.id_class(outputStream, (int)((Integer)this.id_class[id_implements[142]]));
            rrQO.id_class(outputStream, (int)((Integer)this.id_class[id_implements[143]]));
            rrQO.id_break(outputStream, (int)rrQO.id_case((Long)this.id_class[id_implements[144]]));
            rrQO.id_break(outputStream, (Long)this.id_class[id_implements[145]]);
            if (bl2) {
                rrQO.id_break(outputStream, id_catch[38]);
                rrQO.id_break(outputStream, id_catch[39]);
            } else {
                rrQO.id_break(outputStream, (Long)this.id_class[id_implements[146]]);
                rrQO.id_break(outputStream, (Long)this.id_class[id_implements[147]]);
            }
        }
        while (n4 + id_throws[28] < n3) {
            n = rrzH_2.id_while((byte[])this.id_class[id_implements[148]], n4);
            int n7 = rrzH_2.id_while((byte[])this.id_class[id_implements[149]], n4 + id_throws[29]);
            if (n == id_implements[150] || n == id_throws[30]) {
                bl = id_case[35];
            }
            n4 += id_throws[31] + n7;
        }
        if (!bl) {
            if (((Boolean)rrzf_3.id_class[id_implements[151]]).booleanValue()) {
                n6 = id_throws[32];
            } else {
                n5 = id_throws[33];
                if ((Long)this.id_class[id_implements[152]] != id_catch[40]) {
                    n5 += 4;
                }
                if ((Long)this.id_class[id_implements[153]] != id_catch[41]) {
                    n5 += 4;
                }
            }
        }
        rrQO.id_class(outputStream, n2);
        rrQO.id_class(outputStream, n3 + by + n6 + n5);
        rrQO.id_class(outputStream, byArray, id_case[36], n2);
        if (bl2) {
            rrQO.id_class(outputStream, id_case[37]);
            rrQO.id_class(outputStream, (int)id_throws[34]);
            rrQO.id_class(outputStream, (Long)this.id_class[id_implements[154]]);
            rrQO.id_class(outputStream, (Long)this.id_class[id_implements[155]]);
        }
        if (n6 != 0) {
            rrQO.id_class(outputStream, (int)id_throws[35]);
            rrQO.id_class(outputStream, n6 - id_throws[36]);
            rrQO.id_break(outputStream, id_catch[42]);
            rrQO.id_class(outputStream, id_case[38]);
            rrQO.id_class(outputStream, (int)id_throws[37]);
            rrQO.id_class(outputStream, rrQO.id_class((Long)this.id_class[id_implements[156]]));
            rrQO.id_class(outputStream, rrQO.id_class((Long)this.id_class[id_implements[157]]));
            rrQO.id_class(outputStream, rrQO.id_class((Long)this.id_class[id_implements[158]]));
        }
        if (n5 != 0) {
            rrQO.id_class(outputStream, (int)id_implements[159]);
            rrQO.id_class(outputStream, n5 - id_throws[38]);
            n = id_case[39];
            if ((Long)this.id_class[id_implements[160]] != id_catch[43]) {
                n |= id_throws[39];
            }
            if ((Long)this.id_class[id_implements[161]] != id_catch[44]) {
                n |= id_throws[40];
            }
            outputStream.write(n);
            rrQO.id_break(outputStream, rrQO.id_byte((Long)this.id_class[id_implements[162]]));
            if ((Long)this.id_class[id_implements[163]] != id_catch[45]) {
                rrQO.id_break(outputStream, rrQO.id_byte((Long)this.id_class[id_implements[164]]));
            }
            if ((Long)this.id_class[id_implements[165]] != id_catch[46]) {
                rrQO.id_break(outputStream, rrQO.id_byte((Long)this.id_class[id_implements[166]]));
            }
        }
        if ((byte[])this.id_class[id_implements[167]] != null) {
            rrQO.id_class(outputStream, (byte[])this.id_class[id_implements[168]]);
        }
        return id_throws[41] + n2 + n3 + by + n6 + n5;
    }

    @Override
    public byte[] id_throws() {
        this.id_final();
        if ((byte[])this.id_class[id_implements[229]] != null) {
            return Arrays.copyOf((byte[])this.id_class[id_implements[230]], ((byte[])this.id_class[id_implements[231]]).length);
        }
        return null;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzY_2.id_implements();
        rrzY_2.id_native();
        rrzY_2.id_extends();
        rrzY_2.id_int();
        rrzY_2.id_package();
        rrzY_2.id_volatile();
        rrzY_2.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{1, 2, 3, 4};
        id_break = objectArray;
    }

    private static void id_extends() {
        long[] lArray = new long[63];
        lArray[0] = -1L;
        lArray[1] = -1L;
        lArray[2] = -1L;
        lArray[3] = -1L;
        lArray[4] = -1L;
        lArray[5] = -1L;
        lArray[9] = -1L;
        lArray[10] = -1L;
        lArray[11] = -1L;
        lArray[12] = -1L;
        lArray[13] = -1L;
        lArray[14] = -1L;
        lArray[15] = -1L;
        lArray[16] = -1L;
        lArray[17] = -1L;
        lArray[18] = -1L;
        lArray[19] = -1L;
        lArray[20] = -1L;
        lArray[21] = 0xFFFFFFFFL;
        lArray[22] = 0xFFFFFFFFL;
        lArray[23] = 0xFFFFFFFFL;
        lArray[24] = 0xFFFFFFFFL;
        lArray[25] = 0xFFFFFFFFL;
        lArray[26] = 0xFFFFFFFFL;
        lArray[28] = 0xFFFFFFFFL;
        lArray[29] = 0xFFFFFFFFL;
        lArray[30] = 0xFFFFFFFFL;
        lArray[32] = -1L;
        lArray[36] = 0xFFFFFFFFL;
        lArray[37] = 0xFFFFFFFFL;
        lArray[38] = 0xFFFFFFFFL;
        lArray[39] = 0xFFFFFFFFL;
        lArray[40] = -1L;
        lArray[41] = -1L;
        lArray[43] = -1L;
        lArray[44] = -1L;
        lArray[45] = -1L;
        lArray[46] = -1L;
        lArray[47] = 0xFFFFFFFFL;
        lArray[48] = 0xFFFFFFFFL;
        lArray[49] = 0xFFFFFFFFL;
        lArray[50] = 0xFFFFFFFFL;
        lArray[51] = 0xFFFFFFFFL;
        lArray[52] = 0xFFFFFFFFL;
        lArray[53] = 30L;
        lArray[54] = -1L;
        lArray[55] = -1L;
        id_catch = lArray;
    }

    @Override
    public long id_case() {
        this.id_final();
        return (Long)this.id_class[id_implements[224]];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[93];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[10] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[24] = true;
        blArray[34] = true;
        blArray[35] = true;
        blArray[36] = true;
        blArray[37] = true;
        blArray[38] = true;
        blArray[39] = true;
        blArray[43] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[51] = true;
        blArray[52] = true;
        blArray[54] = true;
        blArray[56] = true;
        blArray[58] = true;
        blArray[60] = true;
        blArray[62] = true;
        blArray[64] = true;
        blArray[66] = true;
        blArray[68] = true;
        blArray[70] = true;
        blArray[72] = true;
        blArray[74] = true;
        blArray[76] = true;
        blArray[78] = true;
        blArray[81] = true;
        blArray[91] = true;
        blArray[92] = true;
        id_case = blArray;
    }

    private static void id_package() {
        id_throws = new byte[]{-1, -1, -1, -1, -1, -1, 45, 8, 20, 10, 3, 4, 2, 10, 4, 36, 9, 16, 4, 10, 4, 24, 4, 3, 7, 46, 8, 20, 4, 2, 10, 4, 36, 9, 16, 10, 4, 24, 4, 2, 4, 30, 24, 16, 4, 2, 8, 8, 8, 32, 2, 24, 4, 12, 20, 5, 4, 4, 4, 30, 16, 9, 4, 2, 4, 2, 4, -1, 16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 4, 2, 2, 3, 3, 4};
    }

    @Override
    public long id_protected() {
        this.id_final();
        return (Long)this.id_class[id_implements[223]];
    }

    private void id_final() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[68]];
            objectArray[rrzY_2.id_throws[69]] = id_case[85];
            objectArray[rrzY_2.id_throws[70]] = id_case[86];
            objectArray[rrzY_2.id_throws[71]] = id_case[87];
            objectArray[rrzY_2.id_throws[72]] = id_case[88];
            objectArray[rrzY_2.id_throws[73]] = id_case[89];
            objectArray[rrzY_2.id_throws[74]] = id_catch[56];
            objectArray[rrzY_2.id_throws[75]] = id_catch[57];
            objectArray[rrzY_2.id_throws[76]] = id_catch[58];
            objectArray[rrzY_2.id_throws[77]] = id_catch[59];
            objectArray[rrzY_2.id_throws[78]] = id_catch[60];
            objectArray[rrzY_2.id_throws[79]] = id_catch[61];
            objectArray[rrzY_2.id_throws[80]] = id_catch[62];
        }
    }

    private static void id_volatile() {
        id_finally = new int[]{65535};
    }

    private static void id_native() {
        id_private = new String[]{new String("posix:permissions"), new String("unsupported compression method"), new String("invalid CEN header (bad signature)"), new String("loc: reading failed"), new String("loc extra: reading failed"), new String("    name            : %s%n"), new String("    creationTime    : %tc%n"), new String("    lastAccessTime  : %tc%n"), new String("    lastModifiedTime: %tc%n"), new String("    isRegularFile   : %b%n"), new String("    isDirectory     : %b%n"), new String("    isSymbolicLink  : %b%n"), new String("    isOther         : %b%n"), new String("    fileKey         : %s%n"), new String("    size            : %d%n"), new String("    compressedSize  : %d%n"), new String("    crc             : %x%n"), new String("    method          : %d%n"), new String("    permissions     : %s%n")};
    }

    @Override
    public boolean isDirectory() {
        return this.id_catch();
    }

    @Override
    public FileTime lastModifiedTime() {
        this.id_final();
        return FileTime.fromMillis((Long)this.id_class[id_implements[221]]);
    }

    @Override
    public Object fileKey() {
        return null;
    }

    @Override
    public boolean isRegularFile() {
        return !this.id_catch() ? id_case[81] : id_case[82];
    }

    @Override
    public FileTime lastAccessTime() {
        this.id_final();
        return FileTime.fromMillis((Long)this.id_class[id_implements[218]] == id_catch[55] ? ((Long)this.id_class[id_implements[219]]).longValue() : ((Long)this.id_class[id_implements[220]]).longValue());
    }

    @Override
    public FileTime creationTime() {
        this.id_final();
        return FileTime.fromMillis((Long)this.id_class[id_implements[215]] == id_catch[54] ? ((Long)this.id_class[id_implements[216]]).longValue() : ((Long)this.id_class[id_implements[217]]).longValue());
    }

    @Override
    public boolean isSymbolicLink() {
        return id_case[83];
    }

    @Override
    public boolean isOther() {
        return id_case[80];
    }
}

