package celestial;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class VR extends rkU_2 {
   private static final Logger id_byte = LogManager.getLogger();
   private Map<gM_2, List<mG_2>> id_protected = ImmutableMap.of();
   private List<mG_2> id_throws = ImmutableList.of();

   public void id_class(Iterable<rkw_3<?>> var1) {
      Map var2 = id_break(var1);
      HashMap var3 = Maps.newHashMap();
      Builder var4 = ImmutableList.builder();
      var2.forEach((var2x, var3x) -> {
         List var4x = var3.put(var2x, var3x.stream().map(mG_2::new).peek(var4::add).collect(ImmutableList.toImmutableList()));
      });
      gM_2.field_243235_w
         .forEach(
            (var1x, var2x) -> {
               List var3x = var3.put(
                  var1x,
                  var2x.stream().flatMap(var1xx -> ((List)var3.getOrDefault(var1xx, ImmutableList.of())).stream()).collect(ImmutableList.toImmutableList())
               );
            }
         );
      this.id_protected = ImmutableMap.copyOf(var3);
      this.id_throws = var4.build();
   }

   public List<mG_2> id_class(gM_2 var1) {
      return this.id_protected.getOrDefault(var1, Collections.emptyList());
   }

   public List<mG_2> id_class() {
      return this.id_throws;
   }

   private static Map<gM_2, List<List<rkw_3<?>>>> id_break(Iterable<rkw_3<?>> var0) {
      HashMap var1 = Maps.newHashMap();
      HashBasedTable var2 = HashBasedTable.create();

      for (rkw_3 var4 : var0) {
         if (!var4.id_implements()) {
            gM_2 var5 = id_catch(var4);
            String var6 = var4.id_protected();
            if (var6.isEmpty()) {
               var1.computeIfAbsent(var5, var0x -> Lists.newArrayList()).add(ImmutableList.of(var4));
            } else {
               Object var7 = (List)var2.get(var5, var6);
               if (var7 == null) {
                  var7 = Lists.newArrayList();
                  var2.put(var5, var6, var7);
                  var1.computeIfAbsent(var5, var0x -> Lists.newArrayList()).add(var7);
               }

               var7.add(var4);
            }
         }
      }

      return var1;
   }

   private static gM_2 id_catch(rkw_3<?> var0) {
      rkj_3 var1 = var0.id_catch();
      if (var1 == rkj_3.id_class) {
         rdn_3 var2 = var0.id_byte();
         rdX_2 var3 = var2.id_break().id_new();
         if (var3 == rdX_2.id_break) {
            return gM_2.CRAFTING_BUILDING_BLOCKS;
         } else if (var3 != rdX_2.id_implements && var3 != rdX_2.id_finally) {
            return var3 == rdX_2.id_protected ? gM_2.CRAFTING_REDSTONE : gM_2.CRAFTING_MISC;
         } else {
            return gM_2.CRAFTING_EQUIPMENT;
         }
      } else if (var1 == rkj_3.id_break) {
         if (var0.id_byte().id_break().id_super()) {
            return gM_2.FURNACE_FOOD;
         } else {
            return var0.id_byte().id_break() instanceof rxJ_2 ? gM_2.FURNACE_BLOCKS : gM_2.FURNACE_MISC;
         }
      } else if (var1 == rkj_3.id_byte) {
         return var0.id_byte().id_break() instanceof rxJ_2 ? gM_2.BLAST_FURNACE_BLOCKS : gM_2.BLAST_FURNACE_MISC;
      } else if (var1 == rkj_3.id_protected) {
         return gM_2.SMOKER_FOOD;
      } else if (var1 == rkj_3.id_case) {
         return gM_2.STONECUTTER;
      } else if (var1 == rkj_3.id_throws) {
         return gM_2.CAMPFIRE;
      } else if (var1 == rkj_3.id_catch) {
         return gM_2.SMITHING;
      } else {
         id_byte.warn("Unknown recipe category: {}/{}", new Supplier[]{() -> rVL.b.id_break(var0.id_catch()), var0::id_case});
         return gM_2.UNKNOWN;
      }
   }
}
