package celestial;

public class roV_2 {
   public static rog_3 class_(rcd_3 var0) {
      int var1 = var0.private_("xPos");
      int var2 = var0.private_("zPos");
      rog_3 var3 = new rog_3(var1, var2);
      var3.catch_ = var0.volatile_("Blocks");
      var3.case_ = new roD_2(var0.volatile_("Data"), 7);
      var3.throws_ = new roD_2(var0.volatile_("SkyLight"), 7);
      var3.protected_ = new roD_2(var0.volatile_("BlockLight"), 7);
      var3.byte_ = var0.volatile_("HeightMap");
      var3.break_ = var0.new_("TerrainPopulated");
      var3.private_ = var0.protected_("Entities", 10);
      var3.implements_ = var0.protected_("TileEntities", 10);
      var3.finally_ = var0.protected_("TileTicks", 10);

      try {
         var3.class_ = var0.implements_("LastUpdate");
      } catch (ClassCastException var5) {
         var3.class_ = (long)var0.private_("LastUpdate");
      }

      return var3;
   }

   public static void class_(rVv_1 var0, rog_3 var1, rcd_3 var2, rYY var3) {
      var2.break_("xPos", var1.extends_);
      var2.break_("zPos", var1.native_);
      var2.class_("LastUpdate", var1.class_);
      int[] var4 = new int[var1.byte_.length];

      for (int var5 = 0; var5 < var1.byte_.length; var5++) {
         var4[var5] = var1.byte_[var5];
      }

      var2.class_("HeightMap", var4);
      var2.class_("TerrainPopulated", var1.break_);
      rcy_3 var17 = new rcy_3();

      for (int var6 = 0; var6 < 8; var6++) {
         boolean var7 = true;

         for (int var8 = 0; var8 < 16 && var7; var8++) {
            for (int var9 = 0; var9 < 16 && var7; var9++) {
               for (int var10 = 0; var10 < 16; var10++) {
                  int var11 = var8 << 11 | var10 << 7 | var9 + (var6 << 4);
                  byte var12 = var1.catch_[var11];
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
                     byte var16 = var1.catch_[var15];
                     var18[var13 << 8 | var14 << 4 | var22] = (byte)(var16 & 255);
                     var19.class_(var22, var13, var14, var1.case_.class_(var22, var13 + (var6 << 4), var14));
                     var20.class_(var22, var13, var14, var1.throws_.class_(var22, var13 + (var6 << 4), var14));
                     var21.class_(var22, var13, var14, var1.protected_.class_(var22, var13 + (var6 << 4), var14));
                  }
               }
            }

            rcd_3 var23 = new rcd_3();
            var23.class_("Y", (byte)(var6 & 0xFF));
            var23.class_("Blocks", var18);
            var23.class_("Data", var19.class_());
            var23.class_("SkyLight", var20.class_());
            var23.class_("BlockLight", var21.class_());
            var17.add(var23);
         }
      }

      var2.class_("Sections", var17);
      var2.class_("Biomes", new rYZ(var0.break_(rVL.n), new rfj_3(var1.extends_, var1.native_), var3).class_());
      var2.class_("Entities", var1.private_);
      var2.class_("TileEntities", var1.implements_);
      if (var1.finally_ != null) {
         var2.class_("TileTicks", var1.finally_);
      }

      var2.class_("convertedFromAlphaFormat", true);
   }
}
