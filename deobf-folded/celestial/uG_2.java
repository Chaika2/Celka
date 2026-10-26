package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class uG_2 implements AutoCloseable {
   private static final uE_2 id_class = new uE_2();
   private static final uX_2 id_break = () -> 4.0F;
   private static final Random id_byte = new Random();
   private final fY_2 id_protected;
   private final rqO_2 id_throws;
   private ud_3 id_case;
   private ud_3 id_catch;
   private final List<uc_3> id_private = Lists.newArrayList();
   private final Int2ObjectMap<ud_3> id_implements = new Int2ObjectOpenHashMap();
   private final Int2ObjectMap<uX_2> id_finally = new Int2ObjectOpenHashMap();
   private final Int2ObjectMap<IntList> id_extends = new Int2ObjectOpenHashMap();
   private final List<uO_2> id_native = Lists.newArrayList();

   private void id_byte() {
      for (uO_2 var2 : this.id_native) {
         var2.close();
      }

      this.id_native.clear();
   }

   private uJ_2 id_byte(int var1) {
      for (uc_3 var3 : this.id_private) {
         uJ_2 var4 = var3.id_class(var1);
         if (var4 != null) {
            return var4;
         }
      }

      return us_3.INSTANCE;
   }

   public uG_2(fY_2 var1, rqO_2 var2) {
      this.id_protected = var1;
      this.id_throws = var2;
   }

   public void id_class(List<uc_3> var1) {
      this.id_break();
      this.id_byte();
      this.id_implements.clear();
      this.id_finally.clear();
      this.id_extends.clear();
      this.id_case = this.id_class((uJ_2)us_3.INSTANCE);
      this.id_catch = this.id_class((uJ_2)uW_2.INSTANCE);
      IntOpenHashSet var2 = new IntOpenHashSet();

      for (uc_3 var4 : var1) {
         var2.addAll(var4.id_class());
      }

      HashSet var5 = Sets.newHashSet();
      var2.forEach(var3 -> {
         for (uc_3 var5x : var1) {
            Object var6 = var3 == 32 ? id_break : var5x.id_class(var3);
            if (var6 != null) {
               var5.add(var5x);
               if (var6 != us_3.INSTANCE) {
                  ((IntList)this.id_extends.computeIfAbsent(rfU_2.id_case(((uX_2)var6).id_class(false)), var0 -> new IntArrayList())).add(var3);
               }
               break;
            }
         }
      });
      var1.stream().filter(var5::contains).forEach(this.id_private::add);
   }

   private ud_3 id_class(uJ_2 var1) {
      for (uO_2 var3 : this.id_native) {
         ud_3 var4 = var3.id_class(var1);
         if (var4 != null) {
            return var4;
         }
      }

      uO_2 var5 = new uO_2(new rqO_2(this.id_throws.id_byte(), this.id_throws.id_break() + "/" + this.id_native.size()), var1.id_protected());
      this.id_native.add(var5);
      this.id_protected.id_class(var5.id_class(), var5);
      ud_3 var6 = var5.id_class(var1);
      return var6 == null ? this.id_case : var6;
   }

   public ud_3 id_class() {
      return this.id_catch;
   }

   public ud_3 id_class(uX_2 var1) {
      IntList var2 = (IntList)this.id_extends.get(rfU_2.id_case(var1.id_class(false)));
      return var2 != null && !var2.isEmpty() ? this.id_break(var2.getInt(id_byte.nextInt(var2.size()))) : this.id_case;
   }

   public uX_2 id_class(int var1) {
      Object var2 = (uX_2)this.id_finally.get(var1);
      if (var2 == null) {
         if (var1 == 32) {
            var2 = id_break;
         } else {
            var2 = this.id_byte(var1);
         }

         this.id_finally.put(var1, var2);
      }

      return (uX_2)var2;
   }

   @Override
   public void close() {
      this.id_break();
      this.id_byte();
   }

   public ud_3 id_break(int var1) {
      Object var2 = (ud_3)this.id_implements.get(var1);
      if (var2 == null) {
         if (var1 == 32) {
            var2 = id_class;
         } else {
            var2 = this.id_class(this.id_byte(var1));
         }

         this.id_implements.put(var1, var2);
      }

      return (ud_3)var2;
   }

   private void id_break() {
      for (uc_3 var2 : this.id_private) {
         var2.close();
      }

      this.id_private.clear();
   }
}
