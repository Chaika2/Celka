package celestial;

import java.util.Random;

public class rHH extends ryO_2 implements rHf_1, rpA_2 {
   public int id_class;
   public float id_break;
   public float id_byte;
   public float id_protected;
   public float id_throws;
   public float id_case;
   public float id_catch;
   public float id_private;
   public float id_implements;
   public float id_finally;
   private static final Random id_final = new Random();
   private rgP_2 id_package;

   public rHH() {
      super(ryW_2.id_native);
   }

   public void id_class(rgP_2 var1) {
      this.id_package = var1;
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.Bk()) {
         var1.id_class("CustomName", rgB_2.id_class(this.id_package));
      }

      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      if (var2.id_byte("CustomName", 8)) {
         this.id_package = rgB_2.id_class(var2.id_native("CustomName"));
      }
   }

   @Override
   public rgP_2 g() {
      return (rgP_2)(this.id_package != null ? this.id_package : new rgn_3("container.enchant"));
   }

   @Override
   public void id_throws() {
      this.id_catch = this.id_case;
      this.id_implements = this.id_private;
      rhd_3 var1 = this.id_extends
         .id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5, 3.0, false);
      if (var1 != null) {
         double var2 = var1.rx() - ((double)this.id_native.b_() + 0.5);
         double var4 = var1.BO() - ((double)this.id_native.d_() + 0.5);
         this.id_finally = (float)rfU_2.id_protected(var4, var2);
         this.id_case += 0.1F;
         if (this.id_case < 0.5F || id_final.nextInt(40) == 0) {
            float var6 = this.id_protected;

            do {
               this.id_protected = this.id_protected + (float)(id_final.nextInt(4) - id_final.nextInt(4));
            } while (var6 == this.id_protected);
         }
      } else {
         this.id_finally += 0.02F;
         this.id_case -= 0.1F;
      }

      while (this.id_private >= (float) Math.PI) {
         this.id_private -= (float) (Math.PI * 2);
      }

      while (this.id_private < (float) -Math.PI) {
         this.id_private += (float) (Math.PI * 2);
      }

      while (this.id_finally >= (float) Math.PI) {
         this.id_finally -= (float) (Math.PI * 2);
      }

      while (this.id_finally < (float) -Math.PI) {
         this.id_finally += (float) (Math.PI * 2);
      }

      float var7 = this.id_finally - this.id_private;

      while (var7 >= (float) Math.PI) {
         var7 -= (float) (Math.PI * 2);
      }

      while (var7 < (float) -Math.PI) {
         var7 += (float) (Math.PI * 2);
      }

      this.id_private += var7 * 0.4F;
      this.id_case = rfU_2.id_class(this.id_case, 0.0F, 1.0F);
      this.id_class++;
      this.id_byte = this.id_break;
      float var3 = (this.id_protected - this.id_break) * 0.4F;
      float var9 = 0.2F;
      var3 = rfU_2.id_class(var3, -0.2F, 0.2F);
      this.id_throws = this.id_throws + (var3 - this.id_throws) * 0.9F;
      this.id_break = this.id_break + this.id_throws;
   }

   @Override
   public rgP_2 rD() {
      return this.id_package;
   }
}
