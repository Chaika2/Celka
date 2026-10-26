package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fl_1 extends Fu_1<rJQ> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/horse.png");
   private final rOD throws_;
   private float case_;
   private float catch_;

   public Fl_1(rJQ var1, rhz_3 var2, rOD var3) {
      super(var1, var2, var3.L_());
      this.throws_ = var3;
      this.continue_ = false;
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      if (this.throws_ instanceof rOK var7 && var7.sJ()) {
         this.break_(var1, var5 + 79, var6 + 17, 0, this.return_, var7.sc() * 18, 54);
      }

      if (this.throws_.class_()) {
         this.break_(var1, var5 + 7, var6 + 35 - 18, 18, this.return_ + 54, 18, 18);
      }

      if (this.throws_.sY()) {
         if (this.throws_ instanceof rhP_2) {
            this.break_(var1, var5 + 7, var6 + 35, 36, this.return_ + 54, 18, 18);
         } else {
            this.break_(var1, var5 + 7, var6 + 35, 0, this.return_ + 54, 18, 18);
         }
      }

      FH.class_(var5 + 51, var6 + 60, 17, (float)(var5 + 51) - this.case_, (float)(var6 + 75 - 50) - this.catch_, this.throws_);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.case_ = (float)var2;
      this.catch_ = (float)var3;
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }
}
