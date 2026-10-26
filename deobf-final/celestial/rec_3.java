package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum rec_3 implements rpH_2 {
   DOWN_EAST("down_east", rpr_3.DOWN, rpr_3.EAST),
   DOWN_NORTH("down_north", rpr_3.DOWN, rpr_3.NORTH),
   DOWN_SOUTH("down_south", rpr_3.DOWN, rpr_3.SOUTH),
   DOWN_WEST("down_west", rpr_3.DOWN, rpr_3.WEST),
   UP_EAST("up_east", rpr_3.UP, rpr_3.EAST),
   UP_NORTH("up_north", rpr_3.UP, rpr_3.NORTH),
   UP_SOUTH("up_south", rpr_3.UP, rpr_3.SOUTH),
   UP_WEST("up_west", rpr_3.UP, rpr_3.WEST),
   WEST_UP("west_up", rpr_3.WEST, rpr_3.UP),
   EAST_UP("east_up", rpr_3.EAST, rpr_3.UP),
   NORTH_UP("north_up", rpr_3.NORTH, rpr_3.UP),
   SOUTH_UP("south_up", rpr_3.SOUTH, rpr_3.UP);

   private static final Int2ObjectMap<rec_3> field_239637_m_ = new Int2ObjectOpenHashMap(values().length);
   private final String field_239638_n_;
   private final rpr_3 field_239639_o_;
   private final rpr_3 field_239640_p_;

   public rpr_3 byte_() {
      return this.field_239639_o_;
   }

   private rec_3(String var3, rpr_3 var4, rpr_3 var5) {
      this.field_239638_n_ = var3;
      this.field_239640_p_ = var4;
      this.field_239639_o_ = var5;
   }

   static {
      for (rec_3 var3 : values()) {
         field_239637_m_.put(break_(var3.field_239639_o_, var3.field_239640_p_), var3);
      }
   }

   public static rec_3 class_(rpr_3 var0, rpr_3 var1) {
      int var2 = break_(var1, var0);
      return (rec_3)field_239637_m_.get(var2);
   }

   @Override
   public String class_() {
      return this.field_239638_n_;
   }

   public rpr_3 break_() {
      return this.field_239640_p_;
   }

   private static int break_(rpr_3 var0, rpr_3 var1) {
      return var0.ordinal() << 3 | var1.ordinal();
   }
}
