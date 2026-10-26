package celestial;

import java.util.ArrayList;
import java.util.List;

public class rrdh_1 {
   private List<rrdG> class_ = new ArrayList<>();
   private rrdG break_ = this.class_("", rrdM.NONE, true);

   public rrdG byte_(String var1) {
      return this.class_(var1, rrdM.NONE, true);
   }

   public String[] byte_() {
      String[] var1 = new String[this.class_.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = this.class_.get(var2).throws_();
      }

      return var1;
   }

   public rrdG[] byte_(String var1, int var2) {
      return this.class_(var1, var2, rrdM.PREPARE, this.break_);
   }

   @Override
   public String toString() {
      return this.class_.toString();
   }

   public rrdG[] class_(String var1, int var2) {
      return this.class_(var1, var2, rrdM.COMPOSITE, this.break_);
   }

   public rrdG class_(String var1, rrdG var2) {
      return this.class_(var1, rrdM.GBUFFERS, var2);
   }

   private rrdG class_(String var1, rrdM var2, boolean var3) {
      int var4 = this.class_.size();
      rrdG var5 = new rrdG(var4, var1, var2, var3);
      this.class_.add(var5);
      return var5;
   }

   public rrdG class_() {
      return this.break_;
   }

   public rrdG[] class_(rrdG var1, rrdG var2) {
      int var3 = var1.protected_();
      int var4 = var2.protected_();
      if (var3 > var4) {
         int var5 = var3;
         var3 = var4;
         var4 = var5;
      }

      rrdG[] var7 = new rrdG[var4 - var3 + 1];

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = this.class_.get(var3 + var6);
      }

      return var7;
   }

   public rrdG class_(String var1, rrdM var2, rrdG var3) {
      int var4 = this.class_.size();
      rrdG var5 = new rrdG(var4, var1, var2, var3);
      this.class_.add(var5);
      return var5;
   }

   public rrdG class_(String var1) {
      return this.class_(var1, rrdM.COMPOSITE, this.break_);
   }

   public rrdG[] class_(String var1, int var2, rrdM var3, rrdG var4) {
      rrdG[] var5 = new rrdG[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         String var7 = var6 == 0 ? var1 : var1 + var6;
         var5[var6] = this.class_(var7, var3, this.break_);
      }

      return var5;
   }

   public int break_() {
      return this.class_.size();
   }

   public rrdG break_(String var1) {
      return this.class_(var1, rrdM.DEFERRED, this.break_);
   }

   public rrdG break_(String var1, rrdG var2) {
      return this.class_(var1, rrdM.SHADOW, var2);
   }

   public rrdG[] break_(String var1, int var2) {
      return this.class_(var1, var2, rrdM.SHADOWCOMP, this.break_);
   }

   public rrdG[] protected_(String var1, int var2) {
      return this.class_(var1, var2, rrdM.DEFERRED, this.break_);
   }

   public rrdG[] protected_() {
      return this.class_.toArray(new rrdG[this.class_.size()]);
   }

   public rrdG protected_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         for (int var2 = 0; var2 < this.class_.size(); var2++) {
            rrdG var3 = this.class_.get(var2);
            String var4 = var3.throws_();
            if (var4.equals(var1)) {
               return var3;
            }
         }

         return null;
      }
   }
}
