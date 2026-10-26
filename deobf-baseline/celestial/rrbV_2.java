package celestial;

import java.util.HashSet;
import java.util.Set;

public class rrbV_2 {
   private an_3 id_class = null;
   private double id_break = 0.0;
   private double id_byte = -2.1474836E9F;
   private double id_protected = -2.1474836E9F;
   private double id_throws = -2.1474836E9F;
   private int id_case = 0;
   private long id_catch = 0L;
   private Set<rfH_2> id_private = new HashSet<>();
   private rfw_3 id_implements = new rfw_3();

   public double id_byte() {
      return this.id_protected;
   }

   public rrbV_2(an_3 var1) {
      this.id_class = var1;
      this.id_break = (double)var1.Bx();
   }

   @Override
   public String toString() {
      return "Entity: " + this.id_class + ", offsetY: " + this.id_break;
   }

   public void id_class(yX_2 var1) {
      if (rrbb_3.rA()) {
         long var2 = System.currentTimeMillis();
         if (var2 < this.id_catch + 500L) {
            return;
         }

         this.id_catch = var2;
      }

      double var37 = this.id_class.rx() - 0.5;
      double var4 = this.id_class.re() - 0.5 + this.id_break;
      double var6 = this.id_class.BO() - 0.5;
      int var8 = rrbg_3.id_class(this.id_class);
      double var9 = var37 - this.id_byte;
      double var11 = var4 - this.id_protected;
      double var13 = var6 - this.id_throws;
      double var15 = 0.1;
      if (!(Math.abs(var9) <= var15) || !(Math.abs(var11) <= var15) || !(Math.abs(var13) <= var15) || this.id_case != var8) {
         this.id_byte = var37;
         this.id_protected = var4;
         this.id_throws = var6;
         this.id_case = var8;
         HashSet var17 = new HashSet();
         if (var8 > 0) {
            rpr_3 var18 = (rfU_2.id_byte(var37) & 15) >= 8 ? rpr_3.EAST : rpr_3.WEST;
            rpr_3 var19 = (rfU_2.id_byte(var4) & 15) >= 8 ? rpr_3.UP : rpr_3.DOWN;
            rpr_3 var20 = (rfU_2.id_byte(var6) & 15) >= 8 ? rpr_3.SOUTH : rpr_3.NORTH;
            rfH_2 var21 = new rfH_2(var37, var4, var6);
            yQ_2 var22 = var1.id_class(var21);
            rfH_2 var23 = this.id_class(var22, var21, var18);
            yQ_2 var24 = var1.id_class(var23);
            rfH_2 var25 = this.id_class(var22, var21, var20);
            yQ_2 var26 = var1.id_class(var25);
            rfH_2 var27 = this.id_class(var24, var23, var20);
            yQ_2 var28 = var1.id_class(var27);
            rfH_2 var29 = this.id_class(var22, var21, var19);
            yQ_2 var30 = var1.id_class(var29);
            rfH_2 var31 = this.id_class(var30, var29, var18);
            yQ_2 var32 = var1.id_class(var31);
            rfH_2 var33 = this.id_class(var30, var29, var20);
            yQ_2 var34 = var1.id_class(var33);
            rfH_2 var35 = this.id_class(var32, var31, var20);
            yQ_2 var36 = var1.id_class(var35);
            this.id_class(var22, this.id_private, var17);
            this.id_class(var24, this.id_private, var17);
            this.id_class(var26, this.id_private, var17);
            this.id_class(var28, this.id_private, var17);
            this.id_class(var30, this.id_private, var17);
            this.id_class(var32, this.id_private, var17);
            this.id_class(var34, this.id_private, var17);
            this.id_class(var36, this.id_private, var17);
         }

         this.id_break(var1);
         this.id_private = var17;
      }
   }

   private rfH_2 id_class(yQ_2 var1, rfH_2 var2, rpr_3 var3) {
      return var1 != null ? var1.id_class(var3) : var2.id_class(var3, 16);
   }

   public an_3 id_class() {
      return this.id_class;
   }

   private void id_class(yQ_2 var1, Set<rfH_2> var2, Set<rfH_2> var3) {
      if (var1 != null) {
         yZ_2 var4 = var1.id_byte();
         if (var4 != null && !var4.id_class()) {
            var1.id_class(false);
         }

         rfH_2 var5 = var1.id_throws().id_int();
         if (var2 != null) {
            var2.remove(var5);
         }

         if (var3 != null) {
            var3.add(var5);
         }
      }
   }

   public double id_break() {
      return this.id_byte;
   }

   public void id_break(yX_2 var1) {
      for (rfH_2 var3 : this.id_private) {
         yQ_2 var4 = var1.id_class(var3);
         this.id_class(var4, (Set<rfH_2>)null, (Set<rfH_2>)null);
      }
   }

   public int id_throws() {
      return this.id_case;
   }

   public double id_case() {
      return this.id_break;
   }

   public double id_protected() {
      return this.id_throws;
   }
}
