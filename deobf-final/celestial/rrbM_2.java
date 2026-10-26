package celestial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

public class rrbM_2 {
   public String class_ = null;
   public String break_ = null;
   public rrMn_1[] byte_ = null;
   public int[] protected_ = null;
   public String[] throws_ = null;
   public int case_ = 0;
   public String[] catch_ = null;
   public int private_ = 0;
   public int implements_ = 63;
   public rrMk_1[] finally_ = null;
   public rrMq_1 extends_ = null;
   public int native_ = 0;
   public boolean volatile_ = false;
   public int[] final_ = null;
   public int package_ = 0;
   public int int_ = 0;
   public int[] new_ = null;
   public int continue_ = 0;
   public int super_ = 1;
   public boolean this_ = false;
   public rrMH else_ = null;
   public int[] synchronized_ = null;
   public int return_ = 1;
   public fj_3[] public_ = null;
   public fj_3[] goto_ = null;
   public rrMn_1[] while_ = null;
   public String[] try_ = null;
   public fj_3[] instanceof_ = null;
   public int throw_ = -1;
   public xc_3 interface_ = xu_3.class_.continue_();
   public HU char_ = null;
   public static final int abstract_ = 0;
   public static final int long_ = 1;
   public static final int float_ = 2;
   public static final int void_ = 3;
   public static final int static_ = 4;
   public static final int import_ = 5;
   public static final int short_ = 6;
   public static final int default_ = 7;
   public static final int const_ = 8;
   public static final int strictfp_ = 9;
   public static final int boolean_ = 10;
   public static final int transient_ = 11;
   public static final int for_ = 12;
   public static final int double_ = 13;
   public static final int switch_ = 14;
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

   private static String byte_(String var0) {
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

   private int[] byte_() {
      String var1 = "block_";
      if (!this.class_.startsWith(var1)) {
         return null;
      } else {
         String var2 = this.class_.substring(var1.length());
         rqO_2 var3 = new rqO_2(var2);
         xd_3 var4 = rrWP.class_(var3);
         if (var4 == null) {
            return null;
         } else {
            int var5 = rrWP.class_(var4);
            return new int[]{var5};
         }
      }
   }

   private boolean int_(String var1) {
      if (!this.return_(var1)) {
         return false;
      } else if (this.char_ != null && this.char_ != rrxA_2.class_) {
         return true;
      } else {
         rrbb_3.protected_("Invalid overlay layer: " + this.char_);
         return false;
      }
   }

   public rrbM_2(Properties var1, String var2) {
      rrMz_1 var3 = new rrMz_1("ConnectedTextures");
      this.class_ = var3.class_(var2);
      this.break_ = var3.break_(var2);
      this.byte_ = var3.byte_(var1.getProperty("matchBlocks"));
      this.protected_ = var3.private_(var1.getProperty("metadata"));
      this.throws_ = this.break_(var1.getProperty("matchTiles"));
      this.case_ = finally_(var1.getProperty("method"));
      this.catch_ = this.throws_(var1.getProperty("tiles"));
      this.private_ = implements_(var1.getProperty("connect"));
      this.implements_ = catch_(var1.getProperty("faces"));
      this.finally_ = var3.case_(var1.getProperty("biomes"));
      this.extends_ = var3.native_(var1.getProperty("heights"));
      if (this.extends_ == null) {
         int var4 = var3.class_(var1.getProperty("minHeight"), -1);
         int var5 = var3.class_(var1.getProperty("maxHeight"), 1024);
         if (var4 != -1 || var5 != 1024) {
            this.extends_ = new rrMq_1(new rrMp_1(var4, var5));
         }
      }

      this.native_ = var3.class_(var1.getProperty("renderPass"), -1);
      this.volatile_ = var3.class_(var1.getProperty("innerSeams"), false);
      this.final_ = this.class_(var1);
      this.package_ = var3.class_(var1.getProperty("width"), -1);
      this.int_ = var3.class_(var1.getProperty("height"), -1);
      this.new_ = var3.private_(var1.getProperty("weights"));
      this.continue_ = var3.class_(var1.getProperty("randomLoops"), 0);
      this.super_ = case_(var1.getProperty("symmetry"));
      this.this_ = var3.class_(var1.getProperty("linked"), false);
      this.else_ = var3.break_("name", var1.getProperty("name"));
      this.while_ = var3.byte_(var1.getProperty("connectBlocks"));
      this.try_ = this.break_(var1.getProperty("connectTiles"));
      this.throw_ = var3.class_(var1.getProperty("tintIndex"), -1);
      this.interface_ = var3.class_(var1.getProperty("tintBlock"), xu_3.class_.continue_());
      this.char_ = var3.class_(var1.getProperty("layer"), rrxA_2.break_);
   }

   @Override
   public String toString() {
      return "CTM name: "
         + this.class_
         + ", basePath: "
         + this.break_
         + ", matchBlocks: "
         + rrbb_3.class_(this.byte_)
         + ", matchTiles: "
         + rrbb_3.class_(this.throws_);
   }

   private boolean this_(String var1) {
      if (this.catch_ == null) {
         rrbb_3.protected_("No tiles defined for vertical: " + var1);
         return false;
      } else if (this.catch_.length != 4) {
         rrbb_3.protected_("Invalid tiles, must be exactly 4: " + var1);
         return false;
      } else {
         return true;
      }
   }

   public boolean class_(int var1) {
      return rrMl_1.class_(var1, this.byte_);
   }

   public boolean class_(int var1, int var2) {
      return rrMl_1.class_(var1, var2, this.byte_);
   }

   public boolean class_(fj_3 var1) {
      return rrMl_1.class_(var1, this.public_);
   }

   private int class_() {
      if (this.byte_ != null) {
         return 1;
      } else {
         return this.throws_ != null ? 2 : 128;
      }
   }

   private void class_(fj_3[] var1, fJ_2 var2) {
      if (var1 != null) {
         for (int var3 = 0; var3 < var1.length; var3++) {
            fj_3 var4 = var1[var3];
            if (var4 != null) {
               rqO_2 var5 = var4.finally_();
               fj_3 var6 = var2.break_(var5);
               if (var6 == null || var6 instanceof fQ_2) {
                  rrbb_3.protected_("Missing CTM sprite: " + var5 + ", properties: " + this.break_);
               }

               var1[var3] = var6;
            }
         }
      }
   }

   private int[] class_(Properties var1) {
      if (this.catch_ == null) {
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
                     int var9 = rrbb_3.class_(var7, -1);
                     if (var9 >= 0 && var9 <= 46) {
                        int var10 = rrbb_3.class_(var8, -1);
                        if (var10 >= 0 && var10 < this.catch_.length) {
                           var2.put(var9, var10);
                        } else {
                           rrbb_3.protected_("Invalid CTM tile index: " + var8);
                        }
                     } else {
                        rrbb_3.protected_("Invalid CTM index: " + var7);
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

   private static fj_3[] class_(String[] var0, fJ_2 var1, boolean var2, boolean var3) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var0.length; var5++) {
            String var6 = var0[var5];
            rqO_2 var7 = new rqO_2(var6);
            String var8 = var7.byte_();
            String var9 = var7.break_();
            if (!var9.contains("/")) {
               var9 = "textures/block/" + var9;
            }

            String var10 = var9 + ".png";
            if (var2 && var10.endsWith("<skip>.png")) {
               var4.add(null);
            } else if (var3 && var10.endsWith("<default>.png")) {
               var4.add(rrbO_2.finally_);
            } else {
               rqO_2 var11 = new rqO_2(var8, var10);
               boolean var12 = rrbb_3.byte_(var11);
               if (!var12) {
                  rrbb_3.protected_("File not found: " + var10);
               }

               String var13 = "textures/";
               String var14 = var9;
               if (var9.startsWith(var13)) {
                  var14 = var9.substring(var13.length());
               }

               rqO_2 var15 = new rqO_2(var8, var14);
               fj_3 var16 = var1.throws_(var15);
               var4.add(var16);
            }
         }

         return var4.toArray(new fj_3[var4.size()]);
      }
   }

   public void class_(fJ_2 var1) {
      if (this.throws_ != null) {
         this.public_ = class_(this.throws_, var1, false, false);
      }

      if (this.try_ != null) {
         this.instanceof_ = class_(this.try_, var1, false, false);
      }

      if (this.catch_ != null) {
         this.goto_ = class_(this.catch_, var1, true, !break_(this.case_));
      }
   }

   public boolean class_(rYG var1) {
      return rrMl_1.class_(var1, this.finally_);
   }

   public static rCZ class_(String var0, Collection var1) {
      for (rCZ var3 : var1) {
         if (var0.equals(var3.throws_())) {
            return var3;
         }
      }

      return null;
   }

   public boolean class_(String var1) {
      if (this.class_ == null || this.class_.length() <= 0) {
         rrbb_3.protected_("No name found: " + var1);
         return false;
      } else if (this.break_ == null) {
         rrbb_3.protected_("No base path found: " + var1);
         return false;
      } else {
         if (this.byte_ == null) {
            this.byte_ = this.break_();
         }

         if (this.throws_ == null && this.byte_ == null) {
            this.throws_ = this.protected_();
         }

         if (this.byte_ == null && this.throws_ == null) {
            rrbb_3.protected_("No matchBlocks or matchTiles specified: " + var1);
            return false;
         } else if (this.protected_ != null) {
            rrbb_3.protected_("Metadata is not supported: " + rrbb_3.class_(this.protected_));
            return false;
         } else if (this.case_ == 0) {
            rrbb_3.protected_("No method: " + var1);
            return false;
         } else if (this.catch_ != null && this.catch_.length > 0) {
            if (this.private_ == 0) {
               this.private_ = this.class_();
            }

            if (this.private_ == 128) {
               rrbb_3.protected_("Invalid connect in: " + var1);
               return false;
            } else if (this.native_ > 0) {
               rrbb_3.protected_("Render pass not supported: " + this.native_);
               return false;
            } else if ((this.implements_ & 128) != 0) {
               rrbb_3.protected_("Invalid faces in: " + var1);
               return false;
            } else if ((this.super_ & 128) != 0) {
               rrbb_3.protected_("Invalid symmetry in: " + var1);
               return false;
            } else {
               switch (this.case_) {
                  case 1:
                     return this.native_(var1);
                  case 2:
                     return this.super_(var1);
                  case 3:
                     return this.while_(var1);
                  case 4:
                     return this.return_(var1);
                  case 5:
                     return this.public_(var1);
                  case 6:
                     return this.this_(var1);
                  case 7:
                     return this.goto_(var1);
                  case 8:
                     return this.else_(var1);
                  case 9:
                     return this.synchronized_(var1);
                  case 10:
                     return this.volatile_(var1);
                  case 11:
                     return this.final_(var1);
                  case 12:
                     return this.package_(var1);
                  case 13:
                     return this.int_(var1);
                  case 14:
                     return this.new_(var1);
                  case 15:
                     return this.continue_(var1);
                  default:
                     rrbb_3.protected_("Unknown method: " + var1);
                     return false;
               }
            }
         } else {
            rrbb_3.protected_("No tiles specified: " + var1);
            return false;
         }
      }
   }

   private static int class_(int[] var0, int var1) {
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

   public void break_(fJ_2 var1) {
      this.class_(this.public_, var1);
      this.class_(this.instanceof_, var1);
      this.class_(this.goto_, var1);
   }

   private static boolean break_(int var0) {
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

   private String[] break_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String[] var2 = rrbb_3.class_(var1, " ");

         for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4.endsWith(".png")) {
               var4 = var4.substring(0, var4.length() - 4);
            }

            var4 = rrzJ_2.class_(var4, this.break_);
            var2[var3] = var4;
         }

         return var2;
      }
   }

   private rrMn_1[] break_() {
      int[] var1 = this.byte_();
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

   private String[] throws_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = rrbb_3.class_(var1, " ,");

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (var5.contains("-")) {
               String[] var6 = rrbb_3.class_(var5, "-");
               if (var6.length == 2) {
                  int var7 = rrbb_3.class_(var6[0], -1);
                  int var8 = rrbb_3.class_(var6[1], -1);
                  if (var7 >= 0 && var8 >= 0) {
                     if (var7 > var8) {
                        rrbb_3.protected_("Invalid interval: " + var5 + ", when parsing: " + var1);
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
            var12 = rrzJ_2.class_(var12, this.break_);
            if (!var12.startsWith(this.break_) && !var12.startsWith("textures/") && !var12.startsWith("optifine/")) {
               var12 = this.break_ + "/" + var12;
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

   private static int finally_(String var0) {
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
            rrbb_3.protected_("Unknown method: " + var0);
            return 0;
         }
      }
   }

   private static int catch_(String var0) {
      if (var0 == null) {
         return 63;
      } else {
         String[] var1 = rrbb_3.class_(var0, " ,");
         int var2 = 0;

         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3];
            int var5 = private_(var4);
            var2 |= var5;
         }

         return var2;
      }
   }

   private static fj_3 extends_(String var0) {
      fJ_2 var1 = rrbb_3.rF();
      fj_3 var2 = var1.class_(var0);
      return var2 != null ? var2 : var1.class_("block/" + var0);
   }

   private boolean goto_(String var1) {
      if (this.catch_ == null) {
         rrbb_3.protected_("Tiles not defined: " + var1);
         return false;
      } else if (this.catch_.length != 1) {
         rrbb_3.protected_("Number of tiles should be 1 for method: fixed.");
         return false;
      } else {
         return true;
      }
   }

   private static int case_(String var0) {
      if (var0 == null) {
         return 1;
      } else {
         var0 = var0.trim();
         if (var0.equals("opposite")) {
            return 2;
         } else if (var0.equals("all")) {
            return 6;
         } else {
            rrbb_3.protected_("Unknown symmetry: " + var0);
            return 1;
         }
      }
   }

   private boolean continue_(String var1) {
      if (!this.native_(var1)) {
         return false;
      } else if (this.char_ != null && this.char_ != rrxA_2.class_) {
         return true;
      } else {
         rrbb_3.protected_("Invalid overlay layer: " + this.char_);
         return false;
      }
   }

   private boolean else_(String var1) {
      if (this.catch_ == null) {
         rrbb_3.protected_("No tiles defined for horizontal+vertical: " + var1);
         return false;
      } else if (this.catch_.length != 7) {
         rrbb_3.protected_("Invalid tiles, must be exactly 7: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private static int implements_(String var0) {
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
            rrbb_3.protected_("Unknown connect: " + var0);
            return 128;
         }
      }
   }

   private boolean new_(String var1) {
      if (!this.public_(var1)) {
         return false;
      } else if (this.char_ != null && this.char_ != rrxA_2.class_) {
         return true;
      } else {
         rrbb_3.protected_("Invalid overlay layer: " + this.char_);
         return false;
      }
   }

   private boolean package_(String var1) {
      if (!this.goto_(var1)) {
         return false;
      } else if (this.char_ != null && this.char_ != rrxA_2.class_) {
         return true;
      } else {
         rrbb_3.protected_("Invalid overlay layer: " + this.char_);
         return false;
      }
   }

   private boolean return_(String var1) {
      if (this.catch_ != null && this.catch_.length > 0) {
         if (this.new_ != null) {
            if (this.new_.length > this.catch_.length) {
               rrbb_3.protected_("More weights defined than tiles, trimming weights: " + var1);
               int[] var2 = new int[this.catch_.length];
               System.arraycopy(this.new_, 0, var2, 0, var2.length);
               this.new_ = var2;
            }

            if (this.new_.length < this.catch_.length) {
               rrbb_3.protected_("Less weights defined than tiles, expanding weights: " + var1);
               int[] var5 = new int[this.catch_.length];
               System.arraycopy(this.new_, 0, var5, 0, this.new_.length);
               int var3 = rrWD.class_(this.new_);

               for (int var4 = this.new_.length; var4 < var5.length; var4++) {
                  var5[var4] = var3;
               }

               this.new_ = var5;
            }

            this.synchronized_ = new int[this.new_.length];
            int var6 = 0;

            for (int var7 = 0; var7 < this.new_.length; var7++) {
               var6 += this.new_[var7];
               this.synchronized_[var7] = var6;
            }

            this.return_ = var6;
            if (this.return_ <= 0) {
               rrbb_3.protected_("Invalid sum of all weights: " + var6);
               this.return_ = 1;
            }
         }

         if (this.continue_ >= 0 && this.continue_ <= 9) {
            return true;
         } else {
            rrbb_3.protected_("Invalid randomLoops: " + this.continue_);
            return false;
         }
      } else {
         rrbb_3.protected_("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean super_(String var1) {
      if (this.catch_ == null) {
         this.catch_ = this.throws_("12-15");
      }

      if (this.catch_.length != 4) {
         rrbb_3.protected_("Invalid tiles, must be exactly 4: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean while_(String var1) {
      if (this.catch_ == null) {
         this.catch_ = this.throws_("66");
      }

      if (this.catch_.length != 1) {
         rrbb_3.protected_("Invalid tiles, must be exactly 1: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean public_(String var1) {
      if (this.catch_ == null) {
         rrbb_3.protected_("Tiles not defined: " + var1);
         return false;
      } else if (this.package_ <= 0) {
         rrbb_3.protected_("Invalid width: " + var1);
         return false;
      } else if (this.int_ <= 0) {
         rrbb_3.protected_("Invalid height: " + var1);
         return false;
      } else if (this.catch_.length != this.package_ * this.int_) {
         rrbb_3.protected_("Number of tiles does not equal width x height: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private String[] protected_() {
      fj_3 var1 = extends_(this.class_);
      return var1 == null ? null : new String[]{this.class_};
   }

   private static String protected_(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   private static int private_(String var0) {
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
         rrbb_3.protected_("Unknown face: " + var0);
         return 128;
      }
   }

   private boolean final_(String var1) {
      if (this.catch_ == null) {
         this.catch_ = this.throws_("0-16");
      }

      if (this.catch_.length < 17) {
         rrbb_3.protected_("Invalid tiles, must be at least 17: " + var1);
         return false;
      } else if (this.char_ != null && this.char_ != rrxA_2.class_) {
         return true;
      } else {
         rrbb_3.protected_("Invalid overlay layer: " + this.char_);
         return false;
      }
   }

   private boolean volatile_(String var1) {
      if (this.catch_ == null) {
         this.catch_ = this.throws_("0-4");
      }

      if (this.catch_.length < 5) {
         rrbb_3.protected_("Invalid tiles, must be at least 5: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean synchronized_(String var1) {
      if (this.catch_ == null) {
         rrbb_3.protected_("No tiles defined for vertical+horizontal: " + var1);
         return false;
      } else if (this.catch_.length != 7) {
         rrbb_3.protected_("Invalid tiles, must be exactly 7: " + var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean native_(String var1) {
      if (this.catch_ == null) {
         this.catch_ = this.throws_("0-11 16-27 32-43 48-58");
      }

      if (this.catch_.length < 47) {
         rrbb_3.protected_("Invalid tiles, must be at least 47: " + var1);
         return false;
      } else {
         return true;
      }
   }
}
