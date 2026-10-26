package celestial;

import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rHy_1 extends rHp_1 implements rHf_1 {
   private static final Logger id_class = LogManager.getLogger();
   private long id_break;
   private int id_byte;
   private rfH_2 id_protected;
   private boolean id_throws;

   public rHy_1() {
      super(ryW_2.id_else);
   }

   public float id_class(float var1) {
      return rfU_2.id_class(((float)this.id_break + var1) / 200.0F, 0.0F, 1.0F);
   }

   private void id_class(rrEm_1 var1) {
      rjU_2 var2 = new rjU_2((double)this.id_char().b_(), 0.0, (double)this.id_char().d_()).id_protected();
      rjU_2 var3 = var2.id_class(1024.0);

      for (int var4 = 16; id_class(var1, var3).id_char() > 0 && var4-- > 0; var3 = var3.id_throws(var2.id_class(-16.0))) {
         id_class.debug("Skipping backwards past nonempty chunk at {}", var3);
      }

      for (int var5 = 16; id_class(var1, var3).id_char() == 0 && var5-- > 0; var3 = var3.id_throws(var2.id_class(16.0))) {
         id_class.debug("Skipping forward past empty chunk at {}", var3);
      }

      id_class.debug("Found chunk at {}", var3);
      roJ_2 var6 = id_class(var1, var3);
      this.id_protected = id_class(var6);
      if (this.id_protected == null) {
         this.id_protected = new rfH_2(var3.id_break + 0.5, 75.0, var3.id_protected + 0.5);
         id_class.debug("Failed to find suitable block, settling on {}", this.id_protected);
         rUx_1.id_throws.id_class(var1, var1.id_else().id_implements(), new Random(this.id_protected.id_package()), this.id_protected);
      } else {
         id_class.debug("Found block at {}", this.id_protected);
      }

      this.id_protected = id_class(var1, this.id_protected, 16, true);
      id_class.debug("Creating portal at {}", this.id_protected);
      this.id_protected = this.id_protected.id_break(10);
      this.id_class(var1, this.id_protected);
      this.id_break();
   }

   private static rfH_2 id_class(roJ_2 var0) {
      rfj_3 var1 = var0.id_private();
      rfH_2 var2 = new rfH_2(var1.id_break(), 30, var1.id_byte());
      int var3 = var0.id_char() + 16 - 1;
      rfH_2 var4 = new rfH_2(var1.id_protected(), var3, var1.id_throws());
      rfH_2 var5 = null;
      double var6 = 0.0;

      for (rfH_2 var9 : rfH_2.id_class(var2, var4)) {
         xc_3 var10 = var0.id_byte(var9);
         rfH_2 var11 = var9.id_final();
         rfH_2 var12 = var9.id_break(2);
         if (var10.id_class(xu_3.Sh) && !var0.id_byte(var11).id_new(var0, var11) && !var0.id_byte(var12).id_new(var0, var12)) {
            double var13 = var9.id_class(0.0, 0.0, 0.0, true);
            if (var5 == null || var13 < var6) {
               var5 = var9;
               var6 = var13;
            }
         }
      }

      return var5;
   }

   private static roJ_2 id_class(rYB var0, rjU_2 var1) {
      return var0.id_throws(rfU_2.id_byte(var1.id_break / 16.0), rfU_2.id_byte(var1.id_protected / 16.0));
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Age", this.id_break);
      if (this.id_protected != null) {
         var1.id_class("ExitPortal", rco_3.id_class(this.id_protected));
      }

      if (this.id_throws) {
         var1.id_class("ExactTeleport", this.id_throws);
      }

      return var1;
   }

   private static rfH_2 id_class(rRq_1 var0, rfH_2 var1, int var2, boolean var3) {
      rfH_2 var4 = null;

      for (int var5 = -var2; var5 <= var2; var5++) {
         for (int var6 = -var2; var6 <= var2; var6++) {
            if (var5 != 0 || var6 != 0 || var3) {
               for (int var7 = 255; var7 > (var4 == null ? 0 : var4.c_()); var7--) {
                  rfH_2 var8 = new rfH_2(var1.b_() + var5, var7, var1.d_() + var6);
                  xc_3 var9 = var0.id_byte(var8);
                  if (var9.id_new(var0, var8) && (var3 || !var9.id_class(xu_3.id_while))) {
                     var4 = var8;
                     break;
                  }
               }
            }
         }
      }

      return var4 == null ? var1 : var4;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_break = var2.id_implements("Age");
      if (var2.id_byte("ExitPortal", 10)) {
         this.id_protected = rco_3.id_break(var2.id_int("ExitPortal"));
      }

      this.id_throws = var2.id_new("ExactTeleport");
   }

   public void id_class(rfH_2 var1, boolean var2) {
      this.id_throws = var2;
      this.id_protected = var1;
   }

   public static boolean id_class(an_3 var0) {
      return rpJ_2.id_catch.test(var0) && !var0.PO().rZ();
   }

   private void id_class(rrEm_1 var1, rfH_2 var2) {
      rUO.id_interface.id_break(rUP.id_class(this.id_char(), false)).id_class(var1, var1.id_else().id_implements(), new Random(), var2);
   }

   @Override
   public boolean id_class(rpr_3 var1) {
      return xd_3.id_byte(this.id_abstract(), this.id_extends, this.id_char(), var1);
   }

   public void id_break(an_3 var1) {
      if (this.id_extends instanceof rrEm_1 && !this.id_private()) {
         this.id_byte = 100;
         if (this.id_protected == null && this.id_extends.E() == rYB.id_throws) {
            this.id_class((rrEm_1)this.id_extends);
         }

         if (this.id_protected != null) {
            rfH_2 var2 = this.id_throws ? this.id_protected : this.id_native();
            an_3 var3;
            if (var1 instanceof rSi_1) {
               an_3 var4 = ((rSi_1)var1).id_else();
               if (var4 instanceof rhN_2) {
                  Oo_1.id_protected.id_class((rhN_2)var4, this.id_extends.id_byte(this.id_char()));
               }

               if (var4 != null) {
                  var3 = var4;
                  var1.PD();
               } else {
                  var3 = var1;
               }
            } else {
               var3 = var1.PO();
            }

            var3.rc();
            var3.id_throws((double)var2.b_() + 0.5, (double)var2.c_(), (double)var2.d_() + 0.5);
         }

         this.id_finally();
      }
   }

   public float id_break(float var1) {
      return 1.0F - rfU_2.id_class(((float)this.id_byte - var1) / 40.0F, 0.0F, 1.0F);
   }

   @Override
   public void id_throws() {
      boolean var1 = this.id_catch();
      boolean var2 = this.id_private();
      this.id_break++;
      if (var2) {
         this.id_byte--;
      } else if (!this.id_extends.id_continue) {
         List var3 = this.id_extends.id_class(an_3.class, new rfl_3(this.id_char()), rHy_1::id_class);
         if (!var3.isEmpty()) {
            this.id_break((an_3)var3.get(this.id_extends.id_int.nextInt(var3.size())));
         }

         if (this.id_break % 2400L == 0L) {
            this.id_finally();
         }
      }

      if (var1 != this.id_catch() || var2 != this.id_private()) {
         this.id_break();
      }
   }

   public void id_finally() {
      if (!this.id_extends.id_continue) {
         this.id_byte = 40;
         this.id_extends.id_class(this.id_char(), this.id_abstract().id_break(), 1, 0);
         this.id_break();
      }
   }

   public boolean id_catch() {
      return this.id_break < 200L;
   }

   public int id_extends() {
      int var1 = 0;

      for (rpr_3 var5 : rpr_3.values()) {
         var1 += this.id_class(var5) ? 1 : 0;
      }

      return var1;
   }

   @Override
   public double id_implements() {
      return 256.0;
   }

   public boolean id_private() {
      return this.id_byte > 0;
   }

   private rfH_2 id_native() {
      rfH_2 var1 = id_class(this.id_extends, this.id_protected.id_break(0, 2, 0), 5, false);
      id_class.debug("Best exit position for portal at {} is {}", this.id_protected, var1);
      return var1.id_final();
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.id_byte = 40;
         return true;
      } else {
         return super.a_(var1, var2);
      }
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 8, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }
}
