package celestial;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Set;

class rrEW {
   final rYP id_break;
   final an_3 id_byte;
   private final int id_protected;
   rjh_3 id_throws;
   private final Set<rhN_2> id_case;

   public rrEW(rrEx_1 var1, an_3 var2, int var3, int var4, boolean var5) {
      this.id_class = var1;
      this.id_case = Sets.newHashSet();
      this.id_break = new rYP(var1.id_private, var2, var4, var5, this::id_class);
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = rjh_3.id_class(var2);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof rrEW ? ((rrEW)var1).id_byte.V() == this.id_byte.V() : false;
   }

   @Override
   public int hashCode() {
      return this.id_byte.V();
   }

   public void id_class(rhN_2 var1) {
      if (this.id_case.remove(var1)) {
         this.id_break.id_class(var1);
      }
   }

   private int id_class(int var1) {
      return this.id_class.id_private.id_const().id_break(var1);
   }

   public void id_class(List<rhN_2> var1) {
      for (rhN_2 var3 : var1) {
         this.id_break(var3);
      }
   }

   public void id_class(ruS_2<?> var1) {
      for (rhN_2 var3 : this.id_case) {
         var3.id_class.id_class(var1);
      }
   }

   public void id_class() {
      for (rhN_2 var2 : this.id_case) {
         this.id_break.id_class(var2);
      }
   }

   public void id_break(ruS_2<?> var1) {
      this.id_class(var1);
      if (this.id_byte instanceof rhN_2) {
         ((rhN_2)this.id_byte).id_class.id_class(var1);
      }
   }

   private int id_break() {
      Collection var1 = this.id_byte.PP();
      int var2 = this.id_protected;

      for (an_3 var4 : var1) {
         int var5 = var4.BC().id_final() * 16;
         if (var5 > var2) {
            var2 = var5;
         }
      }

      return this.id_class(var2);
   }

   public void id_break(rhN_2 var1) {
      if (var1 != this.id_byte) {
         rjU_2 var2 = var1.Ps().id_protected(this.id_break.id_break());
         int var3 = Math.min(this.id_break(), (this.id_class.id_instanceof - 1) * 16);
         boolean var4 = var2.id_break >= (double)(-var3)
            && var2.id_break <= (double)var3
            && var2.id_protected >= (double)(-var3)
            && var2.id_protected <= (double)var3
            && this.id_byte.id_byte(var1);
         if (var4) {
            boolean var5 = (Boolean)this.id_byte.id_throws[6];
            if (!var5) {
               rfj_3 var6 = new rfj_3((Integer)this.id_byte.id_throws[51], (Integer)this.id_byte.id_throws[53]);
               rrEG var7 = this.id_class.id_break(var6.id_class());
               if (var7 != null && var7.id_protected() != null) {
                  var5 = rrEx_1.id_class(var6, var1, false) <= this.id_class.id_instanceof;
               }
            }

            if (var5 && this.id_case.add(var1)) {
               this.id_break.id_break(var1);
            }
         } else if (this.id_case.remove(var1)) {
            this.id_break.id_class(var1);
         }
      }
   }
}
