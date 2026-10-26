package celestial;

import java.util.List;
import java.util.Optional;

public class LN extends LQ implements cn_3, rrJO {
   private final VF id_case;
   private boolean id_catch;
   private boolean id_private;

   @Override
   public void id_byte(double var1, double var3) {
      if (this.id_catch) {
         this.id_private = true;
      }

      super.id_byte(var1, var3);
   }

   public LN(Qw_1 var1, int var2, int var3, int var4, int var5, VF var6) {
      super(var1, var2, var3, var4, var5, (double)((float)var6.id_break(var6.id_class(var1))));
      this.id_case = var6;
      this.id_catch();
      this.id_catch = rrMu_1.id_class(this.id_case);
      this.id_private = false;
   }

   public static int id_class(LZ var0) {
      return var0.id_extends;
   }

   @Override
   protected void id_class(double var1, double var3, double var5, double var7) {
      if (this.id_catch) {
         this.id_private = true;
      }

      super.id_class(var1, var3, var5, var7);
   }

   @Override
   public Optional<List<rpl_3>> id_class() {
      return this.id_case.id_break();
   }

   public static int id_break(LZ var0) {
      return var0.id_native;
   }

   @Override
   protected void id_catch() {
      if (this.id_private) {
         double var1 = this.id_case.id_byte(this.id_throws);
         rgP_2 var3 = rrMu_1.id_class(this.id_case, var1);
         if (var3 != null) {
            this.id_break(var3);
         }
      } else {
         this.id_break(this.id_case.id_break(this.id_class));
      }
   }

   @Override
   public QF id_implements() {
      return this.id_case;
   }

   @Override
   public void id_protected(double var1, double var3) {
      if (this.id_private) {
         this.id_private = false;
         this.id_private();
         this.id_catch();
      }

      super.id_protected(var1, var3);
   }

   @Override
   protected void id_private() {
      if (!this.id_private) {
         double var1 = this.id_case.id_class(this.id_class);
         double var3 = this.id_case.id_byte(this.id_throws);
         if (var3 != var1) {
            this.id_case.id_class(this.id_class, this.id_case.id_byte(this.id_throws));
            this.id_class.id_break();
         }
      }
   }
}
