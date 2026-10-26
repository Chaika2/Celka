package celestial;

public class rrkJ extends rrJM {
   private vm_3 id_finally;
   private Qw_1 id_else;
   private rrJX id_synchronized = new rrJX(this, new rrJk_1());
   private String id_return = null;
   private String id_public = null;
   private boolean id_goto = false;
   public static final String id_class = "<profile>";
   public static final String id_private = "<empty>";
   public static final String id_implements = "*";

   @Override
   protected void id_byte(LZ var1) {
      if (var1 instanceof rrkX var2) {
         rrdD var3 = var2.id_private();
         if (id_synchronized()) {
            var3.id_case();
         } else if (var2.id_extends()) {
            var3.id_private();
         }

         this.id_finally();
         this.id_goto = true;
      }
   }

   public rrkJ(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.id_class("of.options.shaderOptionsTitle")));
      this.id_finally = var1;
      this.id_else = var2;
   }

   public rrkJ(vm_3 var1, Qw_1 var2, String var3) {
      this(var1, var2);
      this.id_return = var3;
      if (var3 != null) {
         this.id_public = rrdZ.id_break("screen." + var3, var3);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      if (this.id_public != null) {
         id_class(var1, this.id_case, this.id_public, this.id_package / 2, 15, 16777215);
      } else {
         id_class(var1, this.id_case, this.id_extends, this.id_package / 2, 15, 16777215);
      }

      super.id_class(var1, var2, var3, var4);
      this.id_synchronized.id_class(var1, var2, var3, this.id_throws);
   }

   public static String id_class(rrdD var0, int var1) {
      String var2 = var0.id_volatile();
      if (var0 instanceof rrdi_1 var6) {
         return var2 + "...";
      } else {
         cm_3 var3 = (cm_3)rrbb_3.X().id_class[15];
         int var4 = var3.id_break(": " + rrba_3.id_byte()) + 5;

         while (var3.id_break(var2) + var4 >= var1 && var2.length() > 0) {
            var2 = var2.substring(0, var2.length() - 1);
         }

         String var7 = var0.id_extends() ? var0.id_throws(var0.id_protected()) : "";
         String var5 = var0.id_protected(var0.id_protected());
         return var2 + ": " + var7 + var5;
      }
   }

   @Override
   protected void id_break(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.id_int) {
         if (var2.id_class < 200 && var2 instanceof rrkX var3) {
            rrdD var4 = var3.id_private();
            if (var4 instanceof rrdi_1) {
               String var9 = var4.id_class();
               rrkJ var6 = new rrkJ(this, this.id_else, var9);
               this.id_volatile.id_break(var6);
               return;
            }

            if (id_synchronized()) {
               var4.id_case();
            } else if (var3.id_extends()) {
               var4.id_catch();
            }

            this.id_finally();
            this.id_goto = true;
         }

         if (var2.id_class == 201) {
            rrdD[] var7 = rrdZ.id_class(rrdZ.id_throws());

            for (int var8 = 0; var8 < var7.length; var8++) {
               rrdD var5 = var7[var8];
               var5.id_case();
               this.id_goto = true;
            }

            this.id_finally();
         }

         if (var2.id_class == 200) {
            if (this.id_goto) {
               rrdZ.id_case();
               this.id_goto = false;
               rrdZ.id_while();
            }

            this.id_volatile.id_break(this.id_finally);
         }
      }
   }

   private void id_finally() {
      for (LZ var2 : this.id_throws) {
         if (var2 instanceof rrkX) {
            rrkX var3 = (rrkX)var2;
            rrdD var4 = var3.id_private();
            if (var4 instanceof rrdU var5) {
               var5.id_continue();
            }

            var3.id_class(id_class(var4, var3.id_case()));
            var3.id_implements();
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
      int var7 = rrdZ.id_class(this.id_return, 2);
      rrdD[] var8 = rrdZ.id_byte(this.id_return);
      if (var8 != null) {
         int var9 = rfU_2.id_throws((double)var8.length / 9.0);
         if (var7 < var9) {
            var7 = var9;
         }

         for (int var10 = 0; var10 < var8.length; var10++) {
            rrdD var11 = var8[var10];
            if (var11 != null && var11.id_native()) {
               int var12 = var10 % var7;
               int var13 = var10 / var7;
               int var14 = Math.min(this.id_package / var7, 200);
               var2 = (this.id_package - var14 * var7) / 2;
               int var15 = var12 * var14 + 5 + var2;
               int var16 = var3 + var13 * var4;
               int var17 = var14 - 10;
               String var18 = id_class(var11, var17);
               Object var19;
               if (rrdZ.id_throws(var11.id_class())) {
                  var19 = new rrkk_1(var1 + var10, var15, var16, var17, var6, var11, var18);
               } else {
                  var19 = new rrkX(var1 + var10, var15, var16, var17, var6, var11, var18);
               }

               ((rrkX)var19).id_int = var11.id_finally();
               this.id_class((LZ)var19);
            }
         }
      }

      this.id_class(new rrXi_1(201, this.id_package / 2 - var5 - 20, this.id_int / 6 + 168 + 11, var5, var6, jI_2.id_class("controls.reset")));
      this.id_class(new rrXi_1(200, this.id_package / 2 + 20, this.id_int / 6 + 168 + 11, var5, var6, jI_2.id_class("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      if (this.id_goto) {
         rrdZ.id_case();
         this.id_goto = false;
         rrdZ.id_while();
      }
   }
}
