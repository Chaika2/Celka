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
   public static final rcf_3 class_ = new rcf_3();

   public DataResult<Stream<Pair<rcZ_2, rcZ_2>>> byte_(rcZ_2 var1) {
      return !(var1 instanceof rcd_3 var2)
         ? DataResult.error("Not a map: " + var1)
         : DataResult.success(var2.protected_().stream().map(var2x -> Pair.of(this.class_(var2x), var2.byte_(var2x))));
   }

   protected rcf_3() {
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public rcZ_2 class_(byte var1) {
      return rch_3.class_(var1);
   }

   public rcZ_2 class_() {
      return rcN_2.break_;
   }

   public DataResult<Number> class_(rcZ_2 var1) {
      return var1 instanceof rcK_2 ? DataResult.success(((rcK_2)var1).extends_()) : DataResult.error("Not a number");
   }

   public rcZ_2 class_(Stream<Pair<rcZ_2, rcZ_2>> var1) {
      rcd_3 var2 = new rcd_3();
      var1.forEach(var1x -> var2.class_(((rcZ_2)var1x.getFirst()).native_(), (rcZ_2)var1x.getSecond()));
      return var2;
   }

   public rcZ_2 class_(ByteBuffer var1) {
      return new rcM_2(DataFixUtils.toArray(var1));
   }

   public rcZ_2 class_(IntStream var1) {
      return new rcL_2(var1.toArray());
   }

   public rcZ_2 class_(LongStream var1) {
      return new rcq_3(var1.toArray());
   }

   public rcZ_2 class_(rcZ_2 var1, String var2) {
      if (var1 instanceof rcd_3 var3) {
         rcd_3 var4 = new rcd_3();
         var3.protected_().stream().filter(var1x -> !Objects.equals(var1x, var2)).forEach(var2x -> var4.class_(var2x, var3.byte_(var2x)));
         return var4;
      } else {
         return var1;
      }
   }

   public <U> U class_(DynamicOps<U> var1, rcZ_2 var2) {
      switch (var2.class_()) {
         case 0:
            return (U)var1.empty();
         case 1:
            return (U)var1.createByte(((rcK_2)var2).private_());
         case 2:
            return (U)var1.createShort(((rcK_2)var2).catch_());
         case 3:
            return (U)var1.createInt(((rcK_2)var2).case_());
         case 4:
            return (U)var1.createLong(((rcK_2)var2).throws_());
         case 5:
            return (U)var1.createFloat(((rcK_2)var2).finally_());
         case 6:
            return (U)var1.createDouble(((rcK_2)var2).implements_());
         case 7:
            return (U)var1.createByteList(ByteBuffer.wrap(((rcM_2)var2).protected_()));
         case 8:
            return (U)var1.createString(var2.native_());
         case 9:
            return (U)this.convertList(var1, var2);
         case 10:
            return (U)this.convertMap(var1, var2);
         case 11:
            return (U)var1.createIntList(Arrays.stream(((rcL_2)var2).case_()));
         case 12:
            return (U)var1.createLongList(Arrays.stream(((rcq_3)var2).case_()));
         default:
            throw new IllegalStateException("Unknown tag type: " + var2);
      }
   }

   public rcZ_2 class_(double var1) {
      return rcz_3.class_(var1);
   }

   private static <T extends rcZ_2> void class_(rcx_3<T> var0, rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcx_3 var3) {
         var3.forEach(var1x -> var0.add((T)var1x));
      }

      var2.forEach(var1x -> var0.add((T)var1x));
   }

   public DataResult<rcZ_2> class_(rcZ_2 var1, rcZ_2 var2) {
      if (!(var1 instanceof rcx_3) && !(var1 instanceof rcN_2)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         rcx_3 var3 = class_(var1 instanceof rcx_3 ? ((rcx_3)var1).throws_() : 0, var2.class_());
         class_(var3, var1, var2);
         return DataResult.success(var3);
      }
   }

   public DataResult<rcZ_2> class_(rcZ_2 var1, List<rcZ_2> var2) {
      if (!(var1 instanceof rcx_3) && !(var1 instanceof rcN_2)) {
         return DataResult.error("mergeToList called with not a list: " + var1, var1);
      } else {
         rcx_3 var3 = class_(var1 instanceof rcx_3 ? ((rcx_3)var1).throws_() : 0, var2.stream().findFirst().map(rcZ_2::class_).orElse((byte)0));
         class_(var3, var1, var2);
         return DataResult.success(var3);
      }
   }

   public DataResult<rcZ_2> class_(rcZ_2 var1, rcZ_2 var2, rcZ_2 var3) {
      if (!(var1 instanceof rcd_3) && !(var1 instanceof rcN_2)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else if (!(var2 instanceof rca_3)) {
         return DataResult.error("key is not a string: " + var2, var1);
      } else {
         rcd_3 var4 = new rcd_3();
         if (var1 instanceof rcd_3 var5) {
            var5.protected_().forEach(var2x -> var4.class_(var2x, var5.byte_(var2x)));
         }

         var4.class_(var2.native_(), var3);
         return DataResult.success(var4);
      }
   }

   public rcZ_2 class_(String var1) {
      return rca_3.class_(var1);
   }

   private static rcx_3<?> class_(byte var0, byte var1) {
      if (class_(var0, var1, (byte)4)) {
         return new rcq_3(new long[0]);
      } else if (class_(var0, var1, (byte)1)) {
         return new rcM_2(new byte[0]);
      } else {
         return (rcx_3<?>)(class_(var0, var1, (byte)3) ? new rcL_2(new int[0]) : new rcy_3());
      }
   }

   private static boolean class_(byte var0, byte var1, byte var2) {
      return var0 == var2 && (var1 == var2 || var1 == 0);
   }

   private static <T extends rcZ_2> void class_(rcx_3<T> var0, rcZ_2 var1, rcZ_2 var2) {
      if (var1 instanceof rcx_3 var3) {
         var3.forEach(var1x -> var0.add((T)var1x));
      }

      var0.add((T)var2);
   }

   public rcZ_2 class_(boolean var1) {
      return rch_3.class_(var1);
   }

   public rcZ_2 class_(Number var1) {
      return rcz_3.class_(var1.doubleValue());
   }

   public rcZ_2 class_(short var1) {
      return rcD_2.class_(var1);
   }

   public rcZ_2 class_(float var1) {
      return rcu_3.class_(var1);
   }

   public rcZ_2 class_(long var1) {
      return rct_3.class_(var1);
   }

   public rcZ_2 class_(int var1) {
      return rcn_3.class_(var1);
   }

   public DataResult<rcZ_2> class_(rcZ_2 var1, MapLike<rcZ_2> var2) {
      if (!(var1 instanceof rcd_3) && !(var1 instanceof rcN_2)) {
         return DataResult.error("mergeToMap called with not a map: " + var1, var1);
      } else {
         rcd_3 var3 = new rcd_3();
         if (var1 instanceof rcd_3 var4) {
            var4.protected_().forEach(var2x -> var3.class_(var2x, var4.byte_(var2x)));
         }

         ArrayList var5 = Lists.newArrayList();
         var2.entries().forEach(var2x -> {
            rcZ_2 var3x = (rcZ_2)var2x.getFirst();
            if (!(var3x instanceof rca_3)) {
               var5.add(var3x);
            } else {
               var3.class_(var3x.native_(), (rcZ_2)var2x.getSecond());
            }
         });
         return !var5.isEmpty() ? DataResult.error("some keys are not strings: " + var5, var3) : DataResult.success(var3);
      }
   }

   public rcZ_2 break_(Stream<rcZ_2> var1) {
      PeekingIterator var2 = Iterators.peekingIterator(var1.iterator());
      if (!var2.hasNext()) {
         return new rcy_3();
      } else {
         rcZ_2 var3 = (rcZ_2)var2.peek();
         if (var3 instanceof rch_3) {
            ArrayList var8 = Lists.newArrayList(Iterators.transform(var2, var0 -> ((rch_3)var0).private_()));
            return new rcM_2(var8);
         } else if (var3 instanceof rcn_3) {
            ArrayList var7 = Lists.newArrayList(Iterators.transform(var2, var0 -> ((rcn_3)var0).case_()));
            return new rcL_2(var7);
         } else if (var3 instanceof rct_3) {
            ArrayList var6 = Lists.newArrayList(Iterators.transform(var2, var0 -> ((rct_3)var0).throws_()));
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

   public DataResult<String> break_(rcZ_2 var1) {
      return var1 instanceof rca_3 ? DataResult.success(var1.native_()) : DataResult.error("Not a string");
   }

   public DataResult<MapLike<rcZ_2>> throws_(rcZ_2 var1) {
      return !(var1 instanceof rcd_3 var2) ? DataResult.error("Not a map: " + var1) : DataResult.success(new rcj_3(this, var2));
   }

   public DataResult<LongStream> finally_(rcZ_2 var1) {
      return var1 instanceof rcq_3 ? DataResult.success(Arrays.stream(((rcq_3)var1).case_())) : super.getLongStream(var1);
   }

   public DataResult<Consumer<Consumer<rcZ_2>>> catch_(rcZ_2 var1) {
      return var1 instanceof rcx_3 var2 ? DataResult.success(var2::forEach) : DataResult.error("Not a list: " + var1);
   }

   public DataResult<Stream<rcZ_2>> case_(rcZ_2 var1) {
      return var1 instanceof rcx_3 ? DataResult.success(((rcx_3)var1).stream().map(var0 -> var0)) : DataResult.error("Not a list");
   }

   public DataResult<IntStream> implements_(rcZ_2 var1) {
      return var1 instanceof rcL_2 ? DataResult.success(Arrays.stream(((rcL_2)var1).case_())) : super.getIntStream(var1);
   }

   public DataResult<Consumer<BiConsumer<rcZ_2, rcZ_2>>> protected_(rcZ_2 var1) {
      return !(var1 instanceof rcd_3 var2)
         ? DataResult.error("Not a map: " + var1)
         : DataResult.success((Consumer<BiConsumer>)var2x -> var2.protected_().forEach(var3 -> var2x.accept(this.class_(var3), var2.byte_(var3))));
   }

   public DataResult<ByteBuffer> private_(rcZ_2 var1) {
      return var1 instanceof rcM_2 ? DataResult.success(ByteBuffer.wrap(((rcM_2)var1).protected_())) : super.getByteBuffer(var1);
   }

   public RecordBuilder<rcZ_2> mapBuilder() {
      return new rcV_2(this);
   }
}
