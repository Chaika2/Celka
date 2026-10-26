/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.ListBuilder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
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

public abstract class rTF<T>
implements DynamicOps<T> {
    protected final DynamicOps<T> id_class;

    protected rTF(DynamicOps<T> dynamicOps) {
        this.id_class = dynamicOps;
    }

    public T remove(T t, String string) {
        return (T)this.id_class.remove(t, string);
    }

    public T empty() {
        return (T)this.id_class.empty();
    }

    public DataResult<ByteBuffer> getByteBuffer(T t) {
        return this.id_class.getByteBuffer(t);
    }

    public T createMap(Stream<Pair<T, T>> stream) {
        return (T)this.id_class.createMap(stream);
    }

    public T createLong(long l) {
        return (T)this.id_class.createLong(l);
    }

    public T createString(String string) {
        return (T)this.id_class.createString(string);
    }

    public ListBuilder<T> listBuilder() {
        return this.id_class.listBuilder();
    }

    public DataResult<MapLike<T>> getMap(T t) {
        return this.id_class.getMap(t);
    }

    public DataResult<LongStream> getLongStream(T t) {
        return this.id_class.getLongStream(t);
    }

    public T createBoolean(boolean bl) {
        return (T)this.id_class.createBoolean(bl);
    }

    public T createFloat(float f) {
        return (T)this.id_class.createFloat(f);
    }

    public T createDouble(double d) {
        return (T)this.id_class.createDouble(d);
    }

    public DataResult<T> mergeToList(T t, T t2) {
        return this.id_class.mergeToList(t, t2);
    }

    public DataResult<T> mergeToList(T t, List<T> list) {
        return this.id_class.mergeToList(t, list);
    }

    public DataResult<Boolean> getBooleanValue(T t) {
        return this.id_class.getBooleanValue(t);
    }

    public T createShort(short s) {
        return (T)this.id_class.createShort(s);
    }

    public DataResult<IntStream> getIntStream(T t) {
        return this.id_class.getIntStream(t);
    }

    public boolean compressMaps() {
        return this.id_class.compressMaps();
    }

    public T createLongList(LongStream longStream) {
        return (T)this.id_class.createLongList(longStream);
    }

    public DataResult<String> getStringValue(T t) {
        return this.id_class.getStringValue(t);
    }

    public T createByteList(ByteBuffer byteBuffer) {
        return (T)this.id_class.createByteList(byteBuffer);
    }

    public DataResult<Number> getNumberValue(T t) {
        return this.id_class.getNumberValue(t);
    }

    public T createIntList(IntStream intStream) {
        return (T)this.id_class.createIntList(intStream);
    }

    public RecordBuilder<T> mapBuilder() {
        return this.id_class.mapBuilder();
    }

    public T createByte(byte by) {
        return (T)this.id_class.createByte(by);
    }

    public DataResult<T> mergeToMap(T t, MapLike<T> mapLike) {
        return this.id_class.mergeToMap(t, mapLike);
    }

    public DataResult<T> mergeToMap(T t, T t2, T t3) {
        return this.id_class.mergeToMap(t, t2, t3);
    }

    public T createInt(int n) {
        return (T)this.id_class.createInt(n);
    }

    public DataResult<Stream<T>> getStream(T t) {
        return this.id_class.getStream(t);
    }

    public DataResult<Consumer<Consumer<T>>> getList(T t) {
        return this.id_class.getList(t);
    }

    public <U> U convertTo(DynamicOps<U> dynamicOps, T t) {
        return (U)this.id_class.convertTo(dynamicOps, t);
    }

    public DataResult<Stream<Pair<T, T>>> getMapValues(T t) {
        return this.id_class.getMapValues(t);
    }

    public T createNumeric(Number number) {
        return (T)this.id_class.createNumeric(number);
    }

    public DataResult<Consumer<BiConsumer<T, T>>> getMapEntries(T t) {
        return this.id_class.getMapEntries(t);
    }

    public T createList(Stream<T> stream) {
        return (T)this.id_class.createList(stream);
    }
}

