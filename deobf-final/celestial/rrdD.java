package celestial;

import java.util.Arrays;
import java.util.List;

public abstract class rrdD {
   private String protected_ = null;
   private String throws_ = null;
   private String case_ = null;
   private String[] catch_ = null;
   private String private_ = null;
   private String[] implements_ = null;
   private boolean finally_ = true;
   private boolean extends_ = true;
   public static final String class_ = "§a";
   public static final String break_ = "§c";
   public static final String byte_ = "§9";

   public boolean byte_(String var1) {
      return class_(var1, this.catch_) >= 0;
   }

   public String byte_() {
      String var1 = rrbb_3.private_(this.throws_);
      var1 = rrzX_2.protected_(var1, "//");
      return rrdZ.break_("option." + this.class_() + ".comment", var1);
   }

   public String[] int_() {
      return (String[])this.catch_.clone();
   }

   public rrdD(String var1, String var2, String var3, String[] var4, String var5, String var6) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = var4;
      this.private_ = var5;
      if (var6 != null) {
         this.implements_ = new String[]{var6};
      }
   }

   @Override
   public String toString() {
      return this.protected_ + ", value: " + this.case_ + ", valueDefault: " + this.private_ + ", paths: " + rrbb_3.class_(this.implements_);
   }

   private static int class_(String var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         if (var3.equals(var0)) {
            return var2;
         }
      }

      return -1;
   }

   public void class_(String var1) {
      this.throws_ = var1;
   }

   public void class_(String[] var1) {
      List var2 = Arrays.asList(this.implements_);

      for (int var3 = 0; var3 < var1.length; var3++) {
         String var4 = var1[var3];
         if (!var2.contains(var4)) {
            this.implements_ = (String[])rrbb_3.class_((Object[])this.implements_, (Object)var4);
         }
      }
   }

   public void class_(boolean var1) {
      this.finally_ = var1;
   }

   public String class_() {
      return this.protected_;
   }

   public void class_(float var1) {
      if (this.catch_.length > 1) {
         var1 = rrbb_3.class_(var1, 0.0F, 1.0F);
         int var2 = Math.round(var1 * (float)(this.catch_.length - 1));
         this.case_ = this.catch_[var2];
      }
   }

   public void break_(boolean var1) {
      this.extends_ = var1;
   }

   public String break_() {
      return this.throws_;
   }

   public boolean break_(String var1) {
      int var2 = class_(var1, this.catch_);
      if (var2 < 0) {
         return false;
      } else {
         this.case_ = var1;
         return true;
      }
   }

   public String throws_() {
      return this.private_;
   }

   public String throws_(String var1) {
      return "";
   }

   public boolean finally_() {
      return this.finally_;
   }

   public void catch_() {
      int var1 = class_(this.case_, this.catch_);
      if (var1 >= 0) {
         var1 = (var1 + 1) % this.catch_.length;
         this.case_ = this.catch_[var1];
      }
   }

   public boolean catch_(String var1) {
      return false;
   }

   public boolean extends_() {
      return !rrbb_3.class_(this.case_, this.private_);
   }

   public boolean case_(String var1) {
      return false;
   }

   public void case_() {
      this.case_ = this.private_;
   }

   public String[] implements_() {
      return this.implements_;
   }

   public float new_() {
      if (this.catch_.length <= 1) {
         return 0.0F;
      } else {
         int var1 = class_(this.case_, this.catch_);
         return var1 < 0 ? 0.0F : 1.0F * (float)var1 / ((float)this.catch_.length - 1.0F);
      }
   }

   public String package_() {
      return null;
   }

   public String protected_() {
      return this.case_;
   }

   public String protected_(String var1) {
      return rrdZ.break_("value." + this.protected_ + "." + var1, var1);
   }

   public void private_() {
      int var1 = class_(this.case_, this.catch_);
      if (var1 >= 0) {
         var1 = (var1 - 1 + this.catch_.length) % this.catch_.length;
         this.case_ = this.catch_[var1];
      }
   }

   public boolean final_() {
      return false;
   }

   public String volatile_() {
      return rrdZ.break_("option." + this.protected_, this.protected_);
   }

   public boolean native_() {
      return this.extends_;
   }
}
