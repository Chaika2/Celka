/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQh_1;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.PosixFilePermission;
import java.security.Key;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.PatternSyntaxException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQO {
    private static boolean[] id_break;
    private static long[] id_byte;
    private static byte[] id_protected;
    private static String[] id_throws;
    private static short[] id_case;
    public static Object[] id_class;

    public static long id_byte(long l) {
        return TimeUnit.SECONDS.convert(l, TimeUnit.MILLISECONDS);
    }

    private static void id_byte() {
        id_throws = new String[]{new String(".^$+{[]|()"), new String("\\*?[{"), new String("^"), new String("No character to escape"), new String("[[^/]&&["), new String("\\^"), new String("Explicit 'name separator' in class"), new String("Invalid range"), new String("Invalid range"), new String("Missing ']"), new String("]]"), new String("Cannot nest groups"), new String("(?:(?:"), new String("))"), new String(")|(?:"), new String(".*"), new String("[^/]*"), new String("[^/]"), new String("Missing '}"), new String(".^$+{[]|()"), new String("\\*?[{")};
    }

    static {
        rrQO.ntfClinit();
    }

    private static char id_class(String string, int n) {
        if (n < string.length()) {
            return string.charAt(n);
        }
        return ((Character)id_class[id_case[7]]).charValue();
    }

    private static long id_class(int n, int n2, int n3, int n4, int n5, int n6) {
        return new Date(n - id_case[5], n2 - id_break[8], n3, n4, n5, n6).getTime();
    }

    public static void id_class(OutputStream outputStream, byte[] byArray, int n, int n2) throws IOException {
        outputStream.write(byArray, n, n2);
    }

    public static String id_class(String string) {
        boolean bl = id_break[14];
        StringBuilder stringBuilder = new StringBuilder(id_throws[2]);
        int n = id_break[15];
        block10: while (n < string.length()) {
            char c = string.charAt(n++);
            switch (c) {
                case '\\': {
                    char c2;
                    if (n == string.length()) {
                        throw new PatternSyntaxException(id_throws[3], string, n - id_break[16]);
                    }
                    if (rrQO.id_break(c2 = string.charAt(n++)) || rrQO.id_class(c2)) {
                        stringBuilder.append((char)id_protected[36]);
                    }
                    stringBuilder.append(c2);
                    continue block10;
                }
                case '/': {
                    stringBuilder.append(c);
                    continue block10;
                }
                case '[': {
                    stringBuilder.append(id_throws[4]);
                    if (rrQO.id_class(string, n) == id_protected[37]) {
                        stringBuilder.append(id_throws[5]);
                        ++n;
                    } else {
                        if (rrQO.id_class(string, n) == id_protected[38]) {
                            stringBuilder.append((char)id_protected[39]);
                            ++n;
                        }
                        if (rrQO.id_class(string, n) == id_protected[40]) {
                            stringBuilder.append((char)id_protected[41]);
                            ++n;
                        }
                    }
                    boolean bl2 = id_break[17];
                    char c3 = id_break[18];
                    while (n < string.length() && (c = string.charAt(n++)) != id_protected[42]) {
                        if (c == id_protected[43]) {
                            throw new PatternSyntaxException(id_throws[6], string, n - id_break[19]);
                        }
                        if (c == id_protected[44] || c == id_protected[45] || c == id_protected[46] && rrQO.id_class(string, n) == id_protected[47]) {
                            stringBuilder.append((char)id_protected[48]);
                        }
                        stringBuilder.append(c);
                        if (c == id_protected[49]) {
                            if (!bl2) {
                                throw new PatternSyntaxException(id_throws[7], string, n - id_break[20]);
                            }
                            if ((c = rrQO.id_class(string, n++)) == ((Character)id_class[id_case[8]]).charValue() || c == id_protected[50]) break;
                            if (c < c3) {
                                throw new PatternSyntaxException(id_throws[8], string, n - id_protected[51]);
                            }
                            stringBuilder.append(c);
                            bl2 = id_break[21];
                            continue;
                        }
                        bl2 = id_break[22];
                        c3 = c;
                    }
                    if (c != id_protected[52]) {
                        throw new PatternSyntaxException(id_throws[9], string, n - id_break[23]);
                    }
                    stringBuilder.append(id_throws[10]);
                    continue block10;
                }
                case '{': {
                    if (bl) {
                        throw new PatternSyntaxException(id_throws[11], string, n - id_break[24]);
                    }
                    stringBuilder.append(id_throws[12]);
                    bl = id_break[25];
                    continue block10;
                }
                case '}': {
                    if (bl) {
                        stringBuilder.append(id_throws[13]);
                        bl = id_break[26];
                        continue block10;
                    }
                    stringBuilder.append((char)id_protected[53]);
                    continue block10;
                }
                case ',': {
                    if (bl) {
                        stringBuilder.append(id_throws[14]);
                        continue block10;
                    }
                    stringBuilder.append((char)id_protected[54]);
                    continue block10;
                }
                case '*': {
                    if (rrQO.id_class(string, n) == id_protected[55]) {
                        stringBuilder.append(id_throws[15]);
                        ++n;
                        continue block10;
                    }
                    stringBuilder.append(id_throws[16]);
                    continue block10;
                }
                case '?': {
                    stringBuilder.append(id_throws[17]);
                    continue block10;
                }
            }
            if (rrQO.id_class(c)) {
                stringBuilder.append((char)id_protected[56]);
            }
            stringBuilder.append(c);
        }
        if (bl) {
            throw new PatternSyntaxException(id_throws[18], string, n - id_break[27]);
        }
        return stringBuilder.append((char)id_protected[57]).toString();
    }

    public static int id_class(Set<PosixFilePermission> set) {
        if (set == null) {
            return id_protected[6];
        }
        int n = id_break[2];
        for (PosixFilePermission posixFilePermission : set) {
            n |= rrQO.id_class(posixFilePermission);
        }
        return n;
    }

    private static boolean id_class(char c) {
        return id_throws[0].indexOf(c) != id_protected[34] ? id_break[10] : id_break[11];
    }

    public static void id_class(OutputStream outputStream, int n) throws IOException {
        outputStream.write(n & id_case[3]);
        outputStream.write(n >>> id_protected[7] & id_case[4]);
    }

    public static int id_class(PosixFilePermission posixFilePermission) {
        switch (((int[])rrQh_1.id_class[id_case[0]])[posixFilePermission.ordinal()]) {
            case 1: {
                return id_case[1];
            }
            case 2: {
                return id_case[2];
            }
            case 3: {
                return id_protected[0];
            }
            case 4: {
                return id_protected[1];
            }
            case 5: {
                return id_protected[2];
            }
            case 6: {
                return id_protected[3];
            }
            case 7: {
                return id_protected[4];
            }
            case 8: {
                return id_protected[5];
            }
            case 9: {
                return id_break[0];
            }
        }
        return id_break[1];
    }

    public static void id_class(OutputStream outputStream, long l) throws IOException {
        outputStream.write((int)(l & id_byte[4]));
        outputStream.write((int)(l >>> id_protected[11] & id_byte[5]));
        outputStream.write((int)(l >>> id_protected[12] & id_byte[6]));
        outputStream.write((int)(l >>> id_protected[13] & id_byte[7]));
        outputStream.write((int)(l >>> id_protected[14] & id_byte[8]));
        outputStream.write((int)(l >>> id_protected[15] & id_byte[9]));
        outputStream.write((int)(l >>> id_protected[16] & id_byte[10]));
        outputStream.write((int)(l >>> id_protected[17] & id_byte[11]));
    }

    public static long id_class(long l) {
        return (TimeUnit.MICROSECONDS.convert(l, TimeUnit.MILLISECONDS) - id_byte[23]) * id_byte[24];
    }

    public static byte[] id_class(byte[] byArray) {
        if (byArray.length != 0 && byArray[byArray.length - id_break[4]] != id_protected[18]) {
            byArray = Arrays.copyOf(byArray, byArray.length + id_break[5]);
            byArray[byArray.length - rrQO.id_break[6]] = id_protected[19];
        }
        return byArray;
    }

    public static void id_class(OutputStream outputStream, byte[] byArray) throws IOException {
        outputStream.write(byArray, id_break[3], byArray.length);
    }

    private static void id_class() {
        short[] sArray = new short[11];
        sArray[1] = 256;
        sArray[2] = 128;
        sArray[3] = 255;
        sArray[4] = 255;
        sArray[5] = 1900;
        sArray[6] = 1980;
        sArray[7] = 12;
        sArray[8] = 12;
        sArray[9] = 256;
        sArray[10] = 128;
        id_case = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD7C417C0;
    }

    private static boolean id_break(char c) {
        return id_throws[1].indexOf(c) != id_protected[35] ? id_break[12] : id_break[13];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-17, -32, 78, 4, -16, 8, -58, -88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static long id_break(long l) {
        int n = (int)((l >> id_protected[20] & id_byte[12]) + id_byte[13]);
        int n2 = (int)(l >> id_protected[21] & id_byte[14]);
        int n3 = (int)(l >> id_protected[22] & id_byte[15]);
        int n4 = (int)(l >> id_protected[23] & id_byte[16]);
        int n5 = (int)(l >> id_protected[24] & id_byte[17]);
        int n6 = (int)(l << id_break[7] & id_byte[18]);
        if (n2 > 0 && n2 < id_protected[25] && n3 > 0 && n4 < id_protected[26] && n5 < id_protected[27] && n6 < id_protected[28]) {
            try {
                LocalDateTime localDateTime = LocalDateTime.of(n, n2, n3, n4, n5, n6);
                return TimeUnit.MILLISECONDS.convert(localDateTime.toEpochSecond(ZoneId.systemDefault().getRules().getOffset(localDateTime)), TimeUnit.SECONDS);
            }
            catch (DateTimeException dateTimeException) {
                // empty catch block
            }
        }
        return rrQO.id_class(n, n2, n3, n4, n5, n6);
    }

    private static void id_break() {
        id_byte = new long[]{255L, 255L, 255L, 255L, 255L, 255L, 255L, 255L, 255L, 255L, 255L, 255L, 127L, 1980L, 15L, 31L, 31L, 63L, 62L, 0x210000L, 0xFFFFFFFFL, 10L, -11644473600000000L, -11644473600000000L, 10L, -11644473600000000L};
    }

    public static void id_break(OutputStream outputStream, long l) throws IOException {
        outputStream.write((int)(l & id_byte[0]));
        outputStream.write((int)(l >>> id_protected[8] & id_byte[1]));
        outputStream.write((int)(l >>> id_protected[9] & id_byte[2]));
        outputStream.write((int)(l >>> id_protected[10] & id_byte[3]));
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[33];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[16] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[24] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[30] = true;
        blArray[31] = true;
        id_break = blArray;
    }

    public static long id_throws(long l) {
        return TimeUnit.MILLISECONDS.convert(l, TimeUnit.SECONDS);
    }

    private static /* synthetic */ void ntfClinit() {
        rrQO.id_throws();
        rrQO.id_byte();
        rrQO.id_break();
        rrQO.id_class();
        rrQO.id_protected();
        rrQO.id_case();
    }

    private static long id_catch(long l) {
        return Long.rotateLeft(l, 32) ^ 0x44E4FE898684863BL;
    }

    public static long id_case(long l) {
        Instant instant = Instant.ofEpochMilli(l);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        int n = localDateTime.getYear() - id_case[6];
        if (n < 0) {
            return id_byte[19];
        }
        return (long)(n << id_protected[29] | localDateTime.getMonthValue() << id_protected[30] | localDateTime.getDayOfMonth() << id_protected[31] | localDateTime.getHour() << id_protected[32] | localDateTime.getMinute() << id_protected[33] | localDateTime.getSecond() >> id_break[9]) & id_byte[20];
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{256, 128, 64, 32, 16, 8, 4, 2, 1, -11644473600000000L, id_throws[19], id_throws[20], Character.valueOf('\u0000')};
        id_class = objectArray;
    }

    public static long id_protected(long l) {
        return TimeUnit.MILLISECONDS.convert(l / id_byte[21] + id_byte[22], TimeUnit.MICROSECONDS);
    }

    private static void id_protected() {
        id_protected = new byte[]{64, 32, 16, 8, 4, 2, -1, 8, 8, 16, 24, 8, 16, 24, 32, 40, 48, 56, 47, 47, 25, 21, 16, 11, 5, 13, 24, 60, 60, 25, 21, 16, 11, 5, -1, -1, 92, 94, 33, 94, 45, 45, 93, 47, 92, 91, 38, 38, 92, 45, 93, 3, 93, 125, 44, 42, 92, 36, 12, 13, 2, 64, 3, 32, 4, 16, 5, 8, 6, 4, 7, 2, 8, 9, 10, 11, 12};
    }
}

