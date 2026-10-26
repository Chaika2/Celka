package celestial;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

public abstract class gF_2 {
   private static final Object2ObjectMap<rqO_2, gF_2> id_class = rqR_2.id_class(new Object2ObjectArrayMap(), var0 -> {
      gC_2 var1 = new gC_2();
      var0.defaultReturnValue(var1);
      var0.put(rRJ.id_class, var1);
      var0.put(rRJ.id_break, new gn_3());
      var0.put(rRJ.id_byte, new gL_2());
   });
   private final float[] id_break = new float[4];
   private final float id_byte;
   private final boolean id_protected;
   private final gA_2 id_throws;
   private final boolean id_case;
   private final boolean id_catch;

   public gA_2 id_byte() {
      return this.id_throws;
   }

   public gF_2(float var1, boolean var2, gA_2 var3, boolean var4, boolean var5) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var5;
   }

   public float[] id_class(float var1, float var2) {
      float var3 = 0.4F;
      float var4 = rfU_2.id_break(var1 * (float) (Math.PI * 2)) - 0.0F;
      float var5 = -0.0F;
      if (var4 >= -0.4F && var4 <= 0.4F) {
         float var6 = (var4 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float var7 = 1.0F - (1.0F - rfU_2.id_class(var6 * (float) Math.PI)) * 0.99F;
         var7 *= var7;
         this.id_break[0] = var6 * 0.3F + 0.7F;
         this.id_break[1] = var6 * var6 * 0.7F + 0.2F;
         this.id_break[2] = var6 * var6 * 0.0F + 0.2F;
         this.id_break[3] = var7;
         return this.id_break;
      } else {
         return null;
      }
   }

   public static gF_2 id_class(rRJ var0) {
      return (gF_2)id_class.get(var0.id_int());
   }

   public abstract boolean id_class(int var1, int var2);

   public float id_class() {
      return this.id_byte;
   }

   public abstract rjU_2 id_class(rjU_2 var1, float var2);

   public boolean id_break() {
      return this.id_protected;
   }

   public boolean id_throws() {
      return this.id_catch;
   }

   public boolean id_protected() {
      return this.id_case;
   }
}
