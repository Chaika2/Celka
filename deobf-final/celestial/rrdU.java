package celestial;

import java.util.ArrayList;

public class rrdU extends rrdD {
   private rrkb_1[] protected_ = null;
   private rrdD[] throws_ = null;
   private static final String case_ = "<profile>";
   private static final String catch_ = "<custom>";

   @Override
   public String byte_() {
      String var1 = rrdZ.break_("profile.comment", (String)null);
      if (var1 != null) {
         return var1;
      } else {
         StringBuffer var2 = new StringBuffer();

         for (int var3 = 0; var3 < this.protected_.length; var3++) {
            String var4 = this.protected_[var3].class_();
            if (var4 != null) {
               String var5 = rrdZ.break_("profile." + var4 + ".comment", (String)null);
               if (var5 != null) {
                  var2.append(var5);
                  if (!var5.endsWith(". ")) {
                     var2.append(". ");
                  }
               }
            }
         }

         return var2.toString();
      }
   }

   public rrdU(rrkb_1[] var1, rrdD[] var2) {
      super("<profile>", "", class_(var1, var2), class_(var1), class_(var1, var2, true), (String)null);
      this.protected_ = var1;
      this.throws_ = var2;
   }

   private static String[] class_(rrkb_1[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         rrkb_1 var3 = var0[var2];
         var1.add(var3.class_());
      }

      var1.add("<custom>");
      return var1.toArray(new String[var1.size()]);
   }

   private static String class_(rrkb_1[] var0, rrdD[] var1) {
      return class_(var0, var1, false);
   }

   private static String class_(rrkb_1[] var0, rrdD[] var1, boolean var2) {
      rrkb_1 var3 = rrdm_1.class_(var0, var1, var2);
      return var3 == null ? "<custom>" : var3.class_();
   }

   @Override
   public String throws_(String var1) {
      return var1.equals("<custom>") ? "§c" : "§a";
   }

   @Override
   public void catch_() {
      super.catch_();
      if (this.protected_().equals("<custom>")) {
         super.catch_();
      }

      this.super_();
   }

   public void continue_() {
      rrkb_1 var1 = this.implements_(this.protected_());
      if (var1 == null || !rrdm_1.class_(var1, this.throws_, false)) {
         String var2 = class_(this.protected_, this.throws_);
         this.break_(var2);
      }
   }

   private rrkb_1 implements_(String var1) {
      for (int var2 = 0; var2 < this.protected_.length; var2++) {
         rrkb_1 var3 = this.protected_[var2];
         if (var3.class_().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private void super_() {
      rrkb_1 var1 = this.implements_(this.protected_());
      if (var1 != null) {
         String[] var2 = var1.break_();

         for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            rrdD var5 = this.private_(var4);
            if (var5 != null) {
               String var6 = var1.class_(var4);
               var5.break_(var6);
            }
         }
      }
   }

   @Override
   public String protected_(String var1) {
      return var1.equals("<custom>") ? rrba_3.class_("of.general.custom", "<custom>") : rrdZ.break_("profile." + var1, var1);
   }

   private rrdD private_(String var1) {
      for (int var2 = 0; var2 < this.throws_.length; var2++) {
         rrdD var3 = this.throws_[var2];
         if (var3.class_().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public String volatile_() {
      return rrba_3.class_("of.shaders.profile");
   }
}
