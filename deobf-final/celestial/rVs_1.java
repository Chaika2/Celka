package celestial;

import java.util.function.Function;
import java.util.function.Predicate;

public class rVs_1<T> implements rVE<T> {
   private final rqE_2<T> class_;
   private final rpf_3<T> break_;
   private final rVG<T> byte_;
   private final Function<rcd_3, T> protected_;
   private final Function<T, rcd_3> throws_;
   private final int case_;

   public rVs_1(rqE_2<T> var1, int var2, rVG<T> var3, Function<rcd_3, T> var4, Function<T, rcd_3> var5) {
      this.class_ = var1;
      this.case_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.break_ = new rpf_3<>(1 << var2);
   }

   @Override
   public void class_(ruu_3 var1) {
      this.break_.class_();
      int var2 = var1.case_();

      for (int var3 = 0; var3 < var2; var3++) {
         this.break_.break_(this.class_.class_(var1.case_()));
      }
   }

   @Override
   public int class_() {
      int var1 = ruu_3.class_(this.break_());

      for (int var2 = 0; var2 < this.break_(); var2++) {
         var1 += ruu_3.class_(this.class_.class_(this.break_.class_(var2)));
      }

      return var1;
   }

   @Override
   public void class_(rcy_3 var1) {
      this.break_.class_();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.break_.break_(this.protected_.apply(var1.class_(var2)));
      }
   }

   @Override
   public int class_(T var1) {
      int var2 = this.break_.class_((T)var1);
      if (var2 == -1) {
         var2 = this.break_.break_((T)var1);
         if (var2 >= 1 << this.case_) {
            var2 = this.byte_.onResize(this.case_ + 1, (T)var1);
         }
      }

      return var2;
   }

   @Override
   public boolean class_(Predicate<T> var1) {
      for (int var2 = 0; var2 < this.break_(); var2++) {
         if (var1.test(this.break_.class_(var2))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public T class_(int var1) {
      return this.break_.class_(var1);
   }

   public void break_(rcy_3 var1) {
      for (int var2 = 0; var2 < this.break_(); var2++) {
         var1.add(this.throws_.apply(this.break_.class_(var2)));
      }
   }

   public int break_() {
      return this.break_.break_();
   }

   @Override
   public void break_(ruu_3 var1) {
      int var2 = this.break_();
      var1.protected_(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         var1.protected_(this.class_.class_(this.break_.class_(var3)));
      }
   }
}
