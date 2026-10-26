package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

class rrkW extends rrJh_1 {
   private ArrayList synchronized_;
   private int return_;
   private long public_ = Long.MIN_VALUE;
   private long goto_ = 0L;
   final rrkx_1 else_;

   @Override
   public int int_() {
      return this.protected_() * 18;
   }

   public rrkW(rrkx_1 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1.native_(), var2, var3, var4, var5, var6);
      this.else_ = var1;
      this.new_();
      this.int_ = 0.0;
      int var7 = this.return_ * var6;
      int var8 = (var5 - var4) / 2;
      if (var7 > var8) {
         this.protected_(var7 - var8);
      }
   }

   private boolean class_(rrxi_3 var1, int var2) {
      if (var1 == null) {
         return true;
      } else {
         InputStream var3 = var1.class_("/shaders/shaders.properties");
         Properties var4 = rrzM_2.class_(var3, "Shaders");
         if (var4 == null) {
            return true;
         } else {
            String var5 = "version.1.16.5";
            String var6 = var4.getProperty(var5);
            if (var6 == null) {
               return true;
            } else {
               var6 = var6.trim();
               String var7 = "G8";
               int var8 = rrbb_3.break_(var7, var6);
               if (var8 >= 0) {
                  return true;
               } else {
                  String var9 = ("HD_U_" + var6).replace('_', ' ');
                  String var10 = jI_2.class_("of.message.shaders.nv1", var9);
                  String var11 = jI_2.class_("of.message.shaders.nv2");
                  BooleanConsumer var12 = var2x -> {
                     if (var2x) {
                        this.catch_(var2);
                     }

                     this.case_.break_(this.else_);
                  };
                  mT_2 var13 = new mT_2(var12, new rgN_2(var10), new rgN_2(var11));
                  this.case_.break_(var13);
                  return false;
               }
            }
         }
      }
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      return super.class_(var1, var3, var5 * 3.0);
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8) {
      String var9 = (String)this.synchronized_.get(var2);
      if (var9.equals("OFF")) {
         var9 = rrba_3.class_("of.options.shaders.packNone");
      } else if (var9.equals("(internal)")) {
         var9 = rrba_3.class_("of.options.shaders.packDefault");
      }

      this.else_.class_(var1, var9, this.catch_ / 2, var4 + 1, 14737632);
   }

   @Override
   protected boolean class_(int var1, int var2, double var3, double var5) {
      if (var1 == this.return_ && this.public_ == this.goto_) {
         return false;
      } else {
         String var7 = (String)this.synchronized_.get(var1);
         rrxi_3 var8 = rrdZ.break_(var7);
         if (!this.class_(var8, var1)) {
            return false;
         } else {
            this.catch_(var1);
            return true;
         }
      }
   }

   @Override
   protected boolean break_(int var1) {
      return var1 == this.return_;
   }

   private void catch_(int var1) {
      this.return_ = var1;
      this.goto_ = this.public_;
      rrdZ.class_((String)this.synchronized_.get(var1));
      rrdZ.while_();
      this.else_.finally_();
   }

   public int continue_() {
      return this.return_;
   }

   public void new_() {
      this.synchronized_ = rrdZ.catch_();
      this.return_ = 0;
      int var1 = 0;

      for (int var2 = this.synchronized_.size(); var1 < var2; var1++) {
         if (((String)this.synchronized_.get(var1)).equals(rrdZ.sP)) {
            this.return_ = var1;
            break;
         }
      }
   }

   @Override
   protected int package_() {
      return this.catch_ - 6;
   }

   @Override
   protected int protected_() {
      return this.synchronized_.size();
   }

   @Override
   protected void private_() {
   }

   @Override
   public int volatile_() {
      return this.catch_ - 20;
   }
}
