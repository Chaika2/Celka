package celestial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

public class rrbM_2 {
   public String id_class = null;
   public String id_break = null;
   public rrMn_1[] id_byte = null;
   public int[] id_protected = null;
   public String[] id_throws = null;
   public int id_case = 0;
   public String[] id_catch = null;
   public int id_private = 0;
   public int id_implements = 63;
   public rrMk_1[] id_finally = null;
   public rrMq_1 id_extends = null;
   public int id_native = 0;
   public boolean id_volatile = false;
   public int[] id_final = null;
   public int id_package = 0;
   public int id_int = 0;
   public int[] id_new = null;
   public int id_continue = 0;
   public int id_super = 1;
   public boolean id_this = false;
   public rrMH id_else = null;
   public int[] id_synchronized = null;
   public int id_return = 1;
   public fj_3[] id_public = null;
   public fj_3[] id_goto = null;
   public rrMn_1[] id_while = null;
   public String[] id_try = null;
   public fj_3[] id_instanceof = null;
   public int id_throw = -1;
   public xc_3 id_interface = xu_3.id_class.id_continue();
   public HU id_char = null;
   public static final int id_abstract = 0;
   public static final int id_long = 1;
   public static final int id_float = 2;
   public static final int id_void = 3;
   public static final int id_static = 4;
   public static final int id_import = 5;
   public static final int id_short = 6;
   public static final int id_default = 7;
   public static final int id_const = 8;
   public static final int id_strictfp = 9;
   public static final int id_boolean = 10;
   public static final int id_transient = 11;
   public static final int id_for = 12;
   public static final int id_double = 13;
   public static final int id_switch = 14;
   public static final int r = 15;
   public static final int P = 0;
   public static final int B = 1;
   public static final int S = 2;
   public static final int s = 3;
   public static final int E = 4;
   public static final int G = 128;
   public static final int b = 1;
   public static final int M = 2;
   public static final int O = 4;
   public static final int h = 8;
   public static final int X = 16;
   public static final int J = 32;
   public static final int x = 60;
   public static final int d = 63;
   public static final int k = 128;
   public static final int W = 1;
   public static final int z = 2;
   public static final int Q = 6;
   public static final int N = 128;
   public static final String c = "<skip>.png";
   public static final String u = "<default>.png";

   private static String id_byte(String var0) {
      String var1 = var0;
      int var2 = var0.lastIndexOf(47);
      if (var2 >= 0) {
         var1 = var0.substring(var2 + 1);
      }

      int var3 = var1.lastIndexOf(46);
      if (var3 >= 0) {
         var1 = var1.substring(0, var3);
      }

      return var1;
   }

   private int[] id_byte() {
      String var1 = "block_";
      if (!this.id_class.startsWith(var1)) {
         return null;
      } else {
         String var2 = this.id_class.substring(var1.length());
         rqO_2 var3 = new rqO_2(var2);
         xd_3 var4 = rrWP.id_class(var3);
         if (var4 == null) {
            return null;
         } else {
            int var5 = rrWP.id_class(var4);
            return new int[]{var5};
         }
      }
   }

   private boolean id_int(String var1) {
      if (!this.id_return(var1)) {
         return false;
      } else if (this.id_char != null && this.id_char != rrxA_2.id_class) {
         return true;
      } else {
         rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
         return false;
      }
   }

   public rrbM_2(Properties var1, String var2) {
      rrMz_1 var3 = new rrMz_1("ConnectedTextures");
      this.id_class = var3.id_class(var2);
      this.id_break = var3.id_break(var2);
      this.id_byte = var3.id_byte(var1.getProperty("matchBlocks"));
      this.id_protected = var3.id_private(var1.getProperty("metadata"));
      this.id_throws = this.id_break(var1.getProperty("matchTiles"));
      this.id_case = id_finally(var1.getProperty("method"));
      this.id_catch = this.id_throws(var1.getProperty("tiles"));
      this.id_private = id_implements(var1.getProperty("connect"));
      this.id_implements = id_catch(var1.getProperty("faces"));
      this.id_finally = var3.id_case(var1.getProperty("biomes"));
      this.id_extends = var3.id_native(var1.getProperty("heights"));
      if (this.id_extends == null) {
         int var4 = var3.id_class(var1.getProperty("minHeight"), -1);
         int var5 = var3.id_class(var1.getProperty("maxHeight"), 1024);
         if (var4 != -1 || var5 != 1024) {
            this.id_extends = new rrMq_1(new rrMp_1(var4, var5));
         }
      }

      this.id_native = var3.id_class(var1.getProperty("renderPass"), -1);
      this.id_volatile = var3.id_class(var1.getProperty("innerSeams"), false);
      this.id_final = this.id_class(var1);
      this.id_package = var3.id_class(var1.getProperty("width"), -1);
      this.id_int = var3.id_class(var1.getProperty("height"), -1);
      this.id_new = var3.id_private(var1.getProperty("weights"));
      this.id_continue = var3.id_class(var1.getProperty("randomLoops"), 0);
      this.id_super = id_case(var1.getProperty("symmetry"));
      this.id_this = var3.id_class(var1.getProperty("linked"), false);
      this.id_else = var3.id_break("name", var1.getProperty("name"));
      this.id_while = var3.id_byte(var1.getProperty("connectBlocks"));
      this.id_try = this.id_break(var1.getProperty("connectTiles"));
      this.id_throw = var3.id_class(var1.getProperty("tintIndex"), -1);
      this.id_interface = var3.id_class(var1.getProperty("tintBlock"), xu_3.id_class.id_continue());
      this.id_char = var3.id_class(var1.getProperty("layer"), rrxA_2.id_break);
   }

   @Override
   public String toString() {
      return "CTM name: "
         + this.id_class
         + ", basePath: "
         + this.id_break
         + ", matchBlocks: "
         + rrbb_3.id_class(this.id_byte)
         + ", matchTiles: "
         + rrbb_3.id_class(this.id_throws);
   }

   private boolean id_this(String var1) {
      if (this.id_catch == null) {
         rrbb_3.id_protected("No tiles defined for vertical: " + var1);
         return false;
      } else if (this.id_catch.length != 4) {
         rrbb_3.id_protected("Invalid tiles, must be exactly 4: " + var1);
         return false;
      } else {
         return true;
      }
   }

   public boolean id_class(int var1) {
      return rrMl_1.id_class(var1, this.id_byte);
   }

   public boolean id_class(int var1, int var2) {
      return rrMl_1.id_class(var1, var2, this.id_byte);
   }

   public boolean id_class(fj_3 var1) {
      return rrMl_1.id_class(var1, this.id_public);
   }

   private int id_class() {
      if (this.id_byte != null) {
         return 1;
      } else {
         return this.id_throws != null ? 2 : 128;
      }
   }

   private void id_class(fj_3[] var1, fJ_2 var2) {
      if (var1 != null) {
         for (int var3 = 0; var3 < var1.length; var3++) {
            fj_3 var4 = var1[var3];
            if (var4 != null) {
               rqO_2 var5 = var4.id_finally();
               fj_3 var6 = var2.id_break(var5);
               if (var6 == null || var6 instanceof fQ_2) {
                  rrbb_3.id_protected("Missing CTM sprite: " + var5 + ", properties: " + this.id_break);
               }

               var1[var3] = var6;
            }
         }
      }
   }

   private int[] id_class(Properties var1) {
      if (this.id_catch == null) {
         return null;
      } else {
         HashMap var2 = new HashMap();

         for (Object var4 : var1.keySet()) {
            if (var4 instanceof String) {
               String var5 = (String)var4;
               String var6 = "ctm.";
               if (var5.startsWith(var6)) {
                  String var7 = var5.substring(var6.length());
                  String var8 = var1.getProperty(var5);
                  if (var8 != null) {
                     var8 = var8.trim();
                     int var9 = rrbb_3.id_class(var7, -1);
                     if (var9 >= 0 && var9 <= 46) {
                        int var10 = rrbb_3.id_class(var8, -1);
                        if (var10 >= 0 && var10 < this.id_catch.length) {
                           var2.put(var9, var10);
                        } else {
                           rrbb_3.id_protected("Invalid CTM tile index: " + var8);
                        }
                     } else {
                        rrbb_3.id_protected("Invalid CTM index: " + var7);
                     }
                  }
               }
            }
         }

         if (var2.isEmpty()) {
            return null;
         } else {
            int[] var11 = new int[47];

            for (int var12 = 0; var12 < var11.length; var12++) {
               var11[var12] = -1;
               if (var2.containsKey(var12)) {
                  var11[var12] = (Integer)var2.get(var12);
               }
            }

            return var11;
         }
      }
   }

   private static fj_3[] id_class(String[] var0, fJ_2 var1, boolean var2, boolean var3) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var0.length; var5++) {
            String var6 = var0[var5];
            rqO_2 var7 = new rqO_2(var6);
            String var8 = var7.id_byte();
            String var9 = var7.id_break();
            if (!var9.contains("/")) {
               var9 = "textures/block/" + var9;
            }

            String var10 = var9 + ".png";
            if (var2 && var10.endsWith("<skip>.png")) {
               var4.add(null);
            } else if (var3 && var10.endsWith("<default>.png")) {
               var4.add(rrbO_2.id_finally);
            } else {
               rqO_2 var11 = new rqO_2(var8, var10);
               boolean var12 = rrbb_3.id_byte(var11);
               if (!var12) {
                  rrbb_3.id_protected("File not found: " + var10);
               }

               String var13 = "textures/";
               String var14 = var9;
               if (var9.startsWith(var13)) {
                  var14 = var9.substring(var13.length());
               }

               rqO_2 var15 = new rqO_2(var8, var14);
               fj_3 var16 = var1.id_throws(var15);
               var4.add(var16);
            }
         }

         return var4.toArray(new fj_3[var4.size()]);
      }
   }

   public void id_class(fJ_2 var1) {
      if (this.id_throws != null) {
         this.id_public = id_class(this.id_throws, var1, false, false);
      }

      if (this.id_try != null) {
         this.id_instanceof = id_class(this.id_try, var1, false, false);
      }

      if (this.id_catch != null) {
         this.id_goto = id_class(this.id_catch, var1, true, !id_break(this.id_case));
      }
   }

   public boolean id_class(rYG var1) {
      return rrMl_1.id_class(var1, this.id_finally);
   }

   public static rCZ id_class(String var0, Collection var1) {
      for (rCZ var3 : var1) {
         if (var0.equals(var3.id_throws())) {
            return var3;
         }
      }

      return null;
   }

   public boolean id_class(String var1) {
      if (this.id_class == null || this.id_class.length() <= 0) {
         rrbb_3.id_protected("No name found: " + var1);
         return false;
      } else if (this.id_break == null) {
         rrbb_3.id_protected("No base path found: " + var1);
         return false;
      } else {
         if (this.id_byte == null) {
            this.id_byte = this.id_break();
         }

         if (this.id_throws == null && this.id_byte == null) {
            this.id_throws = this.id_protected();
         }

         if (this.id_byte == null && this.id_throws == null) {
            rrbb_3.id_protected("No matchBlocks or matchTiles specified: " + var1);
            return false;
         } else if (this.id_protected != null) {
            rrbb_3.id_protected("Metadata is not supported: " + rrbb_3.id_class(this.id_protected));
            return false;
         } else if (this.id_case == 0) {
            rrbb_3.id_protected("No method: " + var1);
            return false;
         } else if (this.id_catch != null && this.id_catch.length > 0) {
            if (this.id_private == 0) {
               this.id_private = this.id_class();
            }

            if (this.id_private == 128) {
               rrbb_3.id_protected("Invalid connect in: " + var1);
               return false;
            } else if (this.id_native > 0) {
               rrbb_3.id_protected("Render pass not supported: " + this.id_native);
               return false;
            } else if ((this.id_implements & 128) != 0) {
               rrbb_3.id_protected("Invalid faces in: " + var1);
               return false;
            } else if ((this.id_super & 128) != 0) {
               rrbb_3.id_protected("Invalid symmetry in: " + var1);
               return false;
            } else {
               switch (this.id_case) {
                  case 1:
                     return this.id_native(var1);
                  case 2:
                     return this.id_super(var1);
                  case 3:
                     return this.id_while(var1);
                  case 4:
                     return this.id_return(var1);
                  case 5:
                     return this.id_public(var1);
                  case 6:
                     return this.id_this(var1);
                  case 7:
                     return this.id_goto(var1);
                  case 8:
                     return this.id_else(var1);
                  case 9:
                     return this.id_synchronized(var1);
                  case 10:
                     return this.id_volatile(var1);
                  case 11:
                     return this.id_final(var1);
                  case 12:
                     return this.id_package(var1);
                  case 13:
                     return this.id_int(var1);
                  case 14:
                     return this.id_new(var1);
                  case 15:
                     return this.id_continue(var1);
                  default:
                     rrbb_3.id_protected("Unknown method: " + var1);
                     return false;
               }
            }
         } else {
            rrbb_3.id_protected("No tiles specified: " + var1);
            return false;
         }
      }
   }

   private static int id_class(int[] var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         for (int var2 = 0; var2 < var0.length; var2++) {
            int var3 = var0[var2];
            if (var3 > var1) {
               var1 = var3;
            }
         }

         return var1;
      }
   }

   public void id_break(fJ_2 var1) {
      this.id_class(this.id_public, var1);
      this.id_class(this.id_instanceof, var1);
      this.id_class(this.id_goto, var1);
   }

   private static boolean id_break(int var0) {
      switch (var0) {
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            return true;
         default:
            return false;
      }
   }

   private String[] id_break(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String[] var2 = rrbb_3.id_class(var1, " ");

         for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4.endsWith(".png")) {
               var4 = var4.substring(0, var4.length() - 4);
            }

            var4 = rrzJ_2.id_class(var4, this.id_break);
            var2[var3] = var4;
         }

         return var2;
      }
   }

   private rrMn_1[] id_break() {
      int[] var1 = this.id_byte();
      if (var1 == null) {
         return null;
      } else {
         rrMn_1[] var2 = new rrMn_1[var1.length];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = new rrMn_1(var1[var3]);
         }

         return var2;
      }
   }

   private String[] id_throws(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = rrbb_3.id_class(var1, " ,");

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (var5.contains("-")) {
               String[] var6 = rrbb_3.id_class(var5, "-");
               if (var6.length == 2) {
                  int var7 = rrbb_3.id_class(var6[0], -1);
                  int var8 = rrbb_3.id_class(var6[1], -1);
                  if (var7 >= 0 && var8 >= 0) {
                     if (var7 > var8) {
                        rrbb_3.id_protected("Invalid interval: " + var5 + ", when parsing: " + var1);
                        continue;
                     }

                     for (int var9 = var7; var9 <= var8; var9++) {
                        var2.add(String.valueOf(var9));
                     }
                     continue;
                  }
               }
            }

            var2.add(var5);
         }

         String[] var10 = var2.toArray(new String[var2.size()]);

         for (int var11 = 0; var11 < var10.length; var11++) {
            String var12 = var10[var11];
            var12 = rrzJ_2.id_class(var12, this.id_break);
            if (!var12.startsWith(this.id_break) && !var12.startsWith("textures/") && !var12.startsWith("optifine/")) {
               var12 = this.id_break + "/" + var12;
            }

            if (var12.endsWith(".png")) {
               var12 = var12.substring(0, var12.length() - 4);
            }

            if (var12.startsWith("/")) {
               var12 = var12.substring(1);
            }

            var10[var11] = var12;
         }

         return var10;
      }
   }

   private static int id_finally(String var0) {
      if (var0 == null) {
         return 1;
      } else {
         var0 = var0.trim();
         if (var0.equals("ctm") || var0.equals("glass")) {
            return 1;
         } else if (var0.equals("ctm_compact")) {
            return 10;
         } else if (var0.equals("horizontal") || var0.equals("bookshelf")) {
            return 2;
         } else if (var0.equals("vertical")) {
            return 6;
         } else if (var0.equals("top")) {
            return 3;
         } else if (var0.equals("random")) {
            return 4;
         } else if (var0.equals("repeat")) {
            return 5;
         } else if (var0.equals("fixed")) {
            return 7;
         } else if (var0.equals("horizontal+vertical") || var0.equals("h+v")) {
            return 8;
         } else if (var0.equals("vertical+horizontal") || var0.equals("v+h")) {
            return 9;
         } else if (var0.equals("overlay")) {
            return 11;
         } else if (var0.equals("overlay_fixed")) {
            return 12;
         } else if (var0.equals("overlay_random")) {
            return 13;
         } else if (var0.equals("overlay_repeat")) {
            return 14;
         } else if (var0.equals("overlay_ctm")) {
            return 15;
         } else {
            rrbb_3.id_protected("Unknown method: " + var0);
            return 0;
         }
      }
   }

   private static int id_catch(String var0) {
      if (var0 == null) {
         return 63;
      } else {
         String[] var1 = rrbb_3.id_class(var0, " ,");
         int var2 = 0;

         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3];
            int var5 = id_private(var4);
            var2 |= var5;
         }

         return var2;
      }
   }

   private static fj_3 id_extends(String var0) {
      fJ_2 var1 = rrbb_3.rF();
      fj_3 var2 = var1.id_class(var0);
      return var2 != null ? var2 : var1.id_class("block/" + var0);
   }

   private boolean id_goto(String var1) {
      if (this.id_catch == null) {
         rrbb_3.id_protected("Tiles not defined: " + var1);
         return false;
      } else if (this.id_catch.length != 1) {
         rrbb_3.id_protected("Number of tiles should be 1 for method: fixed.");
         return false;
      } else {
         return true;
      }
   }

   private static int id_case(String var0) {
      if (var0 == null) {
         return 1;
      } else {
         var0 = var0.trim();
         if (var0.equals("opposite")) {
            return 2;
         } else if (var0.equals("all")) {
            return 6;
         } else {
            rrbb_3.id_protected("Unknown symmetry: " + var0);
            return 1;
         }
      }
   }

   private boolean id_continue(String var1) {
      if (!this.id_native(var1)) {
         return false;
      } else if (this.id_char != null && this.id_char != rrxA_2.id_class) {
         return true;
      } else {
         rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
         return false;
      }
   }

   private boolean id_else(String var1) {
      if (this.id_catch == null) {
         rrbb_3.id_protected("No tiles defined for horizontal+vertical: " + var1);
         return false;
      } else if (this.id_catch.length != 7) {
         rrbb_3.id_protected("Invalid tiles, must be exactly 7: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private static int id_implements(String var0) {
      if (var0 == null) {
         return 0;
      } else {
         var0 = var0.trim();
         if (var0.equals("block")) {
            return 1;
         } else if (var0.equals("tile")) {
            return 2;
         } else if (var0.equals("material")) {
            return 3;
         } else if (var0.equals("state")) {
            return 4;
         } else {
            rrbb_3.id_protected("Unknown connect: " + var0);
            return 128;
         }
      }
   }

   private boolean id_new(String var1) {
      if (!this.id_public(var1)) {
         return false;
      } else if (this.id_char != null && this.id_char != rrxA_2.id_class) {
         return true;
      } else {
         rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
         return false;
      }
   }

   private boolean id_package(String var1) {
      if (!this.id_goto(var1)) {
         return false;
      } else if (this.id_char != null && this.id_char != rrxA_2.id_class) {
         return true;
      } else {
         rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
         return false;
      }
   }

   private boolean id_return(String var1) {
      if (this.id_catch != null && this.id_catch.length > 0) {
         if (this.id_new != null) {
            if (this.id_new.length > this.id_catch.length) {
               rrbb_3.id_protected("More weights defined than tiles, trimming weights: " + var1);
               int[] var2 = new int[this.id_catch.length];
               System.arraycopy(this.id_new, 0, var2, 0, var2.length);
               this.id_new = var2;
            }

            if (this.id_new.length < this.id_catch.length) {
               rrbb_3.id_protected("Less weights defined than tiles, expanding weights: " + var1);
               int[] var5 = new int[this.id_catch.length];
               System.arraycopy(this.id_new, 0, var5, 0, this.id_new.length);
               int var3 = rrWD.id_class(this.id_new);

               for (int var4 = this.id_new.length; var4 < var5.length; var4++) {
                  var5[var4] = var3;
               }

               this.id_new = var5;
            }

            this.id_synchronized = new int[this.id_new.length];
            int var6 = 0;

            for (int var7 = 0; var7 < this.id_new.length; var7++) {
               var6 += this.id_new[var7];
               this.id_synchronized[var7] = var6;
            }

            this.id_return = var6;
            if (this.id_return <= 0) {
               rrbb_3.id_protected("Invalid sum of all weights: " + var6);
               this.id_return = 1;
            }
         }

         if (this.id_continue >= 0 && this.id_continue <= 9) {
            return true;
         } else {
            rrbb_3.id_protected("Invalid randomLoops: " + this.id_continue);
            return false;
         }
      } else {
         rrbb_3.id_protected("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean id_super(String var1) {
      if (this.id_catch == null) {
         this.id_catch = this.id_throws("12-15");
      }

      if (this.id_catch.length != 4) {
         rrbb_3.id_protected("Invalid tiles, must be exactly 4: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean id_while(String var1) {
      if (this.id_catch == null) {
         this.id_catch = this.id_throws("66");
      }

      if (this.id_catch.length != 1) {
         rrbb_3.id_protected("Invalid tiles, must be exactly 1: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean id_public(String var1) {
      if (this.id_catch == null) {
         rrbb_3.id_protected("Tiles not defined: " + var1);
         return false;
      } else if (this.id_package <= 0) {
         rrbb_3.id_protected("Invalid width: " + var1);
         return false;
      } else if (this.id_int <= 0) {
         rrbb_3.id_protected("Invalid height: " + var1);
         return false;
      } else if (this.id_catch.length != this.id_package * this.id_int) {
         rrbb_3.id_protected("Number of tiles does not equal width x height: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private String[] id_protected() {
      fj_3 var1 = id_extends(this.id_class);
      return var1 == null ? null : new String[]{this.id_class};
   }

   private static String id_protected(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   private static int id_private(String var0) {
      var0 = var0.toLowerCase();
      if (var0.equals("bottom") || var0.equals("down")) {
         return 1;
      } else if (var0.equals("top") || var0.equals("up")) {
         return 2;
      } else if (var0.equals("north")) {
         return 4;
      } else if (var0.equals("south")) {
         return 8;
      } else if (var0.equals("east")) {
         return 32;
      } else if (var0.equals("west")) {
         return 16;
      } else if (var0.equals("sides")) {
         return 60;
      } else if (var0.equals("all")) {
         return 63;
      } else {
         rrbb_3.id_protected("Unknown face: " + var0);
         return 128;
      }
   }

   private boolean id_final(String var1) {
      if (this.id_catch == null) {
         this.id_catch = this.id_throws("0-16");
      }

      if (this.id_catch.length < 17) {
         rrbb_3.id_protected("Invalid tiles, must be at least 17: " + var1);
         return false;
      } else if (this.id_char != null && this.id_char != rrxA_2.id_class) {
         return true;
      } else {
         rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
         return false;
      }
   }

   private boolean id_volatile(String var1) {
      if (this.id_catch == null) {
         this.id_catch = this.id_throws("0-4");
      }

      if (this.id_catch.length < 5) {
         rrbb_3.id_protected("Invalid tiles, must be at least 5: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean id_synchronized(String var1) {
      if (this.id_catch == null) {
         rrbb_3.id_protected("No tiles defined for vertical+horizontal: " + var1);
         return false;
      } else if (this.id_catch.length != 7) {
         rrbb_3.id_protected("Invalid tiles, must be exactly 7: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean id_native(String var1) {
      if (this.id_catch == null) {
         this.id_catch = this.id_throws("0-11 16-27 32-43 48-58");
      }

      if (this.id_catch.length < 47) {
         rrbb_3.id_protected("Invalid tiles, must be at least 47: " + var1);
         return false;
      } else {
         return true;
      }
   }
}
