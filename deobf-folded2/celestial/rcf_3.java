package celestial;

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
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class rcf_3 implements DynamicOps<rcZ_2> {
   public static final rcf_3 id_class = new rcf_3();

   public DataResult<Stream<Pair<rcZ_2, rcZ_2>>> id_byte(rcZ_2 var1) {
      return !(var1 instanceof rcd_3 var2)
         ? DataResult.error("Not a map: " + var1)
         : DataResult.success(var2.id_protected().stream().map(var2x -> Pair.of(this.id_class(var2x), var2.id_byte(var2x))));
   }

   protected rcf_3() {
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public rcZ_2 id_class(byte var1) {
      return rch_3.id_class(var1);
   }

   public rcZ_2 id_class() {
      return rcN_2.id_break;
   }

   public DataResult<Number> id_class(rcZ_2 var1) {
      return var1 instanceof rcK_2 ? DataResult.success(((rcK_2)var1).id_extends()) : DataResult.error("Not a number");
   }

   public rcZ_2 id_class(Stream<Pair<rcZ_2, rcZ_2>> var1) {
      rcd_3 var2 = new rcd_3();
      var1.forEach(var1x -> var2.id_class(((rcZ_2)var1x.getFirst()).id_native(), (rcZ_2)var1x.getSecond()));
      return var2;
   }

   public rcZ_2 id_class(ByteBuffer var1) {
      return new rcM_2(DataFixUtils.toArray(var1));
   }

   public rcZ_2 id_class(IntStream var1) {
      return new rcL_2(var1.toArray());
   }

   public rcZ_2 id_class(LongStream var1) {
      return new rcq_3(var1.toArray());
   }

   public rcZ_2 id_class(rcZ_2 var1, String var2) {
      if (var1 instanceof rcd_3 var3) {
         rcd_3 var4 = new rcd_3();
         var3.id_protected().stream().filter(var1x -> !Objects.equals(var1x, var2)).forEach(var2x -> var4.id_class(var2x, var3.id_byte(var2x)));
         return var4;
      } else {
         return var1;
      }
   }

   public <U> U id_class(DynamicOps<U> var1, rcZ_2 var2) {
      switch (var2.id_class()) {
         case 0:
            return (U)var1.empty();
         case 1:
            return (U)var1.createByte(((rcK_2)var2).id_private());
         case 2:
            return (U)var1.createShort(((rcK_2)var2).id_catch());
         case 3:
            return (U)var1.createInt(((rcK_2)var2).id_case());
         case 4:
            return (U)var1.createLong(((rcK_2)var2).id_throws());
         case 5:
            return (U)var1.createFloat(((rcK_2)var2).id_finally());
         case 6:
            return (U)var1.createDouble(((rcK_2)var2).id_implements());
         case 7:
            return (U)var1.createByteList(ByteBuffer.wrap(((rcM_2)var2).id_protected()));
         case 8:
            return (U)var1.createString(var2.id_native());
         case 9:
            return (U)this.convertList(var1, var2);
         case 10:
            return (U)this.convertMap(var1, var2);
         case 11:
            return (U)var1.createIntList(Arrays.stream(((rcL_2)var2).id_case()));
         case 12:
            return (U)var1.createLongList(Arrays.stream(((rcq_3)var2).id_case()));
         default:
            throw new IllegalStateException("Unknown tag type: " + var2);
      }
   }

   public rcZ_2 id_class(double var1) {
      return rcz_3.id_class(var1);
   }

   private static <T extends rcZ_2> void id_class(rcx_3<T> var0, rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcx_3 var3) {
         var3.forEach(var1x -> var0.add((T)var1x));
      }

      var2.forEach(var1x -> var0.add((T)var1x));
   }

   public DataResult<rcZ_2> id_class(rcZ_2 var1, rcZ_2 var2) {
      if (!(var1 instanceof rcx_3) && !(var1 instanceof rcN_2)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         rcx_3 var3 = id_class(var1 instanceof rcx_3 ? ((rcx_3)var1).id_throws() : 0, var2.id_class());
         id_class(var3, var1, var2);
         return DataResult.success(var3);
      }
   }

   public DataResult<rcZ_2> id_class(rcZ_2 var1, List<rcZ_2> var2) {
      if (!(var1 instanceof rcx_3) && !(var1 instanceof rcN_2)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         rcx_3 var3 = id_class(var1 instanceof rcx_3 ? ((rcx_3)var1).id_throws() : 0, var2.stream().findFirst().map(rcZ_2::id_class).orElse((byte)0));
         id_class(var3, var1, var2);
         return DataResult.success(var3);
      }
   }

   public DataResult<rcZ_2> id_class(rcZ_2 var1, rcZ_2 var2, rcZ_2 var3) {
      if (!(var1 instanceof rcd_3) && !(var1 instanceof rcN_2)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else if (!(var2 instanceof rca_3)) {
         return DataResult.error("key is not a string: " + var2, var1);
      } else {
         rcd_3 var4 = new rcd_3();
         if (var1 instanceof rcd_3 var5) {
            var5.id_protected().forEach(var2x -> var4.id_class(var2x, var5.id_byte(var2x)));
         }

         var4.id_class(var2.id_native(), var3);
         return DataResult.success(var4);
      }
   }

   public rcZ_2 id_class(String var1) {
      return rca_3.id_class(var1);
   }

   private static rcx_3<?> id_class(byte var0, byte var1) {
      if (id_class(var0, var1, (byte)4)) {
         return new rcq_3(new long[0]);
      } else if (id_class(var0, var1, (byte)1)) {
         return new rcM_2(new byte[0]);
      } else {
         return (rcx_3<?>)(id_class(var0, var1, (byte)3) ? new rcL_2(new int[0]) : new rcy_3());
      }
   }

   private static boolean id_class(byte var0, byte var1, byte var2) {
      return var0 == var2 && (var1 == var2 || var1 == 0);
   }

   private static <T extends rcZ_2> void id_class(rcx_3<T> var0, rcZ_2 var1, rcZ_2 var2) {
      if (var1 instanceof rcx_3 var3) {
         var3.forEach(var1x -> var0.add((T)var1x));
      }

      var0.add((T)var2);
   }

   public rcZ_2 id_class(boolean var1) {
      return rch_3.id_class(var1);
   }

   public rcZ_2 id_class(Number var1) {
      return rcz_3.id_class(var1.doubleValue());
   }

   public rcZ_2 id_class(short var1) {
      return rcD_2.id_class(var1);
   }

   public rcZ_2 id_class(float var1) {
      return rcu_3.id_class(var1);
   }

   public rcZ_2 id_class(long var1) {
      return rct_3.id_class(var1);
   }

   public rcZ_2 id_class(int var1) {
      return rcn_3.id_class(var1);
   }

   public DataResult<rcZ_2> id_class(rcZ_2 var1, MapLike<rcZ_2> var2) {
      if (!(var1 instanceof rcd_3) && !(var1 instanceof rcN_2)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else {
         rcd_3 var3 = new rcd_3();
         if (var1 instanceof rcd_3 var4) {
            var4.id_protected().forEach(var2x -> var3.id_class(var2x, var4.id_byte(var2x)));
         }

         ArrayList var5 = Lists.newArrayList();
         var2.entries().forEach(var2x -> {
            rcZ_2 var3x = (rcZ_2)var2x.getFirst();
            if (!(var3x instanceof rca_3)) {
               var5.add(var3x);
            } else {
               var3.id_class(var3x.id_native(), (rcZ_2)var2x.getSecond());
            }
         });
         return !var5.isEmpty() ? DataResult.error("some keys are not strings: " + var5, var3) : DataResult.success(var3);
      }
   }

   public rcZ_2 id_break(Stream<rcZ_2> var1) {
      PeekingIterator var2 = Iterators.peekingIterator(var1.iterator());
      if (!var2.hasNext()) {
         return new rcy_3();
      } else {
         rcZ_2 var3 = (rcZ_2)var2.peek();
         if (var3 instanceof rch_3) {
            ArrayList var8 = Lists.newArrayList(Iterators.transform(var2, var0 -> ((rch_3)var0).id_private()));
            return new rcM_2(var8);
         } else if (var3 instanceof rcn_3) {
            ArrayList var7 = Lists.newArrayList(Iterators.transform(var2, var0 -> ((rcn_3)var0).id_case()));
            return new rcL_2(var7);
         } else if (var3 instanceof rct_3) {
            ArrayList var6 = Lists.newArrayList(Iterators.transform(var2, var0 -> ((rct_3)var0).id_throws()));
            return new rcq_3(var6);
         } else {
            rcy_3 var4 = new rcy_3();

            while (var2.hasNext()) {
               rcZ_2 var5 = (rcZ_2)var2.next();
               if (!(var5 instanceof rcN_2)) {
                  var4.add(var5);
               }
            }

            return var4;
         }
      }
   }

   public DataResult<String> id_break(rcZ_2 var1) {
      return var1 instanceof rca_3 ? DataResult.success(var1.id_native()) : DataResult.error("Not a string");
   }

   public DataResult<MapLike<rcZ_2>> id_throws(rcZ_2 var1) {
      return !(var1 instanceof rcd_3 var2) ? DataResult.error("Not a map: " + var1) : DataResult.success(new rcj_3(this, var2));
   }

   public DataResult<LongStream> id_finally(rcZ_2 var1) {
      return var1 instanceof rcq_3 ? DataResult.success(Arrays.stream(((rcq_3)var1).id_case())) : super.getLongStream(var1);
   }

   public DataResult<Consumer<Consumer<rcZ_2>>> id_catch(rcZ_2 var1) {
      return var1 instanceof rcx_3 var2 ? DataResult.success(var2::forEach) : DataResult.error("Not a list: " + var1);
   }

   public DataResult<Stream<rcZ_2>> id_case(rcZ_2 var1) {
      return var1 instanceof rcx_3 ? DataResult.success(((rcx_3)var1).stream().map(var0 -> var0)) : DataResult.error("Not a list");
   }

   public DataResult<IntStream> id_implements(rcZ_2 var1) {
      return var1 instanceof rcL_2 ? DataResult.success(Arrays.stream(((rcL_2)var1).id_case())) : super.getIntStream(var1);
   }

   public DataResult<Consumer<BiConsumer<rcZ_2, rcZ_2>>> id_protected(rcZ_2 var1) {
      return !(var1 instanceof rcd_3 var2)
         ? DataResult.error("Not a map: " + var1)
         : DataResult.success((Consumer<BiConsumer>)var2x -> var2.id_protected().forEach(var3 -> var2x.accept(this.id_class(var3), var2.id_byte(var3))));
   }

   public DataResult<ByteBuffer> id_private(rcZ_2 var1) {
      return var1 instanceof rcM_2 ? DataResult.success(ByteBuffer.wrap(((rcM_2)var1).id_protected())) : super.getByteBuffer(var1);
   }

   public RecordBuilder<rcZ_2> mapBuilder() {
      return new rcV_2(this);
   }
}
