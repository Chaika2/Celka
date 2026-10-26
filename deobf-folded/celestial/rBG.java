package celestial;

public class rBG extends rBm_1 {
   private static final int[] id_class = new int[]{0, 1, 4, 5, 6, 7};
   private final rbo_3 id_break;
   private final int id_byte;
   private boolean id_protected;

   @Override
   public void id_byte() {
      rpr_3 var1 = this.id_break.rS();
      this.id_break.id_byte(this.id_break.rv().id_break((double)var1.id_implements() * 0.6, 0.7, (double)var1.id_extends() * 0.6));
      this.id_break.id_public().id_final();
   }

   public rBG(rbo_3 var1, int var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public boolean id_class() {
      if (this.id_break.Sa().nextInt(this.id_byte) != 0) {
         return false;
      } else {
         rpr_3 var1 = this.id_break.rS();
         int var2 = var1.id_implements();
         int var3 = var1.id_extends();
         rfH_2 var4 = this.id_break.Bs();

         for (int var8 : id_class) {
            if (!this.id_class(var4, var2, var3, var8) || !this.id_break(var4, var2, var3, var8)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean id_class(rfH_2 var1, int var2, int var3, int var4) {
      rfH_2 var5 = var1.id_break(var2 * var4, 0, var3 * var4);
      return ((rYB)this.id_break.id_throws[7]).id_break(var5).id_class(rlG_2.id_break) && !((rYB)this.id_break.id_throws[7]).id_byte(var5).id_byte().id_byte();
   }

   private boolean id_break(rfH_2 var1, int var2, int var3, int var4) {
      return ((rYB)this.id_break.id_throws[7]).id_byte(var1.id_break(var2 * var4, 1, var3 * var4)).id_catch()
         && ((rYB)this.id_break.id_throws[7]).id_byte(var1.id_break(var2 * var4, 2, var3 * var4)).id_catch();
   }

   @Override
   public boolean id_break() {
      double var1 = this.id_break.rv().id_byte;
      return (
            !(var1 * var1 < 0.03F)
               || (Float)this.id_break.id_throws[16] == 0.0F
               || !(Math.abs((Float)this.id_break.id_throws[16]) < 10.0F)
               || !this.id_break.rT()
         )
         && !this.id_break.BL();
   }

   @Override
   public void id_throws() {
      boolean var1 = this.id_protected;
      if (!var1) {
         rXE var2 = ((rYB)this.id_break.id_throws[7]).id_break(this.id_break.Bs());
         this.id_protected = var2.id_class(rlG_2.id_break);
      }

      if (this.id_protected && !var1) {
         this.id_break.id_class(rqn_3.PV, 1.0F, 1.0F);
      }

      rjU_2 var13 = this.id_break.rv();
      if (var13.id_byte * var13.id_byte < 0.03F && (Float)this.id_break.id_throws[16] != 0.0F) {
         rbo_3 var14 = this.id_break;
         Float var11 = rfU_2.id_implements((Float)this.id_break.id_throws[16], 0.0F, 0.2F);
         var14.id_throws[16] = var11;
      } else {
         double var3 = Math.sqrt(an_3.id_case(var13));
         double var5 = Math.signum(-var13.id_byte) * Math.acos(var3 / var13.id_case()) * 180.0F / (float)Math.PI;
         rbo_3 var10000 = this.id_break;
         Float var12 = (float)var5;
         var10000.id_throws[16] = var12;
      }
   }

   @Override
   public void id_protected() {
      rbo_3 var10000 = this.id_break;
      Float var5 = 0.0F;
      var10000.id_throws[16] = var5;
   }

   @Override
   public boolean J_() {
      return false;
   }
}
