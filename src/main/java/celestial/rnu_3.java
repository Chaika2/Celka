/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
package celestial;

import celestial.rnm_3;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;

public class rnu_3
implements AutoCloseable {
    private final FileChannel id_class;
    private final FileLock id_break;
    private static final ByteBuffer id_byte;

    private rnu_3(FileChannel fileChannel, FileLock fileLock) {
        this.id_class = fileChannel;
        this.id_break = fileLock;
    }

    static {
        byte[] byArray = "\u2603".getBytes(Charsets.UTF_8);
        id_byte = ByteBuffer.allocateDirect(byArray.length);
        id_byte.put(byArray);
        ((Buffer)id_byte).flip();
    }

    public boolean id_class() {
        return this.id_break.isValid();
    }

    public static rnu_3 id_class(Path path) throws IOException {
        Path path2 = path.resolve("session.lock");
        if (!Files.isDirectory(path, new LinkOption[0])) {
            Files.createDirectories(path, new FileAttribute[0]);
        }
        FileChannel fileChannel = FileChannel.open(path2, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        try {
            fileChannel.write(id_byte.duplicate());
            fileChannel.force(true);
            FileLock fileLock = fileChannel.tryLock();
            if (fileLock == null) {
                throw rnm_3.id_class(path2);
            }
            return new rnu_3(fileChannel, fileLock);
        }
        catch (IOException iOException) {
            try {
                fileChannel.close();
            }
            catch (IOException iOException2) {
                iOException.addSuppressed(iOException2);
            }
            throw iOException;
        }
    }

    @Override
    public void close() throws IOException {
        try {
            if (this.id_break.isValid()) {
                this.id_break.release();
            }
        }
        finally {
            if (this.id_class.isOpen()) {
                this.id_class.close();
            }
        }
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static boolean id_break(Path path) throws IOException {
        Path path2 = path.resolve("session.lock");
        try (FileChannel fileChannel = FileChannel.open(path2, StandardOpenOption.WRITE);){
            boolean bl;
            block15: {
                FileLock fileLock = fileChannel.tryLock();
                try {
                    boolean bl2 = bl = fileLock == null;
                    if (fileLock == null) break block15;
                }
                catch (Throwable throwable) {
                    if (fileLock != null) {
                        try {
                            fileLock.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                fileLock.close();
            }
            return bl;
        }
        catch (AccessDeniedException accessDeniedException) {
            return true;
        }
        catch (NoSuchFileException noSuchFileException) {
            return false;
        }
    }
}

