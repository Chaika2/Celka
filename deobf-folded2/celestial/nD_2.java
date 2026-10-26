package celestial;

public class nD_2 implements CX<rLX> {
   private final Ch_1 id_class;

   public nD_2(Ch_1 var1) {
      this.id_class = var1;
   }

   public CH id_class(rLX var1, gm_3 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      xc_3 var15 = var1.id_class();
      if (!var15.id_catch() && var15.id_private() == xN_2.INVISIBLE) {
         return null;
      } else {
         rfH_2 var16 = new rfH_2(var3, var5, var7);
         int var17 = QY.id_instanceof().s().id_class(var15, var2, var16);
         if (var15.id_break() instanceof dH_2) {
            var17 = ((dH_2)var15.id_break()).id_catch(var15, var2, var16);
         }

         float var18 = (float)(var17 >> 16 & 0xFF) / 255.0F;
         float var19 = (float)(var17 >> 8 & 0xFF) / 255.0F;
         float var20 = (float)(var17 & 0xFF) / 255.0F;
         return new nK_2(var2, var3, var5, var7, var18, var19, var20, this.id_class);
      }
   }
}
