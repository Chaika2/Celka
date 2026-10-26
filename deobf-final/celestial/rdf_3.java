package celestial;

import java.util.ArrayList;

public class rdf_3 extends ArrayList<rdI_2> {
   public rdf_3() {
   }

   public rdf_3(rcd_3 var1) {
      rcy_3 var2 = var1.protected_("Recipes", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.add(new rdI_2(var2.class_(var3)));
      }
   }

   public void class_(ruu_3 var1) {
      var1.writeByte((byte)(this.size() & 0xFF));

      for (int var2 = 0; var2 < this.size(); var2++) {
         rdI_2 var3 = this.get(var2);
         var1.class_(var3.class_());
         var1.class_(var3.protected_());
         rdn_3 var4 = var3.byte_();
         var1.writeBoolean(!var4.class_());
         if (!var4.class_()) {
            var1.class_(var4);
         }

         var1.writeBoolean(var3.int_());
         var1.writeInt(var3.catch_());
         var1.writeInt(var3.implements_());
         var1.writeInt(var3.package_());
         var1.writeInt(var3.volatile_());
         var1.writeFloat(var3.final_());
         var1.writeInt(var3.extends_());
      }
   }

   public rcd_3 class_() {
      rcd_3 var1 = new rcd_3();
      rcy_3 var2 = new rcy_3();

      for (int var3 = 0; var3 < this.size(); var3++) {
         rdI_2 var4 = this.get(var3);
         var2.add(var4.this_());
      }

      var1.class_("Recipes", var2);
      return var1;
   }

   public rdI_2 class_(rdn_3 var1, rdn_3 var2, int var3) {
      if (var3 > 0 && var3 < this.size()) {
         rdI_2 var6 = this.get(var3);
         return var6.class_(var1, var2) ? var6 : null;
      } else {
         for (int var4 = 0; var4 < this.size(); var4++) {
            rdI_2 var5 = this.get(var4);
            if (var5.class_(var1, var2)) {
               return var5;
            }
         }

         return null;
      }
   }

   public static rdf_3 break_(ruu_3 var0) {
      rdf_3 var1 = new rdf_3();
      int var2 = var0.readByte() & 255;

      for (int var3 = 0; var3 < var2; var3++) {
         rdn_3 var4 = var0.extends_();
         rdn_3 var5 = var0.extends_();
         rdn_3 var6 = rdn_3.break_;
         if (var0.readBoolean()) {
            var6 = var0.extends_();
         }

         boolean var7 = var0.readBoolean();
         int var8 = var0.readInt();
         int var9 = var0.readInt();
         int var10 = var0.readInt();
         int var11 = var0.readInt();
         float var12 = var0.readFloat();
         int var13 = var0.readInt();
         rdI_2 var14 = new rdI_2(var4, var6, var5, var8, var9, var10, var12, var13);
         if (var7) {
            var14.new_();
         }

         var14.break_(var11);
         var1.add(var14);
      }

      return var1;
   }
}
