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
   private static final Logger class_ = LogManager.getLogger();

   public static rok_3 class_(rrEm_1 var0, rrPt_1 var1, rga_3 var2, rfj_3 var3, rcd_3 var4) {
      rKd_1 var5 = var0.else_().implements_();
      rYY var6 = var5.protected_();
      rcd_3 var7 = var4.int_("Level");
      rfj_3 var8 = new rfj_3(var7.private_("xPos"), var7.private_("zPos"));
      if (!Objects.equals(var3, var8)) {
         class_.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", var3, var3, var8);
      }

      rYZ var9 = new rYZ(var0.new_().break_(rVL.n), var3, var6, var7.byte_("Biomes", 11) ? var7.final_("Biomes") : null);
      rVh_1 var10 = var7.byte_("UpgradeData", 10) ? new rVh_1(var7.int_("UpgradeData")) : rVh_1.class_;
      roW_2 var11 = new roW_2<>(var0x -> var0x == null || var0x.continue_().catch_(), var3, var7.protected_("ToBeTicked", 9));
      roW_2 var12 = new roW_2<>(var0x -> var0x == null || var0x == rXG.class_, var3, var7.protected_("LiquidsToBeTicked", 9));
      boolean var13 = var7.new_("isLightOn");
      rcy_3 var14 = var7.protected_("Sections", 10);
      byte var15 = 16;
      roQ_2[] var16 = new roQ_2[16];
      boolean var17 = var0.default_().break_();
      rrEN var18 = var0.else_();
      rrse_3 var19 = var18.class_();
      if (var13) {
         var19.break_(var3, true);
      }

      for (int var20 = 0; var20 < var14.size(); var20++) {
         rcd_3 var21 = var14.class_(var20);
         byte var22 = var21.case_("Y");
         if (var21.byte_("Palette", 9) && var21.byte_("BlockStates", 12)) {
            roQ_2 var23 = new roQ_2(var22 << 4);
            var23.implements_().class_(var21.protected_("Palette", 10), var21.package_("BlockStates"));
            var23.private_();
            if (!var23.byte_()) {
               var16[var22] = var23;
            }

            var2.class_(var3, var23);
         }

         if (var13) {
            if (var21.byte_("BlockLight", 7)) {
               var19.class_(rRo_1.BLOCK, rjh_3.class_(var3, var22), new roH_2(var21.volatile_("BlockLight")), true);
            }

            if (var17 && var21.byte_("SkyLight", 7)) {
               var19.class_(rRo_1.SKY, rjh_3.class_(var3, var22), new roH_2(var21.volatile_("SkyLight")), true);
            }
         }
      }

      long var36 = var7.implements_("InhabitedTime");
      roZ_2 var37 = class_(var4);
      Object var38;
      if (var37 == roZ_2.LEVELCHUNK) {
         Object var24;
         if (var7.byte_("TileTicks", 9)) {
            var24 = rRe_1.class_(var7.protected_("TileTicks", 10), rVL.strictfp_::break_, rVL.strictfp_::class_);
         } else {
            var24 = var11;
         }

         Object var25;
         if (var7.byte_("LiquidTicks", 9)) {
            var25 = rRe_1.class_(var7.protected_("LiquidTicks", 10), rVL.default_::break_, rVL.default_::class_);
         } else {
            var25 = var12;
         }

         var38 = new roJ_2(var0.byte_(), var3, var9, var10, (rRV<xd_3>)var24, (rRV<rXs_1>)var25, var36, var16, var1x -> class_(var7, var1x));
      } else {
         rok_3 var39 = new rok_3(var3, var10, var16, var11, var12);
         var39.class_(var9);
         var38 = var39;
         var39.break_(var36);
         var39.class_(roN_2.class_(var7.native_("Status")));
         if (var39.goto_().break_(roN_2.implements_)) {
            var39.class_(var19);
         }

         if (!var13 && var39.goto_().break_(roN_2.finally_)) {
            for (rfH_2 var26 : rfH_2.break_(var3.break_(), 0, var3.byte_(), var3.protected_(), 255, var3.throws_())) {
               if (((roC_2)var38).byte_(var26).case_() != 0) {
                  var39.implements_(var26);
               }
            }
         }
      }

      ((roC_2)var38).protected_(var13);
      rcd_3 var40 = var7.int_("Heightmaps");
      EnumSet var42 = EnumSet.noneOf(rKv_1.class);

      for (rKv_1 var27 : ((roC_2)var38).goto_().private_()) {
         String var28 = var27.break_();
         if (var40.byte_(var28, 12)) {
            ((roC_2)var38).class_(var27, var40.package_(var28));
         } else {
            var42.add(var27);
         }
      }

      rKZ.class_((roC_2)var38, var42);
      rcd_3 var44 = var7.int_("Structures");
      ((roC_2)var38).break_(class_(var1, var44, var0.break_()));
      ((roC_2)var38).class_(class_(var3, var44));
      if (var7.new_("shouldSave")) {
         ((roC_2)var38).break_(true);
      }

      rcy_3 var45 = var7.protected_("PostProcessing", 9);

      for (int var46 = 0; var46 < var45.size(); var46++) {
         rcy_3 var29 = var45.break_(var46);

         for (int var30 = 0; var30 < var29.size(); var30++) {
            ((roC_2)var38).break_(var29.protected_(var30), var46);
         }
      }

      if (var37 == roZ_2.LEVELCHUNK) {
         return new roz_3((roJ_2)var38);
      } else {
         rok_3 var47 = (rok_3)var38;
         rcy_3 var48 = var7.protected_("Entities", 10);

         for (int var49 = 0; var49 < var48.size(); var49++) {
            var47.break_(var48.class_(var49));
         }

         rcy_3 var50 = var7.protected_("TileEntities", 10);

         for (int var31 = 0; var31 < var50.size(); var31++) {
            rcd_3 var32 = var50.class_(var31);
            ((roC_2)var38).class_(var32);
         }

         rcy_3 var51 = var7.protected_("Lights", 9);

         for (int var52 = 0; var52 < var51.size(); var52++) {
            rcy_3 var33 = var51.break_(var52);

            for (int var34 = 0; var34 < var33.size(); var34++) {
               var47.class_(var33.protected_(var34), var52);
            }
         }

         rcd_3 var53 = var7.int_("CarvingMasks");

         for (String var55 : var53.protected_()) {
            rKu_1 var35 = rKu_1.valueOf(var55);
            var47.class_(var35, BitSet.valueOf(var53.volatile_(var55)));
         }

         return var47;
      }
   }

   public static rcy_3 class_(ShortList[] var0) {
      rcy_3 var1 = new rcy_3();

      for (ShortList var5 : var0) {
         rcy_3 var6 = new rcy_3();
         if (var5 != null) {
            ShortListIterator var7 = var5.iterator();

            while (var7.hasNext()) {
               Short var8 = (Short)var7.next();
               var6.add(rcD_2.class_(var8));
            }
         }

         var1.add(var6);
      }

      return var1;
   }

   public static roZ_2 class_(rcd_3 var0) {
      if (var0 != null) {
         roN_2 var1 = roN_2.class_(var0.int_("Level").native_("Status"));
         if (var1 != null) {
            return var1.catch_();
         }
      }

      return roZ_2.PROTOCHUNK;
   }

   private static void class_(rcd_3 var0, roJ_2 var1) {
      rcy_3 var2 = var0.protected_("Entities", 10);
      rYB var3 = var1.extends_();

      for (int var4 = 0; var4 < var2.size(); var4++) {
         rcd_3 var5 = var2.class_(var4);
         aI_2.class_(var5, var3, var1x -> {
            var1.class_(var1x);
            return var1x;
         });
         var1.byte_(true);
      }

      rcy_3 var10 = var0.protected_("TileEntities", 10);

      for (int var11 = 0; var11 < var10.size(); var11++) {
         rcd_3 var6 = var10.class_(var11);
         boolean var7 = var6.new_("keepPacked");
         if (var7) {
            var1.class_(var6);
         } else {
            rfH_2 var8 = new rfH_2(var6.private_("x"), var6.private_("y"), var6.private_("z"));
            ryO_2 var9 = ryO_2.break_(var1.byte_(var8), var6);
            if (var9 != null) {
               var1.class_(var9);
            }
         }
      }
   }

   public static rcd_3 class_(rrEm_1 var0, roC_2 var1) {
      rfj_3 var2 = var1.private_();
      rcd_3 var3 = new rcd_3();
      rcd_3 var4 = new rcd_3();
      var3.break_("DataVersion", rqu_3.class_().getWorldVersion());
      var3.class_("Level", var4);
      var4.break_("xPos", var2.break_);
      var4.break_("zPos", var2.byte_);
      var4.class_("LastUpdate", var0.r());
      var4.class_("InhabitedTime", var1.this_());
      var4.class_("Status", var1.goto_().protected_());
      rVh_1 var5 = var1.synchronized_();
      if (!var5.class_()) {
         var4.class_("UpgradeData", var5.break_());
      }

      roQ_2[] var6 = var1.byte_();
      rcy_3 var7 = new rcy_3();
      rrEZ var8 = var0.else_().protected_();
      boolean var9 = var1.throw_();

      for (int var10 = -1; var10 < 17; var10++) {
         int var11 = var10;
         roQ_2 var12 = Arrays.stream(var6).filter(var1x -> var1x != null && var1x.catch_() >> 4 == var11).findFirst().orElse(roJ_2.class_);
         roH_2 var13 = var8.class_(rRo_1.BLOCK).class_(rjh_3.class_(var2, var11));
         roH_2 var14 = var8.class_(rRo_1.SKY).class_(rjh_3.class_(var2, var11));
         if (var12 != roJ_2.class_ || var13 != null || var14 != null) {
            rcd_3 var15 = new rcd_3();
            var15.class_("Y", (byte)(var11 & 0xFF));
            if (var12 != roJ_2.class_) {
               var12.implements_().class_(var15, "Palette", "BlockStates");
            }

            if (var13 != null && !var13.byte_()) {
               var15.class_("BlockLight", var13.class_());
            }

            if (var14 != null && !var14.byte_()) {
               var15.class_("SkyLight", var14.class_());
            }

            var7.add(var15);
         }
      }

      var4.class_("Sections", var7);
      if (var9) {
         var4.class_("isLightOn", true);
      }

      rYZ var20 = var1.implements_();
      if (var20 != null) {
         var4.class_("Biomes", var20.class_());
      }

      rcy_3 var21 = new rcy_3();

      for (rfH_2 var24 : var1.break_()) {
         rcd_3 var28 = var1.protected_(var24);
         if (var28 != null) {
            var21.add(var28);
         }
      }

      var4.class_("TileEntities", var21);
      rcy_3 var23 = new rcy_3();
      if (var1.goto_().catch_() == roZ_2.LEVELCHUNK) {
         roJ_2 var25 = (roJ_2)var1;
         var25.byte_(false);

         for (int var29 = 0; var29 < var25.final_().length; var29++) {
            for (an_3 var16 : var25.final_()[var29]) {
               rcd_3 var17 = new rcd_3();
               if (var16.byte_(var17)) {
                  var25.byte_(true);
                  var23.add(var17);
               }
            }
         }
      } else {
         rok_3 var26 = (rok_3)var1;
         var23.addAll(var26.case_());
         var4.class_("Lights", class_(var26.protected_()));
         rcd_3 var30 = new rcd_3();

         for (rKu_1 var18 : rKu_1.values()) {
            BitSet var19 = var26.class_(var18);
            if (var19 != null) {
               var30.class_(var18.toString(), var19.toByteArray());
            }
         }

         var4.class_("CarvingMasks", var30);
      }

      var4.class_("Entities", var23);
      rRV var27 = var1.int_();
      if (var27 instanceof roW_2) {
         var4.class_("ToBeTicked", ((roW_2)var27).class_());
      } else if (var27 instanceof rRe_1) {
         var4.class_("TileTicks", ((rRe_1)var27).class_());
      } else {
         var4.class_("TileTicks", var0.synchronized_().class_(var2));
      }

      rRV var31 = var1.new_();
      if (var31 instanceof roW_2) {
         var4.class_("LiquidsToBeTicked", ((roW_2)var31).class_());
      } else if (var31 instanceof rRe_1) {
         var4.class_("LiquidTicks", ((rRe_1)var31).class_());
      } else {
         var4.class_("LiquidTicks", var0.return_().class_(var2));
      }

      var4.class_("PostProcessing", class_(var1.return_()));
      rcd_3 var34 = new rcd_3();

      for (Entry var38 : var1.native_()) {
         if (var1.goto_().private_().contains(var38.getKey())) {
            var34.class_(((rKv_1)var38.getKey()).break_(), new rcq_3(((rKZ)var38.getValue()).class_()));
         }
      }

      var4.class_("Heightmaps", var34);
      var4.class_("Structures", class_(var2, var1.super_(), var1.class_()));
      return var3;
   }

   private static Map<rrrZ<?>, LongSet> class_(rfj_3 var0, rcd_3 var1) {
      HashMap var2 = Maps.newHashMap();
      rcd_3 var3 = var1.int_("References");

      for (String var5 : var3.protected_()) {
         var2.put((rrrZ)rrrZ.class_.get(var5.toLowerCase(Locale.ROOT)), new LongOpenHashSet(Arrays.stream(var3.package_(var5)).filter(var2x -> {
            rfj_3 var4 = new rfj_3(var2x);
            if (var4.class_(var0) > 8) {
               class_.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", var5, var4, var0);
               return false;
            } else {
               return true;
            }
         }).toArray()));
      }

      return var2;
   }

   private static Map<rrrZ<?>, rrrH<?>> class_(rrPt_1 var0, rcd_3 var1, long var2) {
      HashMap var4 = Maps.newHashMap();
      rcd_3 var5 = var1.int_("Starts");

      for (String var7 : var5.protected_()) {
         String var8 = var7.toLowerCase(Locale.ROOT);
         rrrZ var9 = (rrrZ)rrrZ.class_.get(var8);
         if (var9 == null) {
            class_.error("Unknown structure start: {}", var8);
         } else {
            rrrH var10 = rrrZ.class_(var0, var5.int_(var7), var2);
            if (var10 != null) {
               var4.put(var9, var10);
            }
         }
      }

      return var4;
   }

   private static rcd_3 class_(rfj_3 var0, Map<rrrZ<?>, rrrH<?>> var1, Map<rrrZ<?>, LongSet> var2) {
      rcd_3 var3 = new rcd_3();
      rcd_3 var4 = new rcd_3();

      for (Entry var6 : var1.entrySet()) {
         var4.class_(((rrrZ)var6.getKey()).catch_(), ((rrrH)var6.getValue()).class_(var0.break_, var0.byte_));
      }

      var3.class_("Starts", var4);
      rcd_3 var8 = new rcd_3();

      for (Entry var7 : var2.entrySet()) {
         var8.class_(((rrrZ)var7.getKey()).catch_(), new rcq_3((LongSet)var7.getValue()));
      }

      var3.class_("References", var8);
      return var3;
   }
}
