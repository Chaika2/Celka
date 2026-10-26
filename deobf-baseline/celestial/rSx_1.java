package celestial;

import java.util.function.Predicate;

public class rSx_1<T extends is_3> extends rBk_1 {
   private final T id_class;
   private final rdn_3 id_break;
   private final Predicate<? super T> id_byte;
   private final rqA_2 id_protected;

   @Override
   public void id_byte() {
      this.id_class.id_class(rXQ.MAINHAND, this.id_break.id_implements());
      this.id_class.id_break(rpm_3.MAIN_HAND);
   }

   public rSx_1(T var1, rdn_3 var2, rqA_2 var3, Predicate<? super T> var4) {
      this.id_class = (T)var1;
      this.id_break = var2;
      this.id_protected = var3;
      this.id_byte = var4;
   }

   @Override
   public boolean id_class() {
      return this.id_byte.test(this.id_class);
   }

   @Override
   public boolean id_break() {
      return this.id_class.id_return();
   }

   @Override
   public void id_protected() {
      this.id_class.id_class(rXQ.MAINHAND, rdn_3.id_break);
      if (this.id_protected != null) {
         this.id_class.id_class(this.id_protected, 1.0F, this.id_class.Sa().nextFloat() * 0.2F + 0.9F);
      }
   }
}
