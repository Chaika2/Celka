/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQs_1;
import celestial.rrzT_2;
import celestial.rrzt_3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzq_3
implements BasicFileAttributeView {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;
    public Object[] id_class;
    private static byte[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        id_byte = blArray;
    }

    public rrzq_3(rrQs_1 rrQs_12, boolean bl) {
        this.id_protected();
        rrQs_1 rrQs_13 = rrQs_12;
        this.id_class[rrzq_3.id_break[0]] = rrQs_13;
        Boolean bl2 = bl;
        this.id_class[rrzq_3.id_break[1]] = bl2;
    }

    static {
        rrzq_3.ntfClinit();
    }

    @Override
    public String name() {
        return (Boolean)this.id_class[id_break[2]] != false ? id_protected[0] : id_protected[1];
    }

    private static void id_class() {
        short[] sArray = new short[14];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[6] = 3;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 14;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        id_break = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBD08A2F9;
    }

    public Object id_class(rrzT_2 rrzT_22, rrzt_3 rrzt_32) {
        switch (rrzT_22.ordinal()) {
            case 0: {
                return rrzt_32.size();
            }
            case 1: {
                return rrzt_32.creationTime();
            }
            case 2: {
                return rrzt_32.lastAccessTime();
            }
            case 3: {
                return rrzt_32.lastModifiedTime();
            }
            case 4: {
                return rrzt_32.isDirectory();
            }
            case 5: {
                return rrzt_32.isRegularFile();
            }
            case 6: {
                return rrzt_32.isSymbolicLink();
            }
            case 7: {
                return rrzt_32.isOther();
            }
            case 8: {
                return rrzt_32.fileKey();
            }
            case 9: {
                if (!((Boolean)this.id_class[id_break[10]]).booleanValue()) break;
                return rrzt_32.id_protected();
            }
            case 10: {
                if (!((Boolean)this.id_class[id_break[11]]).booleanValue()) break;
                return rrzt_32.id_case();
            }
            case 11: {
                if (!((Boolean)this.id_class[id_break[12]]).booleanValue()) break;
                return rrzt_32.id_break();
            }
            case 14: {
                if (!((Boolean)this.id_class[id_break[13]]).booleanValue()) break;
                return rrzt_32.id_class().orElse(null);
            }
        }
        return null;
    }

    public void id_class(String string, Object object) throws IOException {
        try {
            if (rrzT_2.valueOf(string) == (rrzT_2)((Object)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[id_break[6]])) {
                this.setTimes((FileTime)object, null, null);
            }
            if (rrzT_2.valueOf(string) == (rrzT_2)((Object)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[id_break[7]])) {
                this.setTimes(null, (FileTime)object, null);
            }
            if (rrzT_2.valueOf(string) == (rrzT_2)((Object)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[id_break[8]])) {
                this.setTimes(null, null, (FileTime)object);
            }
            if (rrzT_2.valueOf(string) == (rrzT_2)((Object)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[id_break[9]])) {
                this.setPermissions((Set)object);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new UnsupportedOperationException("'" + string + "' is unknown or read-only attribute");
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB463B19F5099A2C8L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{15, -80, -89, -68, -42, 98, 45, -78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public BasicFileAttributes readAttributes() throws IOException {
        return ((rrQs_1)this.id_class[id_break[3]]).id_class();
    }

    private static void id_break() {
        id_throws = new byte[]{2};
    }

    public Map<String, Object> id_break(String string) throws IOException {
        rrzt_3 rrzt_32 = (rrzt_3)this.readAttributes();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        if (id_protected[2].equals(string)) {
            rrzT_2[] rrzT_2Array = rrzT_2.values();
            int n = rrzT_2Array.length;
            for (int i = id_byte[0]; i < n; ++i) {
                rrzT_2 rrzT_22 = rrzT_2Array[i];
                try {
                    linkedHashMap.put(rrzT_22.name(), this.id_class(rrzT_22, rrzt_32));
                    continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
        } else {
            String[] stringArray;
            String[] stringArray2 = stringArray = string.split(id_protected[3]);
            int n = stringArray2.length;
            for (int i = id_byte[1]; i < n; ++i) {
                String string2 = stringArray2[i];
                try {
                    linkedHashMap.put(string2, this.id_class(rrzT_2.valueOf(string2), rrzt_32));
                    continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
        }
        return linkedHashMap;
    }

    private static void id_throws() {
        id_protected = new String[]{new String("zip"), new String("basic"), new String("*"), new String(",")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrzq_3.id_byte();
        rrzq_3.id_throws();
        rrzq_3.id_class();
        rrzq_3.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrzq_3.id_byte[2]] = id_byte[3];
        }
    }

    public void setPermissions(Set<PosixFilePermission> set) throws IOException {
        ((rrQs_1)this.id_class[id_break[5]]).id_class(set);
    }

    @Override
    public void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        ((rrQs_1)this.id_class[id_break[4]]).id_class(fileTime, fileTime2, fileTime3);
    }
}

