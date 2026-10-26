package celestial;

public class Np_1 extends Nv_1 {
   public static Np_1 byte_(rqA_2 var0, float var1, float var2) {
      return new Np_1(var0.class_(), rqL_2.AMBIENT, var2, var1, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
   }

   public Np_1(rqA_2 var1, rqL_2 var2, float var3, float var4, rfH_2 var5) {
      this(var1, var2, var3, var4, (double)var5.b_() + 0.5, (double)var5.c_() + 0.5, (double)var5.d_() + 0.5);
   }

   public Np_1(rqA_2 var1, rqL_2 var2, float var3, float var4, double var5, double var7, double var9) {
      this(var1, var2, var3, var4, false, 0, NN.LINEAR, var5, var7, var9);
   }

   private Np_1(rqA_2 var1, rqL_2 var2, float var3, float var4, boolean var5, int var6, NN var7, double var8, double var10, double var12) {
      this(var1.class_(), var2, var3, var4, var5, var6, var7, var8, var10, var12, false);
   }

   public Np_1(rqO_2 var1, rqL_2 var2, float var3, float var4, boolean var5, int var6, NN var7, double var8, double var10, double var12, boolean var14) {
      super(var1, var2);
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var8;
      this.private_ = var10;
      this.implements_ = var12;
      this.finally_ = var5;
      this.extends_ = var6;
      this.native_ = var7;
      this.final_ = var14;
   }

   public static Np_1 class_(rqA_2 var0, float var1, float var2) {
      return new Np_1(var0.class_(), rqL_2.MASTER, var2, var1, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
   }

   public static Np_1 class_(rqA_2 var0, float var1) {
      return class_(var0, var1, 0.25F);
   }

   public static Np_1 class_(rqA_2 var0) {
      return new Np_1(var0.class_(), rqL_2.MUSIC, 1.0F, 1.0F, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
   }

   public static Np_1 class_(rqA_2 var0, double var1, double var3, double var5) {
      return new Np_1(var0, rqL_2.RECORDS, 4.0F, 1.0F, false, 0, NN.LINEAR, var1, var3, var5);
   }

   public static Np_1 break_(rqA_2 var0, double var1, double var3, double var5) {
      return new Np_1(var0, rqL_2.AMBIENT, 1.0F, 1.0F, false, 0, NN.LINEAR, var1, var3, var5);
   }

   public static Np_1 break_(rqA_2 var0, float var1, float var2) {
      return new Np_1(var0.class_(), rqL_2.CLIENT, var1, var2, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
   }

   public static Np_1 break_(rqA_2 var0) {
      return byte_(var0, 1.0F, 1.0F);
   }
}
