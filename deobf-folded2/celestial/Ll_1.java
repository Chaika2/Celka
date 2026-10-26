package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Ll_1 extends LF {
   private final rqO_2 id_class;
   private final int id_throws;
   private final int id_case;
   private final int id_catch;
   private final int id_this;
   private final int id_else;

   public Ll_1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, rqO_2 var8, int var9, int var10, LL var11, LA var12, rgP_2 var13) {
      super(var1, var2, var3, var4, var13, var11, var12);
      this.id_this = var9;
      this.id_else = var10;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_class = var8;
   }

   public Ll_1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, rqO_2 var8, int var9, int var10, LL var11, rgP_2 var12) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, id_private, var12);
   }

   public Ll_1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, rqO_2 var8, int var9, int var10, LL var11) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, rgN_2.id_byte);
   }

   public Ll_1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, rqO_2 var8, LL var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, 256, 256, var9);
   }

   public void id_class(int var1, int var2) {
      this.id_volatile = var1;
      this.id_final = var2;
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.id_instanceof();
      var5.A().id_class(this.id_class);
      int var6 = this.id_case;
      if (this.B_()) {
         var6 += this.id_catch;
      }

      RenderSystem.enableDepthTest();
      id_class(var1, this.id_volatile, this.id_final, (float)this.id_throws, (float)var6, this.id_extends, this.id_native, this.id_this, this.id_else);
      if (this.B_()) {
         this.id_class(var1, var2, var3);
      }
   }
}
