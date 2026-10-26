package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Lm_1 extends LZ {
   protected rqO_2 id_class;
   protected boolean id_throws;
   protected int id_case;
   protected int id_catch;
   protected int id_private;
   protected int id_implements;

   public void id_byte(boolean var1) {
      this.id_throws = var1;
   }

   public Lm_1(int var1, int var2, int var3, int var4, boolean var5) {
      super(var1, var2, var3, var4, rgN_2.id_byte);
      this.id_throws = var5;
   }

   public void id_class(int var1, int var2, int var3, int var4, rqO_2 var5) {
      this.id_case = var1;
      this.id_catch = var2;
      this.id_private = var3;
      this.id_implements = var4;
      this.id_class = var5;
   }

   public void id_class(int var1, int var2) {
      this.id_volatile = var1;
      this.id_final = var2;
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.id_instanceof();
      var5.A().id_class(this.id_class);
      RenderSystem.disableDepthTest();
      int var6 = this.id_case;
      int var7 = this.id_catch;
      if (this.id_throws) {
         var6 += this.id_private;
      }

      if (this.B_()) {
         var7 += this.id_implements;
      }

      this.id_break(var1, this.id_volatile, this.id_final, var6, var7, this.id_extends, this.id_native);
      RenderSystem.enableDepthTest();
   }

   public boolean id_catch() {
      return this.id_throws;
   }
}
