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
   public String id_class = null;
   public String id_break = null;
   public int id_byte = 1;
   public int[] id_protected = null;
   public String id_throws = null;
   public Map<String, String> id_case = null;
   public String id_catch = null;
   public Map<String, String> id_private = null;
   public rrMq_1 id_implements = null;
   public boolean id_finally = false;
   public int id_extends = 0;
   public rrMq_1 id_native = null;
   public int[] id_volatile = null;
   public rrMq_1 id_final = null;
   public rrMH[] id_package = null;
   public int id_int = 0;
   public int id_new = 1;
   public float id_continue = 0.0F;
   public float id_super = 0.0F;
   public int id_this = 0;
   public float id_else = 1.0F;
   public int id_synchronized = 0;
   public rqO_2 id_return = null;
   public Map id_public = null;
   public fj_3 id_goto = null;
   public Map id_while = null;
   public IJ id_try = null;
   public Map<String, IJ> id_instanceof = null;
   public IJ id_throw = null;
   public Map<String, IJ> id_interface = null;
   private int id_const = 0;
   private int id_strictfp = 0;
   public static final int id_char = 0;
   public static final int id_abstract = 1;
   public static final int id_long = 2;
   public static final int id_float = 3;
   public static final int id_void = 4;
   public static final int id_static = 0;
   public static final int id_import = 1;
   public static final int id_short = 2;
   public static final String id_default = "inventory";

   private static String id_byte(String var0, String var1) {
      var0 = rrzJ_2.id_class(var0, var1);
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

   private boolean id_byte() {
      return true;
   }

   private static Map id_byte(Properties var0, String var1) {
      LinkedHashMap var2 = new LinkedHashMap();

      for (String var4 : var0.keySet()) {
         String var5 = var0.getProperty(var4);
         if (var4.startsWith(var1)) {
            var2.put(var4, var5);
         }
      }

      return var2;
   }

   private static String id_byte(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   public rrbH_2(Properties var1, String var2) {
      this.id_class = id_break(var2);
      this.id_break = id_byte(var2);
      this.id_byte = this.id_protected(var1.getProperty("type"));
      this.id_protected = this.id_class(var1.getProperty("items"), var1.getProperty("matchItems"));
      this.id_private = id_break(var1, this.id_break);
      this.id_catch = id_class(var1.getProperty("model"), var2, this.id_break, this.id_byte, this.id_private);
      this.id_case = id_class(var1, this.id_break);
      boolean var3 = this.id_private == null && this.id_catch == null;
      this.id_throws = id_class(
         var1.getProperty("texture"), var1.getProperty("tile"), var1.getProperty("source"), var2, this.id_break, this.id_byte, this.id_case, var3
      );
      String var4 = var1.getProperty("damage");
      if (var4 != null) {
         this.id_finally = var4.contains("%");
         var4 = var4.replace("%", "");
         this.id_implements = this.id_case(var4);
         this.id_extends = this.id_class(var1.getProperty("damageMask"), 0);
      }

      this.id_native = this.id_case(var1.getProperty("stackSize"));
      this.id_volatile = this.id_class(id_class(var1, "enchantmentIDs", "enchantments"), new rrMy_1());
      this.id_final = this.id_case(var1.getProperty("enchantmentLevels"));
      this.id_package = this.id_class(var1);
      this.id_int = this.id_private(var1.getProperty("hand"));
      this.id_new = rrxh_3.id_class(var1.getProperty("blend"));
      this.id_continue = this.id_class(var1.getProperty("speed"), 0.0F);
      this.id_super = this.id_class(var1.getProperty("rotation"), 0.0F);
      this.id_this = this.id_class(var1.getProperty("layer"), 0);
      this.id_synchronized = this.id_class(var1.getProperty("weight"), 0);
      this.id_else = this.id_class(var1.getProperty("duration"), 1.0F);
   }

   @Override
   public String toString() {
      return this.id_break
         + "/"
         + this.id_class
         + ", type: "
         + this.id_byte
         + ", items: ["
         + rrbb_3.id_class(this.id_protected)
         + "], textture: "
         + this.id_throws;
   }

   public boolean id_class(String var1) {
      if (this.id_class == null || this.id_class.length() <= 0) {
         rrbb_3.id_protected("No name found: " + var1);
         return false;
      } else if (this.id_break == null) {
         rrbb_3.id_protected("No base path found: " + var1);
         return false;
      } else if (this.id_byte == 0) {
         rrbb_3.id_protected("No type defined: " + var1);
         return false;
      } else {
         if (this.id_byte == 4 && this.id_protected == null) {
            this.id_protected = new int[]{rdb_3.id_class(rdy_3.kc)};
         }

         if (this.id_byte == 1 || this.id_byte == 3 || this.id_byte == 4) {
            if (this.id_protected == null) {
               this.id_protected = this.id_break();
            }

            if (this.id_protected == null) {
               rrbb_3.id_protected("No items defined: " + var1);
               return false;
            }
         }

         if (this.id_throws == null && this.id_case == null && this.id_catch == null && this.id_private == null) {
            rrbb_3.id_protected("No texture or model specified: " + var1);
            return false;
         } else if (this.id_byte == 2 && this.id_volatile == null) {
            rrbb_3.id_protected("No enchantmentIDs specified: " + var1);
            return false;
         } else {
            return true;
         }
      }
   }

   public static fj_3 id_class(Ig_1 var0) {
      fJ_2 var1 = QY.id_instanceof().id_extends().id_class(var0.id_class());
      return var1.id_break(var0.id_break());
   }

   private static wK_2 id_class(IS var0, IG var1, fj_3 var2, rpr_3 var3, If_1 var4) {
      Ih_1 var5 = new Ih_1();
      return var5.id_class(var0.id_class, var0.id_break, var1, var2, var3, var4, var0.id_protected, var0.id_throws, var2.id_finally());
   }

   private static IJ id_class(fJ_2 var0, IN var1, String[] var2, boolean var3) {
      String[] var4 = new String[var2.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var2[var5];
         var4[var5] = rrzX_2.id_protected(var6, "textures/");
      }

      we_3 var7 = id_class(var4);
      we_3 var8 = var1.id_class(rrbH_2::id_class, var7);
      return id_class(var0, var8, var3);
   }

   private rrMH[] id_class(Properties var1) {
      String var2 = "nbt.";
      Map var3 = id_byte(var1, var2);
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

   private static we_3 id_class(String[] var0) {
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
      return we_3.id_class(var4);
   }

   private rqO_2 id_class(rqO_2 var1) {
      String var2 = var1.id_break();
      var2 = rrzX_2.id_protected(var2, "textures/");
      var2 = rrzX_2.id_throws(var2, ".png");
      return new rqO_2(var1.id_byte(), var2);
   }

   private String id_class(Map<String, String> var1, String var2, String var3) {
      if (var1 == null) {
         return var3;
      } else {
         String var4 = (String)var1.get(var2);
         return var4 == null ? var3 : var4;
      }
   }

   public void id_class(fJ_2 var1, IN var2) {
      if (this.id_throws != null || this.id_case != null) {
         String[] var3 = this.id_protected();
         boolean var4 = this.id_byte();
         this.id_try = id_class(var1, var2, var3, var4);
         if (this.id_byte == 1 && this.id_case != null) {
            for (String var6 : this.id_case.keySet()) {
               String var7 = this.id_case.get(var6);
               String var8 = rrzX_2.id_protected(var6, "texture.");
               if (this.id_finally(var8)) {
                  String[] var9 = new String[]{var7};
                  IJ var10 = id_class(var1, var2, var9, var4);
                  if (this.id_instanceof == null) {
                     this.id_instanceof = new HashMap<>();
                  }

                  String var11 = "item/" + var8;
                  this.id_instanceof.put(var11, var10);
               }
            }
         }
      }
   }

   public void id_class(fJ_2 var1) {
      if (this.id_throws != null) {
         this.id_return = this.id_implements(this.id_throws);
         if (this.id_byte == 1) {
            rqO_2 var2 = this.id_class(this.id_return);
            this.id_goto = var1.id_throws(var2);
         }
      }

      if (this.id_case != null) {
         this.id_public = new HashMap();
         this.id_while = new HashMap();

         for (String var3 : this.id_case.keySet()) {
            String var4 = this.id_case.get(var3);
            rqO_2 var5 = this.id_implements(var4);
            this.id_public.put(var3, var5);
            if (this.id_byte == 1) {
               rqO_2 var6 = this.id_class(var5);
               fj_3 var7 = var1.id_throws(var6);
               this.id_while.put(var3, var7);
            }
         }
      }
   }

   private static IJ id_class(fJ_2 var0, we_3 var1, boolean var2) {
      If_1 var3 = If_1.X0_Y0;
      Ig_1 var4 = var1.id_byte("particle");
      fj_3 var5 = var4.id_byte();
      IY var6 = new IY(var1, IF.id_class, false).id_class(var5);

      for (IS var8 : var1.id_class()) {
         for (rpr_3 var10 : var8.id_byte.keySet()) {
            IG var11 = var8.id_byte.get(var10);
            if (!var2) {
               var11 = new IG(var11.id_class, -1, var11.id_byte, var11.id_protected);
            }

            Ig_1 var12 = var1.id_byte(var11.id_byte);
            fj_3 var13 = var12.id_byte();
            wK_2 var14 = id_class(var8, var11, var13, var10, var3);
            if (var11.id_class == null) {
               var6.id_class(var14);
            } else {
               var6.id_class(rpr_3.id_class(var3.id_class().id_byte(), var11.id_class), var14);
            }
         }
      }

      return var6.id_class();
   }

   private int[] id_class(String var1, String var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         TreeSet var3 = new TreeSet();
         String[] var4 = rrbb_3.id_class(var1, " ");

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            rdb_3 var7 = this.id_throws(var6);
            if (var7 == null) {
               rrbb_3.id_protected("Item not found: " + var6);
            } else {
               int var8 = rdb_3.id_class(var7);
               if (var8 < 0) {
                  rrbb_3.id_protected("Item ID not found: " + var6);
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

   public void id_class(IC var1) {
      if (this.id_catch != null) {
         id_class(var1, this.id_catch);
      }

      if (this.id_byte == 1 && this.id_private != null) {
         for (String var3 : this.id_private.keySet()) {
            String var4 = this.id_private.get(var3);
            String var5 = rrzX_2.id_protected(var3, "model.");
            if (this.id_finally(var5)) {
               id_class(var1, var4);
            }
         }
      }
   }

   private static String id_class(String var0, String var1, String var2, String var3, String var4, int var5, Map<String, String> var6, boolean var7) {
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

         return id_break(var0, var4);
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

            return id_break(var11, var4);
         }
      }
   }

   private static Map id_class(Properties var0, String var1) {
      String var2 = "texture.";
      Map var3 = id_byte(var0, var2);
      if (var3.size() <= 0) {
         return null;
      } else {
         Set var4 = var3.keySet();
         LinkedHashMap var5 = new LinkedHashMap();

         for (String var7 : var4) {
            String var8 = (String)var3.get(var7);
            var8 = id_break(var8, var1);
            var5.put(var7, var8);
         }

         return var5;
      }
   }

   public void id_class() {
      Ip_1 var1 = rrbb_3.id_float();
      IJ var2 = var1.id_break();
      if (this.id_catch != null) {
         rqO_2 var3 = id_extends(this.id_catch);
         II var4 = new II(var3, "inventory");
         this.id_throw = var1.id_class(var4);
         if (this.id_throw == var2) {
            rrbb_3.id_protected("Custom Items: Model not found " + var4.id_break());
            this.id_throw = null;
         }
      }

      if (this.id_byte == 1 && this.id_private != null) {
         for (String var12 : this.id_private.keySet()) {
            String var5 = this.id_private.get(var12);
            String var6 = rrzX_2.id_protected(var12, "model.");
            if (this.id_finally(var6)) {
               rqO_2 var7 = id_extends(var5);
               II var8 = new II(var7, "inventory");
               IJ var9 = var1.id_class(var8);
               if (var9 == var2) {
                  rrbb_3.id_protected("Custom Items: Model not found " + var8.id_break());
               } else {
                  if (this.id_interface == null) {
                     this.id_interface = new HashMap<>();
                  }

                  String var10 = "item/" + var6;
                  this.id_interface.put(var10, var9);
               }
            }
         }
      }
   }

   private static void id_class(IC var0, String var1) {
      rqO_2 var2 = id_extends(var1);
      II var3 = new II(var2, "inventory");
      var0.id_class(var3);
   }

   private static String id_class(Properties var0, String... var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         String var4 = var0.getProperty(var3);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   private int id_class(String var1, int var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         int var3 = rrbb_3.id_class(var1, Integer.MIN_VALUE);
         if (var3 == Integer.MIN_VALUE) {
            rrbb_3.id_protected("Invalid integer: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   private float id_class(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         float var3 = rrbb_3.id_class(var1, Float.MIN_VALUE);
         if (var3 == Float.MIN_VALUE) {
            rrbb_3.id_protected("Invalid float: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   private int[] id_class(String var1, rrMF var2) {
      if (var1 == null) {
         return null;
      } else {
         String[] var3 = rrbb_3.id_class(var1, " ");
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            int var7 = var2.id_class(var6, Integer.MIN_VALUE);
            if (var7 == Integer.MIN_VALUE) {
               rrbb_3.id_protected("Invalid value: " + var6);
            } else {
               var4.add(var7);
            }
         }

         Integer[] var8 = var4.toArray(new Integer[var4.size()]);
         return rrbb_3.id_class(var8);
      }
   }

   public float id_class(fY_2 var1) {
      if (this.id_const <= 0) {
         if (this.id_return != null) {
            ff_3 var2 = var1.id_break(this.id_return);
            int var3 = var2.id_new();
            int var4 = MT.S();
            MT.id_super(var3);
            this.id_const = GL11.glGetTexLevelParameteri(3553, 0, 4096);
            MT.id_super(var4);
         }

         if (this.id_const <= 0) {
            this.id_const = 16;
         }
      }

      return (float)this.id_const;
   }

   private static String id_class(String var0, String var1, String var2, int var3, Map<String, String> var4) {
      if (var0 != null) {
         String var6 = ".json";
         if (var0.endsWith(var6)) {
            var0 = var0.substring(0, var0.length() - var6.length());
         }

         return id_byte(var0, var2);
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

   public IJ id_class(rqO_2 var1, boolean var2) {
      IJ var3;
      Map var4;
      if (var2) {
         var3 = this.id_throw;
         var4 = this.id_interface;
      } else {
         var3 = this.id_try;
         var4 = this.id_instanceof;
      }

      if (var1 != null && var4 != null) {
         String var5 = var1.id_break();
         IJ var6 = (IJ)var4.get(var5);
         if (var6 != null) {
            return var6;
         }
      }

      return var3;
   }

   public float id_break(fY_2 var1) {
      if (this.id_strictfp <= 0) {
         if (this.id_return != null) {
            ff_3 var2 = var1.id_break(this.id_return);
            int var3 = var2.id_new();
            int var4 = MT.S();
            MT.id_super(var3);
            this.id_strictfp = GL11.glGetTexLevelParameteri(3553, 0, 4097);
            MT.id_super(var4);
         }

         if (this.id_strictfp <= 0) {
            this.id_strictfp = 16;
         }
      }

      return (float)this.id_strictfp;
   }

   private static String id_break(String var0, String var1) {
      var0 = rrzJ_2.id_class(var0, var1);
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

   private static Map id_break(Properties var0, String var1) {
      String var2 = "model.";
      Map var3 = id_byte(var0, var2);
      if (var3.size() <= 0) {
         return null;
      } else {
         Set var4 = var3.keySet();
         LinkedHashMap var5 = new LinkedHashMap();

         for (String var7 : var4) {
            String var8 = (String)var3.get(var7);
            var8 = id_byte(var8, var1);
            var5.put(var7, var8);
         }

         return var5;
      }
   }

   public void id_break(fJ_2 var1) {
      if (this.id_goto != null) {
         this.id_goto = var1.id_break(this.id_goto.id_finally());
      }

      if (this.id_while != null) {
         for (String var3 : this.id_while.keySet()) {
            fj_3 var4 = (fj_3)this.id_while.get(var3);
            if (var4 != null) {
               rqO_2 var5 = var4.id_finally();
               fj_3 var6 = var1.id_break(var5);
               if (var6 == null || var6 instanceof fQ_2) {
                  rrbb_3.id_protected("Missing CIT sprite: " + var5 + ", properties: " + this.id_break);
               }

               this.id_while.put(var3, var6);
            }
         }
      }
   }

   private int[] id_break() {
      rdb_3 var1 = this.id_throws(this.id_class);
      if (var1 == null) {
         return null;
      } else {
         int var2 = rdb_3.id_class(var1);
         return var2 < 0 ? null : new int[]{var2};
      }
   }

   private static String id_break(String var0) {
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

   private rdb_3 id_throws(String var1) {
      rqO_2 var2 = new rqO_2(var1);
      return !rVL.id_for.id_byte(var2) ? null : rVL.id_for.id_class(var2);
   }

   private boolean id_finally(String var1) {
      return var1.startsWith("bow") || var1.startsWith("crossbow") || var1.startsWith("fishing_rod") || var1.startsWith("shield");
   }

   private rrMp_1 id_catch(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         int var2 = var1.length() - var1.replace("-", "").length();
         if (var2 > 1) {
            rrbb_3.id_protected("Invalid range: " + var1);
            return null;
         } else {
            String[] var3 = rrbb_3.id_class(var1, "- ");
            int[] var4 = new int[var3.length];

            for (int var5 = 0; var5 < var3.length; var5++) {
               String var6 = var3[var5];
               int var7 = rrbb_3.id_class(var6, -1);
               if (var7 < 0) {
                  rrbb_3.id_protected("Invalid range: " + var1);
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
               rrbb_3.id_protected("Invalid range: " + var1);
               return null;
            }
         }
      }
   }

   private static rqO_2 id_extends(String var0) {
      return new rqO_2(var0);
   }

   private rrMq_1 id_case(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String[] var2 = rrbb_3.id_class(var1, " ");
         rrMq_1 var3 = new rrMq_1();

         for (int var4 = 0; var4 < var2.length; var4++) {
            String var5 = var2[var4];
            rrMp_1 var6 = this.id_catch(var5);
            if (var6 == null) {
               rrbb_3.id_protected("Invalid range list: " + var1);
               return null;
            }

            var3.id_class(var6);
         }

         return var3;
      }
   }

   private rqO_2 id_implements(String var1) {
      if (var1 == null) {
         return null;
      } else {
         rqO_2 var2 = new rqO_2(var1);
         String var3 = var2.id_byte();
         String var4 = var2.id_break();
         if (!var4.contains("/")) {
            var4 = "textures/item/" + var4;
         }

         String var5 = var4 + ".png";
         rqO_2 var6 = new rqO_2(var3, var5);
         boolean var7 = rrbb_3.id_byte(var6);
         if (!var7) {
            rrbb_3.id_protected("File not found: " + var5);
         }

         return var6;
      }
   }

   private int id_protected(String var1) {
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
         rrbb_3.id_protected("Unknown method: " + var1);
         return 0;
      }
   }

   private String[] id_protected() {
      if (this.id_byte == 1 && this.id_protected.length == 1) {
         rdb_3 var1 = rdb_3.id_break(this.id_protected[0]);
         boolean var2 = var1 == rdy_3.JA || var1 == rdy_3.kk || var1 == rdy_3.kQ;
         if (var2 && this.id_implements != null && this.id_implements.id_class() > 0) {
            rrMp_1 var10 = this.id_implements.id_break(0);
            int var11 = var10.id_class();
            boolean var12 = (var11 & 16384) != 0;
            String var13 = this.id_class(this.id_case, "texture.potion_overlay", "item/potion_overlay");
            Object var14 = null;
            if (var12) {
               var14 = this.id_class(this.id_case, "texture.potion_bottle_splash", "item/potion_bottle_splash");
            } else {
               var14 = this.id_class(this.id_case, "texture.potion_bottle_drinkable", "item/potion_bottle_drinkable");
            }

            return new String[]{var13, (String)var14};
         }

         if (var1 instanceof rxS_2 var3 && var3.id_throws() == rxE_2.LEATHER) {
            String var4 = "leather";
            String var5 = "helmet";
            rXQ var6 = var3.id_byte();
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
            String var8 = this.id_class(this.id_case, "texture." + var7, "item/" + var7);
            String var9 = this.id_class(this.id_case, "texture." + var7 + "_overlay", "item/" + var7 + "_overlay");
            return new String[]{var8, var9};
         }
      }

      return new String[]{this.id_throws};
   }

   private int id_private(String var1) {
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
            rrbb_3.id_protected("Invalid hand: " + var1);
            return 0;
         }
      }
   }
}
