/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzA_2
implements SeekableByteChannel {
    private static String[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    private static short[] id_throws;
    private static byte[] id_case;
    private static int[] id_catch;
    private static long[] id_private;
    public Object[] id_break;

    public void id_byte() {
        ((ReadWriteLock)this.id_break[id_throws[43]]).writeLock().unlock();
    }

    private void id_byte(int n) {
        int n2 = ((byte[])this.id_break[id_throws[47]]).length;
        int n3 = n2 << id_protected[7];
        if (n3 - n < 0) {
            n3 = n;
        }
        if (n3 - id_catch[0] > 0) {
            n3 = rrzA_2.id_break(n);
        }
        byte[] byArray = Arrays.copyOf((byte[])this.id_break[id_throws[48]], n3);
        this.id_break[rrzA_2.id_throws[49]] = byArray;
    }

    public rrzA_2(int n, boolean bl) {
        this.id_extends();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.id_break[rrzA_2.id_throws[0]] = reentrantReadWriteLock;
        byte[] byArray = new byte[n];
        this.id_break[rrzA_2.id_throws[1]] = byArray;
        int n2 = id_protected[0];
        Integer n3 = n2;
        this.id_break[rrzA_2.id_throws[2]] = n3;
        Integer n4 = n2;
        this.id_break[rrzA_2.id_throws[3]] = n4;
        Boolean bl2 = bl;
        this.id_break[rrzA_2.id_throws[4]] = bl2;
    }

    public rrzA_2(byte[] byArray, boolean bl) {
        this.id_extends();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.id_break[rrzA_2.id_throws[5]] = reentrantReadWriteLock;
        byte[] byArray2 = byArray;
        this.id_break[rrzA_2.id_throws[6]] = byArray2;
        Integer n = id_protected[1];
        this.id_break[rrzA_2.id_throws[7]] = n;
        Integer n2 = byArray.length;
        this.id_break[rrzA_2.id_throws[8]] = n2;
        Boolean bl2 = bl;
        this.id_break[rrzA_2.id_throws[9]] = bl2;
    }

    static {
        rrzA_2.ntfClinit();
    }

    @Override
    public long size() throws IOException {
        this.id_native();
        try {
            this.id_case();
            long l = ((Integer)this.id_break[id_throws[33]]).intValue();
            return l;
        }
        finally {
            this.id_catch();
        }
    }

    @Override
    public long position() throws IOException {
        this.id_native();
        try {
            this.id_case();
            long l = ((Integer)this.id_break[id_throws[11]]).intValue();
            return l;
        }
        finally {
            this.id_catch();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SeekableByteChannel position(long l) throws IOException {
        this.id_break();
        try {
            this.id_case();
            if (l < id_private[0] || l >= id_private[1]) {
                throw new IllegalArgumentException("Illegal position " + l);
            }
            Integer n = Math.min((int)l, (Integer)this.id_break[id_throws[12]]);
            this.id_break[rrzA_2.id_throws[13]] = n;
            rrzA_2 rrzA_22 = this;
            return rrzA_22;
        }
        finally {
            this.id_byte();
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEA300B03FED5E97BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x46F5AA5C;
    }

    public byte[] id_class() {
        this.id_native();
        try {
            byte[] byArray = Arrays.copyOf((byte[])this.id_break[id_throws[39]], (int)((Integer)this.id_break[id_throws[40]]));
            return byArray;
        }
        finally {
            this.id_catch();
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-100, -34, -38, -42, -93, -89, 34, -121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean isOpen() {
        return (Boolean)this.id_break[id_throws[10]] == false ? id_protected[2] : id_protected[3];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (((Boolean)this.id_break[id_throws[23]]).booleanValue()) {
            throw new NonWritableChannelException();
        }
        this.id_break();
        try {
            this.id_case();
            int n = byteBuffer.remaining();
            this.id_protected((Integer)this.id_break[id_throws[24]] + n);
            byteBuffer.get((byte[])this.id_break[id_throws[25]], (Integer)this.id_break[id_throws[26]], n);
            rrzA_2 rrzA_22 = this;
            Integer n2 = (Integer)rrzA_22.id_break[id_throws[27]] + n;
            rrzA_22.id_break[rrzA_2.id_throws[28]] = n2;
            if ((Integer)this.id_break[id_throws[29]] > (Integer)this.id_break[id_throws[30]]) {
                Integer n3 = (int)((Integer)this.id_break[id_throws[31]]);
                this.id_break[rrzA_2.id_throws[32]] = n3;
            }
            int n4 = n;
            return n4;
        }
        finally {
            this.id_byte();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int read(ByteBuffer byteBuffer) throws IOException {
        this.id_break();
        try {
            this.id_case();
            if (((Integer)this.id_break[id_throws[14]]).intValue() == ((Integer)this.id_break[id_throws[15]]).intValue()) {
                byte by = id_case[0];
                return by;
            }
            int n = Math.min(byteBuffer.remaining(), (Integer)this.id_break[id_throws[16]] - (Integer)this.id_break[id_throws[17]]);
            byteBuffer.put((byte[])this.id_break[id_throws[18]], (Integer)this.id_break[id_throws[19]], n);
            rrzA_2 rrzA_22 = this;
            Integer n2 = (Integer)rrzA_22.id_break[id_throws[20]] + n;
            rrzA_22.id_break[rrzA_2.id_throws[21]] = n2;
            int n3 = n;
            return n3;
        }
        finally {
            this.id_byte();
        }
    }

    @Override
    public void close() throws IOException {
        if (((Boolean)this.id_break[id_throws[34]]).booleanValue()) {
            return;
        }
        this.id_break();
        try {
            Boolean bl = id_protected[4];
            this.id_break[rrzA_2.id_throws[35]] = bl;
            Object var7_2 = null;
            this.id_break[rrzA_2.id_throws[36]] = var7_2;
            Integer n = id_protected[5];
            this.id_break[rrzA_2.id_throws[37]] = n;
            Integer n2 = id_protected[6];
            this.id_break[rrzA_2.id_throws[38]] = n2;
        }
        finally {
            this.id_byte();
        }
    }

    public void id_break() {
        ((ReadWriteLock)this.id_break[id_throws[42]]).writeLock().lock();
    }

    private static int id_break(int n) {
        if (n < 0) {
            throw new OutOfMemoryError(id_byte[0]);
        }
        return n > id_catch[1] ? id_catch[2] : id_catch[3];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{0x7FFFFFF7};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzA_2.id_protected();
        rrzA_2.id_finally();
        rrzA_2.id_implements();
        rrzA_2.id_private();
        rrzA_2.id_final();
        rrzA_2.id_volatile();
        rrzA_2.id_throws();
    }

    @Override
    public SeekableByteChannel truncate(long l) throws IOException {
        if (((Boolean)this.id_break[id_throws[22]]).booleanValue()) {
            throw new NonWritableChannelException();
        }
        this.id_case();
        throw new UnsupportedOperationException();
    }

    private static void id_finally() {
        id_byte = new String[]{new String("Required length exceeds implementation limit")};
    }

    private final void id_catch() {
        ((ReadWriteLock)this.id_break[id_throws[45]]).readLock().unlock();
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[1]];
            objectArray[rrzA_2.id_case[2]] = id_protected[8];
            objectArray[rrzA_2.id_case[3]] = id_protected[9];
            objectArray[rrzA_2.id_case[4]] = id_protected[10];
            objectArray[rrzA_2.id_case[5]] = id_protected[11];
        }
    }

    private void id_case() throws IOException {
        if (((Boolean)this.id_break[id_throws[41]]).booleanValue()) {
            throw new ClosedChannelException();
        }
    }

    private static void id_implements() {
        long[] lArray = new long[2];
        lArray[1] = Integer.MAX_VALUE;
        id_private = lArray;
    }

    private void id_protected(int n) {
        if (n - ((byte[])this.id_break[id_throws[46]]).length > 0) {
            this.id_byte(n);
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[14];
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[12] = true;
        id_protected = blArray;
    }

    private static void id_private() {
        short[] sArray = new short[50];
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 2;
        sArray[4] = 5;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 5;
        sArray[10] = 4;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[15] = 3;
        sArray[16] = 3;
        sArray[17] = 2;
        sArray[18] = 1;
        sArray[19] = 2;
        sArray[20] = 2;
        sArray[21] = 2;
        sArray[22] = 5;
        sArray[23] = 5;
        sArray[24] = 2;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 2;
        sArray[28] = 2;
        sArray[29] = 2;
        sArray[30] = 3;
        sArray[31] = 2;
        sArray[32] = 3;
        sArray[33] = 3;
        sArray[34] = 4;
        sArray[35] = 4;
        sArray[36] = 1;
        sArray[37] = 2;
        sArray[38] = 3;
        sArray[39] = 1;
        sArray[40] = 3;
        sArray[41] = 4;
        sArray[46] = 1;
        sArray[47] = 1;
        sArray[48] = 1;
        sArray[49] = 1;
        id_throws = sArray;
    }

    private static void id_final() {
        id_case = new byte[]{-1, 6, 2, 3, 4, 5};
    }

    private static void id_volatile() {
        id_catch = new int[]{0x7FFFFFF7, 0x7FFFFFF7, Integer.MAX_VALUE, 0x7FFFFFF7, 0x7FFFFFF7};
    }

    private final void id_native() {
        ((ReadWriteLock)this.id_break[id_throws[44]]).readLock().lock();
    }
}

