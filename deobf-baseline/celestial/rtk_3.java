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
   private final rpf_3<Dynamic<?>> id_break = new rpf_3<>(32);
   private final List<Dynamic<?>> id_byte;
   private final Dynamic<?> id_protected;
   private final boolean id_throws;
   final Int2ObjectMap<IntList> id_case = new Int2ObjectLinkedOpenHashMap();
   final IntList id_catch = new IntArrayList();
   public final int id_class;
   private final Set<Dynamic<?>> id_private = Sets.newIdentityHashSet();
   private final int[] id_implements = new int[4096];

   public rtk_3(Dynamic<?> var1) {
      this.id_byte = Lists.newArrayList();
      this.id_protected = var1;
      this.id_class = var1.get("Y").asInt(0);
      this.id_throws = var1.get("Blocks").result().isPresent();
   }

   private void id_class(int var1, int var2) {
      Object var3 = (IntList)this.id_case.get(var1);
      if (var3 == null) {
         var3 = new IntArrayList();
         this.id_case.put(var1, var3);
      }

      var3.add(var2);
   }

   public Dynamic<?> id_class() {
      Dynamic var1 = this.id_protected;
      if (!this.id_throws) {
         return var1;
      } else {
         var1 = var1.set("Palette", var1.createList(this.id_byte.stream()));
         int var2 = Math.max(4, DataFixUtils.ceillog2(this.id_private.size()));
         ryv_3 var3 = new ryv_3(var2, 4096);

         for (int var4 = 0; var4 < this.id_implements.length; var4++) {
            var3.id_class(var4, this.id_implements[var4]);
         }

         var1 = var1.set("BlockStates", var1.createLongList(Arrays.stream(var3.id_class())));
         var1 = var1.remove("Blocks");
         var1 = var1.remove("Data");
         return var1.remove("Add");
      }
   }

   public Dynamic<?> id_class(int var1) {
      if (var1 >= 0 && var1 <= 4095) {
         Dynamic var2 = this.id_break.id_class(this.id_implements[var1]);
         return var2 == null ? rtO_2.id_else : var2;
      } else {
         return rtO_2.id_else;
      }
   }

   public void id_class(int var1, Dynamic<?> var2) {
      if (this.id_private.add(var2)) {
         this.id_byte.add("%%FILTER_ME%%".equals(rtO_2.id_class(var2)) ? rtO_2.id_else : var2);
      }

      this.id_implements[var1] = rtO_2.id_class(this.id_break, var2);
   }

   public int id_break(int var1) {
      if (!this.id_throws) {
         return var1;
      } else {
         ByteBuffer var2 = (ByteBuffer)this.id_protected.get("Blocks").asByteBufferOpt().result().get();
         rtd_3 var3 = this.id_protected.get("Data").asByteBufferOpt().map(var0 -> new rtd_3(DataFixUtils.toArray(var0))).result().orElseGet(rtd_3::new);
         rtd_3 var4 = this.id_protected.get("Add").asByteBufferOpt().map(var0 -> new rtd_3(DataFixUtils.toArray(var0))).result().orElseGet(rtd_3::new);
         this.id_private.add(rtO_2.id_else);
         rtO_2.id_class(this.id_break, rtO_2.id_else);
         this.id_byte.add(rtO_2.id_else);

         for (int var5 = 0; var5 < 4096; var5++) {
            int var6 = var5 & 15;
            int var7 = var5 >> 8 & 15;
            int var8 = var5 >> 4 & 15;
            int var9 = var4.id_class(var6, var7, var8) << 12 | (var2.get(var5) & 255) << 4 | var3.id_class(var6, var7, var8);
            if (rtO_2.id_byte.get(var9 >> 4)) {
               this.id_class(var9 >> 4, var5);
            }

            if (rtO_2.id_break.get(var9 >> 4)) {
               int var10 = rtO_2.id_class(var6 == 0, var6 == 15, var8 == 0, var8 == 15);
               if (var10 == 0) {
                  this.id_catch.add(var5);
               } else {
                  var1 |= var10;
               }
            }

            this.id_class(var5, rtS_2.id_break(var9));
         }

         return var1;
      }
   }
}
