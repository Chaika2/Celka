package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class fT_2 {
   private static final Comparator<ft_3> id_class = Comparator.<ft_3, Integer>comparing(var0 -> -var0.id_byte)
      .thenComparing(var0 -> -var0.id_break)
      .thenComparing(var0 -> var0.id_class.id_class());
   private final int id_break;
   private final Set<ft_3> id_byte = Sets.newHashSetWithExpectedSize(256);
   private final List<fI_2> id_protected = Lists.newArrayListWithCapacity(256);
   private int id_throws;
   private int id_case;
   private final int id_catch;
   private final int id_private;

   public void id_byte() {
      ArrayList var1 = Lists.newArrayList(this.id_byte);
      var1.sort(id_class);

      for (ft_3 var3 : var1) {
         if (!this.id_class(var3)) {
            throw new yG_2(
               var3.id_class,
               var1.stream().map(var0 -> var0.id_class).collect(ImmutableList.toImmutableList()),
               this.id_throws,
               this.id_case,
               this.id_catch,
               this.id_private
            );
         }
      }

      this.id_throws = rfU_2.id_byte(this.id_throws);
      this.id_case = rfU_2.id_byte(this.id_case);
   }

   public fT_2(int var1, int var2, int var3) {
      this.id_break = var3;
      this.id_catch = var1;
      this.id_private = var2;
   }

   private boolean id_class(ft_3 var1) {
      for (fI_2 var3 : this.id_protected) {
         if (var3.id_class(var1)) {
            return true;
         }
      }

      return this.id_break(var1);
   }

   public int id_class() {
      return this.id_throws;
   }

   public void id_class(fw_3 var1) {
      for (fI_2 var3 : this.id_protected) {
         var3.id_class(var2 -> {
            ft_3 var3x = var2.id_class();
            fV_2 var4 = var3x.id_class;
            var1.load(var4, this.id_throws, this.id_case, var2.id_break(), var2.id_byte());
         });
      }
   }

   static int id_class(int var0, int var1) {
      return (var0 >> var1) + ((var0 & (1 << var1) - 1) == 0 ? 0 : 1) << var1;
   }

   public void id_class(fV_2 var1) {
      ft_3 var2 = new ft_3(var1, this.id_break);
      this.id_byte.add(var2);
   }

   public int id_break() {
      return this.id_case;
   }

   private boolean id_break(ft_3 var1) {
      int var2 = rfU_2.id_byte(this.id_throws);
      int var3 = rfU_2.id_byte(this.id_case);
      int var4 = rfU_2.id_byte(this.id_throws + var1.id_break);
      int var5 = rfU_2.id_byte(this.id_case + var1.id_byte);
      boolean var6 = var4 <= this.id_catch;
      boolean var7 = var5 <= this.id_private;
      if (!var6 && !var7) {
         return false;
      } else {
         int var8 = rrWD.id_class(this.id_case);
         boolean var9 = var6 && var4 <= 2 * var8;
         if (this.id_throws == 0 && this.id_case == 0) {
            var9 = true;
         }

         fI_2 var10;
         if (var9) {
            if (this.id_case == 0) {
               this.id_case = var1.id_byte;
            }

            var10 = new fI_2(this.id_throws, 0, var1.id_break, this.id_case);
            this.id_throws = this.id_throws + var1.id_break;
         } else {
            var10 = new fI_2(0, this.id_case, this.id_throws, var1.id_byte);
            this.id_case = this.id_case + var1.id_byte;
         }

         var10.id_class(var1);
         this.id_protected.add(var10);
         return true;
      }
   }
}
