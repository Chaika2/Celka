package celestial;

import java.util.List;

public abstract class Fb_1<T extends rJr_1> extends Fu_1<T> implements rJu_1 {
   private FM id_class;

   @Override
   public void id_byte(List<rdn_3> var1) {
      rJu_1.super.id_byte(var1);
      this.id_interface();
   }

   public Fb_1(T var1, rhz_3 var2, rgP_2 var3) {
      super((T)var1, var2, var3);
   }

   private void id_interface() {
      for (LZ var2 : this.id_new) {
         if (var2 instanceof FI var3) {
            var2.id_int = var3.id_extends();
         }
      }
   }

   public void id_class(FM var1) {
      this.id_class = var1;
   }

   public void id_break(List<LZ> var1) {
   }

   public abstract boolean id_finally();

   public FM id_package() {
      return this.id_class;
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_interface();

      for (LZ var2 : this.id_new) {
         if (var2 instanceof FI var3) {
            var3.id_private();
         }
      }
   }

   public void id_final() {
   }

   public abstract List<LZ> id_native();

   @Override
   protected void v_() {
      super.v_();
      if (this.id_finally()) {
         this.id_final();
         this.id_instanceof.id_class(this);
         List var1 = this.id_native();
         if (var1 != null) {
            for (LZ var3 : var1) {
               this.id_class(var3);
            }

            this.id_interface();
         }

         this.id_break(var1);
      }
   }

   @Override
   public void w_() {
      super.w_();
      this.id_instanceof.id_break(this);
      this.id_class(null);
   }
}
