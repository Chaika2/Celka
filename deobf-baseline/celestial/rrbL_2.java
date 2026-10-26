package celestial;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class rrbL_2 {
   private String id_class = null;
   private String id_break = null;
   private rrbn_3 id_byte = null;
   private Map<rqO_2, rqO_2> id_protected = null;
   private rrMH id_throws = null;
   private rrMk_1[] id_case = null;
   private rrMq_1 id_catch = null;
   private Boolean id_private = null;
   private Boolean id_implements = null;
   private Boolean id_finally = null;
   private Boolean id_extends = null;
   private rrMq_1 id_native = null;
   private rrMC[] id_volatile = null;
   private rrbC_2[] id_final = null;
   private rxL_2[] id_package = null;
   private static final rrbC_2[] id_int = new rrbC_2[]{rrbC_2.HORSE, rrbC_2.DONKEY, rrbC_2.MULE, rrbC_2.LLAMA};
   private static final rrbC_2[] id_new = new rrbC_2[]{rrbC_2.DISPENSER, rrbC_2.DROPPER};
   private static final rrbC_2[] id_continue = new rrbC_2[0];
   private static final rxL_2[] id_super = new rxL_2[0];
   private static final rqO_2 id_this = new rqO_2("textures/gui/container/anvil.png");
   private static final rqO_2 id_else = new rqO_2("textures/gui/container/beacon.png");
   private static final rqO_2 id_synchronized = new rqO_2("textures/gui/container/brewing_stand.png");
   private static final rqO_2 id_return = new rqO_2("textures/gui/container/generic_54.png");
   private static final rqO_2 id_public = new rqO_2("textures/gui/container/crafting_table.png");
   private static final rqO_2 id_goto = new rqO_2("textures/gui/container/horse.png");
   private static final rqO_2 id_while = new rqO_2("textures/gui/container/dispenser.png");
   private static final rqO_2 id_try = new rqO_2("textures/gui/container/enchanting_table.png");
   private static final rqO_2 id_instanceof = new rqO_2("textures/gui/container/furnace.png");
   private static final rqO_2 id_throw = new rqO_2("textures/gui/container/hopper.png");
   private static final rqO_2 id_interface = new rqO_2("textures/gui/container/inventory.png");
   private static final rqO_2 id_char = new rqO_2("textures/gui/container/shulker_box.png");
   private static final rqO_2 id_abstract = new rqO_2("textures/gui/container/villager2.png");

   private static rxL_2 id_byte(String var0) {
      if (var0 == null) {
         return null;
      } else {
         rxL_2[] var1 = rxL_2.values();

         for (int var2 = 0; var2 < var1.length; var2++) {
            rxL_2 var3 = var1[var2];
            if (var3.id_class().equals(var0)) {
               return var3;
            }

            if (var3.id_byte().equals(var0)) {
               return var3;
            }
         }

         return null;
      }
   }

   private boolean id_byte(rfH_2 var1, rRp_1 var2) {
      if (!(var2.id_class(var1) instanceof rHC var4)) {
         return false;
      } else {
         if (this.id_final != null) {
            rrbC_2 var5 = this.id_class(var4);
            if (!rrbb_3.id_class(var5, this.id_final)) {
               return false;
            }
         }

         return true;
      }
   }

   public rrbL_2(Properties var1, String var2) {
      rrMz_1 var3 = new rrMz_1("CustomGuis");
      this.id_class = var3.id_class(var2);
      this.id_break = var3.id_break(var2);
      this.id_byte = (rrbn_3)var3.id_class(var1.getProperty("container"), rrbn_3.values(), "container");
      this.id_protected = id_class(var1, "texture", this.id_byte, "textures/gui/", this.id_break);
      this.id_throws = var3.id_break("name", var1.getProperty("name"));
      this.id_case = var3.id_case(var1.getProperty("biomes"));
      this.id_catch = var3.id_native(var1.getProperty("heights"));
      this.id_private = var3.id_volatile(var1.getProperty("large"));
      this.id_implements = var3.id_volatile(var1.getProperty("trapped"));
      this.id_finally = var3.id_volatile(var1.getProperty("christmas"));
      this.id_extends = var3.id_volatile(var1.getProperty("ender"));
      this.id_native = var3.id_native(var1.getProperty("levels"));
      this.id_volatile = var3.id_final(var1.getProperty("professions"));
      rrbC_2[] var4 = id_class(this.id_byte);
      this.id_final = (rrbC_2[])var3.id_class(var1.getProperty("variants"), var4, "variants", id_continue);
      this.id_package = id_break(var1.getProperty("colors"));
   }

   @Override
   public String toString() {
      return "name: " + this.id_class + ", container: " + this.id_byte + ", textures: " + this.id_protected;
   }

   private static rrbC_2[] id_class(rrbn_3 var0) {
      if (var0 == rrbn_3.HORSE) {
         return id_int;
      } else {
         return var0 == rrbn_3.DISPENSER ? id_new : new rrbC_2[0];
      }
   }

   private rrbC_2 id_class(rHC var1) {
      return var1 instanceof rHl_1 ? rrbC_2.DROPPER : rrbC_2.DISPENSER;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean id_class(rrbn_3 var1, an_3 var2, rRR var3) {
      if (!this.id_class(var1, var2.Bs(), var3)) {
         return false;
      } else {
         if (this.id_throws != null) {
            String var4 = var2.i();
            if (!this.id_throws.id_class(var4)) {
               return false;
            }
         }

         switch (var1) {
            case HORSE:
               return this.id_break(var2, var3);
            case VILLAGER:
               return this.id_class(var2, var3);
            default:
               return true;
         }
      }
   }

   private boolean id_class(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.id_private != null && this.id_private != var1) {
         return false;
      } else if (this.id_implements != null && this.id_implements != var2) {
         return false;
      } else {
         return this.id_finally != null && this.id_finally != var3 ? false : this.id_extends == null || this.id_extends == var4;
      }
   }

   private boolean id_class(rHq_1 var1, rfH_2 var2, rRp_1 var3) {
      return this.id_class(false, false, false, true);
   }

   private boolean id_class(rHu_1 var1, rfH_2 var2, rRp_1 var3) {
      xc_3 var4 = var3.id_byte(var2);
      rCt_1 var5 = var4.id_break(xt_3.id_package) ? var4.id_byte(xt_3.id_package) : rCt_1.SINGLE;
      boolean var6 = var5 != rCt_1.SINGLE;
      boolean var7 = var1 instanceof ryQ_2;
      boolean var8 = rrbl_3.id_class;
      boolean var9 = false;
      return this.id_class(var6, var7, var8, var9);
   }

   public rqO_2 id_class(rqO_2 var1) {
      rqO_2 var2 = this.id_protected.get(var1);
      return var2 == null ? var1 : var2;
   }

   public rrbn_3 id_class() {
      return this.id_byte;
   }

   private rrbC_2 id_class(rOD var1) {
      if (var1 instanceof rOi_1) {
         return rrbC_2.HORSE;
      } else if (var1 instanceof rOa_1) {
         return rrbC_2.DONKEY;
      } else if (var1 instanceof rhE_2) {
         return rrbC_2.MULE;
      } else {
         return var1 instanceof rhP_2 ? rrbC_2.LLAMA : null;
      }
   }

   private boolean id_class(an_3 var1, rRp_1 var2) {
      if (!(var1 instanceof rsq_3 var3)) {
         return false;
      } else {
         if (this.id_volatile != null) {
            rsp_3 var4 = var3.su();
            rsT_2 var5 = var4.id_break();
            int var6 = var4.id_byte();
            if (!rrMC.id_class(var5, var6, this.id_volatile)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean id_class(rrbn_3 var1, rfH_2 var2, rRR var3, vm_3 var4) {
      if (!this.id_class(var1, var2, var3)) {
         return false;
      } else {
         if (this.id_throws != null) {
            String var5 = id_class(var4);
            if (!this.id_throws.id_class(var5)) {
               return false;
            }
         }

         switch (var1) {
            case BEACON:
               return this.id_class(var2, var3);
            case CHEST:
               return this.id_break(var2, var3);
            case DISPENSER:
               return this.id_byte(var2, var3);
            case SHULKER_BOX:
               return this.id_protected(var2, var3);
            default:
               return true;
         }
      }
   }

   private static rqO_2 id_class(String var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.trim();
         String var2 = rrzJ_2.id_class(var0, var1);
         if (!var2.endsWith(".png")) {
            var2 = var2 + ".png";
         }

         return new rqO_2(var1 + "/" + var2);
      }
   }

   public boolean id_class(String var1) {
      if (this.id_class == null || this.id_class.length() <= 0) {
         id_protected("No name found: " + var1);
         return false;
      } else if (this.id_break == null) {
         id_protected("No base path found: " + var1);
         return false;
      } else if (this.id_byte == null) {
         id_protected("No container found: " + var1);
         return false;
      } else if (this.id_protected.isEmpty()) {
         id_protected("No texture found: " + var1);
         return false;
      } else if (this.id_volatile == rrMz_1.id_class) {
         id_protected("Invalid professions or careers: " + var1);
         return false;
      } else if (this.id_final == id_continue) {
         id_protected("Invalid variants: " + var1);
         return false;
      } else if (this.id_package == id_super) {
         id_protected("Invalid colors: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private static Map<rqO_2, rqO_2> id_class(Properties var0, String var1, rrbn_3 var2, String var3, String var4) {
      HashMap var5 = new HashMap();
      String var6 = var0.getProperty(var1);
      if (var6 != null) {
         rqO_2 var7 = id_break(var2);
         rqO_2 var8 = id_class(var6, var4);
         if (var7 != null && var8 != null) {
            var5.put(var7, var8);
         }
      }

      String var15 = var1 + ".";

      for (String var9 : var0.keySet()) {
         if (var9.startsWith(var15)) {
            String var10 = var9.substring(var15.length());
            var10 = var10.replace('\\', '/');
            var10 = rrzX_2.id_byte(var10, "/", ".png");
            String var11 = var3 + var10 + ".png";
            String var12 = var0.getProperty(var9);
            rqO_2 var13 = new rqO_2(var11);
            rqO_2 var14 = id_class(var12, var4);
            var5.put(var13, var14);
         }
      }

      return var5;
   }

   private boolean id_class(rfH_2 var1, rRp_1 var2) {
      if (!(var2.id_class(var1) instanceof rHO var4)) {
         return false;
      } else {
         if (this.id_native != null) {
            int var5 = var4.id_private();
            if (!this.id_native.id_class(var5)) {
               return false;
            }
         }

         return true;
      }
   }

   public static String id_class(vm_3 var0) {
      rgP_2 var1 = var0.id_new();
      return var1 == null ? null : var1.id_break();
   }

   private boolean id_class(rrbn_3 var1, rfH_2 var2, rRR var3) {
      if (this.id_byte != var1) {
         return false;
      } else {
         if (this.id_case != null) {
            rYG var4 = var3.id_implements(var2);
            if (!rrMl_1.id_class(var4, this.id_case)) {
               return false;
            }
         }

         return this.id_catch == null || this.id_catch.id_class(var2.c_());
      }
   }

   private static rqO_2 id_break(rrbn_3 var0) {
      if (var0 == null) {
         return null;
      } else {
         switch (var0) {
            case ANVIL:
               return id_this;
            case BEACON:
               return id_else;
            case BREWING_STAND:
               return id_synchronized;
            case CHEST:
               return id_return;
            case CRAFTING:
               return id_public;
            case CREATIVE:
               return null;
            case DISPENSER:
               return id_while;
            case ENCHANTMENT:
               return id_try;
            case FURNACE:
               return id_instanceof;
            case HOPPER:
               return id_throw;
            case HORSE:
               return id_goto;
            case INVENTORY:
               return id_interface;
            case SHULKER_BOX:
               return id_char;
            case VILLAGER:
               return id_abstract;
            default:
               return null;
         }
      }
   }

   private boolean id_break(rfH_2 var1, rRp_1 var2) {
      ryO_2 var3 = var2.id_class(var1);
      if (var3 instanceof rHu_1 var5) {
         return this.id_class(var5, var1, var2);
      } else {
         return var3 instanceof rHq_1 var4 ? this.id_class(var4, var1, var2) : false;
      }
   }

   private static rxL_2[] id_break(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.toLowerCase();
         String[] var1 = rrbb_3.id_class(var0, " ");
         rxL_2[] var2 = new rxL_2[var1.length];

         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3];
            rxL_2 var5 = id_byte(var4);
            if (var5 == null) {
               id_protected("Invalid color: " + var4);
               return id_super;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   private boolean id_break(an_3 var1, rRp_1 var2) {
      if (!(var1 instanceof rOD var3)) {
         return false;
      } else {
         if (this.id_final != null) {
            rrbC_2 var4 = this.id_class(var3);
            if (!rrbb_3.id_class(var4, this.id_final)) {
               return false;
            }
         }

         if (this.id_package != null && var3 instanceof rhP_2 var6) {
            rxL_2 var5 = var6.sa();
            if (!rrbb_3.id_class(var5, this.id_package)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean id_protected(rfH_2 var1, rRp_1 var2) {
      if (!(var2.id_class(var1) instanceof ryr_3 var4)) {
         return false;
      } else {
         if (this.id_package != null) {
            rxL_2 var5 = var4.id_finally();
            if (!rrbb_3.id_class(var5, this.id_package)) {
               return false;
            }
         }

         return true;
      }
   }

   private static void id_protected(String var0) {
      rrbb_3.id_protected("[CustomGuis] " + var0);
   }
}
