package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.BitSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rtO_2 extends DataFix {
   static final Logger class_ = LogManager.getLogger();
   static final BitSet break_ = new BitSet(256);
   static final BitSet byte_ = new BitSet(256);
   static final Dynamic<?> protected_ = rtS_2.break_("{Name:'minecraft:pumpkin'}");
   static final Dynamic<?> throws_ = rtS_2.break_("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
   static final Dynamic<?> case_ = rtS_2.break_("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
   static final Dynamic<?> catch_ = rtS_2.break_("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
   static final Dynamic<?> private_ = rtS_2.break_("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
   static final Dynamic<?> implements_ = rtS_2.break_("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
   static final Dynamic<?> finally_ = rtS_2.break_("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
   static final Dynamic<?> extends_ = rtS_2.break_("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
   static final Dynamic<?> native_ = rtS_2.break_("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
   static final Dynamic<?> volatile_ = rtS_2.break_("{Name:'minecraft:peony',Properties:{half:'upper'}}");
   static final Map<String, Dynamic<?>> final_ = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("minecraft:air0", rtS_2.break_("{Name:'minecraft:flower_pot'}"));
      var0.put("minecraft:red_flower0", rtS_2.break_("{Name:'minecraft:potted_poppy'}"));
      var0.put("minecraft:red_flower1", rtS_2.break_("{Name:'minecraft:potted_blue_orchid'}"));
      var0.put("minecraft:red_flower2", rtS_2.break_("{Name:'minecraft:potted_allium'}"));
      var0.put("minecraft:red_flower3", rtS_2.break_("{Name:'minecraft:potted_azure_bluet'}"));
      var0.put("minecraft:red_flower4", rtS_2.break_("{Name:'minecraft:potted_red_tulip'}"));
      var0.put("minecraft:red_flower5", rtS_2.break_("{Name:'minecraft:potted_orange_tulip'}"));
      var0.put("minecraft:red_flower6", rtS_2.break_("{Name:'minecraft:potted_white_tulip'}"));
      var0.put("minecraft:red_flower7", rtS_2.break_("{Name:'minecraft:potted_pink_tulip'}"));
      var0.put("minecraft:red_flower8", rtS_2.break_("{Name:'minecraft:potted_oxeye_daisy'}"));
      var0.put("minecraft:yellow_flower0", rtS_2.break_("{Name:'minecraft:potted_dandelion'}"));
      var0.put("minecraft:sapling0", rtS_2.break_("{Name:'minecraft:potted_oak_sapling'}"));
      var0.put("minecraft:sapling1", rtS_2.break_("{Name:'minecraft:potted_spruce_sapling'}"));
      var0.put("minecraft:sapling2", rtS_2.break_("{Name:'minecraft:potted_birch_sapling'}"));
      var0.put("minecraft:sapling3", rtS_2.break_("{Name:'minecraft:potted_jungle_sapling'}"));
      var0.put("minecraft:sapling4", rtS_2.break_("{Name:'minecraft:potted_acacia_sapling'}"));
      var0.put("minecraft:sapling5", rtS_2.break_("{Name:'minecraft:potted_dark_oak_sapling'}"));
      var0.put("minecraft:red_mushroom0", rtS_2.break_("{Name:'minecraft:potted_red_mushroom'}"));
      var0.put("minecraft:brown_mushroom0", rtS_2.break_("{Name:'minecraft:potted_brown_mushroom'}"));
      var0.put("minecraft:deadbush0", rtS_2.break_("{Name:'minecraft:potted_dead_bush'}"));
      var0.put("minecraft:tallgrass2", rtS_2.break_("{Name:'minecraft:potted_fern'}"));
      var0.put("minecraft:cactus0", rtS_2.break_(2240));
   });
   static final Map<String, Dynamic<?>> package_ = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      class_(var0, 0, "skeleton", "skull");
      class_(var0, 1, "wither_skeleton", "skull");
      class_(var0, 2, "zombie", "head");
      class_(var0, 3, "player", "head");
      class_(var0, 4, "creeper", "head");
      class_(var0, 5, "dragon", "head");
   });
   static final Map<String, Dynamic<?>> int_ = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      class_(var0, "oak_door", 1024);
      class_(var0, "iron_door", 1136);
      class_(var0, "spruce_door", 3088);
      class_(var0, "birch_door", 3104);
      class_(var0, "jungle_door", 3120);
      class_(var0, "acacia_door", 3136);
      class_(var0, "dark_oak_door", 3152);
   });
   static final Map<String, Dynamic<?>> new_ = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      for (int var1 = 0; var1 < 26; var1++) {
         var0.put("true" + var1, rtS_2.break_("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + var1 + "'}}"));
         var0.put("false" + var1, rtS_2.break_("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + var1 + "'}}"));
      }
   });
   private static final Int2ObjectMap<String> continue_ = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(0, "white");
      var0.put(1, "orange");
      var0.put(2, "magenta");
      var0.put(3, "light_blue");
      var0.put(4, "yellow");
      var0.put(5, "lime");
      var0.put(6, "pink");
      var0.put(7, "gray");
      var0.put(8, "light_gray");
      var0.put(9, "cyan");
      var0.put(10, "purple");
      var0.put(11, "blue");
      var0.put(12, "brown");
      var0.put(13, "green");
      var0.put(14, "red");
      var0.put(15, "black");
   });
   static final Map<String, Dynamic<?>> super_ = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      ObjectIterator var1 = continue_.int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         if (!Objects.equals(var2.getValue(), "red")) {
            class_(var0, var2.getIntKey(), (String)var2.getValue());
         }
      }
   });
   static final Map<String, Dynamic<?>> this_ = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      ObjectIterator var1 = continue_.int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         if (!Objects.equals(var2.getValue(), "white")) {
            break_(var0, 15 - var2.getIntKey(), (String)var2.getValue());
         }
      }
   });
   static final Dynamic<?> else_ = rtS_2.break_(0);

   public rtO_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   static {
      byte_.set(2);
      byte_.set(3);
      byte_.set(110);
      byte_.set(140);
      byte_.set(144);
      byte_.set(25);
      byte_.set(86);
      byte_.set(26);
      byte_.set(176);
      byte_.set(177);
      byte_.set(175);
      byte_.set(64);
      byte_.set(71);
      byte_.set(193);
      byte_.set(194);
      byte_.set(195);
      byte_.set(196);
      byte_.set(197);
      break_.set(54);
      break_.set(146);
      break_.set(25);
      break_.set(26);
      break_.set(51);
      break_.set(53);
      break_.set(67);
      break_.set(108);
      break_.set(109);
      break_.set(114);
      break_.set(128);
      break_.set(134);
      break_.set(135);
      break_.set(136);
      break_.set(156);
      break_.set(163);
      break_.set(164);
      break_.set(180);
      break_.set(203);
      break_.set(55);
      break_.set(85);
      break_.set(113);
      break_.set(188);
      break_.set(189);
      break_.set(190);
      break_.set(191);
      break_.set(192);
      break_.set(93);
      break_.set(94);
      break_.set(101);
      break_.set(102);
      break_.set(160);
      break_.set(106);
      break_.set(107);
      break_.set(183);
      break_.set(184);
      break_.set(185);
      break_.set(186);
      break_.set(187);
      break_.set(132);
      break_.set(139);
      break_.set(199);
   }

   private static void class_(Map<String, Dynamic<?>> var0, String var1, int var2) {
      var0.put(
         "minecraft:" + var1 + "eastlowerleftfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerleftfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerlefttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerlefttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastlowerrightfalsefalse", rtS_2.break_(var2));
      var0.put(
         "minecraft:" + var1 + "eastlowerrightfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastlowerrighttruefalse", rtS_2.break_(var2 + 4));
      var0.put(
         "minecraft:" + var1 + "eastlowerrighttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastupperleftfalsefalse", rtS_2.break_(var2 + 8));
      var0.put("minecraft:" + var1 + "eastupperleftfalsetrue", rtS_2.break_(var2 + 10));
      var0.put(
         "minecraft:" + var1 + "eastupperlefttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastupperlefttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastupperrightfalsefalse", rtS_2.break_(var2 + 9));
      var0.put("minecraft:" + var1 + "eastupperrightfalsetrue", rtS_2.break_(var2 + 11));
      var0.put(
         "minecraft:" + var1 + "eastupperrighttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastupperrighttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerleftfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerleftfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerlefttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerlefttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "northlowerrightfalsefalse", rtS_2.break_(var2 + 3));
      var0.put(
         "minecraft:" + var1 + "northlowerrightfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "northlowerrighttruefalse", rtS_2.break_(var2 + 7));
      var0.put(
         "minecraft:" + var1 + "northlowerrighttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperleftfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperleftfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperlefttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperlefttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrightfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrightfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrighttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrighttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerleftfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerleftfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerlefttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerlefttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "southlowerrightfalsefalse", rtS_2.break_(var2 + 1));
      var0.put(
         "minecraft:" + var1 + "southlowerrightfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "southlowerrighttruefalse", rtS_2.break_(var2 + 5));
      var0.put(
         "minecraft:" + var1 + "southlowerrighttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperleftfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperleftfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperlefttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperlefttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrightfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrightfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrighttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrighttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerleftfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerleftfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerlefttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerlefttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "westlowerrightfalsefalse", rtS_2.break_(var2 + 2));
      var0.put(
         "minecraft:" + var1 + "westlowerrightfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "westlowerrighttruefalse", rtS_2.break_(var2 + 6));
      var0.put(
         "minecraft:" + var1 + "westlowerrighttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperleftfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperleftfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperlefttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperlefttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrightfalsefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrightfalsetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrighttruefalse",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrighttruetrue",
         rtS_2.break_("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
   }

   public static int class_(boolean var0, boolean var1, boolean var2, boolean var3) {
      short var4 = 0;
      if (var2) {
         if (var1) {
            var4 |= 2;
         } else if (var0) {
            var4 |= 128;
         } else {
            var4 |= 1;
         }
      } else if (var3) {
         if (var0) {
            var4 |= 32;
         } else if (var1) {
            var4 |= 8;
         } else {
            var4 |= 16;
         }
      } else if (var1) {
         var4 |= 4;
      } else if (var0) {
         var4 |= 64;
      }

      return var4;
   }

   private static void class_(Map<String, Dynamic<?>> var0, int var1, String var2, String var3) {
      var0.put(var1 + "north", rtS_2.break_("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'north'}}"));
      var0.put(var1 + "east", rtS_2.break_("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'east'}}"));
      var0.put(var1 + "south", rtS_2.break_("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'south'}}"));
      var0.put(var1 + "west", rtS_2.break_("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'west'}}"));

      for (int var4 = 0; var4 < 16; var4++) {
         var0.put("" + var1 + var4, rtS_2.break_("{Name:'minecraft:" + var2 + "_" + var3 + "',Properties:{rotation:'" + var4 + "'}}"));
      }
   }

   public static String class_(Dynamic<?> var0) {
      return var0.get("Name").asString("");
   }

   public static String class_(Dynamic<?> var0, String var1) {
      return var0.get("Properties").get(var1).asString("");
   }

   public static int class_(rpf_3<Dynamic<?>> var0, Dynamic<?> var1) {
      int var2 = var0.class_(var1);
      if (var2 == -1) {
         var2 = var0.break_(var1);
      }

      return var2;
   }

   private static void class_(Map<String, Dynamic<?>> var0, int var1, String var2) {
      var0.put("southfalsefoot" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}"));
      var0.put("westfalsefoot" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}"));
      var0.put("northfalsefoot" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}"));
      var0.put("eastfalsefoot" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}"));
      var0.put("southfalsehead" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}"));
      var0.put("westfalsehead" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}"));
      var0.put("northfalsehead" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}"));
      var0.put("eastfalsehead" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}"));
      var0.put("southtruehead" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}"));
      var0.put("westtruehead" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}"));
      var0.put("northtruehead" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}"));
      var0.put("easttruehead" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}"));
   }

   private static void break_(Map<String, Dynamic<?>> var0, int var1, String var2) {
      for (int var3 = 0; var3 < 16; var3++) {
         var0.put(var3 + "_" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_banner',Properties:{rotation:'" + var3 + "'}}"));
      }

      var0.put("north_" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'north'}}"));
      var0.put("south_" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'south'}}"));
      var0.put("west_" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'west'}}"));
      var0.put("east_" + var1, rtS_2.break_("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'east'}}"));
   }

   private Dynamic<?> break_(Dynamic<?> var1) {
      Optional var2 = var1.get("Level").result();
      return var2.isPresent() && ((Dynamic)var2.get()).get("Sections").asStreamOpt().result().isPresent()
         ? var1.set("Level", new rtW_2((Dynamic<?>)var2.get()).class_())
         : var1;
   }

   public TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.byte_);
      Type var2 = this.getOutputSchema().getType(rTC.byte_);
      return this.writeFixAndRead("ChunkPalettedStorageFix", var1, var2, this::break_);
   }
}
