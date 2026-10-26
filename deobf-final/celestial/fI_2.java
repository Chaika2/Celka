package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;

public class fI_2 {
   private final int class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private List<fI_2> throws_;
   private ft_3 case_;

   public int byte_() {
      return this.break_;
   }

   public fI_2(int var1, int var2, int var3, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public String toString() {
      return "Slot{originX="
         + this.class_
         + ", originY="
         + this.break_
         + ", width="
         + this.byte_
         + ", height="
         + this.protected_
         + ", texture="
         + this.case_
         + ", subSlots="
         + this.throws_
         + "}";
   }

   public void class_(Consumer<fI_2> var1) {
      if (this.case_ != null) {
         var1.accept(this);
      } else if (this.throws_ != null) {
         for (fI_2 var3 : this.throws_) {
            var3.class_(var1);
         }
      }
   }

   public boolean class_(ft_3 var1) {
      if (this.case_ != null) {
         return false;
      } else {
         int var2 = var1.break_;
         int var3 = var1.byte_;
         if (var2 <= this.byte_ && var3 <= this.protected_) {
            if (var2 == this.byte_ && var3 == this.protected_) {
               this.case_ = var1;
               return true;
            } else {
               if (this.throws_ == null) {
                  this.throws_ = Lists.newArrayListWithCapacity(1);
                  this.throws_.add(new fI_2(this.class_, this.break_, var2, var3));
                  int var4 = this.byte_ - var2;
                  int var5 = this.protected_ - var3;
                  if (var5 > 0 && var4 > 0) {
                     int var6 = Math.max(this.protected_, var4);
                     int var7 = Math.max(this.byte_, var5);
                     if (var6 >= var7) {
                        this.throws_.add(new fI_2(this.class_, this.break_ + var3, var2, var5));
                        this.throws_.add(new fI_2(this.class_ + var2, this.break_, var4, this.protected_));
                     } else {
                        this.throws_.add(new fI_2(this.class_ + var2, this.break_, var4, var3));
                        this.throws_.add(new fI_2(this.class_, this.break_ + var3, this.byte_, var5));
                     }
                  } else if (var4 == 0) {
                     this.throws_.add(new fI_2(this.class_, this.break_ + var3, var2, var5));
                  } else if (var5 == 0) {
                     this.throws_.add(new fI_2(this.class_ + var2, this.break_, var4, var3));
                  }
               }

               for (fI_2 var9 : this.throws_) {
                  if (var9.class_(var1)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return false;
         }
      }
   }

   public ft_3 class_() {
      return this.case_;
   }

   public int break_() {
      return this.class_;
   }
}
