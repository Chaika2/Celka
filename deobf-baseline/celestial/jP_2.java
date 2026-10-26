package celestial;

public class jP_2 extends jW_2<rHA> {
   public static final Ig_1 id_class = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/base"));
   public static final Ig_1 id_break = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/cage"));
   public static final Ig_1 id_byte = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/wind"));
   public static final Ig_1 id_protected = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/wind_vertical"));
   public static final Ig_1 id_throws = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/open_eye"));
   public static final Ig_1 id_case = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/closed_eye"));
   private final Iq_1 id_private = new Iq_1(16, 16, 0, 0);
   private final Iq_1 id_implements;
   private final Iq_1 id_finally;
   private final Iq_1 id_extends;

   public jP_2(jz_3 var1) {
      super(var1);
      this.id_private.id_class(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, 0.01F);
      this.id_implements = new Iq_1(64, 32, 0, 0);
      this.id_implements.id_class(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
      this.id_finally = new Iq_1(32, 16, 0, 0);
      this.id_finally.id_class(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      this.id_extends = new Iq_1(32, 16, 0, 0);
      this.id_extends.id_class(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
   }

   public void id_class(rHA var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      float var7 = (float)var1.id_class + var2;
      if (!var1.id_catch()) {
         float var8 = var1.id_class(0.0F);
         Ok_1 var9 = id_class.id_class(var4, HU::id_break);
         var3.id_class();
         var3.id_class(0.5, 0.5, 0.5);
         var3.id_class(rje_3.id_protected.id_byte(var8));
         this.id_finally.id_class(var3, var9, var5, var6);
         var3.id_break();
      } else {
         float var16 = var1.id_class(var2) * (180.0F / (float)Math.PI);
         float var17 = rfU_2.id_class(var7 * 0.1F) / 2.0F + 0.5F;
         var17 = var17 * var17 + var17;
         var3.id_class();
         var3.id_class(0.5, (double)(0.3F + var17 * 0.2F), 0.5);
         rje_3 var10 = new rje_3(0.5F, 1.0F, 0.5F);
         var10.id_protected();
         var3.id_class(new rjY_2(var10, var16, true));
         this.id_extends.id_class(var3, id_break.id_class(var4, HU::id_protected), var5, var6);
         var3.id_break();
         int var11 = var1.id_class / 66 % 3;
         var3.id_class();
         var3.id_class(0.5, 0.5, 0.5);
         if (var11 == 1) {
            var3.id_class(rje_3.id_break.id_byte(90.0F));
         } else if (var11 == 2) {
            var3.id_class(rje_3.id_case.id_byte(90.0F));
         }

         Ok_1 var12 = (var11 == 1 ? id_protected : id_byte).id_class(var4, HU::id_protected);
         this.id_implements.id_class(var3, var12, var5, var6);
         var3.id_break();
         var3.id_class();
         var3.id_class(0.5, 0.5, 0.5);
         var3.id_class(0.875F, 0.875F, 0.875F);
         var3.id_class(rje_3.id_break.id_byte(180.0F));
         var3.id_class(rje_3.id_case.id_byte(180.0F));
         this.id_implements.id_class(var3, var12, var5, var6);
         var3.id_break();
         ly_3 var13 = this.id_catch.id_throws;
         var3.id_class();
         var3.id_class(0.5, (double)(0.3F + var17 * 0.2F), 0.5);
         var3.id_class(0.5F, 0.5F, 0.5F);
         float var14 = -var13.id_throws();
         var3.id_class(rje_3.id_protected.id_byte(var14));
         var3.id_class(rje_3.id_break.id_byte(var13.id_protected()));
         var3.id_class(rje_3.id_case.id_byte(180.0F));
         float var15 = 1.3333334F;
         var3.id_class(1.3333334F, 1.3333334F, 1.3333334F);
         this.id_private.id_class(var3, (var1.id_private() ? id_throws : id_case).id_class(var4, HU::id_protected), var5, var6);
         var3.id_break();
      }
   }
}
