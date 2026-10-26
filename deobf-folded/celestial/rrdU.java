package celestial;

import java.util.ArrayList;

public class rrdU extends rrdD {
   private rrkb_1[] id_protected = null;
   private rrdD[] id_throws = null;
   private static final String id_case = "<profile>";
   private static final String id_catch = "<custom>";

   @Override
   public String id_byte() {
      String var1 = rrdZ.id_break("profile.comment", (String)null);
      if (var1 != null) {
         return var1;
      } else {
         StringBuffer var2 = new StringBuffer();

         for (int var3 = 0; var3 < this.id_protected.length; var3++) {
            String var4 = this.id_protected[var3].id_class();
            if (var4 != null) {
               String var5 = rrdZ.id_break("profile." + var4 + ".comment", (String)null);
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
      super("<profile>", "", id_class(var1, var2), id_class(var1), id_class(var1, var2, true), (String)null);
      this.id_protected = var1;
      this.id_throws = var2;
   }

   private static String[] id_class(rrkb_1[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         rrkb_1 var3 = var0[var2];
         var1.add(var3.id_class());
      }

      var1.add("<custom>");
      return var1.toArray(new String[var1.size()]);
   }

   private static String id_class(rrkb_1[] var0, rrdD[] var1) {
      return id_class(var0, var1, false);
   }

   private static String id_class(rrkb_1[] var0, rrdD[] var1, boolean var2) {
      rrkb_1 var3 = rrdm_1.id_class(var0, var1, var2);
      return var3 == null ? "<custom>" : var3.id_class();
   }

   @Override
   public String id_throws(String var1) {
      return var1.equals("<custom>") ? "§c" : "§a";
   }

   @Override
   public void id_catch() {
      super.id_catch();
      if (this.id_protected().equals("<custom>")) {
         super.id_catch();
      }

      this.id_super();
   }

   public void id_continue() {
      rrkb_1 var1 = this.id_implements(this.id_protected());
      if (var1 == null || !rrdm_1.id_class(var1, this.id_throws, false)) {
         String var2 = id_class(this.id_protected, this.id_throws);
         this.id_break(var2);
      }
   }

   private rrkb_1 id_implements(String var1) {
      for (int var2 = 0; var2 < this.id_protected.length; var2++) {
         rrkb_1 var3 = this.id_protected[var2];
         if (var3.id_class().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private void id_super() {
      rrkb_1 var1 = this.id_implements(this.id_protected());
      if (var1 != null) {
         String[] var2 = var1.id_break();

         for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            rrdD var5 = this.id_private(var4);
            if (var5 != null) {
               String var6 = var1.id_class(var4);
               var5.id_break(var6);
            }
         }
      }
   }

   @Override
   public String id_protected(String var1) {
      return var1.equals("<custom>") ? rrba_3.id_class("of.general.custom", "<custom>") : rrdZ.id_break("profile." + var1, var1);
   }

   private rrdD id_private(String var1) {
      for (int var2 = 0; var2 < this.id_throws.length; var2++) {
         rrdD var3 = this.id_throws[var2];
         if (var3.id_class().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public String id_volatile() {
      return rrba_3.id_class("of.shaders.profile");
   }
}
