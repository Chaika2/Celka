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
   private static final Map<String, String> class_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
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
   private static final Map<String, String> break_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put("Iglu", "Igloo");
      var0.put("TeDP", "Desert_Pyramid");
      var0.put("TeJP", "Jungle_Pyramid");
      var0.put("TeSH", "Swamp_Hut");
   });
   private final boolean byte_;
   private final Map<String, Long2ObjectMap<rcd_3>> protected_ = Maps.newHashMap();
   private final Map<String, rrrL> throws_ = Maps.newHashMap();
   private final List<String> case_;
   private final List<String> catch_;

   public rat_3(rrEi_1 var1, List<String> var2, List<String> var3) {
      this.case_ = var2;
      this.catch_ = var3;
      this.class_(var1);
      boolean var4 = false;

      for (String var6 : this.catch_) {
         var4 |= this.protected_.get(var6) != null;
      }

      this.byte_ = var4;
   }

   public void class_(long var1) {
      for (String var4 : this.case_) {
         rrrL var5 = this.throws_.get(var4);
         if (var5 != null && var5.byte_(var1)) {
            var5.protected_(var1);
            var5.byte_();
         }
      }
   }

   public static rat_3 class_(rqM_2<rYB> var0, rrEi_1 var1) {
      if (var0 == rYB.byte_) {
         return new rat_3(
            var1,
            ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"),
            ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument")
         );
      } else if (var0 == rYB.protected_) {
         ImmutableList var3 = ImmutableList.of("Fortress");
         return new rat_3(var1, var3, var3);
      } else if (var0 == rYB.throws_) {
         ImmutableList var2 = ImmutableList.of("EndCity");
         return new rat_3(var1, var2, var2);
      } else {
         throw new RuntimeException(String.format("Unknown dimension type : %s", var0));
      }
   }

   private void class_(rrEi_1 var1) {
      if (var1 != null) {
         Iterator var2 = this.case_.iterator();

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
                  var4 = var1.class_(var3, 1493).int_("data").int_("Features");
                  if (var4.case_()) {
                     continue;
                  }
               } catch (IOException var13) {
               }
               break;
            }

            for (String var6 : var4.protected_()) {
               rcd_3 var7 = var4.int_(var6);
               long var8 = rfj_3.class_(var7.private_("ChunkX"), var7.private_("ChunkZ"));
               rcy_3 var10 = var7.protected_("Children", 10);
               if (!var10.isEmpty()) {
                  String var11 = var10.class_(0).native_("id");
                  String var12 = break_.get(var11);
                  if (var12 != null) {
                     var7.class_("id", var12);
                  }
               }

               String var19 = var7.native_("id");
               this.protected_.computeIfAbsent(var19, var0 -> new Long2ObjectOpenHashMap()).put(var8, var7);
            }

            String var14 = var3 + "_index";
            rrrL var15 = var1.class_(() -> new rrrL(var14), var14);
            if (!var15.class_().isEmpty()) {
               this.throws_.put(var3, var15);
            } else {
               rrrL var16 = new rrrL(var14);
               this.throws_.put(var3, var16);

               for (String var9 : var4.protected_()) {
                  rcd_3 var18 = var4.int_(var9);
                  var16.class_(rfj_3.class_(var18.private_("ChunkX"), var18.private_("ChunkZ")));
               }

               var16.byte_();
            }
         }
      }
   }

   public rcd_3 class_(rcd_3 var1) {
      rcd_3 var2 = var1.int_("Level");
      rfj_3 var3 = new rfj_3(var2.private_("xPos"), var2.private_("zPos"));
      if (this.class_(var3.break_, var3.byte_)) {
         var1 = this.class_(var1, var3);
      }

      rcd_3 var4 = var2.int_("Structures");
      rcd_3 var5 = var4.int_("References");

      for (String var7 : this.catch_) {
         rrrZ var8 = (rrrZ)rrrZ.class_.get(var7.toLowerCase(Locale.ROOT));
         if (!var5.byte_(var7, 12) && var8 != null) {
            byte var9 = 8;
            LongArrayList var10 = new LongArrayList();

            for (int var11 = var3.break_ - 8; var11 <= var3.break_ + 8; var11++) {
               for (int var12 = var3.byte_ - 8; var12 <= var3.byte_ + 8; var12++) {
                  if (this.class_(var11, var12, var7)) {
                     var10.add(rfj_3.class_(var11, var12));
                  }
               }
            }

            var5.break_(var7, var10);
         }
      }

      var4.class_("References", var5);
      var2.class_("Structures", var4);
      var1.class_("Level", var2);
      return var1;
   }

   private boolean class_(int var1, int var2, String var3) {
      return !this.byte_ ? false : this.protected_.get(var3) != null && this.throws_.get(class_.get(var3)).break_(rfj_3.class_(var1, var2));
   }

   private rcd_3 class_(rcd_3 var1, rfj_3 var2) {
      rcd_3 var3 = var1.int_("Level");
      rcd_3 var4 = var3.int_("Structures");
      rcd_3 var5 = var4.int_("Starts");

      for (String var7 : this.catch_) {
         Long2ObjectMap var8 = this.protected_.get(var7);
         if (var8 != null) {
            long var9 = var2.class_();
            if (this.throws_.get(class_.get(var7)).byte_(var9)) {
               rcd_3 var11 = (rcd_3)var8.get(var9);
               if (var11 != null) {
                  var5.class_(var7, var11);
               }
            }
         }
      }

      var4.class_("Starts", var5);
      var3.class_("Structures", var4);
      var1.class_("Level", var3);
      return var1;
   }

   private boolean class_(int var1, int var2) {
      if (!this.byte_) {
         return false;
      } else {
         for (String var4 : this.catch_) {
            if (this.protected_.get(var4) != null && this.throws_.get(class_.get(var4)).byte_(rfj_3.class_(var1, var2))) {
               return true;
            }
         }

         return false;
      }
   }
}
