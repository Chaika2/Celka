package celestial;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class rrMJ {
   private String byte_ = null;
   private String protected_ = null;
   rqO_2 class_ = null;
   private int throws_ = -1;
   private int case_ = 0;
   private int catch_ = 0;
   private int private_ = 0;
   private int implements_ = 0;
   private rrMx_1[] finally_ = null;
   private int extends_ = 0;
   private boolean native_ = false;
   private int volatile_ = 0;
   private ByteBuffer final_ = null;
   byte[] break_ = null;
   private ByteBuffer package_ = null;
   private boolean int_ = true;
   private boolean new_ = true;

   public int byte_() {
      return this.finally_.length;
   }

   public rrMJ(String var1, byte[] var2, String var3, rqO_2 var4, int var5, int var6, int var7, int var8, Properties var9) {
      this.byte_ = var1;
      this.protected_ = var3;
      this.class_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
      int var10 = var7 * var8 * 4;
      if (var2.length % var10 != 0) {
         rrbb_3.protected_("Invalid animated texture length: " + var2.length + ", frameWidth: " + var7 + ", frameHeight: " + var8);
      }

      this.break_ = var2;
      int var11 = var2.length / var10;
      if (var9.get("tile.0") != null) {
         for (int var12 = 0; var9.get("tile." + var12) != null; var12++) {
            var11 = var12 + 1;
         }
      }

      String var20 = (String)var9.get("duration");
      int var13 = Math.max(rrbb_3.class_(var20, 1), 1);
      this.finally_ = new rrMx_1[var11];

      for (int var14 = 0; var14 < this.finally_.length; var14++) {
         String var15 = (String)var9.get("tile." + var14);
         int var16 = rrbb_3.class_(var15, var14);
         String var17 = (String)var9.get("duration." + var14);
         int var18 = Math.max(rrbb_3.class_(var17, var13), 1);
         rrMx_1 var19 = new rrMx_1(var16, var18);
         this.finally_[var14] = var19;
      }

      this.native_ = rrbb_3.class_(var9.getProperty("interpolate"), false);
      this.volatile_ = rrbb_3.class_(var9.getProperty("skip"), 0);
      if (this.native_) {
         this.final_ = Hb_1.class_(var10);
      }
   }

   private int class_(int var1, int var2, double var3) {
      return (int)((double)var1 * (1.0 - var3) + (double)var2 * var3);
   }

   private void class_(rrMx_1 var1, rrMx_1 var2, double var3) {
      int var5 = this.private_ * this.implements_ * 4;
      int var6 = var5 * var1.class_;
      if (var6 + var5 <= this.package_.limit()) {
         int var7 = var5 * var2.class_;
         if (var7 + var5 <= this.package_.limit()) {
            ((Buffer)this.final_).clear();

            for (int var8 = 0; var8 < var5; var8++) {
               int var9 = this.package_.get(var6 + var8) & 255;
               int var10 = this.package_.get(var7 + var8) & 255;
               int var11 = this.class_(var9, var10, var3);
               byte var12 = (byte)var11;
               this.final_.put(var12);
            }

            ((Buffer)this.final_).flip();
            MT.super_(this.throws_);
            rrzJ_2.catch_();
            GL11.glTexSubImage2D(3553, 0, this.case_, this.catch_, this.private_, this.implements_, 6408, 5121, this.final_);
         }
      }
   }

   public boolean class_() {
      rrMx_1 var1 = this.break_();
      if (var1 == null) {
         return false;
      } else {
         var1.byte_++;
         if (var1.byte_ < var1.break_) {
            return this.native_;
         } else {
            var1.byte_ = 0;
            this.extends_++;
            if (this.extends_ >= this.finally_.length) {
               this.extends_ = 0;
            }

            return true;
         }
      }
   }

   public rrMx_1 class_(int var1) {
      if (this.finally_.length <= 0) {
         return null;
      } else {
         if (var1 < 0 || var1 >= this.finally_.length) {
            var1 = 0;
         }

         return this.finally_[var1];
      }
   }

   public rrMx_1 break_() {
      return this.class_(this.extends_);
   }

   public String throws_() {
      return this.byte_;
   }

   public rqO_2 catch_() {
      return this.class_;
   }

   public String case_() {
      return this.protected_;
   }

   public void protected_() {
      if (this.new_) {
         if (this.throws_ < 0) {
            ff_3 var1 = rrzJ_2.class_(this.class_);
            if (var1 == null) {
               this.new_ = false;
               return;
            }

            this.throws_ = var1.new_();
         }

         if (this.package_ == null) {
            this.package_ = Hb_1.class_(this.break_.length);
            this.package_.put(this.break_);
            ((Buffer)this.package_).flip();
            this.break_ = null;
         }

         this.int_ = rrMh_1.class_() ? rrMh_1.break_(this.throws_) : true;
         if (this.class_() && this.int_) {
            int var7 = this.private_ * this.implements_ * 4;
            rrMx_1 var2 = this.break_();
            if (var2 != null) {
               int var3 = var7 * var2.class_;
               if (var3 + var7 <= this.package_.limit()) {
                  if (!this.native_ || var2.byte_ <= 0) {
                     ((Buffer)this.package_).position(var3);
                     MT.super_(this.throws_);
                     rrzJ_2.catch_();
                     GL11.glTexSubImage2D(3553, 0, this.case_, this.catch_, this.private_, this.implements_, 6408, 5121, this.package_);
                  } else if (this.volatile_ <= 1 || var2.byte_ % this.volatile_ == 0) {
                     rrMx_1 var4 = this.class_(this.extends_ + 1);
                     double var5 = 1.0 * (double)var2.byte_ / (double)var2.break_;
                     this.class_(var2, var4, var5);
                  }
               }
            }
         }
      }
   }

   public boolean private_() {
      return this.int_;
   }
}
