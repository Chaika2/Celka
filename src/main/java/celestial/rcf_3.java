/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.PeekingIterator
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
package celestial;

import celestial.rcD_2;
import celestial.rcK_2;
import celestial.rcL_2;
import celestial.rcM_2;
import celestial.rcN_2;
import celestial.rcV_2;
import celestial.rcZ_2;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rch_3;
import celestial.rcj_3;
import celestial.rcn_3;
import celestial.rcq_3;
import celestial.rct_3;
import celestial.rcu_3;
import celestial.rcx_3;
import celestial.rcy_3;
import celestial.rcz_3;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.PeekingIterator;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class rcf_3
implements DynamicOps<rcZ_2> {
    public static final rcf_3 id_class = new rcf_3();

    public DataResult<Stream<Pair<rcZ_2, rcZ_2>>> id_byte(rcZ_2 rcZ_22) {
        if (!(rcZ_22 instanceof rcd_3)) {
            return DataResult.error((String)("Not a map: " + rcZ_22));
        }
        rcd_3 rcd_32 = (rcd_3)rcZ_22;
        return DataResult.success(rcd_32.id_protected().stream().map(string -> Pair.of((Object)this.id_class((String)string), (Object)rcd_32.id_byte((String)string))));
    }

    protected rcf_3() {
    }

    public /* synthetic */ Object remove(Object object, String string) {
        return this.id_class((rcZ_2)object, string);
    }

    public String toString() {
        return "NBT";
    }

    public rcZ_2 id_class(byte by) {
        return rch_3.id_class(by);
    }

    public rcZ_2 id_class() {
        return rcN_2.id_break;
    }

    public DataResult<Number> id_class(rcZ_2 rcZ_22) {
        return rcZ_22 instanceof rcK_2 ? DataResult.success((Object)((rcK_2)rcZ_22).id_extends()) : DataResult.error((String)"Not a number");
    }

    public rcZ_2 id_class(Stream<Pair<rcZ_2, rcZ_2>> stream) {
        rcd_3 rcd_32 = new rcd_3();
        stream.forEach(pair -> rcd_32.id_class(((rcZ_2)pair.getFirst()).id_native(), (rcZ_2)pair.getSecond()));
        return rcd_32;
    }

    public rcZ_2 id_class(ByteBuffer byteBuffer) {
        return new rcM_2(DataFixUtils.toArray((ByteBuffer)byteBuffer));
    }

    public rcZ_2 id_class(IntStream intStream) {
        return new rcL_2(intStream.toArray());
    }

    public rcZ_2 id_class(LongStream longStream) {
        return new rcq_3(longStream.toArray());
    }

    public rcZ_2 id_class(rcZ_2 rcZ_22, String string3) {
        if (rcZ_22 instanceof rcd_3) {
            rcd_3 rcd_32 = (rcd_3)rcZ_22;
            rcd_3 rcd_33 = new rcd_3();
            rcd_32.id_protected().stream().filter(string2 -> !Objects.equals(string2, string3)).forEach(string -> rcd_33.id_class((String)string, rcd_32.id_byte((String)string)));
            return rcd_33;
        }
        return rcZ_22;
    }

    public <U> U id_class(DynamicOps<U> dynamicOps, rcZ_2 rcZ_22) {
        switch (rcZ_22.id_class()) {
            case 0: {
                return (U)dynamicOps.empty();
            }
            case 1: {
                return (U)dynamicOps.createByte(((rcK_2)rcZ_22).id_private());
            }
            case 2: {
                return (U)dynamicOps.createShort(((rcK_2)rcZ_22).id_catch());
            }
            case 3: {
                return (U)dynamicOps.createInt(((rcK_2)rcZ_22).id_case());
            }
            case 4: {
                return (U)dynamicOps.createLong(((rcK_2)rcZ_22).id_throws());
            }
            case 5: {
                return (U)dynamicOps.createFloat(((rcK_2)rcZ_22).id_finally());
            }
            case 6: {
                return (U)dynamicOps.createDouble(((rcK_2)rcZ_22).id_implements());
            }
            case 7: {
                return (U)dynamicOps.createByteList(ByteBuffer.wrap(((rcM_2)rcZ_22).id_protected()));
            }
            case 8: {
                return (U)dynamicOps.createString(rcZ_22.id_native());
            }
            case 9: {
                return (U)this.convertList(dynamicOps, rcZ_22);
            }
            case 10: {
                return (U)this.convertMap(dynamicOps, rcZ_22);
            }
            case 11: {
                return (U)dynamicOps.createIntList(Arrays.stream(((rcL_2)rcZ_22).id_case()));
            }
            case 12: {
                return (U)dynamicOps.createLongList(Arrays.stream(((rcq_3)rcZ_22).id_case()));
            }
        }
        throw new IllegalStateException("Unknown tag type: " + rcZ_22);
    }

    private static /* synthetic */ void id_class(List list, rcd_3 rcd_32, Pair pair) {
        rcZ_2 rcZ_22 = (rcZ_2)pair.getFirst();
        if (!(rcZ_22 instanceof rca_3)) {
            list.add(rcZ_22);
        } else {
            rcd_32.id_class(rcZ_22.id_native(), (rcZ_2)pair.getSecond());
        }
    }

    public rcZ_2 id_class(double d) {
        return rcz_3.id_class(d);
    }

    private static <T extends rcZ_2> void id_class(rcx_3<T> rcx_32, rcZ_2 rcZ_23, List<rcZ_2> list) {
        if (rcZ_23 instanceof rcx_3) {
            rcx_3 rcx_33 = (rcx_3)rcZ_23;
            rcx_33.forEach(rcZ_22 -> rcx_32.add(rcZ_22));
        }
        list.forEach(rcZ_22 -> rcx_32.add(rcZ_22));
    }

    public DataResult<rcZ_2> id_class(rcZ_2 rcZ_22, rcZ_2 rcZ_23) {
        if (!(rcZ_22 instanceof rcx_3) && !(rcZ_22 instanceof rcN_2)) {
            return DataResult.error((String)("mergeToList called with not a list: " + rcZ_22), (Object)rcZ_22);
        }
        rcx_3<?> rcx_32 = rcf_3.id_class(rcZ_22 instanceof rcx_3 ? ((rcx_3)rcZ_22).id_throws() : (byte)0, rcZ_23.id_class());
        rcf_3.id_class(rcx_32, rcZ_22, rcZ_23);
        return DataResult.success(rcx_32);
    }

    public DataResult<rcZ_2> id_class(rcZ_2 rcZ_22, List<rcZ_2> list) {
        if (!(rcZ_22 instanceof rcx_3) && !(rcZ_22 instanceof rcN_2)) {
            return DataResult.error((String)("mergeToList called with not a list: " + rcZ_22), (Object)rcZ_22);
        }
        rcx_3<?> rcx_32 = rcf_3.id_class(rcZ_22 instanceof rcx_3 ? ((rcx_3)rcZ_22).id_throws() : (byte)0, list.stream().findFirst().map(rcZ_2::id_class).orElse((byte)0));
        rcf_3.id_class(rcx_32, rcZ_22, list);
        return DataResult.success(rcx_32);
    }

    public DataResult<rcZ_2> id_class(rcZ_2 rcZ_22, rcZ_2 rcZ_23, rcZ_2 rcZ_24) {
        if (!(rcZ_22 instanceof rcd_3) && !(rcZ_22 instanceof rcN_2)) {
            return DataResult.error((String)("mergeToMap called with not a map: " + rcZ_22), (Object)rcZ_22);
        }
        if (!(rcZ_23 instanceof rca_3)) {
            return DataResult.error((String)("key is not a string: " + rcZ_23), (Object)rcZ_22);
        }
        rcd_3 rcd_32 = new rcd_3();
        if (rcZ_22 instanceof rcd_3) {
            rcd_3 rcd_33 = (rcd_3)rcZ_22;
            rcd_33.id_protected().forEach(string -> rcd_32.id_class((String)string, rcd_33.id_byte((String)string)));
        }
        rcd_32.id_class(rcZ_23.id_native(), rcZ_24);
        return DataResult.success((Object)rcd_32);
    }

    public rcZ_2 id_class(String string) {
        return rca_3.id_class(string);
    }

    private static rcx_3<?> id_class(byte by, byte by2) {
        if (rcf_3.id_class(by, by2, (byte)4)) {
            return new rcq_3(new long[0]);
        }
        if (rcf_3.id_class(by, by2, (byte)1)) {
            return new rcM_2(new byte[0]);
        }
        return rcf_3.id_class(by, by2, (byte)3) ? new rcL_2(new int[0]) : new rcy_3();
    }

    private static boolean id_class(byte by, byte by2, byte by3) {
        return by == by3 && (by2 == by3 || by2 == 0);
    }

    private static <T extends rcZ_2> void id_class(rcx_3<T> rcx_32, rcZ_2 rcZ_23, rcZ_2 rcZ_24) {
        if (rcZ_23 instanceof rcx_3) {
            rcx_3 rcx_33 = (rcx_3)rcZ_23;
            rcx_33.forEach(rcZ_22 -> rcx_32.add(rcZ_22));
        }
        rcx_32.add(rcZ_24);
    }

    public rcZ_2 id_class(boolean bl) {
        return rch_3.id_class(bl);
    }

    public rcZ_2 id_class(Number number) {
        return rcz_3.id_class(number.doubleValue());
    }

    public rcZ_2 id_class(short s) {
        return rcD_2.id_class(s);
    }

    public rcZ_2 id_class(float f) {
        return rcu_3.id_class(f);
    }

    public rcZ_2 id_class(long l) {
        return rct_3.id_class(l);
    }

    public rcZ_2 id_class(int n) {
        return rcn_3.id_class(n);
    }

    public DataResult<rcZ_2> id_class(rcZ_2 rcZ_22, MapLike<rcZ_2> mapLike) {
        Object object;
        if (!(rcZ_22 instanceof rcd_3) && !(rcZ_22 instanceof rcN_2)) {
            return DataResult.error((String)("mergeToMap called with not a map: " + rcZ_22), (Object)rcZ_22);
        }
        rcd_3 rcd_32 = new rcd_3();
        if (rcZ_22 instanceof rcd_3) {
            object = (rcd_3)rcZ_22;
            ((rcd_3)object).id_protected().forEach(arg_0 -> rcf_3.id_break(rcd_32, (rcd_3)object, arg_0));
        }
        object = Lists.newArrayList();
        mapLike.entries().forEach(arg_0 -> rcf_3.id_class((List)object, rcd_32, arg_0));
        return !object.isEmpty() ? DataResult.error((String)("some keys are not strings: " + (List)object), (Object)rcd_32) : DataResult.success((Object)rcd_32);
    }

    public /* synthetic */ Object empty() {
        return this.id_class();
    }

    public /* synthetic */ DataResult getByteBuffer(Object object) {
        return this.id_private((rcZ_2)object);
    }

    public /* synthetic */ Object createMap(Stream stream) {
        return this.id_class(stream);
    }

    public /* synthetic */ Object createLong(long l) {
        return this.id_class(l);
    }

    public /* synthetic */ Object createString(String string) {
        return this.id_class(string);
    }

    private static /* synthetic */ void id_break(rcd_3 rcd_32, rcd_3 rcd_33, String string) {
        rcd_32.id_class(string, rcd_33.id_byte(string));
    }

    public rcZ_2 id_break(Stream<rcZ_2> stream) {
        PeekingIterator peekingIterator = Iterators.peekingIterator(stream.iterator());
        if (!peekingIterator.hasNext()) {
            return new rcy_3();
        }
        rcZ_2 rcZ_23 = (rcZ_2)peekingIterator.peek();
        if (rcZ_23 instanceof rch_3) {
            ArrayList arrayList = Lists.newArrayList((Iterator)Iterators.transform((Iterator)peekingIterator, rcZ_22 -> ((rch_3)rcZ_22).id_private()));
            return new rcM_2(arrayList);
        }
        if (rcZ_23 instanceof rcn_3) {
            ArrayList arrayList = Lists.newArrayList((Iterator)Iterators.transform((Iterator)peekingIterator, rcZ_22 -> ((rcn_3)rcZ_22).id_case()));
            return new rcL_2(arrayList);
        }
        if (rcZ_23 instanceof rct_3) {
            ArrayList arrayList = Lists.newArrayList((Iterator)Iterators.transform((Iterator)peekingIterator, rcZ_22 -> ((rct_3)rcZ_22).id_throws()));
            return new rcq_3(arrayList);
        }
        rcy_3 rcy_32 = new rcy_3();
        while (peekingIterator.hasNext()) {
            rcZ_2 rcZ_24 = (rcZ_2)peekingIterator.next();
            if (rcZ_24 instanceof rcN_2) continue;
            rcy_32.add(rcZ_24);
        }
        return rcy_32;
    }

    public DataResult<String> id_break(rcZ_2 rcZ_22) {
        return rcZ_22 instanceof rca_3 ? DataResult.success((Object)rcZ_22.id_native()) : DataResult.error((String)"Not a string");
    }

    public DataResult<MapLike<rcZ_2>> id_throws(rcZ_2 rcZ_22) {
        if (!(rcZ_22 instanceof rcd_3)) {
            return DataResult.error((String)("Not a map: " + rcZ_22));
        }
        rcd_3 rcd_32 = (rcd_3)rcZ_22;
        return DataResult.success((Object)new rcj_3(this, rcd_32));
    }

    public DataResult<LongStream> id_finally(rcZ_2 rcZ_22) {
        return rcZ_22 instanceof rcq_3 ? DataResult.success((Object)Arrays.stream(((rcq_3)rcZ_22).id_case())) : super.getLongStream((Object)rcZ_22);
    }

    public DataResult<Consumer<Consumer<rcZ_2>>> id_catch(rcZ_2 rcZ_22) {
        if (rcZ_22 instanceof rcx_3) {
            rcx_3 rcx_32 = (rcx_3)rcZ_22;
            return DataResult.success(rcx_32::forEach);
        }
        return DataResult.error((String)("Not a list: " + rcZ_22));
    }

    public DataResult<Stream<rcZ_2>> id_case(rcZ_2 rcZ_22) {
        return rcZ_22 instanceof rcx_3 ? DataResult.success(((rcx_3)rcZ_22).stream().map(object -> object)) : DataResult.error((String)"Not a list");
    }

    public DataResult<IntStream> id_implements(rcZ_2 rcZ_22) {
        return rcZ_22 instanceof rcL_2 ? DataResult.success((Object)Arrays.stream(((rcL_2)rcZ_22).id_case())) : super.getIntStream((Object)rcZ_22);
    }

    public DataResult<Consumer<BiConsumer<rcZ_2, rcZ_2>>> id_protected(rcZ_2 rcZ_22) {
        if (!(rcZ_22 instanceof rcd_3)) {
            return DataResult.error((String)("Not a map: " + rcZ_22));
        }
        rcd_3 rcd_32 = (rcd_3)rcZ_22;
        return DataResult.success(biConsumer -> rcd_32.id_protected().forEach(string -> biConsumer.accept(this.id_class((String)string), rcd_32.id_byte((String)string))));
    }

    public DataResult<ByteBuffer> id_private(rcZ_2 rcZ_22) {
        return rcZ_22 instanceof rcM_2 ? DataResult.success((Object)ByteBuffer.wrap(((rcM_2)rcZ_22).id_protected())) : super.getByteBuffer((Object)rcZ_22);
    }

    public /* synthetic */ DataResult getMap(Object object) {
        return this.id_throws((rcZ_2)object);
    }

    public /* synthetic */ DataResult getLongStream(Object object) {
        return this.id_finally((rcZ_2)object);
    }

    public /* synthetic */ Object createBoolean(boolean bl) {
        return this.id_class(bl);
    }

    public /* synthetic */ Object createFloat(float f) {
        return this.id_class(f);
    }

    public /* synthetic */ Object createDouble(double d) {
        return this.id_class(d);
    }

    public /* synthetic */ DataResult mergeToList(Object object, List list) {
        return this.id_class((rcZ_2)object, list);
    }

    public /* synthetic */ DataResult mergeToList(Object object, Object object2) {
        return this.id_class((rcZ_2)object, (rcZ_2)object2);
    }

    public /* synthetic */ Object createShort(short s) {
        return this.id_class(s);
    }

    public /* synthetic */ DataResult getIntStream(Object object) {
        return this.id_implements((rcZ_2)object);
    }

    public /* synthetic */ Object createLongList(LongStream longStream) {
        return this.id_class(longStream);
    }

    public /* synthetic */ DataResult getStringValue(Object object) {
        return this.id_break((rcZ_2)object);
    }

    public /* synthetic */ Object createByteList(ByteBuffer byteBuffer) {
        return this.id_class(byteBuffer);
    }

    public /* synthetic */ DataResult getNumberValue(Object object) {
        return this.id_class((rcZ_2)object);
    }

    public /* synthetic */ Object createIntList(IntStream intStream) {
        return this.id_class(intStream);
    }

    public RecordBuilder<rcZ_2> mapBuilder() {
        return new rcV_2(this);
    }

    public /* synthetic */ Object createByte(byte by) {
        return this.id_class(by);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, MapLike mapLike) {
        return this.id_class((rcZ_2)object, (MapLike<rcZ_2>)mapLike);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, Object object2, Object object3) {
        return this.id_class((rcZ_2)object, (rcZ_2)object2, (rcZ_2)object3);
    }

    public /* synthetic */ Object createInt(int n) {
        return this.id_class(n);
    }

    public /* synthetic */ DataResult getStream(Object object) {
        return this.id_case((rcZ_2)object);
    }

    public /* synthetic */ DataResult getList(Object object) {
        return this.id_catch((rcZ_2)object);
    }

    public /* synthetic */ Object convertTo(DynamicOps dynamicOps, Object object) {
        return this.id_class(dynamicOps, (rcZ_2)object);
    }

    public /* synthetic */ DataResult getMapValues(Object object) {
        return this.id_byte((rcZ_2)object);
    }

    public /* synthetic */ Object createNumeric(Number number) {
        return this.id_class(number);
    }

    public /* synthetic */ DataResult getMapEntries(Object object) {
        return this.id_protected((rcZ_2)object);
    }

    public /* synthetic */ Object createList(Stream stream) {
        return this.id_break(stream);
    }
}

