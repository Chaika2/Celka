package celestial;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public abstract class rTF<T> implements DynamicOps<T> {
   protected final DynamicOps<T> class_;

   protected rTF(DynamicOps<T> var1) {
      this.class_ = var1;
   }

   public T remove(T var1, String var2) {
      return (T)this.class_.remove(var1, var2);
   }

   public T empty() {
      return (T)this.class_.empty();
   }

   public DataResult<ByteBuffer> getByteBuffer(T var1) {
      return this.class_.getByteBuffer(var1);
   }

   public T createMap(Stream<Pair<T, T>> var1) {
      return (T)this.class_.createMap(var1);
   }

   public T createLong(long var1) {
      return (T)this.class_.createLong(var1);
   }

   public T createString(String var1) {
      return (T)this.class_.createString(var1);
   }

   public ListBuilder<T> listBuilder() {
      return this.class_.listBuilder();
   }

   public DataResult<MapLike<T>> getMap(T var1) {
      return this.class_.getMap(var1);
   }

   public DataResult<LongStream> getLongStream(T var1) {
      return this.class_.getLongStream(var1);
   }

   public T createBoolean(boolean var1) {
      return (T)this.class_.createBoolean(var1);
   }

   public T createFloat(float var1) {
      return (T)this.class_.createFloat(var1);
   }

   public T createDouble(double var1) {
      return (T)this.class_.createDouble(var1);
   }

   public DataResult<T> mergeToList(T var1, T var2) {
      return this.class_.mergeToList(var1, var2);
   }

   public DataResult<T> mergeToList(T var1, List<T> var2) {
      return this.class_.mergeToList(var1, var2);
   }

   public DataResult<Boolean> getBooleanValue(T var1) {
      return this.class_.getBooleanValue(var1);
   }

   public T createShort(short var1) {
      return (T)this.class_.createShort(var1);
   }

   public DataResult<IntStream> getIntStream(T var1) {
      return this.class_.getIntStream(var1);
   }

   public boolean compressMaps() {
      return this.class_.compressMaps();
   }

   public T createLongList(LongStream var1) {
      return (T)this.class_.createLongList(var1);
   }

   public DataResult<String> getStringValue(T var1) {
      return this.class_.getStringValue(var1);
   }

   public T createByteList(ByteBuffer var1) {
      return (T)this.class_.createByteList(var1);
   }

   public DataResult<Number> getNumberValue(T var1) {
      return this.class_.getNumberValue(var1);
   }

   public T createIntList(IntStream var1) {
      return (T)this.class_.createIntList(var1);
   }

   public RecordBuilder<T> mapBuilder() {
      return this.class_.mapBuilder();
   }

   public T createByte(byte var1) {
      return (T)this.class_.createByte(var1);
   }

   public DataResult<T> mergeToMap(T var1, MapLike<T> var2) {
      return this.class_.mergeToMap(var1, var2);
   }

   public DataResult<T> mergeToMap(T var1, T var2, T var3) {
      return this.class_.mergeToMap(var1, var2, var3);
   }

   public T createInt(int var1) {
      return (T)this.class_.createInt(var1);
   }

   public DataResult<Stream<T>> getStream(T var1) {
      return this.class_.getStream(var1);
   }

   public DataResult<Consumer<Consumer<T>>> getList(T var1) {
      return this.class_.getList(var1);
   }

   public <U> U convertTo(DynamicOps<U> var1, T var2) {
      return (U)this.class_.convertTo(var1, var2);
   }

   public DataResult<Stream<Pair<T, T>>> getMapValues(T var1) {
      return this.class_.getMapValues(var1);
   }

   public T createNumeric(Number var1) {
      return (T)this.class_.createNumeric(var1);
   }

   public DataResult<Consumer<BiConsumer<T, T>>> getMapEntries(T var1) {
      return this.class_.getMapEntries(var1);
   }

   public T createList(Stream<T> var1) {
      return (T)this.class_.createList(var1);
   }
}
