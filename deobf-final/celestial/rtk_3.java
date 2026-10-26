package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

class rtk_3 {
   private final rpf_3<Dynamic<?>> break_ = new rpf_3<>(32);
   private final List<Dynamic<?>> byte_;
   private final Dynamic<?> protected_;
   private final boolean throws_;
   final Int2ObjectMap<IntList> case_ = new Int2ObjectLinkedOpenHashMap();
   final IntList catch_ = new IntArrayList();
   public final int class_;
   private final Set<Dynamic<?>> private_ = Sets.newIdentityHashSet();
   private final int[] implements_ = new int[4096];

   public rtk_3(Dynamic<?> var1) {
      this.byte_ = Lists.newArrayList();
      this.protected_ = var1;
      this.class_ = var1.get("Y").asInt(0);
      this.throws_ = var1.get("Blocks").result().isPresent();
   }

   private void class_(int var1, int var2) {
      Object var3 = (IntList)this.case_.get(var1);
      if (var3 == null) {
         var3 = new IntArrayList();
         this.case_.put(var1, var3);
      }

      var3.add(var2);
   }

   public Dynamic<?> class_() {
      Dynamic var1 = this.protected_;
      if (!this.throws_) {
         return var1;
      } else {
         var1 = var1.set("Palette", var1.createList(this.byte_.stream()));
         int var2 = Math.max(4, DataFixUtils.ceillog2(this.private_.size()));
         ryv_3 var3 = new ryv_3(var2, 4096);

         for (int var4 = 0; var4 < this.implements_.length; var4++) {
            var3.class_(var4, this.implements_[var4]);
         }

         var1 = var1.set("BlockStates", var1.createLongList(Arrays.stream(var3.class_())));
         var1 = var1.remove("Blocks");
         var1 = var1.remove("Data");
         return var1.remove("Add");
      }
   }

   public Dynamic<?> class_(int var1) {
      if (var1 >= 0 && var1 <= 4095) {
         Dynamic var2 = this.break_.class_(this.implements_[var1]);
         return var2 == null ? rtO_2.else_ : var2;
      } else {
         return rtO_2.else_;
      }
   }

   public void class_(int var1, Dynamic<?> var2) {
      if (this.private_.add(var2)) {
         this.byte_.add("%%FILTER_ME%%".equals(rtO_2.class_(var2)) ? rtO_2.else_ : var2);
      }

      this.implements_[var1] = rtO_2.class_(this.break_, var2);
   }

   public int break_(int var1) {
      if (!this.throws_) {
         return var1;
      } else {
         ByteBuffer var2 = (ByteBuffer)this.protected_.get("Blocks").asByteBufferOpt().result().get();
         rtd_3 var3 = this.protected_.get("Data").asByteBufferOpt().map(var0 -> new rtd_3(DataFixUtils.toArray(var0))).result().orElseGet(rtd_3::new);
         rtd_3 var4 = this.protected_.get("Add").asByteBufferOpt().map(var0 -> new rtd_3(DataFixUtils.toArray(var0))).result().orElseGet(rtd_3::new);
         this.private_.add(rtO_2.else_);
         rtO_2.class_(this.break_, rtO_2.else_);
         this.byte_.add(rtO_2.else_);

         for (int var5 = 0; var5 < 4096; var5++) {
            int var6 = var5 & 15;
            int var7 = var5 >> 8 & 15;
            int var8 = var5 >> 4 & 15;
            int var9 = var4.class_(var6, var7, var8) << 12 | (var2.get(var5) & 255) << 4 | var3.class_(var6, var7, var8);
            if (rtO_2.byte_.get(var9 >> 4)) {
               this.class_(var9 >> 4, var5);
            }

            if (rtO_2.break_.get(var9 >> 4)) {
               int var10 = rtO_2.class_(var6 == 0, var6 == 15, var8 == 0, var8 == 15);
               if (var10 == 0) {
                  this.catch_.add(var5);
               } else {
                  var1 |= var10;
               }
            }

            this.class_(var5, rtS_2.break_(var9));
         }

         return var1;
      }
   }
}
