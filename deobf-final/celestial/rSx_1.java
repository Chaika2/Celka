package celestial;

import java.util.function.Predicate;

public class rSx_1<T extends is_3> extends rBk_1 {
   private final T class_;
   private final rdn_3 break_;
   private final Predicate<? super T> byte_;
   private final rqA_2 protected_;

   @Override
   public void byte_() {
      this.class_.class_(rXQ.MAINHAND, this.break_.implements_());
      this.class_.break_(rpm_3.MAIN_HAND);
   }

   public rSx_1(T var1, rdn_3 var2, rqA_2 var3, Predicate<? super T> var4) {
      this.class_ = (T)var1;
      this.break_ = var2;
      this.protected_ = var3;
      this.byte_ = var4;
   }

   @Override
   public boolean class_() {
      return this.byte_.test(this.class_);
   }

   @Override
   public boolean break_() {
      return this.class_.return_();
   }

   @Override
   public void protected_() {
      this.class_.class_(rXQ.MAINHAND, rdn_3.break_);
      if (this.protected_ != null) {
         this.class_.class_(this.protected_, 1.0F, this.class_.Sa().nextFloat() * 0.2F + 0.9F);
      }
   }
}
