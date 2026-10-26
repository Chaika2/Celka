package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class mG_2 {
   private final List<rkw_3<?>> class_;
   private final boolean break_;
   private final Set<rkw_3<?>> byte_ = Sets.newHashSet();
   private final Set<rkw_3<?>> protected_ = Sets.newHashSet();
   private final Set<rkw_3<?>> throws_ = Sets.newHashSet();

   public boolean byte_() {
      return !this.protected_.isEmpty();
   }

   public mG_2(List<rkw_3<?>> var1) {
      this.class_ = ImmutableList.copyOf(var1);
      if (var1.size() <= 1) {
         this.break_ = true;
      } else {
         this.break_ = class_(var1);
      }
   }

   public List<rkw_3<?>> class_(boolean var1) {
      ArrayList var2 = Lists.newArrayList();
      Set var3 = var1 ? this.byte_ : this.protected_;

      for (rkw_3 var5 : this.class_) {
         if (var3.contains(var5)) {
            var2.add(var5);
         }
      }

      return var2;
   }

   public boolean class_(rkw_3<?> var1) {
      return this.byte_.contains(var1);
   }

   public void class_(rWr_1 var1, int var2, int var3, rkU_2 var4) {
      for (rkw_3 var6 : this.class_) {
         boolean var7 = var6.class_(var2, var3) && var4.break_(var6);
         if (var7) {
            this.protected_.add(var6);
         } else {
            this.protected_.remove(var6);
         }

         if (var7 && var1.class_(var6, (IntList)null)) {
            this.byte_.add(var6);
         } else {
            this.byte_.remove(var6);
         }
      }
   }

   private static boolean class_(List<rkw_3<?>> var0) {
      int var1 = var0.size();
      rdn_3 var2 = ((rkw_3)var0.get(0)).byte_();

      for (int var3 = 1; var3 < var1; var3++) {
         rdn_3 var4 = ((rkw_3)var0.get(var3)).byte_();
         if (!rdn_3.byte_(var2, var4) || !rdn_3.class_(var2, var4)) {
            return false;
         }
      }

      return true;
   }

   public boolean class_() {
      return !this.throws_.isEmpty();
   }

   public void class_(rkU_2 var1) {
      for (rkw_3 var3 : this.class_) {
         if (var1.break_(var3)) {
            this.throws_.add(var3);
         }
      }
   }

   public List<rkw_3<?>> break_(boolean var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rkw_3 var4 : this.class_) {
         if (this.protected_.contains(var4) && this.byte_.contains(var4) == var1) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public boolean break_() {
      return !this.byte_.isEmpty();
   }

   public boolean throws_() {
      return this.break_;
   }

   public List<rkw_3<?>> protected_() {
      return this.class_;
   }
}
