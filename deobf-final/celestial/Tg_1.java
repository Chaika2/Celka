package celestial;

public class Tg_1<T extends rMF> extends Tf_1<T, tL_2<T>> {
   private Iq_1 class_;
   private static final rqO_2 break_ = new rqO_2("textures/entity/cow/red_mushroom.png");
   private static final rqO_2 byte_ = new rqO_2("textures/entity/cow/brown_mushroom.png");
   private static boolean protected_ = false;
   private static boolean throws_ = false;

   public Tg_1(qE_2<T, tL_2<T>> var1) {
      super(var1);
      this.class_ = new Iq_1(var1.class_());
      this.class_.break_(16, 16);
      this.class_.byte_ = 8.0F;
      this.class_.throws_ = 8.0F;
      this.class_.catch_ = rfU_2.break_ / 4.0F;
      int[][] var3 = new int[][]{null, null, {16, 16, 0, 0}, {16, 16, 0, 0}, null, null};
      this.class_.class_(var3, -10.0F, 0.0F, 0.0F, 20.0F, 16.0F, 0.0F, 0.0F);
      int[][] var4 = new int[][]{null, null, null, null, {16, 16, 0, 0}, {16, 16, 0, 0}};
      this.class_.class_(var4, 0.0F, 0.0F, -10.0F, 0.0F, 16.0F, 20.0F, 0.0F);
   }

   public static void class_() {
      protected_ = rrbb_3.byte_(break_);
      throws_ = rrbb_3.byte_(byte_);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.n_() && !var4.Pp()) {
         lo_3 var11 = QY.instanceof_().synchronized_();
         xc_3 var12 = var4.n().class_();
         rqO_2 var13 = this.class_(var12);
         Ok_1 var14 = null;
         if (var13 != null) {
            var14 = var2.getBuffer(HU.byte_(var13));
         }

         int var15 = qd_3.byte_(var4, 0.0F);
         var1.class_();
         var1.class_(0.2F, -0.35F, 0.5);
         var1.class_(rje_3.protected_.byte_(-48.0F));
         var1.class_(-1.0F, -1.0F, 1.0F);
         var1.class_(-0.5, -0.5, -0.5);
         if (var13 != null) {
            this.class_.class_(var1, var14, var3, var15);
         } else {
            var11.class_(var12, var1, var2, var3, var15);
         }

         var1.break_();
         var1.class_();
         var1.class_(0.2F, -0.35F, 0.5);
         var1.class_(rje_3.protected_.byte_(42.0F));
         var1.class_(0.1F, 0.0, -0.6F);
         var1.class_(rje_3.protected_.byte_(-48.0F));
         var1.class_(-1.0F, -1.0F, 1.0F);
         var1.class_(-0.5, -0.5, -0.5);
         if (var13 != null) {
            this.class_.class_(var1, var14, var3, var15);
         } else {
            var11.class_(var12, var1, var2, var3, var15);
         }

         var1.break_();
         var1.class_();
         this.byte_().byte_().class_(var1);
         var1.class_(0.0, -0.7F, -0.2F);
         var1.class_(rje_3.protected_.byte_(-78.0F));
         var1.class_(-1.0F, -1.0F, 1.0F);
         var1.class_(-0.5, -0.5, -0.5);
         if (var13 != null) {
            this.class_.class_(var1, var14, var3, var15);
         } else {
            var11.class_(var12, var1, var2, var3, var15);
         }

         var1.break_();
      }
   }

   private rqO_2 class_(xc_3 var1) {
      xd_3 var2 = var1.break_();
      if (var2 == xu_3.rT && protected_) {
         return break_;
      } else {
         return var2 == xu_3.rq && throws_ ? byte_ : null;
      }
   }
}
