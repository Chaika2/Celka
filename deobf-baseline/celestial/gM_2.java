package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum gM_2 {
   CRAFTING_SEARCH(new rdn_3(rdy_3.Xx)),
   CRAFTING_BUILDING_BLOCKS(new rdn_3(xu_3.rI)),
   CRAFTING_REDSTONE(new rdn_3(rdy_3.hD)),
   CRAFTING_EQUIPMENT(new rdn_3(rdy_3.OT), new rdn_3(rdy_3.OA)),
   CRAFTING_MISC(new rdn_3(rdy_3.hY), new rdn_3(rdy_3.Ob)),
   FURNACE_SEARCH(new rdn_3(rdy_3.Xx)),
   FURNACE_FOOD(new rdn_3(rdy_3.hC)),
   FURNACE_BLOCKS(new rdn_3(xu_3.id_break)),
   FURNACE_MISC(new rdn_3(rdy_3.hY), new rdn_3(rdy_3.dP)),
   BLAST_FURNACE_SEARCH(new rdn_3(rdy_3.Xx)),
   BLAST_FURNACE_BLOCKS(new rdn_3(xu_3.Pl)),
   BLAST_FURNACE_MISC(new rdn_3(rdy_3.Op), new rdn_3(rdy_3.hm)),
   SMOKER_SEARCH(new rdn_3(rdy_3.Xx)),
   SMOKER_FOOD(new rdn_3(rdy_3.hC)),
   STONECUTTER(new rdn_3(rdy_3.BV)),
   SMITHING(new rdn_3(rdy_3.hF)),
   CAMPFIRE(new rdn_3(rdy_3.hC)),
   UNKNOWN(new rdn_3(rdy_3.sV));

   public static final List<gM_2> field_243231_s = ImmutableList.of(SMOKER_SEARCH, SMOKER_FOOD);
   public static final List<gM_2> field_243232_t = ImmutableList.of(BLAST_FURNACE_SEARCH, BLAST_FURNACE_BLOCKS, BLAST_FURNACE_MISC);
   public static final List<gM_2> field_243233_u = ImmutableList.of(FURNACE_SEARCH, FURNACE_FOOD, FURNACE_BLOCKS, FURNACE_MISC);
   public static final List<gM_2> field_243234_v = ImmutableList.of(
      CRAFTING_SEARCH, CRAFTING_EQUIPMENT, CRAFTING_BUILDING_BLOCKS, CRAFTING_MISC, CRAFTING_REDSTONE
   );
   public static final Map<gM_2, List<gM_2>> field_243235_w = ImmutableMap.of(
      CRAFTING_SEARCH,
      ImmutableList.of(CRAFTING_EQUIPMENT, CRAFTING_BUILDING_BLOCKS, CRAFTING_MISC, CRAFTING_REDSTONE),
      FURNACE_SEARCH,
      ImmutableList.of(FURNACE_FOOD, FURNACE_BLOCKS, FURNACE_MISC),
      BLAST_FURNACE_SEARCH,
      ImmutableList.of(BLAST_FURNACE_BLOCKS, BLAST_FURNACE_MISC),
      SMOKER_SEARCH,
      ImmutableList.of(SMOKER_FOOD)
   );
   private final List<rdn_3> icons;

   private gM_2(rdn_3... var3) {
      this.icons = ImmutableList.copyOf(var3);
   }

   public static List<gM_2> id_class(rke_3 var0) {
      switch (var0) {
         case CRAFTING:
            return field_243234_v;
         case FURNACE:
            return field_243233_u;
         case BLAST_FURNACE:
            return field_243232_t;
         case SMOKER:
            return field_243231_s;
         default:
            return ImmutableList.of();
      }
   }

   public List<rdn_3> id_class() {
      return this.icons;
   }
}
