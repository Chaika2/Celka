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
   private final ByteBuf class_;
   private Map<String, Object> break_;

   public rfH_2 byte_() {
      return rfH_2.protected_(this.readLong());
   }

   public int[] byte_(int var1) {
      int var2 = this.case_();
      if (var2 > var1) {
         throw new DecoderException("VarIntArray with size " + var2 + " is bigger than allowed " + var1);
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = this.case_();
         }

         return var3;
      }
   }

   public Map<String, Object> int_() {
      return this.break_;
   }

   public ruu_3(ByteBuf var1) {
      this.class_ = var1;
   }

   public ruu_3(ByteBuf var1, Map<String, Object> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this.class_.equals(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.class_.toString(var1, var2, var3);
   }

   public String toString(Charset var1) {
      return this.class_.toString(var1);
   }

   @Override
   public String toString() {
      return this.class_.toString();
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   public int compareTo(ByteBuf var1) {
      return this.class_.compareTo(var1);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.class_.indexOf(var1, var2, var3);
   }

   public boolean getBoolean(int var1) {
      return this.class_.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.class_.getByte(var1);
   }

   public short getShort(int var1) {
      return this.class_.getShort(var1);
   }

   public char getChar(int var1) {
      return this.class_.getChar(var1);
   }

   public int getInt(int var1) {
      return this.class_.getInt(var1);
   }

   public long getLong(int var1) {
      return this.class_.getLong(var1);
   }

   public float getFloat(int var1) {
      return this.class_.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.class_.getDouble(var1);
   }

   public ByteBuf clear() {
      return this.class_.clear();
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) throws IOException {
      return this.class_.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.class_.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.class_.getBytes(var1, var2, var3, var4);
   }

   public int getBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.class_.getBytes(var1, var2, var3, var5);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.class_.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.class_.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.class_.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.class_.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) throws IOException {
      return this.class_.getBytes(var1, var2, var3);
   }

   public <T> T class_(Codec<T> var1) throws IOException {
      rcd_3 var2 = this.finally_();
      DataResult var3 = var1.parse(rcf_3.class_, var2);
      if (var3.error().isPresent()) {
         throw new IOException("Failed to decode: " + ((PartialResult)var3.error().get()).message() + " " + var2);
      } else {
         return (T)var3.result().get();
      }
   }

   public ruu_3 class_(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
      return this;
   }

   public static int class_(int var0) {
      for (int var1 = 1; var1 < 5; var1++) {
         if ((var0 & -1 << var1 * 7) == 0) {
            return var1;
         }
      }

      return 5;
   }

   public ruu_3 class_(Enum<?> var1) {
      return this.protected_(var1.ordinal());
   }

   public ruu_3 class_(long var1) {
      while ((var1 & -128L) != 0L) {
         this.writeByte((int)(var1 & 127L) | 128);
         var1 >>>= 7;
      }

      this.writeByte((int)var1);
      return this;
   }

   public ruu_3 class_(rcd_3 var1) {
      if (var1 == null) {
         this.writeByte(0);
      } else {
         try {
            rcW_2.class_(var1, new ByteBufOutputStream(this));
         } catch (IOException var3) {
            throw new EncoderException(var3);
         }
      }

      return this;
   }

   public <T> void class_(Codec<T> var1, T var2) throws IOException {
      DataResult var3 = var1.encodeStart(rcf_3.class_, var2);
      if (var3.error().isPresent()) {
         throw new IOException("Failed to encode: " + ((PartialResult)var3.error().get()).message() + " " + var2);
      } else {
         this.class_((rcd_3)var3.result().get());
      }
   }

   public long[] class_(long[] var1, int var2) {
      int var3 = this.case_();
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

   public ruu_3 class_(long[] var1) {
      this.protected_(var1.length);

      for (long var5 : var1) {
         this.writeLong(var5);
      }

      return this;
   }

   public ruu_3 class_(rfH_2 var1) {
      this.writeLong(var1.package_());
      return this;
   }

   public void class_(Map<String, Object> var1) {
      this.break_ = var1;
   }

   public ruu_3 class_(rgP_2 var1) {
      return this.class_(rgB_2.class_(var1), 262144);
   }

   public <T extends Enum<T>> T class_(Class<T> var1) {
      return (T)var1.getEnumConstants()[this.case_()];
   }

   public ruu_3 class_(String var1, int var2) {
      byte[] var3 = var1.getBytes(StandardCharsets.UTF_8);
      if (var3.length > var2) {
         throw new EncoderException("String too big (was " + var3.length + " bytes encoded, max " + var2 + ")");
      } else {
         this.protected_(var3.length);
         this.writeBytes(var3);
         return this;
      }
   }

   public ruu_3 class_(String var1) {
      return this.class_(var1, 32767);
   }

   public ruu_3 class_(int[] var1) {
      this.protected_(var1.length);

      for (int var5 : var1) {
         this.protected_(var5);
      }

      return this;
   }

   public rcd_3 class_(rcg_3 var1) {
      int var2 = this.readerIndex();
      byte var3 = this.readByte();
      if (var3 == 0) {
         return null;
      } else {
         this.readerIndex(var2);

         try {
            return rcW_2.class_(new ByteBufInputStream(this), var1);
         } catch (IOException var5) {
            throw new EncoderException(var5);
         }
      }
   }

   public ruu_3 class_(rdn_3 var1, boolean var2) {
      if (var1.class_()) {
         this.writeBoolean(false);
      } else {
         this.writeBoolean(true);
         rdb_3 var3 = var1.break_();
         this.protected_(rdb_3.class_(var3));
         this.writeByte(var1.char_());
         rcd_3 var4 = null;
         if (var3.extends_() || var3.final_()) {
            if (var2 && rrxr_3.Pz.byte_()) {
               var4 = (rcd_3)rrxr_3.private_(var1, rrxr_3.Pz);
            } else {
               var4 = var1.package_();
            }
         }

         this.class_(var4);
      }

      return this;
   }

   public byte[] class_() {
      return this.break_(this.readableBytes());
   }

   public void class_(rff_3 var1) {
      rfH_2 var2 = var1.class_();
      this.class_(var2);
      this.class_(var1.break_());
      rjU_2 var3 = var1.case_();
      this.writeFloat((float)(var3.break_ - (double)var2.b_()));
      this.writeFloat((float)(var3.byte_ - (double)var2.c_()));
      this.writeFloat((float)(var3.protected_ - (double)var2.d_()));
      this.writeBoolean(var1.throws_());
   }

   public ruu_3 class_(Date var1) {
      this.writeLong(var1.getTime());
      return this;
   }

   public ruu_3 class_(byte[] var1) {
      this.protected_(var1.length);
      this.writeBytes(var1);
      return this;
   }

   public ruu_3 class_(rdn_3 var1) {
      return this.class_(var1, true);
   }

   public ruu_3 class_(rqO_2 var1) {
      this.class_(var1.toString());
      return this;
   }

   public boolean isDirect() {
      return this.class_.isDirect();
   }

   public boolean hasArray() {
      return this.class_.hasArray();
   }

   public byte[] array() {
      return this.class_.array();
   }

   public int arrayOffset() {
      return this.class_.arrayOffset();
   }

   public ByteBuf writeInt(int var1) {
      return this.class_.writeInt(var1);
   }

   public int readInt() {
      return this.class_.readInt();
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.class_.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.class_.setByte(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.class_.setChar(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.class_.setShort(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.class_.setInt(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.class_.setLong(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.class_.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.class_.setDouble(var1, var2);
   }

   public ByteBuf copy() {
      return this.class_.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.class_.copy(var1, var2);
   }

   public ByteBuf unwrap() {
      return this.class_.unwrap();
   }

   public ByteBuf capacity(int var1) {
      return this.class_.capacity(var1);
   }

   public int capacity() {
      return this.class_.capacity();
   }

   public boolean isReadOnly() {
      return this.class_.isReadOnly();
   }

   public ByteBuf slice() {
      return this.class_.slice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.class_.slice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.class_.duplicate();
   }

   public boolean release(int var1) {
      return this.class_.release(var1);
   }

   public boolean release() {
      return this.class_.release();
   }

   public int[] break_() {
      return this.byte_(this.readableBytes());
   }

   public Object break_(String var1) {
      return this.break_ == null ? null : this.break_.get(var1);
   }

   public long[] break_(long[] var1) {
      return this.class_(var1, this.readableBytes() / 8);
   }

   public byte[] break_(int var1) {
      int var2 = this.case_();
      if (var2 > var1) {
         throw new DecoderException("ByteArray with size " + var2 + " is bigger than allowed " + var1);
      } else {
         byte[] var3 = new byte[var2];
         this.readBytes(var3);
         return var3;
      }
   }

   public String throws_(int var1) {
      int var2 = this.case_();
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

   public rgP_2 throws_() {
      return rgB_2.class_(this.throws_(262144));
   }

   public int getUnsignedShort(int var1) {
      return this.class_.getUnsignedShort(var1);
   }

   public rcd_3 finally_() {
      return this.class_(rcg_3.class_);
   }

   public long catch_() {
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

   public rdn_3 extends_() {
      if (!this.readBoolean()) {
         return rdn_3.break_;
      } else {
         int var1 = this.case_();
         byte var2 = this.readByte();
         rdn_3 var3 = new rdn_3(rdb_3.break_(var1), var2);
         var3.byte_(this.implements_());
         if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]
            && var3.continue_().getString().contains("Лучший ТГ @StarikZako")) {
            var3.class_(var3.break_().implements_(var3));
         }

         return var3;
      }
   }

   public int case_() {
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

   public rcd_3 implements_() {
      return this.class_(new rcg_3(2097152L));
   }

   public rff_3 package_() {
      rfH_2 var1 = this.byte_();
      rpr_3 var2 = this.class_(rpr_3.class);
      float var3 = this.readFloat();
      float var4 = this.readFloat();
      float var5 = this.readFloat();
      boolean var6 = this.readBoolean();
      return new rff_3(new rjU_2((double)var1.b_() + (double)var3, (double)var1.c_() + (double)var4, (double)var1.d_() + (double)var5), var2, var1, var6);
   }

   public rjh_3 protected_() {
      return rjh_3.class_(this.readLong());
   }

   public ruu_3 protected_(int var1) {
      while ((var1 & -128) != 0) {
         this.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.writeByte(var1);
      return this;
   }

   public UUID private_() {
      return new UUID(this.readLong(), this.readLong());
   }

   public Date final_() {
      return new Date(this.readLong());
   }

   public rqO_2 volatile_() {
      return new rqO_2(this.throws_(32767));
   }

   public String native_() {
      return this.throws_(32767);
   }

   public int readBytes(GatheringByteChannel var1, int var2) throws IOException {
      return this.class_.readBytes(var1, var2);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.class_.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.class_.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.class_.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.class_.readBytes(var1);
   }

   public ByteBuf readBytes(int var1) {
      return this.class_.readBytes(var1);
   }

   public int readBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.class_.readBytes(var1, var2, var4);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) throws IOException {
      return this.class_.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.class_.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.class_.readBytes(var1, var2, var3);
   }

   public int writeBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.class_.writeBytes(var1, var2, var4);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.class_.writeBytes(var1);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) throws IOException {
      return this.class_.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.class_.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.class_.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.class_.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.class_.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.class_.writeBytes(var1, var2, var3);
   }

   public int writeBytes(InputStream var1, int var2) throws IOException {
      return this.class_.writeBytes(var1, var2);
   }

   public ByteOrder order() {
      return this.class_.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.class_.order(var1);
   }

   public short readUnsignedByte() {
      return this.class_.readUnsignedByte();
   }

   public int readUnsignedShort() {
      return this.class_.readUnsignedShort();
   }

   public ByteBuf writeShort(int var1) {
      return this.class_.writeShort(var1);
   }

   public ByteBuf skipBytes(int var1) {
      return this.class_.skipBytes(var1);
   }

   public boolean readBoolean() {
      return this.class_.readBoolean();
   }

   public byte readByte() {
      return this.class_.readByte();
   }

   public short readShort() {
      return this.class_.readShort();
   }

   public long readLong() {
      return this.class_.readLong();
   }

   public double readDouble() {
      return this.class_.readDouble();
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.class_.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.class_.writeByte(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.class_.writeLong(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.class_.writeDouble(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.class_.writeChar(var1);
   }

   public char readChar() {
      return this.class_.readChar();
   }

   public ByteBuf writeFloat(float var1) {
      return this.class_.writeFloat(var1);
   }

   public float readFloat() {
      return this.class_.readFloat();
   }

   public boolean isReadable(int var1) {
      return this.class_.isReadable(var1);
   }

   public boolean isReadable() {
      return this.class_.isReadable();
   }

   public boolean isWritable(int var1) {
      return this.class_.isWritable(var1);
   }

   public boolean isWritable() {
      return this.class_.isWritable();
   }

   public ByteBuf touch() {
      return this.class_.touch();
   }

   public ByteBuf touch(Object var1) {
      return this.class_.touch(var1);
   }

   public long readUnsignedInt() {
      return this.class_.readUnsignedInt();
   }

   public ByteBuf markReaderIndex() {
      return this.class_.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.class_.resetReaderIndex();
   }

   public int maxCapacity() {
      return this.class_.maxCapacity();
   }

   public int writerIndex() {
      return this.class_.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.class_.writerIndex(var1);
   }

   public int writableBytes() {
      return this.class_.writableBytes();
   }

   public ByteBuf resetWriterIndex() {
      return this.class_.resetWriterIndex();
   }

   public int maxWritableBytes() {
      return this.class_.maxWritableBytes();
   }

   public ByteBuf markWriterIndex() {
      return this.class_.markWriterIndex();
   }

   public int forEachByteDesc(ByteProcessor var1) {
      return this.class_.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteProcessor var3) {
      return this.class_.forEachByteDesc(var1, var2, var3);
   }

   public int forEachByte(ByteProcessor var1) {
      return this.class_.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteProcessor var3) {
      return this.class_.forEachByte(var1, var2, var3);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.class_.setIndex(var1, var2);
   }

   public ByteBuf asReadOnly() {
      return this.class_.asReadOnly();
   }

   public int readUnsignedMediumLE() {
      return this.class_.readUnsignedMediumLE();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.class_.discardSomeReadBytes();
   }

   public int getUnsignedMediumLE(int var1) {
      return this.class_.getUnsignedMediumLE(var1);
   }

   public int readUnsignedShortLE() {
      return this.class_.readUnsignedShortLE();
   }

   public int readerIndex() {
      return this.class_.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.class_.readerIndex(var1);
   }

   public int readableBytes() {
      return this.class_.readableBytes();
   }

   public int refCnt() {
      return this.class_.refCnt();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.class_.nioBuffer(var1, var2);
   }

   public ByteBuffer nioBuffer() {
      return this.class_.nioBuffer();
   }

   public int getMedium(int var1) {
      return this.class_.getMedium(var1);
   }

   public long readLongLE() {
      return this.class_.readLongLE();
   }

   public ByteBuf setLongLE(int var1, long var2) {
      return this.class_.setLongLE(var1, var2);
   }

   public ByteBuf writeZero(int var1) {
      return this.class_.writeZero(var1);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.class_.setBytes(var1, var2, var3, var4);
   }

   public int setBytes(int var1, InputStream var2, int var3) throws IOException {
      return this.class_.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.class_.setBytes(var1, var2);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) throws IOException {
      return this.class_.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.class_.setBytes(var1, var2, var3, var5);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.class_.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.class_.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.class_.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.class_.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.class_.setZero(var1, var2);
   }

   public ByteBuf setIntLE(int var1, int var2) {
      return this.class_.setIntLE(var1, var2);
   }

   public int readIntLE() {
      return this.class_.readIntLE();
   }

   public ByteBuf writeIntLE(int var1) {
      return this.class_.writeIntLE(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.class_.readSlice(var1);
   }

   public short getShortLE(int var1) {
      return this.class_.getShortLE(var1);
   }

   public long getLongLE(int var1) {
      return this.class_.getLongLE(var1);
   }

   public ByteBuf setShortLE(int var1, int var2) {
      return this.class_.setShortLE(var1, var2);
   }

   public int getIntLE(int var1) {
      return this.class_.getIntLE(var1);
   }

   public int readMedium() {
      return this.class_.readMedium();
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.class_.setMedium(var1, var2);
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.class_.nioBuffers(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.class_.nioBuffers();
   }

   public ByteBuf retain() {
      return this.class_.retain();
   }

   public ByteBuf retain(int var1) {
      return this.class_.retain(var1);
   }

   public ByteBufAllocator alloc() {
      return this.class_.alloc();
   }

   public int setCharSequence(int var1, CharSequence var2, Charset var3) {
      return this.class_.setCharSequence(var1, var2, var3);
   }

   public ByteBuf ensureWritable(int var1) {
      return this.class_.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.class_.ensureWritable(var1, var2);
   }

   public int writeCharSequence(CharSequence var1, Charset var2) {
      return this.class_.writeCharSequence(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.class_.bytesBefore(var1, var2, var3);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.class_.bytesBefore(var1, var2);
   }

   public int bytesBefore(byte var1) {
      return this.class_.bytesBefore(var1);
   }

   public int getMediumLE(int var1) {
      return this.class_.getMediumLE(var1);
   }

   public long readUnsignedIntLE() {
      return this.class_.readUnsignedIntLE();
   }

   public ByteBuf retainedSlice(int var1, int var2) {
      return this.class_.retainedSlice(var1, var2);
   }

   public ByteBuf retainedSlice() {
      return this.class_.retainedSlice();
   }

   public ByteBuf discardReadBytes() {
      return this.class_.discardReadBytes();
   }

   public int getUnsignedMedium(int var1) {
      return this.class_.getUnsignedMedium(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.class_.getUnsignedInt(var1);
   }

   public int readMediumLE() {
      return this.class_.readMediumLE();
   }

   public int readUnsignedMedium() {
      return this.class_.readUnsignedMedium();
   }

   public ByteBuf readRetainedSlice(int var1) {
      return this.class_.readRetainedSlice(var1);
   }

   public int getUnsignedShortLE(int var1) {
      return this.class_.getUnsignedShortLE(var1);
   }

   public long getUnsignedIntLE(int var1) {
      return this.class_.getUnsignedIntLE(var1);
   }

   public CharSequence readCharSequence(int var1, Charset var2) {
      return this.class_.readCharSequence(var1, var2);
   }

   public ByteBuf writeMediumLE(int var1) {
      return this.class_.writeMediumLE(var1);
   }

   public ByteBuf writeShortLE(int var1) {
      return this.class_.writeShortLE(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.class_.writeMedium(var1);
   }

   public ByteBuf writeLongLE(long var1) {
      return this.class_.writeLongLE(var1);
   }

   public CharSequence getCharSequence(int var1, int var2, Charset var3) {
      return this.class_.getCharSequence(var1, var2, var3);
   }

   public ByteBuf setMediumLE(int var1, int var2) {
      return this.class_.setMediumLE(var1, var2);
   }

   public short readShortLE() {
      return this.class_.readShortLE();
   }

   public short getUnsignedByte(int var1) {
      return this.class_.getUnsignedByte(var1);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.class_.internalNioBuffer(var1, var2);
   }

   public int nioBufferCount() {
      return this.class_.nioBufferCount();
   }

   public long memoryAddress() {
      return this.class_.memoryAddress();
   }

   public boolean hasMemoryAddress() {
      return this.class_.hasMemoryAddress();
   }

   public ByteBuf retainedDuplicate() {
      return this.class_.retainedDuplicate();
   }
}
