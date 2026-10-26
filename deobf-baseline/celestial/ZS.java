package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class ZS extends vm_3 {
   private final rgP_2 id_class;
   private final boolean id_throws;
   private rgP_2 id_case;

   private void id_byte(boolean var1) {
      if (var1) {
         this.id_finally();
      } else {
         ((cb_3)this.id_volatile.id_class[57]).J();
         this.id_volatile.id_break((vm_3)null);
      }
   }

   public ZS(rgP_2 var1, boolean var2) {
      super(new rgn_3(var2 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.id_class = var1;
      this.id_throws = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1, 0, 0, this.id_package, this.id_int, 1615855616, -1602211792);
      RenderSystem.pushMatrix();
      RenderSystem.scalef(2.0F, 2.0F, 2.0F);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2 / 2, 30, 16777215);
      RenderSystem.popMatrix();
      if (this.id_class != null) {
         id_class(var1, this.id_super, this.id_class, this.id_package / 2, 85, 16777215);
      }

      id_class(var1, this.id_super, this.id_case, this.id_package / 2, 100, 16777215);
      if (this.id_class != null && var3 > 85 && var3 < 94) {
         rgc_3 var5 = this.id_break(var2);
         this.id_class(var1, var5, var2, var3);
      }

      super.id_class(var1, var2, var3, var4);
   }

   private rgc_3 id_break(int var1) {
      if (this.id_class == null) {
         return null;
      } else {
         int var2 = ((cm_3)this.id_volatile.id_class[15]).id_class(this.id_class);
         int var3 = this.id_package / 2 - var2 / 2;
         int var4 = this.id_package / 2 + var2 / 2;
         return var1 >= var3 && var1 <= var4 ? ((cm_3)this.id_volatile.id_class[15]).id_break().id_class(this.id_class, var1 - var3) : null;
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_class != null && var3 > 85.0 && var3 < 94.0) {
         rgc_3 var6 = this.id_break((int)var1);
         if (var6 != null && var6.id_private() != null && var6.id_private().id_class() == rgH_2.OPEN_URL) {
            this.id_class(var6);
            return false;
         }
      }

      return super.id_break(var1, var3, var5);
   }

   private void id_finally() {
      if ((gm_3)this.id_volatile.id_class[56] != null) {
         ((gm_3)this.id_volatile.id_class[56]).id_catch();
      }

      this.id_volatile.id_byte(new ZE(new rgn_3("menu.savingLevel")));
      this.id_volatile.id_break(new rrvL());
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      this.id_class(
         new LF(
            this.id_package / 2 - 100,
            this.id_int / 4 + 72,
            200,
            20,
            this.id_throws ? new rgn_3("deathScreen.spectate") : new rgn_3("deathScreen.respawn"),
            var1x -> {
               ((cb_3)this.id_volatile.id_class[57]).J();
               this.id_volatile.id_break((vm_3)null);
            }
         )
      );
      LF var1 = this.id_class(
         new LF(
            this.id_package / 2 - 100,
            this.id_int / 4 + 96,
            200,
            20,
            new rgn_3("deathScreen.titleScreen"),
            var1x -> {
               if (this.id_throws) {
                  this.id_finally();
               } else {
                  mT_2 var2 = new mT_2(
                     this::id_byte,
                     new rgn_3("deathScreen.quit.confirm"),
                     rgN_2.id_byte,
                     new rgn_3("deathScreen.titleScreen"),
                     new rgn_3("deathScreen.respawn")
                  );
                  this.id_volatile.id_break(var2);
                  var2.id_break(20);
               }
            }
         )
      );
      if (!this.id_throws && this.id_volatile.id_while() == null) {
         var1.id_int = false;
      }

      this.id_case = new rgn_3("deathScreen.score")
         .id_break(": ")
         .id_class(new rgN_2(Integer.toString(((cb_3)this.id_volatile.id_class[57]).sp())).id_class(rgF_2.YELLOW));
   }

   @Override
   public boolean z_() {
      return false;
   }
}
