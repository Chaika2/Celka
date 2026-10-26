package celestial;

public class rrkO extends rrXi_1 {
   private rrdy_1 id_throws = null;

   public rrkO(rrdy_1 var1, int var2, int var3, int var4, int var5) {
      super(var1.ordinal(), var2, var3, var4, var5, id_class(var1));
      this.id_throws = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static String id_class(rrdy_1 var0) {
      String var1 = jI_2.id_class(var0.id_class()) + ": ";
      switch (var0) {
         case ANTIALIASING:
            return var1 + rrkx_1.id_break(rrdZ.So);
         case NORMAL_MAP:
            return var1 + rrkx_1.id_byte(rrdZ.SV);
         case SPECULAR_MAP:
            return var1 + rrkx_1.id_byte(rrdZ.Sg);
         case RENDER_RES_MUL:
            return var1 + rrkx_1.id_class(rrdZ.Sy);
         case SHADOW_RES_MUL:
            return var1 + rrkx_1.id_class(rrdZ.Sp);
         case HAND_DEPTH_MUL:
            return var1 + rrkx_1.id_break(rrdZ.SH);
         case CLOUD_SHADOW:
            return var1 + rrkx_1.id_byte(rrdZ.Sl);
         case OLD_HAND_LIGHT:
            return var1 + rrdZ.SY.id_break();
         case OLD_LIGHTING:
            return var1 + rrdZ.SR.id_break();
         case SHADOW_CLIP_FRUSTRUM:
            return var1 + rrkx_1.id_byte(rrdZ.Sj);
         case TWEAK_BLOCK_DAMAGE:
            return var1 + rrkx_1.id_byte(rrdZ.SC);
         default:
            return var1 + rrdZ.id_class(var0);
      }
   }

   @Override
   protected boolean id_break(int var1) {
      return true;
   }

   public void id_implements() {
      this.id_class(id_class(this.id_throws));
   }

   public rrdy_1 id_private() {
      return this.id_throws;
   }
}
