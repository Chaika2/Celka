package celestial;

import java.util.ArrayList;
import java.util.Properties;

public class rrMb_1 {
   public String id_class = null;
   public String id_break = null;
   public rqO_2[] id_byte = null;
   public rrMM[] id_protected = null;

   public rrMb_1(String var1, rqO_2[] var2) {
      rrMz_1 var3 = new rrMz_1("RandomEntities");
      this.id_class = var3.id_class(var1);
      this.id_break = var3.id_break(var1);
      this.id_byte = var2;
   }

   public rrMb_1(Properties var1, String var2, rqO_2 var3) {
      rrMz_1 var4 = new rrMz_1("RandomEntities");
      this.id_class = var4.id_class(var2);
      this.id_break = var4.id_break(var2);
      this.id_protected = this.id_class(var1, var2, var3, var4);
   }

   public boolean id_class(String var1) {
      if (this.id_byte == null && this.id_protected == null) {
         rrbb_3.id_protected("No skins specified: " + var1);
         return false;
      } else {
         if (this.id_protected != null) {
            for (int var2 = 0; var2 < this.id_protected.length; var2++) {
               rrMM var3 = this.id_protected[var2];
               if (!var3.id_class(var1)) {
                  return false;
               }
            }
         }

         if (this.id_byte != null) {
            for (int var4 = 0; var4 < this.id_byte.length; var4++) {
               rqO_2 var5 = this.id_byte[var4];
               if (!rrbb_3.id_byte(var5)) {
                  rrbb_3.id_protected("Texture not found: " + var5.id_break());
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean id_class() {
      return this.id_protected != null ? false : this.id_byte == null;
   }

   private rrMM[] id_class(Properties var1, String var2, rqO_2 var3, rrMz_1 var4) {
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
            if (var10.id_class(var2)) {
               var5.add(var10);
            }
         }
      }

      return var5.toArray(new rrMM[var5.size()]);
   }

   public rqO_2 id_class(rqO_2 var1, rrbD_2 var2) {
      if (this.id_protected != null) {
         for (int var3 = 0; var3 < this.id_protected.length; var3++) {
            rrMM var4 = this.id_protected[var3];
            if (var4.id_class(var2)) {
               return var4.id_class(var1, var2.id_class());
            }
         }
      }

      if (this.id_byte != null) {
         int var5 = var2.id_class();
         int var6 = var5 % this.id_byte.length;
         return this.id_byte[var6];
      } else {
         return var1;
      }
   }
}
