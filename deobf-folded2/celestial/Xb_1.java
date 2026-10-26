package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;

public class Xb_1 extends hZ_2 {
   private final XF id_class;
   private final XF id_break;
   private final XF id_byte;
   private final Xh_1[] id_protected;

   public Xb_1(ho_3 var1, XF var2, XF var3, XF var4, Xh_1[] var5) {
      super(XG.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_protected = var5;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      if (!this.id_class.id_byte() || !this.id_break.id_byte() || !this.id_byte.id_byte()) {
         JsonObject var3 = new JsonObject();
         var3.add("occupied", this.id_class.id_protected());
         var3.add("full", this.id_break.id_protected());
         var3.add("empty", this.id_byte.id_protected());
         var2.add("slots", var3);
      }

      if (this.id_protected.length > 0) {
         JsonArray var8 = new JsonArray();

         for (Xh_1 var7 : this.id_protected) {
            var8.add(var7.id_class());
         }

         var2.add("items", var8);
      }

      return var2;
   }

   public boolean id_class(rhz_3 var1, rdn_3 var2, int var3, int var4, int var5) {
      if (!this.id_break.id_byte(var3)) {
         return false;
      } else if (!this.id_byte.id_byte(var4)) {
         return false;
      } else if (!this.id_class.id_byte(var5)) {
         return false;
      } else {
         int var6 = this.id_protected.length;
         if (var6 == 0) {
            return true;
         } else if (var6 != 1) {
            ObjectArrayList var7 = new ObjectArrayList(this.id_protected);
            int var8 = var1.id_else();

            for (int var9 = 0; var9 < var8; var9++) {
               if (var7.isEmpty()) {
                  return true;
               }

               rdn_3 var10 = var1.id_extends(var9);
               if (!var10.id_class()) {
                  var7.removeIf(var1x -> var1x.id_class(var10));
               }
            }

            return var7.isEmpty();
         } else {
            return !var2.id_class() && this.id_protected[0].id_class(var2);
         }
      }
   }

   public static Xb_1 id_class(rpL_2... var0) {
      Xh_1[] var1 = new Xh_1[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = new Xh_1((rlb_3<rdb_3>)null, var0[var2].id_case(), XF.id_throws, XF.id_throws, hT_2.id_break, hT_2.id_break, (rLi_1)null, XC.id_class);
      }

      return id_class(var1);
   }

   public static Xb_1 id_class(Xh_1... var0) {
      return new Xb_1(ho_3.id_class, XF.id_throws, XF.id_throws, XF.id_throws, var0);
   }
}
