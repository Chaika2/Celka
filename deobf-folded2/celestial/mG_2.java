package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class mG_2 {
   private final List<rkw_3<?>> id_class;
   private final boolean id_break;
   private final Set<rkw_3<?>> id_byte = Sets.newHashSet();
   private final Set<rkw_3<?>> id_protected = Sets.newHashSet();
   private final Set<rkw_3<?>> id_throws = Sets.newHashSet();

   public boolean id_byte() {
      return !this.id_protected.isEmpty();
   }

   public mG_2(List<rkw_3<?>> var1) {
      this.id_class = ImmutableList.copyOf(var1);
      if (var1.size() <= 1) {
         this.id_break = true;
      } else {
         this.id_break = id_class(var1);
      }
   }

   public List<rkw_3<?>> id_class(boolean var1) {
      ArrayList var2 = Lists.newArrayList();
      Set var3 = var1 ? this.id_byte : this.id_protected;

      for (rkw_3 var5 : this.id_class) {
         if (var3.contains(var5)) {
            var2.add(var5);
         }
      }

      return var2;
   }

   public boolean id_class(rkw_3<?> var1) {
      return this.id_byte.contains(var1);
   }

   public void id_class(rWr_1 var1, int var2, int var3, rkU_2 var4) {
      for (rkw_3 var6 : this.id_class) {
         boolean var7 = var6.id_class(var2, var3) && var4.id_break(var6);
         if (var7) {
            this.id_protected.add(var6);
         } else {
            this.id_protected.remove(var6);
         }

         if (var7 && var1.id_class(var6, (IntList)null)) {
            this.id_byte.add(var6);
         } else {
            this.id_byte.remove(var6);
         }
      }
   }

   private static boolean id_class(List<rkw_3<?>> var0) {
      int var1 = var0.size();
      rdn_3 var2 = ((rkw_3)var0.get(0)).id_byte();

      for (int var3 = 1; var3 < var1; var3++) {
         rdn_3 var4 = ((rkw_3)var0.get(var3)).id_byte();
         if (!rdn_3.id_byte(var2, var4) || !rdn_3.id_class(var2, var4)) {
            return false;
         }
      }

      return true;
   }

   public boolean id_class() {
      return !this.id_throws.isEmpty();
   }

   public void id_class(rkU_2 var1) {
      for (rkw_3 var3 : this.id_class) {
         if (var1.id_break(var3)) {
            this.id_throws.add(var3);
         }
      }
   }

   public List<rkw_3<?>> id_break(boolean var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rkw_3 var4 : this.id_class) {
         if (this.id_protected.contains(var4) && this.id_byte.contains(var4) == var1) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public boolean id_break() {
      return !this.id_byte.isEmpty();
   }

   public boolean id_throws() {
      return this.id_break;
   }

   public List<rkw_3<?>> id_protected() {
      return this.id_class;
   }
}
