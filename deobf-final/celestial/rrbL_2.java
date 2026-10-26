package celestial;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class rrbL_2 {
   private String class_ = null;
   private String break_ = null;
   private rrbn_3 byte_ = null;
   private Map<rqO_2, rqO_2> protected_ = null;
   private rrMH throws_ = null;
   private rrMk_1[] case_ = null;
   private rrMq_1 catch_ = null;
   private Boolean private_ = null;
   private Boolean implements_ = null;
   private Boolean finally_ = null;
   private Boolean extends_ = null;
   private rrMq_1 native_ = null;
   private rrMC[] volatile_ = null;
   private rrbC_2[] final_ = null;
   private rxL_2[] package_ = null;
   private static final rrbC_2[] int_ = new rrbC_2[]{rrbC_2.HORSE, rrbC_2.DONKEY, rrbC_2.MULE, rrbC_2.LLAMA};
   private static final rrbC_2[] new_ = new rrbC_2[]{rrbC_2.DISPENSER, rrbC_2.DROPPER};
   private static final rrbC_2[] continue_ = new rrbC_2[0];
   private static final rxL_2[] super_ = new rxL_2[0];
   private static final rqO_2 this_ = new rqO_2("textures/gui/container/anvil.png");
   private static final rqO_2 else_ = new rqO_2("textures/gui/container/beacon.png");
   private static final rqO_2 synchronized_ = new rqO_2("textures/gui/container/brewing_stand.png");
   private static final rqO_2 return_ = new rqO_2("textures/gui/container/generic_54.png");
   private static final rqO_2 public_ = new rqO_2("textures/gui/container/crafting_table.png");
   private static final rqO_2 goto_ = new rqO_2("textures/gui/container/horse.png");
   private static final rqO_2 while_ = new rqO_2("textures/gui/container/dispenser.png");
   private static final rqO_2 try_ = new rqO_2("textures/gui/container/enchanting_table.png");
   private static final rqO_2 instanceof_ = new rqO_2("textures/gui/container/furnace.png");
   private static final rqO_2 throw_ = new rqO_2("textures/gui/container/hopper.png");
   private static final rqO_2 interface_ = new rqO_2("textures/gui/container/inventory.png");
   private static final rqO_2 char_ = new rqO_2("textures/gui/container/shulker_box.png");
   private static final rqO_2 abstract_ = new rqO_2("textures/gui/container/villager2.png");

   private static rxL_2 byte_(String var0) {
      if (var0 == null) {
         return null;
      } else {
         rxL_2[] var1 = rxL_2.values();

         for (int var2 = 0; var2 < var1.length; var2++) {
            rxL_2 var3 = var1[var2];
            if (var3.class_().equals(var0)) {
               return var3;
            }

            if (var3.byte_().equals(var0)) {
               return var3;
            }
         }

         return null;
      }
   }

   private boolean byte_(rfH_2 var1, rRp_1 var2) {
      if (!(var2.class_(var1) instanceof rHC var4)) {
         return false;
      } else {
         if (this.final_ != null) {
            rrbC_2 var5 = this.class_(var4);
            if (!rrbb_3.class_(var5, this.final_)) {
               return false;
            }
         }

         return true;
      }
   }

   public rrbL_2(Properties var1, String var2) {
      rrMz_1 var3 = new rrMz_1("CustomGuis");
      this.class_ = var3.class_(var2);
      this.break_ = var3.break_(var2);
      this.byte_ = (rrbn_3)var3.class_(var1.getProperty("container"), rrbn_3.values(), "container");
      this.protected_ = class_(var1, "texture", this.byte_, "textures/gui/", this.break_);
      this.throws_ = var3.break_("name", var1.getProperty("name"));
      this.case_ = var3.case_(var1.getProperty("biomes"));
      this.catch_ = var3.native_(var1.getProperty("heights"));
      this.private_ = var3.volatile_(var1.getProperty("large"));
      this.implements_ = var3.volatile_(var1.getProperty("trapped"));
      this.finally_ = var3.volatile_(var1.getProperty("christmas"));
      this.extends_ = var3.volatile_(var1.getProperty("ender"));
      this.native_ = var3.native_(var1.getProperty("levels"));
      this.volatile_ = var3.final_(var1.getProperty("professions"));
      rrbC_2[] var4 = class_(this.byte_);
      this.final_ = (rrbC_2[])var3.class_(var1.getProperty("variants"), var4, "variants", continue_);
      this.package_ = break_(var1.getProperty("colors"));
   }

   @Override
   public String toString() {
      return "name: " + this.class_ + ", container: " + this.byte_ + ", textures: " + this.protected_;
   }

   private static rrbC_2[] class_(rrbn_3 var0) {
      if (var0 == rrbn_3.HORSE) {
         return int_;
      } else {
         return var0 == rrbn_3.DISPENSER ? new_ : new rrbC_2[0];
      }
   }

   private rrbC_2 class_(rHC var1) {
      return var1 instanceof rHl_1 ? rrbC_2.DROPPER : rrbC_2.DISPENSER;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean class_(rrbn_3 var1, an_3 var2, rRR var3) {
      if (!this.class_(var1, var2.Bs(), var3)) {
         return false;
      } else {
         if (this.throws_ != null) {
            String var4 = var2.i();
            if (!this.throws_.class_(var4)) {
               return false;
            }
         }

         switch (var1) {
            case HORSE:
               return this.break_(var2, var3);
            case VILLAGER:
               return this.class_(var2, var3);
            default:
               return true;
         }
      }
   }

   private boolean class_(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.private_ != null && this.private_ != var1) {
         return false;
      } else if (this.implements_ != null && this.implements_ != var2) {
         return false;
      } else {
         return this.finally_ != null && this.finally_ != var3 ? false : this.extends_ == null || this.extends_ == var4;
      }
   }

   private boolean class_(rHq_1 var1, rfH_2 var2, rRp_1 var3) {
      return this.class_(false, false, false, true);
   }

   private boolean class_(rHu_1 var1, rfH_2 var2, rRp_1 var3) {
      xc_3 var4 = var3.byte_(var2);
      rCt_1 var5 = var4.break_(xt_3.package_) ? var4.byte_(xt_3.package_) : rCt_1.SINGLE;
      boolean var6 = var5 != rCt_1.SINGLE;
      boolean var7 = var1 instanceof ryQ_2;
      boolean var8 = rrbl_3.class_;
      boolean var9 = false;
      return this.class_(var6, var7, var8, var9);
   }

   public rqO_2 class_(rqO_2 var1) {
      rqO_2 var2 = this.protected_.get(var1);
      return var2 == null ? var1 : var2;
   }

   public rrbn_3 class_() {
      return this.byte_;
   }

   private rrbC_2 class_(rOD var1) {
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

   private boolean class_(an_3 var1, rRp_1 var2) {
      if (!(var1 instanceof rsq_3 var3)) {
         return false;
      } else {
         if (this.volatile_ != null) {
            rsp_3 var4 = var3.su();
            rsT_2 var5 = var4.break_();
            int var6 = var4.byte_();
            if (!rrMC.class_(var5, var6, this.volatile_)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean class_(rrbn_3 var1, rfH_2 var2, rRR var3, vm_3 var4) {
      if (!this.class_(var1, var2, var3)) {
         return false;
      } else {
         if (this.throws_ != null) {
            String var5 = class_(var4);
            if (!this.throws_.class_(var5)) {
               return false;
            }
         }

         switch (var1) {
            case BEACON:
               return this.class_(var2, var3);
            case CHEST:
               return this.break_(var2, var3);
            case DISPENSER:
               return this.byte_(var2, var3);
            case SHULKER_BOX:
               return this.protected_(var2, var3);
            default:
               return true;
         }
      }
   }

   private static rqO_2 class_(String var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.trim();
         String var2 = rrzJ_2.class_(var0, var1);
         if (!var2.endsWith(".png")) {
            var2 = var2 + ".png";
         }

         return new rqO_2(var1 + "/" + var2);
      }
   }

   public boolean class_(String var1) {
      if (this.class_ == null || this.class_.length() <= 0) {
         protected_("No name found: " + var1);
         return false;
      } else if (this.break_ == null) {
         protected_("No base path found: " + var1);
         return false;
      } else if (this.byte_ == null) {
         protected_("No container found: " + var1);
         return false;
      } else if (this.protected_.isEmpty()) {
         protected_("No texture found: " + var1);
         return false;
      } else if (this.volatile_ == rrMz_1.class_) {
         protected_("Invalid professions or careers: " + var1);
         return false;
      } else if (this.final_ == continue_) {
         protected_("Invalid variants: " + var1);
         return false;
      } else if (this.package_ == super_) {
         protected_("Invalid colors: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private static Map<rqO_2, rqO_2> class_(Properties var0, String var1, rrbn_3 var2, String var3, String var4) {
      HashMap var5 = new HashMap();
      String var6 = var0.getProperty(var1);
      if (var6 != null) {
         rqO_2 var7 = break_(var2);
         rqO_2 var8 = class_(var6, var4);
         if (var7 != null && var8 != null) {
            var5.put(var7, var8);
         }
      }

      String var15 = var1 + ".";

      for (String var9 : var0.keySet()) {
         if (var9.startsWith(var15)) {
            String var10 = var9.substring(var15.length());
            var10 = var10.replace('\\', '/');
            var10 = rrzX_2.byte_(var10, "/", ".png");
            String var11 = var3 + var10 + ".png";
            String var12 = var0.getProperty(var9);
            rqO_2 var13 = new rqO_2(var11);
            rqO_2 var14 = class_(var12, var4);
            var5.put(var13, var14);
         }
      }

      return var5;
   }

   private boolean class_(rfH_2 var1, rRp_1 var2) {
      if (!(var2.class_(var1) instanceof rHO var4)) {
         return false;
      } else {
         if (this.native_ != null) {
            int var5 = var4.private_();
            if (!this.native_.class_(var5)) {
               return false;
            }
         }

         return true;
      }
   }

   public static String class_(vm_3 var0) {
      rgP_2 var1 = var0.new_();
      return var1 == null ? null : var1.break_();
   }

   private boolean class_(rrbn_3 var1, rfH_2 var2, rRR var3) {
      if (this.byte_ != var1) {
         return false;
      } else {
         if (this.case_ != null) {
            rYG var4 = var3.implements_(var2);
            if (!rrMl_1.class_(var4, this.case_)) {
               return false;
            }
         }

         return this.catch_ == null || this.catch_.class_(var2.c_());
      }
   }

   private static rqO_2 break_(rrbn_3 var0) {
      if (var0 == null) {
         return null;
      } else {
         switch (var0) {
            case ANVIL:
               return this_;
            case BEACON:
               return else_;
            case BREWING_STAND:
               return synchronized_;
            case CHEST:
               return return_;
            case CRAFTING:
               return public_;
            case CREATIVE:
               return null;
            case DISPENSER:
               return while_;
            case ENCHANTMENT:
               return try_;
            case FURNACE:
               return instanceof_;
            case HOPPER:
               return throw_;
            case HORSE:
               return goto_;
            case INVENTORY:
               return interface_;
            case SHULKER_BOX:
               return char_;
            case VILLAGER:
               return abstract_;
            default:
               return null;
         }
      }
   }

   private boolean break_(rfH_2 var1, rRp_1 var2) {
      ryO_2 var3 = var2.class_(var1);
      if (var3 instanceof rHu_1 var5) {
         return this.class_(var5, var1, var2);
      } else {
         return var3 instanceof rHq_1 var4 ? this.class_(var4, var1, var2) : false;
      }
   }

   private static rxL_2[] break_(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.toLowerCase();
         String[] var1 = rrbb_3.class_(var0, " ");
         rxL_2[] var2 = new rxL_2[var1.length];

         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3];
            rxL_2 var5 = byte_(var4);
            if (var5 == null) {
               protected_("Invalid color: " + var4);
               return super_;
            }

            var2[var3] = var5;
         }

         return var2;
      }
   }

   private boolean break_(an_3 var1, rRp_1 var2) {
      if (!(var1 instanceof rOD var3)) {
         return false;
      } else {
         if (this.final_ != null) {
            rrbC_2 var4 = this.class_(var3);
            if (!rrbb_3.class_(var4, this.final_)) {
               return false;
            }
         }

         if (this.package_ != null && var3 instanceof rhP_2 var6) {
            rxL_2 var5 = var6.sa();
            if (!rrbb_3.class_(var5, this.package_)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean protected_(rfH_2 var1, rRp_1 var2) {
      if (!(var2.class_(var1) instanceof ryr_3 var4)) {
         return false;
      } else {
         if (this.package_ != null) {
            rxL_2 var5 = var4.finally_();
            if (!rrbb_3.class_(var5, this.package_)) {
               return false;
            }
         }

         return true;
      }
   }

   private static void protected_(String var0) {
      rrbb_3.protected_("[CustomGuis] " + var0);
   }
}
