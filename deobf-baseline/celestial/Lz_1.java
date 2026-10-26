package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public abstract class Lz_1 extends LZ {
   protected double id_throws;

   @Override
   public void id_byte(double var1, double var3) {
      this.id_class(var1);
   }

   public Lz_1(int var1, int var2, int var3, int var4, rgP_2 var5, double var6) {
      super(var1, var2, var3, var4, var5);
      this.id_throws = var6;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      boolean var4 = var1 == 263;
      if (var4 || var1 == 262) {
         float var5 = var4 ? -1.0F : 1.0F;
         this.id_break(this.id_throws + (double)(var5 / (float)(this.id_extends - 8)));
      }

      return false;
   }

   private void id_class(double var1) {
      this.id_break((var1 - (double)(this.id_volatile + 4)) / (double)(this.id_extends - 8));
   }

   @Override
   protected void id_class(double var1, double var3, double var5, double var7) {
      this.id_class(var1);
      super.id_class(var1, var3, var5, var7);
   }

   @Override
   public void id_class(Nf_1 var1) {
   }

   @Override
   protected void id_class(Ml_1 var1, QY var2, int var3, int var4) {
      var2.A().id_class(id_finally);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var5 = (this.B_() ? 2 : 1) * 20;
      this.id_break(var1, this.id_volatile + (int)(this.id_throws * (double)(this.id_extends - 8)), this.id_final, 0, 46 + var5, 4, 20);
      this.id_break(var1, this.id_volatile + (int)(this.id_throws * (double)(this.id_extends - 8)) + 4, this.id_final, 196, 46 + var5, 4, 20);
   }

   private void id_break(double var1) {
      double var3 = this.id_throws;
      this.id_throws = rfU_2.id_class(var1, 0.0, 1.0);
      if (var3 != this.id_throws) {
         this.id_private();
      }

      this.id_catch();
   }

   protected abstract void id_catch();

   @Override
   public void id_protected(double var1, double var3) {
      super.id_class(QY.id_instanceof().c());
   }

   protected abstract void id_private();

   @Override
   protected int a_(boolean var1) {
      return 0;
   }

   @Override
   protected rVi_1 A_() {
      return new rgn_3("gui.narrate.slider", this.C_());
   }
}
