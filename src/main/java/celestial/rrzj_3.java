/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzY_2;
import celestial.rrzf_3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzj_3
extends FileChannel {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrzj_3.id_protected[0]] = id_protected[1];
            objectArray[rrzj_3.id_byte[1]] = id_protected[2];
        }
    }

    public rrzj_3(rrzf_3 rrzf_32, FileChannel fileChannel, boolean bl, rrzY_2 rrzY_22, boolean bl2, Path path) {
        this.id_byte();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_class[rrzj_3.id_break[0]] = rrzf_33;
        FileChannel fileChannel2 = fileChannel;
        this.id_class[rrzj_3.id_break[1]] = fileChannel2;
        Boolean bl3 = bl;
        this.id_class[rrzj_3.id_break[2]] = bl3;
        rrzY_2 rrzY_23 = rrzY_22;
        this.id_class[rrzj_3.id_break[3]] = rrzY_23;
        Boolean bl4 = bl2;
        this.id_class[rrzj_3.id_break[4]] = bl4;
        Path path2 = path;
        this.id_class[rrzj_3.id_break[5]] = path2;
    }

    static {
        rrzj_3.ntfClinit();
    }

    @Override
    public FileLock lock(long l, long l2, boolean bl) throws IOException {
        return ((FileChannel)this.id_class[id_break[19]]).lock(l, l2, bl);
    }

    @Override
    public long size() throws IOException {
        return ((FileChannel)this.id_class[id_break[10]]).size();
    }

    @Override
    public long position() throws IOException {
        return ((FileChannel)this.id_class[id_break[8]]).position();
    }

    @Override
    public FileChannel position(long l) throws IOException {
        ((FileChannel)this.id_class[id_break[9]]).position(l);
        return this;
    }

    @Override
    public MappedByteBuffer map(FileChannel.MapMode mapMode, long l, long l2) {
        throw new UnsupportedOperationException();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x44EA5748DA032068L;
    }

    private static void id_class() {
        id_byte = new byte[]{6, 3};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD92CAF0B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-74, -18, -17, 33, 78, 41, 81, -82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public long write(ByteBuffer[] byteBufferArray, int n, int n2) throws IOException {
        return ((FileChannel)this.id_class[id_break[7]]).write(byteBufferArray, n, n2);
    }

    @Override
    public int write(ByteBuffer byteBuffer) throws IOException {
        return ((FileChannel)this.id_class[id_break[6]]).write(byteBuffer);
    }

    @Override
    public int write(ByteBuffer byteBuffer, long l) throws IOException {
        return ((FileChannel)this.id_class[id_break[18]]).write(byteBuffer, l);
    }

    @Override
    public long read(ByteBuffer[] byteBufferArray, int n, int n2) throws IOException {
        return ((FileChannel)this.id_class[id_break[17]]).read(byteBufferArray, n, n2);
    }

    @Override
    public int read(ByteBuffer byteBuffer, long l) throws IOException {
        return ((FileChannel)this.id_class[id_break[16]]).read(byteBuffer, l);
    }

    @Override
    public int read(ByteBuffer byteBuffer) throws IOException {
        return ((FileChannel)this.id_class[id_break[15]]).read(byteBuffer);
    }

    @Override
    public long transferTo(long l, long l2, WritableByteChannel writableByteChannel) throws IOException {
        return ((FileChannel)this.id_class[id_break[13]]).transferTo(l, l2, writableByteChannel);
    }

    private static void id_break() {
        short[] sArray = new short[34];
        sArray[0] = 5;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[22] = 1;
        sArray[23] = 2;
        sArray[24] = 7;
        sArray[25] = 2;
        sArray[26] = 2;
        sArray[27] = 1;
        sArray[28] = 12;
        sArray[29] = 5;
        sArray[30] = 2;
        sArray[31] = 3;
        sArray[32] = 5;
        sArray[33] = 4;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzj_3.id_protected();
        rrzj_3.id_break();
        rrzj_3.id_class();
    }

    @Override
    public long transferFrom(ReadableByteChannel readableByteChannel, long l, long l2) throws IOException {
        return ((FileChannel)this.id_class[id_break[14]]).transferFrom(readableByteChannel, l, l2);
    }

    @Override
    public void implCloseChannel() throws IOException {
        ((FileChannel)this.id_class[id_break[21]]).close();
        if (((Boolean)this.id_class[id_break[22]]).booleanValue()) {
            Long l = System.currentTimeMillis();
            ((rrzY_2)this.id_class[rrzj_3.id_break[23]]).id_class[rrzj_3.id_break[24]] = l;
            Long l2 = Files.size((Path)((rrzY_2)this.id_class[rrzj_3.id_break[26]]).id_class[id_break[27]]);
            ((rrzY_2)this.id_class[rrzj_3.id_break[25]]).id_class[rrzj_3.id_break[28]] = l2;
            ((rrzf_3)this.id_class[id_break[29]]).id_class((rrzY_2)this.id_class[id_break[30]]);
        } else if (!((Boolean)this.id_class[id_break[31]]).booleanValue()) {
            ((rrzf_3)this.id_class[id_break[32]]).id_throws((Path)this.id_class[id_break[33]]);
        }
    }

    @Override
    public FileChannel truncate(long l) throws IOException {
        ((FileChannel)this.id_class[id_break[11]]).truncate(l);
        return this;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_protected = blArray;
    }

    @Override
    public void force(boolean bl) throws IOException {
        ((FileChannel)this.id_class[id_break[12]]).force(bl);
    }

    @Override
    public FileLock tryLock(long l, long l2, boolean bl) throws IOException {
        return ((FileChannel)this.id_class[id_break[20]]).tryLock(l, l2, bl);
    }
}

