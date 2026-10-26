package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class ZS extends vm_3 {
   private final rgP_2 class_;
   private final boolean throws_;
   private rgP_2 case_;

   private void byte_(boolean var1) {
      if (var1) {
         this.finally_();
      } else {
         ((cb_3)this.volatile_.class_[57]).J();
         this.volatile_.break_((vm_3)null);
      }
   }

   public ZS(rgP_2 var1, boolean var2) {
      super(new rgn_3(var2 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.class_ = var1;
      this.throws_ = var2;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1, 0, 0, this.package_, this.int_, 1615855616, -1602211792);
      RenderSystem.pushMatrix();
      RenderSystem.scalef(2.0F, 2.0F, 2.0F);
      class_(var1, this.super_, this.extends_, this.package_ / 2 / 2, 30, 16777215);
      RenderSystem.popMatrix();
      if (this.class_ != null) {
         class_(var1, this.super_, this.class_, this.package_ / 2, 85, 16777215);
      }

      class_(var1, this.super_, this.case_, this.package_ / 2, 100, 16777215);
      if (this.class_ != null && var3 > 85 && var3 < 94) {
         rgc_3 var5 = this.break_(var2);
         this.class_(var1, var5, var2, var3);
      }

      super.class_(var1, var2, var3, var4);
   }

   private rgc_3 break_(int var1) {
      if (this.class_ == null) {
         return null;
      } else {
         int var2 = ((cm_3)this.volatile_.class_[15]).class_(this.class_);
         int var3 = this.package_ / 2 - var2 / 2;
         int var4 = this.package_ / 2 + var2 / 2;
         return var1 >= var3 && var1 <= var4 ? ((cm_3)this.volatile_.class_[15]).break_().class_(this.class_, var1 - var3) : null;
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.class_ != null && var3 > 85.0 && var3 < 94.0) {
         rgc_3 var6 = this.break_((int)var1);
         if (var6 != null && var6.private_() != null && var6.private_().class_() == rgH_2.OPEN_URL) {
            this.class_(var6);
            return false;
         }
      }

      return super.break_(var1, var3, var5);
   }

   private void finally_() {
      if ((gm_3)this.volatile_.class_[56] != null) {
         ((gm_3)this.volatile_.class_[56]).catch_();
      }

      this.volatile_.byte_(new ZE(new rgn_3("menu.savingLevel")));
      this.volatile_.break_(new rrvL());
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      this.class_(
         new LF(
            this.package_ / 2 - 100,
            this.int_ / 4 + 72,
            200,
            20,
            this.throws_ ? new rgn_3("deathScreen.spectate") : new rgn_3("deathScreen.respawn"),
            var1x -> {
               ((cb_3)this.volatile_.class_[57]).J();
               this.volatile_.break_((vm_3)null);
            }
         )
      );
      LF var1 = this.class_(
         new LF(
            this.package_ / 2 - 100,
            this.int_ / 4 + 96,
            200,
            20,
            new rgn_3("deathScreen.titleScreen"),
            var1x -> {
               if (this.throws_) {
                  this.finally_();
               } else {
                  mT_2 var2 = new mT_2(
                     this::byte_, new rgn_3("deathScreen.quit.confirm"), rgN_2.byte_, new rgn_3("deathScreen.titleScreen"), new rgn_3("deathScreen.respawn")
                  );
                  this.volatile_.break_(var2);
                  var2.break_(20);
               }
            }
         )
      );
      if (!this.throws_ && this.volatile_.while_() == null) {
         var1.int_ = false;
      }

      this.case_ = new rgn_3("deathScreen.score").break_(": ").class_(new rgN_2(Integer.toString(((cb_3)this.volatile_.class_[57]).sp())).class_(rgF_2.YELLOW));
   }

   @Override
   public boolean z_() {
      return false;
   }
}
