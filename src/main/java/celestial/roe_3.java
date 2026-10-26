/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rKP;
import celestial.rfj_3;
import celestial.roU_2;
import celestial.roa_3;
import celestial.roi_3;
import celestial.rqR_2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roe_3
implements AutoCloseable {
    private static final Logger id_break = LogManager.getLogger();
    private static final ByteBuffer id_byte = ByteBuffer.allocateDirect(1);
    private final FileChannel id_protected;
    private final Path id_throws;
    public final rKP id_case;
    private final ByteBuffer id_catch = ByteBuffer.allocateDirect(8192);
    private final IntBuffer id_private;
    private final IntBuffer id_implements;
    protected final roU_2 id_class = new roU_2();

    private static int id_byte(int n) {
        return (n + 4096 - 1) / 4096;
    }

    private void id_byte() throws IOException {
        ((Buffer)this.id_catch).position(0);
        this.id_protected.write(this.id_catch, 0L);
    }

    public DataOutputStream id_byte(rfj_3 rfj_32) throws IOException {
        return new DataOutputStream(new BufferedOutputStream(this.id_case.id_class(new roa_3(this, rfj_32))));
    }

    public roe_3(File file, File file2, boolean bl) throws IOException {
        this(file.toPath(), file2.toPath(), rKP.id_break, bl);
    }

    public roe_3(Path path, Path path2, rKP rKP2, boolean bl) throws IOException {
        this.id_case = rKP2;
        if (!Files.isDirectory(path2, new LinkOption[0])) {
            throw new IllegalArgumentException("Expected directory, got " + path2.toAbsolutePath());
        }
        this.id_throws = path2;
        this.id_private = this.id_catch.asIntBuffer();
        ((Buffer)this.id_private).limit(1024);
        ((Buffer)this.id_catch).position(4096);
        this.id_implements = this.id_catch.asIntBuffer();
        this.id_protected = bl ? FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC) : FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
        this.id_class.id_class(0, 2);
        ((Buffer)this.id_catch).position(0);
        int n = this.id_protected.read(this.id_catch, 0L);
        if (n != -1) {
            if (n != 8192) {
                id_break.warn("Region file {} has truncated header: {}", (Object)path, (Object)n);
            }
            long l = Files.size(path);
            for (int i = 0; i < 1024; ++i) {
                int n2 = this.id_private.get(i);
                if (n2 == 0) continue;
                int n3 = roe_3.id_break(n2);
                int n4 = roe_3.id_class(n2);
                if (n3 < 2) {
                    id_break.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", (Object)path, (Object)i, (Object)n3);
                    this.id_private.put(i, 0);
                    continue;
                }
                if (n4 == 0) {
                    id_break.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", (Object)path, (Object)i);
                    this.id_private.put(i, 0);
                    continue;
                }
                if ((long)n3 * 4096L > l) {
                    id_break.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", (Object)path, (Object)i, (Object)n3);
                    this.id_private.put(i, 0);
                    continue;
                }
                this.id_class.id_class(n3, n4);
            }
        }
    }

    protected synchronized void id_class(rfj_3 rfj_32, ByteBuffer byteBuffer) throws IOException {
        roi_3 roi_32;
        int n;
        int n2 = roe_3.id_catch(rfj_32);
        int n3 = this.id_private.get(n2);
        int n4 = roe_3.id_break(n3);
        int n5 = roe_3.id_class(n3);
        int n6 = byteBuffer.remaining();
        int n7 = roe_3.id_byte(n6);
        if (n7 >= 256) {
            Path path = this.id_throws(rfj_32);
            id_break.warn("Saving oversized chunk {} ({} bytes} to external file {}", (Object)rfj_32, (Object)n6, (Object)path);
            n7 = 1;
            n = this.id_class.id_class(n7);
            roi_32 = this.id_class(path, byteBuffer);
            ByteBuffer byteBuffer2 = this.id_break();
            this.id_protected.write(byteBuffer2, n * 4096);
        } else {
            n = this.id_class.id_class(n7);
            roi_32 = () -> Files.deleteIfExists(this.id_throws(rfj_32));
            this.id_protected.write(byteBuffer, n * 4096);
        }
        int n8 = (int)(rqR_2.id_protected() / 1000L);
        this.id_private.put(n2, this.id_class(n, n7));
        this.id_implements.put(n2, n8);
        this.id_byte();
        roi_32.run();
        if (n4 != 0) {
            this.id_class.id_break(n4, n5);
        }
    }

    public void id_class() throws IOException {
        this.id_protected.force(true);
    }

    public synchronized DataInputStream id_class(rfj_3 rfj_32) throws IOException {
        int n = this.id_case(rfj_32);
        if (n == 0) {
            return null;
        }
        int n2 = roe_3.id_break(n);
        int n3 = roe_3.id_class(n);
        int n4 = n3 * 4096;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n4);
        this.id_protected.read(byteBuffer, n2 * 4096);
        ((Buffer)byteBuffer).flip();
        if (byteBuffer.remaining() < 5) {
            id_break.error("Chunk {} header is truncated: expected {} but read {}", (Object)rfj_32, (Object)n4, (Object)byteBuffer.remaining());
            return null;
        }
        int n5 = byteBuffer.getInt();
        byte by = byteBuffer.get();
        if (n5 == 0) {
            id_break.warn("Chunk {} is allocated, but stream is missing", (Object)rfj_32);
            return null;
        }
        int n6 = n5 - 1;
        if (roe_3.id_class(by)) {
            if (n6 != 0) {
                id_break.warn("Chunk has both internal and external streams");
            }
            return this.id_class(rfj_32, roe_3.id_break(by));
        }
        if (n6 > byteBuffer.remaining()) {
            id_break.error("Chunk {} stream is truncated: expected {} but read {}", (Object)rfj_32, (Object)n6, (Object)byteBuffer.remaining());
            return null;
        }
        if (n6 < 0) {
            id_break.error("Declared size {} of chunk {} is negative", (Object)n5, (Object)rfj_32);
            return null;
        }
        return this.id_class(rfj_32, by, roe_3.id_class(byteBuffer, n6));
    }

    private roi_3 id_class(Path path, ByteBuffer byteBuffer) throws IOException {
        Path path2 = Files.createTempFile(this.id_throws, "tmp", (String)null, new FileAttribute[0]);
        try (FileChannel fileChannel = FileChannel.open(path2, StandardOpenOption.CREATE, StandardOpenOption.WRITE);){
            ((Buffer)byteBuffer).position(5);
            fileChannel.write(byteBuffer);
        }
        return () -> Files.move(path2, path, StandardCopyOption.REPLACE_EXISTING);
    }

    private static boolean id_class(byte by) {
        return (by & 0x80) != 0;
    }

    private static int id_class(int n) {
        return n & 0xFF;
    }

    private int id_class(int n, int n2) {
        return n << 8 | n2;
    }

    private DataInputStream id_class(rfj_3 rfj_32, byte by) throws IOException {
        Path path = this.id_throws(rfj_32);
        if (!Files.isRegularFile(path, new LinkOption[0])) {
            id_break.error("External chunk path {} is not file", (Object)path);
            return null;
        }
        return this.id_class(rfj_32, by, Files.newInputStream(path, new OpenOption[0]));
    }

    private static ByteArrayInputStream id_class(ByteBuffer byteBuffer, int n) {
        return new ByteArrayInputStream(byteBuffer.array(), byteBuffer.position(), n);
    }

    private DataInputStream id_class(rfj_3 rfj_32, byte by, InputStream inputStream) throws IOException {
        rKP rKP2 = rKP.id_class(by);
        if (rKP2 == null) {
            id_break.error("Chunk {} has invalid chunk stream version {}", (Object)rfj_32, (Object)by);
            return null;
        }
        return new DataInputStream(new BufferedInputStream(rKP2.id_class(inputStream)));
    }

    @Override
    public void close() throws IOException {
        try {
            this.id_protected();
        }
        finally {
            try {
                this.id_protected.force(true);
            }
            finally {
                this.id_protected.close();
            }
        }
    }

    private static byte id_break(byte by) {
        return (byte)(by & 0xFFFFFF7F);
    }

    private static int id_break(int n) {
        return n >> 8 & 0xFFFFFF;
    }

    public boolean id_break(rfj_3 rfj_32) {
        int n = this.id_case(rfj_32);
        if (n == 0) {
            return false;
        }
        int n2 = roe_3.id_break(n);
        int n3 = roe_3.id_class(n);
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        try {
            this.id_protected.read(byteBuffer, n2 * 4096);
            ((Buffer)byteBuffer).flip();
            if (byteBuffer.remaining() != 5) {
                return false;
            }
            int n4 = byteBuffer.getInt();
            byte by = byteBuffer.get();
            if (roe_3.id_class(by)) {
                if (!rKP.id_break(roe_3.id_break(by))) {
                    return false;
                }
                if (!Files.isRegularFile(this.id_throws(rfj_32), new LinkOption[0])) {
                    return false;
                }
            } else {
                if (!rKP.id_break(by)) {
                    return false;
                }
                if (n4 == 0) {
                    return false;
                }
                int n5 = n4 - 1;
                if (n5 < 0 || n5 > 4096 * n3) {
                    return false;
                }
            }
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private ByteBuffer id_break() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        byteBuffer.putInt(1);
        byteBuffer.put((byte)(this.id_case.id_class() | 0x80));
        ((Buffer)byteBuffer).flip();
        return byteBuffer;
    }

    private Path id_throws(rfj_3 rfj_32) {
        String string = "c." + rfj_32.id_break + "." + rfj_32.id_byte + ".mcc";
        return this.id_throws.resolve(string);
    }

    private static int id_catch(rfj_3 rfj_32) {
        return rfj_32.id_private() + rfj_32.id_implements() * 32;
    }

    private int id_case(rfj_3 rfj_32) {
        return this.id_private.get(roe_3.id_catch(rfj_32));
    }

    public boolean id_protected(rfj_3 rfj_32) {
        return this.id_case(rfj_32) != 0;
    }

    private void id_protected() throws IOException {
        int n;
        int n2 = (int)this.id_protected.size();
        if (n2 != (n = roe_3.id_byte(n2) * 4096)) {
            ByteBuffer byteBuffer = id_byte.duplicate();
            ((Buffer)byteBuffer).position(0);
            this.id_protected.write(byteBuffer, n - 1);
        }
    }
}

