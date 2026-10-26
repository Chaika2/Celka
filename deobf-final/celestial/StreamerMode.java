package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StreamerMode extends Module {
   private static String[] protected_;
   private static int[] throws_;
   private static boolean[] catch_;
   public static Object[] break_;
   private static byte[] private_;
   private static short[] implements_;
   public Object[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, -30, 125, 0, 11, -62, -110, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public StreamerMode() {
      super("Streamer Mode", "Скрывает некоторые элементы\nигры", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.this_();
      rrIk_1 var5 = new rrIk_1("Скрывать свой", true);
      this.byte_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Скрывать друзей", false);
      this.byte_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Скрывать информацию", false);
      this.byte_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Скрывать анархию/гриф", false);
      this.byte_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Скрывать координаты", false);
      this.byte_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Режим ютубера", false);
      this.byte_[5] = var10;
      this.class_(
         new Setting[]{
            new GroupSetting("Никнеймы", (rrIk_1)this.byte_[0], (rrIk_1)this.byte_[1]),
            new GroupSetting("Чат", (rrIk_1)this.byte_[2]),
            new GroupSetting("Разное", (rrIk_1)this.byte_[3], (rrIk_1)this.byte_[4], (rrIk_1)this.byte_[5])
         }
      );
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[6];
      }
   }

   public static void class_(rVi_1 var0, String var1, Map<Integer, String> var2) {
      List var3 = var0.protected_();
      if (!var3.isEmpty()) {
         StringBuilder var4 = new StringBuilder();

         for (rgP_2 var6 : var3) {
            var4.append(var6.getString());
         }

         String var20 = var4.toString().toLowerCase();
         int var21 = var20.indexOf(var1.toLowerCase());
         if (var21 != -1) {
            int var7 = var21 + var1.length();
            ArrayList var8 = new ArrayList(var3.size());
            int var9 = 0;

            for (rgP_2 var11 : var3) {
               String var12 = var11.getString();
               int var13 = var12.length();
               int var14 = var9 + var13;
               if (var14 > var21 && var9 < var7) {
                  StringBuilder var15 = new StringBuilder(var13);

                  for (int var16 = 0; var16 < var13; var16++) {
                     int var17 = var9 + var16;
                     if (var17 >= var21 && var17 < var7) {
                        int var18 = var17 - var21;
                        String var19 = var2.getOrDefault(var18, String.valueOf(var12.charAt(var16)));
                        var15.append(var19);
                     } else {
                        var15.append(var12.charAt(var16));
                     }
                  }

                  rgN_2 var22 = new rgN_2(var15.toString());
                  var22.class_(var11.class_());
                  var8.add(var22);
               } else {
                  var8.add(var11);
               }

               var9 = var14;
            }

            var0.protected_().clear();
            var0.protected_().addAll(var8);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1458169635625046482L;
   }

   public rgP_2 class_(rgP_2 var1) {
      this.this_();
      if (!this.aJ_()) {
         return var1;
      } else {
         boolean var2 = ((rrIk_1)this.byte_[1]).class_();
         boolean var3 = ((rrIk_1)this.byte_[0]).class_();
         if (!var2 && !var3) {
            return var1;
         } else {
            String var4 = var1.getString();
            String var5 = var4.toLowerCase();
            if (var2) {
               Map var6 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_();
               if (!var6.isEmpty()) {
                  for (String var8 : var6.keySet()) {
                     if (var5.contains(var8)) {
                        return var1.case_().class_(var8, (String)break_[2], false);
                     }
                  }
               }
            }

            if (var3) {
               String var9 = import_.while_().byte_();
               String var10 = var9.toLowerCase();
               if (var5.contains(var10)) {
                  return var1.case_().class_(var10, (String)break_[2], false);
               }
            }

            return var1;
         }
      }
   }

   public static boolean class_(int var0) {
      int var1 = var0 >> 16 & 0xFF;
      int var2 = var0 >> 8 & 0xFF;
      int var3 = var0 & 0xFF;
      return var1 > var2 && var1 > var3 && var1 >= 80 ? true : catch_[25];
   }

   @EventTarget
   public void class_(rrnb_3 var1) {
      this.this_();
      if (var1.class_() instanceof rsG_2 var3
         && ((rrIk_1)this.byte_[5]).class_()
         && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         && (int)var3.BO() == -29) {
         var1.class_(true);
      }
   }

   @EventTarget
   public void class_(rrLb_1 var1) {
      String var2 = var1.class_();
      if (var2 != null) {
         var1.break_(this.break_(var2));
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 228195096;
   }

   public String break_(String var1) {
      this.this_();
      if (!this.aJ_()) {
         return var1;
      } else {
         boolean var2 = ((rrIk_1)this.byte_[1]).class_();
         boolean var3 = ((rrIk_1)this.byte_[0]).class_();
         if (!var2 && !var3) {
            return var1;
         } else {
            String var4 = var1.toLowerCase();
            if (var2) {
               Map var5 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_();
               if (!var5.isEmpty()) {
                  for (String var7 : var5.keySet()) {
                     if (var4.contains(var7)) {
                        return var4.replace(var7, (String)break_[2]);
                     }
                  }
               }
            }

            if (var3) {
               String var8 = import_.while_().byte_();
               String var9 = var8.toLowerCase();
               if (var4.contains(var9)) {
                  return var4.replace(var9, (String)break_[2]);
               }
            }

            return var1;
         }
      }
   }

   private static void goto_() {
      catch_ = new boolean[]{
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true
      };
   }

   public boolean continue_() {
      this.this_();
      return this.aJ_() && ((rrIk_1)this.byte_[3]).class_() ? true : catch_[19];
   }

   private static void else_() {
      protected_ = new String[]{
         new String("Streamer Mode"),
         new String("Скрывает некоторые элементы\nигры"),
         new String("Скрывать свой"),
         new String("Скрывать друзей"),
         new String("Скрывать информацию"),
         new String("Скрывать анархию/гриф"),
         new String("Скрывать координаты"),
         new String("Режим ютубера"),
         new String("Никнеймы"),
         new String("Чат"),
         new String("Разное"),
         new String("warp"),
         new String("call"),
         new String("tpa"),
         new String("tp"),
         new String("l"),
         new String("login"),
         new String("register"),
         new String("reg"),
         new String("cp"),
         new String("an"),
         new String("gr"),
         new String("changepass"),
         new String("cpass"),
         new String("changepassword"),
         new String("Protected"),
         new String("(funtime|фантайм)"),
         new String("funac"),
         new String("c"),
         new String("e"),
         new String("l"),
         new String("e"),
         new String("s"),
         new String("t"),
         new String("ial"),
         new String("C"),
         new String("e"),
         new String("l"),
         new String("A"),
         new String("C")
      };
   }

   public boolean new_() {
      this.this_();
      return this.aJ_() && ((rrIk_1)this.byte_[4]).class_() ? true : catch_[21];
   }

   private static void return_() {
      Object[] var0 = new Object[8];
      String[] var2 = new String[]{"warp", "call", "tpa", "tp", "l", "login", "register", "reg", "cp", "an", "gr", "changepass", "cpass", "changepassword"};
      var0[0] = var2;
      var0[1] = new rgN_2("Protected");
      var0[2] = new String("Protected");
      var0[3] = Pattern.compile("(funtime|фантайм)", 2);
      var0[4] = Pattern.compile("funac", 2);
      Entry[] var3 = new Entry[]{
         Map.entry((Integer)0, "c"),
         Map.entry((Integer)1, "e"),
         Map.entry((Integer)2, "l"),
         Map.entry((Integer)3, "e"),
         Map.entry((Integer)4, "s"),
         Map.entry((Integer)5, "t"),
         Map.entry((Integer)6, "ial")
      };
      var0[5] = Map.ofEntries(var3);
      Entry[] var4 = new Entry[]{
         Map.entry((Integer)0, "C"), Map.entry((Integer)1, "e"), Map.entry((Integer)2, "l"), Map.entry((Integer)3, "A"), Map.entry((Integer)4, "C")
      };
      var0[6] = Map.ofEntries(var4);
      var0[7] = rVa_1.class_(16738740);
      break_ = var0;
   }

   public boolean super_() {
      this.this_();
      return this.aJ_() && ((rrIk_1)this.byte_[5]).class_() ? true : catch_[23];
   }

   private static void try_() {
      private_ = new byte[]{
         3,
         2,
         2,
         3,
         2,
         -29,
         16,
         8,
         80,
         -1,
         14,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         2,
         2,
         3,
         2,
         4,
         7,
         2,
         2,
         3,
         3,
         4,
         4,
         5,
         5,
         6,
         6,
         5,
         5,
         2,
         2,
         3,
         3,
         4,
         4,
         6,
         7,
         6,
         8
      };
   }

   private static void while_() {
      implements_ = new short[]{3, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 5, 1, 2, 1, 0, 0, 2, 2, 1, 0, 0, 2, 2, 2, 0, 3, 4, 5, 255, 255, 255};
   }

   private static void public_() {
      throws_ = new int[]{16738740};
   }

   public boolean protected_(String var1) {
      this.this_();
      return this.aJ_() && ((rrIk_1)this.byte_[2]).class_()
         ? Arrays.<String>stream((String[])break_[0]).anyMatch(var1x -> var1.startsWith("/" + var1x))
         : catch_[17];
   }
}
