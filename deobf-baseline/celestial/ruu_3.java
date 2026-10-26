package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DataResult.PartialResult;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
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

public class ruu_3 extends ByteBuf implements rrGj_1 {
   private final ByteBuf id_class;
   private Map<String, Object> id_break;

   public rfH_2 id_byte() {
      return rfH_2.id_protected(this.readLong());
   }

   public int[] id_byte(int var1) {
      int var2 = this.id_case();
      if (var2 > var1) {
         throw new DecoderException("VarIntArray with size " + var2 + " is bigger than allowed " + var1);
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = this.id_case();
         }

         return var3;
      }
   }

   public Map<String, Object> id_int() {
      return this.id_break;
   }

   public ruu_3(ByteBuf var1) {
      this.id_class = var1;
   }

   public ruu_3(ByteBuf var1, Map<String, Object> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this.id_class.equals(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.id_class.toString(var1, var2, var3);
   }

   public String toString(Charset var1) {
      return this.id_class.toString(var1);
   }

   @Override
   public String toString() {
      return this.id_class.toString();
   }

   @Override
   public int hashCode() {
      return this.id_class.hashCode();
   }

   public int compareTo(ByteBuf var1) {
      return this.id_class.compareTo(var1);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.id_class.indexOf(var1, var2, var3);
   }

   public boolean getBoolean(int var1) {
      return this.id_class.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.id_class.getByte(var1);
   }

   public short getShort(int var1) {
      return this.id_class.getShort(var1);
   }

   public char getChar(int var1) {
      return this.id_class.getChar(var1);
   }

   public int getInt(int var1) {
      return this.id_class.getInt(var1);
   }

   public long getLong(int var1) {
      return this.id_class.getLong(var1);
   }

   public float getFloat(int var1) {
      return this.id_class.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.id_class.getDouble(var1);
   }

   public ByteBuf clear() {
      return this.id_class.clear();
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) throws IOException {
      return this.id_class.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.id_class.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.id_class.getBytes(var1, var2, var3, var4);
   }

   public int getBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.id_class.getBytes(var1, var2, var3, var5);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.id_class.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.id_class.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.id_class.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.id_class.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) throws IOException {
      return this.id_class.getBytes(var1, var2, var3);
   }

   public <T> T id_class(Codec<T> var1) throws IOException {
      rcd_3 var2 = this.id_finally();
      DataResult var3 = var1.parse(rcf_3.id_class, var2);
      if (var3.error().isPresent()) {
         throw new IOException("Failed to decode: " + ((PartialResult)var3.error().get()).message() + " " + var2);
      } else {
         return (T)var3.result().get();
      }
   }

   public ruu_3 id_class(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
      return this;
   }

   public static int id_class(int var0) {
      for (int var1 = 1; var1 < 5; var1++) {
         if ((var0 & -1 << var1 * 7) == 0) {
            return var1;
         }
      }

      return 5;
   }

   public ruu_3 id_class(Enum<?> var1) {
      return this.id_protected(var1.ordinal());
   }

   public ruu_3 id_class(long var1) {
      while ((var1 & -128L) != 0L) {
         this.writeByte((int)(var1 & 127L) | 128);
         var1 >>>= 7;
      }

      this.writeByte((int)var1);
      return this;
   }

   public ruu_3 id_class(rcd_3 var1) {
      if (var1 == null) {
         this.writeByte(0);
      } else {
         try {
            rcW_2.id_class(var1, new ByteBufOutputStream(this));
         } catch (IOException var3) {
            throw new EncoderException(var3);
         }
      }

      return this;
   }

   public <T> void id_class(Codec<T> var1, T var2) throws IOException {
      DataResult var3 = var1.encodeStart(rcf_3.id_class, var2);
      if (var3.error().isPresent()) {
         throw new IOException("Failed to encode: " + ((PartialResult)var3.error().get()).message() + " " + var2);
      } else {
         this.id_class((rcd_3)var3.result().get());
      }
   }

   public long[] id_class(long[] var1, int var2) {
      int var3 = this.id_case();
      if (var1 == null || var1.length != var3) {
         if (var3 > var2) {
            throw new DecoderException("LongArray with size " + var3 + " is bigger than allowed " + var2);
         }

         var1 = new long[var3];
      }

      for (int var4 = 0; var4 < var1.length; var4++) {
         var1[var4] = this.readLong();
      }

      return var1;
   }

   public ruu_3 id_class(long[] var1) {
      this.id_protected(var1.length);

      for (long var5 : var1) {
         this.writeLong(var5);
      }

      return this;
   }

   public ruu_3 id_class(rfH_2 var1) {
      this.writeLong(var1.id_package());
      return this;
   }

   public void id_class(Map<String, Object> var1) {
      this.id_break = var1;
   }

   public ruu_3 id_class(rgP_2 var1) {
      return this.id_class(rgB_2.id_class(var1), 262144);
   }

   public <T extends Enum<T>> T id_class(Class<T> var1) {
      return (T)var1.getEnumConstants()[this.id_case()];
   }

   public ruu_3 id_class(String var1, int var2) {
      byte[] var3 = var1.getBytes(StandardCharsets.UTF_8);
      if (var3.length > var2) {
         throw new EncoderException("String too big (was " + var3.length + " bytes encoded, max " + var2 + ")");
      } else {
         this.id_protected(var3.length);
         this.writeBytes(var3);
         return this;
      }
   }

   public ruu_3 id_class(String var1) {
      return this.id_class(var1, 32767);
   }

   public ruu_3 id_class(int[] var1) {
      this.id_protected(var1.length);

      for (int var5 : var1) {
         this.id_protected(var5);
      }

      return this;
   }

   public rcd_3 id_class(rcg_3 var1) {
      int var2 = this.readerIndex();
      byte var3 = this.readByte();
      if (var3 == 0) {
         return null;
      } else {
         this.readerIndex(var2);

         try {
            return rcW_2.id_class(new ByteBufInputStream(this), var1);
         } catch (IOException var5) {
            throw new EncoderException(var5);
         }
      }
   }

   public ruu_3 id_class(rdn_3 var1, boolean var2) {
      if (var1.id_class()) {
         this.writeBoolean(false);
      } else {
         this.writeBoolean(true);
         rdb_3 var3 = var1.id_break();
         this.id_protected(rdb_3.id_class(var3));
         this.writeByte(var1.id_char());
         rcd_3 var4 = null;
         if (var3.id_extends() || var3.id_final()) {
            if (var2 && rrxr_3.Pz.id_byte()) {
               var4 = (rcd_3)rrxr_3.id_private(var1, rrxr_3.Pz);
            } else {
               var4 = var1.id_package();
            }
         }

         this.id_class(var4);
      }

      return this;
   }

   public byte[] id_class() {
      return this.id_break(this.readableBytes());
   }

   public void id_class(rff_3 var1) {
      rfH_2 var2 = var1.id_class();
      this.id_class(var2);
      this.id_class(var1.id_break());
      rjU_2 var3 = var1.id_case();
      this.writeFloat((float)(var3.id_break - (double)var2.b_()));
      this.writeFloat((float)(var3.id_byte - (double)var2.c_()));
      this.writeFloat((float)(var3.id_protected - (double)var2.d_()));
      this.writeBoolean(var1.id_throws());
   }

   public ruu_3 id_class(Date var1) {
      this.writeLong(var1.getTime());
      return this;
   }

   public ruu_3 id_class(byte[] var1) {
      this.id_protected(var1.length);
      this.writeBytes(var1);
      return this;
   }

   public ruu_3 id_class(rdn_3 var1) {
      return this.id_class(var1, true);
   }

   public ruu_3 id_class(rqO_2 var1) {
      this.id_class(var1.toString());
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

   public ByteBuf writeInt(int var1) {
      return this.id_class.writeInt(var1);
   }

   public int readInt() {
      return this.id_class.readInt();
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.id_class.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.id_class.setByte(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.id_class.setChar(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.id_class.setShort(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.id_class.setInt(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.id_class.setLong(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.id_class.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.id_class.setDouble(var1, var2);
   }

   public ByteBuf copy() {
      return this.id_class.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.id_class.copy(var1, var2);
   }

   public ByteBuf unwrap() {
      return this.id_class.unwrap();
   }

   public ByteBuf capacity(int var1) {
      return this.id_class.capacity(var1);
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

   public ByteBuf slice(int var1, int var2) {
      return this.id_class.slice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.id_class.duplicate();
   }

   public boolean release(int var1) {
      return this.id_class.release(var1);
   }

   public boolean release() {
      return this.id_class.release();
   }

   public int[] id_break() {
      return this.id_byte(this.readableBytes());
   }

   public Object id_break(String var1) {
      return this.id_break == null ? null : this.id_break.get(var1);
   }

   public long[] id_break(long[] var1) {
      return this.id_class(var1, this.readableBytes() / 8);
   }

   public byte[] id_break(int var1) {
      int var2 = this.id_case();
      if (var2 > var1) {
         throw new DecoderException("ByteArray with size " + var2 + " is bigger than allowed " + var1);
      } else {
         byte[] var3 = new byte[var2];
         this.readBytes(var3);
         return var3;
      }
   }

   public String id_throws(int var1) {
      int var2 = this.id_case();
      if (var2 > var1 * 4) {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + var2 + " > " + var1 * 4 + ")");
      } else if (var2 < 0) {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      } else {
         String var3 = this.toString(this.readerIndex(), var2, StandardCharsets.UTF_8);
         this.readerIndex(this.readerIndex() + var2);
         if (var3.length() > var1) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + var2 + " > " + var1 + ")");
         } else {
            return var3;
         }
      }
   }

   public rgP_2 id_throws() {
      return rgB_2.id_class(this.id_throws(262144));
   }

   public int getUnsignedShort(int var1) {
      return this.id_class.getUnsignedShort(var1);
   }

   public rcd_3 id_finally() {
      return this.id_class(rcg_3.id_class);
   }

   public long id_catch() {
      long var1 = 0L;
      int var3 = 0;

      byte var4;
      do {
         var4 = this.readByte();
         var1 |= (long)(var4 & 127) << var3++ * 7;
         if (var3 > 10) {
            throw new RuntimeException("VarLong too big");
         }
      } while ((var4 & 128) == 128);

      return var1;
   }

   public rdn_3 id_extends() {
      if (!this.readBoolean()) {
         return rdn_3.id_break;
      } else {
         int var1 = this.id_case();
         byte var2 = this.readByte();
         rdn_3 var3 = new rdn_3(rdb_3.id_break(var1), var2);
         var3.id_byte(this.id_implements());
         if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]
            && var3.id_continue().getString().contains("Лучший ТГ @StarikZako")) {
            var3.id_class(var3.id_break().id_implements(var3));
         }

         return var3;
      }
   }

   public int id_case() {
      int var1 = 0;
      int var2 = 0;

      byte var3;
      do {
         var3 = this.readByte();
         var1 |= (var3 & 127) << var2++ * 7;
         if (var2 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while ((var3 & 128) == 128);

      return var1;
   }

   public rcd_3 id_implements() {
      return this.id_class(new rcg_3(2097152L));
   }

   public rff_3 id_package() {
      rfH_2 var1 = this.id_byte();
      rpr_3 var2 = this.id_class(rpr_3.class);
      float var3 = this.readFloat();
      float var4 = this.readFloat();
      float var5 = this.readFloat();
      boolean var6 = this.readBoolean();
      return new rff_3(new rjU_2((double)var1.b_() + (double)var3, (double)var1.c_() + (double)var4, (double)var1.d_() + (double)var5), var2, var1, var6);
   }

   public rjh_3 id_protected() {
      return rjh_3.id_class(this.readLong());
   }

   public ruu_3 id_protected(int var1) {
      while ((var1 & -128) != 0) {
         this.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.writeByte(var1);
      return this;
   }

   public UUID id_private() {
      return new UUID(this.readLong(), this.readLong());
   }

   public Date id_final() {
      return new Date(this.readLong());
   }

   public rqO_2 id_volatile() {
      return new rqO_2(this.id_throws(32767));
   }

   public String id_native() {
      return this.id_throws(32767);
   }

   public int readBytes(GatheringByteChannel var1, int var2) throws IOException {
      return this.id_class.readBytes(var1, var2);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.id_class.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.id_class.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.id_class.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.id_class.readBytes(var1);
   }

   public ByteBuf readBytes(int var1) {
      return this.id_class.readBytes(var1);
   }

   public int readBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.id_class.readBytes(var1, var2, var4);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) throws IOException {
      return this.id_class.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.id_class.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.id_class.readBytes(var1, var2, var3);
   }

   public int writeBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.id_class.writeBytes(var1, var2, var4);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.id_class.writeBytes(var1);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) throws IOException {
      return this.id_class.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.id_class.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.id_class.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.id_class.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.id_class.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.id_class.writeBytes(var1, var2, var3);
   }

   public int writeBytes(InputStream var1, int var2) throws IOException {
      return this.id_class.writeBytes(var1, var2);
   }

   public ByteOrder order() {
      return this.id_class.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.id_class.order(var1);
   }

   public short readUnsignedByte() {
      return this.id_class.readUnsignedByte();
   }

   public int readUnsignedShort() {
      return this.id_class.readUnsignedShort();
   }

   public ByteBuf writeShort(int var1) {
      return this.id_class.writeShort(var1);
   }

   public ByteBuf skipBytes(int var1) {
      return this.id_class.skipBytes(var1);
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

   public ByteBuf writeBoolean(boolean var1) {
      return this.id_class.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.id_class.writeByte(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.id_class.writeLong(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.id_class.writeDouble(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.id_class.writeChar(var1);
   }

   public char readChar() {
      return this.id_class.readChar();
   }

   public ByteBuf writeFloat(float var1) {
      return this.id_class.writeFloat(var1);
   }

   public float readFloat() {
      return this.id_class.readFloat();
   }

   public boolean isReadable(int var1) {
      return this.id_class.isReadable(var1);
   }

   public boolean isReadable() {
      return this.id_class.isReadable();
   }

   public boolean isWritable(int var1) {
      return this.id_class.isWritable(var1);
   }

   public boolean isWritable() {
      return this.id_class.isWritable();
   }

   public ByteBuf touch() {
      return this.id_class.touch();
   }

   public ByteBuf touch(Object var1) {
      return this.id_class.touch(var1);
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

   public ByteBuf writerIndex(int var1) {
      return this.id_class.writerIndex(var1);
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

   public int forEachByteDesc(ByteProcessor var1) {
      return this.id_class.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteProcessor var3) {
      return this.id_class.forEachByteDesc(var1, var2, var3);
   }

   public int forEachByte(ByteProcessor var1) {
      return this.id_class.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteProcessor var3) {
      return this.id_class.forEachByte(var1, var2, var3);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.id_class.setIndex(var1, var2);
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

   public int getUnsignedMediumLE(int var1) {
      return this.id_class.getUnsignedMediumLE(var1);
   }

   public int readUnsignedShortLE() {
      return this.id_class.readUnsignedShortLE();
   }

   public int readerIndex() {
      return this.id_class.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.id_class.readerIndex(var1);
   }

   public int readableBytes() {
      return this.id_class.readableBytes();
   }

   public int refCnt() {
      return this.id_class.refCnt();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.id_class.nioBuffer(var1, var2);
   }

   public ByteBuffer nioBuffer() {
      return this.id_class.nioBuffer();
   }

   public int getMedium(int var1) {
      return this.id_class.getMedium(var1);
   }

   public long readLongLE() {
      return this.id_class.readLongLE();
   }

   public ByteBuf setLongLE(int var1, long var2) {
      return this.id_class.setLongLE(var1, var2);
   }

   public ByteBuf writeZero(int var1) {
      return this.id_class.writeZero(var1);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.id_class.setBytes(var1, var2, var3, var4);
   }

   public int setBytes(int var1, InputStream var2, int var3) throws IOException {
      return this.id_class.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.id_class.setBytes(var1, var2);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) throws IOException {
      return this.id_class.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.id_class.setBytes(var1, var2, var3, var5);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.id_class.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.id_class.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.id_class.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.id_class.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.id_class.setZero(var1, var2);
   }

   public ByteBuf setIntLE(int var1, int var2) {
      return this.id_class.setIntLE(var1, var2);
   }

   public int readIntLE() {
      return this.id_class.readIntLE();
   }

   public ByteBuf writeIntLE(int var1) {
      return this.id_class.writeIntLE(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.id_class.readSlice(var1);
   }

   public short getShortLE(int var1) {
      return this.id_class.getShortLE(var1);
   }

   public long getLongLE(int var1) {
      return this.id_class.getLongLE(var1);
   }

   public ByteBuf setShortLE(int var1, int var2) {
      return this.id_class.setShortLE(var1, var2);
   }

   public int getIntLE(int var1) {
      return this.id_class.getIntLE(var1);
   }

   public int readMedium() {
      return this.id_class.readMedium();
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.id_class.setMedium(var1, var2);
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.id_class.nioBuffers(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.id_class.nioBuffers();
   }

   public ByteBuf retain() {
      return this.id_class.retain();
   }

   public ByteBuf retain(int var1) {
      return this.id_class.retain(var1);
   }

   public ByteBufAllocator alloc() {
      return this.id_class.alloc();
   }

   public int setCharSequence(int var1, CharSequence var2, Charset var3) {
      return this.id_class.setCharSequence(var1, var2, var3);
   }

   public ByteBuf ensureWritable(int var1) {
      return this.id_class.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.id_class.ensureWritable(var1, var2);
   }

   public int writeCharSequence(CharSequence var1, Charset var2) {
      return this.id_class.writeCharSequence(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.id_class.bytesBefore(var1, var2, var3);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.id_class.bytesBefore(var1, var2);
   }

   public int bytesBefore(byte var1) {
      return this.id_class.bytesBefore(var1);
   }

   public int getMediumLE(int var1) {
      return this.id_class.getMediumLE(var1);
   }

   public long readUnsignedIntLE() {
      return this.id_class.readUnsignedIntLE();
   }

   public ByteBuf retainedSlice(int var1, int var2) {
      return this.id_class.retainedSlice(var1, var2);
   }

   public ByteBuf retainedSlice() {
      return this.id_class.retainedSlice();
   }

   public ByteBuf discardReadBytes() {
      return this.id_class.discardReadBytes();
   }

   public int getUnsignedMedium(int var1) {
      return this.id_class.getUnsignedMedium(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.id_class.getUnsignedInt(var1);
   }

   public int readMediumLE() {
      return this.id_class.readMediumLE();
   }

   public int readUnsignedMedium() {
      return this.id_class.readUnsignedMedium();
   }

   public ByteBuf readRetainedSlice(int var1) {
      return this.id_class.readRetainedSlice(var1);
   }

   public int getUnsignedShortLE(int var1) {
      return this.id_class.getUnsignedShortLE(var1);
   }

   public long getUnsignedIntLE(int var1) {
      return this.id_class.getUnsignedIntLE(var1);
   }

   public CharSequence readCharSequence(int var1, Charset var2) {
      return this.id_class.readCharSequence(var1, var2);
   }

   public ByteBuf writeMediumLE(int var1) {
      return this.id_class.writeMediumLE(var1);
   }

   public ByteBuf writeShortLE(int var1) {
      return this.id_class.writeShortLE(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.id_class.writeMedium(var1);
   }

   public ByteBuf writeLongLE(long var1) {
      return this.id_class.writeLongLE(var1);
   }

   public CharSequence getCharSequence(int var1, int var2, Charset var3) {
      return this.id_class.getCharSequence(var1, var2, var3);
   }

   public ByteBuf setMediumLE(int var1, int var2) {
      return this.id_class.setMediumLE(var1, var2);
   }

   public short readShortLE() {
      return this.id_class.readShortLE();
   }

   public short getUnsignedByte(int var1) {
      return this.id_class.getUnsignedByte(var1);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.id_class.internalNioBuffer(var1, var2);
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
