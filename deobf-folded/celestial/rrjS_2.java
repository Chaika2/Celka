package celestial;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjS_2 implements MinecraftAccessor {
   private static String[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public static Object[] id_class;

   public static boolean id_byte() {
      return id_break(id_break[9]);
   }

   public static boolean id_byte(rdn_3 var0) {
      return var0.id_break() == rdy_3.K ? true : id_throws[6];
   }

   private static List<? extends rrjx_3> id_byte(String var0) {
      List var1 = id_private();
      return ((rrjs_3)var1.get(id_throws[13])).id_class().equalsIgnoreCase(var0) ? var1 : null;
   }

   static {
      ntfClinit();
   }

   private static int id_class(List<? extends rrjx_3> var0, PI var1) {
      if (var1 != null && var1.id_class() != null) {
         String var2 = var1.id_class().id_class();
         String var3 = var1.id_break();
         int var4 = -1;

         for (int var5 = id_throws[11]; var5 < var0.size(); var5++) {
            rrjx_3 var6 = (rrjx_3)var0.get(var5);
            if (String.valueOf(var6.id_break()).equals(var3)) {
               String[] var7 = var6.id_byte();
               int var8 = var7.length;

               for (int var9 = id_throws[12]; var9 < var8; var9++) {
                  String var10 = var7[var9];
                  if (var10.equalsIgnoreCase(var2)) {
                     var4 = var5;
                     break;
                  }
               }
            }

            if (var4 != -1) {
               break;
            }
         }

         return var4;
      } else {
         return -1;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 36, 115, -107, -3, 25, 74, -103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 57802590;
   }

   public static boolean id_class(rdn_3 var0, xd_3 var1, rfH_2 var2, rpr_3 var3) {
      if (var3 != rpr_3.UP) {
         return id_throws[3];
      } else {
         if (var0.id_break() instanceof rxJ_2 var4 && ((Predicate)id_class[10]).test(var4.id_catch())) {
            return id_throws[4];
         }

         return ((Predicate)id_class[10]).test(var1);
      }
   }

   public static rrjx_3 id_class(PI var0) {
      if (var0 != null && var0.id_class() != null) {
         Pf_1 var1 = var0.id_class();
         if (var1 == (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[2]) {
            return null;
         } else {
            String var2 = var0.id_break();
            String var3 = var1.id_class();
            List var4 = id_byte(var3);
            if (var4 != null && !var4.isEmpty()) {
               for (rrjx_3 var6 : var4) {
                  if (String.valueOf(var6.id_break()).equals(var2)) {
                     String[] var7 = var6.id_byte();
                     int var8 = var7.length;

                     for (int var9 = id_throws[10]; var9 < var8; var9++) {
                        String var10 = var7[var9];
                        if (var10.equalsIgnoreCase(var3)) {
                           return var6;
                        }
                     }
                  }
               }

               return null;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public static boolean id_class() {
      return id_break(id_break[10]);
   }

   public static rrjx_3 id_class(PI var0, int var1) {
      if (var0 != null && var0.id_class() != null && var1 != 0) {
         Pf_1 var2 = var0.id_class();
         if (var2 == (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[2]) {
            return null;
         } else {
            String var3 = var2.id_class();
            List var4 = id_byte(var3);
            if (var4 != null && !var4.isEmpty()) {
               int var5 = id_class(var4, var0);
               if (var5 != -1) {
                  int var6 = (var5 + var1) % var4.size();
                  return (rrjx_3)var4.get(var6);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6800947573963624066L;
   }

   public static List<FuntimeEnchantment> id_class(rdn_3 var0) {
      if (var0.id_protected(id_break[3])) {
         ArrayList var7 = new ArrayList();
         String var8 = var0.id_package().id_native(id_break[4]);
         var7.add(new FuntimeEnchantment(var8, 1));
         return var7;
      } else if (!var0.id_protected(id_break[5])) {
         return null;
      } else {
         ArrayList var1 = new ArrayList();
         rcy_3 var2 = var0.id_package().id_protected(id_break[6], 10);

         for (int var3 = id_throws[8]; var3 < var2.size(); var3++) {
            rcd_3 var4 = var2.id_class(var3);
            String var5 = var4.id_native(id_break[7]);
            int var6 = var4.id_private(id_break[8]);
            var1.add(new FuntimeEnchantment(var5, var6));
         }

         return var1;
      }
   }

   public static List<? extends rrjx_3> id_break(PI var0, int var1) {
      if (var0 != null && var0.id_class() != null && var1 != 0) {
         Pf_1 var2 = var0.id_class();
         if (var2 == (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[2]) {
            return null;
         } else {
            String var3 = var2.id_class();
            List var4 = id_byte(var3);
            if (var4 != null && !var4.isEmpty()) {
               int var5 = id_class(var4, var0);
               if (var5 == -1) {
                  return null;
               } else {
                  ArrayList var6 = new ArrayList();
                  int var7 = var4.size();

                  for (int var8 = 1; var8 <= var1; var8++) {
                     int var9 = (var5 + var8) % var7;
                     var6.add((rrjx_3)var4.get(var9));
                  }

                  return var6;
               }
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public static boolean id_break(rdn_3 var0) {
      if (var0.id_break() != rdy_3.dJ) {
         return id_throws[2];
      } else {
         return !var0.id_protected(id_break[0]) && !var0.id_protected(id_break[1]) ? id_throws[1] : true;
      }
   }

   public static boolean id_break(String var0) {
      if ((gm_3)id_import.id_class[56] == null) {
         return id_throws[14];
      } else {
         rqM_2 var1 = ((gm_3)id_import.id_class[56]).E();
         if (var1 == null) {
            return id_throws[15];
         } else {
            rqO_2 var2 = var1.id_class();
            return var2 == null ? id_throws[16] : var0.equals(var2.id_break());
         }
      }
   }

   public static an_3 id_break() {
      an_3 var0 = null;

      for (an_3 var2 : ((gm_3)id_import.id_class[56]).id_byte()) {
         if (var2.BC() == aI_2.id_break) {
            String var3 = var2.L_().getString();
            if (var3.equals(id_break[2])) {
               var0 = var2;
               break;
            }
         }
      }

      return var0;
   }

   private static void id_throws() {
      id_protected = new byte[]{
         10,
         -1,
         -1,
         -1,
         -1,
         -1,
         -46,
         87,
         22,
         -67,
         77,
         2,
         3,
         28,
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
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         4,
         50,
         101,
         102,
         2,
         103,
         3,
         104,
         4,
         105,
         5,
         106,
         6,
         107,
         7,
         108,
         8,
         109,
         9,
         110,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         5,
         6,
         7,
         8,
         9,
         10,
         4,
         6,
         5,
         7,
         8,
         6,
         8,
         7,
         11
      };
   }

   private static void id_finally() {
      id_throws = new boolean[]{
         true,
         false,
         false,
         false,
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
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true
      };
   }

   private static void id_catch() {
      id_byte = new short[]{
         10,
         10,
         56,
         2,
         2,
         2,
         1,
         4,
         7,
         6,
         56,
         56,
         1,
         4,
         19,
         1001,
         1002,
         1003,
         1004,
         2001,
         2002,
         2003,
         2004,
         2005,
         2006,
         2007,
         2008,
         2009,
         2010,
         2011,
         2012,
         3001,
         3002,
         3003,
         3004,
         3005,
         3006,
         5001,
         5002,
         5003,
         6001,
         6002,
         6003,
         201,
         202,
         203,
         204,
         205,
         206,
         207,
         208,
         209,
         210,
         211,
         212,
         213,
         214,
         215,
         216,
         217,
         218,
         219,
         220,
         301,
         302,
         303,
         304,
         305,
         306,
         307,
         308,
         501,
         502,
         503,
         504,
         505,
         506,
         601,
         602,
         603,
         604,
         605,
         606
      };
   }

   private static void id_case() {
      id_break = new String[]{
         new String("don-item"),
         new String("tslevel"),
         new String("⚒ Авто-Шахта ⚒"),
         new String("spooky-item"),
         new String("spooky-item"),
         new String("custom-enchantments"),
         new String("custom-enchantments"),
         new String("type"),
         new String("level"),
         new String("duels"),
         new String("lobby"),
         new String("Время боя: "),
         new String("Противник: "),
         new String("Следующая: (.*)"),
         new String("(\\d{2}):(\\d{2})")
      };
   }

   private static void id_implements() {
      Object[] var0 = new Object[11];
      var0[0] = new Gson();
      var0[1] = new rfl_3(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      var0[2] = Pattern.compile(id_break[13], 0);
      var0[3] = Pattern.compile(id_break[14]);
      Object[] var2 = new Object[]{
         1001,
         1002,
         1003,
         1004,
         2001,
         2002,
         2003,
         2004,
         2005,
         2006,
         2007,
         2008,
         2009,
         2010,
         2011,
         2012,
         3001,
         3002,
         3003,
         3004,
         3005,
         3006,
         5001,
         5002,
         5003,
         6001,
         6002,
         6003
      };
      var0[4] = List.of(var2);
      Integer[] var3 = new Integer[]{
         101,
         102,
         103,
         104,
         105,
         106,
         107,
         108,
         109,
         110,
         201,
         202,
         203,
         204,
         205,
         206,
         207,
         208,
         209,
         210,
         211,
         212,
         213,
         214,
         215,
         216,
         217,
         218,
         219,
         220,
         301,
         302,
         303,
         304,
         305,
         306,
         307,
         308,
         501,
         502,
         503,
         504,
         505,
         506,
         601,
         602,
         603,
         604,
         605,
         606
      };
      var0[5] = List.of(var3);
      ArrayList var4 = new ArrayList(33);
      var4.add(new rrjs_3(1001));
      var4.add(new rrjs_3(1002));
      var4.add(new rrjs_3(1003));
      var4.add(new rrjs_3(1004));
      var4.add(new rrjs_3(2001));
      var4.add(new rrjs_3(2002));
      var4.add(new rrjs_3(2003));
      var4.add(new rrjs_3(2004));
      var4.add(new rrjs_3(2005));
      var4.add(new rrjs_3(2006));
      var4.add(new rrjs_3(2007));
      var4.add(new rrjs_3(2008));
      var4.add(new rrjs_3(2009));
      var4.add(new rrjs_3(2010));
      var4.add(new rrjs_3(2011));
      var4.add(new rrjs_3(2012));
      var4.add(new rrjs_3(3001));
      var4.add(new rrjs_3(3002));
      var4.add(new rrjs_3(3003));
      var4.add(new rrjs_3(3004));
      var4.add(new rrjs_3(3005));
      var4.add(new rrjs_3(3006));
      var4.add(new rrjs_3(5001));
      var4.add(new rrjs_3(5002));
      var4.add(new rrjs_3(5003));
      var4.add(new rrjs_3(6001));
      var4.add(new rrjs_3(6002));
      var4.add(new rrjs_3(6003));
      var0[6] = var4;
      ArrayList var5 = new ArrayList(73);
      var5.add(new rrjs_3(101));
      var5.add(new rrjs_3(102));
      var5.add(new rrjs_3(103));
      var5.add(new rrjs_3(104));
      var5.add(new rrjs_3(105));
      var5.add(new rrjs_3(106));
      var5.add(new rrjs_3(107));
      var5.add(new rrjs_3(108));
      var5.add(new rrjs_3(109));
      var5.add(new rrjs_3(110));
      var5.add(new rrjs_3(201));
      var5.add(new rrjs_3(202));
      var5.add(new rrjs_3(203));
      var5.add(new rrjs_3(204));
      var5.add(new rrjs_3(205));
      var5.add(new rrjs_3(206));
      var5.add(new rrjs_3(207));
      var5.add(new rrjs_3(208));
      var5.add(new rrjs_3(209));
      var5.add(new rrjs_3(210));
      var5.add(new rrjs_3(211));
      var5.add(new rrjs_3(212));
      var5.add(new rrjs_3(213));
      var5.add(new rrjs_3(214));
      var5.add(new rrjs_3(215));
      var5.add(new rrjs_3(216));
      var5.add(new rrjs_3(217));
      var5.add(new rrjs_3(218));
      var5.add(new rrjs_3(219));
      var5.add(new rrjs_3(220));
      var5.add(new rrjs_3(301));
      var5.add(new rrjs_3(302));
      var5.add(new rrjs_3(303));
      var5.add(new rrjs_3(304));
      var5.add(new rrjs_3(305));
      var5.add(new rrjs_3(306));
      var5.add(new rrjs_3(307));
      var5.add(new rrjs_3(308));
      var5.add(new rrjs_3(501));
      var5.add(new rrjs_3(502));
      var5.add(new rrjs_3(503));
      var5.add(new rrjs_3(504));
      var5.add(new rrjs_3(505));
      var5.add(new rrjs_3(506));
      var5.add(new rrjs_3(601));
      var5.add(new rrjs_3(602));
      var5.add(new rrjs_3(603));
      var5.add(new rrjs_3(604));
      var5.add(new rrjs_3(605));
      var5.add(new rrjs_3(606));
      var0[7] = var5;
      Object[] var6 = new Object[]{
         new rrjs_3(1001),
         new rrjs_3(1002),
         new rrjs_3(1003),
         new rrjs_3(1004),
         new rrjs_3(2001),
         new rrjs_3(2002),
         new rrjs_3(2003),
         new rrjs_3(2004),
         new rrjs_3(2005),
         new rrjs_3(2006),
         new rrjs_3(2007),
         new rrjs_3(2008),
         new rrjs_3(2009),
         new rrjs_3(2010),
         new rrjs_3(2011),
         new rrjs_3(2012),
         new rrjs_3(3001),
         new rrjs_3(3002),
         new rrjs_3(3003),
         new rrjs_3(3004),
         new rrjs_3(3005),
         new rrjs_3(3006),
         new rrjs_3(5001),
         new rrjs_3(5002),
         new rrjs_3(5003),
         new rrjs_3(6001),
         new rrjs_3(6002),
         new rrjs_3(6003),
         new rrjs_3(101),
         new rrjs_3(102),
         new rrjs_3(103),
         new rrjs_3(104),
         new rrjs_3(105),
         new rrjs_3(106),
         new rrjs_3(107),
         new rrjs_3(108),
         new rrjs_3(109),
         new rrjs_3(110),
         new rrjs_3(201),
         new rrjs_3(202),
         new rrjs_3(203),
         new rrjs_3(204),
         new rrjs_3(205),
         new rrjs_3(206),
         new rrjs_3(207),
         new rrjs_3(208),
         new rrjs_3(209),
         new rrjs_3(210),
         new rrjs_3(211),
         new rrjs_3(212),
         new rrjs_3(213),
         new rrjs_3(214),
         new rrjs_3(215),
         new rrjs_3(216),
         new rrjs_3(217),
         new rrjs_3(218),
         new rrjs_3(219),
         new rrjs_3(220),
         new rrjs_3(301),
         new rrjs_3(302),
         new rrjs_3(303),
         new rrjs_3(304),
         new rrjs_3(305),
         new rrjs_3(306),
         new rrjs_3(307),
         new rrjs_3(308),
         new rrjs_3(501),
         new rrjs_3(502),
         new rrjs_3(503),
         new rrjs_3(504),
         new rrjs_3(505),
         new rrjs_3(506),
         new rrjs_3(601),
         new rrjs_3(602),
         new rrjs_3(603),
         new rrjs_3(604),
         new rrjs_3(605),
         new rrjs_3(606)
      };
      ArrayList var7 = new ArrayList(78);
      var7.clear();
      var7.addAll(Arrays.asList(var6));
      var0[8] = var7;
      var0[9] = new ArrayList();
      var0[10] = (Predicate<xd_3>)var0x -> !(var0x instanceof zG_2) && !(var0x instanceof Wg_1) && !(var0x instanceof xC_2) ? id_throws[25] : true;
      id_class = var0;
   }

   public static boolean id_protected() {
      if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         return id_throws[17];
      } else {
         boolean var0 = id_throws[18];
         boolean var1 = id_throws[19];

         for (String var3 : ((cq_3)id_import.id_class[19]).id_new()) {
            if (var3.contains(id_break[11])) {
               var0 = true;
            } else if (var3.contains(id_break[12])) {
               var1 = true;
            }

            if (var0 && var1) {
               return true;
            }
         }

         return id_throws[23];
      }
   }

   private static List<rrjs_3> id_private() {
      return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] ? (List)id_class[7] : (List)id_class[6];
   }
}
