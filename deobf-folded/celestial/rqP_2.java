package celestial;

public class rqP_2 extends rqr_3 {
   private final Qw_1 id_class;

   public rqP_2(Qw_1 var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(boolean var1) {
      rrAO var2 = rrAO.id_class(
         this.id_class.h.id_protected(),
         this.id_class.J.id_protected(),
         this.id_class.X.id_protected(),
         this.id_class.x.id_protected(),
         this.id_protected == this.id_throws ? 0.0F : (this.id_protected ? 1.0F : -1.0F),
         this.id_case == this.id_catch ? 0.0F : (this.id_case ? 1.0F : -1.0F),
         this.id_class.d.id_protected(),
         this.id_class.k.id_protected(),
         0.3
      );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
      if (var2.id_byte()) {
         this.id_protected = false;
         this.id_throws = false;
         this.id_case = false;
         this.id_catch = false;
         this.id_byte = 0.0F;
         this.id_break = 0.0F;
         this.id_private = false;
         this.id_implements = false;
      } else {
         if (this.id_finally) {
            var2.id_protected(false);
            var2.id_byte(false);
            var2.id_case(false);
            var2.id_throws(false);
            var2.id_break(0.0F);
            var2.id_class(0.0F);
         }

         if (this.id_extends) {
            var2.id_break(false);
         }

         if (this.id_native) {
            var2.id_catch(false);
         }

         double var3 = var2.id_case();
         this.id_protected = var2.id_extends();
         this.id_throws = var2.id_class();
         this.id_case = var2.id_protected();
         this.id_catch = var2.id_finally();
         this.id_byte = var2.id_catch();
         this.id_break = var2.id_throws();
         this.id_private = var2.id_break();
         this.id_implements = var2.id_implements();
         if (var1) {
            this.id_break = (float)((double)this.id_break * var3);
            this.id_byte = (float)((double)this.id_byte * var3);
         }

         this.id_finally = false;
         this.id_extends = false;
         this.id_native = false;
      }
   }
}
