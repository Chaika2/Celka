package celestial;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class rrMJ {
   private String id_byte = null;
   private String id_protected = null;
   rqO_2 id_class = null;
   private int id_throws = -1;
   private int id_case = 0;
   private int id_catch = 0;
   private int id_private = 0;
   private int id_implements = 0;
   private rrMx_1[] id_finally = null;
   private int id_extends = 0;
   private boolean id_native = false;
   private int id_volatile = 0;
   private ByteBuffer id_final = null;
   byte[] id_break = null;
   private ByteBuffer id_package = null;
   private boolean id_int = true;
   private boolean id_new = true;

   public int id_byte() {
      return this.id_finally.length;
   }

   public rrMJ(String var1, byte[] var2, String var3, rqO_2 var4, int var5, int var6, int var7, int var8, Properties var9) {
      this.id_byte = var1;
      this.id_protected = var3;
      this.id_class = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
      int var10 = var7 * var8 * 4;
      if (var2.length % var10 != 0) {
         rrbb_3.id_protected("Invalid animated texture length: " + var2.length + ", frameWidth: " + var7 + ", frameHeight: " + var8);
      }

      this.id_break = var2;
      int var11 = var2.length / var10;
      if (var9.get("tile.0") != null) {
         for (int var12 = 0; var9.get("tile." + var12) != null; var12++) {
            var11 = var12 + 1;
         }
      }

      String var20 = (String)var9.get("duration");
      int var13 = Math.max(rrbb_3.id_class(var20, 1), 1);
      this.id_finally = new rrMx_1[var11];

      for (int var14 = 0; var14 < this.id_finally.length; var14++) {
         String var15 = (String)var9.get("tile." + var14);
         int var16 = rrbb_3.id_class(var15, var14);
         String var17 = (String)var9.get("duration." + var14);
         int var18 = Math.max(rrbb_3.id_class(var17, var13), 1);
         rrMx_1 var19 = new rrMx_1(var16, var18);
         this.id_finally[var14] = var19;
      }

      this.id_native = rrbb_3.id_class(var9.getProperty("interpolate"), false);
      this.id_volatile = rrbb_3.id_class(var9.getProperty("skip"), 0);
      if (this.id_native) {
         this.id_final = Hb_1.id_class(var10);
      }
   }

   private int id_class(int var1, int var2, double var3) {
      return (int)((double)var1 * (1.0 - var3) + (double)var2 * var3);
   }

   private void id_class(rrMx_1 var1, rrMx_1 var2, double var3) {
      int var5 = this.id_private * this.id_implements * 4;
      int var6 = var5 * var1.id_class;
      if (var6 + var5 <= this.id_package.limit()) {
         int var7 = var5 * var2.id_class;
         if (var7 + var5 <= this.id_package.limit()) {
            ((Buffer)this.id_final).clear();

            for (int var8 = 0; var8 < var5; var8++) {
               int var9 = this.id_package.get(var6 + var8) & 255;
               int var10 = this.id_package.get(var7 + var8) & 255;
               int var11 = this.id_class(var9, var10, var3);
               byte var12 = (byte)var11;
               this.id_final.put(var12);
            }

            ((Buffer)this.id_final).flip();
            MT.id_super(this.id_throws);
            rrzJ_2.id_catch();
            GL11.glTexSubImage2D(3553, 0, this.id_case, this.id_catch, this.id_private, this.id_implements, 6408, 5121, this.id_final);
         }
      }
   }

   public boolean id_class() {
      rrMx_1 var1 = this.id_break();
      if (var1 == null) {
         return false;
      } else {
         var1.id_byte++;
         if (var1.id_byte < var1.id_break) {
            return this.id_native;
         } else {
            var1.id_byte = 0;
            this.id_extends++;
            if (this.id_extends >= this.id_finally.length) {
               this.id_extends = 0;
            }

            return true;
         }
      }
   }

   public rrMx_1 id_class(int var1) {
      if (this.id_finally.length <= 0) {
         return null;
      } else {
         if (var1 < 0 || var1 >= this.id_finally.length) {
            var1 = 0;
         }

         return this.id_finally[var1];
      }
   }

   public rrMx_1 id_break() {
      return this.id_class(this.id_extends);
   }

   public String id_throws() {
      return this.id_byte;
   }

   public rqO_2 id_catch() {
      return this.id_class;
   }

   public String id_case() {
      return this.id_protected;
   }

   public void id_protected() {
      if (this.id_new) {
         if (this.id_throws < 0) {
            ff_3 var1 = rrzJ_2.id_class(this.id_class);
            if (var1 == null) {
               this.id_new = false;
               return;
            }

            this.id_throws = var1.id_new();
         }

         if (this.id_package == null) {
            this.id_package = Hb_1.id_class(this.id_break.length);
            this.id_package.put(this.id_break);
            ((Buffer)this.id_package).flip();
            this.id_break = null;
         }

         this.id_int = rrMh_1.id_class() ? rrMh_1.id_break(this.id_throws) : true;
         if (this.id_class() && this.id_int) {
            int var7 = this.id_private * this.id_implements * 4;
            rrMx_1 var2 = this.id_break();
            if (var2 != null) {
               int var3 = var7 * var2.id_class;
               if (var3 + var7 <= this.id_package.limit()) {
                  if (!this.id_native || var2.id_byte <= 0) {
                     ((Buffer)this.id_package).position(var3);
                     MT.id_super(this.id_throws);
                     rrzJ_2.id_catch();
                     GL11.glTexSubImage2D(3553, 0, this.id_case, this.id_catch, this.id_private, this.id_implements, 6408, 5121, this.id_package);
                  } else if (this.id_volatile <= 1 || var2.id_byte % this.id_volatile == 0) {
                     rrMx_1 var4 = this.id_class(this.id_extends + 1);
                     double var5 = 1.0 * (double)var2.id_byte / (double)var2.id_break;
                     this.id_class(var2, var4, var5);
                  }
               }
            }
         }
      }
   }

   public boolean id_private() {
      return this.id_int;
   }
}
