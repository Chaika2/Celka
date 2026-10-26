package celestial;

import java.util.List;

public abstract class Fb_1<T extends rJr_1> extends Fu_1<T> implements rJu_1 {
   private FM class_;

   @Override
   public void byte_(List<rdn_3> var1) {
      rJu_1.super.byte_(var1);
      this.interface_();
   }

   public Fb_1(T var1, rhz_3 var2, rgP_2 var3) {
      super((T)var1, var2, var3);
   }

   private void interface_() {
      for (LZ var2 : this.new_) {
         if (var2 instanceof FI var3) {
            var2.int_ = var3.extends_();
         }
      }
   }

   public void class_(FM var1) {
      this.class_ = var1;
   }

   public void break_(List<LZ> var1) {
   }

   public abstract boolean finally_();

   public FM package_() {
      return this.class_;
   }

   @Override
   public void private_() {
      super.private_();
      this.interface_();

      for (LZ var2 : this.new_) {
         if (var2 instanceof FI var3) {
            var3.private_();
         }
      }
   }

   public void final_() {
   }

   public abstract List<LZ> native_();

   @Override
   protected void v_() {
      super.v_();
      if (this.finally_()) {
         this.final_();
         this.instanceof_.class_(this);
         List var1 = this.native_();
         if (var1 != null) {
            for (LZ var3 : var1) {
               this.class_(var3);
            }

            this.interface_();
         }

         this.break_(var1);
      }
   }

   @Override
   public void w_() {
      super.w_();
      this.instanceof_.break_(this);
      this.class_(null);
   }
}
