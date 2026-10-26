package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Ln_1 extends LF {
   private final boolean id_class;
   private final boolean id_throws;

   public Ln_1(int var1, int var2, boolean var3, LL var4, boolean var5) {
      super(var1, var2, 23, 13, rgN_2.id_byte, var4);
      this.id_class = var3;
      this.id_throws = var5;
   }

   @Override
   public void id_class(Nf_1 var1) {
      if (this.id_throws) {
         var1.id_class(Np_1.id_class(rqn_3.rS, 1.0F));
      }
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      QY.id_instanceof().A().id_class(vz_3.id_throws);
      byte var5 = 0;
      short var6 = 192;
      if (this.B_()) {
         var5 += 23;
      }

      if (!this.id_class) {
         var6 += 13;
      }

      this.id_break(var1, this.id_volatile, this.id_final, var5, var6, 23, 13);
   }
}
