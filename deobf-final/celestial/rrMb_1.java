package celestial;

import java.util.ArrayList;
import java.util.Properties;

public class rrMb_1 {
   public String class_ = null;
   public String break_ = null;
   public rqO_2[] byte_ = null;
   public rrMM[] protected_ = null;

   public rrMb_1(String var1, rqO_2[] var2) {
      rrMz_1 var3 = new rrMz_1("RandomEntities");
      this.class_ = var3.class_(var1);
      this.break_ = var3.break_(var1);
      this.byte_ = var2;
   }

   public rrMb_1(Properties var1, String var2, rqO_2 var3) {
      rrMz_1 var4 = new rrMz_1("RandomEntities");
      this.class_ = var4.class_(var2);
      this.break_ = var4.break_(var2);
      this.protected_ = this.class_(var1, var2, var3, var4);
   }

   public boolean class_(String var1) {
      if (this.byte_ == null && this.protected_ == null) {
         rrbb_3.protected_("No skins specified: " + var1);
         return false;
      } else {
         if (this.protected_ != null) {
            for (int var2 = 0; var2 < this.protected_.length; var2++) {
               rrMM var3 = this.protected_[var2];
               if (!var3.class_(var1)) {
                  return false;
               }
            }
         }

         if (this.byte_ != null) {
            for (int var4 = 0; var4 < this.byte_.length; var4++) {
               rqO_2 var5 = this.byte_[var4];
               if (!rrbb_3.byte_(var5)) {
                  rrbb_3.protected_("Texture not found: " + var5.break_());
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean class_() {
      return this.protected_ != null ? false : this.byte_ == null;
   }

   private rrMM[] class_(Properties var1, String var2, rqO_2 var3, rrMz_1 var4) {
      ArrayList var5 = new ArrayList();
      int var6 = var1.size();

      for (int var7 = 0; var7 < var6; var7++) {
         int var8 = var7 + 1;
         String var9 = var1.getProperty("textures." + var8);
         if (var9 == null) {
            var9 = var1.getProperty("skins." + var8);
         }

         if (var9 != null) {
            rrMM var10 = new rrMM(var1, var2, var3, var8, var9, var4);
            if (var10.class_(var2)) {
               var5.add(var10);
            }
         }
      }

      return var5.toArray(new rrMM[var5.size()]);
   }

   public rqO_2 class_(rqO_2 var1, rrbD_2 var2) {
      if (this.protected_ != null) {
         for (int var3 = 0; var3 < this.protected_.length; var3++) {
            rrMM var4 = this.protected_[var3];
            if (var4.class_(var2)) {
               return var4.class_(var1, var2.class_());
            }
         }
      }

      if (this.byte_ != null) {
         int var5 = var2.class_();
         int var6 = var5 % this.byte_.length;
         return this.byte_[var6];
      } else {
         return var1;
      }
   }
}
