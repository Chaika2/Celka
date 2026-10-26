package celestial;

import java.util.Arrays;
import java.util.List;

public abstract class rrdD {
   private String id_protected = null;
   private String id_throws = null;
   private String id_case = null;
   private String[] id_catch = null;
   private String id_private = null;
   private String[] id_implements = null;
   private boolean id_finally = true;
   private boolean id_extends = true;
   public static final String id_class = "§a";
   public static final String id_break = "§c";
   public static final String id_byte = "§9";

   public boolean id_byte(String var1) {
      return id_class(var1, this.id_catch) >= 0;
   }

   public String id_byte() {
      String var1 = rrbb_3.id_private(this.id_throws);
      var1 = rrzX_2.id_protected(var1, "//");
      return rrdZ.id_break("option." + this.id_class() + ".comment", var1);
   }

   public String[] id_int() {
      return (String[])this.id_catch.clone();
   }

   public rrdD(String var1, String var2, String var3, String[] var4, String var5, String var6) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = var4;
      this.id_private = var5;
      if (var6 != null) {
         this.id_implements = new String[]{var6};
      }
   }

   @Override
   public String toString() {
      return this.id_protected + ", value: " + this.id_case + ", valueDefault: " + this.id_private + ", paths: " + rrbb_3.id_class(this.id_implements);
   }

   private static int id_class(String var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         if (var3.equals(var0)) {
            return var2;
         }
      }

      return -1;
   }

   public void id_class(String var1) {
      this.id_throws = var1;
   }

   public void id_class(String[] var1) {
      List var2 = Arrays.asList(this.id_implements);

      for (int var3 = 0; var3 < var1.length; var3++) {
         String var4 = var1[var3];
         if (!var2.contains(var4)) {
            this.id_implements = (String[])rrbb_3.id_class((Object[])this.id_implements, (Object)var4);
         }
      }
   }

   public void id_class(boolean var1) {
      this.id_finally = var1;
   }

   public String id_class() {
      return this.id_protected;
   }

   public void id_class(float var1) {
      if (this.id_catch.length > 1) {
         var1 = rrbb_3.id_class(var1, 0.0F, 1.0F);
         int var2 = Math.round(var1 * (float)(this.id_catch.length - 1));
         this.id_case = this.id_catch[var2];
      }
   }

   public void id_break(boolean var1) {
      this.id_extends = var1;
   }

   public String id_break() {
      return this.id_throws;
   }

   public boolean id_break(String var1) {
      int var2 = id_class(var1, this.id_catch);
      if (var2 < 0) {
         return false;
      } else {
         this.id_case = var1;
         return true;
      }
   }

   public String id_throws() {
      return this.id_private;
   }

   public String id_throws(String var1) {
      return "";
   }

   public boolean id_finally() {
      return this.id_finally;
   }

   public void id_catch() {
      int var1 = id_class(this.id_case, this.id_catch);
      if (var1 >= 0) {
         var1 = (var1 + 1) % this.id_catch.length;
         this.id_case = this.id_catch[var1];
      }
   }

   public boolean id_catch(String var1) {
      return false;
   }

   public boolean id_extends() {
      return !rrbb_3.id_class(this.id_case, this.id_private);
   }

   public boolean id_case(String var1) {
      return false;
   }

   public void id_case() {
      this.id_case = this.id_private;
   }

   public String[] id_implements() {
      return this.id_implements;
   }

   public float id_new() {
      if (this.id_catch.length <= 1) {
         return 0.0F;
      } else {
         int var1 = id_class(this.id_case, this.id_catch);
         return var1 < 0 ? 0.0F : 1.0F * (float)var1 / ((float)this.id_catch.length - 1.0F);
      }
   }

   public String id_package() {
      return null;
   }

   public String id_protected() {
      return this.id_case;
   }

   public String id_protected(String var1) {
      return rrdZ.id_break("value." + this.id_protected + "." + var1, var1);
   }

   public void id_private() {
      int var1 = id_class(this.id_case, this.id_catch);
      if (var1 >= 0) {
         var1 = (var1 - 1 + this.id_catch.length) % this.id_catch.length;
         this.id_case = this.id_catch[var1];
      }
   }

   public boolean id_final() {
      return false;
   }

   public String id_volatile() {
      return rrdZ.id_break("option." + this.id_protected, this.id_protected);
   }

   public boolean id_native() {
      return this.id_extends;
   }
}
