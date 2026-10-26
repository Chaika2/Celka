package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class rqB_2 implements ryY_2 {
   private final List<rqS_2> class_ = Lists.newArrayList();
   private int break_;

   public int byte_(rdn_3 var1) {
      if (var1.break_() != rdy_3.class_ && !this.class_.isEmpty()) {
         for (rqS_2 var3 : this.class_) {
            if (var3.class_.test(var1)) {
               return var3.byte_ - this.break_;
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public void class_(rdn_3 var1, Predicate<rdn_3> var2, int var3) {
      this.class_.add(new rqS_2(var2, this.break_, this.break_ + var3));
      rrLa_1.break_(var1, rrLi_1.class_(var3));
   }

   public boolean class_(rdn_3 var1) {
      return this.class_(var1, 0.0F) > 0.0F;
   }

   public boolean class_(rdn_3... var1) {
      for (rdn_3 var5 : var1) {
         if (this.class_(var5)) {
            return true;
         }
      }

      return false;
   }

   public float class_(rdn_3 var1, float var2) {
      if (var1.break_() != rdy_3.class_ && !this.class_.isEmpty()) {
         for (rqS_2 var4 : this.class_) {
            if (var4.class_.test(var1)) {
               float var5 = (float)(var4.byte_ - var4.break_);
               float var6 = (float)var4.byte_ - ((float)this.break_ + var2);
               return rfU_2.class_(var6 / var5, 0.0F, 1.0F);
            }
         }

         return 0.0F;
      } else {
         return 0.0F;
      }
   }

   public void class_() {
      this.break_++;
      if (!this.class_.isEmpty()) {
         this.class_.removeIf(var1 -> var1.byte_ <= this.break_);
      }
   }

   public void break_(rdn_3 var1) {
      this.class_.removeIf(var1x -> var1x.class_.test(var1));
      rrLa_1.break_(var1, rrLi_1.class_());
   }

   public void break_() {
      this.class_.clear();
   }
}
