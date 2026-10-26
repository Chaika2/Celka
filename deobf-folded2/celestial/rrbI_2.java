package celestial;

import java.util.Properties;

public class rrbI_2 {
   private String id_class;
   private rqO_2[] id_break;
   private int id_byte = 1;
   private int id_protected = 64;
   private int id_throws = 3;
   private int id_case = 3;
   private int id_catch = -2130706433;
   private int id_private = 16777215;
   private int id_implements = 0;
   private int id_finally = Integer.MIN_VALUE;

   public int id_byte() {
      return this.id_protected;
   }

   public rrbI_2(String var1, Properties var2) {
      rrMz_1 var3 = new rrMz_1("CustomPanorama");
      this.id_class = var1;
      this.id_break = new rqO_2[6];

      for (int var4 = 0; var4 < this.id_break.length; var4++) {
         this.id_break[var4] = new rqO_2(var1 + "/panorama_" + var4 + ".png");
      }

      this.id_byte = var3.id_class(var2.getProperty("weight"), 1);
      this.id_protected = var3.id_class(var2.getProperty("blur1"), 64);
      this.id_throws = var3.id_class(var2.getProperty("blur2"), 3);
      this.id_case = var3.id_class(var2.getProperty("blur3"), 3);
      this.id_catch = rrMz_1.id_byte(var2.getProperty("overlay1.top"), -2130706433);
      this.id_private = rrMz_1.id_byte(var2.getProperty("overlay1.bottom"), 16777215);
      this.id_implements = rrMz_1.id_byte(var2.getProperty("overlay2.top"), 0);
      this.id_finally = rrMz_1.id_byte(var2.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
   }

   @Override
   public String toString() {
      return this.id_class
         + ", weight: "
         + this.id_byte
         + ", blur: "
         + this.id_protected
         + " "
         + this.id_throws
         + " "
         + this.id_case
         + ", overlay: "
         + this.id_catch
         + " "
         + this.id_private
         + " "
         + this.id_implements
         + " "
         + this.id_finally;
   }

   public rqO_2[] id_class() {
      return this.id_break;
   }

   public int id_break() {
      return this.id_byte;
   }

   public int id_throws() {
      return this.id_case;
   }

   public int id_catch() {
      return this.id_private;
   }

   public int id_case() {
      return this.id_catch;
   }

   public int id_implements() {
      return this.id_finally;
   }

   public int id_protected() {
      return this.id_throws;
   }

   public int id_private() {
      return this.id_implements;
   }
}
