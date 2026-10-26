package celestial;

public class rrkO extends rrXi_1 {
   private rrdy_1 throws_ = null;

   public rrkO(rrdy_1 var1, int var2, int var3, int var4, int var5) {
      super(var1.ordinal(), var2, var3, var4, var5, class_(var1));
      this.throws_ = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static String class_(rrdy_1 var0) {
      String var1 = jI_2.class_(var0.class_()) + ": ";
      switch (var0) {
         case ANTIALIASING:
            return var1 + rrkx_1.break_(rrdZ.So);
         case NORMAL_MAP:
            return var1 + rrkx_1.byte_(rrdZ.SV);
         case SPECULAR_MAP:
            return var1 + rrkx_1.byte_(rrdZ.Sg);
         case RENDER_RES_MUL:
            return var1 + rrkx_1.class_(rrdZ.Sy);
         case SHADOW_RES_MUL:
            return var1 + rrkx_1.class_(rrdZ.Sp);
         case HAND_DEPTH_MUL:
            return var1 + rrkx_1.break_(rrdZ.SH);
         case CLOUD_SHADOW:
            return var1 + rrkx_1.byte_(rrdZ.Sl);
         case OLD_HAND_LIGHT:
            return var1 + rrdZ.SY.break_();
         case OLD_LIGHTING:
            return var1 + rrdZ.SR.break_();
         case SHADOW_CLIP_FRUSTRUM:
            return var1 + rrkx_1.byte_(rrdZ.Sj);
         case TWEAK_BLOCK_DAMAGE:
            return var1 + rrkx_1.byte_(rrdZ.SC);
         default:
            return var1 + rrdZ.class_(var0);
      }
   }

   @Override
   protected boolean break_(int var1) {
      return true;
   }

   public void implements_() {
      this.class_(class_(this.throws_));
   }

   public rrdy_1 private_() {
      return this.throws_;
   }
}
