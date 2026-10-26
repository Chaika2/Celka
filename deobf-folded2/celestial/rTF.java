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
   protected final DynamicOps<T> id_class;

   protected rTF(DynamicOps<T> var1) {
      this.id_class = var1;
   }

   public T remove(T var1, String var2) {
      return (T)this.id_class.remove(var1, var2);
   }

   public T empty() {
      return (T)this.id_class.empty();
   }

   public DataResult<ByteBuffer> getByteBuffer(T var1) {
      return this.id_class.getByteBuffer(var1);
   }

   public T createMap(Stream<Pair<T, T>> var1) {
      return (T)this.id_class.createMap(var1);
   }

   public T createLong(long var1) {
      return (T)this.id_class.createLong(var1);
   }

   public T createString(String var1) {
      return (T)this.id_class.createString(var1);
   }

   public ListBuilder<T> listBuilder() {
      return this.id_class.listBuilder();
   }

   public DataResult<MapLike<T>> getMap(T var1) {
      return this.id_class.getMap(var1);
   }

   public DataResult<LongStream> getLongStream(T var1) {
      return this.id_class.getLongStream(var1);
   }

   public T createBoolean(boolean var1) {
      return (T)this.id_class.createBoolean(var1);
   }

   public T createFloat(float var1) {
      return (T)this.id_class.createFloat(var1);
   }

   public T createDouble(double var1) {
      return (T)this.id_class.createDouble(var1);
   }

   public DataResult<T> mergeToList(T var1, T var2) {
      return this.id_class.mergeToList(var1, var2);
   }

   public DataResult<T> mergeToList(T var1, List<T> var2) {
      return this.id_class.mergeToList(var1, var2);
   }

   public DataResult<Boolean> getBooleanValue(T var1) {
      return this.id_class.getBooleanValue(var1);
   }

   public T createShort(short var1) {
      return (T)this.id_class.createShort(var1);
   }

   public DataResult<IntStream> getIntStream(T var1) {
      return this.id_class.getIntStream(var1);
   }

   public boolean compressMaps() {
      return this.id_class.compressMaps();
   }

   public T createLongList(LongStream var1) {
      return (T)this.id_class.createLongList(var1);
   }

   public DataResult<String> getStringValue(T var1) {
      return this.id_class.getStringValue(var1);
   }

   public T createByteList(ByteBuffer var1) {
      return (T)this.id_class.createByteList(var1);
   }

   public DataResult<Number> getNumberValue(T var1) {
      return this.id_class.getNumberValue(var1);
   }

   public T createIntList(IntStream var1) {
      return (T)this.id_class.createIntList(var1);
   }

   public RecordBuilder<T> mapBuilder() {
      return this.id_class.mapBuilder();
   }

   public T createByte(byte var1) {
      return (T)this.id_class.createByte(var1);
   }

   public DataResult<T> mergeToMap(T var1, MapLike<T> var2) {
      return this.id_class.mergeToMap(var1, var2);
   }

   public DataResult<T> mergeToMap(T var1, T var2, T var3) {
      return this.id_class.mergeToMap(var1, var2, var3);
   }

   public T createInt(int var1) {
      return (T)this.id_class.createInt(var1);
   }

   public DataResult<Stream<T>> getStream(T var1) {
      return this.id_class.getStream(var1);
   }

   public DataResult<Consumer<Consumer<T>>> getList(T var1) {
      return this.id_class.getList(var1);
   }

   public <U> U convertTo(DynamicOps<U> var1, T var2) {
      return (U)this.id_class.convertTo(var1, var2);
   }

   public DataResult<Stream<Pair<T, T>>> getMapValues(T var1) {
      return this.id_class.getMapValues(var1);
   }

   public T createNumeric(Number var1) {
      return (T)this.id_class.createNumeric(var1);
   }

   public DataResult<Consumer<BiConsumer<T, T>>> getMapEntries(T var1) {
      return this.id_class.getMapEntries(var1);
   }

   public T createList(Stream<T> var1) {
      return (T)this.id_class.createList(var1);
   }
}
