package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;

public class Xb_1 extends hZ_2 {
   private final XF class_;
   private final XF break_;
   private final XF byte_;
   private final Xh_1[] protected_;

   public Xb_1(ho_3 var1, XF var2, XF var3, XF var4, Xh_1[] var5) {
      super(XG.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var5;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      if (!this.class_.byte_() || !this.break_.byte_() || !this.byte_.byte_()) {
         JsonObject var3 = new JsonObject();
         var3.add("occupied", this.class_.protected_());
         var3.add("full", this.break_.protected_());
         var3.add("empty", this.byte_.protected_());
         var2.add("slots", var3);
      }

      if (this.protected_.length > 0) {
         JsonArray var8 = new JsonArray();

         for (Xh_1 var7 : this.protected_) {
            var8.add(var7.class_());
         }

         var2.add("items", var8);
      }

      return var2;
   }

   public boolean class_(rhz_3 var1, rdn_3 var2, int var3, int var4, int var5) {
      if (!this.break_.byte_(var3)) {
         return false;
      } else if (!this.byte_.byte_(var4)) {
         return false;
      } else if (!this.class_.byte_(var5)) {
         return false;
      } else {
         int var6 = this.protected_.length;
         if (var6 == 0) {
            return true;
         } else if (var6 != 1) {
            ObjectArrayList var7 = new ObjectArrayList(this.protected_);
            int var8 = var1.else_();

            for (int var9 = 0; var9 < var8; var9++) {
               if (var7.isEmpty()) {
                  return true;
               }

               rdn_3 var10 = var1.extends_(var9);
               if (!var10.class_()) {
                  var7.removeIf(var1x -> var1x.class_(var10));
               }
            }

            return var7.isEmpty();
         } else {
            return !var2.class_() && this.protected_[0].class_(var2);
         }
      }
   }

   public static Xb_1 class_(rpL_2... var0) {
      Xh_1[] var1 = new Xh_1[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = new Xh_1((rlb_3<rdb_3>)null, var0[var2].case_(), XF.throws_, XF.throws_, hT_2.break_, hT_2.break_, (rLi_1)null, XC.class_);
      }

      return class_(var1);
   }

   public static Xb_1 class_(Xh_1... var0) {
      return new Xb_1(ho_3.class_, XF.throws_, XF.throws_, XF.throws_, var0);
   }
}
