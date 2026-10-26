package celestial;

import java.util.OptionalInt;
import java.util.Random;

public class rhy_3 extends rhf_3 implements ai_3 {
   private static final rut_3<rdn_3> id_class = rmE_2.id_class(rhy_3.class, ruw_3.id_catch);
   private static final rut_3<OptionalInt> id_break = rmE_2.id_class(rhy_3.class, ruw_3.id_continue);
   private static final rut_3<Boolean> id_protected = rmE_2.id_class(rhy_3.class, ruw_3.id_implements);
   private int id_catch;
   private int id_private;
   private iB_2 id_implements;

   public rhy_3(rYB var1, rdn_3 var2, an_3 var3, double var4, double var6, double var8, boolean var10) {
      this(var1, var2, var4, var6, var8, var10);
      this.id_break(var3);
   }

   public rhy_3(rYB var1, rdn_3 var2, double var3, double var5, double var7, boolean var9) {
      this(var1, var3, var5, var7, var2);
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var9);
   }

   public rhy_3(rYB var1, rdn_3 var2, iB_2 var3) {
      this(var1, var3, var3.rx(), var3.re(), var3.BO(), var2);
      ((rmE_2)this.id_throws[49]).id_break(id_break, OptionalInt.of(var3.V()));
      this.id_implements = var3;
   }

   public rhy_3(aI_2<? extends rhy_3> var1, rYB var2) {
      super(var1, var2);
   }

   public rhy_3(rYB var1, double var2, double var4, double var6, rdn_3 var8) {
      super(aI_2.id_instanceof, var1);
      this.id_catch = 0;
      this.id_new(var2, var4, var6);
      byte var9 = 1;
      if (!var8.id_class() && var8.id_final()) {
         ((rmE_2)this.id_throws[49]).id_break(id_class, var8.id_implements());
         var9 += var8.id_class("Fireworks").id_case("Flight");
      }

      this.id_catch(((Random)this.id_throws[40]).nextGaussian() * 0.001, 0.05, ((Random)this.id_throws[40]).nextGaussian() * 0.001);
      this.id_private = 10 * var9 + ((Random)this.id_throws[40]).nextInt(6) + ((Random)this.id_throws[40]).nextInt(7);
   }

   public rhy_3(rYB var1, an_3 var2, double var3, double var5, double var7, rdn_3 var9) {
      this(var1, var3, var5, var7, var9);
      this.id_break(var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_private()) {
         if (this.id_implements == null) {
            ((rmE_2)this.id_throws[49]).id_class(id_break).ifPresent(var1x -> {
               an_3 var2x = ((rYB)this.id_throws[7]).id_break(var1x);
               if (var2x instanceof iB_2) {
                  this.id_implements = (iB_2)var2x;
               }
            });
         }

         if (this.id_implements != null) {
            if (this.id_implements.Sy()) {
               rjU_2 var1 = this.id_implements.m();
               rjU_2 var2 = this.id_implements.rv();
               rrLJ var3 = rrLJ.id_class(this.id_implements, 1.5, 1.5, 1.5);
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
               if (!var3.id_byte()) {
                  double var4 = var3.id_protected();
                  double var6 = var3.id_break();
                  double var8 = var3.id_throws();
                  this.id_implements
                     .id_byte(
                        var2.id_break(
                           var1.id_break * 0.1 + (var1.id_break * var4 - var2.id_break) * 0.5,
                           var1.id_byte * 0.1 + (var1.id_byte * var6 - var2.id_byte) * 0.5,
                           var1.id_protected * 0.1 + (var1.id_protected * var8 - var2.id_protected) * 0.5
                        )
                     );
               }
            }

            this.id_new(this.id_implements.rx(), this.id_implements.re(), this.id_implements.BO());
            this.id_byte(this.id_implements.rv());
         }
      } else {
         if (!this.id_protected()) {
            double var15 = this.id_throws[23] ? 1.0 : 1.15;
            this.id_byte(this.rv().id_throws(var15, 1.0, var15).id_break(0.0, 0.04, 0.0));
         }

         rjU_2 var16 = this.rv();
         this.id_class(iG_2.SELF, var16);
         this.id_byte(var16);
      }

      rjG_2 var17 = rhj_3.id_class(this, this::id_class);
      if (!(Boolean)this.id_throws[38]) {
         this.id_class(var17);
         Boolean var14 = true;
         this.id_throws[57] = var14;
      }

      this.id_return();
      if (this.id_catch == 0 && !this.BF()) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.Sh, rqL_2.AMBIENT, 3.0F, 1.0F);
      }

      this.id_catch++;
      if (((rYB)this.id_throws[7]).id_continue && this.id_catch % 2 < 2) {
         ((rYB)this.id_throws[7])
            .id_class(
               rLQ.id_goto,
               this.rx(),
               this.re() - 0.3,
               this.BO(),
               ((Random)this.id_throws[40]).nextGaussian() * 0.05,
               -this.rv().id_byte * 0.5,
               ((Random)this.id_throws[40]).nextGaussian() * 0.05
            );
      }

      if (!((rYB)this.id_throws[7]).id_continue && this.id_catch > this.id_private) {
         this.id_throws();
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Life", this.id_catch);
      var1.id_break("LifeTime", this.id_private);
      rdn_3 var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      if (!var2.id_class()) {
         var1.id_class("FireworksItem", var2.id_break(new rcd_3()));
      }

      var1.id_class("ShotAtAngle", ((rmE_2)this.id_throws[49]).id_class(id_protected));
   }

   @Override
   protected void id_class(rff_3 var1) {
      rfH_2 var2 = new rfH_2(var1.id_class());
      ((rYB)this.id_throws[7]).id_byte(var2).id_class((rYB)this.id_throws[7], var2, this);
      if (!((rYB)this.id_throws[7]).id_import() && this.id_case()) {
         this.id_throws();
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 17 && ((rYB)this.id_throws[7]).id_continue) {
         if (!this.id_case()) {
            for (int var2 = 0; var2 < ((Random)this.id_throws[40]).nextInt(3) + 2; var2++) {
               ((rYB)this.id_throws[7])
                  .id_class(
                     rLQ.id_boolean,
                     this.rx(),
                     this.re(),
                     this.BO(),
                     ((Random)this.id_throws[40]).nextGaussian() * 0.05,
                     0.005,
                     ((Random)this.id_throws[40]).nextGaussian() * 0.05
                  );
            }
         } else {
            rdn_3 var5 = ((rmE_2)this.id_throws[49]).id_class(id_class);
            rcd_3 var3 = var5.id_class() ? null : var5.id_break("Fireworks");
            rjU_2 var4 = this.rv();
            ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), var4.id_break, var4.id_byte, var4.id_protected, var3);
         }
      }

      super.id_class(var1);
   }

   @Override
   public rdn_3 id_class() {
      rdn_3 var1 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      return var1.id_class() ? new rdn_3(rdy_3.dc) : var1;
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_throws();
      }
   }

   @Override
   public boolean id_class(double var1) {
      return var1 < 4096.0 && !this.id_private();
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_catch = var1.id_private("Life");
      this.id_private = var1.id_private("LifeTime");
      rdn_3 var2 = rdn_3.id_class(var1.id_int("FireworksItem"));
      if (!var2.id_class()) {
         ((rmE_2)this.id_throws[49]).id_break(id_class, var2);
      }

      if (var1.id_throws("ShotAtAngle")) {
         ((rmE_2)this.id_throws[49]).id_break(id_protected, var1.id_new("ShotAtAngle"));
      }
   }

   private void id_throws() {
      ((rYB)this.id_throws[7]).id_class(this, (byte)17);
      this.id_catch();
      this.PD();
   }

   @Override
   public boolean rt() {
      return false;
   }

   private void id_catch() {
      float var1 = 0.0F;
      rdn_3 var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      rcd_3 var3 = var2.id_class() ? null : var2.id_break("Fireworks");
      rcy_3 var4 = var3 != null ? var3.id_protected("Explosions", 10) : null;
      if (var4 != null && !var4.isEmpty()) {
         var1 = 5.0F + (float)(var4.size() * 2);
      }

      if (var1 > 0.0F) {
         if (this.id_implements != null) {
            this.id_implements.id_break(rye_3.id_class(this, this.id_else()), 5.0F + (float)(var4.size() * 2));
         }

         double var5 = 5.0;
         rjU_2 var7 = this.Ps();

         for (iB_2 var9 : ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN().id_class(5.0))) {
            if (var9 != this.id_implements && !(this.id_int(var9) > 25.0)) {
               boolean var10 = false;

               for (int var11 = 0; var11 < 2; var11++) {
                  rjU_2 var12 = new rjU_2(var9.rx(), var9.id_byte(0.5 * (double)var11), var9.BO());
                  rff_3 var13 = ((rYB)this.id_throws[7]).id_class(new rjB_2(var7, var12, rjS_2.COLLIDER, rjs_3.NONE, this));
                  if (var13.id_byte() == rjM_2.MISS) {
                     var10 = true;
                     break;
                  }
               }

               if (var10) {
                  float var14 = var1 * (float)Math.sqrt((5.0 - (double)this.id_implements(var9)) / 5.0);
                  var9.id_break(rye_3.id_class(this, this.id_else()), var14);
               }
            }
         }
      }
   }

   private boolean id_case() {
      rdn_3 var1 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      rcd_3 var2 = var1.id_class() ? null : var1.id_break("Fireworks");
      rcy_3 var3 = var2 != null ? var2.id_protected("Explosions", 10) : null;
      return var3 != null && !var3.isEmpty();
   }

   @Override
   public boolean id_protected() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected);
   }

   private boolean id_private() {
      return ((rmE_2)this.id_throws[49]).id_class(id_break).isPresent();
   }

   @Override
   public boolean id_final(double var1, double var3, double var5) {
      return super.id_final(var1, var3, var5) && !this.id_private();
   }

   @Override
   protected void m_() {
      ((rmE_2)this.id_throws[49]).id_class(id_class, rdn_3.id_break);
      ((rmE_2)this.id_throws[49]).id_class(id_break, OptionalInt.empty());
      ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
