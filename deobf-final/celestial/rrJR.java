package celestial;

import java.awt.Dimension;

public class rrJR {
   private Dimension private_ = null;
   private boolean implements_ = false;
   private rrJo_1[] finally_ = new rrJo_1[0];
   private rqO_2 extends_ = null;
   private fN_2 native_ = null;
   private fk_3 volatile_ = null;
   private rqO_2 final_ = new rqO_2("textures/block/red_wool.png");
   public static final int class_ = 0;
   public static final int break_ = 1;
   public static final int byte_ = 2;
   public static final int protected_ = 3;
   public static final int throws_ = 4;
   public static final int case_ = 5;
   public static final int catch_ = 6;

   public rqO_2 byte_() {
      return this.extends_;
   }

   public rrJR(Dimension var1, boolean var2, rrJo_1[] var3) {
      this.private_ = var1;
      this.implements_ = var2;
      this.finally_ = var3;
   }

   public void class_(rqO_2 var1) {
      this.extends_ = var1;
   }

   public void class_(fN_2 var1) {
      this.native_ = var1;
   }

   public void class_(tW_2 var1, cG_2 var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      rqO_2 var7 = this.final_;
      if (this.implements_) {
         var7 = var2.final_();
      } else if (this.extends_ != null) {
         if (this.volatile_ == null && this.native_ != null) {
            this.volatile_ = new fk_3(this.native_);
            QY.instanceof_().A().class_(this.extends_, this.volatile_);
         }

         var7 = this.extends_;
      } else {
         var7 = this.final_;
      }

      for (int var8 = 0; var8 < this.finally_.length; var8++) {
         rrJo_1 var9 = this.finally_[var8];
         var3.class_();
         HU var10 = HU.protected_(var7);
         Ok_1 var11 = var4.getBuffer(var10);
         var9.class_(var1, var3, var11, var5, var6);
         var3.break_();
      }
   }

   public static Iq_1 class_(tW_2 var0, int var1) {
      switch (var1) {
         case 0:
            return var0.byte_;
         case 1:
            return var0.class_;
         case 2:
            return var0.throws_;
         case 3:
            return var0.protected_;
         case 4:
            return var0.catch_;
         case 5:
            return var0.case_;
         default:
            return null;
      }
   }

   public fN_2 class_() {
      return this.native_;
   }

   public fk_3 break_() {
      return this.volatile_;
   }

   public boolean protected_() {
      return this.implements_;
   }
}
