package celestial;

import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rHy_1 extends rHp_1 implements rHf_1 {
   private static final Logger class_ = LogManager.getLogger();
   private long break_;
   private int byte_;
   private rfH_2 protected_;
   private boolean throws_;

   public rHy_1() {
      super(ryW_2.else_);
   }

   public float class_(float var1) {
      return rfU_2.class_(((float)this.break_ + var1) / 200.0F, 0.0F, 1.0F);
   }

   private void class_(rrEm_1 var1) {
      rjU_2 var2 = new rjU_2((double)this.char_().b_(), 0.0, (double)this.char_().d_()).protected_();
      rjU_2 var3 = var2.class_(1024.0);

      for (int var4 = 16; class_(var1, var3).char_() > 0 && var4-- > 0; var3 = var3.throws_(var2.class_(-16.0))) {
         class_.debug("Skipping backwards past nonempty chunk at {}", var3);
      }

      for (int var5 = 16; class_(var1, var3).char_() == 0 && var5-- > 0; var3 = var3.throws_(var2.class_(16.0))) {
         class_.debug("Skipping forward past empty chunk at {}", var3);
      }

      class_.debug("Found chunk at {}", var3);
      roJ_2 var6 = class_(var1, var3);
      this.protected_ = class_(var6);
      if (this.protected_ == null) {
         this.protected_ = new rfH_2(var3.break_ + 0.5, 75.0, var3.protected_ + 0.5);
         class_.debug("Failed to find suitable block, settling on {}", this.protected_);
         rUx_1.throws_.class_(var1, var1.else_().implements_(), new Random(this.protected_.package_()), this.protected_);
      } else {
         class_.debug("Found block at {}", this.protected_);
      }

      this.protected_ = class_(var1, this.protected_, 16, true);
      class_.debug("Creating portal at {}", this.protected_);
      this.protected_ = this.protected_.break_(10);
      this.class_(var1, this.protected_);
      this.break_();
   }

   private static rfH_2 class_(roJ_2 var0) {
      rfj_3 var1 = var0.private_();
      rfH_2 var2 = new rfH_2(var1.break_(), 30, var1.byte_());
      int var3 = var0.char_() + 16 - 1;
      rfH_2 var4 = new rfH_2(var1.protected_(), var3, var1.throws_());
      rfH_2 var5 = null;
      double var6 = 0.0;

      for (rfH_2 var9 : rfH_2.class_(var2, var4)) {
         xc_3 var10 = var0.byte_(var9);
         rfH_2 var11 = var9.final_();
         rfH_2 var12 = var9.break_(2);
         if (var10.class_(xu_3.Sh) && !var0.byte_(var11).new_(var0, var11) && !var0.byte_(var12).new_(var0, var12)) {
            double var13 = var9.class_(0.0, 0.0, 0.0, true);
            if (var5 == null || var13 < var6) {
               var5 = var9;
               var6 = var13;
            }
         }
      }

      return var5;
   }

   private static roJ_2 class_(rYB var0, rjU_2 var1) {
      return var0.throws_(rfU_2.byte_(var1.break_ / 16.0), rfU_2.byte_(var1.protected_ / 16.0));
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Age", this.break_);
      if (this.protected_ != null) {
         var1.class_("ExitPortal", rco_3.class_(this.protected_));
      }

      if (this.throws_) {
         var1.class_("ExactTeleport", this.throws_);
      }

      return var1;
   }

   private static rfH_2 class_(rRq_1 var0, rfH_2 var1, int var2, boolean var3) {
      rfH_2 var4 = null;

      for (int var5 = -var2; var5 <= var2; var5++) {
         for (int var6 = -var2; var6 <= var2; var6++) {
            if (var5 != 0 || var6 != 0 || var3) {
               for (int var7 = 255; var7 > (var4 == null ? 0 : var4.c_()); var7--) {
                  rfH_2 var8 = new rfH_2(var1.b_() + var5, var7, var1.d_() + var6);
                  xc_3 var9 = var0.byte_(var8);
                  if (var9.new_(var0, var8) && (var3 || !var9.class_(xu_3.while_))) {
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
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.break_ = var2.implements_("Age");
      if (var2.byte_("ExitPortal", 10)) {
         this.protected_ = rco_3.break_(var2.int_("ExitPortal"));
      }

      this.throws_ = var2.new_("ExactTeleport");
   }

   public void class_(rfH_2 var1, boolean var2) {
      this.throws_ = var2;
      this.protected_ = var1;
   }

   public static boolean class_(an_3 var0) {
      return rpJ_2.catch_.test(var0) && !var0.PO().rZ();
   }

   private void class_(rrEm_1 var1, rfH_2 var2) {
      rUO.interface_.break_(rUP.class_(this.char_(), false)).class_(var1, var1.else_().implements_(), new Random(), var2);
   }

   @Override
   public boolean class_(rpr_3 var1) {
      return xd_3.byte_(this.abstract_(), this.extends_, this.char_(), var1);
   }

   public void break_(an_3 var1) {
      if (this.extends_ instanceof rrEm_1 && !this.private_()) {
         this.byte_ = 100;
         if (this.protected_ == null && this.extends_.E() == rYB.throws_) {
            this.class_((rrEm_1)this.extends_);
         }

         if (this.protected_ != null) {
            rfH_2 var2 = this.throws_ ? this.protected_ : this.native_();
            an_3 var3;
            if (var1 instanceof rSi_1) {
               an_3 var4 = ((rSi_1)var1).else_();
               if (var4 instanceof rhN_2) {
                  Oo_1.protected_.class_((rhN_2)var4, this.extends_.byte_(this.char_()));
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
            var3.throws_((double)var2.b_() + 0.5, (double)var2.c_(), (double)var2.d_() + 0.5);
         }

         this.finally_();
      }
   }

   public float break_(float var1) {
      return 1.0F - rfU_2.class_(((float)this.byte_ - var1) / 40.0F, 0.0F, 1.0F);
   }

   @Override
   public void throws_() {
      boolean var1 = this.catch_();
      boolean var2 = this.private_();
      this.break_++;
      if (var2) {
         this.byte_--;
      } else if (!this.extends_.continue_) {
         List var3 = this.extends_.class_(an_3.class, new rfl_3(this.char_()), rHy_1::class_);
         if (!var3.isEmpty()) {
            this.break_((an_3)var3.get(this.extends_.int_.nextInt(var3.size())));
         }

         if (this.break_ % 2400L == 0L) {
            this.finally_();
         }
      }

      if (var1 != this.catch_() || var2 != this.private_()) {
         this.break_();
      }
   }

   public void finally_() {
      if (!this.extends_.continue_) {
         this.byte_ = 40;
         this.extends_.class_(this.char_(), this.abstract_().break_(), 1, 0);
         this.break_();
      }
   }

   public boolean catch_() {
      return this.break_ < 200L;
   }

   public int extends_() {
      int var1 = 0;

      for (rpr_3 var5 : rpr_3.values()) {
         var1 += this.class_(var5) ? 1 : 0;
      }

      return var1;
   }

   @Override
   public double implements_() {
      return 256.0;
   }

   public boolean private_() {
      return this.byte_ > 0;
   }

   private rfH_2 native_() {
      rfH_2 var1 = class_(this.extends_, this.protected_.break_(0, 2, 0), 5, false);
      class_.debug("Best exit position for portal at {} is {}", this.protected_, var1);
      return var1.final_();
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.byte_ = 40;
         return true;
      } else {
         return super.a_(var1, var2);
      }
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 8, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }
}
