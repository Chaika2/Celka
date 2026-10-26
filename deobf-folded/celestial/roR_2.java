package celestial;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roR_2 {
   private static final Logger id_class = LogManager.getLogger();

   public static rok_3 id_class(rrEm_1 var0, rrPt_1 var1, rga_3 var2, rfj_3 var3, rcd_3 var4) {
      rKd_1 var5 = var0.id_else().id_implements();
      rYY var6 = var5.id_protected();
      rcd_3 var7 = var4.id_int("Level");
      rfj_3 var8 = new rfj_3(var7.id_private("xPos"), var7.id_private("zPos"));
      if (!Objects.equals(var3, var8)) {
         id_class.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", var3, var3, var8);
      }

      rYZ var9 = new rYZ(var0.id_new().id_break(rVL.n), var3, var6, var7.id_byte("Biomes", 11) ? var7.id_final("Biomes") : null);
      rVh_1 var10 = var7.id_byte("UpgradeData", 10) ? new rVh_1(var7.id_int("UpgradeData")) : rVh_1.id_class;
      roW_2 var11 = new roW_2<>(var0x -> var0x == null || var0x.id_continue().id_catch(), var3, var7.id_protected("ToBeTicked", 9));
      roW_2 var12 = new roW_2<>(var0x -> var0x == null || var0x == rXG.id_class, var3, var7.id_protected("LiquidsToBeTicked", 9));
      boolean var13 = var7.id_new("isLightOn");
      rcy_3 var14 = var7.id_protected("Sections", 10);
      byte var15 = 16;
      roQ_2[] var16 = new roQ_2[16];
      boolean var17 = var0.id_default().id_break();
      rrEN var18 = var0.id_else();
      rrse_3 var19 = var18.id_class();
      if (var13) {
         var19.id_break(var3, true);
      }

      for (int var20 = 0; var20 < var14.size(); var20++) {
         rcd_3 var21 = var14.id_class(var20);
         byte var22 = var21.id_case("Y");
         if (var21.id_byte("Palette", 9) && var21.id_byte("BlockStates", 12)) {
            roQ_2 var23 = new roQ_2(var22 << 4);
            var23.id_implements().id_class(var21.id_protected("Palette", 10), var21.id_package("BlockStates"));
            var23.id_private();
            if (!var23.id_byte()) {
               var16[var22] = var23;
            }

            var2.id_class(var3, var23);
         }

         if (var13) {
            if (var21.id_byte("BlockLight", 7)) {
               var19.id_class(rRo_1.BLOCK, rjh_3.id_class(var3, var22), new roH_2(var21.id_volatile("BlockLight")), true);
            }

            if (var17 && var21.id_byte("SkyLight", 7)) {
               var19.id_class(rRo_1.SKY, rjh_3.id_class(var3, var22), new roH_2(var21.id_volatile("SkyLight")), true);
            }
         }
      }

      long var36 = var7.id_implements("InhabitedTime");
      roZ_2 var37 = id_class(var4);
      Object var38;
      if (var37 == roZ_2.LEVELCHUNK) {
         Object var24;
         if (var7.id_byte("TileTicks", 9)) {
            var24 = rRe_1.id_class(var7.id_protected("TileTicks", 10), rVL.id_strictfp::id_break, rVL.id_strictfp::id_class);
         } else {
            var24 = var11;
         }

         Object var25;
         if (var7.id_byte("LiquidTicks", 9)) {
            var25 = rRe_1.id_class(var7.id_protected("LiquidTicks", 10), rVL.id_default::id_break, rVL.id_default::id_class);
         } else {
            var25 = var12;
         }

         var38 = new roJ_2(var0.id_byte(), var3, var9, var10, (rRV<xd_3>)var24, (rRV<rXs_1>)var25, var36, var16, var1x -> id_class(var7, var1x));
      } else {
         rok_3 var39 = new rok_3(var3, var10, var16, var11, var12);
         var39.id_class(var9);
         var38 = var39;
         var39.id_break(var36);
         var39.id_class(roN_2.id_class(var7.id_native("Status")));
         if (var39.id_goto().id_break(roN_2.id_implements)) {
            var39.id_class(var19);
         }

         if (!var13 && var39.id_goto().id_break(roN_2.id_finally)) {
            for (rfH_2 var26 : rfH_2.id_break(var3.id_break(), 0, var3.id_byte(), var3.id_protected(), 255, var3.id_throws())) {
               if (((roC_2)var38).id_byte(var26).id_case() != 0) {
                  var39.id_implements(var26);
               }
            }
         }
      }

      ((roC_2)var38).id_protected(var13);
      rcd_3 var40 = var7.id_int("Heightmaps");
      EnumSet var42 = EnumSet.noneOf(rKv_1.class);

      for (rKv_1 var27 : ((roC_2)var38).id_goto().id_private()) {
         String var28 = var27.id_break();
         if (var40.id_byte(var28, 12)) {
            ((roC_2)var38).id_class(var27, var40.id_package(var28));
         } else {
            var42.add(var27);
         }
      }

      rKZ.id_class((roC_2)var38, var42);
      rcd_3 var44 = var7.id_int("Structures");
      ((roC_2)var38).id_break(id_class(var1, var44, var0.id_break()));
      ((roC_2)var38).id_class(id_class(var3, var44));
      if (var7.id_new("shouldSave")) {
         ((roC_2)var38).id_break(true);
      }

      rcy_3 var45 = var7.id_protected("PostProcessing", 9);

      for (int var46 = 0; var46 < var45.size(); var46++) {
         rcy_3 var29 = var45.id_break(var46);

         for (int var30 = 0; var30 < var29.size(); var30++) {
            ((roC_2)var38).id_break(var29.id_protected(var30), var46);
         }
      }

      if (var37 == roZ_2.LEVELCHUNK) {
         return new roz_3((roJ_2)var38);
      } else {
         rok_3 var47 = (rok_3)var38;
         rcy_3 var48 = var7.id_protected("Entities", 10);

         for (int var49 = 0; var49 < var48.size(); var49++) {
            var47.id_break(var48.id_class(var49));
         }

         rcy_3 var50 = var7.id_protected("TileEntities", 10);

         for (int var31 = 0; var31 < var50.size(); var31++) {
            rcd_3 var32 = var50.id_class(var31);
            ((roC_2)var38).id_class(var32);
         }

         rcy_3 var51 = var7.id_protected("Lights", 9);

         for (int var52 = 0; var52 < var51.size(); var52++) {
            rcy_3 var33 = var51.id_break(var52);

            for (int var34 = 0; var34 < var33.size(); var34++) {
               var47.id_class(var33.id_protected(var34), var52);
            }
         }

         rcd_3 var53 = var7.id_int("CarvingMasks");

         for (String var55 : var53.id_protected()) {
            rKu_1 var35 = rKu_1.valueOf(var55);
            var47.id_class(var35, BitSet.valueOf(var53.id_volatile(var55)));
         }

         return var47;
      }
   }

   public static rcy_3 id_class(ShortList[] var0) {
      rcy_3 var1 = new rcy_3();

      for (ShortList var5 : var0) {
         rcy_3 var6 = new rcy_3();
         if (var5 != null) {
            ShortListIterator var7 = var5.iterator();

            while (var7.hasNext()) {
               Short var8 = (Short)var7.next();
               var6.add(rcD_2.id_class(var8));
            }
         }

         var1.add(var6);
      }

      return var1;
   }

   public static roZ_2 id_class(rcd_3 var0) {
      if (var0 != null) {
         roN_2 var1 = roN_2.id_class(var0.id_int("Level").id_native("Status"));
         if (var1 != null) {
            return var1.id_catch();
         }
      }

      return roZ_2.PROTOCHUNK;
   }

   private static void id_class(rcd_3 var0, roJ_2 var1) {
      rcy_3 var2 = var0.id_protected("Entities", 10);
      rYB var3 = var1.id_extends();

      for (int var4 = 0; var4 < var2.size(); var4++) {
         rcd_3 var5 = var2.id_class(var4);
         aI_2.id_class(var5, var3, var1x -> {
            var1.id_class(var1x);
            return var1x;
         });
         var1.id_byte(true);
      }

      rcy_3 var10 = var0.id_protected("TileEntities", 10);

      for (int var11 = 0; var11 < var10.size(); var11++) {
         rcd_3 var6 = var10.id_class(var11);
         boolean var7 = var6.id_new("keepPacked");
         if (var7) {
            var1.id_class(var6);
         } else {
            rfH_2 var8 = new rfH_2(var6.id_private("x"), var6.id_private("y"), var6.id_private("z"));
            ryO_2 var9 = ryO_2.id_break(var1.id_byte(var8), var6);
            if (var9 != null) {
               var1.id_class(var9);
            }
         }
      }
   }

   public static rcd_3 id_class(rrEm_1 var0, roC_2 var1) {
      rfj_3 var2 = var1.id_private();
      rcd_3 var3 = new rcd_3();
      rcd_3 var4 = new rcd_3();
      var3.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
      var3.id_class("Level", var4);
      var4.id_break("xPos", var2.id_break);
      var4.id_break("zPos", var2.id_byte);
      var4.id_class("LastUpdate", var0.r());
      var4.id_class("InhabitedTime", var1.id_this());
      var4.id_class("Status", var1.id_goto().id_protected());
      rVh_1 var5 = var1.id_synchronized();
      if (!var5.id_class()) {
         var4.id_class("UpgradeData", var5.id_break());
      }

      roQ_2[] var6 = var1.id_byte();
      rcy_3 var7 = new rcy_3();
      rrEZ var8 = var0.id_else().id_protected();
      boolean var9 = var1.id_throw();

      for (int var10 = -1; var10 < 17; var10++) {
         int var11 = var10;
         roQ_2 var12 = Arrays.stream(var6).filter(var1x -> var1x != null && var1x.id_catch() >> 4 == var11).findFirst().orElse(roJ_2.id_class);
         roH_2 var13 = var8.id_class(rRo_1.BLOCK).id_class(rjh_3.id_class(var2, var11));
         roH_2 var14 = var8.id_class(rRo_1.SKY).id_class(rjh_3.id_class(var2, var11));
         if (var12 != roJ_2.id_class || var13 != null || var14 != null) {
            rcd_3 var15 = new rcd_3();
            var15.id_class("Y", (byte)(var11 & 0xFF));
            if (var12 != roJ_2.id_class) {
               var12.id_implements().id_class(var15, "Palette", "BlockStates");
            }

            if (var13 != null && !var13.id_byte()) {
               var15.id_class("BlockLight", var13.id_class());
            }

            if (var14 != null && !var14.id_byte()) {
               var15.id_class("SkyLight", var14.id_class());
            }

            var7.add(var15);
         }
      }

      var4.id_class("Sections", var7);
      if (var9) {
         var4.id_class("isLightOn", true);
      }

      rYZ var20 = var1.id_implements();
      if (var20 != null) {
         var4.id_class("Biomes", var20.id_class());
      }

      rcy_3 var21 = new rcy_3();

      for (rfH_2 var24 : var1.id_break()) {
         rcd_3 var28 = var1.id_protected(var24);
         if (var28 != null) {
            var21.add(var28);
         }
      }

      var4.id_class("TileEntities", var21);
      rcy_3 var23 = new rcy_3();
      if (var1.id_goto().id_catch() == roZ_2.LEVELCHUNK) {
         roJ_2 var25 = (roJ_2)var1;
         var25.id_byte(false);

         for (int var29 = 0; var29 < var25.id_final().length; var29++) {
            for (an_3 var16 : var25.id_final()[var29]) {
               rcd_3 var17 = new rcd_3();
               if (var16.id_byte(var17)) {
                  var25.id_byte(true);
                  var23.add(var17);
               }
            }
         }
      } else {
         rok_3 var26 = (rok_3)var1;
         var23.addAll(var26.id_case());
         var4.id_class("Lights", id_class(var26.id_protected()));
         rcd_3 var30 = new rcd_3();

         for (rKu_1 var18 : rKu_1.values()) {
            BitSet var19 = var26.id_class(var18);
            if (var19 != null) {
               var30.id_class(var18.toString(), var19.toByteArray());
            }
         }

         var4.id_class("CarvingMasks", var30);
      }

      var4.id_class("Entities", var23);
      rRV var27 = var1.id_int();
      if (var27 instanceof roW_2) {
         var4.id_class("ToBeTicked", ((roW_2)var27).id_class());
      } else if (var27 instanceof rRe_1) {
         var4.id_class("TileTicks", ((rRe_1)var27).id_class());
      } else {
         var4.id_class("TileTicks", var0.id_synchronized().id_class(var2));
      }

      rRV var31 = var1.id_new();
      if (var31 instanceof roW_2) {
         var4.id_class("LiquidsToBeTicked", ((roW_2)var31).id_class());
      } else if (var31 instanceof rRe_1) {
         var4.id_class("LiquidTicks", ((rRe_1)var31).id_class());
      } else {
         var4.id_class("LiquidTicks", var0.id_return().id_class(var2));
      }

      var4.id_class("PostProcessing", id_class(var1.id_return()));
      rcd_3 var34 = new rcd_3();

      for (Entry var38 : var1.id_native()) {
         if (var1.id_goto().id_private().contains(var38.getKey())) {
            var34.id_class(((rKv_1)var38.getKey()).id_break(), new rcq_3(((rKZ)var38.getValue()).id_class()));
         }
      }

      var4.id_class("Heightmaps", var34);
      var4.id_class("Structures", id_class(var2, var1.id_super(), var1.id_class()));
      return var3;
   }

   private static Map<rrrZ<?>, LongSet> id_class(rfj_3 var0, rcd_3 var1) {
      HashMap var2 = Maps.newHashMap();
      rcd_3 var3 = var1.id_int("References");

      for (String var5 : var3.id_protected()) {
         var2.put((rrrZ)rrrZ.id_class.get(var5.toLowerCase(Locale.ROOT)), new LongOpenHashSet(Arrays.stream(var3.id_package(var5)).filter(var2x -> {
            rfj_3 var4 = new rfj_3(var2x);
            if (var4.id_class(var0) > 8) {
               id_class.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", var5, var4, var0);
               return false;
            } else {
               return true;
            }
         }).toArray()));
      }

      return var2;
   }

   private static Map<rrrZ<?>, rrrH<?>> id_class(rrPt_1 var0, rcd_3 var1, long var2) {
      HashMap var4 = Maps.newHashMap();
      rcd_3 var5 = var1.id_int("Starts");

      for (String var7 : var5.id_protected()) {
         String var8 = var7.toLowerCase(Locale.ROOT);
         rrrZ var9 = (rrrZ)rrrZ.id_class.get(var8);
         if (var9 == null) {
            id_class.error("Unknown structure start: {}", var8);
         } else {
            rrrH var10 = rrrZ.id_class(var0, var5.id_int(var7), var2);
            if (var10 != null) {
               var4.put(var9, var10);
            }
         }
      }

      return var4;
   }

   private static rcd_3 id_class(rfj_3 var0, Map<rrrZ<?>, rrrH<?>> var1, Map<rrrZ<?>, LongSet> var2) {
      rcd_3 var3 = new rcd_3();
      rcd_3 var4 = new rcd_3();

      for (Entry var6 : var1.entrySet()) {
         var4.id_class(((rrrZ)var6.getKey()).id_catch(), ((rrrH)var6.getValue()).id_class(var0.id_break, var0.id_byte));
      }

      var3.id_class("Starts", var4);
      rcd_3 var8 = new rcd_3();

      for (Entry var7 : var2.entrySet()) {
         var8.id_class(((rrrZ)var7.getKey()).id_catch(), new rcq_3((LongSet)var7.getValue()));
      }

      var3.id_class("References", var8);
      return var3;
   }
}
