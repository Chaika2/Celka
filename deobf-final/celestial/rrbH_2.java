package celestial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import org.lwjgl.opengl.GL11;

public class rrbH_2 {
   public String class_ = null;
   public String break_ = null;
   public int byte_ = 1;
   public int[] protected_ = null;
   public String throws_ = null;
   public Map<String, String> case_ = null;
   public String catch_ = null;
   public Map<String, String> private_ = null;
   public rrMq_1 implements_ = null;
   public boolean finally_ = false;
   public int extends_ = 0;
   public rrMq_1 native_ = null;
   public int[] volatile_ = null;
   public rrMq_1 final_ = null;
   public rrMH[] package_ = null;
   public int int_ = 0;
   public int new_ = 1;
   public float continue_ = 0.0F;
   public float super_ = 0.0F;
   public int this_ = 0;
   public float else_ = 1.0F;
   public int synchronized_ = 0;
   public rqO_2 return_ = null;
   public Map public_ = null;
   public fj_3 goto_ = null;
   public Map while_ = null;
   public IJ try_ = null;
   public Map<String, IJ> instanceof_ = null;
   public IJ throw_ = null;
   public Map<String, IJ> interface_ = null;
   private int const_ = 0;
   private int strictfp_ = 0;
   public static final int char_ = 0;
   public static final int abstract_ = 1;
   public static final int long_ = 2;
   public static final int float_ = 3;
   public static final int void_ = 4;
   public static final int static_ = 0;
   public static final int import_ = 1;
   public static final int short_ = 2;
   public static final String default_ = "inventory";

   private static String byte_(String var0, String var1) {
      var0 = rrzJ_2.class_(var0, var1);
      boolean var2 = var0.startsWith("block/") || var0.startsWith("item/");
      if (!var0.startsWith(var1) && !var2 && !var0.startsWith("optifine/")) {
         var0 = var1 + "/" + var0;
      }

      String var3 = ".json";
      if (var0.endsWith(var3)) {
         var0 = var0.substring(0, var0.length() - var3.length());
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private boolean byte_() {
      return true;
   }

   private static Map byte_(Properties var0, String var1) {
      LinkedHashMap var2 = new LinkedHashMap();

      for (String var4 : var0.keySet()) {
         String var5 = var0.getProperty(var4);
         if (var4.startsWith(var1)) {
            var2.put(var4, var5);
         }
      }

      return var2;
   }

   private static String byte_(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   public rrbH_2(Properties var1, String var2) {
      this.class_ = break_(var2);
      this.break_ = byte_(var2);
      this.byte_ = this.protected_(var1.getProperty("type"));
      this.protected_ = this.class_(var1.getProperty("items"), var1.getProperty("matchItems"));
      this.private_ = break_(var1, this.break_);
      this.catch_ = class_(var1.getProperty("model"), var2, this.break_, this.byte_, this.private_);
      this.case_ = class_(var1, this.break_);
      boolean var3 = this.private_ == null && this.catch_ == null;
      this.throws_ = class_(var1.getProperty("texture"), var1.getProperty("tile"), var1.getProperty("source"), var2, this.break_, this.byte_, this.case_, var3);
      String var4 = var1.getProperty("damage");
      if (var4 != null) {
         this.finally_ = var4.contains("%");
         var4 = var4.replace("%", "");
         this.implements_ = this.case_(var4);
         this.extends_ = this.class_(var1.getProperty("damageMask"), 0);
      }

      this.native_ = this.case_(var1.getProperty("stackSize"));
      this.volatile_ = this.class_(class_(var1, "enchantmentIDs", "enchantments"), new rrMy_1());
      this.final_ = this.case_(var1.getProperty("enchantmentLevels"));
      this.package_ = this.class_(var1);
      this.int_ = this.private_(var1.getProperty("hand"));
      this.new_ = rrxh_3.class_(var1.getProperty("blend"));
      this.continue_ = this.class_(var1.getProperty("speed"), 0.0F);
      this.super_ = this.class_(var1.getProperty("rotation"), 0.0F);
      this.this_ = this.class_(var1.getProperty("layer"), 0);
      this.synchronized_ = this.class_(var1.getProperty("weight"), 0);
      this.else_ = this.class_(var1.getProperty("duration"), 1.0F);
   }

   @Override
   public String toString() {
      return this.break_ + "/" + this.class_ + ", type: " + this.byte_ + ", items: [" + rrbb_3.class_(this.protected_) + "], textture: " + this.throws_;
   }

   public boolean class_(String var1) {
      if (this.class_ == null || this.class_.length() <= 0) {
         rrbb_3.protected_("No name found: " + var1);
         return false;
      } else if (this.break_ == null) {
         rrbb_3.protected_("No base path found: " + var1);
         return false;
      } else if (this.byte_ == 0) {
         rrbb_3.protected_("No type defined: " + var1);
         return false;
      } else {
         if (this.byte_ == 4 && this.protected_ == null) {
            this.protected_ = new int[]{rdb_3.class_(rdy_3.kc)};
         }

         if (this.byte_ == 1 || this.byte_ == 3 || this.byte_ == 4) {
            if (this.protected_ == null) {
               this.protected_ = this.break_();
            }

            if (this.protected_ == null) {
               rrbb_3.protected_("No items defined: " + var1);
               return false;
            }
         }

         if (this.throws_ == null && this.case_ == null && this.catch_ == null && this.private_ == null) {
            rrbb_3.protected_("No texture or model specified: " + var1);
            return false;
         } else if (this.byte_ == 2 && this.volatile_ == null) {
            rrbb_3.protected_("No enchantmentIDs specified: " + var1);
            return false;
         } else {
            return true;
         }
      }
   }

   public static fj_3 class_(Ig_1 var0) {
      fJ_2 var1 = QY.instanceof_().extends_().class_(var0.class_());
      return var1.break_(var0.break_());
   }

   private static wK_2 class_(IS var0, IG var1, fj_3 var2, rpr_3 var3, If_1 var4) {
      Ih_1 var5 = new Ih_1();
      return var5.class_(var0.class_, var0.break_, var1, var2, var3, var4, var0.protected_, var0.throws_, var2.finally_());
   }

   private static IJ class_(fJ_2 var0, IN var1, String[] var2, boolean var3) {
      String[] var4 = new String[var2.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var2[var5];
         var4[var5] = rrzX_2.protected_(var6, "textures/");
      }

      we_3 var7 = class_(var4);
      we_3 var8 = var1.class_(rrbH_2::class_, var7);
      return class_(var0, var8, var3);
   }

   private rrMH[] class_(Properties var1) {
      String var2 = "nbt.";
      Map var3 = byte_(var1, var2);
      if (var3.size() <= 0) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();

         for (String var6 : var3.keySet()) {
            String var7 = (String)var3.get(var6);
            String var8 = var6.substring(var2.length());
            rrMH var9 = new rrMH(var8, var7);
            var4.add(var9);
         }

         return var4.toArray(new rrMH[var4.size()]);
      }
   }

   private static we_3 class_(String[] var0) {
      StringBuffer var1 = new StringBuffer();
      var1.append("{\"parent\": \"builtin/generated\",\"textures\": {");

      for (int var2 = 0; var2 < var0.length; var2++) {
         String var3 = var0[var2];
         if (var2 > 0) {
            var1.append(", ");
         }

         var1.append("\"layer" + var2 + "\": \"" + var3 + "\"");
      }

      var1.append("}}");
      String var4 = var1.toString();
      return we_3.class_(var4);
   }

   private rqO_2 class_(rqO_2 var1) {
      String var2 = var1.break_();
      var2 = rrzX_2.protected_(var2, "textures/");
      var2 = rrzX_2.throws_(var2, ".png");
      return new rqO_2(var1.byte_(), var2);
   }

   private String class_(Map<String, String> var1, String var2, String var3) {
      if (var1 == null) {
         return var3;
      } else {
         String var4 = (String)var1.get(var2);
         return var4 == null ? var3 : var4;
      }
   }

   public void class_(fJ_2 var1, IN var2) {
      if (this.throws_ != null || this.case_ != null) {
         String[] var3 = this.protected_();
         boolean var4 = this.byte_();
         this.try_ = class_(var1, var2, var3, var4);
         if (this.byte_ == 1 && this.case_ != null) {
            for (String var6 : this.case_.keySet()) {
               String var7 = this.case_.get(var6);
               String var8 = rrzX_2.protected_(var6, "texture.");
               if (this.finally_(var8)) {
                  String[] var9 = new String[]{var7};
                  IJ var10 = class_(var1, var2, var9, var4);
                  if (this.instanceof_ == null) {
                     this.instanceof_ = new HashMap<>();
                  }

                  String var11 = "item/" + var8;
                  this.instanceof_.put(var11, var10);
               }
            }
         }
      }
   }

   public void class_(fJ_2 var1) {
      if (this.throws_ != null) {
         this.return_ = this.implements_(this.throws_);
         if (this.byte_ == 1) {
            rqO_2 var2 = this.class_(this.return_);
            this.goto_ = var1.throws_(var2);
         }
      }

      if (this.case_ != null) {
         this.public_ = new HashMap();
         this.while_ = new HashMap();

         for (String var3 : this.case_.keySet()) {
            String var4 = this.case_.get(var3);
            rqO_2 var5 = this.implements_(var4);
            this.public_.put(var3, var5);
            if (this.byte_ == 1) {
               rqO_2 var6 = this.class_(var5);
               fj_3 var7 = var1.throws_(var6);
               this.while_.put(var3, var7);
            }
         }
      }
   }

   private static IJ class_(fJ_2 var0, we_3 var1, boolean var2) {
      If_1 var3 = If_1.X0_Y0;
      Ig_1 var4 = var1.byte_("particle");
      fj_3 var5 = var4.byte_();
      IY var6 = new IY(var1, IF.class_, false).class_(var5);

      for (IS var8 : var1.class_()) {
         for (rpr_3 var10 : var8.byte_.keySet()) {
            IG var11 = var8.byte_.get(var10);
            if (!var2) {
               var11 = new IG(var11.class_, -1, var11.byte_, var11.protected_);
            }

            Ig_1 var12 = var1.byte_(var11.byte_);
            fj_3 var13 = var12.byte_();
            wK_2 var14 = class_(var8, var11, var13, var10, var3);
            if (var11.class_ == null) {
               var6.class_(var14);
            } else {
               var6.class_(rpr_3.class_(var3.class_().byte_(), var11.class_), var14);
            }
         }
      }

      return var6.class_();
   }

   private int[] class_(String var1, String var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         TreeSet var3 = new TreeSet();
         String[] var4 = rrbb_3.class_(var1, " ");

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            rdb_3 var7 = this.throws_(var6);
            if (var7 == null) {
               rrbb_3.protected_("Item not found: " + var6);
            } else {
               int var8 = rdb_3.class_(var7);
               if (var8 < 0) {
                  rrbb_3.protected_("Item ID not found: " + var6);
               } else {
                  var3.add(new Integer(var8));
               }
            }
         }

         Integer[] var10 = var3.toArray(new Integer[var3.size()]);
         int[] var11 = new int[var10.length];

         for (int var12 = 0; var12 < var11.length; var12++) {
            var11[var12] = var10[var12];
         }

         return var11;
      }
   }

   public void class_(IC var1) {
      if (this.catch_ != null) {
         class_(var1, this.catch_);
      }

      if (this.byte_ == 1 && this.private_ != null) {
         for (String var3 : this.private_.keySet()) {
            String var4 = this.private_.get(var3);
            String var5 = rrzX_2.protected_(var3, "model.");
            if (this.finally_(var5)) {
               class_(var1, var4);
            }
         }
      }
   }

   private static String class_(String var0, String var1, String var2, String var3, String var4, int var5, Map<String, String> var6, boolean var7) {
      if (var0 == null) {
         var0 = var1;
      }

      if (var0 == null) {
         var0 = var2;
      }

      if (var0 != null) {
         String var12 = ".png";
         if (var0.endsWith(var12)) {
            var0 = var0.substring(0, var0.length() - var12.length());
         }

         return break_(var0, var4);
      } else if (var5 == 3) {
         return null;
      } else {
         if (var6 != null) {
            String var8 = (String)var6.get("texture.bow_standby");
            if (var8 != null) {
               return var8;
            }
         }

         if (!var7) {
            return null;
         } else {
            String var11 = var3;
            int var9 = var3.lastIndexOf(47);
            if (var9 >= 0) {
               var11 = var3.substring(var9 + 1);
            }

            int var10 = var11.lastIndexOf(46);
            if (var10 >= 0) {
               var11 = var11.substring(0, var10);
            }

            return break_(var11, var4);
         }
      }
   }

   private static Map class_(Properties var0, String var1) {
      String var2 = "texture.";
      Map var3 = byte_(var0, var2);
      if (var3.size() <= 0) {
         return null;
      } else {
         Set var4 = var3.keySet();
         LinkedHashMap var5 = new LinkedHashMap();

         for (String var7 : var4) {
            String var8 = (String)var3.get(var7);
            var8 = break_(var8, var1);
            var5.put(var7, var8);
         }

         return var5;
      }
   }

   public void class_() {
      Ip_1 var1 = rrbb_3.float_();
      IJ var2 = var1.break_();
      if (this.catch_ != null) {
         rqO_2 var3 = extends_(this.catch_);
         II var4 = new II(var3, "inventory");
         this.throw_ = var1.class_(var4);
         if (this.throw_ == var2) {
            rrbb_3.protected_("Custom Items: Model not found " + var4.break_());
            this.throw_ = null;
         }
      }

      if (this.byte_ == 1 && this.private_ != null) {
         for (String var12 : this.private_.keySet()) {
            String var5 = this.private_.get(var12);
            String var6 = rrzX_2.protected_(var12, "model.");
            if (this.finally_(var6)) {
               rqO_2 var7 = extends_(var5);
               II var8 = new II(var7, "inventory");
               IJ var9 = var1.class_(var8);
               if (var9 == var2) {
                  rrbb_3.protected_("Custom Items: Model not found " + var8.break_());
               } else {
                  if (this.interface_ == null) {
                     this.interface_ = new HashMap<>();
                  }

                  String var10 = "item/" + var6;
                  this.interface_.put(var10, var9);
               }
            }
         }
      }
   }

   private static void class_(IC var0, String var1) {
      rqO_2 var2 = extends_(var1);
      II var3 = new II(var2, "inventory");
      var0.class_(var3);
   }

   private static String class_(Properties var0, String... var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         String var4 = var0.getProperty(var3);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   private int class_(String var1, int var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         int var3 = rrbb_3.class_(var1, Integer.MIN_VALUE);
         if (var3 == Integer.MIN_VALUE) {
            rrbb_3.protected_("Invalid integer: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   private float class_(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         float var3 = rrbb_3.class_(var1, Float.MIN_VALUE);
         if (var3 == Float.MIN_VALUE) {
            rrbb_3.protected_("Invalid float: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   private int[] class_(String var1, rrMF var2) {
      if (var1 == null) {
         return null;
      } else {
         String[] var3 = rrbb_3.class_(var1, " ");
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            int var7 = var2.class_(var6, Integer.MIN_VALUE);
            if (var7 == Integer.MIN_VALUE) {
               rrbb_3.protected_("Invalid value: " + var6);
            } else {
               var4.add(var7);
            }
         }

         Integer[] var8 = var4.toArray(new Integer[var4.size()]);
         return rrbb_3.class_(var8);
      }
   }

   public float class_(fY_2 var1) {
      if (this.const_ <= 0) {
         if (this.return_ != null) {
            ff_3 var2 = var1.break_(this.return_);
            int var3 = var2.new_();
            int var4 = MT.S();
            MT.super_(var3);
            this.const_ = GL11.glGetTexLevelParameteri(3553, 0, 4096);
            MT.super_(var4);
         }

         if (this.const_ <= 0) {
            this.const_ = 16;
         }
      }

      return (float)this.const_;
   }

   private static String class_(String var0, String var1, String var2, int var3, Map<String, String> var4) {
      if (var0 != null) {
         String var6 = ".json";
         if (var0.endsWith(var6)) {
            var0 = var0.substring(0, var0.length() - var6.length());
         }

         return byte_(var0, var2);
      } else if (var3 == 3) {
         return null;
      } else {
         if (var4 != null) {
            String var5 = (String)var4.get("model.bow_standby");
            if (var5 != null) {
               return var5;
            }
         }

         return var0;
      }
   }

   public IJ class_(rqO_2 var1, boolean var2) {
      IJ var3;
      Map var4;
      if (var2) {
         var3 = this.throw_;
         var4 = this.interface_;
      } else {
         var3 = this.try_;
         var4 = this.instanceof_;
      }

      if (var1 != null && var4 != null) {
         String var5 = var1.break_();
         IJ var6 = (IJ)var4.get(var5);
         if (var6 != null) {
            return var6;
         }
      }

      return var3;
   }

   public float break_(fY_2 var1) {
      if (this.strictfp_ <= 0) {
         if (this.return_ != null) {
            ff_3 var2 = var1.break_(this.return_);
            int var3 = var2.new_();
            int var4 = MT.S();
            MT.super_(var3);
            this.strictfp_ = GL11.glGetTexLevelParameteri(3553, 0, 4097);
            MT.super_(var4);
         }

         if (this.strictfp_ <= 0) {
            this.strictfp_ = 16;
         }
      }

      return (float)this.strictfp_;
   }

   private static String break_(String var0, String var1) {
      var0 = rrzJ_2.class_(var0, var1);
      if (!var0.startsWith(var1) && !var0.startsWith("textures/") && !var0.startsWith("optifine/")) {
         var0 = var1 + "/" + var0;
      }

      if (var0.endsWith(".png")) {
         var0 = var0.substring(0, var0.length() - 4);
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private static Map break_(Properties var0, String var1) {
      String var2 = "model.";
      Map var3 = byte_(var0, var2);
      if (var3.size() <= 0) {
         return null;
      } else {
         Set var4 = var3.keySet();
         LinkedHashMap var5 = new LinkedHashMap();

         for (String var7 : var4) {
            String var8 = (String)var3.get(var7);
            var8 = byte_(var8, var1);
            var5.put(var7, var8);
         }

         return var5;
      }
   }

   public void break_(fJ_2 var1) {
      if (this.goto_ != null) {
         this.goto_ = var1.break_(this.goto_.finally_());
      }

      if (this.while_ != null) {
         for (String var3 : this.while_.keySet()) {
            fj_3 var4 = (fj_3)this.while_.get(var3);
            if (var4 != null) {
               rqO_2 var5 = var4.finally_();
               fj_3 var6 = var1.break_(var5);
               if (var6 == null || var6 instanceof fQ_2) {
                  rrbb_3.protected_("Missing CIT sprite: " + var5 + ", properties: " + this.break_);
               }

               this.while_.put(var3, var6);
            }
         }
      }
   }

   private int[] break_() {
      rdb_3 var1 = this.throws_(this.class_);
      if (var1 == null) {
         return null;
      } else {
         int var2 = rdb_3.class_(var1);
         return var2 < 0 ? null : new int[]{var2};
      }
   }

   private static String break_(String var0) {
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

   private rdb_3 throws_(String var1) {
      rqO_2 var2 = new rqO_2(var1);
      return !rVL.for_.byte_(var2) ? null : rVL.for_.class_(var2);
   }

   private boolean finally_(String var1) {
      return var1.startsWith("bow") || var1.startsWith("crossbow") || var1.startsWith("fishing_rod") || var1.startsWith("shield");
   }

   private rrMp_1 catch_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         int var2 = var1.length() - var1.replace("-", "").length();
         if (var2 > 1) {
            rrbb_3.protected_("Invalid range: " + var1);
            return null;
         } else {
            String[] var3 = rrbb_3.class_(var1, "- ");
            int[] var4 = new int[var3.length];

            for (int var5 = 0; var5 < var3.length; var5++) {
               String var6 = var3[var5];
               int var7 = rrbb_3.class_(var6, -1);
               if (var7 < 0) {
                  rrbb_3.protected_("Invalid range: " + var1);
                  return null;
               }

               var4[var5] = var7;
            }

            if (var4.length == 1) {
               int var10 = var4[0];
               if (var1.startsWith("-")) {
                  return new rrMp_1(0, var10);
               } else {
                  return var1.endsWith("-") ? new rrMp_1(var10, 65535) : new rrMp_1(var10, var10);
               }
            } else if (var4.length == 2) {
               int var9 = Math.min(var4[0], var4[1]);
               int var11 = Math.max(var4[0], var4[1]);
               return new rrMp_1(var9, var11);
            } else {
               rrbb_3.protected_("Invalid range: " + var1);
               return null;
            }
         }
      }
   }

   private static rqO_2 extends_(String var0) {
      return new rqO_2(var0);
   }

   private rrMq_1 case_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String[] var2 = rrbb_3.class_(var1, " ");
         rrMq_1 var3 = new rrMq_1();

         for (int var4 = 0; var4 < var2.length; var4++) {
            String var5 = var2[var4];
            rrMp_1 var6 = this.catch_(var5);
            if (var6 == null) {
               rrbb_3.protected_("Invalid range list: " + var1);
               return null;
            }

            var3.class_(var6);
         }

         return var3;
      }
   }

   private rqO_2 implements_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         rqO_2 var2 = new rqO_2(var1);
         String var3 = var2.byte_();
         String var4 = var2.break_();
         if (!var4.contains("/")) {
            var4 = "textures/item/" + var4;
         }

         String var5 = var4 + ".png";
         rqO_2 var6 = new rqO_2(var3, var5);
         boolean var7 = rrbb_3.byte_(var6);
         if (!var7) {
            rrbb_3.protected_("File not found: " + var5);
         }

         return var6;
      }
   }

   private int protected_(String var1) {
      if (var1 == null) {
         return 1;
      } else if (var1.equals("item")) {
         return 1;
      } else if (var1.equals("enchantment")) {
         return 2;
      } else if (var1.equals("armor")) {
         return 3;
      } else if (var1.equals("elytra")) {
         return 4;
      } else {
         rrbb_3.protected_("Unknown method: " + var1);
         return 0;
      }
   }

   private String[] protected_() {
      if (this.byte_ == 1 && this.protected_.length == 1) {
         rdb_3 var1 = rdb_3.break_(this.protected_[0]);
         boolean var2 = var1 == rdy_3.JA || var1 == rdy_3.kk || var1 == rdy_3.kQ;
         if (var2 && this.implements_ != null && this.implements_.class_() > 0) {
            rrMp_1 var10 = this.implements_.break_(0);
            int var11 = var10.class_();
            boolean var12 = (var11 & 16384) != 0;
            String var13 = this.class_(this.case_, "texture.potion_overlay", "item/potion_overlay");
            Object var14 = null;
            if (var12) {
               var14 = this.class_(this.case_, "texture.potion_bottle_splash", "item/potion_bottle_splash");
            } else {
               var14 = this.class_(this.case_, "texture.potion_bottle_drinkable", "item/potion_bottle_drinkable");
            }

            return new String[]{var13, (String)var14};
         }

         if (var1 instanceof rxS_2 var3 && var3.throws_() == rxE_2.LEATHER) {
            String var4 = "leather";
            String var5 = "helmet";
            rXQ var6 = var3.byte_();
            if (var6 == rXQ.HEAD) {
               var5 = "helmet";
            }

            if (var6 == rXQ.CHEST) {
               var5 = "chestplate";
            }

            if (var6 == rXQ.LEGS) {
               var5 = "leggings";
            }

            if (var6 == rXQ.FEET) {
               var5 = "boots";
            }

            String var7 = var4 + "_" + var5;
            String var8 = this.class_(this.case_, "texture." + var7, "item/" + var7);
            String var9 = this.class_(this.case_, "texture." + var7 + "_overlay", "item/" + var7 + "_overlay");
            return new String[]{var8, var9};
         }
      }

      return new String[]{this.throws_};
   }

   private int private_(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         var1 = var1.toLowerCase();
         if (var1.equals("any")) {
            return 0;
         } else if (var1.equals("main")) {
            return 1;
         } else if (var1.equals("off")) {
            return 2;
         } else {
            rrbb_3.protected_("Invalid hand: " + var1);
            return 0;
         }
      }
   }
}
