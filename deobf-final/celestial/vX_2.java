package celestial;

import java.util.List;
import java.util.function.Function;

abstract class vX_2 implements vd_3 {
   private final rAp_1 break_;

   @Override
   public rqO_2 byte_() {
      return this.class_.case_.apply(this.break_);
   }

   public vX_2(vh_3 var1, rAp_1 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   protected void class_(int var1) {
      List var2 = this.class_();
      int var3 = var2.indexOf(this.break_);
      var2.remove(var3);
      var2.add(var3 + var1, this.break_);
      this.class_.break_.run();
   }

   protected abstract List<rAp_1> class_();

   protected abstract List<rAp_1> break_();

   @Override
   public rgP_2 throws_() {
      return this.break_.class_();
   }

   protected void finally_() {
      this.class_().remove(this.break_);
      this.break_.private_().class_(this.break_(), this.break_, Function.identity(), true);
      this.class_.break_.run();
   }

   @Override
   public rAZ catch_() {
      return this.break_.implements_();
   }

   @Override
   public boolean extends_() {
      List var1 = this.class_();
      int var2 = var1.indexOf(this.break_);
      return var2 > 0 && !((rAp_1)var1.get(var2 - 1)).catch_();
   }

   @Override
   public rgP_2 case_() {
      return this.break_.break_();
   }

   @Override
   public boolean implements_() {
      return this.break_.case_();
   }

   @Override
   public rAl_1 protected_() {
      return this.break_.byte_();
   }

   @Override
   public boolean private_() {
      return this.break_.catch_();
   }

   @Override
   public void final_() {
      this.class_(1);
   }

   @Override
   public boolean volatile_() {
      List var1 = this.class_();
      int var2 = var1.indexOf(this.break_);
      return var2 >= 0 && var2 < var1.size() - 1 && !((rAp_1)var1.get(var2 + 1)).catch_();
   }

   @Override
   public void native_() {
      this.class_(-1);
   }
}
