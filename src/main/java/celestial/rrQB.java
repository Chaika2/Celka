/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQs_1;
import celestial.rrzL_2;
import celestial.rrzf_3;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.ProviderMismatchException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.security.AccessController;
import java.security.Key;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQB
extends FileSystemProvider {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static String[] id_throws;

    private static void id_byte() {
        id_throws = new String[]{new String("jar"), new String("!/"), new String(".zip"), new String(".jar"), new String("!/"), new String("Not supported.")};
    }

    public rrQB() {
        HashMap hashMap;
        this.id_throws();
        this.id_class[rrQB.id_break[0]] = hashMap = new HashMap();
    }

    static {
        rrQB.ntfClinit();
    }

    @Override
    public boolean isHidden(Path path) {
        return rrQB.id_class(path).id_finally();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE4CF4B1859D5F320L;
    }

    private rrzf_3 id_class(Path path, Map<String, ?> map) throws IOException {
        try {
            return new rrzf_3(this, path, map);
        }
        catch (ZipException zipException) {
            String string = path.toString();
            if (string.endsWith(id_throws[2]) || string.endsWith(id_throws[3])) {
                throw zipException;
            }
            throw new UnsupportedOperationException();
        }
    }

    private static void id_class() {
        id_break = new short[9];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7D05F302;
    }

    public Path id_class(URI uRI) {
        String string = uRI.getScheme();
        if (string == null || !string.equalsIgnoreCase(this.getScheme())) {
            throw new IllegalArgumentException("URI scheme is not '" + this.getScheme() + "'");
        }
        try {
            String string2 = uRI.getRawSchemeSpecificPart();
            int n = string2.indexOf(id_throws[1]);
            if (n != id_byte[0]) {
                string2 = string2.substring(id_protected[0], n);
            }
            return Paths.get(new URI(string2)).toAbsolutePath();
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new IllegalArgumentException(uRISyntaxException.getMessage(), uRISyntaxException);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{81, -38, 64, 47, -38, -4, 7, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(Path path, rrzf_3 rrzf_32) throws IOException {
        Map map = (Map)this.id_class[id_break[6]];
        synchronized (map) {
            Path path2 = path;
            PrivilegedExceptionAction<Path> privilegedExceptionAction = () -> path2.toRealPath(new LinkOption[id_protected[9]]);
            try {
                path = AccessController.doPrivileged(privilegedExceptionAction);
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw (IOException)privilegedActionException.getException();
            }
            if (((Map)this.id_class[id_break[7]]).get(path) == rrzf_32) {
                ((Map)this.id_class[id_break[8]]).remove(path);
            }
        }
    }

    public static rrQs_1 id_class(Path path) {
        if (path == null) {
            throw new NullPointerException();
        }
        if (!(path instanceof rrQs_1)) {
            throw new ProviderMismatchException();
        }
        return (rrQs_1)path;
    }

    @Override
    public void delete(Path path) throws IOException {
        rrQB.id_class(path).id_byte();
    }

    @Override
    public void checkAccess(Path path, AccessMode ... accessModeArray) throws IOException {
        rrQB.id_class(path).id_class(accessModeArray);
    }

    @Override
    public void copy(Path path, Path path2, CopyOption ... copyOptionArray) throws IOException {
        rrQB.id_class(path).id_break(rrQB.id_class(path2), copyOptionArray);
    }

    @Override
    public String getScheme() {
        return id_throws[0];
    }

    @Override
    public Path getPath(URI uRI) {
        String string = uRI.getSchemeSpecificPart();
        int n = string.indexOf(id_throws[4]);
        if (n == id_byte[1]) {
            throw new IllegalArgumentException("URI: " + String.valueOf(uRI) + " does not contain path info ex. jar:file:/c:/foo.zip!/BAR");
        }
        return this.getFileSystem(uRI).getPath(string.substring(n + id_protected[6]), new String[id_protected[7]]);
    }

    @Override
    public <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> clazz, LinkOption ... linkOptionArray) throws IOException {
        return rrQB.id_class(path).id_class(clazz);
    }

    @Override
    public Map<String, Object> readAttributes(Path path, String string, LinkOption ... linkOptionArray) throws IOException {
        return rrQB.id_class(path).id_class(string, linkOptionArray);
    }

    @Override
    public FileChannel newFileChannel(Path path, Set<? extends OpenOption> set, FileAttribute<?> ... fileAttributeArray) throws IOException {
        return rrQB.id_class(path).id_break(set, fileAttributeArray);
    }

    @Override
    public AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set<? extends OpenOption> set, ExecutorService executorService, FileAttribute<?> ... fileAttributeArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <V extends FileAttributeView> V getFileAttributeView(Path path, Class<V> clazz, LinkOption ... linkOptionArray) {
        return rrQB.id_class(path).id_break(clazz);
    }

    @Override
    public void move(Path path, Path path2, CopyOption ... copyOptionArray) throws IOException {
        rrQB.id_class(path).id_class(rrQB.id_class(path2), copyOptionArray);
    }

    private boolean id_break(Path path) {
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class, new LinkOption[id_protected[1]]);
            if (!basicFileAttributes.isRegularFile()) {
                throw new UnsupportedOperationException();
            }
            return id_protected[2];
        }
        catch (IOException iOException) {
            return id_protected[3];
        }
    }

    private static void id_break() {
        boolean[] blArray = new boolean[11];
        blArray[2] = true;
        blArray[6] = true;
        blArray[10] = true;
        id_protected = blArray;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[10]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrQB.id_break();
        rrQB.id_byte();
        rrQB.id_class();
        rrQB.id_protected();
    }

    private static void id_protected() {
        id_byte = new byte[]{-1, -1};
    }

    @Override
    public boolean isSameFile(Path path, Path path2) throws IOException {
        return rrQB.id_class(path).id_break(path2);
    }

    @Override
    public FileSystem newFileSystem(Path path, Map<String, ?> map) throws IOException {
        this.id_break(path);
        return this.id_class(path, map);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public FileSystem newFileSystem(URI uRI, Map<String, ?> map) throws IOException {
        Path path = this.id_class(uRI);
        Map map2 = (Map)this.id_class[id_break[1]];
        synchronized (map2) {
            Path path2 = null;
            if (this.id_break(path) && ((Map)this.id_class[id_break[2]]).containsKey(path2 = path.toRealPath(new LinkOption[id_protected[4]]))) {
                throw new FileSystemAlreadyExistsException();
            }
            rrzf_3 rrzf_32 = this.id_class(path, map);
            if (path2 == null) {
                path2 = path.toRealPath(new LinkOption[id_protected[5]]);
            }
            ((Map)this.id_class[id_break[3]]).put(path2, rrzf_32);
            return rrzf_32;
        }
    }

    @Override
    public SeekableByteChannel newByteChannel(Path path, Set<? extends OpenOption> set, FileAttribute<?> ... fileAttributeArray) throws IOException {
        return rrQB.id_class(path).id_class(set, fileAttributeArray);
    }

    @Override
    public FileStore getFileStore(Path path) throws IOException {
        return rrQB.id_class(path).id_catch();
    }

    @Override
    public DirectoryStream<Path> newDirectoryStream(Path path, DirectoryStream.Filter<? super Path> filter) throws IOException {
        return rrQB.id_class(path).id_class(filter);
    }

    @Override
    public Path readSymbolicLink(Path path) {
        throw new UnsupportedOperationException(id_throws[5]);
    }

    @Override
    public void setAttribute(Path path, String string, Object object, LinkOption ... linkOptionArray) throws IOException {
        rrQB.id_class(path).id_class(string, object, linkOptionArray);
    }

    @Override
    public InputStream newInputStream(Path path, OpenOption ... openOptionArray) throws IOException {
        InputStream inputStream = rrzL_2.id_class(path, openOptionArray);
        if (inputStream != null) {
            return inputStream;
        }
        return rrQB.id_class(path).id_break(openOptionArray);
    }

    @Override
    public OutputStream newOutputStream(Path path, OpenOption ... openOptionArray) throws IOException {
        return rrQB.id_class(path).id_class(openOptionArray);
    }

    @Override
    public void createDirectory(Path path, FileAttribute<?> ... fileAttributeArray) throws IOException {
        rrQB.id_class(path).id_class(fileAttributeArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public FileSystem getFileSystem(URI uRI) {
        Map map = (Map)this.id_class[id_break[4]];
        synchronized (map) {
            rrzf_3 rrzf_32 = null;
            try {
                rrzf_32 = (rrzf_3)((Map)this.id_class[id_break[5]]).get(this.id_class(uRI).toRealPath(new LinkOption[id_protected[8]]));
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (rrzf_32 == null) {
                throw new FileSystemNotFoundException();
            }
            return rrzf_32;
        }
    }
}

