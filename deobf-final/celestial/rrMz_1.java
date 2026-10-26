package celestial;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class rrMz_1 {
   private String byte_ = null;
   public static final rrMC[] class_ = new rrMC[0];
   public static final rxL_2[] break_ = new rxL_2[0];
   private static Map<rqO_2, rrMk_1> protected_ = null;
   private static final rrMZ<Enum> throws_ = new rrMQ();
   private static final rrMZ<rxL_2> case_ = new rrMN();

   public static int byte_(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return (int)(Long.parseLong(var0, 16) & -1L);
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   public rrMn_1[] byte_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = rrbb_3.class_(var1, " ");

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            rrMn_1[] var6 = this.protected_(var5);
            if (var6 != null) {
               var2.addAll(Arrays.asList(var6));
            }
         }

         return var2.toArray(new rrMn_1[var2.size()]);
      }
   }

   public int[] int_(String var1) {
      var1 = var1.trim();
      TreeSet var2 = new TreeSet();
      String[] var3 = rrbb_3.class_(var1, " ");

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         rqO_2 var6 = new rqO_2(var5);
         aI_2 var7 = rrWc_1.class_(var6);
         if (var7 == null) {
            this.extends_("Entity not found: " + var5);
         } else {
            int var8 = rVL.transient_.class_(var7);
            if (var8 < 0) {
               this.extends_("Entity has no ID: " + var7 + ", name: " + var5);
            } else {
               var2.add(new Integer(var8));
            }
         }
      }

      Integer[] var10 = var2.toArray(new Integer[var2.size()]);
      return rrbb_3.class_(var10);
   }

   public rrMz_1(String var1) {
      this.byte_ = var1;
   }

   public <T> T[] class_(String var1, T[] var2, rrMZ var3, String var4, T[] var5) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.toLowerCase().trim();
         String[] var6 = rrbb_3.class_(var1, " ");
         Object[] var7 = (Object[])Array.newInstance(var2.getClass().getComponentType(), var6.length);

         for (int var8 = 0; var8 < var6.length; var8++) {
            String var9 = var6[var8];
            Object var10 = this.class_(var9, var2, var3, var4);
            if (var10 == null) {
               return (T[])var5;
            }

            var7[var8] = var10;
         }

         return (T[])var7;
      }
   }

   public boolean[] class_(String var1, boolean[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         EnumSet var3 = EnumSet.allOf(rpr_3.class);
         String[] var4 = rrbb_3.class_(var1, " ,");

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            if (var6.equals("sides")) {
               var3.add(rpr_3.NORTH);
               var3.add(rpr_3.SOUTH);
               var3.add(rpr_3.WEST);
               var3.add(rpr_3.EAST);
            } else if (var6.equals("all")) {
               var3.addAll(Arrays.asList(rpr_3.VALUES));
            } else {
               rpr_3 var7 = this.implements_(var6);
               if (var7 != null) {
                  var3.add(var7);
               }
            }
         }

         boolean[] var8 = new boolean[rpr_3.VALUES.length];

         for (int var9 = 0; var9 < var8.length; var9++) {
            var8[var9] = var3.contains(rpr_3.VALUES[var9]);
         }

         return var8;
      }
   }

   public String class_(String var1) {
      String var2 = var1;
      int var3 = var1.lastIndexOf(47);
      if (var3 >= 0) {
         var2 = var1.substring(var3 + 1);
      }

      int var4 = var2.lastIndexOf(46);
      if (var4 >= 0) {
         var2 = var2.substring(0, var4);
      }

      return var2;
   }

   public int class_(String var1, int var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         int var3 = rrbb_3.class_(var1, -1);
         if (var3 < 0) {
            this.extends_("Invalid number: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   public Enum class_(String var1, Enum[] var2, String var3) {
      return this.class_(var1, var2, throws_, var3);
   }

   public Enum[] class_(String var1, Enum[] var2, String var3, Enum[] var4) {
      return this.class_(var1, var2, throws_, var3, var4);
   }

   public rrMt_1[] class_(String var1, String var2, rrMt_1[] var3) {
      return this.class_(var1, rrMt_1.values(), throws_, var2, var3);
   }

   public boolean class_(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      } else {
         String var3 = var1.toLowerCase().trim();
         if (var3.equals("true")) {
            return true;
         } else if (var3.equals("false")) {
            return false;
         } else {
            this.extends_("Invalid boolean: " + var1);
            return var2;
         }
      }
   }

   public HU class_(String var1, HU var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.toLowerCase().trim();
         HU[] var3 = HU.s;

         for (int var4 = 0; var4 < var3.length; var4++) {
            HU var5 = var3[var4];
            if (var1.equals(var5.byte_().toLowerCase())) {
               return var5;
            }
         }

         return var2;
      }
   }

   public <T> T class_(String var1, T[] var2, rrMZ var3, String var4) {
      if (var1 == null) {
         return null;
      } else {
         String var5 = var1.toLowerCase().trim();

         for (int var6 = 0; var6 < var2.length; var6++) {
            Object var7 = var2[var6];
            String var8 = var3.class_(var7);
            if (var8 != null && var8.toLowerCase().equals(var5)) {
               return (T)var7;
            }
         }

         this.extends_("Invalid " + var4 + ": " + var1);
         return null;
      }
   }

   public xc_3 class_(String var1, xc_3 var2) {
      rrMn_1[] var3 = this.protected_(var1);
      if (var3 == null) {
         return var2;
      } else if (var3.length != 1) {
         return var2;
      } else {
         rrMn_1 var4 = var3[0];
         int var5 = var4.class_();
         xd_3 var6 = rVL.strictfp_.class_(var5);
         return var6.continue_();
      }
   }

   public static Comparable class_(rCZ var0, String var1) {
      Class var2 = var0.case_();
      Comparable var3 = class_(var1, var2);
      if (var3 == null) {
         Collection var4 = var0.class_();
         var3 = class_(var1, var4);
      }

      return var3;
   }

   public int[] class_(xd_3 var1, String[] var2) {
      if (var2.length <= 0) {
         return null;
      } else {
         xc_3 var3 = var1.continue_();
         Collection var4 = var3.public_();
         HashMap var5 = new HashMap();

         for (int var6 = 0; var6 < var2.length; var6++) {
            String var7 = var2[var6];
            if (var7.length() > 0) {
               String[] var8 = rrbb_3.class_(var7, "=");
               if (var8.length != 2) {
                  this.extends_("Invalid block property: " + var7);
                  return null;
               }

               String var9 = var8[0];
               String var10 = var8[1];
               rCZ var11 = rrbM_2.class_(var9, var4);
               if (var11 == null) {
                  this.extends_("Property not found: " + var9 + ", block: " + var1);
                  return null;
               }

               Object var12 = (List)var5.get(var9);
               if (var12 == null) {
                  var12 = new ArrayList();
                  var5.put(var11, var12);
               }

               String[] var13 = rrbb_3.class_(var10, ",");

               for (int var14 = 0; var14 < var13.length; var14++) {
                  String var15 = var13[var14];
                  Comparable var16 = class_(var11, var15);
                  if (var16 == null) {
                     this.extends_("Property value not found: " + var15 + ", property: " + var9 + ", block: " + var1);
                     return null;
                  }

                  var12.add(var16);
               }
            }
         }

         if (var5.isEmpty()) {
            return null;
         } else {
            ArrayList var18 = new ArrayList();
            int var19 = rrWP.break_(var1);

            for (int var20 = 0; var20 < var19; var20++) {
               try {
                  xc_3 var22 = rrWP.class_(var1, var20);
                  if (this.class_(var22, var5)) {
                     var18.add(var20);
                  }
               } catch (IllegalArgumentException var17) {
               }
            }

            if (var18.size() == var19) {
               return null;
            } else {
               int[] var21 = new int[var18.size()];

               for (int var23 = 0; var23 < var21.length; var23++) {
                  var21[var23] = (Integer)var18.get(var23);
               }

               return var21;
            }
         }
      }
   }

   public xd_3[] class_(String var1, String var2) {
      String var3 = var1 + ":" + var2;
      rqO_2 var4 = new rqO_2(var3);
      xd_3 var5 = rrWP.class_(var4);
      if (var5 == null) {
         this.extends_("Block not found for name: " + var3);
         return null;
      } else {
         return new xd_3[]{var5};
      }
   }

   public boolean class_(String[] var1) {
      if (var1.length <= 1) {
         return false;
      } else {
         String var2 = var1[1];
         return var2.length() < 1 ? false : !var2.contains("=");
      }
   }

   public rxL_2[] class_(String var1, String var2, rxL_2[] var3) {
      return this.class_(var1, rxL_2.values(), case_, var2, var3);
   }

   public boolean class_(xc_3 var1, Map<rCZ, List<Comparable>> var2) {
      for (rCZ var4 : var2.keySet()) {
         List var5 = (List)var2.get(var4);
         Comparable var6 = var1.byte_(var4);
         if (var6 == null) {
            return false;
         }

         if (!var5.contains(var6)) {
            return false;
         }
      }

      return true;
   }

   public static Comparable class_(String var0, Class var1) {
      if (var1 == String.class) {
         return var0;
      } else if (var1 == Boolean.class) {
         return Boolean.valueOf(var0);
      } else if (var1 == Float.class) {
         return Float.valueOf(var0);
      } else if (var1 == Double.class) {
         return Double.valueOf(var0);
      } else if (var1 == Integer.class) {
         return Integer.valueOf(var0);
      } else {
         return var1 == Long.class ? Long.valueOf(var0) : null;
      }
   }

   private static Object class_(Comparable var0) {
      return var0 instanceof rpH_2 var1 ? var1.class_() : var0.toString();
   }

   public static Comparable class_(String var0, Collection var1) {
      for (Comparable var3 : (Set)var1) {
         if (class_(var3).equals(var0)) {
            return var3;
         }
      }

      return null;
   }

   public static int break_(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   public String break_(String var1) {
      int var2 = var1.lastIndexOf(47);
      return var2 < 0 ? "" : var1.substring(0, var2);
   }

   public rrMH break_(String var1, String var2) {
      return var1 != null && var2 != null ? new rrMH(var1, var2) : null;
   }

   public boolean throws_(String var1) {
      if (var1 == null) {
         return false;
      } else if (var1.length() < 1) {
         return false;
      } else {
         char var2 = var1.charAt(0);
         return Character.isDigit(var2);
      }
   }

   public void finally_(String var1) {
      rrbb_3.byte_(this.byte_ + ": " + var1);
   }

   public rrMk_1 catch_(String var1) {
      var1 = var1.toLowerCase();
      rqO_2 var2 = new rqO_2(var1);
      rrMk_1 var3 = rrWr_1.break_(var2);
      if (var3 != null) {
         return var3;
      } else {
         String var4 = var1.replace(" ", "").replace("_", "");
         rqO_2 var5 = new rqO_2(var4);
         if (protected_ == null) {
            protected_ = new HashMap<>();

            for (rqO_2 var7 : rrWr_1.break_()) {
               rrMk_1 var8 = rrWr_1.break_(var7);
               if (var8 != null) {
                  String var9 = var7.break_().replace(" ", "").replace("_", "").toLowerCase();
                  rqO_2 var10 = new rqO_2(var7.byte_(), var9);
                  protected_.put(var10, var8);
               }
            }
         }

         var3 = protected_.get(var5);
         return var3 != null ? var3 : null;
      }
   }

   public void extends_(String var1) {
      rrbb_3.protected_(this.byte_ + ": " + var1);
   }

   public rrMk_1[] case_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         boolean var2 = false;
         if (var1.startsWith("!")) {
            var2 = true;
            var1 = var1.substring(1);
         }

         String[] var3 = rrbb_3.class_(var1, " ");
         Object var4 = new ArrayList();

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            rrMk_1 var7 = this.catch_(var6);
            if (var7 == null) {
               this.extends_("Biome not found: " + var6);
            } else {
               var4.add(var7);
            }
         }

         if (var2) {
            HashSet var9 = new HashSet<>(rrWr_1.break_());

            for (rrMk_1 var11 : var4) {
               var9.remove(var11.break_());
            }

            var4 = rrWr_1.class_(var9);
         }

         return var4.toArray(new rrMk_1[var4.size()]);
      }
   }

   private rrMC continue_(String var1) {
      String var2 = var1;
      String var3 = null;
      int var4 = var1.lastIndexOf(58);
      if (var4 >= 0) {
         String var5 = var1.substring(0, var4);
         String var6 = var1.substring(var4 + 1);
         if (var6.isEmpty() || var6.matches("[0-9].*")) {
            var2 = var5;
            var3 = var6;
         }
      }

      rsT_2 var7 = this.super_(var2);
      if (var7 == null) {
         return null;
      } else {
         int[] var8 = this.private_(var3);
         return new rrMC(var7, var8);
      }
   }

   public rpr_3 implements_(String var1) {
      var1 = var1.toLowerCase();
      if (var1.equals("bottom") || var1.equals("down")) {
         return rpr_3.DOWN;
      } else if (var1.equals("top") || var1.equals("up")) {
         return rpr_3.UP;
      } else if (var1.equals("north")) {
         return rpr_3.NORTH;
      } else if (var1.equals("south")) {
         return rpr_3.SOUTH;
      } else if (var1.equals("east")) {
         return rpr_3.EAST;
      } else if (var1.equals("west")) {
         return rpr_3.WEST;
      } else {
         rrbb_3.protected_("Unknown face: " + var1);
         return null;
      }
   }

   private rrMp_1 new_(String var1) {
      if (var1 == null) {
         return null;
      } else if (var1.indexOf(45) >= 0) {
         String[] var5 = rrbb_3.class_(var1, "-");
         if (var5.length != 2) {
            this.extends_("Invalid range: " + var1);
            return null;
         } else {
            int var3 = rrbb_3.class_(var5[0], -1);
            int var4 = rrbb_3.class_(var5[1], -1);
            if (var3 >= 0 && var4 >= 0) {
               return new rrMp_1(var3, var4);
            } else {
               this.extends_("Invalid range: " + var1);
               return null;
            }
         }
      } else {
         int var2 = rrbb_3.class_(var1, -1);
         if (var2 < 0) {
            this.extends_("Invalid integer: " + var1);
            return null;
         } else {
            return new rrMp_1(var2, var2);
         }
      }
   }

   public int[] package_(String var1) {
      var1 = var1.trim();
      TreeSet var2 = new TreeSet();
      String[] var3 = rrbb_3.class_(var1, " ");

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         rqO_2 var6 = new rqO_2(var5);
         rdb_3 var7 = rrWT.class_(var6);
         if (var7 == null) {
            this.extends_("Item not found: " + var5);
         } else {
            int var8 = rrWT.class_(var7);
            if (var8 < 0) {
               this.extends_("Item has no ID: " + var7 + ", name: " + var5);
            } else {
               var2.add(new Integer(var8));
            }
         }
      }

      Integer[] var10 = var2.toArray(new Integer[var2.size()]);
      return rrbb_3.class_(var10);
   }

   private rsT_2 super_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.toLowerCase();
         rqO_2 var2 = new rqO_2(var1);
         rVu_1 var3 = rVL.J;
         return !var3.byte_(var2) ? null : (rsT_2)var3.class_(var2);
      }
   }

   public rrMn_1[] protected_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         if (var1.length() <= 0) {
            return null;
         } else {
            String[] var2 = rrbb_3.class_(var1, ":");
            String var3 = "minecraft";
            byte var4 = 0;
            if (var2.length > 1 && this.class_(var2)) {
               var3 = var2[0];
               var4 = 1;
            } else {
               var3 = "minecraft";
               var4 = 0;
            }

            String var5 = var2[var4];
            String[] var6 = Arrays.copyOfRange(var2, var4 + 1, var2.length);
            xd_3[] var7 = this.class_(var3, var5);
            if (var7 == null) {
               return null;
            } else {
               rrMn_1[] var8 = new rrMn_1[var7.length];

               for (int var9 = 0; var9 < var7.length; var9++) {
                  xd_3 var10 = var7[var9];
                  int var11 = rVL.strictfp_.class_(var10);
                  int[] var12 = null;
                  if (var6.length > 0) {
                     var12 = this.class_(var10, var6);
                     if (var12 == null) {
                        return null;
                     }
                  }

                  rrMn_1 var13 = new rrMn_1(var11, var12);
                  var8[var9] = var13;
               }

               return var8;
            }
         }
      }
   }

   public int[] private_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = rrbb_3.class_(var1, " ,");

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (var5.contains("-")) {
               String[] var12 = rrbb_3.class_(var5, "-");
               if (var12.length != 2) {
                  this.extends_("Invalid interval: " + var5 + ", when parsing: " + var1);
               } else {
                  int var7 = rrbb_3.class_(var12[0], -1);
                  int var8 = rrbb_3.class_(var12[1], -1);
                  if (var7 >= 0 && var8 >= 0 && var7 <= var8) {
                     for (int var9 = var7; var9 <= var8; var9++) {
                        var2.add(var9);
                     }
                  } else {
                     this.extends_("Invalid interval: " + var5 + ", when parsing: " + var1);
                  }
               }
            } else {
               int var6 = rrbb_3.class_(var5, -1);
               if (var6 < 0) {
                  this.extends_("Invalid number: " + var5 + ", when parsing: " + var1);
               } else {
                  var2.add(var6);
               }
            }
         }

         int[] var10 = new int[var2.size()];

         for (int var11 = 0; var11 < var10.length; var11++) {
            var10[var11] = (Integer)var2.get(var11);
         }

         return var10;
      }
   }

   public rrMC[] final_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = rrbb_3.class_(var1, " ");

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            rrMC var6 = this.continue_(var5);
            if (var6 == null) {
               this.extends_("Invalid profession: " + var5);
               return class_;
            }

            var2.add(var6);
         }

         return var2.isEmpty() ? null : var2.toArray(new rrMC[var2.size()]);
      }
   }

   public Boolean volatile_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.toLowerCase().trim();
         if (var2.equals("true")) {
            return Boolean.TRUE;
         } else if (var2.equals("false")) {
            return Boolean.FALSE;
         } else {
            this.extends_("Invalid boolean: " + var1);
            return null;
         }
      }
   }

   public rrMq_1 native_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         rrMq_1 var2 = new rrMq_1();
         String[] var3 = rrbb_3.class_(var1, " ,");

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            rrMp_1 var6 = this.new_(var5);
            if (var6 == null) {
               return null;
            }

            var2.class_(var6);
         }

         return var2;
      }
   }
}
