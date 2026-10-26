package celestial;

import java.util.ArrayList;
import java.util.List;

public class rrdh_1 {
   private List<rrdG> id_class = new ArrayList<>();
   private rrdG id_break = this.id_class("", rrdM.NONE, true);

   public rrdG id_byte(String var1) {
      return this.id_class(var1, rrdM.NONE, true);
   }

   public String[] id_byte() {
      String[] var1 = new String[this.id_class.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = this.id_class.get(var2).id_throws();
      }

      return var1;
   }

   public rrdG[] id_byte(String var1, int var2) {
      return this.id_class(var1, var2, rrdM.PREPARE, this.id_break);
   }

   @Override
   public String toString() {
      return this.id_class.toString();
   }

   public rrdG[] id_class(String var1, int var2) {
      return this.id_class(var1, var2, rrdM.COMPOSITE, this.id_break);
   }

   public rrdG id_class(String var1, rrdG var2) {
      return this.id_class(var1, rrdM.GBUFFERS, var2);
   }

   private rrdG id_class(String var1, rrdM var2, boolean var3) {
      int var4 = this.id_class.size();
      rrdG var5 = new rrdG(var4, var1, var2, var3);
      this.id_class.add(var5);
      return var5;
   }

   public rrdG id_class() {
      return this.id_break;
   }

   public rrdG[] id_class(rrdG var1, rrdG var2) {
      int var3 = var1.id_protected();
      int var4 = var2.id_protected();
      if (var3 > var4) {
         int var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      rrdG[] var7 = new rrdG[var4 - var3 + 1];

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = this.id_class.get(var3 + var6);
      }

      return var7;
   }

   public rrdG id_class(String var1, rrdM var2, rrdG var3) {
      int var4 = this.id_class.size();
      rrdG var5 = new rrdG(var4, var1, var2, var3);
      this.id_class.add(var5);
      return var5;
   }

   public rrdG id_class(String var1) {
      return this.id_class(var1, rrdM.COMPOSITE, this.id_break);
   }

   public rrdG[] id_class(String var1, int var2, rrdM var3, rrdG var4) {
      rrdG[] var5 = new rrdG[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         String var7 = var6 == 0 ? var1 : var1 + var6;
         var5[var6] = this.id_class(var7, var3, this.id_break);
      }

      return var5;
   }

   public int id_break() {
      return this.id_class.size();
   }

   public rrdG id_break(String var1) {
      return this.id_class(var1, rrdM.DEFERRED, this.id_break);
   }

   public rrdG id_break(String var1, rrdG var2) {
      return this.id_class(var1, rrdM.SHADOW, var2);
   }

   public rrdG[] id_break(String var1, int var2) {
      return this.id_class(var1, var2, rrdM.SHADOWCOMP, this.id_break);
   }

   public rrdG[] id_protected(String var1, int var2) {
      return this.id_class(var1, var2, rrdM.DEFERRED, this.id_break);
   }

   public rrdG[] id_protected() {
      return this.id_class.toArray(new rrdG[this.id_class.size()]);
   }

   public rrdG id_protected(String var1) {
      if (var1 == null) {
         return null;
      } else {
         for (int var2 = 0; var2 < this.id_class.size(); var2++) {
            rrdG var3 = this.id_class.get(var2);
            String var4 = var3.id_throws();
            if (var4.equals(var1)) {
               return var3;
            }
         }

         return null;
      }
   }
}
