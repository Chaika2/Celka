/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQE;
import celestial.rrQG;
import celestial.rrQb_1;
import celestial.rrzC_2;
import celestial.rrzf_3;
import celestial.rrzq_3;
import celestial.rrzt_3;
import celestial.rrzy_3;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.security.Key;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQs_1
implements Path {
    private static String[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    public static Object[] id_class;
    public Object[] id_break;
    private static boolean[] id_case;

    private void id_byte(rrQs_1 rrQs_12, CopyOption ... copyOptionArray) throws IOException {
        Object object;
        boolean bl = id_case[154];
        boolean bl2 = id_case[155];
        Object object2 = copyOptionArray;
        int n = ((CopyOption[])object2).length;
        for (int i = id_case[156]; i < n; ++i) {
            object = object2[i];
            if (object == StandardCopyOption.REPLACE_EXISTING) {
                bl = id_case[157];
                continue;
            }
            if (object != StandardCopyOption.COPY_ATTRIBUTES) continue;
            bl2 = id_case[158];
        }
        object2 = this.id_class();
        if (bl) {
            try {
                rrQs_12.id_continue();
                n = id_case[159];
            }
            catch (DirectoryNotEmptyException directoryNotEmptyException) {
                n = id_case[160];
            }
        } else {
            n = rrQs_12.id_final() ? 1 : 0;
        }
        if (n != 0) {
            throw new FileAlreadyExistsException(rrQs_12.toString());
        }
        if (object2.isDirectory()) {
            rrQs_12.id_class(new FileAttribute[id_case[161]]);
        } else {
            try (InputStream inputStream = ((rrzf_3)this.id_break[id_protected[190]]).id_byte(this.id_throws());){
                object = rrQs_12.id_class(new OpenOption[id_case[162]]);
                try {
                    inputStream.transferTo((OutputStream)object);
                }
                finally {
                    if (object != null) {
                        ((OutputStream)object).close();
                    }
                }
            }
        }
        if (bl2) {
            rrzq_3 rrzq_32 = rrQs_12.id_break(rrzq_3.class);
            try {
                rrzq_32.setTimes(object2.lastModifiedTime(), object2.lastAccessTime(), object2.creationTime());
                rrzq_32.setPermissions(object2.id_class().orElse(null));
            }
            catch (IOException iOException) {
                try {
                    rrQs_12.id_byte();
                }
                catch (IOException iOException2) {
                    // empty catch block
                }
                throw iOException;
            }
        }
    }

    public void id_byte() throws IOException {
        ((rrzf_3)this.id_break[id_protected[164]]).id_class(this.id_throws(), id_case[137]);
    }

    private static String id_byte(String string) {
        if (string == null) {
            return null;
        }
        int n = string.length();
        if (n == 0) {
            return string;
        }
        if (string.indexOf(id_throws[80]) < 0) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(n);
        byte[] byArray = new byte[n];
        boolean bl = id_case[163];
        int n2 = id_case[164];
        while (n2 < n) {
            char c = string.charAt(n2);
            if (c == id_throws[81]) {
                bl = id_case[165];
            } else if (bl && c == id_throws[82]) {
                bl = id_case[166];
            }
            if (c != id_throws[83] || bl) {
                stringBuilder.append(c);
                ++n2;
                continue;
            }
            int n3 = id_case[167];
            while (c == id_throws[84]) {
                if (!((Boolean)id_class[id_protected[192]]).booleanValue() && n - n2 < id_throws[85]) {
                    throw new AssertionError();
                }
                byArray[n3++] = (byte)((rrQs_1.id_class(string.charAt(++n2)) & id_throws[86]) << id_throws[87] | rrQs_1.id_class(string.charAt(++n2)) & id_throws[88]);
                if (++n2 >= n) break;
                c = string.charAt(n2);
            }
            stringBuilder.append(new String(byArray, id_case[168], n3, StandardCharsets.UTF_8));
        }
        return stringBuilder.toString();
    }

    private rrQs_1 id_byte(Path path) {
        Objects.requireNonNull(path, id_byte[4]);
        if (!(path instanceof rrQs_1)) {
            throw new ProviderMismatchException();
        }
        return (rrQs_1)path;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void id_int() {
        if ((int[])this.id_break[id_protected[106]] == null) {
            int n = id_case[82];
            int n2 = id_case[83];
            if (((byte[])this.id_break[id_protected[107]]).length == 0) {
                n = id_case[84];
            } else {
                while (n2 < ((byte[])this.id_break[id_protected[108]]).length) {
                    byte by;
                    if ((by = ((byte[])this.id_break[id_protected[109]])[n2++]) == id_throws[23]) continue;
                    ++n;
                    while (n2 < ((byte[])this.id_break[id_protected[110]]).length && ((byte[])this.id_break[id_protected[111]])[n2] != id_throws[24]) {
                        ++n2;
                    }
                }
            }
            int[] nArray = new int[n];
            n = id_case[85];
            n2 = id_case[86];
            while (n2 < ((byte[])this.id_break[id_protected[112]]).length) {
                byte by = ((byte[])this.id_break[id_protected[113]])[n2];
                if (by == id_throws[25]) {
                    ++n2;
                    continue;
                }
                nArray[n++] = n2++;
                while (n2 < ((byte[])this.id_break[id_protected[114]]).length && ((byte[])this.id_break[id_protected[115]])[n2] != id_throws[26]) {
                    ++n2;
                }
            }
            rrQs_1 rrQs_12 = this;
            synchronized (rrQs_12) {
                if ((int[])this.id_break[id_protected[116]] == null) {
                    int[] nArray2 = nArray;
                    this.id_break[rrQs_1.id_protected[117]] = nArray2;
                }
            }
        }
    }

    public rrQs_1(rrzf_3 rrzf_32, byte[] byArray) {
        this(rrzf_32, byArray, id_case[0]);
    }

    public rrQs_1(rrzf_3 rrzf_32, String string) {
        this.id_super();
        Integer n = id_case[2];
        this.id_break[rrQs_1.id_protected[7]] = n;
        Object var8_4 = null;
        this.id_break[rrQs_1.id_protected[8]] = var8_4;
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_break[rrQs_1.id_protected[9]] = rrzf_33;
        byte[] byArray = this.id_throws(string);
        this.id_break[rrQs_1.id_protected[10]] = byArray;
    }

    public rrQs_1(rrzf_3 rrzf_32, byte[] byArray, boolean bl) {
        this.id_super();
        Integer n = id_case[1];
        this.id_break[rrQs_1.id_protected[0]] = n;
        Object var9_5 = null;
        this.id_break[rrQs_1.id_protected[1]] = var9_5;
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_break[rrQs_1.id_protected[2]] = rrzf_33;
        if (bl) {
            byte[] byArray2 = byArray;
            this.id_break[rrQs_1.id_protected[3]] = byArray2;
        } else if (((rrzC_2)rrzf_32.id_break[id_protected[4]]).id_class()) {
            byte[] byArray3 = this.id_break(byArray);
            this.id_break[rrQs_1.id_protected[5]] = byArray3;
        } else {
            byte[] byArray4 = this.id_throws(rrzf_32.id_throws(byArray));
            this.id_break[rrQs_1.id_protected[6]] = byArray4;
        }
    }

    static {
        rrQs_1.ntfClinit();
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof rrQs_1 && (rrzf_3)this.id_break[id_protected[150]] == (rrzf_3)((rrQs_1)object).id_break[id_protected[151]] && this.compareTo((Path)object) == 0 ? id_case[124] : id_case[125];
    }

    @Override
    public String toString() {
        return ((rrzf_3)this.id_break[id_protected[145]]).id_throws((byte[])this.id_break[id_protected[146]]);
    }

    @Override
    public int hashCode() {
        int n = (Integer)this.id_break[id_protected[147]];
        if (n == 0) {
            n = Arrays.hashCode((byte[])this.id_break[id_protected[148]]);
            Integer n2 = n;
            this.id_break[rrQs_1.id_protected[149]] = n2;
        }
        return n;
    }

    @Override
    public int compareTo(Path path) {
        rrQs_1 rrQs_12 = this.id_byte(path);
        int n = ((byte[])this.id_break[id_protected[152]]).length;
        int n2 = ((byte[])rrQs_12.id_break[id_protected[153]]).length;
        int n3 = Math.min(n, n2);
        for (int i = id_case[126]; i < n3; ++i) {
            int n4 = ((byte[])this.id_break[id_protected[154]])[i] & id_protected[155];
            int n5 = ((byte[])rrQs_12.id_break[id_protected[156]])[i] & id_protected[157];
            if (n4 == n5) continue;
            return n4 - n5;
        }
        return n - n2;
    }

    @Override
    public /* synthetic */ Path getName(int n) {
        return this.id_class(n);
    }

    private static void id_this() {
        id_throws = new byte[]{47, 47, 47, 47, 47, 47, 3, 46, 46, 47, 47, 47, 47, 47, 47, 47, 47, -1, -1, 47, -1, 47, 47, 47, 47, 47, 47, 92, 47, 47, 47, 92, 47, 47, 47, 47, 92, 47, 47, 47, 92, 47, 47, 47, 47, 46, 47, -1, 46, 47, 47, 2, 46, 46, 47, 47, 47, 47, 47, 47, 47, 47, 58, -1, 58, -1, 3, 2, 48, 57, 48, 97, 102, 97, 10, 65, 70, 65, 10, -1, 37, 91, 93, 37, 37, 2, 15, 4, 15, 5, 3};
    }

    @Override
    public boolean startsWith(String string) {
        return this.startsWith(((rrzf_3)this.id_break[id_protected[102]]).id_class(string, new String[id_case[79]]));
    }

    @Override
    public boolean startsWith(Path path) {
        Objects.requireNonNull(path, id_byte[2]);
        if (!(path instanceof rrQs_1)) {
            return id_case[59];
        }
        rrQs_1 rrQs_12 = (rrQs_1)path;
        if (rrQs_12.isAbsolute() != this.isAbsolute() || ((byte[])rrQs_12.id_break[id_protected[82]]).length > ((byte[])this.id_break[id_protected[83]]).length) {
            return id_case[60];
        }
        int n = ((byte[])rrQs_12.id_break[id_protected[84]]).length;
        for (int i = id_case[61]; i < n; ++i) {
            if (((byte[])rrQs_12.id_break[id_protected[85]])[i] == ((byte[])this.id_break[id_protected[86]])[i]) continue;
            return id_case[62];
        }
        return ((byte[])rrQs_12.id_break[id_protected[87]]).length == ((byte[])this.id_break[id_protected[88]]).length || ((byte[])rrQs_12.id_break[id_protected[89]])[--n] == id_throws[13] || ((byte[])this.id_break[id_protected[90]])[n + id_case[63]] == id_throws[14] ? id_case[64] : id_case[65];
    }

    @Override
    public Iterator<Path> iterator() {
        return new rrQE(this);
    }

    @Override
    public boolean endsWith(Path path) {
        int n;
        Objects.requireNonNull(path, id_byte[3]);
        if (!(path instanceof rrQs_1)) {
            return id_case[66];
        }
        rrQs_1 rrQs_12 = (rrQs_1)path;
        int n2 = ((byte[])rrQs_12.id_break[id_protected[91]]).length - id_case[67];
        if (n2 > 0 && ((byte[])rrQs_12.id_break[id_protected[92]])[n2] == id_throws[15]) {
            --n2;
        }
        if ((n = ((byte[])this.id_break[id_protected[93]]).length - id_case[68]) > 0 && ((byte[])this.id_break[id_protected[94]])[n] == id_throws[16]) {
            --n;
        }
        if (n2 == id_throws[17]) {
            return n == id_throws[18] ? id_case[69] : id_case[70];
        }
        if (rrQs_12.isAbsolute() && (!this.isAbsolute() || n2 != n) || n < n2) {
            return id_case[71];
        }
        while (n2 >= 0) {
            if (((byte[])rrQs_12.id_break[id_protected[95]])[n2] != ((byte[])this.id_break[id_protected[96]])[n]) {
                return id_case[72];
            }
            --n2;
            --n;
        }
        return ((byte[])rrQs_12.id_break[id_protected[97]])[n2 + id_case[73]] == id_throws[19] || n == id_throws[20] || ((byte[])this.id_break[id_protected[98]])[n] == id_throws[21] ? id_case[74] : id_case[75];
    }

    @Override
    public boolean endsWith(String string) {
        return this.endsWith(((rrzf_3)this.id_break[id_protected[103]]).id_class(string, new String[id_case[80]]));
    }

    public void id_class(Set<PosixFilePermission> set) throws IOException {
        ((rrzf_3)this.id_break[id_protected[171]]).id_class(this.id_throws(), set);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-28, 102, -6, -50, 24, 63, -91, -10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(UserPrincipal userPrincipal) throws IOException {
        ((rrzf_3)this.id_break[id_protected[170]]).id_class(this.id_throws(), userPrincipal);
    }

    private byte[] id_class(String string, int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder(n2);
        stringBuilder.append(string, id_case[103], n);
        char c = id_case[104];
        while (n < n2) {
            char c2;
            if ((c2 = string.charAt(n++)) == id_throws[40]) {
                c2 = id_throws[41];
            }
            if (c2 == id_throws[42] && c == id_throws[43]) continue;
            if (c2 == '\u0000') {
                throw new InvalidPathException(string, id_byte[6]);
            }
            stringBuilder.append(c2);
            c = c2;
        }
        n2 = stringBuilder.length();
        if (n2 > id_case[105] && c == id_throws[44]) {
            stringBuilder.delete(n2 - id_case[106], n2);
        }
        return ((rrzf_3)this.id_break[id_protected[126]]).id_class(stringBuilder.toString());
    }

    public void id_class(FileAttribute<?> ... fileAttributeArray) throws IOException {
        ((rrzf_3)this.id_break[id_protected[162]]).id_class(this.id_throws(), fileAttributeArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x27C29C998F27D6EEL;
    }

    public OutputStream id_class(OpenOption ... openOptionArray) throws IOException {
        if (openOptionArray.length == 0) {
            OpenOption[] openOptionArray2 = new OpenOption[id_throws[66]];
            openOptionArray2[rrQs_1.id_case[150]] = StandardOpenOption.CREATE;
            openOptionArray2[rrQs_1.id_case[151]] = StandardOpenOption.TRUNCATE_EXISTING;
            openOptionArray2[rrQs_1.id_throws[67]] = StandardOpenOption.WRITE;
            return ((rrzf_3)this.id_break[id_protected[182]]).id_class(this.id_throws(), openOptionArray2);
        }
        return ((rrzf_3)this.id_break[id_protected[183]]).id_class(this.id_throws(), openOptionArray);
    }

    public void id_class(String string, Object object, LinkOption ... linkOptionArray) throws IOException {
        String string2;
        String string3;
        int n = string.indexOf(id_throws[62]);
        if (n == id_throws[63]) {
            string3 = id_byte[11];
            string2 = string;
        } else {
            string3 = string.substring(id_case[139], n++);
            string2 = string.substring(n);
        }
        this.id_protected(string3).id_class(string2, object);
    }

    public SeekableByteChannel id_class(Set<? extends OpenOption> set, FileAttribute<?> ... fileAttributeArray) throws IOException {
        return ((rrzf_3)this.id_break[id_protected[176]]).id_break(this.id_throws(), set, fileAttributeArray);
    }

    private byte[] id_class(byte[] byArray, int n) {
        int n2;
        byte[] byArray2 = new byte[byArray.length];
        for (n2 = id_case[92]; n2 < n; ++n2) {
            byArray2[n2] = byArray[n2];
        }
        int n3 = n2;
        byte by = id_case[93];
        while (n2 < byArray.length) {
            byte by2;
            if ((by2 = byArray[n2++]) == id_throws[31]) {
                by2 = id_throws[32];
            }
            if (by2 == id_throws[33] && by == id_throws[34]) continue;
            if (by2 == 0) {
                throw new InvalidPathException(((rrzf_3)this.id_break[id_protected[121]]).id_throws(byArray), id_byte[5]);
            }
            byArray2[n3++] = by2;
            by = by2;
        }
        if (n3 > id_case[94] && byArray2[n3 - id_case[95]] == id_throws[35]) {
            --n3;
        }
        return n3 == byArray2.length ? byArray2 : Arrays.copyOf(byArray2, n3);
    }

    public rrQs_1 id_class(Path path) {
        rrQs_1 rrQs_12 = this.id_byte(path);
        if (((byte[])rrQs_12.id_break[id_protected[76]]).length == 0) {
            return this;
        }
        if (rrQs_12.isAbsolute() || ((byte[])this.id_break[id_protected[77]]).length == 0) {
            return rrQs_12;
        }
        return this.id_class((byte[])rrQs_12.id_break[id_protected[78]]);
    }

    public rrQs_1 id_class(LinkOption ... linkOptionArray) throws IOException {
        rrQs_1 rrQs_12;
        byte[] byArray = this.id_throws();
        if (byArray == (byte[])this.id_break[id_protected[37]]) {
            rrQs_12 = this;
        } else {
            rrQs_12 = new rrQs_1((rrzf_3)this.id_break[id_protected[38]], byArray, id_case[18]);
            byte[] byArray2 = byArray;
            rrQs_12.id_break[rrQs_1.id_protected[39]] = byArray2;
        }
        rrQs_12.id_class(new AccessMode[id_case[19]]);
        return rrQs_12;
    }

    private static int id_class(char c) {
        if (c >= id_throws[68] && c <= id_throws[69]) {
            return c - id_throws[70];
        }
        if (c >= id_throws[71] && c <= id_throws[72]) {
            return c - id_throws[73] + id_throws[74];
        }
        if (c >= id_throws[75] && c <= id_throws[76]) {
            return c - id_throws[77] + id_throws[78];
        }
        if (!((Boolean)id_class[id_protected[191]]).booleanValue()) {
            throw new AssertionError();
        }
        return id_throws[79];
    }

    public rrQs_1 id_class(int n) {
        this.id_int();
        if (n < 0 || n >= ((int[])this.id_break[id_protected[22]]).length) {
            throw new IllegalArgumentException();
        }
        int n2 = ((int[])this.id_break[id_protected[23]])[n];
        int n3 = n == ((int[])this.id_break[id_protected[24]]).length - id_case[12] ? ((byte[])this.id_break[id_protected[25]]).length - n2 : ((int[])this.id_break[id_protected[26]])[n + id_case[13]] - n2 - id_case[14];
        byte[] byArray = new byte[n3];
        System.arraycopy((byte[])this.id_break[id_protected[27]], n2, byArray, id_case[15], n3);
        return new rrQs_1((rrzf_3)this.id_break[id_protected[28]], byArray);
    }

    public void id_class(AccessMode ... accessModeArray) throws IOException {
        boolean bl = id_case[145];
        boolean bl2 = id_case[146];
        AccessMode[] accessModeArray2 = accessModeArray;
        int n = accessModeArray2.length;
        block5: for (int i = id_case[147]; i < n; ++i) {
            AccessMode accessMode = accessModeArray2[i];
            switch (((int[])rrQG.id_class[id_protected[178]])[accessMode.ordinal()]) {
                case 1: {
                    continue block5;
                }
                case 2: {
                    bl = id_case[148];
                    continue block5;
                }
                case 3: {
                    bl2 = id_case[149];
                    continue block5;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }
        ((rrzf_3)this.id_break[id_protected[179]]).id_class(this.id_throws());
        if (bl && ((rrzf_3)this.id_break[id_protected[180]]).isReadOnly() || bl2) {
            throw new AccessDeniedException(this.toString());
        }
    }

    public Map<String, Object> id_class(String string, LinkOption ... linkOptionArray) throws IOException {
        String string2;
        String string3;
        int n = string.indexOf(id_throws[64]);
        if (n == id_throws[65]) {
            string3 = id_byte[12];
            string2 = string;
        } else {
            string3 = string.substring(id_case[140], n++);
            string2 = string.substring(n);
        }
        return this.id_protected(string3).id_break(string2);
    }

    public rrQs_1 id_class(int n, int n2) {
        this.id_int();
        if (n < 0 || n >= ((int[])this.id_break[id_protected[29]]).length || n2 > ((int[])this.id_break[id_protected[30]]).length || n >= n2) {
            throw new IllegalArgumentException();
        }
        int n3 = ((int[])this.id_break[id_protected[31]])[n];
        int n4 = n2 == ((int[])this.id_break[id_protected[32]]).length ? ((byte[])this.id_break[id_protected[33]]).length - n3 : ((int[])this.id_break[id_protected[34]])[n2] - n3 - id_case[16];
        byte[] byArray = new byte[n4];
        System.arraycopy((byte[])this.id_break[id_protected[35]], n3, byArray, id_case[17], n4);
        return new rrQs_1((rrzf_3)this.id_break[id_protected[36]], byArray);
    }

    public void id_class(rrQs_1 rrQs_12, CopyOption ... copyOptionArray) throws IOException {
        if (Files.isSameFile(((rrzf_3)this.id_break[id_protected[184]]).id_break(), ((rrzf_3)rrQs_12.id_break[id_protected[185]]).id_break())) {
            ((rrzf_3)this.id_break[id_protected[186]]).id_class(id_case[152], this.id_throws(), rrQs_12.id_throws(), copyOptionArray);
        } else {
            this.id_byte(rrQs_12, copyOptionArray);
            this.id_byte();
        }
    }

    public rrzt_3 id_class() throws IOException {
        rrzt_3 rrzt_32 = ((rrzf_3)this.id_break[id_protected[166]]).id_break(this.id_throws());
        if (rrzt_32 == null) {
            throw new NoSuchFileException(this.toString());
        }
        return rrzt_32;
    }

    public DirectoryStream<Path> id_class(DirectoryStream.Filter<? super Path> filter) throws IOException {
        return new rrzy_3(this, filter);
    }

    private boolean id_class(rrQs_1 rrQs_12, int n) {
        int n2 = ((int[])this.id_break[id_protected[47]])[n];
        int n3 = n == ((int[])this.id_break[id_protected[48]]).length - id_case[26] ? ((byte[])this.id_break[id_protected[49]]).length - n2 : ((int[])this.id_break[id_protected[50]])[n + id_case[27]] - n2 - id_case[28];
        int n4 = ((int[])rrQs_12.id_break[id_protected[51]])[n];
        int n5 = n == ((int[])rrQs_12.id_break[id_protected[52]]).length - id_case[29] ? ((byte[])rrQs_12.id_break[id_protected[53]]).length - n4 : ((int[])rrQs_12.id_break[id_protected[54]])[n + id_case[30]] - n4 - id_case[31];
        if (n3 != n5) {
            return id_case[32];
        }
        for (int i = id_case[33]; i < n3; ++i) {
            if (((byte[])this.id_break[id_protected[55]])[n2 + i] == ((byte[])rrQs_12.id_break[id_protected[56]])[n4 + i]) continue;
            return id_case[34];
        }
        return id_case[35];
    }

    public <A extends BasicFileAttributes> A id_class(Class<A> clazz) throws IOException {
        if (clazz == BasicFileAttributes.class || clazz == rrzt_3.class) {
            return (A)this.id_class();
        }
        if (clazz == PosixFileAttributes.class && ((Boolean)((rrzf_3)this.id_break[rrQs_1.id_protected[167]]).id_break[id_protected[168]]).booleanValue()) {
            return (A)this.id_class();
        }
        throw new UnsupportedOperationException("Attributes of type " + clazz.getName() + " not supported");
    }

    public void id_class(GroupPrincipal groupPrincipal) throws IOException {
        ((rrzf_3)this.id_break[id_protected[172]]).id_class(this.id_throws(), groupPrincipal);
    }

    private rrQs_1 id_class(byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3 = (byte[])this.id_break[id_protected[79]];
        int n = byArray3.length;
        int n2 = byArray.length;
        if (((byte[])this.id_break[id_protected[80]])[n - id_case[49]] == id_throws[11]) {
            byArray2 = new byte[n + n2];
            System.arraycopy(byArray3, id_case[50], byArray2, id_case[51], n);
            System.arraycopy(byArray, id_case[52], byArray2, n, n2);
        } else {
            byArray2 = new byte[n + id_case[53] + n2];
            System.arraycopy(byArray3, id_case[54], byArray2, id_case[55], n);
            byArray2[n] = id_throws[12];
            System.arraycopy(byArray, id_case[56], byArray2, n + id_case[57], n2);
        }
        return new rrQs_1((rrzf_3)this.id_break[id_protected[81]], byArray2, id_case[58]);
    }

    public void id_class(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        ((rrzf_3)this.id_break[id_protected[169]]).id_class(this.id_throws(), fileTime, fileTime2, fileTime3);
    }

    @Override
    public WatchKey register(WatchService watchService, WatchEvent.Kind<?> ... kindArray) {
        return this.register(watchService, kindArray, new WatchEvent.Modifier[id_case[127]]);
    }

    @Override
    public WatchKey register(WatchService watchService, WatchEvent.Kind<?>[] kindArray, WatchEvent.Modifier ... modifierArray) {
        if (watchService == null || kindArray == null || modifierArray == null) {
            throw new NullPointerException();
        }
        throw new ProviderMismatchException();
    }

    @Override
    public boolean isAbsolute() {
        return ((byte[])this.id_break[id_protected[74]]).length > 0 && ((byte[])this.id_break[id_protected[75]])[id_case[46]] == id_throws[10] ? id_case[47] : id_case[48];
    }

    @Override
    public /* synthetic */ Path resolve(String string) {
        return this.id_break(string);
    }

    @Override
    public /* synthetic */ Path resolve(Path path) {
        return this.id_class(path);
    }

    @Override
    public /* synthetic */ Path getParent() {
        return this.id_case();
    }

    @Override
    public /* synthetic */ Path getRoot() {
        return this.id_protected();
    }

    @Override
    public /* synthetic */ Path getFileName() {
        return this.id_implements();
    }

    @Override
    public /* synthetic */ Path toRealPath(LinkOption[] linkOptionArray) throws IOException {
        return this.id_class(linkOptionArray);
    }

    @Override
    public File toFile() {
        throw new UnsupportedOperationException();
    }

    private byte[] id_break(byte[] byArray) {
        int n = byArray.length;
        if (n == 0) {
            return byArray;
        }
        byte by = id_case[87];
        for (int i = id_case[88]; i < n; ++i) {
            byte by2 = byArray[i];
            if (by2 == id_throws[27] || by2 == 0) {
                return this.id_class(byArray, i);
            }
            if (by2 == id_throws[28] && by == id_throws[29]) {
                return this.id_class(byArray, i - id_case[89]);
            }
            by = by2;
        }
        if (n > id_case[90] && by == id_throws[30]) {
            return Arrays.copyOf(byArray, n - id_case[91]);
        }
        return byArray;
    }

    public <V extends FileAttributeView> V id_break(Class<V> clazz) {
        if (clazz == null) {
            throw new NullPointerException();
        }
        if (clazz == BasicFileAttributeView.class) {
            return (V)new rrzq_3(this, id_case[128]);
        }
        if (clazz == rrzq_3.class) {
            return (V)new rrzq_3(this, id_case[129]);
        }
        if (((Boolean)((rrzf_3)this.id_break[rrQs_1.id_protected[158]]).id_break[id_protected[159]]).booleanValue()) {
            if (clazz == PosixFileAttributeView.class) {
                return (V)new rrQb_1(this, id_case[130]);
            }
            if (clazz == FileOwnerAttributeView.class) {
                return (V)new rrQb_1(this, id_case[131]);
            }
        }
        return null;
    }

    public rrQs_1 id_break() {
        if (this.isAbsolute()) {
            return this;
        }
        byte[] byArray = new byte[((byte[])this.id_break[id_protected[40]]).length + id_case[21]];
        System.arraycopy((byte[])this.id_break[id_protected[41]], id_case[22], byArray, id_case[23], ((byte[])this.id_break[id_protected[42]]).length);
        byArray[rrQs_1.id_case[24]] = id_throws[4];
        return new rrQs_1((rrzf_3)this.id_break[id_protected[43]], byArray, id_case[25]);
    }

    public boolean id_break(Path path) throws IOException {
        if (this.equals(path)) {
            return id_case[141];
        }
        if (path == null || this.id_private() != path.getFileSystem()) {
            return id_case[142];
        }
        this.id_class(new AccessMode[id_case[143]]);
        ((rrQs_1)path).id_class(new AccessMode[id_case[144]]);
        return Arrays.equals(this.id_throws(), ((rrQs_1)path).id_throws());
    }

    public rrQs_1 id_break(String string) {
        byte[] byArray = this.id_throws(string);
        if (byArray.length == 0) {
            return this;
        }
        if (byArray[id_case[76]] == id_throws[22] || ((byte[])this.id_break[id_protected[99]]).length == 0) {
            return new rrQs_1((rrzf_3)this.id_break[id_protected[100]], byArray, id_case[77]);
        }
        return this.id_class(byArray);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD3942EE6;
    }

    public void id_break(rrQs_1 rrQs_12, CopyOption ... copyOptionArray) throws IOException {
        if (Files.isSameFile(((rrzf_3)this.id_break[id_protected[187]]).id_break(), ((rrzf_3)rrQs_12.id_break[id_protected[188]]).id_break())) {
            ((rrzf_3)this.id_break[id_protected[189]]).id_class(id_case[153], this.id_throws(), rrQs_12.id_throws(), copyOptionArray);
        } else {
            this.id_byte(rrQs_12, copyOptionArray);
        }
    }

    public InputStream id_break(OpenOption ... openOptionArray) throws IOException {
        if (openOptionArray.length > 0) {
            OpenOption[] openOptionArray2 = openOptionArray;
            int n = openOptionArray2.length;
            for (int i = id_case[136]; i < n; ++i) {
                OpenOption openOption = openOptionArray2[i];
                if (openOption == StandardOpenOption.READ) continue;
                throw new UnsupportedOperationException("'" + String.valueOf(openOption) + "' not allowed");
            }
        }
        return ((rrzf_3)this.id_break[id_protected[163]]).id_byte(this.id_throws());
    }

    public FileChannel id_break(Set<? extends OpenOption> set, FileAttribute<?> ... fileAttributeArray) throws IOException {
        return ((rrzf_3)this.id_break[id_protected[177]]).id_class(this.id_throws(), set, fileAttributeArray);
    }

    private byte[] id_throws(String string) {
        if (((rrzC_2)((rrzf_3)this.id_break[rrQs_1.id_protected[122]]).id_break[id_protected[123]]).id_class()) {
            return this.id_break(((rrzf_3)this.id_break[id_protected[124]]).id_class(string));
        }
        int n = string.length();
        if (n == 0) {
            return new byte[id_case[96]];
        }
        char c = id_case[97];
        for (int i = id_case[98]; i < n; ++i) {
            char c2 = string.charAt(i);
            if (c2 == id_throws[36] || c2 == '\u0000') {
                return this.id_class(string, i, n);
            }
            if (c2 == id_throws[37] && c == id_throws[38]) {
                return this.id_class(string, i - id_case[99], n);
            }
            c = c2;
        }
        if (n > id_case[100] && c == id_throws[39]) {
            string = string.substring(id_case[101], n - id_case[102]);
        }
        return ((rrzf_3)this.id_break[id_protected[125]]).id_class(string);
    }

    public byte[] id_throws() {
        byte[] byArray = (byte[])this.id_break[id_protected[118]];
        if (byArray == null) {
            byArray = this.isAbsolute() ? this.id_extends() : this.id_break().id_throws();
            byte[] byArray2 = byArray;
            this.id_break[rrQs_1.id_protected[119]] = byArray2;
        }
        return (byte[])this.id_break[id_protected[120]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrQs_1.id_new();
        rrQs_1.id_native();
        rrQs_1.id_package();
        rrQs_1.id_this();
        rrQs_1.id_else();
    }

    public boolean id_finally() {
        return id_case[20];
    }

    public FileStore id_catch() throws IOException {
        if (this.id_final()) {
            return ((rrzf_3)this.id_break[id_protected[173]]).id_class(this);
        }
        throw new NoSuchFileException(((rrzf_3)this.id_break[id_protected[174]]).id_throws((byte[])this.id_break[id_protected[175]]));
    }

    private byte[] id_extends() {
        for (int i = id_case[107]; i < ((byte[])this.id_break[id_protected[127]]).length; ++i) {
            if (((byte[])this.id_break[id_protected[128]])[i] != id_throws[45] || i + id_case[108] != ((byte[])this.id_break[id_protected[129]]).length && ((byte[])this.id_break[id_protected[130]])[i + id_case[109]] != id_throws[46]) continue;
            return this.id_volatile();
        }
        return (byte[])this.id_break[id_protected[131]];
    }

    public rrQs_1 id_case() {
        int n = ((byte[])this.id_break[id_protected[17]]).length;
        if (n == 0 || n == id_case[7] && ((byte[])this.id_break[id_protected[18]])[id_case[8]] == id_throws[2]) {
            return null;
        }
        while (--n >= 0 && ((byte[])this.id_break[id_protected[19]])[n] != id_throws[3]) {
        }
        if (n <= 0) {
            return this.id_protected();
        }
        byte[] byArray = new byte[n];
        System.arraycopy((byte[])this.id_break[id_protected[20]], id_case[9], byArray, id_case[10], n);
        return new rrQs_1(this.id_private(), byArray, id_case[11]);
    }

    private void id_continue() throws IOException {
        ((rrzf_3)this.id_break[id_protected[165]]).id_class(this.id_throws(), id_case[138]);
    }

    private static void id_else() {
        Object[] objectArray = new Object[]{true};
        id_class = objectArray;
    }

    public rrQs_1 id_implements() {
        int n = ((byte[])this.id_break[id_protected[12]]).length;
        if (n == 0 || n == id_case[3] && ((byte[])this.id_break[id_protected[13]])[id_case[4]] == id_throws[0]) {
            return null;
        }
        while (--n >= 0 && ((byte[])this.id_break[id_protected[14]])[n] != id_throws[1]) {
        }
        if (n < 0) {
            return this;
        }
        byte[] byArray = new byte[((byte[])this.id_break[id_protected[15]]).length - ++n];
        System.arraycopy((byte[])this.id_break[id_protected[16]], n, byArray, id_case[5], byArray.length);
        return new rrQs_1(this.id_private(), byArray, id_case[6]);
    }

    private static void id_new() {
        boolean[] blArray = new boolean[176];
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[30] = true;
        blArray[31] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[38] = true;
        blArray[40] = true;
        blArray[41] = true;
        blArray[43] = true;
        blArray[44] = true;
        blArray[47] = true;
        blArray[49] = true;
        blArray[53] = true;
        blArray[57] = true;
        blArray[58] = true;
        blArray[63] = true;
        blArray[64] = true;
        blArray[67] = true;
        blArray[68] = true;
        blArray[69] = true;
        blArray[73] = true;
        blArray[74] = true;
        blArray[77] = true;
        blArray[81] = true;
        blArray[84] = true;
        blArray[89] = true;
        blArray[90] = true;
        blArray[91] = true;
        blArray[94] = true;
        blArray[95] = true;
        blArray[99] = true;
        blArray[100] = true;
        blArray[102] = true;
        blArray[105] = true;
        blArray[106] = true;
        blArray[108] = true;
        blArray[109] = true;
        blArray[112] = true;
        blArray[113] = true;
        blArray[114] = true;
        blArray[115] = true;
        blArray[117] = true;
        blArray[119] = true;
        blArray[121] = true;
        blArray[122] = true;
        blArray[123] = true;
        blArray[124] = true;
        blArray[129] = true;
        blArray[131] = true;
        blArray[133] = true;
        blArray[135] = true;
        blArray[137] = true;
        blArray[141] = true;
        blArray[148] = true;
        blArray[149] = true;
        blArray[151] = true;
        blArray[152] = true;
        blArray[157] = true;
        blArray[158] = true;
        blArray[160] = true;
        blArray[165] = true;
        blArray[169] = true;
        blArray[173] = true;
        id_case = blArray;
    }

    private static void id_package() {
        short[] sArray = new short[193];
        sArray[0] = 3;
        sArray[1] = 4;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[22] = 2;
        sArray[23] = 2;
        sArray[24] = 2;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 1;
        sArray[29] = 2;
        sArray[30] = 2;
        sArray[31] = 2;
        sArray[32] = 2;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[35] = 1;
        sArray[37] = 1;
        sArray[39] = 4;
        sArray[40] = 1;
        sArray[41] = 1;
        sArray[42] = 1;
        sArray[46] = 1;
        sArray[47] = 2;
        sArray[48] = 2;
        sArray[49] = 1;
        sArray[50] = 2;
        sArray[51] = 2;
        sArray[52] = 2;
        sArray[53] = 1;
        sArray[54] = 2;
        sArray[55] = 1;
        sArray[56] = 1;
        sArray[58] = 1;
        sArray[61] = 1;
        sArray[62] = 1;
        sArray[64] = 1;
        sArray[65] = 1;
        sArray[66] = 1;
        sArray[67] = 2;
        sArray[68] = 1;
        sArray[69] = 2;
        sArray[70] = 1;
        sArray[71] = 2;
        sArray[74] = 1;
        sArray[75] = 1;
        sArray[76] = 1;
        sArray[77] = 1;
        sArray[78] = 1;
        sArray[79] = 1;
        sArray[80] = 1;
        sArray[82] = 1;
        sArray[83] = 1;
        sArray[84] = 1;
        sArray[85] = 1;
        sArray[86] = 1;
        sArray[87] = 1;
        sArray[88] = 1;
        sArray[89] = 1;
        sArray[90] = 1;
        sArray[91] = 1;
        sArray[92] = 1;
        sArray[93] = 1;
        sArray[94] = 1;
        sArray[95] = 1;
        sArray[96] = 1;
        sArray[97] = 1;
        sArray[98] = 1;
        sArray[99] = 1;
        sArray[104] = 1;
        sArray[106] = 2;
        sArray[107] = 1;
        sArray[108] = 1;
        sArray[109] = 1;
        sArray[110] = 1;
        sArray[111] = 1;
        sArray[112] = 1;
        sArray[113] = 1;
        sArray[114] = 1;
        sArray[115] = 1;
        sArray[116] = 2;
        sArray[117] = 2;
        sArray[118] = 4;
        sArray[119] = 4;
        sArray[120] = 4;
        sArray[123] = 2;
        sArray[127] = 1;
        sArray[128] = 1;
        sArray[129] = 1;
        sArray[130] = 1;
        sArray[131] = 1;
        sArray[132] = 1;
        sArray[133] = 2;
        sArray[134] = 2;
        sArray[135] = 1;
        sArray[136] = 2;
        sArray[137] = 1;
        sArray[138] = 1;
        sArray[139] = 1;
        sArray[140] = 1;
        sArray[141] = 1;
        sArray[142] = 1;
        sArray[143] = 1;
        sArray[144] = 1;
        sArray[146] = 1;
        sArray[147] = 3;
        sArray[148] = 1;
        sArray[149] = 3;
        sArray[152] = 1;
        sArray[153] = 1;
        sArray[154] = 1;
        sArray[155] = 255;
        sArray[156] = 1;
        sArray[157] = 255;
        sArray[159] = 12;
        sArray[161] = 12;
        sArray[168] = 12;
        sArray[175] = 1;
        id_protected = sArray;
    }

    private void id_super() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[89]];
            objectArray[rrQs_1.id_throws[90]] = id_case[172];
        }
    }

    public rrQs_1 id_protected() {
        if (this.isAbsolute()) {
            return ((rrzf_3)this.id_break[id_protected[11]]).id_class();
        }
        return null;
    }

    private rrzq_3 id_protected(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        if (id_byte[7].equals(string)) {
            return new rrzq_3(this, id_case[132]);
        }
        if (id_byte[8].equals(string)) {
            return new rrzq_3(this, id_case[133]);
        }
        if (((Boolean)((rrzf_3)this.id_break[rrQs_1.id_protected[160]]).id_break[id_protected[161]]).booleanValue()) {
            if (id_byte[9].equals(string)) {
                return new rrQb_1(this, id_case[134]);
            }
            if (id_byte[10].equals(string)) {
                return new rrQb_1(this, id_case[135]);
            }
        }
        throw new UnsupportedOperationException("view <" + string + "> is not supported");
    }

    public rrzf_3 id_private() {
        return (rrzf_3)this.id_break[id_protected[73]];
    }

    private boolean id_final() {
        return ((rrzf_3)this.id_break[id_protected[181]]).id_case(this.id_throws());
    }

    private byte[] id_volatile() {
        byte[] byArray = new byte[((byte[])this.id_break[id_protected[132]]).length];
        int n = this.getNameCount();
        int[] nArray = new int[n];
        int n2 = id_throws[47];
        int n3 = id_case[110];
        for (int i = id_case[111]; i < n; ++i) {
            int n4;
            int n5 = ((int[])this.id_break[id_protected[133]])[i];
            int n6 = n4 = i == ((int[])this.id_break[id_protected[134]]).length - id_case[112] ? ((byte[])this.id_break[id_protected[135]]).length - n5 : ((int[])this.id_break[id_protected[136]])[i + id_case[113]] - n5 - id_case[114];
            if (n4 == id_case[115] && ((byte[])this.id_break[id_protected[137]])[n5] == id_throws[48]) {
                if (n3 != 0 || ((byte[])this.id_break[id_protected[138]])[id_case[116]] != id_throws[49]) continue;
                byArray[n3++] = id_throws[50];
                continue;
            }
            if (n4 == id_throws[51] && ((byte[])this.id_break[id_protected[139]])[n5] == id_throws[52] && ((byte[])this.id_break[id_protected[140]])[n5 + id_case[117]] == id_throws[53]) {
                if (n2 >= 0) {
                    n3 = nArray[n2--];
                    continue;
                }
                if (((byte[])this.id_break[id_protected[141]])[id_case[118]] == id_throws[54]) {
                    if (n3 != 0) continue;
                    byArray[n3++] = id_throws[55];
                    continue;
                }
                if (n3 != 0 && byArray[n3 - id_case[119]] != id_throws[56]) {
                    byArray[n3++] = id_throws[57];
                }
                while (n4-- > 0) {
                    byArray[n3++] = ((byte[])this.id_break[id_protected[142]])[n5++];
                }
                continue;
            }
            if (n3 == 0 && ((byte[])this.id_break[id_protected[143]])[id_case[120]] == id_throws[58] || n3 != 0 && byArray[n3 - id_case[121]] != id_throws[59]) {
                byArray[n3++] = id_throws[60];
            }
            nArray[++n2] = n3;
            while (n4-- > 0) {
                byArray[n3++] = ((byte[])this.id_break[id_protected[144]])[n5++];
            }
        }
        if (n3 > id_case[122] && byArray[n3 - id_case[123]] == id_throws[61]) {
            --n3;
        }
        return n3 == byArray.length ? byArray : Arrays.copyOf(byArray, n3);
    }

    private static void id_native() {
        id_byte = new String[]{new String("jar"), new String("other"), new String("other"), new String("other"), new String("path"), new String("Path: nul character not allowed"), new String("Path: nul character not allowed"), new String("basic"), new String("zip"), new String("posix"), new String("owner"), new String("basic"), new String("basic")};
    }

    @Override
    public int getNameCount() {
        this.id_int();
        return ((int[])this.id_break[id_protected[21]]).length;
    }

    @Override
    public /* synthetic */ Path subpath(int n, int n2) {
        return this.id_class(n, n2);
    }

    @Override
    public URI toUri() {
        try {
            return new URI(id_byte[0], rrQs_1.id_byte(((rrzf_3)this.id_break[id_protected[44]]).id_break().toUri().toString()) + "!" + ((rrzf_3)this.id_break[id_protected[45]]).id_throws((byte[])this.id_break().id_break[id_protected[46]]), null);
        }
        catch (Exception exception) {
            throw new AssertionError((Object)exception);
        }
    }

    @Override
    public /* synthetic */ Path toAbsolutePath() {
        return this.id_break();
    }

    @Override
    public Path normalize() {
        byte[] byArray = this.id_extends();
        if (byArray == (byte[])this.id_break[id_protected[104]]) {
            return this;
        }
        return new rrQs_1((rrzf_3)this.id_break[id_protected[105]], byArray, id_case[81]);
    }

    @Override
    public /* synthetic */ FileSystem getFileSystem() {
        return this.id_private();
    }

    @Override
    public Path relativize(Path path) {
        int n;
        rrQs_1 rrQs_12 = this.id_byte(path);
        if (rrQs_12.equals(this)) {
            return new rrQs_1((rrzf_3)this.id_break[id_protected[57]], new byte[id_case[36]], id_case[37]);
        }
        if (((byte[])this.id_break[id_protected[58]]).length == 0) {
            return rrQs_12;
        }
        if ((rrzf_3)this.id_break[id_protected[59]] != (rrzf_3)rrQs_12.id_break[id_protected[60]] || this.isAbsolute() != rrQs_12.isAbsolute()) {
            throw new IllegalArgumentException();
        }
        if (((byte[])this.id_break[id_protected[61]]).length == id_case[38] && ((byte[])this.id_break[id_protected[62]])[id_case[39]] == id_throws[5]) {
            return new rrQs_1((rrzf_3)this.id_break[id_protected[63]], Arrays.copyOfRange((byte[])rrQs_12.id_break[id_protected[64]], id_case[40], ((byte[])rrQs_12.id_break[id_protected[65]]).length), id_case[41]);
        }
        int n2 = this.getNameCount();
        int n3 = rrQs_12.getNameCount();
        int n4 = Math.min(n2, n3);
        for (n = id_case[42]; n < n4 && this.id_class(rrQs_12, n); ++n) {
        }
        int n5 = n2 - n;
        int n6 = n5 * id_throws[6] - id_case[43];
        if (n < n3) {
            n6 += ((byte[])rrQs_12.id_break[id_protected[66]]).length - ((int[])rrQs_12.id_break[id_protected[67]])[n] + id_case[44];
        }
        byte[] byArray = new byte[n6];
        int n7 = id_case[45];
        while (n5 > 0) {
            byArray[n7++] = id_throws[7];
            byArray[n7++] = id_throws[8];
            if (n7 < n6) {
                byArray[n7++] = id_throws[9];
            }
            --n5;
        }
        if (n < n3) {
            System.arraycopy((byte[])rrQs_12.id_break[id_protected[68]], ((int[])rrQs_12.id_break[id_protected[69]])[n], byArray, n7, ((byte[])rrQs_12.id_break[id_protected[70]]).length - ((int[])rrQs_12.id_break[id_protected[71]])[n]);
        }
        return new rrQs_1((rrzf_3)this.id_break[id_protected[72]], byArray);
    }

    @Override
    public Path resolveSibling(Path path) {
        Objects.requireNonNull(path, id_byte[1]);
        rrQs_1 rrQs_12 = this.id_case();
        return rrQs_12 == null ? path : rrQs_12.resolve(path);
    }

    @Override
    public Path resolveSibling(String string) {
        return this.resolveSibling(((rrzf_3)this.id_break[id_protected[101]]).id_class(string, new String[id_case[78]]));
    }
}

