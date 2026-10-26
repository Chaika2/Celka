package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fl_1 extends Fu_1<rJQ> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/horse.png");
   private final rOD id_throws;
   private float id_case;
   private float id_catch;

   public Fl_1(rJQ var1, rhz_3 var2, rOD var3) {
      super(var1, var2, var3.L_());
      this.id_throws = var3;
      this.id_continue = false;
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = (this.id_package - this.id_synchronized) / 2;
      int var6 = (this.id_int - this.id_return) / 2;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      if (this.id_throws instanceof rOK var7 && var7.sJ()) {
         this.id_break(var1, var5 + 79, var6 + 17, 0, this.id_return, var7.sc() * 18, 54);
      }

      if (this.id_throws.id_class()) {
         this.id_break(var1, var5 + 7, var6 + 35 - 18, 18, this.id_return + 54, 18, 18);
      }

      if (this.id_throws.sY()) {
         if (this.id_throws instanceof rhP_2) {
            this.id_break(var1, var5 + 7, var6 + 35, 36, this.id_return + 54, 18, 18);
         } else {
            this.id_break(var1, var5 + 7, var6 + 35, 0, this.id_return + 54, 18, 18);
         }
      }

      FH.id_class(var5 + 51, var6 + 60, 17, (float)(var5 + 51) - this.id_case, (float)(var6 + 75 - 50) - this.id_catch, this.id_throws);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_case = (float)var2;
      this.id_catch = (float)var3;
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }
}
