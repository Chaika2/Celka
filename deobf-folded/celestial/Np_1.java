package celestial;

public class Np_1 extends Nv_1 {
   public static Np_1 id_byte(rqA_2 var0, float var1, float var2) {
      return new Np_1(var0.id_class(), rqL_2.AMBIENT, var2, var1, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
   }

   public Np_1(rqA_2 var1, rqL_2 var2, float var3, float var4, rfH_2 var5) {
      this(var1, var2, var3, var4, (double)var5.b_() + 0.5, (double)var5.c_() + 0.5, (double)var5.d_() + 0.5);
   }

   public Np_1(rqA_2 var1, rqL_2 var2, float var3, float var4, double var5, double var7, double var9) {
      this(var1, var2, var3, var4, false, 0, NN.LINEAR, var5, var7, var9);
   }

   private Np_1(rqA_2 var1, rqL_2 var2, float var3, float var4, boolean var5, int var6, NN var7, double var8, double var10, double var12) {
      this(var1.id_class(), var2, var3, var4, var5, var6, var7, var8, var10, var12, false);
   }

   public Np_1(rqO_2 var1, rqL_2 var2, float var3, float var4, boolean var5, int var6, NN var7, double var8, double var10, double var12, boolean var14) {
      super(var1, var2);
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var8;
      this.id_private = var10;
      this.id_implements = var12;
      this.id_finally = var5;
      this.id_extends = var6;
      this.id_native = var7;
      this.id_final = var14;
   }

   public static Np_1 id_class(rqA_2 var0, float var1, float var2) {
      return new Np_1(var0.id_class(), rqL_2.MASTER, var2, var1, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
   }

   public static Np_1 id_class(rqA_2 var0, float var1) {
      return id_class(var0, var1, 0.25F);
   }

   public static Np_1 id_class(rqA_2 var0) {
      return new Np_1(var0.id_class(), rqL_2.MUSIC, 1.0F, 1.0F, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
   }

   public static Np_1 id_class(rqA_2 var0, double var1, double var3, double var5) {
      return new Np_1(var0, rqL_2.RECORDS, 4.0F, 1.0F, false, 0, NN.LINEAR, var1, var3, var5);
   }

   public static Np_1 id_break(rqA_2 var0, double var1, double var3, double var5) {
      return new Np_1(var0, rqL_2.AMBIENT, 1.0F, 1.0F, false, 0, NN.LINEAR, var1, var3, var5);
   }

   public static Np_1 id_break(rqA_2 var0, float var1, float var2) {
      return new Np_1(var0.id_class(), rqL_2.CLIENT, var1, var2, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
   }

   public static Np_1 id_break(rqA_2 var0) {
      return id_byte(var0, 1.0F, 1.0F);
   }
}
