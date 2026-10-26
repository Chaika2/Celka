package celestial;

public class roV_2 {
   public static rog_3 id_class(rcd_3 var0) {
      int var1 = var0.id_private("xPos");
      int var2 = var0.id_private("zPos");
      rog_3 var3 = new rog_3(var1, var2);
      var3.id_catch = var0.id_volatile("Blocks");
      var3.id_case = new roD_2(var0.id_volatile("Data"), 7);
      var3.id_throws = new roD_2(var0.id_volatile("SkyLight"), 7);
      var3.id_protected = new roD_2(var0.id_volatile("BlockLight"), 7);
      var3.id_byte = var0.id_volatile("HeightMap");
      var3.id_break = var0.id_new("TerrainPopulated");
      var3.id_private = var0.id_protected("Entities", 10);
      var3.id_implements = var0.id_protected("TileEntities", 10);
      var3.id_finally = var0.id_protected("TileTicks", 10);

      try {
         var3.id_class = var0.id_implements("LastUpdate");
      } catch (ClassCastException var5) {
         var3.id_class = (long)var0.id_private("LastUpdate");
      }

      return var3;
   }

   public static void id_class(rVv_1 var0, rog_3 var1, rcd_3 var2, rYY var3) {
      var2.id_break("xPos", var1.id_extends);
      var2.id_break("zPos", var1.id_native);
      var2.id_class("LastUpdate", var1.id_class);
      int[] var4 = new int[var1.id_byte.length];

      for (int var5 = 0; var5 < var1.id_byte.length; var5++) {
         var4[var5] = var1.id_byte[var5];
      }

      var2.id_class("HeightMap", var4);
      var2.id_class("TerrainPopulated", var1.id_break);
      rcy_3 var17 = new rcy_3();

      for (int var6 = 0; var6 < 8; var6++) {
         boolean var7 = true;

         for (int var8 = 0; var8 < 16 && var7; var8++) {
            for (int var9 = 0; var9 < 16 && var7; var9++) {
               for (int var10 = 0; var10 < 16; var10++) {
                  int var11 = var8 << 11 | var10 << 7 | var9 + (var6 << 4);
                  byte var12 = var1.id_catch[var11];
                  if (var12 != 0) {
                     var7 = false;
                     break;
                  }
               }
            }
         }

         if (!var7) {
            byte[] var18 = new byte[4096];
            roH_2 var19 = new roH_2();
            roH_2 var20 = new roH_2();
            roH_2 var21 = new roH_2();

            for (int var22 = 0; var22 < 16; var22++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  for (int var14 = 0; var14 < 16; var14++) {
                     int var15 = var22 << 11 | var14 << 7 | var13 + (var6 << 4);
                     byte var16 = var1.id_catch[var15];
                     var18[var13 << 8 | var14 << 4 | var22] = (byte)(var16 & 255);
                     var19.id_class(var22, var13, var14, var1.id_case.id_class(var22, var13 + (var6 << 4), var14));
                     var20.id_class(var22, var13, var14, var1.id_throws.id_class(var22, var13 + (var6 << 4), var14));
                     var21.id_class(var22, var13, var14, var1.id_protected.id_class(var22, var13 + (var6 << 4), var14));
                  }
               }
            }

            rcd_3 var23 = new rcd_3();
            var23.id_class("Y", (byte)(var6 & 0xFF));
            var23.id_class("Blocks", var18);
            var23.id_class("Data", var19.id_class());
            var23.id_class("SkyLight", var20.id_class());
            var23.id_class("BlockLight", var21.id_class());
            var17.add(var23);
         }
      }

      var2.id_class("Sections", var17);
      var2.id_class("Biomes", new rYZ(var0.id_break(rVL.n), new rfj_3(var1.id_extends, var1.id_native), var3).id_class());
      var2.id_class("Entities", var1.id_private);
      var2.id_class("TileEntities", var1.id_implements);
      if (var1.id_finally != null) {
         var2.id_class("TileTicks", var1.id_finally);
      }

      var2.id_class("convertedFromAlphaFormat", true);
   }
}
