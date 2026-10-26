package celestial;

import java.util.function.Function;
import java.util.function.Predicate;

public class rVS<T> implements rVE<T> {
   private final rqE_2<T> class_;
   private final T[] break_;
   private final rVG<T> byte_;
   private final Function<rcd_3, T> protected_;
   private final int throws_;
   private int case_;

   public rVS(rqE_2<T> var1, int var2, rVG<T> var3, Function<rcd_3, T> var4) {
      this.class_ = var1;
      this.break_ = (T[])(new Object[1 << var2]);
      this.throws_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public void class_(ruu_3 var1) {
      this.case_ = var1.case_();

      for (int var2 = 0; var2 < this.case_; var2++) {
         this.break_[var2] = this.class_.class_(var1.case_());
      }
   }

   @Override
   public int class_() {
      int var1 = ruu_3.class_(this.break_());

      for (int var2 = 0; var2 < this.break_(); var2++) {
         var1 += ruu_3.class_(this.class_.class_(this.break_[var2]));
      }

      return var1;
   }

   @Override
   public void class_(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.break_[var2] = this.protected_.apply(var1.class_(var2));
      }

      this.case_ = var1.size();
   }

   @Override
   public int class_(T var1) {
      for (int var2 = 0; var2 < this.case_; var2++) {
         if (this.break_[var2] == var1) {
            return var2;
         }
      }

      int var3 = this.case_;
      if (var3 < this.break_.length) {
         this.break_[var3] = (T)var1;
         this.case_++;
         return var3;
      } else {
         return this.byte_.onResize(this.throws_ + 1, (T)var1);
      }
   }

   @Override
   public boolean class_(Predicate<T> var1) {
      for (int var2 = 0; var2 < this.case_; var2++) {
         if (var1.test(this.break_[var2])) {
            return true;
         }
      }

      return false;
   }

   @Override
   public T class_(int var1) {
      return var1 >= 0 && var1 < this.case_ ? this.break_[var1] : null;
   }

   public int break_() {
      return this.case_;
   }

   @Override
   public void break_(ruu_3 var1) {
      var1.protected_(this.case_);

      for (int var2 = 0; var2 < this.case_; var2++) {
         var1.protected_(this.class_.class_(this.break_[var2]));
      }
   }
}
