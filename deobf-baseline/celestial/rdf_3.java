package celestial;

import java.util.ArrayList;

public class rdf_3 extends ArrayList<rdI_2> {
   public rdf_3() {
   }

   public rdf_3(rcd_3 var1) {
      rcy_3 var2 = var1.id_protected("Recipes", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.add(new rdI_2(var2.id_class(var3)));
      }
   }

   public void id_class(ruu_3 var1) {
      var1.writeByte((byte)(this.size() & 0xFF));

      for (int var2 = 0; var2 < this.size(); var2++) {
         rdI_2 var3 = this.get(var2);
         var1.id_class(var3.id_class());
         var1.id_class(var3.id_protected());
         rdn_3 var4 = var3.id_byte();
         var1.writeBoolean(!var4.id_class());
         if (!var4.id_class()) {
            var1.id_class(var4);
         }

         var1.writeBoolean(var3.id_int());
         var1.writeInt(var3.id_catch());
         var1.writeInt(var3.id_implements());
         var1.writeInt(var3.id_package());
         var1.writeInt(var3.id_volatile());
         var1.writeFloat(var3.id_final());
         var1.writeInt(var3.id_extends());
      }
   }

   public rcd_3 id_class() {
      rcd_3 var1 = new rcd_3();
      rcy_3 var2 = new rcy_3();

      for (int var3 = 0; var3 < this.size(); var3++) {
         rdI_2 var4 = this.get(var3);
         var2.add(var4.id_this());
      }

      var1.id_class("Recipes", var2);
      return var1;
   }

   public rdI_2 id_class(rdn_3 var1, rdn_3 var2, int var3) {
      if (var3 > 0 && var3 < this.size()) {
         rdI_2 var6 = this.get(var3);
         return var6.id_class(var1, var2) ? var6 : null;
      } else {
         for (int var4 = 0; var4 < this.size(); var4++) {
            rdI_2 var5 = this.get(var4);
            if (var5.id_class(var1, var2)) {
               return var5;
            }
         }

         return null;
      }
   }

   public static rdf_3 id_break(ruu_3 var0) {
      rdf_3 var1 = new rdf_3();
      int var2 = var0.readByte() & 255;

      for (int var3 = 0; var3 < var2; var3++) {
         rdn_3 var4 = var0.id_extends();
         rdn_3 var5 = var0.id_extends();
         rdn_3 var6 = rdn_3.id_break;
         if (var0.readBoolean()) {
            var6 = var0.id_extends();
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
            var14.id_new();
         }

         var14.id_break(var11);
         var1.add(var14);
      }

      return var1;
   }
}
