package celestial;

import java.util.EnumSet;
import java.util.function.Predicate;

public class rBI<T extends iB_2> extends rSM {
   protected final Class<T> class_;
   protected final int break_;
   protected iB_2 byte_;
   protected ay_3 protected_;

   @Override
   public void byte_() {
      this.throws_.byte_(this.byte_);
      super.byte_();
   }

   public rBI(is_3 var1, Class<T> var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public rBI(is_3 var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<iB_2> var6) {
      super(var1, var4, var5);
      this.class_ = var2;
      this.break_ = var3;
      this.class_(EnumSet.of(rBW.TARGET));
      this.protected_ = new ay_3().class_(this.extends_()).class_(var6);
   }

   public rBI(is_3 var1, Class<T> var2, boolean var3, boolean var4) {
      this(var1, var2, 10, var3, var4, (Predicate<iB_2>)null);
   }

   public void class_(iB_2 var1) {
      this.byte_ = var1;
   }

   protected rfl_3 class_(double var1) {
      return this.throws_.rN().byte_(var1, 4.0, var1);
   }

   @Override
   public boolean class_() {
      if (this.break_ > 0 && this.throws_.Sa().nextInt(this.break_) != 0) {
         return false;
      } else {
         this.finally_();
         return this.byte_ != null;
      }
   }

   protected void finally_() {
      if (this.class_ != rhd_3.class && this.class_ != rhN_2.class) {
         this.byte_ = ((rYB)this.throws_.throws_[7])
            .break_(this.class_, this.protected_, this.throws_, this.throws_.rx(), this.throws_.rH(), this.throws_.BO(), this.class_(this.extends_()));
      } else {
         this.byte_ = ((rYB)this.throws_.throws_[7]).class_(this.protected_, this.throws_, this.throws_.rx(), this.throws_.rH(), this.throws_.BO());
      }
   }
}
