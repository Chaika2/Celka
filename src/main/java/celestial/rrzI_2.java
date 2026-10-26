/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzw_3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzI_2 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;
    private static long[] id_protected;
    private static boolean[] id_throws;

    public long id_byte() {
        return (Long)this.id_class[id_break[2]];
    }

    public rrzI_2(rrzw_3 rrzw_32) throws IOException {
        this.id_catch();
        Path path = FileSystems.getDefault().getPath(rrzw_32.name(), new String[id_throws[0]]);
        Long l = Files.size(path);
        this.id_class[rrzI_2.id_break[0]] = l;
        FileStore fileStore = Files.getFileStore(path);
        this.id_class[rrzI_2.id_break[1]] = fileStore;
    }

    static {
        rrzI_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB723C3E2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCCC2516D376D18AAL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{125, -87, 56, -119, -72, 110, -98, 72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public long id_class() throws IOException {
        if (!((FileStore)this.id_class[id_break[5]]).isReadOnly()) {
            return ((FileStore)this.id_class[id_break[6]]).getUnallocatedSpace();
        }
        return id_protected[1];
    }

    public long id_break() throws IOException {
        if (!((FileStore)this.id_class[id_break[3]]).isReadOnly()) {
            return ((FileStore)this.id_class[id_break[4]]).getUsableSpace();
        }
        return id_protected[0];
    }

    private static void id_throws() {
        id_protected = new long[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrzI_2.id_case();
        rrzI_2.id_throws();
        rrzI_2.id_protected();
        rrzI_2.id_private();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrzI_2.id_throws[1]] = id_protected[2];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[7];
        sArray[0] = 1;
        sArray[2] = 1;
        id_break = sArray;
    }

    private static void id_private() {
        id_byte = new byte[]{2};
    }
}

