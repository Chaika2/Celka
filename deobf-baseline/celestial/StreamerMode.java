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
   private static String[] id_protected;
   private static int[] id_throws;
   private static boolean[] id_catch;
   public static Object[] id_break;
   private static byte[] id_private;
   private static short[] id_implements;
   public Object[] id_byte;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, -30, 125, 0, 11, -62, -110, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public StreamerMode() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_implements[0]]);
      this.id_this();
      rrIk_1 var5 = new rrIk_1(id_protected[2], id_catch[0]);
      this.id_byte[id_implements[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[3], id_catch[1]);
      this.id_byte[id_implements[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_protected[4], id_catch[2]);
      this.id_byte[id_implements[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_protected[5], id_catch[3]);
      this.id_byte[id_implements[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_protected[6], id_catch[4]);
      this.id_byte[id_implements[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_protected[7], id_catch[5]);
      this.id_byte[id_implements[6]] = var10;
      Setting[] var10001 = new Setting[id_private[0]];
      byte var10003 = id_catch[6];
      String var10006 = id_protected[8];
      Setting[] var10007 = new Setting[id_private[1]];
      var10007[id_catch[7]] = (rrIk_1)this.id_byte[id_implements[7]];
      var10007[id_catch[8]] = (rrIk_1)this.id_byte[id_implements[8]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_catch[9];
      var10006 = id_protected[9];
      var10007 = new Setting[id_catch[10]];
      var10007[id_catch[11]] = (rrIk_1)this.id_byte[id_implements[9]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[2];
      var10006 = id_protected[10];
      var10007 = new Setting[id_private[3]];
      var10007[id_catch[12]] = (rrIk_1)this.id_byte[id_implements[10]];
      var10007[id_catch[13]] = (rrIk_1)this.id_byte[id_implements[11]];
      var10007[id_private[4]] = (rrIk_1)this.id_byte[id_implements[12]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_byte == null) {
         this.id_byte = new Object[6];
      }
   }

   public static void id_class(rVi_1 var0, String var1, Map<Integer, String> var2) {
      List var3 = var0.id_protected();
      if (!var3.isEmpty()) {
         StringBuilder var4 = new StringBuilder();

         for (rgP_2 var6 : var3) {
            var4.append(var6.getString());
         }

         String var20 = var4.toString().toLowerCase();
         int var21 = var20.indexOf(var1.toLowerCase());
         if (var21 != id_private[9]) {
            int var7 = var21 + var1.length();
            ArrayList var8 = new ArrayList(var3.size());
            int var9 = id_catch[26];

            for (rgP_2 var11 : var3) {
               String var12 = var11.getString();
               int var13 = var12.length();
               int var14 = var9 + var13;
               if (var14 > var21 && var9 < var7) {
                  StringBuilder var15 = new StringBuilder(var13);

                  for (int var16 = id_catch[27]; var16 < var13; var16++) {
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
                  var22.id_class(var11.id_class());
                  var8.add(var22);
               } else {
                  var8.add(var11);
               }

               var9 = var14;
            }

            var0.id_protected().clear();
            var0.id_protected().addAll(var8);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1458169635625046482L;
   }

   public rgP_2 id_class(rgP_2 var1) {
      this.id_this();
      if (!this.aJ_()) {
         return var1;
      } else {
         boolean var2 = ((rrIk_1)this.id_byte[id_implements[21]]).id_class();
         boolean var3 = ((rrIk_1)this.id_byte[id_implements[22]]).id_class();
         if (!var2 && !var3) {
            return var1;
         } else {
            String var4 = var1.getString();
            String var5 = var4.toLowerCase();
            if (var2) {
               Map var6 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_implements[23]]).id_class();
               if (!var6.isEmpty()) {
                  for (String var8 : var6.keySet()) {
                     if (var5.contains(var8)) {
                        return var1.id_case().id_class(var8, (String)id_break[id_implements[24]], id_catch[15]);
                     }
                  }
               }
            }

            if (var3) {
               String var9 = id_import.id_while().id_byte();
               String var10 = var9.toLowerCase();
               if (var5.contains(var10)) {
                  return var1.id_case().id_class(var10, (String)id_break[id_implements[25]], id_catch[16]);
               }
            }

            return var1;
         }
      }
   }

   public static boolean id_class(int var0) {
      int var1 = var0 >> id_private[6] & id_implements[31];
      int var2 = var0 >> id_private[7] & id_implements[32];
      int var3 = var0 & id_implements[33];
      return var1 > var2 && var1 > var3 && var1 >= id_private[8] ? id_catch[24] : id_catch[25];
   }

   @EventTarget
   public void id_class(rrnb_3 var1) {
      this.id_this();
      if (var1.id_class() instanceof rsG_2 var3
         && ((rrIk_1)this.id_byte[id_implements[13]]).id_class()
         && (rrfq_3)rrfp_3.id_class[id_implements[14]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_implements[15]]
         && (int)var3.BO() == id_private[5]) {
         var1.id_class(id_catch[14]);
      }
   }

   @EventTarget
   public void id_class(rrLb_1 var1) {
      String var2 = var1.id_class();
      if (var2 != null) {
         var1.id_break(this.id_break(var2));
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 228195096;
   }

   public String id_break(String var1) {
      this.id_this();
      if (!this.aJ_()) {
         return var1;
      } else {
         boolean var2 = ((rrIk_1)this.id_byte[id_implements[16]]).id_class();
         boolean var3 = ((rrIk_1)this.id_byte[id_implements[17]]).id_class();
         if (!var2 && !var3) {
            return var1;
         } else {
            String var4 = var1.toLowerCase();
            if (var2) {
               Map var5 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_implements[18]]).id_class();
               if (!var5.isEmpty()) {
                  for (String var7 : var5.keySet()) {
                     if (var4.contains(var7)) {
                        return var4.replace(var7, (String)id_break[id_implements[19]]);
                     }
                  }
               }
            }

            if (var3) {
               String var8 = id_import.id_while().id_byte();
               String var9 = var8.toLowerCase();
               if (var4.contains(var9)) {
                  return var4.replace(var9, (String)id_break[id_implements[20]]);
               }
            }

            return var1;
         }
      }
   }

   private static void id_goto() {
      id_catch = new boolean[]{
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

   public boolean id_continue() {
      this.id_this();
      return this.aJ_() && ((rrIk_1)this.id_byte[id_implements[28]]).id_class() ? id_catch[18] : id_catch[19];
   }

   private static void id_else() {
      id_protected = new String[]{
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

   public boolean id_new() {
      this.id_this();
      return this.aJ_() && ((rrIk_1)this.id_byte[id_implements[29]]).id_class() ? id_catch[20] : id_catch[21];
   }

   private static void id_return() {
      Object[] var0 = new Object[8];
      String[] var2 = new String[]{
         id_protected[11],
         id_protected[12],
         id_protected[13],
         id_protected[14],
         id_protected[15],
         id_protected[16],
         id_protected[17],
         id_protected[18],
         id_protected[19],
         id_protected[20],
         id_protected[21],
         id_protected[22],
         id_protected[23],
         id_protected[24]
      };
      var0[0] = var2;
      var0[1] = new rgN_2(id_protected[25]);
      var0[2] = new String("Protected");
      var0[3] = Pattern.compile(id_protected[26], 2);
      var0[4] = Pattern.compile(id_protected[27], 2);
      Entry[] var3 = new Entry[]{
         Map.entry((Integer)0, id_protected[28]),
         Map.entry((Integer)1, id_protected[29]),
         Map.entry((Integer)2, id_protected[30]),
         Map.entry((Integer)3, id_protected[31]),
         Map.entry((Integer)4, id_protected[32]),
         Map.entry((Integer)5, id_protected[33]),
         Map.entry((Integer)6, id_protected[34])
      };
      var0[5] = Map.ofEntries(var3);
      Entry[] var4 = new Entry[]{
         Map.entry((Integer)0, id_protected[35]),
         Map.entry((Integer)1, id_protected[36]),
         Map.entry((Integer)2, id_protected[37]),
         Map.entry((Integer)3, id_protected[38]),
         Map.entry((Integer)4, id_protected[39])
      };
      var0[6] = Map.ofEntries(var4);
      var0[7] = rVa_1.id_class(16738740);
      id_break = var0;
   }

   public boolean id_super() {
      this.id_this();
      return this.aJ_() && ((rrIk_1)this.id_byte[id_implements[30]]).id_class() ? id_catch[22] : id_catch[23];
   }

   private static void id_try() {
      id_private = new byte[]{
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

   private static void id_while() {
      id_implements = new short[]{3, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 5, 1, 2, 1, 0, 0, 2, 2, 1, 0, 0, 2, 2, 2, 0, 3, 4, 5, 255, 255, 255};
   }

   private static void id_public() {
      id_throws = new int[]{16738740};
   }

   public boolean id_protected(String var1) {
      this.id_this();
      return this.aJ_() && ((rrIk_1)this.id_byte[id_implements[26]]).id_class()
         ? Arrays.<String>stream((String[])id_break[id_implements[27]]).anyMatch(var1x -> var1.startsWith("/" + var1x))
         : id_catch[17];
   }
}
