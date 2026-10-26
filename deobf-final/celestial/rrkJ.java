package celestial;

public class rrkJ extends rrJM {
   private vm_3 finally_;
   private Qw_1 else_;
   private rrJX synchronized_ = new rrJX(this, new rrJk_1());
   private String return_ = null;
   private String public_ = null;
   private boolean goto_ = false;
   public static final String class_ = "<profile>";
   public static final String private_ = "<empty>";
   public static final String implements_ = "*";

   @Override
   protected void byte_(LZ var1) {
      if (var1 instanceof rrkX var2) {
         rrdD var3 = var2.private_();
         if (synchronized_()) {
            var3.case_();
         } else if (var2.extends_()) {
            var3.private_();
         }

         this.finally_();
         this.goto_ = true;
      }
   }

   public rrkJ(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.class_("of.options.shaderOptionsTitle")));
      this.finally_ = var1;
      this.else_ = var2;
   }

   public rrkJ(vm_3 var1, Qw_1 var2, String var3) {
      this(var1, var2);
      this.return_ = var3;
      if (var3 != null) {
         this.public_ = rrdZ.break_("screen." + var3, var3);
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      if (this.public_ != null) {
         class_(var1, this.case_, this.public_, this.package_ / 2, 15, 16777215);
      } else {
         class_(var1, this.case_, this.extends_, this.package_ / 2, 15, 16777215);
      }

      super.class_(var1, var2, var3, var4);
      this.synchronized_.class_(var1, var2, var3, this.throws_);
   }

   public static String class_(rrdD var0, int var1) {
      String var2 = var0.volatile_();
      if (var0 instanceof rrdi_1 var6) {
         return var2 + "...";
      } else {
         cm_3 var3 = (cm_3)rrbb_3.X().class_[15];
         int var4 = var3.break_(": " + rrba_3.byte_()) + 5;

         while (var3.break_(var2) + var4 >= var1 && var2.length() > 0) {
            var2 = var2.substring(0, var2.length() - 1);
         }

         String var7 = var0.extends_() ? var0.throws_(var0.protected_()) : "";
         String var5 = var0.protected_(var0.protected_());
         return var2 + ": " + var7 + var5;
      }
   }

   @Override
   protected void break_(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.int_) {
         if (var2.class_ < 200 && var2 instanceof rrkX var3) {
            rrdD var4 = var3.private_();
            if (var4 instanceof rrdi_1) {
               String var9 = var4.class_();
               rrkJ var6 = new rrkJ(this, this.else_, var9);
               this.volatile_.break_(var6);
               return;
            }

            if (synchronized_()) {
               var4.case_();
            } else if (var3.extends_()) {
               var4.catch_();
            }

            this.finally_();
            this.goto_ = true;
         }

         if (var2.class_ == 201) {
            rrdD[] var7 = rrdZ.class_(rrdZ.throws_());

            for (int var8 = 0; var8 < var7.length; var8++) {
               rrdD var5 = var7[var8];
               var5.case_();
               this.goto_ = true;
            }

            this.finally_();
         }

         if (var2.class_ == 200) {
            if (this.goto_) {
               rrdZ.case_();
               this.goto_ = false;
               rrdZ.while_();
            }

            this.volatile_.break_(this.finally_);
         }
      }
   }

   private void finally_() {
      for (LZ var2 : this.throws_) {
         if (var2 instanceof rrkX) {
            rrkX var3 = (rrkX)var2;
            rrdD var4 = var3.private_();
            if (var4 instanceof rrdU var5) {
               var5.continue_();
            }

            var3.class_(class_(var4, var3.case_()));
            var3.implements_();
         }
      }
   }

   @Override
   public void v_() {
      byte var1 = 100;
      int var2 = 0;
      byte var3 = 30;
      byte var4 = 20;
      byte var5 = 120;
      byte var6 = 20;
      int var7 = rrdZ.class_(this.return_, 2);
      rrdD[] var8 = rrdZ.byte_(this.return_);
      if (var8 != null) {
         int var9 = rfU_2.throws_((double)var8.length / 9.0);
         if (var7 < var9) {
            var7 = var9;
         }

         for (int var10 = 0; var10 < var8.length; var10++) {
            rrdD var11 = var8[var10];
            if (var11 != null && var11.native_()) {
               int var12 = var10 % var7;
               int var13 = var10 / var7;
               int var14 = Math.min(this.package_ / var7, 200);
               var2 = (this.package_ - var14 * var7) / 2;
               int var15 = var12 * var14 + 5 + var2;
               int var16 = var3 + var13 * var4;
               int var17 = var14 - 10;
               String var18 = class_(var11, var17);
               Object var19;
               if (rrdZ.throws_(var11.class_())) {
                  var19 = new rrkk_1(var1 + var10, var15, var16, var17, var6, var11, var18);
               } else {
                  var19 = new rrkX(var1 + var10, var15, var16, var17, var6, var11, var18);
               }

               ((rrkX)var19).int_ = var11.finally_();
               this.class_((LZ)var19);
            }
         }
      }

      this.class_(new rrXi_1(201, this.package_ / 2 - var5 - 20, this.int_ / 6 + 168 + 11, var5, var6, jI_2.class_("controls.reset")));
      this.class_(new rrXi_1(200, this.package_ / 2 + 20, this.int_ / 6 + 168 + 11, var5, var6, jI_2.class_("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      if (this.goto_) {
         rrdZ.case_();
         this.goto_ = false;
         rrdZ.while_();
      }
   }
}
