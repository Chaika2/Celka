package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class rTu_1 {
   private static final BiFunction<Integer, Schema, Schema> class_ = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> break_ = rTA::new;
   private static final DataFixer byte_ = break_();

   public static DataFixer class_() {
      return byte_;
   }

   private static void class_(DataFixerBuilder var0) {
      Schema var1 = var0.addSchema(99, rIn_1::new);
      Schema var2 = var0.addSchema(100, rIl_1::new);
      var0.addFixer(new rtA_2(var2, true));
      Schema var3 = var0.addSchema(101, class_);
      var0.addFixer(new rwe_3(var3, false));
      Schema var4 = var0.addSchema(102, rIH::new);
      var0.addFixer(new rtK_2(var4, true));
      var0.addFixer(new rwH_2(var4, false));
      Schema var5 = var0.addSchema(105, class_);
      var0.addFixer(new rIr_1(var5, true));
      Schema var6 = var0.addSchema(106, rIy_1::new);
      var0.addFixer(new rIP(var6, true));
      Schema var7 = var0.addSchema(107, rIp_1::new);
      var0.addFixer(new rwd_3(var7, true));
      Schema var8 = var0.addSchema(108, class_);
      var0.addFixer(new rIs_1(var8, true));
      Schema var9 = var0.addSchema(109, class_);
      var0.addFixer(new rtl_3(var9, true));
      Schema var10 = var0.addSchema(110, class_);
      var0.addFixer(new rtg_3(var10, true));
      Schema var11 = var0.addSchema(111, class_);
      var0.addFixer(new rwv_3(var11, true));
      Schema var12 = var0.addSchema(113, class_);
      var0.addFixer(new rwf_3(var12, true));
      Schema var13 = var0.addSchema(135, rIq_1::new);
      var0.addFixer(new rwR_2(var13, true));
      Schema var14 = var0.addSchema(143, rIT::new);
      var0.addFixer(new rIh_1(var14, true));
      Schema var15 = var0.addSchema(147, class_);
      var0.addFixer(new rTI(var15, true));
      Schema var16 = var0.addSchema(165, class_);
      var0.addFixer(new rtE_2(var16, true));
      Schema var17 = var0.addSchema(501, rIt_1::new);
      var0.addFixer(new rTT(var17, "Add 1.10 entities fix", rTC.int_));
      Schema var18 = var0.addSchema(502, class_);
      var0.addFixer(
         rtU_2.class_(
            var18, "cooked_fished item renamer", var0x -> Objects.equals(rTA.class_(var0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : var0x
         )
      );
      var0.addFixer(new rIm_1(var18, false));
      Schema var19 = var0.addSchema(505, class_);
      var0.addFixer(new rtI_2(var19, false));
      Schema var20 = var0.addSchema(700, rIw_1::new);
      var0.addFixer(new rtL_2(var20, true));
      Schema var21 = var0.addSchema(701, rII::new);
      var0.addFixer(new rwi_3(var21, true));
      Schema var22 = var0.addSchema(702, rIf_1::new);
      var0.addFixer(new rIZ(var22, true));
      Schema var23 = var0.addSchema(703, rIj_1::new);
      var0.addFixer(new rtR_2(var23, true));
      Schema var24 = var0.addSchema(704, rIV::new);
      var0.addFixer(new rIO(var24, true));
      Schema var25 = var0.addSchema(705, rIR::new);
      var0.addFixer(new rtH_2(var25, true));
      Schema var26 = var0.addSchema(804, break_);
      var0.addFixer(new rTj_1(var26, true));
      Schema var27 = var0.addSchema(806, break_);
      var0.addFixer(new rwy_3(var27, false));
      Schema var28 = var0.addSchema(808, rIo_1::new);
      var0.addFixer(new rTT(var28, "added shulker box", rTC.extends_));
      Schema var29 = var0.addSchema(808, 1, break_);
      var0.addFixer(new rwo_3(var29, false));
      Schema var30 = var0.addSchema(813, break_);
      var0.addFixer(new rwK_2(var30, false));
      var0.addFixer(new rwD_2(var30, false));
      Schema var31 = var0.addSchema(816, break_);
      var0.addFixer(new rwZ_2(var31, false));
      Schema var32 = var0.addSchema(820, break_);
      var0.addFixer(rtU_2.class_(var32, "totem item renamer", class_("minecraft:totem", "minecraft:totem_of_undying")));
      Schema var33 = var0.addSchema(1022, rIK::new);
      var0.addFixer(new rTl_1(var33, "added shoulder entities to players", rTC.break_));
      Schema var34 = var0.addSchema(1125, rID::new);
      var0.addFixer(new rTq_1(var34, true));
      var0.addFixer(new rTV(var34, false));
      Schema var35 = var0.addSchema(1344, break_);
      var0.addFixer(new rwG_2(var35, false));
      Schema var36 = var0.addSchema(1446, break_);
      var0.addFixer(new rwE_2(var36, false));
      Schema var37 = var0.addSchema(1450, break_);
      var0.addFixer(new rtP_2(var37, false));
      Schema var38 = var0.addSchema(1451, rIU::new);
      var0.addFixer(new rTT(var38, "AddTrappedChestFix", rTC.extends_));
      Schema var39 = var0.addSchema(1451, 1, rIe_1::new);
      var0.addFixer(new rtO_2(var39, true));
      Schema var40 = var0.addSchema(1451, 2, rIa_1::new);
      var0.addFixer(new rwL_2(var40, true));
      Schema var41 = var0.addSchema(1451, 3, rIi_1::new);
      var0.addFixer(new rts_3(var41, true));
      var0.addFixer(new rto_3(var41, false));
      Schema var42 = var0.addSchema(1451, 4, rfr_3::new);
      var0.addFixer(new rTe_1(var42, true));
      var0.addFixer(new rti_3(var42, false));
      Schema var43 = var0.addSchema(1451, 5, rfP_2::new);
      var0.addFixer(new rTT(var43, "RemoveNoteBlockFlowerPotFix", rTC.extends_));
      var0.addFixer(new rta_3(var43, false));
      var0.addFixer(new rIN(var43, false));
      var0.addFixer(new rTK(var43, false));
      var0.addFixer(new rtr_3(var43, false));
      Schema var44 = var0.addSchema(1451, 6, rfB_2::new);
      var0.addFixer(new rIB(var44, true));
      var0.addFixer(new rws_3(var44, false));
      Schema var45 = var0.addSchema(1451, 7, rfS_2::new);
      var0.addFixer(new rtB_2(var45, true));
      Schema var46 = var0.addSchema(1451, 7, break_);
      var0.addFixer(new rIz_1(var46, false));
      Schema var47 = var0.addSchema(1456, break_);
      var0.addFixer(new rty_3(var47, false));
      Schema var48 = var0.addSchema(1458, break_);
      var0.addFixer(new rtm_3(var48, false));
      var0.addFixer(new rtv_3(var48, false));
      var0.addFixer(new rtZ_2(var48, false));
      Schema var49 = var0.addSchema(1460, rfs_3::new);
      var0.addFixer(new rwF_2(var49, false));
      Schema var50 = var0.addSchema(1466, rfE_2::new);
      var0.addFixer(new rtb_3(var50, true));
      Schema var51 = var0.addSchema(1470, rfG_2::new);
      var0.addFixer(new rTT(var51, "Add 1.13 entities fix", rTC.int_));
      Schema var52 = var0.addSchema(1474, break_);
      var0.addFixer(new rtc_3(var52, false));
      var0.addFixer(
         rTa_1.class_(
            var52,
            "Colorless shulker block fixer",
            var0x -> Objects.equals(rTA.class_(var0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : var0x
         )
      );
      var0.addFixer(
         rtU_2.class_(
            var52, "Colorless shulker item fixer", var0x -> Objects.equals(rTA.class_(var0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : var0x
         )
      );
      Schema var53 = var0.addSchema(1475, break_);
      var0.addFixer(
         rTa_1.class_(var53, "Flowing fixer", class_(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava")))
      );
      Schema var54 = var0.addSchema(1480, break_);
      var0.addFixer(rTa_1.class_(var54, "Rename coral blocks", class_(rwg_3.class_)));
      var0.addFixer(rtU_2.class_(var54, "Rename coral items", class_(rwg_3.class_)));
      Schema var55 = var0.addSchema(1481, rfb_3::new);
      var0.addFixer(new rTT(var55, "Add conduit", rTC.extends_));
      Schema var56 = var0.addSchema(1483, rfM_2::new);
      var0.addFixer(new rwq_3(var56, true));
      var0.addFixer(rtU_2.class_(var56, "Rename pufferfish egg item", class_(rwq_3.class_)));
      Schema var57 = var0.addSchema(1484, break_);
      var0.addFixer(
         rtU_2.class_(
            var57,
            "Rename seagrass items",
            class_(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      var0.addFixer(
         rTa_1.class_(
            var57,
            "Rename seagrass blocks",
            class_(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      var0.addFixer(new rtV_2(var57, false));
      Schema var58 = var0.addSchema(1486, rfO_2::new);
      var0.addFixer(new rtC_2(var58, true));
      var0.addFixer(rtU_2.class_(var58, "Rename cod/salmon egg items", class_(rtC_2.break_)));
      Schema var59 = var0.addSchema(1487, break_);
      var0.addFixer(
         rtU_2.class_(
            var59,
            "Rename prismarine_brick(s)_* blocks",
            class_(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      var0.addFixer(
         rTa_1.class_(
            var59,
            "Rename prismarine_brick(s)_* items",
            class_(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      Schema var60 = var0.addSchema(1488, break_);
      var0.addFixer(
         rTa_1.class_(var60, "Rename kelp/kelptop", class_(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant")))
      );
      var0.addFixer(rtU_2.class_(var60, "Rename kelptop", class_("minecraft:kelp_top", "minecraft:kelp")));
      var0.addFixer(new rTm_1(var60, false, "Command block block entity custom name fix", rTC.extends_, "minecraft:command_block"));
      var0.addFixer(new rTZ(var60, false, "Command block minecart custom name fix", rTC.int_, "minecraft:commandblock_minecart"));
      var0.addFixer(new rtY_2(var60, false));
      Schema var61 = var0.addSchema(1490, break_);
      var0.addFixer(rTa_1.class_(var61, "Rename melon_block", class_("minecraft:melon_block", "minecraft:melon")));
      var0.addFixer(
         rtU_2.class_(
            var61,
            "Rename melon_block/melon/speckled_melon",
            class_(
               ImmutableMap.of(
                  "minecraft:melon_block",
                  "minecraft:melon",
                  "minecraft:melon",
                  "minecraft:melon_slice",
                  "minecraft:speckled_melon",
                  "minecraft:glistering_melon_slice"
               )
            )
         )
      );
      Schema var62 = var0.addSchema(1492, break_);
      var0.addFixer(new rtN_2(var62, false));
      Schema var63 = var0.addSchema(1494, break_);
      var0.addFixer(new rwr_3(var63, false));
      Schema var64 = var0.addSchema(1496, break_);
      var0.addFixer(new rwb_3(var64, false));
      Schema var65 = var0.addSchema(1500, break_);
      var0.addFixer(new rTD(var65, false));
      Schema var66 = var0.addSchema(1501, break_);
      var0.addFixer(new rTw_1(var66, false));
      Schema var67 = var0.addSchema(1502, break_);
      var0.addFixer(new rwt_3(var67, false));
      Schema var68 = var0.addSchema(1506, break_);
      var0.addFixer(new rwh_3(var68, false));
      Schema var69 = var0.addSchema(1510, rfh_3::new);
      var0.addFixer(rTa_1.class_(var69, "Block renamening fix", class_(rtt_3.break_)));
      var0.addFixer(rtU_2.class_(var69, "Item renamening fix", class_(rtt_3.byte_)));
      var0.addFixer(new rww_3(var69, false));
      var0.addFixer(new rtt_3(var69, true));
      var0.addFixer(new rIb_1(var69, false));
      Schema var70 = var0.addSchema(1514, break_);
      var0.addFixer(new rwQ_2(var70, false));
      var0.addFixer(new rIM(var70, false));
      var0.addFixer(new rwN_2(var70, false));
      Schema var71 = var0.addSchema(1515, break_);
      var0.addFixer(rTa_1.class_(var71, "Rename coral fan blocks", class_(rtu_3.class_)));
      Schema var72 = var0.addSchema(1624, break_);
      var0.addFixer(new rIX(var72, false));
      Schema var73 = var0.addSchema(1800, rfX_2::new);
      var0.addFixer(new rTT(var73, "Added 1.14 mobs fix", rTC.int_));
      var0.addFixer(rtU_2.class_(var73, "Rename dye items", class_(rtF_2.class_)));
      Schema var74 = var0.addSchema(1801, rfJ_2::new);
      var0.addFixer(new rTT(var74, "Added Illager Beast", rTC.int_));
      Schema var75 = var0.addSchema(1802, break_);
      var0.addFixer(
         rTa_1.class_(
            var75,
            "Rename sign blocks & stone slabs",
            class_(
               ImmutableMap.of(
                  "minecraft:stone_slab",
                  "minecraft:smooth_stone_slab",
                  "minecraft:sign",
                  "minecraft:oak_sign",
                  "minecraft:wall_sign",
                  "minecraft:oak_wall_sign"
               )
            )
         )
      );
      var0.addFixer(
         rtU_2.class_(
            var75,
            "Rename sign item & stone slabs",
            class_(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema var76 = var0.addSchema(1803, break_);
      var0.addFixer(new rtD_2(var76, false));
      Schema var77 = var0.addSchema(1904, rfx_3::new);
      var0.addFixer(new rTT(var77, "Added Cats", rTC.int_));
      var0.addFixer(new rtn_3(var77, false));
      Schema var78 = var0.addSchema(1905, break_);
      var0.addFixer(new rtz_3(var78, false));
      Schema var79 = var0.addSchema(1906, rfd_3::new);
      var0.addFixer(new rTT(var79, "Add POI Blocks", rTC.extends_));
      Schema var80 = var0.addSchema(1909, rfk_3::new);
      var0.addFixer(new rTT(var80, "Add jigsaw", rTC.extends_));
      Schema var81 = var0.addSchema(1911, break_);
      var0.addFixer(new rtQ_2(var81, false));
      Schema var82 = var0.addSchema(1917, break_);
      var0.addFixer(new rtG_2(var82, false));
      Schema var83 = var0.addSchema(1918, break_);
      var0.addFixer(new rIW(var83, "minecraft:villager"));
      var0.addFixer(new rIW(var83, "minecraft:zombie_villager"));
      Schema var84 = var0.addSchema(1920, rfW_2::new);
      var0.addFixer(new rwz_3(var84, false));
      var0.addFixer(new rTT(var84, "Add campfire", rTC.extends_));
      Schema var85 = var0.addSchema(1925, break_);
      var0.addFixer(new rwJ_2(var85, false));
      Schema var86 = var0.addSchema(1928, rfz_3::new);
      var0.addFixer(new rtp_3(var86, true));
      var0.addFixer(rtU_2.class_(var86, "Rename ravager egg item", class_(rtp_3.class_)));
      Schema var87 = var0.addSchema(1929, rfQ_2::new);
      var0.addFixer(new rTT(var87, "Add Wandering Trader and Trader Llama", rTC.int_));
      Schema var88 = var0.addSchema(1931, rfN_2::new);
      var0.addFixer(new rTT(var88, "Added Fox", rTC.int_));
      Schema var89 = var0.addSchema(1936, break_);
      var0.addFixer(new rwm_3(var89, false));
      Schema var90 = var0.addSchema(1946, break_);
      var0.addFixer(new rwl_3(var90, false));
      Schema var91 = var0.addSchema(1948, break_);
      var0.addFixer(new rwc_3(var91, false));
      Schema var92 = var0.addSchema(1953, break_);
      var0.addFixer(new rwu_3(var92, false));
      Schema var93 = var0.addSchema(1955, break_);
      var0.addFixer(new rIk_1(var93, false));
      var0.addFixer(new rIv_1(var93, false));
      Schema var94 = var0.addSchema(1961, break_);
      var0.addFixer(new rtM_2(var94, false));
      Schema var95 = var0.addSchema(1963, break_);
      var0.addFixer(new rwj_3(var95, false));
      Schema var96 = var0.addSchema(2100, rfc_3::new);
      var0.addFixer(new rTT(var96, "Added Bee and Bee Stinger", rTC.int_));
      var0.addFixer(new rTT(var96, "Add beehive", rTC.extends_));
      var0.addFixer(new rwT_2(var96, false, "Rename sugar recipe", class_("minecraft:sugar", "sugar_from_sugar_cane")));
      var0.addFixer(
         new rTt_1(var96, false, "Rename sugar recipe advancement", class_("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane"))
      );
      Schema var97 = var0.addSchema(2202, break_);
      var0.addFixer(new rTg_1(var97, false));
      Schema var98 = var0.addSchema(2209, break_);
      var0.addFixer(rtU_2.class_(var98, "Rename bee_hive item to beehive", class_("minecraft:bee_hive", "minecraft:beehive")));
      var0.addFixer(new rwV_2(var98));
      var0.addFixer(rTa_1.class_(var98, "Rename bee_hive block to beehive", class_("minecraft:bee_hive", "minecraft:beehive")));
      Schema var99 = var0.addSchema(2211, break_);
      var0.addFixer(new rIE(var99, false));
      Schema var100 = var0.addSchema(2218, break_);
      var0.addFixer(new rwn_3(var100, false));
      Schema var101 = var0.addSchema(2501, rfu_3::new);
      var0.addFixer(new rtf_3(var101, true));
      Schema var102 = var0.addSchema(2502, rfm_3::new);
      var0.addFixer(new rTT(var102, "Added Hoglin", rTC.int_));
      Schema var103 = var0.addSchema(2503, break_);
      var0.addFixer(new rIQ(var103, false));
      var0.addFixer(
         new rTt_1(var103, false, "Composter category change", class_("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter"))
      );
      Schema var104 = var0.addSchema(2505, rfZ_2::new);
      var0.addFixer(new rTT(var104, "Added Piglin", rTC.int_));
      var0.addFixer(new rwx_3(var104, "minecraft:villager"));
      Schema var105 = var0.addSchema(2508, break_);
      var0.addFixer(
         rtU_2.class_(
            var105,
            "Renamed fungi items to fungus",
            class_(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      var0.addFixer(
         rTa_1.class_(
            var105,
            "Renamed fungi blocks to fungus",
            class_(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema var106 = var0.addSchema(2509, rfv_3::new);
      var0.addFixer(new rIF(var106));
      var0.addFixer(rtU_2.class_(var106, "Rename zombie pigman egg item", class_(rIF.class_)));
      Schema var107 = var0.addSchema(2511, break_);
      var0.addFixer(new rwp_3(var107));
      Schema var108 = var0.addSchema(2514, break_);
      var0.addFixer(new rtw_3(var108));
      var0.addFixer(new rTU(var108));
      var0.addFixer(new rwA_2(var108));
      var0.addFixer(new rwX_2(var108));
      var0.addFixer(new rwY_2(var108));
      var0.addFixer(new rwP_2(var108));
      Schema var109 = var0.addSchema(2516, break_);
      var0.addFixer(new rtj_3(var109, "minecraft:villager"));
      var0.addFixer(new rtj_3(var109, "minecraft:zombie_villager"));
      Schema var110 = var0.addSchema(2518, break_);
      var0.addFixer(new rwB_2(var110, false));
      var0.addFixer(new rwS_2(var110, false));
      Schema var111 = var0.addSchema(2519, rfF_2::new);
      var0.addFixer(new rTT(var111, "Added Strider", rTC.int_));
      Schema var112 = var0.addSchema(2522, rfL_2::new);
      var0.addFixer(new rTT(var112, "Added Zoglin", rTC.int_));
      Schema var113 = var0.addSchema(2523, break_);
      var0.addFixer(new rTf_1(var113));
      Schema var114 = var0.addSchema(2527, break_);
      var0.addFixer(new rTo_1(var114));
      Schema var115 = var0.addSchema(2528, break_);
      var0.addFixer(
         rtU_2.class_(
            var115,
            "Rename soul fire torch and soul fire lantern",
            class_(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      var0.addFixer(
         rTa_1.class_(
            var115,
            "Rename soul fire torch and soul fire lantern",
            class_(
               ImmutableMap.of(
                  "minecraft:soul_fire_torch",
                  "minecraft:soul_torch",
                  "minecraft:soul_fire_wall_torch",
                  "minecraft:soul_wall_torch",
                  "minecraft:soul_fire_lantern",
                  "minecraft:soul_lantern"
               )
            )
         )
      );
      Schema var116 = var0.addSchema(2529, break_);
      var0.addFixer(new rIS(var116, false));
      Schema var117 = var0.addSchema(2531, break_);
      var0.addFixer(new rwI_2(var117));
      Schema var118 = var0.addSchema(2533, break_);
      var0.addFixer(new rId_1(var118));
      Schema var119 = var0.addSchema(2535, break_);
      var0.addFixer(new rwU_2(var119));
      Schema var120 = var0.addSchema(2550, break_);
      var0.addFixer(new rIc_1(var120));
      Schema var121 = var0.addSchema(2551, rfA_2::new);
      var0.addFixer(new rTl_1(var121, "add types to WorldGenData", rTC.goto_));
      Schema var122 = var0.addSchema(2552, break_);
      var0.addFixer(new rTR(var122, false, "Nether biome rename", ImmutableMap.of("minecraft:nether", "minecraft:nether_wastes")));
      Schema var123 = var0.addSchema(2553, break_);
      var0.addFixer(new rTY(var123, false));
      Schema var124 = var0.addSchema(2558, break_);
      var0.addFixer(new rwk_3(var124, false));
      var0.addFixer(new rIG(var124, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema var125 = var0.addSchema(2568, rfn_3::new);
      var0.addFixer(new rTT(var125, "Added Piglin Brute", rTC.int_));
   }

   private static UnaryOperator<String> class_(Map<String, String> var0) {
      return var1 -> var0.getOrDefault(var1, var1);
   }

   private static UnaryOperator<String> class_(String var0, String var1) {
      return var2 -> Objects.equals(var2, var0) ? var1 : var2;
   }

   private static DataFixer break_() {
      rTL var0 = new rTL(rqu_3.class_().getWorldVersion());
      class_(var0);
      return var0.build(rqR_2.throws_());
   }
}
