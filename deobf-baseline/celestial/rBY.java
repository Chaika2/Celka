package celestial;

import java.util.EnumSet;

public class rBY extends rBk_1 {
   protected final aA_2 id_class;
   protected final double id_break;
   protected double id_byte;
   protected double id_protected;
   protected double id_throws;
   protected boolean id_case;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_class(this.id_byte, this.id_protected, this.id_throws, this.id_break);
      this.id_case = true;
   }

   public rBY(aA_2 var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (this.id_class.Sr() == null && !this.id_class.Pz()) {
         return false;
      } else {
         if (this.id_class.Pz()) {
            rfH_2 var1 = this.id_class((rYB)this.id_class.id_throws[7], this.id_class, 5, 4);
            if (var1 != null) {
               this.id_byte = (double)var1.b_();
               this.id_protected = (double)var1.c_();
               this.id_throws = (double)var1.d_();
               return true;
            }
         }

         return this.id_catch();
      }
   }

   protected rfH_2 id_class(rRq_1 var1, an_3 var2, int var3, int var4) {
      rfH_2 var5 = var2.Bs();
      int var6 = var5.b_();
      int var7 = var5.c_();
      int var8 = var5.d_();
      float var9 = (float)(var3 * var3 * var4 * 2);
      rfH_2 var10 = null;
      rfw_3 var11 = new rfw_3();

      for (int var12 = var6 - var3; var12 <= var6 + var3; var12++) {
         for (int var13 = var7 - var4; var13 <= var7 + var4; var13++) {
            for (int var14 = var8 - var3; var14 <= var8 + var3; var14++) {
               var11.id_class(var12, var13, var14);
               if (var1.id_break(var11).id_class(rlG_2.id_break)) {
                  float var15 = (float)((var12 - var6) * (var12 - var6) + (var13 - var7) * (var13 - var7) + (var14 - var8) * (var14 - var8));
                  if (var15 < var9) {
                     var9 = var15;
                     var10 = new rfH_2(var11);
                  }
               }
            }
         }
      }

      return var10;
   }

   @Override
   public boolean id_break() {
      return !this.id_class.id_public().id_native();
   }

   protected boolean id_catch() {
      rjU_2 var1 = iX_2.id_class(this.id_class, 5, 4);
      if (var1 == null) {
         return false;
      } else {
         this.id_byte = var1.id_break;
         this.id_protected = var1.id_byte;
         this.id_throws = var1.id_protected;
         return true;
      }
   }

   @Override
   public void id_protected() {
      this.id_case = false;
   }

   public boolean id_private() {
      return this.id_case;
   }
}
