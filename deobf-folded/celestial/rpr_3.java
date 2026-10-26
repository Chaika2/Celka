package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public enum rpr_3 implements rpH_2 {
   DOWN(0, 1, -1, "down", rpG_2.NEGATIVE, rpB_2.Y, new rja_3(0, -1, 0)),
   UP(1, 0, -1, "up", rpG_2.POSITIVE, rpB_2.Y, new rja_3(0, 1, 0)),
   NORTH(2, 3, 2, "north", rpG_2.NEGATIVE, rpB_2.Z, new rja_3(0, 0, -1)),
   SOUTH(3, 2, 0, "south", rpG_2.POSITIVE, rpB_2.Z, new rja_3(0, 0, 1)),
   WEST(4, 5, 1, "west", rpG_2.NEGATIVE, rpB_2.X, new rja_3(-1, 0, 0)),
   EAST(5, 4, 3, "east", rpG_2.POSITIVE, rpB_2.X, new rja_3(1, 0, 0));

   private final int index;
   private final int opposite;
   private final int horizontalIndex;
   private final String name;
   private final rpB_2 axis;
   private final rpG_2 axisDirection;
   private final rja_3 directionVec;
   public static final rpr_3[] VALUES = values();
   private static final Map<String, rpr_3> NAME_LOOKUP = Arrays.stream(VALUES).collect(Collectors.toMap(rpr_3::id_volatile, var0 -> (rpr_3)var0));
   public static final rpr_3[] BY_INDEX = Arrays.stream(VALUES).sorted(Comparator.comparingInt(var0 -> var0.index)).toArray(rpr_3[]::new);
   private static final rpr_3[] BY_HORIZONTAL_INDEX = Arrays.stream(VALUES)
      .filter(var0 -> var0.id_final().id_protected())
      .sorted(Comparator.comparingInt(var0 -> var0.horizontalIndex))
      .toArray(rpr_3[]::new);
   private static final Long2ObjectMap<rpr_3> BY_LONG = Arrays.stream(VALUES)
      .collect(Collectors.toMap(var0 -> new rfH_2(var0.id_int()).id_package(), var0 -> (rpr_3)var0, (var0, var1) -> {
         throw new IllegalArgumentException("Duplicate keys");
      }, Long2ObjectOpenHashMap::new));

   public int id_byte() {
      return this.index;
   }

   public rja_3 id_int() {
      return this.directionVec;
   }

   private rpr_3(int var3, int var4, int var5, String var6, rpG_2 var7, rpB_2 var8, rja_3 var9) {
      this.index = var3;
      this.horizontalIndex = var5;
      this.opposite = var4;
      this.name = var6;
      this.axis = var8;
      this.axisDirection = var7;
      this.directionVec = var9;
   }

   @Override
   public String toString() {
      return this.name;
   }

   public static rpr_3 id_class(double var0, double var2, double var4) {
      return id_class((float)var0, (float)var2, (float)var4);
   }

   public static rpr_3 id_class(float var0, float var1, float var2) {
      rpr_3 var3 = NORTH;
      float var4 = Float.MIN_VALUE;

      for (rpr_3 var8 : VALUES) {
         float var9 = var0 * (float)var8.directionVec.b_() + var1 * (float)var8.directionVec.c_() + var2 * (float)var8.directionVec.d_();
         if (var9 > var4) {
            var4 = var9;
            var3 = var8;
         }
      }

      return var3;
   }

   public static rpr_3 id_class(rjV_2 var0, rpr_3 var1) {
      rja_3 var2 = var1.id_int();
      rji_3 var3 = new rji_3((float)var2.b_(), (float)var2.c_(), (float)var2.d_(), 0.0F);
      var3.id_class(var0);
      return id_class(var3.id_class(), var3.id_break(), var3.id_byte());
   }

   @Override
   public String id_class() {
      return this.name;
   }

   public static rpr_3 id_class(int var0, int var1, int var2) {
      return (rpr_3)BY_LONG.get(rfH_2.id_throws(var0, var1, var2));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static rpr_3 id_class(rpB_2 var0, rpG_2 var1) {
      switch (var0) {
         case X:
            return var1 == rpG_2.POSITIVE ? EAST : WEST;
         case Y:
            return var1 == rpG_2.POSITIVE ? UP : DOWN;
         case Z:
         default:
            return var1 == rpG_2.POSITIVE ? SOUTH : NORTH;
      }
   }

   public static rpr_3 id_class(double var0) {
      return id_break(rfU_2.id_byte(var0 / 90.0 + 0.5) & 3);
   }

   public static rpr_3[] id_class(an_3 var0) {
      float var1 = var0.id_case(1.0F) * (float) (Math.PI / 180.0);
      float var2 = -var0.id_throws(1.0F) * (float) (Math.PI / 180.0);
      float var3 = rfU_2.id_class(var1);
      float var4 = rfU_2.id_break(var1);
      float var5 = rfU_2.id_class(var2);
      float var6 = rfU_2.id_break(var2);
      boolean var7 = var5 > 0.0F;
      boolean var8 = var3 < 0.0F;
      boolean var9 = var6 > 0.0F;
      float var10 = var7 ? var5 : -var5;
      float var11 = var8 ? -var3 : var3;
      float var12 = var9 ? var6 : -var6;
      float var13 = var10 * var4;
      float var14 = var12 * var4;
      rpr_3 var15 = var7 ? EAST : WEST;
      rpr_3 var16 = var8 ? UP : DOWN;
      rpr_3 var17 = var9 ? SOUTH : NORTH;
      if (var10 > var12) {
         if (var11 > var13) {
            return id_class(var16, var15, var17);
         } else {
            return var14 > var11 ? id_class(var15, var17, var16) : id_class(var15, var16, var17);
         }
      } else if (var11 > var14) {
         return id_class(var16, var17, var15);
      } else {
         return var13 > var11 ? id_class(var17, var15, var16) : id_class(var17, var16, var15);
      }
   }

   public boolean id_class(float var1) {
      float var2 = var1 * (float) (Math.PI / 180.0);
      float var3 = -rfU_2.id_class(var2);
      float var4 = rfU_2.id_break(var2);
      return (float)this.directionVec.b_() * var3 + (float)this.directionVec.d_() * var4 > 0.0F;
   }

   private static rpr_3[] id_class(rpr_3 var0, rpr_3 var1, rpr_3 var2) {
      return new rpr_3[]{var0, var1, var2, var2.id_case(), var1.id_case(), var0.id_case()};
   }

   public static rpr_3 id_class(rpG_2 var0, rpB_2 var1) {
      for (rpr_3 var5 : VALUES) {
         if (var5.id_throws() == var0 && var5.id_final() == var1) {
            return var5;
         }
      }

      throw new IllegalArgumentException("No such direction: " + var0 + " " + var1);
   }

   public static rpr_3 id_class(Random var0) {
      return rqR_2.id_class(VALUES, var0);
   }

   public static rpr_3 id_class(int var0) {
      return BY_INDEX[rfU_2.id_class(var0 % BY_INDEX.length)];
   }

   public static rpr_3 id_class(String var0) {
      return var0 == null ? null : NAME_LOOKUP.get(var0.toLowerCase(Locale.ROOT));
   }

   public rjY_2 id_break() {
      rjY_2 var1 = rje_3.id_break.id_byte(90.0F);
      switch (this) {
         case DOWN:
            return rje_3.id_break.id_byte(180.0F);
         case UP:
            return rjY_2.id_class.id_catch();
         case NORTH:
            var1.id_class(rje_3.id_case.id_byte(180.0F));
            return var1;
         case SOUTH:
            return var1;
         case WEST:
            var1.id_class(rje_3.id_case.id_byte(90.0F));
            return var1;
         case EAST:
         default:
            var1.id_class(rje_3.id_case.id_byte(-90.0F));
            return var1;
      }
   }

   public static rpr_3 id_break(int var0) {
      return BY_HORIZONTAL_INDEX[rfU_2.id_class(var0 % BY_HORIZONTAL_INDEX.length)];
   }

   public rpG_2 id_throws() {
      return this.axisDirection;
   }

   public int id_finally() {
      return this.directionVec.c_();
   }

   public rpr_3 id_catch() {
      switch (this) {
         case NORTH:
            return EAST;
         case SOUTH:
            return WEST;
         case WEST:
            return NORTH;
         case EAST:
            return SOUTH;
         default:
            throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      }
   }

   public int id_extends() {
      return this.directionVec.d_();
   }

   public rpr_3 id_case() {
      return VALUES[this.opposite];
   }

   public int id_implements() {
      return this.directionVec.b_();
   }

   public float id_package() {
      return (float)((this.horizontalIndex & 3) * 90);
   }

   public int id_protected() {
      return this.horizontalIndex;
   }

   public rpr_3 id_private() {
      switch (this) {
         case NORTH:
            return WEST;
         case SOUTH:
            return EAST;
         case WEST:
            return SOUTH;
         case EAST:
            return NORTH;
         default:
            throw new IllegalStateException("Unable to get CCW facing of " + this);
      }
   }

   public rpB_2 id_final() {
      return this.axis;
   }

   public String id_volatile() {
      return this.name;
   }

   public rje_3 id_native() {
      return new rje_3((float)this.id_implements(), (float)this.id_finally(), (float)this.id_extends());
   }
}
