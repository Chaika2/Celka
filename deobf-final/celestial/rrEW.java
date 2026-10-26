package celestial;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Set;

class rrEW {
   final rYP break_;
   final an_3 byte_;
   private final int protected_;
   rjh_3 throws_;
   private final Set<rhN_2> case_;

   public rrEW(rrEx_1 var1, an_3 var2, int var3, int var4, boolean var5) {
      this.class_ = var1;
      this.case_ = Sets.newHashSet();
      this.break_ = new rYP(var1.private_, var2, var4, var5, this::class_);
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = rjh_3.class_(var2);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof rrEW ? ((rrEW)var1).byte_.V() == this.byte_.V() : false;
   }

   @Override
   public int hashCode() {
      return this.byte_.V();
   }

   public void class_(rhN_2 var1) {
      if (this.case_.remove(var1)) {
         this.break_.class_(var1);
      }
   }

   private int class_(int var1) {
      return this.class_.private_.const_().break_(var1);
   }

   public void class_(List<rhN_2> var1) {
      for (rhN_2 var3 : var1) {
         this.break_(var3);
      }
   }

   public void class_(ruS_2<?> var1) {
      for (rhN_2 var3 : this.case_) {
         var3.class_.class_(var1);
      }
   }

   public void class_() {
      for (rhN_2 var2 : this.case_) {
         this.break_.class_(var2);
      }
   }

   public void break_(ruS_2<?> var1) {
      this.class_(var1);
      if (this.byte_ instanceof rhN_2) {
         ((rhN_2)this.byte_).class_.class_(var1);
      }
   }

   private int break_() {
      Collection var1 = this.byte_.PP();
      int var2 = this.protected_;

      for (an_3 var4 : var1) {
         int var5 = var4.BC().final_() * 16;
         if (var5 > var2) {
            var2 = var5;
         }
      }

      return this.class_(var2);
   }

   public void break_(rhN_2 var1) {
      if (var1 != this.byte_) {
         rjU_2 var2 = var1.Ps().protected_(this.break_.break_());
         int var3 = Math.min(this.break_(), (this.class_.instanceof_ - 1) * 16);
         boolean var4 = var2.break_ >= (double)(-var3)
            && var2.break_ <= (double)var3
            && var2.protected_ >= (double)(-var3)
            && var2.protected_ <= (double)var3
            && this.byte_.byte_(var1);
         if (var4) {
            boolean var5 = (Boolean)this.byte_.throws_[6];
            if (!var5) {
               rfj_3 var6 = new rfj_3((Integer)this.byte_.throws_[51], (Integer)this.byte_.throws_[53]);
               rrEG var7 = this.class_.break_(var6.class_());
               if (var7 != null && var7.protected_() != null) {
                  var5 = rrEx_1.class_(var6, var1, false) <= this.class_.instanceof_;
               }
            }

            if (var5 && this.case_.add(var1)) {
               this.break_.break_(var1);
            }
         } else if (this.case_.remove(var1)) {
            this.break_.class_(var1);
         }
      }
   }
}
