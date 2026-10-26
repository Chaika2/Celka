package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Zs_1 extends vm_3 {
   private static final rqO_2 id_class = new rqO_2("textures/gui/demo_background.png");
   private cv_3 id_throws = cv_3.id_class;
   private cv_3 id_case = cv_3.id_class;

   public Zs_1() {
      super(new rgn_3("demo.help.title"));
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      int var5 = (this.id_package - 248) / 2 + 10;
      int var6 = (this.id_int - 166) / 2 + 8;
      this.id_super.id_byte(var1, this.id_extends, (float)var5, (float)var6, 2039583);
      var6 = this.id_throws.id_byte(var1, var5, var6 + 12, 12, 5197647);
      this.id_case.id_byte(var1, var5, var6 + 20, 9, 2039583);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(Ml_1 var1) {
      super.id_class(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var2 = (this.id_package - 248) / 2;
      int var3 = (this.id_int - 166) / 2;
      this.id_break(var1, var2, var3, 0, 0, 248, 166);
   }

   @Override
   protected void v_() {
      byte var1 = -16;
      this.id_class((LF)(new LF(this.id_package / 2 - 116, this.id_int / 2 + 62 + -16, 114, 20, new rgn_3("demo.help.buy"), var0 -> {
         var0.id_int = false;
         rqR_2.id_implements().id_class("http://www.minecraft.net/store?source=demo");
      })));
      this.id_class((LF)(new LF(this.id_package / 2 + 2, this.id_int / 2 + 62 + -16, 114, 20, new rgn_3("demo.help.later"), var1x -> {
         this.id_volatile.id_break((vm_3)null);
         ((Qi_1)this.id_volatile.id_class[22]).id_catch();
      })));
      Qw_1 var2 = (Qw_1)this.id_volatile.id_class[20];
      this.id_throws = cv_3.id_class(
         this.id_super,
         new rgn_3("demo.help.movementShort", var2.h.id_native(), var2.X.id_native(), var2.J.id_native(), var2.x.id_native()),
         new rgn_3("demo.help.movementMouse"),
         new rgn_3("demo.help.jump", var2.d.id_native()),
         new rgn_3("demo.help.inventory", var2.z.id_native())
      );
      this.id_case = cv_3.id_class(this.id_super, new rgn_3("demo.help.fullWrapped"), 218);
   }
}
