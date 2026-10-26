package celestial;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

public abstract class gF_2 {
   private static final Object2ObjectMap<rqO_2, gF_2> class_ = rqR_2.class_(new Object2ObjectArrayMap(), var0 -> {
      gC_2 var1 = new gC_2();
      var0.defaultReturnValue(var1);
      var0.put(rRJ.class_, var1);
      var0.put(rRJ.break_, new gn_3());
      var0.put(rRJ.byte_, new gL_2());
   });
   private final float[] break_ = new float[4];
   private final float byte_;
   private final boolean protected_;
   private final gA_2 throws_;
   private final boolean case_;
   private final boolean catch_;

   public gA_2 byte_() {
      return this.throws_;
   }

   public gF_2(float var1, boolean var2, gA_2 var3, boolean var4, boolean var5) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var5;
   }

   public float[] class_(float var1, float var2) {
      float var3 = 0.4F;
      float var4 = rfU_2.break_(var1 * (float) (Math.PI * 2)) - 0.0F;
      float var5 = -0.0F;
      if (var4 >= -0.4F && var4 <= 0.4F) {
         float var6 = (var4 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float var7 = 1.0F - (1.0F - rfU_2.class_(var6 * (float) Math.PI)) * 0.99F;
         var7 *= var7;
         this.break_[0] = var6 * 0.3F + 0.7F;
         this.break_[1] = var6 * var6 * 0.7F + 0.2F;
         this.break_[2] = var6 * var6 * 0.0F + 0.2F;
         this.break_[3] = var7;
         return this.break_;
      } else {
         return null;
      }
   }

   public static gF_2 class_(rRJ var0) {
      return (gF_2)class_.get(var0.int_());
   }

   public abstract boolean class_(int var1, int var2);

   public float class_() {
      return this.byte_;
   }

   public abstract rjU_2 class_(rjU_2 var1, float var2);

   public boolean break_() {
      return this.protected_;
   }

   public boolean throws_() {
      return this.catch_;
   }

   public boolean protected_() {
      return this.case_;
   }
}
