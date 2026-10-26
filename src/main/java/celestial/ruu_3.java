/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$PartialResult
 *  com.mojang.serialization.DynamicOps
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  io.netty.util.ByteProcessor
 */
package celestial;

import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rcg_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrGj_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrxr_3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class ruu_3
extends ByteBuf
implements rrGj_1 {
    private final ByteBuf id_class;
    private Map<String, Object> id_break;

    public rfH_2 id_byte() {
        return rfH_2.id_protected(this.readLong());
    }

    public int[] id_byte(int n) {
        int n2 = this.id_case();
        if (n2 > n) {
            throw new DecoderException("VarIntArray with size " + n2 + " is bigger than allowed " + n);
        }
        int[] nArray = new int[n2];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = this.id_case();
        }
        return nArray;
    }

    public Map<String, Object> id_int() {
        return this.id_break;
    }

    public ruu_3(ByteBuf byteBuf) {
        this.id_class = byteBuf;
    }

    public ruu_3(ByteBuf byteBuf, Map<String, Object> map) {
        this.id_class = byteBuf;
        this.id_break = map;
    }

    public boolean equals(Object object) {
        return this.id_class.equals(object);
    }

    public String toString(int n, int n2, Charset charset) {
        return this.id_class.toString(n, n2, charset);
    }

    public String toString(Charset charset) {
        return this.id_class.toString(charset);
    }

    public String toString() {
        return this.id_class.toString();
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    public int compareTo(ByteBuf byteBuf) {
        return this.id_class.compareTo(byteBuf);
    }

    public int indexOf(int n, int n2, byte by) {
        return this.id_class.indexOf(n, n2, by);
    }

    public boolean getBoolean(int n) {
        return this.id_class.getBoolean(n);
    }

    public byte getByte(int n) {
        return this.id_class.getByte(n);
    }

    public short getShort(int n) {
        return this.id_class.getShort(n);
    }

    public char getChar(int n) {
        return this.id_class.getChar(n);
    }

    public int getInt(int n) {
        return this.id_class.getInt(n);
    }

    public long getLong(int n) {
        return this.id_class.getLong(n);
    }

    public float getFloat(int n) {
        return this.id_class.getFloat(n);
    }

    public double getDouble(int n) {
        return this.id_class.getDouble(n);
    }

    public ByteBuf clear() {
        return this.id_class.clear();
    }

    public int getBytes(int n, GatheringByteChannel gatheringByteChannel, int n2) throws IOException {
        return this.id_class.getBytes(n, gatheringByteChannel, n2);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf) {
        return this.id_class.getBytes(n, byteBuf);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        return this.id_class.getBytes(n, byteBuf, n2, n3);
    }

    public int getBytes(int n, FileChannel fileChannel, long l, int n2) throws IOException {
        return this.id_class.getBytes(n, fileChannel, l, n2);
    }

    public ByteBuf getBytes(int n, byte[] byArray) {
        return this.id_class.getBytes(n, byArray);
    }

    public ByteBuf getBytes(int n, byte[] byArray, int n2, int n3) {
        return this.id_class.getBytes(n, byArray, n2, n3);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf, int n2) {
        return this.id_class.getBytes(n, byteBuf, n2);
    }

    public ByteBuf getBytes(int n, ByteBuffer byteBuffer) {
        return this.id_class.getBytes(n, byteBuffer);
    }

    public ByteBuf getBytes(int n, OutputStream outputStream, int n2) throws IOException {
        return this.id_class.getBytes(n, outputStream, n2);
    }

    public <T> T id_class(Codec<T> codec) throws IOException {
        rcd_3 rcd_32 = this.id_finally();
        DataResult dataResult = codec.parse((DynamicOps)rcf_3.id_class, (Object)rcd_32);
        if (dataResult.error().isPresent()) {
            throw new IOException("Failed to decode: " + ((DataResult.PartialResult)dataResult.error().get()).message() + " " + rcd_32);
        }
        return dataResult.result().get();
    }

    public ruu_3 id_class(UUID uUID) {
        this.writeLong(uUID.getMostSignificantBits());
        this.writeLong(uUID.getLeastSignificantBits());
        return this;
    }

    public static int id_class(int n) {
        for (int i = 1; i < 5; ++i) {
            if ((n & -1 << i * 7) != 0) continue;
            return i;
        }
        return 5;
    }

    public ruu_3 id_class(Enum<?> enum_) {
        return this.id_protected(enum_.ordinal());
    }

    public ruu_3 id_class(long l) {
        while ((l & 0xFFFFFFFFFFFFFF80L) != 0L) {
            this.writeByte((int)(l & 0x7FL) | 0x80);
            l >>>= 7;
        }
        this.writeByte((int)l);
        return this;
    }

    public ruu_3 id_class(rcd_3 rcd_32) {
        if (rcd_32 == null) {
            this.writeByte(0);
        } else {
            try {
                rcW_2.id_class(rcd_32, (DataOutput)new ByteBufOutputStream((ByteBuf)this));
            }
            catch (IOException iOException) {
                throw new EncoderException((Throwable)iOException);
            }
        }
        return this;
    }

    public <T> void id_class(Codec<T> codec, T t) throws IOException {
        DataResult dataResult = codec.encodeStart((DynamicOps)rcf_3.id_class, t);
        if (dataResult.error().isPresent()) {
            throw new IOException("Failed to encode: " + ((DataResult.PartialResult)dataResult.error().get()).message() + " " + t);
        }
        this.id_class((rcd_3)dataResult.result().get());
    }

    public long[] id_class(long[] lArray, int n) {
        int n2 = this.id_case();
        if (lArray == null || lArray.length != n2) {
            if (n2 > n) {
                throw new DecoderException("LongArray with size " + n2 + " is bigger than allowed " + n);
            }
            lArray = new long[n2];
        }
        for (int i = 0; i < lArray.length; ++i) {
            lArray[i] = this.readLong();
        }
        return lArray;
    }

    public ruu_3 id_class(long[] lArray) {
        this.id_protected(lArray.length);
        for (long l : lArray) {
            this.writeLong(l);
        }
        return this;
    }

    public ruu_3 id_class(rfH_2 rfH_22) {
        this.writeLong(rfH_22.id_package());
        return this;
    }

    public void id_class(Map<String, Object> map) {
        this.id_break = map;
    }

    public ruu_3 id_class(rgP_2 rgP_22) {
        return this.id_class(rgB_2.id_class(rgP_22), 262144);
    }

    public <T extends Enum<T>> T id_class(Class<T> clazz) {
        return (T)((Enum[])clazz.getEnumConstants())[this.id_case()];
    }

    public ruu_3 id_class(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        if (byArray.length > n) {
            throw new EncoderException("String too big (was " + byArray.length + " bytes encoded, max " + n + ")");
        }
        this.id_protected(byArray.length);
        this.writeBytes(byArray);
        return this;
    }

    public ruu_3 id_class(String string) {
        return this.id_class(string, Short.MAX_VALUE);
    }

    public ruu_3 id_class(int[] nArray) {
        this.id_protected(nArray.length);
        for (int n : nArray) {
            this.id_protected(n);
        }
        return this;
    }

    public rcd_3 id_class(rcg_3 rcg_32) {
        int n = this.readerIndex();
        byte by = this.readByte();
        if (by == 0) {
            return null;
        }
        this.readerIndex(n);
        try {
            return rcW_2.id_class((DataInput)new ByteBufInputStream((ByteBuf)this), rcg_32);
        }
        catch (IOException iOException) {
            throw new EncoderException((Throwable)iOException);
        }
    }

    public ruu_3 id_class(rdn_3 rdn_32, boolean bl) {
        if (rdn_32.id_class()) {
            this.writeBoolean(false);
        } else {
            this.writeBoolean(true);
            rdb_3 rdb_32 = rdn_32.id_break();
            this.id_protected(rdb_3.id_class(rdb_32));
            this.writeByte(rdn_32.id_char());
            rcd_3 rcd_32 = null;
            if (rdb_32.id_extends() || rdb_32.id_final()) {
                rcd_32 = bl && rrxr_3.Pz.id_byte() ? (rcd_3)rrxr_3.id_private(rdn_32, rrxr_3.Pz, new Object[0]) : rdn_32.id_package();
            }
            this.id_class(rcd_32);
        }
        return this;
    }

    public byte[] id_class() {
        return this.id_break(this.readableBytes());
    }

    public void id_class(rff_3 rff_32) {
        rfH_2 rfH_22 = rff_32.id_class();
        this.id_class(rfH_22);
        this.id_class(rff_32.id_break());
        rjU_2 rjU_22 = rff_32.id_case();
        this.writeFloat((float)(rjU_22.id_break - (double)rfH_22.b_()));
        this.writeFloat((float)(rjU_22.id_byte - (double)rfH_22.c_()));
        this.writeFloat((float)(rjU_22.id_protected - (double)rfH_22.d_()));
        this.writeBoolean(rff_32.id_throws());
    }

    public ruu_3 id_class(Date date) {
        this.writeLong(date.getTime());
        return this;
    }

    public ruu_3 id_class(byte[] byArray) {
        this.id_protected(byArray.length);
        this.writeBytes(byArray);
        return this;
    }

    public ruu_3 id_class(rdn_3 rdn_32) {
        return this.id_class(rdn_32, true);
    }

    public ruu_3 id_class(rqO_2 rqO_22) {
        this.id_class(rqO_22.toString());
        return this;
    }

    public boolean isDirect() {
        return this.id_class.isDirect();
    }

    public boolean hasArray() {
        return this.id_class.hasArray();
    }

    public byte[] array() {
        return this.id_class.array();
    }

    public int arrayOffset() {
        return this.id_class.arrayOffset();
    }

    public ByteBuf writeInt(int n) {
        return this.id_class.writeInt(n);
    }

    public int readInt() {
        return this.id_class.readInt();
    }

    public ByteBuf setBoolean(int n, boolean bl) {
        return this.id_class.setBoolean(n, bl);
    }

    public ByteBuf setByte(int n, int n2) {
        return this.id_class.setByte(n, n2);
    }

    public ByteBuf setChar(int n, int n2) {
        return this.id_class.setChar(n, n2);
    }

    public ByteBuf setShort(int n, int n2) {
        return this.id_class.setShort(n, n2);
    }

    public ByteBuf setInt(int n, int n2) {
        return this.id_class.setInt(n, n2);
    }

    public ByteBuf setLong(int n, long l) {
        return this.id_class.setLong(n, l);
    }

    public ByteBuf setFloat(int n, float f) {
        return this.id_class.setFloat(n, f);
    }

    public ByteBuf setDouble(int n, double d) {
        return this.id_class.setDouble(n, d);
    }

    public ByteBuf copy() {
        return this.id_class.copy();
    }

    public ByteBuf copy(int n, int n2) {
        return this.id_class.copy(n, n2);
    }

    public ByteBuf unwrap() {
        return this.id_class.unwrap();
    }

    public ByteBuf capacity(int n) {
        return this.id_class.capacity(n);
    }

    public int capacity() {
        return this.id_class.capacity();
    }

    public boolean isReadOnly() {
        return this.id_class.isReadOnly();
    }

    public ByteBuf slice() {
        return this.id_class.slice();
    }

    public ByteBuf slice(int n, int n2) {
        return this.id_class.slice(n, n2);
    }

    public ByteBuf duplicate() {
        return this.id_class.duplicate();
    }

    public boolean release(int n) {
        return this.id_class.release(n);
    }

    public boolean release() {
        return this.id_class.release();
    }

    public int[] id_break() {
        return this.id_byte(this.readableBytes());
    }

    public Object id_break(String string) {
        return this.id_break == null ? null : this.id_break.get(string);
    }

    public long[] id_break(long[] lArray) {
        return this.id_class(lArray, this.readableBytes() / 8);
    }

    public byte[] id_break(int n) {
        int n2 = this.id_case();
        if (n2 > n) {
            throw new DecoderException("ByteArray with size " + n2 + " is bigger than allowed " + n);
        }
        byte[] byArray = new byte[n2];
        this.readBytes(byArray);
        return byArray;
    }

    public String id_throws(int n) {
        int n2 = this.id_case();
        if (n2 > n * 4) {
            throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + n2 + " > " + n * 4 + ")");
        }
        if (n2 < 0) {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
        }
        String string = this.toString(this.readerIndex(), n2, StandardCharsets.UTF_8);
        this.readerIndex(this.readerIndex() + n2);
        if (string.length() > n) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + n2 + " > " + n + ")");
        }
        return string;
    }

    public rgP_2 id_throws() {
        return rgB_2.id_class(this.id_throws(262144));
    }

    public int getUnsignedShort(int n) {
        return this.id_class.getUnsignedShort(n);
    }

    public rcd_3 id_finally() {
        return this.id_class(rcg_3.id_class);
    }

    public long id_catch() {
        byte by;
        long l = 0L;
        int n = 0;
        do {
            by = this.readByte();
            l |= (long)(by & 0x7F) << n++ * 7;
            if (n <= 10) continue;
            throw new RuntimeException("VarLong too big");
        } while ((by & 0x80) == 128);
        return l;
    }

    public rdn_3 id_extends() {
        if (!this.readBoolean()) {
            return rdn_3.id_break;
        }
        int n = this.id_case();
        byte by = this.readByte();
        rdn_3 rdn_32 = new rdn_3(rdb_3.id_break(n), by);
        rdn_32.id_byte(this.id_implements());
        if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]) && rdn_32.id_continue().getString().contains("\u041b\u0443\u0447\u0448\u0438\u0439 \u0422\u0413 @StarikZako")) {
            rdn_32.id_class(rdn_32.id_break().id_implements(rdn_32));
        }
        return rdn_32;
    }

    public int id_case() {
        byte by;
        int n = 0;
        int n2 = 0;
        do {
            by = this.readByte();
            n |= (by & 0x7F) << n2++ * 7;
            if (n2 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by & 0x80) == 128);
        return n;
    }

    public rcd_3 id_implements() {
        return this.id_class(new rcg_3(0x200000L));
    }

    public rff_3 id_package() {
        rfH_2 rfH_22 = this.id_byte();
        rpr_3 rpr_32 = this.id_class(rpr_3.class);
        float f = this.readFloat();
        float f2 = this.readFloat();
        float f3 = this.readFloat();
        boolean bl = this.readBoolean();
        return new rff_3(new rjU_2((double)rfH_22.b_() + (double)f, (double)rfH_22.c_() + (double)f2, (double)rfH_22.d_() + (double)f3), rpr_32, rfH_22, bl);
    }

    public rjh_3 id_protected() {
        return rjh_3.id_class(this.readLong());
    }

    public ruu_3 id_protected(int n) {
        while ((n & 0xFFFFFF80) != 0) {
            this.writeByte(n & 0x7F | 0x80);
            n >>>= 7;
        }
        this.writeByte(n);
        return this;
    }

    public UUID id_private() {
        return new UUID(this.readLong(), this.readLong());
    }

    public Date id_final() {
        return new Date(this.readLong());
    }

    public rqO_2 id_volatile() {
        return new rqO_2(this.id_throws(Short.MAX_VALUE));
    }

    public String id_native() {
        return this.id_throws(Short.MAX_VALUE);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int n) throws IOException {
        return this.id_class.readBytes(gatheringByteChannel, n);
    }

    public ByteBuf readBytes(byte[] byArray) {
        return this.id_class.readBytes(byArray);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n, int n2) {
        return this.id_class.readBytes(byteBuf, n, n2);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n) {
        return this.id_class.readBytes(byteBuf, n);
    }

    public ByteBuf readBytes(ByteBuf byteBuf) {
        return this.id_class.readBytes(byteBuf);
    }

    public ByteBuf readBytes(int n) {
        return this.id_class.readBytes(n);
    }

    public int readBytes(FileChannel fileChannel, long l, int n) throws IOException {
        return this.id_class.readBytes(fileChannel, l, n);
    }

    public ByteBuf readBytes(OutputStream outputStream, int n) throws IOException {
        return this.id_class.readBytes(outputStream, n);
    }

    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        return this.id_class.readBytes(byteBuffer);
    }

    public ByteBuf readBytes(byte[] byArray, int n, int n2) {
        return this.id_class.readBytes(byArray, n, n2);
    }

    public int writeBytes(FileChannel fileChannel, long l, int n) throws IOException {
        return this.id_class.writeBytes(fileChannel, l, n);
    }

    public ByteBuf writeBytes(byte[] byArray) {
        return this.id_class.writeBytes(byArray);
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n) throws IOException {
        return this.id_class.writeBytes(scatteringByteChannel, n);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n, int n2) {
        return this.id_class.writeBytes(byteBuf, n, n2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n) {
        return this.id_class.writeBytes(byteBuf, n);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf) {
        return this.id_class.writeBytes(byteBuf);
    }

    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return this.id_class.writeBytes(byteBuffer);
    }

    public ByteBuf writeBytes(byte[] byArray, int n, int n2) {
        return this.id_class.writeBytes(byArray, n, n2);
    }

    public int writeBytes(InputStream inputStream, int n) throws IOException {
        return this.id_class.writeBytes(inputStream, n);
    }

    public ByteOrder order() {
        return this.id_class.order();
    }

    public ByteBuf order(ByteOrder byteOrder) {
        return this.id_class.order(byteOrder);
    }

    public short readUnsignedByte() {
        return this.id_class.readUnsignedByte();
    }

    public int readUnsignedShort() {
        return this.id_class.readUnsignedShort();
    }

    public ByteBuf writeShort(int n) {
        return this.id_class.writeShort(n);
    }

    public ByteBuf skipBytes(int n) {
        return this.id_class.skipBytes(n);
    }

    public boolean readBoolean() {
        return this.id_class.readBoolean();
    }

    public byte readByte() {
        return this.id_class.readByte();
    }

    public short readShort() {
        return this.id_class.readShort();
    }

    public long readLong() {
        return this.id_class.readLong();
    }

    public double readDouble() {
        return this.id_class.readDouble();
    }

    public ByteBuf writeBoolean(boolean bl) {
        return this.id_class.writeBoolean(bl);
    }

    public ByteBuf writeByte(int n) {
        return this.id_class.writeByte(n);
    }

    public ByteBuf writeLong(long l) {
        return this.id_class.writeLong(l);
    }

    public ByteBuf writeDouble(double d) {
        return this.id_class.writeDouble(d);
    }

    public ByteBuf writeChar(int n) {
        return this.id_class.writeChar(n);
    }

    public char readChar() {
        return this.id_class.readChar();
    }

    public ByteBuf writeFloat(float f) {
        return this.id_class.writeFloat(f);
    }

    public float readFloat() {
        return this.id_class.readFloat();
    }

    public boolean isReadable(int n) {
        return this.id_class.isReadable(n);
    }

    public boolean isReadable() {
        return this.id_class.isReadable();
    }

    public boolean isWritable(int n) {
        return this.id_class.isWritable(n);
    }

    public boolean isWritable() {
        return this.id_class.isWritable();
    }

    public ByteBuf touch() {
        return this.id_class.touch();
    }

    public ByteBuf touch(Object object) {
        return this.id_class.touch(object);
    }

    public long readUnsignedInt() {
        return this.id_class.readUnsignedInt();
    }

    public ByteBuf markReaderIndex() {
        return this.id_class.markReaderIndex();
    }

    public ByteBuf resetReaderIndex() {
        return this.id_class.resetReaderIndex();
    }

    public int maxCapacity() {
        return this.id_class.maxCapacity();
    }

    public int writerIndex() {
        return this.id_class.writerIndex();
    }

    public ByteBuf writerIndex(int n) {
        return this.id_class.writerIndex(n);
    }

    public int writableBytes() {
        return this.id_class.writableBytes();
    }

    public ByteBuf resetWriterIndex() {
        return this.id_class.resetWriterIndex();
    }

    public int maxWritableBytes() {
        return this.id_class.maxWritableBytes();
    }

    public ByteBuf markWriterIndex() {
        return this.id_class.markWriterIndex();
    }

    public int forEachByteDesc(ByteProcessor byteProcessor) {
        return this.id_class.forEachByteDesc(byteProcessor);
    }

    public int forEachByteDesc(int n, int n2, ByteProcessor byteProcessor) {
        return this.id_class.forEachByteDesc(n, n2, byteProcessor);
    }

    public int forEachByte(ByteProcessor byteProcessor) {
        return this.id_class.forEachByte(byteProcessor);
    }

    public int forEachByte(int n, int n2, ByteProcessor byteProcessor) {
        return this.id_class.forEachByte(n, n2, byteProcessor);
    }

    public ByteBuf setIndex(int n, int n2) {
        return this.id_class.setIndex(n, n2);
    }

    public ByteBuf asReadOnly() {
        return this.id_class.asReadOnly();
    }

    public int readUnsignedMediumLE() {
        return this.id_class.readUnsignedMediumLE();
    }

    public ByteBuf discardSomeReadBytes() {
        return this.id_class.discardSomeReadBytes();
    }

    public int getUnsignedMediumLE(int n) {
        return this.id_class.getUnsignedMediumLE(n);
    }

    public int readUnsignedShortLE() {
        return this.id_class.readUnsignedShortLE();
    }

    public int readerIndex() {
        return this.id_class.readerIndex();
    }

    public ByteBuf readerIndex(int n) {
        return this.id_class.readerIndex(n);
    }

    public int readableBytes() {
        return this.id_class.readableBytes();
    }

    public int refCnt() {
        return this.id_class.refCnt();
    }

    public ByteBuffer nioBuffer(int n, int n2) {
        return this.id_class.nioBuffer(n, n2);
    }

    public ByteBuffer nioBuffer() {
        return this.id_class.nioBuffer();
    }

    public int getMedium(int n) {
        return this.id_class.getMedium(n);
    }

    public long readLongLE() {
        return this.id_class.readLongLE();
    }

    public ByteBuf setLongLE(int n, long l) {
        return this.id_class.setLongLE(n, l);
    }

    public ByteBuf writeZero(int n) {
        return this.id_class.writeZero(n);
    }

    public ByteBuf setBytes(int n, byte[] byArray, int n2, int n3) {
        return this.id_class.setBytes(n, byArray, n2, n3);
    }

    public int setBytes(int n, InputStream inputStream, int n2) throws IOException {
        return this.id_class.setBytes(n, inputStream, n2);
    }

    public ByteBuf setBytes(int n, ByteBuffer byteBuffer) {
        return this.id_class.setBytes(n, byteBuffer);
    }

    public int setBytes(int n, ScatteringByteChannel scatteringByteChannel, int n2) throws IOException {
        return this.id_class.setBytes(n, scatteringByteChannel, n2);
    }

    public int setBytes(int n, FileChannel fileChannel, long l, int n2) throws IOException {
        return this.id_class.setBytes(n, fileChannel, l, n2);
    }

    public ByteBuf setBytes(int n, byte[] byArray) {
        return this.id_class.setBytes(n, byArray);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf) {
        return this.id_class.setBytes(n, byteBuf);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf, int n2) {
        return this.id_class.setBytes(n, byteBuf, n2);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        return this.id_class.setBytes(n, byteBuf, n2, n3);
    }

    public ByteBuf setZero(int n, int n2) {
        return this.id_class.setZero(n, n2);
    }

    public ByteBuf setIntLE(int n, int n2) {
        return this.id_class.setIntLE(n, n2);
    }

    public int readIntLE() {
        return this.id_class.readIntLE();
    }

    public ByteBuf writeIntLE(int n) {
        return this.id_class.writeIntLE(n);
    }

    public ByteBuf readSlice(int n) {
        return this.id_class.readSlice(n);
    }

    public short getShortLE(int n) {
        return this.id_class.getShortLE(n);
    }

    public long getLongLE(int n) {
        return this.id_class.getLongLE(n);
    }

    public ByteBuf setShortLE(int n, int n2) {
        return this.id_class.setShortLE(n, n2);
    }

    public int getIntLE(int n) {
        return this.id_class.getIntLE(n);
    }

    public int readMedium() {
        return this.id_class.readMedium();
    }

    public ByteBuf setMedium(int n, int n2) {
        return this.id_class.setMedium(n, n2);
    }

    public ByteBuffer[] nioBuffers(int n, int n2) {
        return this.id_class.nioBuffers(n, n2);
    }

    public ByteBuffer[] nioBuffers() {
        return this.id_class.nioBuffers();
    }

    public ByteBuf retain() {
        return this.id_class.retain();
    }

    public ByteBuf retain(int n) {
        return this.id_class.retain(n);
    }

    public ByteBufAllocator alloc() {
        return this.id_class.alloc();
    }

    public int setCharSequence(int n, CharSequence charSequence, Charset charset) {
        return this.id_class.setCharSequence(n, charSequence, charset);
    }

    public ByteBuf ensureWritable(int n) {
        return this.id_class.ensureWritable(n);
    }

    public int ensureWritable(int n, boolean bl) {
        return this.id_class.ensureWritable(n, bl);
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        return this.id_class.writeCharSequence(charSequence, charset);
    }

    public int bytesBefore(int n, int n2, byte by) {
        return this.id_class.bytesBefore(n, n2, by);
    }

    public int bytesBefore(int n, byte by) {
        return this.id_class.bytesBefore(n, by);
    }

    public int bytesBefore(byte by) {
        return this.id_class.bytesBefore(by);
    }

    public int getMediumLE(int n) {
        return this.id_class.getMediumLE(n);
    }

    public long readUnsignedIntLE() {
        return this.id_class.readUnsignedIntLE();
    }

    public ByteBuf retainedSlice(int n, int n2) {
        return this.id_class.retainedSlice(n, n2);
    }

    public ByteBuf retainedSlice() {
        return this.id_class.retainedSlice();
    }

    public ByteBuf discardReadBytes() {
        return this.id_class.discardReadBytes();
    }

    public int getUnsignedMedium(int n) {
        return this.id_class.getUnsignedMedium(n);
    }

    public long getUnsignedInt(int n) {
        return this.id_class.getUnsignedInt(n);
    }

    public int readMediumLE() {
        return this.id_class.readMediumLE();
    }

    public int readUnsignedMedium() {
        return this.id_class.readUnsignedMedium();
    }

    public ByteBuf readRetainedSlice(int n) {
        return this.id_class.readRetainedSlice(n);
    }

    public int getUnsignedShortLE(int n) {
        return this.id_class.getUnsignedShortLE(n);
    }

    public long getUnsignedIntLE(int n) {
        return this.id_class.getUnsignedIntLE(n);
    }

    public CharSequence readCharSequence(int n, Charset charset) {
        return this.id_class.readCharSequence(n, charset);
    }

    public ByteBuf writeMediumLE(int n) {
        return this.id_class.writeMediumLE(n);
    }

    public ByteBuf writeShortLE(int n) {
        return this.id_class.writeShortLE(n);
    }

    public ByteBuf writeMedium(int n) {
        return this.id_class.writeMedium(n);
    }

    public ByteBuf writeLongLE(long l) {
        return this.id_class.writeLongLE(l);
    }

    public CharSequence getCharSequence(int n, int n2, Charset charset) {
        return this.id_class.getCharSequence(n, n2, charset);
    }

    public ByteBuf setMediumLE(int n, int n2) {
        return this.id_class.setMediumLE(n, n2);
    }

    public short readShortLE() {
        return this.id_class.readShortLE();
    }

    public short getUnsignedByte(int n) {
        return this.id_class.getUnsignedByte(n);
    }

    public ByteBuffer internalNioBuffer(int n, int n2) {
        return this.id_class.internalNioBuffer(n, n2);
    }

    public int nioBufferCount() {
        return this.id_class.nioBufferCount();
    }

    public long memoryAddress() {
        return this.id_class.memoryAddress();
    }

    public boolean hasMemoryAddress() {
        return this.id_class.hasMemoryAddress();
    }

    public ByteBuf retainedDuplicate() {
        return this.id_class.retainedDuplicate();
    }
}

