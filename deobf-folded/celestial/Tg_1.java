package celestial;

public class Tg_1<T extends rMF> extends Tf_1<T, tL_2<T>> {
   private Iq_1 id_class;
   private static final rqO_2 id_break = new rqO_2("textures/entity/cow/red_mushroom.png");
   private static final rqO_2 id_byte = new rqO_2("textures/entity/cow/brown_mushroom.png");
   private static boolean id_protected = false;
   private static boolean id_throws = false;

   public Tg_1(qE_2<T, tL_2<T>> var1) {
      super(var1);
      this.id_class = new Iq_1(var1.id_class());
      this.id_class.id_break(16, 16);
      this.id_class.id_byte = 8.0F;
      this.id_class.id_throws = 8.0F;
      this.id_class.id_catch = rfU_2.id_break / 4.0F;
      int[][] var3 = new int[][]{null, null, {16, 16, 0, 0}, {16, 16, 0, 0}, null, null};
      this.id_class.id_class(var3, -10.0F, 0.0F, 0.0F, 20.0F, 16.0F, 0.0F, 0.0F);
      int[][] var4 = new int[][]{null, null, null, null, {16, 16, 0, 0}, {16, 16, 0, 0}};
      this.id_class.id_class(var4, 0.0F, 0.0F, -10.0F, 0.0F, 16.0F, 20.0F, 0.0F);
   }

   public static void id_class() {
      id_protected = rrbb_3.id_byte(id_break);
      id_throws = rrbb_3.id_byte(id_byte);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.n_() && !var4.Pp()) {
         lo_3 var11 = QY.id_instanceof().id_synchronized();
         xc_3 var12 = var4.n().id_class();
         rqO_2 var13 = this.id_class(var12);
         Ok_1 var14 = null;
         if (var13 != null) {
            var14 = var2.getBuffer(HU.id_byte(var13));
         }

         int var15 = qd_3.id_byte(var4, 0.0F);
         var1.id_class();
         var1.id_class(0.2F, -0.35F, 0.5);
         var1.id_class(rje_3.id_protected.id_byte(-48.0F));
         var1.id_class(-1.0F, -1.0F, 1.0F);
         var1.id_class(-0.5, -0.5, -0.5);
         if (var13 != null) {
            this.id_class.id_class(var1, var14, var3, var15);
         } else {
            var11.id_class(var12, var1, var2, var3, var15);
         }

         var1.id_break();
         var1.id_class();
         var1.id_class(0.2F, -0.35F, 0.5);
         var1.id_class(rje_3.id_protected.id_byte(42.0F));
         var1.id_class(0.1F, 0.0, -0.6F);
         var1.id_class(rje_3.id_protected.id_byte(-48.0F));
         var1.id_class(-1.0F, -1.0F, 1.0F);
         var1.id_class(-0.5, -0.5, -0.5);
         if (var13 != null) {
            this.id_class.id_class(var1, var14, var3, var15);
         } else {
            var11.id_class(var12, var1, var2, var3, var15);
         }

         var1.id_break();
         var1.id_class();
         this.id_byte().id_byte().id_class(var1);
         var1.id_class(0.0, -0.7F, -0.2F);
         var1.id_class(rje_3.id_protected.id_byte(-78.0F));
         var1.id_class(-1.0F, -1.0F, 1.0F);
         var1.id_class(-0.5, -0.5, -0.5);
         if (var13 != null) {
            this.id_class.id_class(var1, var14, var3, var15);
         } else {
            var11.id_class(var12, var1, var2, var3, var15);
         }

         var1.id_break();
      }
   }

   private rqO_2 id_class(xc_3 var1) {
      xd_3 var2 = var1.id_break();
      if (var2 == xu_3.rT && id_protected) {
         return id_break;
      } else {
         return var2 == xu_3.rq && id_throws ? id_byte : null;
      }
   }
}
