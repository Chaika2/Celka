package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class rat_3 {
   private static final Map<String, String> id_class = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put("Village", "Village");
      var0.put("Mineshaft", "Mineshaft");
      var0.put("Mansion", "Mansion");
      var0.put("Igloo", "Temple");
      var0.put("Desert_Pyramid", "Temple");
      var0.put("Jungle_Pyramid", "Temple");
      var0.put("Swamp_Hut", "Temple");
      var0.put("Stronghold", "Stronghold");
      var0.put("Monument", "Monument");
      var0.put("Fortress", "Fortress");
      var0.put("EndCity", "EndCity");
   });
   private static final Map<String, String> id_break = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put("Iglu", "Igloo");
      var0.put("TeDP", "Desert_Pyramid");
      var0.put("TeJP", "Jungle_Pyramid");
      var0.put("TeSH", "Swamp_Hut");
   });
   private final boolean id_byte;
   private final Map<String, Long2ObjectMap<rcd_3>> id_protected = Maps.newHashMap();
   private final Map<String, rrrL> id_throws = Maps.newHashMap();
   private final List<String> id_case;
   private final List<String> id_catch;

   public rat_3(rrEi_1 var1, List<String> var2, List<String> var3) {
      this.id_case = var2;
      this.id_catch = var3;
      this.id_class(var1);
      boolean var4 = false;

      for (String var6 : this.id_catch) {
         var4 |= this.id_protected.get(var6) != null;
      }

      this.id_byte = var4;
   }

   public void id_class(long var1) {
      for (String var4 : this.id_case) {
         rrrL var5 = this.id_throws.get(var4);
         if (var5 != null && var5.id_byte(var1)) {
            var5.id_protected(var1);
            var5.id_byte();
         }
      }
   }

   public static rat_3 id_class(rqM_2<rYB> var0, rrEi_1 var1) {
      if (var0 == rYB.id_byte) {
         return new rat_3(
            var1,
            ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"),
            ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument")
         );
      } else if (var0 == rYB.id_protected) {
         ImmutableList var3 = ImmutableList.of("Fortress");
         return new rat_3(var1, var3, var3);
      } else if (var0 == rYB.id_throws) {
         ImmutableList var2 = ImmutableList.of("EndCity");
         return new rat_3(var1, var2, var2);
      } else {
         throw new RuntimeException(String.format("Unknown dimension type : %s", var0));
      }
   }

   private void id_class(rrEi_1 var1) {
      if (var1 != null) {
         Iterator var2 = this.id_case.iterator();

         while (true) {
            String var3;
            rcd_3 var4;
            while (true) {
               if (!var2.hasNext()) {
                  return;
               }

               var3 = (String)var2.next();
               var4 = new rcd_3();

               try {
                  var4 = var1.id_class(var3, 1493).id_int("data").id_int("Features");
                  if (var4.id_case()) {
                     continue;
                  }
               } catch (IOException var13) {
               }
               break;
            }

            for (String var6 : var4.id_protected()) {
               rcd_3 var7 = var4.id_int(var6);
               long var8 = rfj_3.id_class(var7.id_private("ChunkX"), var7.id_private("ChunkZ"));
               rcy_3 var10 = var7.id_protected("Children", 10);
               if (!var10.isEmpty()) {
                  String var11 = var10.id_class(0).id_native("id");
                  String var12 = id_break.get(var11);
                  if (var12 != null) {
                     var7.id_class("id", var12);
                  }
               }

               String var19 = var7.id_native("id");
               this.id_protected.computeIfAbsent(var19, var0 -> new Long2ObjectOpenHashMap()).put(var8, var7);
            }

            String var14 = var3 + "_index";
            rrrL var15 = var1.id_class(() -> new rrrL(var14), var14);
            if (!var15.id_class().isEmpty()) {
               this.id_throws.put(var3, var15);
            } else {
               rrrL var16 = new rrrL(var14);
               this.id_throws.put(var3, var16);

               for (String var9 : var4.id_protected()) {
                  rcd_3 var18 = var4.id_int(var9);
                  var16.id_class(rfj_3.id_class(var18.id_private("ChunkX"), var18.id_private("ChunkZ")));
               }

               var16.id_byte();
            }
         }
      }
   }

   public rcd_3 id_class(rcd_3 var1) {
      rcd_3 var2 = var1.id_int("Level");
      rfj_3 var3 = new rfj_3(var2.id_private("xPos"), var2.id_private("zPos"));
      if (this.id_class(var3.id_break, var3.id_byte)) {
         var1 = this.id_class(var1, var3);
      }

      rcd_3 var4 = var2.id_int("Structures");
      rcd_3 var5 = var4.id_int("References");

      for (String var7 : this.id_catch) {
         rrrZ var8 = (rrrZ)rrrZ.id_class.get(var7.toLowerCase(Locale.ROOT));
         if (!var5.id_byte(var7, 12) && var8 != null) {
            byte var9 = 8;
            LongArrayList var10 = new LongArrayList();

            for (int var11 = var3.id_break - 8; var11 <= var3.id_break + 8; var11++) {
               for (int var12 = var3.id_byte - 8; var12 <= var3.id_byte + 8; var12++) {
                  if (this.id_class(var11, var12, var7)) {
                     var10.add(rfj_3.id_class(var11, var12));
                  }
               }
            }

            var5.id_break(var7, var10);
         }
      }

      var4.id_class("References", var5);
      var2.id_class("Structures", var4);
      var1.id_class("Level", var2);
      return var1;
   }

   private boolean id_class(int var1, int var2, String var3) {
      return !this.id_byte ? false : this.id_protected.get(var3) != null && this.id_throws.get(id_class.get(var3)).id_break(rfj_3.id_class(var1, var2));
   }

   private rcd_3 id_class(rcd_3 var1, rfj_3 var2) {
      rcd_3 var3 = var1.id_int("Level");
      rcd_3 var4 = var3.id_int("Structures");
      rcd_3 var5 = var4.id_int("Starts");

      for (String var7 : this.id_catch) {
         Long2ObjectMap var8 = this.id_protected.get(var7);
         if (var8 != null) {
            long var9 = var2.id_class();
            if (this.id_throws.get(id_class.get(var7)).id_byte(var9)) {
               rcd_3 var11 = (rcd_3)var8.get(var9);
               if (var11 != null) {
                  var5.id_class(var7, var11);
               }
            }
         }
      }

      var4.id_class("Starts", var5);
      var3.id_class("Structures", var4);
      var1.id_class("Level", var3);
      return var1;
   }

   private boolean id_class(int var1, int var2) {
      if (!this.id_byte) {
         return false;
      } else {
         for (String var4 : this.id_catch) {
            if (this.id_protected.get(var4) != null && this.id_throws.get(id_class.get(var4)).id_byte(rfj_3.id_class(var1, var2))) {
               return true;
            }
         }

         return false;
      }
   }
}
