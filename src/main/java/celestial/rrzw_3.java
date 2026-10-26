/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQs_1;
import celestial.rrzI_2;
import celestial.rrzf_3;
import celestial.rrzq_3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileStore;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzw_3
extends FileStore {
    private static short[] id_break;
    private static String[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_byte = new String[]{new String("zipfs"), new String("basic"), new String("zip"), new String("owner"), new String("posix"), new String("totalSpace"), new String("usableSpace"), new String("unallocatedSpace"), new String("does not support the given attribute")};
    }

    public rrzw_3(rrQs_1 rrQs_12) {
        this.id_class();
        rrzf_3 rrzf_32 = rrQs_12.id_private();
        this.id_class[rrzw_3.id_break[0]] = rrzf_32;
    }

    static {
        rrzw_3.ntfClinit();
    }

    @Override
    public String name() {
        return ((rrzf_3)this.id_class[id_break[1]]).toString() + "/";
    }

    @Override
    public String type() {
        return id_byte[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5FAC05A792EE72D5L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-56, -89, -10, 111, -116, -117, 11, -114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5D71484C;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[4]];
        }
    }

    @Override
    public boolean isReadOnly() {
        return ((rrzf_3)this.id_class[id_break[2]]).isReadOnly();
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzw_3.id_break();
        rrzw_3.id_byte();
        rrzw_3.id_protected();
    }

    @Override
    public long getUnallocatedSpace() throws IOException {
        return new rrzI_2(this).id_class();
    }

    @Override
    public boolean supportsFileAttributeView(Class<? extends FileAttributeView> clazz) {
        return clazz == BasicFileAttributeView.class || clazz == rrzq_3.class || (clazz == FileOwnerAttributeView.class || clazz == PosixFileAttributeView.class) && (Boolean)((rrzf_3)this.id_class[rrzw_3.id_break[3]]).id_break[id_break[4]] != false ? id_protected[0] : id_protected[1];
    }

    @Override
    public boolean supportsFileAttributeView(String string) {
        return id_byte[1].equals(string) || id_byte[2].equals(string) || (id_byte[3].equals(string) || id_byte[4].equals(string)) && (Boolean)((rrzf_3)this.id_class[rrzw_3.id_break[5]]).id_break[id_break[6]] != false ? id_protected[2] : id_protected[3];
    }

    @Override
    public <V extends FileStoreAttributeView> V getFileStoreAttributeView(Class<V> clazz) {
        if (clazz == null) {
            throw new NullPointerException();
        }
        return null;
    }

    private static void id_protected() {
        short[] sArray = new short[7];
        sArray[4] = 12;
        sArray[6] = 12;
        id_break = sArray;
    }

    @Override
    public long getTotalSpace() throws IOException {
        return new rrzI_2(this).id_byte();
    }

    @Override
    public long getUsableSpace() throws IOException {
        return new rrzI_2(this).id_break();
    }

    @Override
    public Object getAttribute(String string) throws IOException {
        if (string.equals(id_byte[5])) {
            return this.getTotalSpace();
        }
        if (string.equals(id_byte[6])) {
            return this.getUsableSpace();
        }
        if (string.equals(id_byte[7])) {
            return this.getUnallocatedSpace();
        }
        throw new UnsupportedOperationException(id_byte[8]);
    }
}

