/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQO;
import celestial.rrzH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQS {
    private static String[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static long[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        id_class = new String[]{new String("%n"), new String("[Local File Header]%n"), new String("    Signature   :   %#010x%n"), new String("    Wrong signature!"), new String("    Version     :       %#6x    [%d.%d]%n"), new String("    Flag        :       %#6x%n"), new String("    Method      :       %#6x%n"), new String("    LastMTime   :   %#10x    [%tc]%n"), new String("    CRC         :   %#10x%n"), new String("    CSize       :   %#10x%n"), new String("    Size        :   %#10x%n"), new String("    NameLength  :       %#6x    [%s]%n"), new String("    ExtraLength :       %#6x%n"), new String("[Central Directory Header]%n"), new String("    Signature   :   %#010x%n"), new String("    Wrong signature!"), new String("    VerMadeby   :       %#6x    [%d, %d.%d]%n"), new String("    VerExtract  :       %#6x    [%d.%d]%n"), new String("    Flag        :       %#6x%n"), new String("    Method      :       %#6x%n"), new String("    LastMTime   :   %#10x    [%tc]%n"), new String("    CRC         :   %#10x%n"), new String("    CSize       :   %#10x%n"), new String("    Size        :   %#10x%n"), new String("    NameLen     :       %#6x    [%s]%n"), new String("    ExtraLen    :       %#6x%n"), new String("    CommentLen  :       %#6x%n"), new String("    DiskStart   :       %#6x%n"), new String("    Attrs       :       %#6x%n"), new String("    AttrsEx     :   %#10x%n"), new String("    LocOff      :   %#10x%n"), new String("        [tag=0x%04x, sz=%d, data= "), new String("    Error: Invalid extra data, beyond extra length"), new String("%02x "), new String("]%n"), new String("         ->ZIP64: "), new String(" *0x%x "), new String("%n"), new String("         ->PKWare NTFS%n"), new String("    Error: Invalid NTFS sub-tag or subsz"), new String("            mtime:%tc%n"), new String("            atime:%tc%n"), new String("            ctime:%tc%n"), new String("         ->Info-ZIP Extended Timestamp: flag=%x%n"), new String("            *%tc%n"), new String("         ->[tag=%x, size=%d]%n")};
    }

    static {
        rrQS.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xECB5D289;
    }

    private static long id_class(byte[] byArray, int n) {
        long l = rrzH_2.id_throw(byArray, n);
        if (l == id_protected[0]) {
            int n2 = n + id_break[22] + rrzH_2.id_super(byArray, n);
            int n3 = n2 + rrzH_2.id_instanceof(byArray, n);
            while (n2 + id_break[23] < n3) {
                int n4 = rrzH_2.id_while(byArray, n2);
                int n5 = rrzH_2.id_while(byArray, n2 + id_break[24]);
                if (n4 != id_throws[57]) {
                    n2 += id_break[25] + n5;
                    continue;
                }
                n2 += 4;
                if (rrzH_2.id_int(byArray, n) == id_protected[1]) {
                    n2 += 8;
                }
                if (rrzH_2.id_finally(byArray, n) == id_protected[2]) {
                    n2 += 8;
                }
                return rrzH_2.id_catch(byArray, n2);
            }
        }
        return l;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2AB8030E4F5846D0L;
    }

    private static void id_class(String string, Object ... objectArray) {
        System.out.printf(string, objectArray);
    }

    private static void id_class() {
        id_byte = new short[]{10, 12, 255, 255};
    }

    private static void id_class(byte[] byArray, int n, int n2) {
        int n3 = n + n2;
        while (n + id_break[26] <= n3) {
            int n4;
            int n5 = rrzH_2.id_while(byArray, n);
            int n6 = rrzH_2.id_while(byArray, n + id_break[27]);
            Object[] objectArray = new Object[id_break[28]];
            objectArray[rrQS.id_throws[58]] = n5;
            objectArray[rrQS.id_throws[59]] = n6;
            rrQS.id_class(id_class[31], objectArray);
            if (n + n6 > n3) {
                rrQS.id_class(id_class[32], new Object[id_throws[60]]);
                break;
            }
            n += 4;
            for (n4 = id_throws[61]; n4 < n6; ++n4) {
                Object[] objectArray2 = new Object[id_throws[62]];
                objectArray2[rrQS.id_throws[63]] = byArray[n + n4];
                rrQS.id_class(id_class[33], objectArray2);
            }
            rrQS.id_class(id_class[34], new Object[id_throws[64]]);
            switch (n5) {
                case 1: {
                    rrQS.id_class(id_class[35], new Object[id_throws[65]]);
                    n4 = n;
                    while (n4 + id_break[29] <= n + n6) {
                        Object[] objectArray3 = new Object[id_throws[66]];
                        objectArray3[rrQS.id_throws[67]] = rrzH_2.id_catch(byArray, n4);
                        rrQS.id_class(id_class[36], objectArray3);
                        n4 += 8;
                    }
                    rrQS.id_class(id_class[37], new Object[id_throws[68]]);
                    break;
                }
                case 10: {
                    rrQS.id_class(id_class[38], new Object[id_throws[69]]);
                    if (rrzH_2.id_while(byArray, n + id_break[30]) != id_throws[70] || rrzH_2.id_while(byArray, n + id_break[31]) != id_break[32]) {
                        rrQS.id_class(id_class[39], new Object[id_throws[71]]);
                    }
                    Object[] objectArray4 = new Object[id_throws[72]];
                    objectArray4[rrQS.id_throws[73]] = rrQO.id_protected(rrzH_2.id_catch(byArray, n + id_break[33]));
                    rrQS.id_class(id_class[40], objectArray4);
                    Object[] objectArray5 = new Object[id_throws[74]];
                    objectArray5[rrQS.id_throws[75]] = rrQO.id_protected(rrzH_2.id_catch(byArray, n + id_break[34]));
                    rrQS.id_class(id_class[41], objectArray5);
                    Object[] objectArray6 = new Object[id_throws[76]];
                    objectArray6[rrQS.id_throws[77]] = rrQO.id_protected(rrzH_2.id_catch(byArray, n + id_break[35]));
                    rrQS.id_class(id_class[42], objectArray6);
                    break;
                }
                case 21589: {
                    Object[] objectArray7 = new Object[id_throws[78]];
                    objectArray7[rrQS.id_throws[79]] = byArray[n];
                    rrQS.id_class(id_class[43], objectArray7);
                    n4 = n + id_throws[80];
                    while (n4 + id_break[36] <= n + n6) {
                        Object[] objectArray8 = new Object[id_throws[81]];
                        objectArray8[rrQS.id_throws[82]] = rrQO.id_throws(rrzH_2.id_try(byArray, n4));
                        rrQS.id_class(id_class[44], objectArray8);
                        n4 += 4;
                    }
                    break;
                }
                default: {
                    Object[] objectArray9 = new Object[id_break[37]];
                    objectArray9[rrQS.id_throws[83]] = n5;
                    objectArray9[rrQS.id_throws[84]] = n6;
                    rrQS.id_class(id_class[45], objectArray9);
                }
            }
            n += n6;
        }
    }

    private static void id_class(byte[] byArray) {
        rrQS.id_class(id_class[0], new Object[id_throws[0]]);
        rrQS.id_class(id_class[1], new Object[id_throws[1]]);
        Object[] objectArray = new Object[id_throws[2]];
        objectArray[rrQS.id_throws[3]] = rrzH_2.id_catch(byArray);
        rrQS.id_class(id_class[2], objectArray);
        if (rrzH_2.id_catch(byArray) != (Long)rrzH_2.id_class[id_byte[0]]) {
            rrQS.id_class(id_class[3], new Object[id_throws[4]]);
            return;
        }
        Object[] objectArray2 = new Object[id_break[0]];
        objectArray2[rrQS.id_throws[5]] = rrzH_2.id_case(byArray);
        objectArray2[rrQS.id_throws[6]] = rrzH_2.id_case(byArray) / id_break[1];
        objectArray2[rrQS.id_break[2]] = rrzH_2.id_case(byArray) % id_break[3];
        rrQS.id_class(id_class[4], objectArray2);
        Object[] objectArray3 = new Object[id_throws[7]];
        objectArray3[rrQS.id_throws[8]] = rrzH_2.id_byte(byArray);
        rrQS.id_class(id_class[5], objectArray3);
        Object[] objectArray4 = new Object[id_throws[9]];
        objectArray4[rrQS.id_throws[10]] = rrzH_2.id_final(byArray);
        rrQS.id_class(id_class[6], objectArray4);
        Object[] objectArray5 = new Object[id_break[4]];
        objectArray5[rrQS.id_throws[11]] = rrzH_2.id_return(byArray);
        objectArray5[rrQS.id_throws[12]] = rrQO.id_break(rrzH_2.id_return(byArray));
        rrQS.id_class(id_class[7], objectArray5);
        Object[] objectArray6 = new Object[id_throws[13]];
        objectArray6[rrQS.id_throws[14]] = rrzH_2.id_else(byArray);
        rrQS.id_class(id_class[8], objectArray6);
        Object[] objectArray7 = new Object[id_throws[15]];
        objectArray7[rrQS.id_throws[16]] = rrzH_2.id_protected(byArray);
        rrQS.id_class(id_class[9], objectArray7);
        Object[] objectArray8 = new Object[id_throws[17]];
        objectArray8[rrQS.id_throws[18]] = rrzH_2.id_new(byArray);
        rrQS.id_class(id_class[10], objectArray8);
        Object[] objectArray9 = new Object[id_break[5]];
        objectArray9[rrQS.id_throws[19]] = rrzH_2.id_extends(byArray);
        objectArray9[rrQS.id_throws[20]] = new String(byArray, (int)id_break[6], rrzH_2.id_extends(byArray));
        rrQS.id_class(id_class[11], objectArray9);
        Object[] objectArray10 = new Object[id_throws[21]];
        objectArray10[rrQS.id_throws[22]] = rrzH_2.id_volatile(byArray);
        rrQS.id_class(id_class[12], objectArray10);
        if (rrzH_2.id_volatile(byArray) != 0) {
            rrQS.id_class(byArray, id_break[7] + rrzH_2.id_extends(byArray), rrzH_2.id_volatile(byArray));
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, -61, 79, 114, -61, -4, 10, -123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[85];
        blArray[2] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[24] = true;
        blArray[28] = true;
        blArray[30] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[36] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[41] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[47] = true;
        blArray[49] = true;
        blArray[51] = true;
        blArray[53] = true;
        blArray[55] = true;
        blArray[57] = true;
        blArray[59] = true;
        blArray[62] = true;
        blArray[66] = true;
        blArray[70] = true;
        blArray[72] = true;
        blArray[74] = true;
        blArray[76] = true;
        blArray[78] = true;
        blArray[80] = true;
        blArray[81] = true;
        blArray[84] = true;
        id_throws = blArray;
    }

    private static void id_break(byte[] byArray, int n) {
        rrQS.id_class(id_class[13], new Object[id_throws[23]]);
        Object[] objectArray = new Object[id_throws[24]];
        objectArray[rrQS.id_throws[25]] = rrzH_2.id_goto(byArray, n);
        rrQS.id_class(id_class[14], objectArray);
        if (rrzH_2.id_goto(byArray, n) != (Long)rrzH_2.id_class[id_byte[1]]) {
            rrQS.id_class(id_class[15], new Object[id_throws[26]]);
            return;
        }
        Object[] objectArray2 = new Object[id_break[8]];
        objectArray2[rrQS.id_throws[27]] = rrzH_2.id_throws(byArray, n);
        objectArray2[rrQS.id_throws[28]] = rrzH_2.id_throws(byArray, n) >> id_break[9];
        objectArray2[rrQS.id_break[10]] = (rrzH_2.id_throws(byArray, n) & id_byte[2]) / id_break[11];
        objectArray2[rrQS.id_break[12]] = (rrzH_2.id_throws(byArray, n) & id_byte[3]) % id_break[13];
        rrQS.id_class(id_class[16], objectArray2);
        Object[] objectArray3 = new Object[id_break[14]];
        objectArray3[rrQS.id_throws[29]] = rrzH_2.id_interface(byArray, n);
        objectArray3[rrQS.id_throws[30]] = rrzH_2.id_interface(byArray, n) / id_break[15];
        objectArray3[rrQS.id_break[16]] = rrzH_2.id_interface(byArray, n) % id_break[17];
        rrQS.id_class(id_class[17], objectArray3);
        Object[] objectArray4 = new Object[id_throws[31]];
        objectArray4[rrQS.id_throws[32]] = rrzH_2.id_else(byArray, n);
        rrQS.id_class(id_class[18], objectArray4);
        Object[] objectArray5 = new Object[id_throws[33]];
        objectArray5[rrQS.id_throws[34]] = rrzH_2.id_synchronized(byArray, n);
        rrQS.id_class(id_class[19], objectArray5);
        Object[] objectArray6 = new Object[id_break[18]];
        objectArray6[rrQS.id_throws[35]] = rrzH_2.id_volatile(byArray, n);
        objectArray6[rrQS.id_throws[36]] = rrQO.id_break(rrzH_2.id_volatile(byArray, n));
        rrQS.id_class(id_class[20], objectArray6);
        Object[] objectArray7 = new Object[id_throws[37]];
        objectArray7[rrQS.id_throws[38]] = rrzH_2.id_protected(byArray, n);
        rrQS.id_class(id_class[21], objectArray7);
        Object[] objectArray8 = new Object[id_throws[39]];
        objectArray8[rrQS.id_throws[40]] = rrzH_2.id_finally(byArray, n);
        rrQS.id_class(id_class[22], objectArray8);
        Object[] objectArray9 = new Object[id_throws[41]];
        objectArray9[rrQS.id_throws[42]] = rrzH_2.id_int(byArray, n);
        rrQS.id_class(id_class[23], objectArray9);
        Object[] objectArray10 = new Object[id_break[19]];
        objectArray10[rrQS.id_throws[43]] = rrzH_2.id_super(byArray, n);
        objectArray10[rrQS.id_throws[44]] = new String(byArray, n + id_break[20], rrzH_2.id_super(byArray, n));
        rrQS.id_class(id_class[24], objectArray10);
        Object[] objectArray11 = new Object[id_throws[45]];
        objectArray11[rrQS.id_throws[46]] = rrzH_2.id_instanceof(byArray, n);
        rrQS.id_class(id_class[25], objectArray11);
        if (rrzH_2.id_instanceof(byArray, n) != 0) {
            rrQS.id_class(byArray, n + id_break[21] + rrzH_2.id_super(byArray, n), rrzH_2.id_instanceof(byArray, n));
        }
        Object[] objectArray12 = new Object[id_throws[47]];
        objectArray12[rrQS.id_throws[48]] = rrzH_2.id_implements(byArray, n);
        rrQS.id_class(id_class[26], objectArray12);
        Object[] objectArray13 = new Object[id_throws[49]];
        objectArray13[rrQS.id_throws[50]] = rrzH_2.id_extends(byArray, n);
        rrQS.id_class(id_class[27], objectArray13);
        Object[] objectArray14 = new Object[id_throws[51]];
        objectArray14[rrQS.id_throws[52]] = rrzH_2.id_continue(byArray, n);
        rrQS.id_class(id_class[28], objectArray14);
        Object[] objectArray15 = new Object[id_throws[53]];
        objectArray15[rrQS.id_throws[54]] = rrzH_2.id_public(byArray, n);
        rrQS.id_class(id_class[29], objectArray15);
        Object[] objectArray16 = new Object[id_throws[55]];
        objectArray16[rrQS.id_throws[56]] = rrzH_2.id_throw(byArray, n);
        rrQS.id_class(id_class[30], objectArray16);
    }

    private static void id_throws() {
        id_break = new byte[]{3, 10, 2, 10, 2, 2, 30, 30, 4, 8, 2, 10, 3, 10, 3, 10, 2, 10, 2, 2, 46, 46, 46, 4, 2, 4, 4, 2, 2, 8, 4, 6, 24, 8, 16, 24, 4, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQS.id_break();
        rrQS.id_byte();
        rrQS.id_protected();
        rrQS.id_class();
        rrQS.id_throws();
    }

    private static void id_protected() {
        id_protected = new long[]{0xFFFFFFFFL, 0xFFFFFFFFL, 0xFFFFFFFFL};
    }
}

