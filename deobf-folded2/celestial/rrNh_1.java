package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrNh_1 {
   private static boolean[] booleansfb3637209df43f25b1ac5845136e2aa5;
   private static short[] shortsfb3637209df43f25b1ac5845136e2aa5;
   private static String[] stringsfb3637209df43f25b1ac5845136e2aa5;
   private static int[] integersfb3637209df43f25b1ac5845136e2aa5;
   public static Object[] staticFieldsfb3637209df43f25b1ac5845136e2aa5;
   private static byte[] bytesfb3637209df43f25b1ac5845136e2aa5;
   public Object[] fieldsfb3637209df43f25b1ac5845136e2aa5;

   public Optional<rrNd_1> id_byte(String var1) {
      return ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]).stream().filter(var1x -> var1x.id_case().equalsIgnoreCase(var1)).findFirst();
   }

   public rrfq_3 id_byte() {
      rrfq_3 var1 = (rrfq_3)rrfp_3.id_class[1];
      if (var1 != null && ((Set)this.fieldsfb3637209df43f25b1ac5845136e2aa5[4]).contains(var1)) {
         return var1;
      } else {
         return ((Set)this.fieldsfb3637209df43f25b1ac5845136e2aa5[4]).isEmpty()
            ? null
            : (rrfq_3)((Set)this.fieldsfb3637209df43f25b1ac5845136e2aa5[4]).iterator().next();
      }
   }

   private static void id_int() {
      integersfb3637209df43f25b1ac5845136e2aa5 = new int[]{
         1000000,
         1000000,
         1000000,
         1000000,
         1000000,
         500000,
         100000,
         50000,
         100000,
         400000,
         100000,
         2000000,
         500000,
         2000000,
         1000000,
         2000000,
         1000000,
         1000000,
         1000000,
         500000,
         1500000,
         1500000,
         1500000,
         1500000,
         1000000,
         1000000,
         1000000,
         1000000,
         400000,
         200000,
         10000000,
         10000000,
         1000000,
         1000000,
         1000000,
         1000000,
         1000000,
         1000000,
         1000000,
         1000000,
         1000000,
         500000,
         500000,
         100000,
         1000000,
         1000000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         1000000,
         100000,
         100000,
         100000,
         100000,
         100000,
         100000,
         1000000,
         500000,
         100000,
         1000000,
         500000,
         100000,
         1000000,
         50000,
         50000,
         100000,
         1000000,
         100000,
         100000,
         300000,
         100000,
         100000,
         400000,
         100000,
         100000,
         50000,
         100000,
         100000,
         100000
      };
   }

   private rrNh_1() {
      this.id_while();
      ArrayList var7 = new ArrayList();
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[0] = var7;
      LinkedList var8 = new LinkedList();
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[1] = var8;
      EnumMap var9 = new EnumMap<>(rrfq_3.class);
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[2] = var9;
      ArrayList var10 = new ArrayList();
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[3] = var10;
      LinkedHashSet var11 = new LinkedHashSet();
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[4] = var11;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      shortsfb3637209df43f25b1ac5845136e2aa5 = new short[]{
         1,
         0,
         1,
         2,
         3,
         4,
         5,
         2,
         4,
         7,
         7,
         4,
         1,
         2,
         4,
         1600,
         14,
         3,
         30,
         3,
         31,
         3,
         32,
         3,
         32,
         13,
         2,
         13,
         1,
         13,
         0,
         14,
         14,
         30000,
         14,
         14,
         10000,
         14,
         4,
         30000,
         14,
         14,
         6,
         30000,
         14,
         0,
         28,
         0,
         28,
         0,
         35,
         0,
         33,
         3,
         29,
         3,
         30,
         3,
         31,
         3,
         32,
         3,
         1,
         24,
         1,
         25,
         1,
         26,
         1,
         27,
         1,
         24,
         1,
         25,
         1,
         26,
         1,
         27,
         2,
         34,
         6,
         2,
         4,
         8,
         1,
         4,
         9,
         0,
         4,
         10,
         2,
         4,
         11,
         3,
         4,
         12,
         4,
         4,
         13,
         5,
         4,
         14,
         6,
         4,
         15,
         7,
         5,
         16,
         0,
         5,
         17,
         1,
         5,
         18,
         2,
         5,
         19,
         3,
         5,
         20,
         4,
         5,
         21,
         5,
         5,
         22,
         6,
         5,
         23,
         7,
         9,
         36,
         0,
         9,
         37,
         1,
         9,
         38,
         2,
         9,
         39,
         3,
         9,
         40,
         4,
         9,
         41,
         5,
         9,
         42,
         6,
         6,
         6,
         6,
         6,
         6,
         7,
         7,
         7,
         1000,
         8,
         43,
         0,
         1000,
         8,
         44,
         1,
         1000,
         8,
         45,
         2,
         1000,
         8,
         46,
         3,
         1000,
         8,
         47,
         4,
         1000,
         8,
         48,
         5,
         10,
         53,
         10,
         49,
         10,
         51,
         10,
         50,
         10,
         52,
         12,
         58,
         12,
         59,
         11,
         55,
         0,
         11,
         56,
         1,
         11,
         57,
         2,
         13,
         2,
         13,
         1,
         13,
         0,
         14,
         14,
         14,
         14,
         14,
         14,
         14,
         5000,
         14,
         14,
         14,
         14,
         30000,
         14,
         14,
         10000,
         4,
         14,
         30000,
         14,
         30000,
         14,
         6,
         14,
         7,
         14,
         14,
         5000,
         14,
         1600,
         14,
         10000,
         14,
         10000,
         14,
         5000,
         14,
         14,
         14,
         14,
         1000,
         14,
         0,
         3,
         0,
         3,
         3,
         1,
         1,
         2,
         1,
         1,
         0,
         7,
         4,
         1,
         1,
         1,
         2,
         2,
         1,
         2,
         1,
         4,
         4,
         4,
         1,
         2,
         7,
         1,
         0,
         1,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         0
      };
   }

   public void id_class(boolean var1) {
      this.id_final().ifPresent(var1x -> var1x.id_class(var1));
   }

   public void id_class(rrNO var1) {
      ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[0]).add(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1339983691;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4075536508379548611L;
   }

   public void id_class(rrNd_1 var1) {
      ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]).removeIf(var1x -> var1x == var1 ? true : booleansfb3637209df43f25b1ac5845136e2aa5[353]);
      if (var1.id_finally() != null) {
         List var2 = (List)((Map)this.fieldsfb3637209df43f25b1ac5845136e2aa5[2]).get(var1.id_finally());
         if (var2 != null) {
            var2.removeIf(var1x -> var1x == var1 ? true : booleansfb3637209df43f25b1ac5845136e2aa5[351]);
         }
      }
   }

   public void id_class(C_class var1) {
      rrNW var6;
      rrNW var10001 = var6 = new rrNW(var1);
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[5] = var6;
      this.id_class(var10001);
      this.id_class(new rrNf_1());
      this.id_break((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]);
      this.id_return();
      this.id_break((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]);
      this.id_public();
      this.id_continue();
      Object var7 = null;
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[7] = var7;
   }

   public void id_class() {
      this.id_final().ifPresent(rrNO::id_implements);
   }

   public boolean id_class(rrfq_3 var1, String var2) {
      if (var1 != null && var2 != null) {
         for (rrNd_1 var4 : (List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]) {
            if (var4.id_finally() == var1 && var2.equalsIgnoreCase(var4.id_case())) {
               this.id_class(var4);
               return true;
            }
         }

         return booleansfb3637209df43f25b1ac5845136e2aa5[349];
      } else {
         return booleansfb3637209df43f25b1ac5845136e2aa5[347];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, 119, -84, -120, 84, -43, -86, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrNj_1 var1) {
      ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[3]).add(var1);
   }

   public List<rrNd_1> id_class(List<String> var1) {
      ArrayList var2 = new ArrayList();

      for (rrNd_1 var4 : (List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]) {
         for (String var6 : var4.id_private()) {
            if (var1.contains(var6)) {
               var2.add(var4);
            }
         }
      }

      return var2;
   }

   public void id_break(rrNd_1 var1) {
      if (var1.id_finally() == null) {
         var1.id_class((rrfq_3)this.fieldsfb3637209df43f25b1ac5845136e2aa5[7]);
      }

      rrfq_3 var2 = var1.id_finally();
      String var3 = var1.id_case();
      if (var2 != null) {
         ((Set)this.fieldsfb3637209df43f25b1ac5845136e2aa5[4]).add(var2);
      }

      if (var2 != null && var3 != null) {
         for (int var4 = 0; var4 < ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]).size(); var4++) {
            rrNd_1 var5 = (rrNd_1)((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]).get(var4);
            if (var5.id_finally() == var2 && var3.equals(var5.id_case())) {
               ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]).set(var4, var1);
               List var6 = (List)((Map)this.fieldsfb3637209df43f25b1ac5845136e2aa5[2]).get(var2);
               if (var6 != null) {
                  int var7 = var6.indexOf(var5);
                  if (var7 >= 0) {
                     var6.set(var7, var1);
                  } else {
                     var6.add(var1);
                  }
               } else {
                  ((Map)this.fieldsfb3637209df43f25b1ac5845136e2aa5[2]).computeIfAbsent(var2, var0 -> new ArrayList<>()).add(var1);
               }

               return;
            }
         }
      }

      ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]).add(var1);
      if (var2 != null) {
         ((Map)this.fieldsfb3637209df43f25b1ac5845136e2aa5[2]).computeIfAbsent(var2, var0 -> new ArrayList<>()).add(var1);
      }
   }

   public Optional<rrNd_1> id_break(String var1) {
      if (var1 == null) {
         return Optional.empty();
      } else {
         int var2 = var1.indexOf(58);
         if (var2 < 0) {
            return this.id_byte(var1);
         } else {
            String var3 = var1.substring(0, var2);
            String var4 = var1.substring(var2 + 1);

            rrfq_3 var5;
            try {
               var5 = rrfq_3.valueOf(var3);
            } catch (IllegalArgumentException var8) {
               return this.id_byte(var1);
            }

            for (rrNd_1 var7 : (List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]) {
               if (var7.id_finally() == var5 && var4.equalsIgnoreCase(var7.id_case())) {
                  return Optional.of(var7);
               }
            }

            return Optional.empty();
         }
      }
   }

   public rrNd_1 id_break() {
      return (rrNd_1)this.fieldsfb3637209df43f25b1ac5845136e2aa5[6];
   }

   private void id_break(rrfq_3 var1) {
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[7] = var1;
      ((Set)this.fieldsfb3637209df43f25b1ac5845136e2aa5[4]).add(var1);
   }

   public rrNW id_throws() {
      return (rrNW)this.fieldsfb3637209df43f25b1ac5845136e2aa5[5];
   }

   public List<rrNj_1> id_finally() {
      return (List<rrNj_1>)this.fieldsfb3637209df43f25b1ac5845136e2aa5[3];
   }

   public Map<rrfq_3, List<rrNd_1>> id_catch() {
      return (Map<rrfq_3, List<rrNd_1>>)this.fieldsfb3637209df43f25b1ac5845136e2aa5[2];
   }

   public List<rrNd_1> id_extends() {
      return (List<rrNd_1>)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1];
   }

   public Set<rrfq_3> id_case() {
      return (Set<rrfq_3>)this.fieldsfb3637209df43f25b1ac5845136e2aa5[4];
   }

   private void id_continue() {
      this.id_protected("Мотыга Озеленитель");
      this.id_protected("Книга на магнит");
      this.id_protected("Книга на подводную ходьбу 5");
      this.id_protected("Процессор");
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.xe)
            .id_protected(1600)
            .id_byte(Arrays.asList("Опыт", "Пузырек опыта"))
            .id_break("Опыт Обычный")
            .id_byte("Опыт")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OY)
            .id_protected(1000000)
            .id_byte(Arrays.asList("Кирка мега-бульдозер", "Молот Тора"))
            .id_break("Молот Тора")
            .id_byte("Кирка мега-бульдозер")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class(
               ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[30])
                  .id_break()
                  .id_class()
                  .id_implements()
                  .id_class(new rgN_2("Кирка мега-бульдозер"))
            )
            .id_class()
            .id_class(FuntimeEnchantment.id_class("radius-item-mega-buldozer"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OC)
            .id_protected(1000000)
            .id_implements("Божье Касание")
            .id_break("Божье Касание")
            .id_byte("Божье Касание")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class(false)
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[31]).id_break().id_class())
            .id_class(FuntimeEnchantment.id_class("spawner-item-spawner-break"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OC)
            .id_protected(1000000)
            .id_implements("Мощный Удар")
            .id_break("Мощный Удар")
            .id_byte("Мощный Удар")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class(false)
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[32]).id_break().id_class())
            .id_class(FuntimeEnchantment.id_class("bedrock-item-bedrock-break"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OC)
            .id_protected(1000000)
            .id_implements("Мощный Удар")
            .id_break("Мощный Удар")
            .id_byte("Мощный Удар")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class(false)
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[32]).id_break().id_class())
            .id_class(FuntimeEnchantment.id_class("bedrock-item-bedrock-break"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OB)
            .id_protected(1000000)
            .id_byte(Arrays.asList("Прогрузчик чанков", "Прогрузчик чанков 5x5", "Блок Чанкер", "Блок-конструктор"))
            .id_break("Прогрузчик чанков 5x5")
            .id_byte("Прогрузчик чанков 5x5")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[13])
            .id_class()
            .id_class(new rdn_3(rdy_3.OB).id_class(new rgN_2("Прогрузчик чанков 5x5")))
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcS_2((rrfs_3)rrfs_3.staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[2]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OB)
            .id_protected(500000)
            .id_byte(Arrays.asList("Прогрузчик чанков", "Прогрузчик чанков 3x3", "Блок Чанкер", "Блок-конструктор"))
            .id_break("Прогрузчик чанков 3x3")
            .id_byte("Прогрузчик чанков 3x3")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[13])
            .id_class()
            .id_class(new rdn_3(rdy_3.OB).id_class(new rgN_2("Прогрузчик чанков 3x3")))
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcS_2((rrfs_3)rrfs_3.staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[1]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OB)
            .id_protected(100000)
            .id_byte(Arrays.asList("Прогрузчик чанков", "Прогрузчик чанков 1x1", "Блок Чанкер", "Блок-конструктор"))
            .id_break("Прогрузчик чанков 1x1")
            .id_byte("Прогрузчик чанков 1x1")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[13])
            .id_class()
            .id_class(new rdn_3(rdy_3.OB).id_class(new rgN_2("Прогрузчик чанков 1x1")))
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcS_2((rrfs_3)rrfs_3.staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[0]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Pz)
            .id_protected(50000)
            .id_implements("Таер вайт")
            .id_break("Таер Вайт")
            .id_byte("Таер вайт")
            .id_class(new rdn_3(rdy_3.Pz, 1).id_class(new rgN_2("Таер Вайт")))
            .id_class(FuntimeEnchantment.id_class("tnt-item-white"))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Pz)
            .id_protected(100000)
            .id_implements("Таер блэк")
            .id_break("Таер Блэк")
            .id_byte("Таер блэк")
            .id_class(new rdn_3(rdy_3.Pz, 1).id_class(new rgN_2("Таер Блэк")))
            .id_class(FuntimeEnchantment.id_class("tnt-item-black"))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.JT)
            .id_protected(30000)
            .id_implements("Дезориентация")
            .id_break("Дезориентация")
            .id_byte("Дезориентация")
            .id_class(new rdn_3(rdy_3.JT, 1).id_class(new rgN_2("Дезориентация")))
            .id_class(FuntimeEnchantment.id_class("effect-item-diz"))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OW)
            .id_protected(400000)
            .id_implements("Трапка")
            .id_break("Трапка")
            .id_byte("Трапка")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class(new rdn_3(rdy_3.OW).id_class(new rgN_2("Трапка")))
            .id_class(FuntimeEnchantment.id_class("schematic-item-trap"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Jd)
            .id_protected(10000)
            .id_implements("Пласт")
            .id_break("Пласт")
            .id_byte("Пласт")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[4]).id_break().id_class())
            .id_class(FuntimeEnchantment.id_class("schematic-item-plast"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.XY)
            .id_protected(30000)
            .id_implements("Явная пыль")
            .id_break("Явная пыль")
            .id_byte("Явная пыль")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class(new rdn_3(rdy_3.XY, 1).id_class(new rgN_2("Явная пыль")))
            .id_class(FuntimeEnchantment.id_class("effect-item-dust"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.ko)
            .id_protected(100000)
            .id_implements("Божья аура")
            .id_break("Божья аура")
            .id_byte("Божья аура")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[6]).id_break().id_class())
            .id_class(FuntimeEnchantment.id_class("effect-item-god"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hU)
            .id_protected(30000)
            .id_implements("Снежок заморозка")
            .id_break("Снежок заморозка")
            .id_byte("Снежок заморозка")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class(new rdn_3(rdy_3.hU, 1).id_class(new rgN_2("Снежок заморозка")))
            .id_class(FuntimeEnchantment.id_class("effect-item-snowball"))
            .id_class()
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
   }

   private static void id_else() {
      bytesfb3637209df43f25b1ac5845136e2aa5 = new byte[]{
         2,
         4,
         2,
         3,
         2,
         6,
         2,
         3,
         4,
         5,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         7,
         3,
         2,
         2,
         3,
         5,
         4,
         5,
         2,
         3,
         4,
         7,
         2,
         3,
         4,
         5,
         6,
         4,
         7,
         5,
         2,
         3,
         3,
         7,
         2,
         3,
         4,
         5,
         6,
         6,
         2,
         2,
         5,
         3,
         4,
         7,
         5,
         5,
         10,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         7,
         2,
         3,
         4,
         5,
         6,
         5,
         2,
         5,
         3,
         3,
         4,
         3,
         7,
         2,
         3,
         4,
         5,
         6,
         3,
         10,
         5,
         2,
         6,
         2,
         3,
         4,
         5,
         7,
         2,
         3,
         4,
         5,
         6,
         2,
         2,
         6,
         2,
         3,
         4,
         5,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         3,
         6,
         2,
         3,
         4,
         5,
         8,
         5,
         5,
         2,
         5,
         3,
         5,
         4,
         3,
         5,
         5,
         6,
         7,
         2,
         7,
         2,
         3,
         4,
         5,
         6,
         6,
         5,
         5,
         2,
         5,
         3,
         5,
         4,
         5,
         5,
         2,
         7,
         2,
         3,
         4,
         5,
         6,
         2,
         6,
         5,
         5,
         2,
         5,
         3,
         5,
         4,
         5,
         5,
         2,
         7,
         2,
         3,
         4,
         5,
         6,
         9,
         5,
         5,
         2,
         5,
         3,
         5,
         4,
         5,
         5,
         4,
         6,
         3,
         7,
         3,
         8,
         2,
         7,
         2,
         3,
         4,
         5,
         6,
         4,
         5,
         5,
         2,
         5,
         3,
         2,
         7,
         2,
         3,
         4,
         5,
         6,
         4,
         5,
         5,
         2,
         5,
         3,
         2,
         7,
         2,
         3,
         4,
         5,
         6,
         4,
         5,
         5,
         2,
         5,
         3,
         2,
         7,
         2,
         3,
         4,
         5,
         6,
         5,
         5,
         5,
         2,
         5,
         3,
         3,
         4,
         2,
         7,
         2,
         3,
         4,
         5,
         6,
         2,
         5,
         6,
         2,
         3,
         4,
         5,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         2,
         5,
         2,
         3,
         4,
         2,
         5,
         2,
         3,
         4,
         2,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         3,
         2,
         5,
         2,
         3,
         4,
         2,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         2,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         5,
         2,
         3,
         4,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         4,
         2,
         3,
         2,
         4,
         2,
         3,
         58,
         8,
         2
      };
   }

   public rrfq_3 id_implements() {
      return (rrfq_3)this.fieldsfb3637209df43f25b1ac5845136e2aa5[7];
   }

   private static void id_new() {
      booleansfb3637209df43f25b1ac5845136e2aa5 = new boolean[]{
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
         true,
         false,
         false,
         true,
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
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
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
         true,
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
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
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
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
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
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
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
         true
      };
   }

   public boolean id_package() {
      return this.id_final().map(rrNO::id_case).orElse(false);
   }

   private void id_return() {
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Og)
            .id_protected(2000000)
            .id_implements("Меч Крушителя")
            .id_break("Меч Крушителя")
            .id_byte("Меч Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[0])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[28]).id_break().id_class())
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_volatile, 7),
                  rrfA_2.id_class(eY_2.id_synchronized, 3),
                  rrfA_2.id_class(eY_2.id_new, 2),
                  rrfA_2.id_class(eY_2.id_continue, 5),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_break(rrfA_2.id_class(eY_2.id_int))
            .id_case(Arrays.asList("Окисление II", "Детекция III", "Яд III", "Опытный III", "Вампиризм II"))
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Og)
            .id_protected(500000)
            .id_implements("Незеритовый меч")
            .id_break("Меч для фарма криперов")
            .id_byte("Незеритовый меч")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[0])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[28]).id_break().id_class().id_class(new rgN_2("Незеритовый меч")))
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_volatile, 7),
                  rrfA_2.id_class(eY_2.id_continue, 5),
                  rrfA_2.id_class(eY_2.id_final, 3),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kY)
            .id_protected(2000000)
            .id_implements("Трезубец Крушителя")
            .id_break("Трезубец Крушителя")
            .id_byte("Трезубец Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[0])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[35]).id_break().id_class())
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_long),
                  rrfA_2.id_class(eY_2.id_new, 2),
                  rrfA_2.id_class(eY_2.id_char, 5),
                  rrfA_2.id_class(eY_2.id_import),
                  rrfA_2.id_class(eY_2.id_volatile, 7),
                  rrfA_2.id_class(eY_2.id_synchronized, 5)
               )
            )
            .id_case(
               Arrays.asList(
                  "Возвращение",
                  "Ступор III",
                  "Опытный III",
                  "Скаут III",
                  "Вампиризм II",
                  "Яд III",
                  "Подрывник",
                  "Окисление II",
                  "Детекция III",
                  "Притяжение II"
               )
            )
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kU)
            .id_protected(1000000)
            .id_implements("Арбалет Крушителя")
            .id_break("Арбалет Крушителя")
            .id_byte("Арбалет Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[0])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[33]).id_break().id_class())
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_import),
                  rrfA_2.id_class(eY_2.id_float),
                  rrfA_2.id_class(eY_2.id_static, 5),
                  rrfA_2.id_class(eY_2.id_void, 3),
                  rrfA_2.id_class(eY_2.id_synchronized, 3)
               )
            )
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OY)
            .id_protected(2000000)
            .id_implements("Кирка Крушителя")
            .id_break("Кирка Крушителя")
            .id_byte("Кирка Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[29]).id_break().id_class())
            .id_throws(Arrays.asList(rrfA_2.id_class(eY_2.id_this, 10), rrfA_2.id_class(eY_2.id_synchronized, 5), rrfA_2.id_class(eY_2.id_import)))
            .id_break(rrfA_2.id_class(eY_2.id_else))
            .id_case(Arrays.asList("Опытный III", "Магнит", "Бульдозер II", "Пингер", "Паутина", "Авто-Плавка"))
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OY)
            .id_protected(1000000)
            .id_byte(Arrays.asList("Кирка мега-бульдозер", "Молот Тора"))
            .id_break("Молот Тора")
            .id_byte("Кирка мега-бульдозер")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class(
               ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[30])
                  .id_break()
                  .id_class()
                  .id_implements()
                  .id_class(new rgN_2("Кирка мега-бульдозер"))
            )
            .id_class()
            .id_implements(Arrays.asList(FuntimeEnchantment.id_class("magnet"), FuntimeEnchantment.id_class("megabuldozing")))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OC)
            .id_protected(1000000)
            .id_implements("Божье Касание")
            .id_break("Божье Касание")
            .id_byte("Божье Касание")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class(false)
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[31]).id_break().id_class())
            .id_class(FuntimeEnchantment.id_class("spawner"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OC)
            .id_protected(1000000)
            .id_implements("Мощный Удар")
            .id_break("Мощный Удар")
            .id_byte("Мощный Удар")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class(false)
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[32]).id_break().id_class())
            .id_class(FuntimeEnchantment.id_class("bedrock"))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OK)
            .id_protected(500000)
            .id_implements("Незеритовая мотыга")
            .id_break("Мотыга Озеленитель")
            .id_byte("Незеритовая мотыга")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[3])
            .id_class()
            .id_class(new rdn_3(rdy_3.OK).id_import())
            .id_class(FuntimeEnchantment.id_class("growing", 3))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hv)
            .id_protected(1500000)
            .id_implements("Шлем Крушителя")
            .id_break("Шлем Крушителя")
            .id_byte("Шлем Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[1])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[24]).id_break().id_class())
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_class, 5),
                  rrfA_2.id_class(eY_2.id_throws, 5),
                  rrfA_2.id_class(eY_2.id_break, 5),
                  rrfA_2.id_class(eY_2.id_protected, 5),
                  rrfA_2.id_class(eY_2.id_case, 3),
                  rrfA_2.id_class(eY_2.id_synchronized, 5),
                  rrfA_2.id_class(eY_2.id_catch),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_protected(Arrays.asList(rrfA_2.id_class(eY_2.id_private), rrfA_2.id_class(eY_2.id_extends)))
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_class(new rrIk_1("Работать с шипами", false))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hF)
            .id_protected(1500000)
            .id_implements("Нагрудник Крушителя")
            .id_break("Нагрудник Крушителя")
            .id_byte("Нагрудник Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[1])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[25]).id_break().id_class())
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_class, 5),
                  rrfA_2.id_class(eY_2.id_throws, 5),
                  rrfA_2.id_class(eY_2.id_break, 5),
                  rrfA_2.id_class(eY_2.id_protected, 5),
                  rrfA_2.id_class(eY_2.id_synchronized, 5),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_protected(Arrays.asList(rrfA_2.id_class(eY_2.id_private), rrfA_2.id_class(eY_2.id_extends)))
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_class(new rrIk_1("Работать с шипами", false))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hL)
            .id_protected(1500000)
            .id_byte(Arrays.asList("Штаны Крушителя", "Поножи Крушителя"))
            .id_break("Поножи Крушителя")
            .id_byte("Поножи Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[1])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[26]).id_break().id_class())
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_class, 5),
                  rrfA_2.id_class(eY_2.id_throws, 5),
                  rrfA_2.id_class(eY_2.id_break, 5),
                  rrfA_2.id_class(eY_2.id_protected, 5),
                  rrfA_2.id_class(eY_2.id_synchronized, 5),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_protected(Arrays.asList(rrfA_2.id_class(eY_2.id_private), rrfA_2.id_class(eY_2.id_extends)))
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_class(new rrIk_1("Работать с шипами", false))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hA)
            .id_protected(1500000)
            .id_implements("Ботинки Крушителя")
            .id_break("Ботинки Крушителя")
            .id_byte("Ботинки Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[1])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[27]).id_break().id_class())
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_class, 5),
                  rrfA_2.id_class(eY_2.id_throws, 5),
                  rrfA_2.id_class(eY_2.id_break, 5),
                  rrfA_2.id_class(eY_2.id_protected, 5),
                  rrfA_2.id_class(eY_2.id_synchronized, 5),
                  rrfA_2.id_class(eY_2.id_byte, 4),
                  rrfA_2.id_class(eY_2.id_implements, 3),
                  rrfA_2.id_class(eY_2.id_native, 3),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_protected(Arrays.asList(rrfA_2.id_class(eY_2.id_private), rrfA_2.id_class(eY_2.id_extends)))
            .id_private("Попрыгун")
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_class(new rrIk_1("Работать с шипами", false))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hv)
            .id_protected(1000000)
            .id_implements("Незеритовый шлем")
            .id_break("Топовый шлем")
            .id_byte("Незеритовый шлем")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[1])
            .id_class(
               ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[24]).id_break().id_class().id_implements().id_class(new rgN_2("Незеритовый шлем"))
            )
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_class, 5),
                  rrfA_2.id_class(eY_2.id_throws, 5),
                  rrfA_2.id_class(eY_2.id_synchronized, 5),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_protected(Arrays.asList(rrfA_2.id_class(eY_2.id_private), rrfA_2.id_class(eY_2.id_extends)))
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_class(new rrIk_1("Работать с шипами", false))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hF)
            .id_protected(1000000)
            .id_implements("Незеритовый нагрудник")
            .id_break("Топовый нагрудник")
            .id_byte("Незеритовый нагрудник")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[1])
            .id_class(
               ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[25])
                  .id_break()
                  .id_class()
                  .id_implements()
                  .id_class(new rgN_2("Незеритовый нагрудник"))
            )
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_class, 5),
                  rrfA_2.id_class(eY_2.id_throws, 5),
                  rrfA_2.id_class(eY_2.id_synchronized, 5),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_protected(Arrays.asList(rrfA_2.id_class(eY_2.id_private), rrfA_2.id_class(eY_2.id_extends)))
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_class(new rrIk_1("Работать с шипами", false))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hL)
            .id_protected(1000000)
            .id_implements("Незеритовые поножи")
            .id_break("Топовые поножи")
            .id_byte("Незеритовые поножи")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[1])
            .id_class(
               ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[26])
                  .id_break()
                  .id_class()
                  .id_implements()
                  .id_class(new rgN_2("Незеритовые поножи"))
            )
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_class, 5),
                  rrfA_2.id_class(eY_2.id_throws, 5),
                  rrfA_2.id_class(eY_2.id_synchronized, 5),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_protected(Arrays.asList(rrfA_2.id_class(eY_2.id_private), rrfA_2.id_class(eY_2.id_extends)))
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_class(new rrIk_1("Работать с шипами", false))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hA)
            .id_protected(1000000)
            .id_implements("Незеритовые ботинки")
            .id_break("Топовые ботинки")
            .id_byte("Незеритовые ботинки")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[1])
            .id_class(
               ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[27])
                  .id_break()
                  .id_class()
                  .id_implements()
                  .id_class(new rgN_2("Незеритовые ботинки"))
            )
            .id_throws(
               Arrays.asList(
                  rrfA_2.id_class(eY_2.id_class, 5),
                  rrfA_2.id_class(eY_2.id_throws, 5),
                  rrfA_2.id_class(eY_2.id_synchronized, 5),
                  rrfA_2.id_class(eY_2.id_implements, 3),
                  rrfA_2.id_class(eY_2.id_import)
               )
            )
            .id_protected(Arrays.asList(rrfA_2.id_class(eY_2.id_private), rrfA_2.id_class(eY_2.id_extends)))
            .id_private("Попрыгун")
            .id_private("Нестабильный")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrct_3(), new rrcN_2()))
            .id_class(new rrIk_1("Работать с шипами", false))
            .id_break()
      );
      rrNd_1 var5;
      rrNd_1 var10001 = var5 = new rrNk_1()
         .id_class(rdy_3.kc)
         .id_protected(400000)
         .id_implements("Элитры")
         .id_break("Элитры Крушителя")
         .id_byte("Элитры")
         .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[2])
         .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[34]).id_break().id_class().id_implements().id_class(new rgN_2("Элитры")))
         .id_throws(Arrays.asList(rrfA_2.id_class(eY_2.id_import), rrfA_2.id_class(eY_2.id_synchronized, 5)))
         .id_break(rrfA_2.id_class(eY_2.id_extends))
         .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3(), new rrcN_2()))
         .id_break();
      this.fieldsfb3637209df43f25b1ac5845136e2aa5[6] = var5;
      this.id_break(var10001);
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kc)
            .id_protected(200000)
            .id_implements("Элитры")
            .id_break("Элитры")
            .id_byte("Элитры")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[2])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcz_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(10000000)
            .id_implements("Талисман Крушителя")
            .id_break("Талисман Крушителя")
            .id_byte("Талисман Крушителя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[4])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[8]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrck_3((rrfh_3)rrfh_3.staticFieldsf0292b9e212f30cb8a14c2d16461fd94[1]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(10000000)
            .id_implements("Талисман Карателя")
            .id_break("Талисман Карателя")
            .id_byte("Талисман Карателя")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[4])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[9]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrck_3((rrfh_3)rrfh_3.staticFieldsf0292b9e212f30cb8a14c2d16461fd94[0]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(1000000)
            .id_implements("Талисман Раздора")
            .id_break("Талисман Раздора")
            .id_byte("Талисман Раздора")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[4])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[10]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrck_3((rrfh_3)rrfh_3.staticFieldsf0292b9e212f30cb8a14c2d16461fd94[2]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(1000000)
            .id_implements("Талисман Тирана")
            .id_break("Талисман Тирана")
            .id_byte("Талисман Тирана")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[4])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[11]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrck_3((rrfh_3)rrfh_3.staticFieldsf0292b9e212f30cb8a14c2d16461fd94[3]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(1000000)
            .id_implements("Талисман Ярости")
            .id_break("Талисман Ярости")
            .id_byte("Талисман Ярости")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[4])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[12]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrck_3((rrfh_3)rrfh_3.staticFieldsf0292b9e212f30cb8a14c2d16461fd94[4]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(1000000)
            .id_implements("Талисман Вихря")
            .id_break("Талисман Вихря")
            .id_byte("Талисман Вихря")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[4])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[13]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrck_3((rrfh_3)rrfh_3.staticFieldsf0292b9e212f30cb8a14c2d16461fd94[5]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(1000000)
            .id_implements("Талисман Мрака")
            .id_break("Талисман Мрака")
            .id_byte("Талисман Мрака")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[4])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[14]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrck_3((rrfh_3)rrfh_3.staticFieldsf0292b9e212f30cb8a14c2d16461fd94[6]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(1000000)
            .id_implements("Талисман Демона")
            .id_break("Талисман Демона")
            .id_byte("Талисман Демона")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[4])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[15]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrck_3((rrfh_3)rrfh_3.staticFieldsf0292b9e212f30cb8a14c2d16461fd94[7]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dJ)
            .id_protected(1000000)
            .id_implements("Сфера Хаоса")
            .id_break("Сфера Хаоса")
            .id_byte("Сфера Хаоса")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[5])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[16]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcX_2((rrfM_2)rrfM_2.staticFields869ba89e075331349de8f9288d544af1[0]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dJ)
            .id_protected(1000000)
            .id_implements("Сфера Сатира")
            .id_break("Сфера Сатира")
            .id_byte("Сфера Сатира")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[5])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[17]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcX_2((rrfM_2)rrfM_2.staticFields869ba89e075331349de8f9288d544af1[1]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dJ)
            .id_protected(1000000)
            .id_implements("Сфера Бестии")
            .id_break("Сфера Бестии")
            .id_byte("Сфера Бестии")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[5])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[18]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcX_2((rrfM_2)rrfM_2.staticFields869ba89e075331349de8f9288d544af1[2]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dJ)
            .id_protected(500000)
            .id_implements("Сфера Ареса")
            .id_break("Сфера Ареса")
            .id_byte("Сфера Ареса")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[5])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[19]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcX_2((rrfM_2)rrfM_2.staticFields869ba89e075331349de8f9288d544af1[3]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dJ)
            .id_protected(500000)
            .id_implements("Сфера Гидры")
            .id_break("Сфера Гидры")
            .id_byte("Сфера Гидры")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[5])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[20]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcX_2((rrfM_2)rrfM_2.staticFields869ba89e075331349de8f9288d544af1[4]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dJ)
            .id_protected(100000)
            .id_implements("Сфера Икара")
            .id_break("Сфера Икара")
            .id_byte("Сфера Икара")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[5])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[21]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcX_2((rrfM_2)rrfM_2.staticFields869ba89e075331349de8f9288d544af1[5]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dJ)
            .id_protected(1000000)
            .id_implements("Сфера Эрида")
            .id_break("Сфера Эрида")
            .id_byte("Сфера Эрида")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[5])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[22]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcX_2((rrfM_2)rrfM_2.staticFields869ba89e075331349de8f9288d544af1[6]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dJ)
            .id_protected(1000000)
            .id_implements("Сфера Титана")
            .id_break("Сфера Титана")
            .id_byte("Сфера Титана")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[5])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[23]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcX_2((rrfM_2)rrfM_2.staticFields869ba89e075331349de8f9288d544af1[7]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kk)
            .id_protected(100000)
            .id_implements("Хлопушка")
            .id_break("Хлопушка")
            .id_byte("Хлопушка")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[9])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[36]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcx_3((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[0]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kk)
            .id_protected(100000)
            .id_implements("Святая вода")
            .id_break("Святая вода")
            .id_byte("Святая вода")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[9])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[37]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcx_3((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[1]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kk)
            .id_protected(100000)
            .id_implements("Зелье Гнева")
            .id_break("Зелье Гнева")
            .id_byte("Зелье Гнева")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[9])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[38]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcx_3((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[2]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kk)
            .id_protected(100000)
            .id_implements("Зелье Палладина")
            .id_break("Зелье Палладина")
            .id_byte("Зелье Палладина")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[9])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[39]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcx_3((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[3]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kk)
            .id_protected(100000)
            .id_implements("Зелье Ассасина")
            .id_break("Зелье Ассасина")
            .id_byte("Зелье Ассасина")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[9])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[40]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcx_3((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[4]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kk)
            .id_protected(100000)
            .id_implements("Зелье Радиации")
            .id_break("Зелье Радиации")
            .id_byte("Зелье Радиации")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[9])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[41]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcx_3((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[5]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kk)
            .id_protected(100000)
            .id_implements("Снотворное")
            .id_break("Снотворное")
            .id_byte("Снотворное")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[9])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[42]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcx_3((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[6]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.xI)
            .id_protected(100000)
            .id_implements("Яйцо призыва крестьянина")
            .id_break("Яйцо призыва жителя")
            .id_byte("Яйцо призыва крестьянина")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[6])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.xD)
            .id_protected(100000)
            .id_implements("Яйцо призыва зомби-крестьянина")
            .id_break("Яйцо призыва зомби жителя")
            .id_byte("Яйцо призыва зомби-крестьянина")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[6])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.xC)
            .id_protected(100000)
            .id_implements("Яйцо призыва слизня")
            .id_break("Яйцо призыва слизня")
            .id_byte("Яйцо призыва слизня")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[6])
            .id_class()
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Ja)
            .id_protected(100000)
            .id_implements("Яйцо призыва эндермена")
            .id_break("Яйцо призыва эндермена")
            .id_byte("Яйцо призыва эндермена")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[6])
            .id_class()
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.xS)
            .id_protected(100000)
            .id_implements("Яйцо призыва стража")
            .id_break("Яйцо призыва стража")
            .id_byte("Яйцо призыва стража")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[6])
            .id_class()
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dm)
            .id_protected(100000)
            .id_implements("Книга починка")
            .id_break("Книга на починку")
            .id_byte("Книга починка")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[7])
            .id_class(rrfA_2.id_class(eY_2.id_import))
            .id_class(new rdn_3(rdy_3.dm, 1).id_class(new rgN_2("Книга починка")))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcN_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dm)
            .id_protected(100000)
            .id_implements("Книга магнит")
            .id_break("Книга на магнит")
            .id_byte("Книга магнит")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[7])
            .id_class()
            .id_class(FuntimeEnchantment.id_class("magnet"))
            .id_class(new rdn_3(rdy_3.dm, 1).id_class(new rgN_2("Книга магнит")))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcu_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dm)
            .id_protected(100000)
            .id_implements("Книга подводная ходьба")
            .id_break("Книга на подводную ходьбу 5")
            .id_byte("Книга подводная ходьба")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[7])
            .id_class()
            .id_class(rrfA_2.id_class(eY_2.id_implements, 5))
            .id_class(new rdn_3(rdy_3.dm, 1).id_class(new rgN_2("Книга подводная ходьба")))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcN_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kz)
            .id_protected(1000)
            .id_implements("Мучительная стрела")
            .id_break("Мучительная Стрела")
            .id_byte("Мучительная стрела")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[8])
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[43]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcb_3((rrfE_2)rrfE_2.staticFieldsa1105bf70a073ebb8e16d8de80edaccd[0]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kz)
            .id_protected(1000)
            .id_implements("Стрела зевса")
            .id_break("Стрела Зевса")
            .id_byte("Стрела зевса")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[8])
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[44]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcb_3((rrfE_2)rrfE_2.staticFieldsa1105bf70a073ebb8e16d8de80edaccd[1]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kz)
            .id_protected(1000)
            .id_implements("Кровавая стрела")
            .id_break("Кровавая Стрела")
            .id_byte("Кровавая стрела")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[8])
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[45]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcb_3((rrfE_2)rrfE_2.staticFieldsa1105bf70a073ebb8e16d8de80edaccd[2]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kz)
            .id_protected(1000)
            .id_implements("Стрела обледенения")
            .id_break("Стрела Обледенения")
            .id_byte("Стрела обледенения")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[8])
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[46]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcb_3((rrfE_2)rrfE_2.staticFieldsa1105bf70a073ebb8e16d8de80edaccd[3]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kz)
            .id_protected(1000)
            .id_implements("Световая стрела")
            .id_break("Световая Стрела")
            .id_byte("Световая стрела")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[8])
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[47]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcb_3((rrfE_2)rrfE_2.staticFieldsa1105bf70a073ebb8e16d8de80edaccd[4]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kz)
            .id_protected(1000)
            .id_implements("Стрела терапии")
            .id_break("Стрела Терапии")
            .id_byte("Стрела терапии")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[8])
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[48]).id_break().id_class())
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcb_3((rrfE_2)rrfE_2.staticFieldsa1105bf70a073ebb8e16d8de80edaccd[5]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Sv)
            .id_protected(1000000)
            .id_throws("С Сферами")
            .id_implements("Отмычка к сферам")
            .id_break("Отмычка к сферам")
            .id_byte("Отмычка к сферам")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[10])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[53]).id_break().id_class())
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Sv)
            .id_protected(100000)
            .id_throws("С Броней")
            .id_implements("Отмычка к броне")
            .id_break("Отмычка к броне")
            .id_byte("Отмычка к броне")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[10])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[49]).id_break().id_class())
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Sv)
            .id_protected(100000)
            .id_throws("С Оружием")
            .id_implements("Отмычка к оружию")
            .id_break("Отмычка к оружию")
            .id_byte("Отмычка к оружию")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[10])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[51]).id_break().id_class())
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Sv)
            .id_protected(100000)
            .id_throws("С Инструментами")
            .id_implements("Отмычка к инструментам")
            .id_break("Отмычка к инструментам")
            .id_byte("Отмычка к инструментам")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[10])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[50]).id_break().id_class())
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Sv)
            .id_protected(100000)
            .id_throws("С Ресурсами")
            .id_implements("Отмычка к ресурсам")
            .id_break("Отмычка к ресурсам")
            .id_byte("Отмычка к ресурсам")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[10])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[52]).id_break().id_class())
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Xb)
            .id_protected(100000)
            .id_implements("Драконий скин")
            .id_break("Драконий скин")
            .id_byte("Драконий скин")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[12])
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[58]).id_break().id_class())
            .id_throws("и получаете Драконий скин взамен")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Xb)
            .id_protected(100000)
            .id_implements("Неизбежный скин")
            .id_break("Неизбежный скин")
            .id_byte("Неизбежный скин")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[12])
            .id_class()
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[59]).id_break().id_class())
            .id_throws("и получаете Неизбежный скин взамен")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.WN)
            .id_protected(1000000)
            .id_byte(Arrays.asList("Легендарный мист", "Сигнальный огонь"))
            .id_break("Легендарный мист")
            .id_byte("Легендарный мист")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[11])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[55]).id_break().id_class().id_class(new rgN_2("Легендарный мист")))
            .id_catch(
               Arrays.asList(
                  new rrcp_3(),
                  new rrcR_2(),
                  new rrcj_3(),
                  new rrcE_2(),
                  new rrcO_2(new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[0]))
               )
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.WN)
            .id_protected(500000)
            .id_byte(Arrays.asList("Богатый мист", "Сигнальный огонь"))
            .id_break("Богатый мист")
            .id_byte("Богатый мист")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[11])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[56]).id_break().id_class().id_class(new rgN_2("Богатый мист")))
            .id_catch(
               Arrays.asList(
                  new rrcp_3(),
                  new rrcR_2(),
                  new rrcj_3(),
                  new rrcE_2(),
                  new rrcO_2(new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[1]))
               )
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.WN)
            .id_protected(100000)
            .id_byte(Arrays.asList("Обычный мист", "Сигнальный огонь"))
            .id_break("Обычный мист")
            .id_byte("Обычный мист")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[11])
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[57]).id_break().id_class().id_class(new rgN_2("Обычный мист")))
            .id_catch(
               Arrays.asList(
                  new rrcp_3(),
                  new rrcR_2(),
                  new rrcj_3(),
                  new rrcE_2(),
                  new rrcO_2(new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[2]))
               )
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OB)
            .id_protected(1000000)
            .id_byte(Arrays.asList("Прогрузчик чанков", "Прогрузчик чанков 5x5", "Блок Чанкер", "Блок-конструктор"))
            .id_break("Прогрузчик чанков 5x5")
            .id_byte("Прогрузчик чанков")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[13])
            .id_class()
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcS_2((rrfs_3)rrfs_3.staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[2]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OB)
            .id_protected(500000)
            .id_byte(Arrays.asList("Прогрузчик чанков", "Прогрузчик чанков 3x3", "Блок Чанкер", "Блок-конструктор"))
            .id_break("Прогрузчик чанков 3x3")
            .id_byte("Прогрузчик чанков")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[13])
            .id_class()
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcS_2((rrfs_3)rrfs_3.staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[1]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OB)
            .id_protected(100000)
            .id_byte(Arrays.asList("Прогрузчик чанков", "Прогрузчик чанков 1x1", "Блок Чанкер", "Блок-конструктор"))
            .id_break("Прогрузчик чанков 1x1")
            .id_byte("Прогрузчик чанков")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[13])
            .id_class()
            .id_catch(
               Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcS_2((rrfs_3)rrfs_3.staticFieldsaa3157a520ba3b3b82552faf4dacb3c8[0]))
            )
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OS)
            .id_protected(1000000)
            .id_byte(Arrays.asList("Блок Дамагер", "Дамагер", "Пазл"))
            .id_break("Дамагер")
            .id_byte("Дамагер")
            .id_throws("● Каст: Нанесение урона")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class(new rdn_3(rdy_3.OS).id_class(new rgN_2("Дамагер")))
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.GJ)
            .id_protected(50000)
            .id_byte(Arrays.asList("Повторяющий командный блок", "Процессор"))
            .id_break("Процессор")
            .id_byte("Повторяющий командный блок")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class("processor")
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Pz)
            .id_protected(50000)
            .id_class("tier1")
            .id_implements("Таер вайт")
            .id_break("Таер Вайт")
            .id_byte("Таер вайт")
            .id_class(new rdn_3(rdy_3.Pz, 1).id_class(new rgN_2("Таер Вайт")))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Pz)
            .id_protected(100000)
            .id_class("tier2")
            .id_implements("Таер блэк")
            .id_break("Таер Блэк")
            .id_byte("Таер блэк")
            .id_class(new rdn_3(rdy_3.Pz, 1).id_class(new rgN_2("Таер Блэк")))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Pn)
            .id_protected(1000000)
            .id_implements("Спавнер")
            .id_break("Спавнер")
            .id_byte("Спавнер")
            .id_class(new rdn_3(rdy_3.Pn, 1).id_class(new rgN_2("Спавнер")))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kL)
            .id_protected(100000)
            .id_byte(Arrays.asList("Тотем бессмертия", "Тотем"))
            .id_break("Тотем бессмертия")
            .id_byte("Тотем бессмертия")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class()
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hp)
            .id_protected(100000)
            .id_implements("Зачарованное золотое яблоко")
            .id_break("Зачарованное золотое яблоко")
            .id_byte("Зачарованное золотое яблоко")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hy)
            .id_protected(5000)
            .id_implements("Золотое яблоко")
            .id_break("Золотое яблоко")
            .id_byte("Золотое яблоко")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Ok)
            .id_protected(300000)
            .id_implements("Незеритовый слиток")
            .id_break("Незеритовый слиток")
            .id_byte("Незеритовый слиток")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Wl)
            .id_protected(100000)
            .id_implements("Древние обломки")
            .id_break("Древний обломок")
            .id_byte("Древние обломки")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Sm)
            .id_protected(100000)
            .id_implements("Изумрудная руда")
            .id_break("Изумрудная руда")
            .id_byte("Изумрудная руда")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.JT)
            .id_protected(30000)
            .id_class("desorientation")
            .id_implements("Дезориентация")
            .id_break("Дезориентация")
            .id_byte("Дезориентация")
            .id_class(new rdn_3(rdy_3.JT, 1).id_class(new rgN_2("Дезориентация")))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OW)
            .id_protected(400000)
            .id_class("trap")
            .id_implements("Трапка")
            .id_break("Трапка")
            .id_byte("Трапка")
            .id_class(new rdn_3(rdy_3.OW, 1).id_class(new rgN_2("Трапка")))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Jd)
            .id_protected(10000)
            .id_class("stratum")
            .id_implements("Пласт")
            .id_break("Пласт")
            .id_byte("Пласт")
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[4]).id_break().id_class())
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.XY)
            .id_protected(30000)
            .id_class("sheerdust")
            .id_implements("Явная пыль")
            .id_break("Явная пыль")
            .id_byte("Явная пыль")
            .id_class(new rdn_3(rdy_3.XY, 1).id_class(new rgN_2("Явная пыль")))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hU)
            .id_protected(30000)
            .id_class("freezeball")
            .id_implements("Снежок заморозка")
            .id_break("Снежок заморозка")
            .id_byte("Снежок заморозка")
            .id_class(new rdn_3(rdy_3.hU, 1).id_class(new rgN_2("Снежок заморозка")))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class()
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.ko)
            .id_protected(100000)
            .id_class("godsaura")
            .id_implements("Божья аура")
            .id_break("Божья аура")
            .id_byte("Божья аура")
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[6]).id_break().id_class())
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcI_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Wz)
            .id_protected(100000)
            .id_implements("Проклятая Душа")
            .id_break("Проклятая душа")
            .id_byte("Проклятая душа")
            .id_class(((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[7]).id_break().id_class())
            .id_throws("Обменяй души на ценные")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrct_3()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OW)
            .id_protected(50000)
            .id_implements("Незеритовый лом")
            .id_break("Незеритовый лом")
            .id_byte("Незеритовый лом")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.OJ)
            .id_protected(5000)
            .id_implements("Алмаз")
            .id_break("Алмаз")
            .id_byte("Алмаз")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.xe)
            .id_protected(1600)
            .id_implements("Опыт обычный")
            .id_break("Опыт Обычный")
            .id_byte("Опыт обычный")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dj)
            .id_protected(10000)
            .id_implements("Бирка")
            .id_break("Бирка")
            .id_byte("Бирка")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.kn)
            .id_protected(10000)
            .id_implements("Серебро")
            .id_break("Серебро")
            .id_byte("Серебро")
            .id_class(new rdn_3(rdy_3.kn, 1).id_class(new rgN_2("Серебро")))
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2(), new rrcD_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.hr)
            .id_protected(5000)
            .id_implements("Порох")
            .id_break("Порох")
            .id_byte("Порох")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Sy)
            .id_protected(100000)
            .id_implements("Маяк")
            .id_break("Маяк")
            .id_byte("Маяк")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_class()
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dk)
            .id_protected(100000)
            .id_implements("Голова дракона")
            .id_break("Голова Дракона")
            .id_byte("Голова дракона")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.dX)
            .id_protected(100000)
            .id_implements("Череп визер-скелета")
            .id_break("Череп визер-скелета")
            .id_byte("Череп визер-скелета")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrcp_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
      this.id_break(
         new rrNk_1()
            .id_class(rdy_3.Gu)
            .id_protected(1000)
            .id_byte(Arrays.asList("Шалкер", "Шалкеровый ящик"))
            .id_break("Шалкер")
            .id_byte("Шалкер")
            .id_class((rrNX)rrNX.staticFields24872387b8fc307e802ef34c708a7fa8[14])
            .id_catch(Arrays.asList(new rrco_3(), new rrcR_2(), new rrcj_3(), new rrcE_2()))
            .id_break()
      );
   }

   private static void id_super() {
      Object[] var0 = new Object[]{new rrNh_1(), null};
      var0[1] = new rrNh_1[]{(rrNh_1)var0[0]};
      staticFieldsfb3637209df43f25b1ac5845136e2aa5 = var0;
   }

   private void id_while() {
      if (this.fieldsfb3637209df43f25b1ac5845136e2aa5 == null) {
         this.fieldsfb3637209df43f25b1ac5845136e2aa5 = new Object[8];
         Object[] var1 = this.fieldsfb3637209df43f25b1ac5845136e2aa5;
      }
   }

   private void id_public() {
      ArrayList var1 = new ArrayList();

      for (rrNd_1 var3 : (List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[1]) {
         if (var3.id_finally() == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            var1.add(var3);
         }
      }

      for (rrNd_1 var6 : var1) {
         rrNd_1 var4 = var6.id_byte();
         var4.id_class((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]);
         this.id_break(var4);
      }
   }

   public boolean id_protected(String var1) {
      return this.id_class((rrfq_3)this.fieldsfb3637209df43f25b1ac5845136e2aa5[7], var1);
   }

   public List<rrNd_1> id_protected() {
      rrfq_3 var1 = (rrfq_3)rrfp_3.id_class[1];
      return var1 == null ? Collections.emptyList() : ((Map)this.fieldsfb3637209df43f25b1ac5845136e2aa5[2]).getOrDefault(var1, Collections.emptyList());
   }

   public List<rrNO> id_private() {
      return (List<rrNO>)this.fieldsfb3637209df43f25b1ac5845136e2aa5[0];
   }

   public Optional<rrNO> id_final() {
      rrfq_3 var1 = (rrfq_3)rrfp_3.id_class[1];

      for (rrNO var3 : (List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[0]) {
         if (var3.id_finally().contains(var1)) {
            return Optional.of(var3);
         }
      }

      return Optional.empty();
   }

   public void id_volatile() {
      rrwe_3 var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_throws();
      boolean var2 = var1.id_byte((rrwU_2)var1.id_protected(), false);
      ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[3]).forEach(var1x -> var1x.id_class(var2));
   }

   private static void id_synchronized() {
      stringsfb3637209df43f25b1ac5845136e2aa5 = new String[]{
         new String("Мотыга Озеленитель"),
         new String("Книга на магнит"),
         new String("Книга на подводную ходьбу 5"),
         new String("Процессор"),
         new String("Опыт"),
         new String("Пузырек опыта"),
         new String("Опыт Обычный"),
         new String("Опыт"),
         new String("Кирка мега-бульдозер"),
         new String("Молот Тора"),
         new String("Молот Тора"),
         new String("Кирка мега-бульдозер"),
         new String("Кирка мега-бульдозер"),
         new String("radius-item-mega-buldozer"),
         new String("Божье Касание"),
         new String("Божье Касание"),
         new String("Божье Касание"),
         new String("spawner-item-spawner-break"),
         new String("Мощный Удар"),
         new String("Мощный Удар"),
         new String("Мощный Удар"),
         new String("bedrock-item-bedrock-break"),
         new String("Мощный Удар"),
         new String("Мощный Удар"),
         new String("Мощный Удар"),
         new String("bedrock-item-bedrock-break"),
         new String("Прогрузчик чанков"),
         new String("Прогрузчик чанков 5x5"),
         new String("Блок Чанкер"),
         new String("Блок-конструктор"),
         new String("Прогрузчик чанков 5x5"),
         new String("Прогрузчик чанков 5x5"),
         new String("Прогрузчик чанков 5x5"),
         new String("Прогрузчик чанков"),
         new String("Прогрузчик чанков 3x3"),
         new String("Блок Чанкер"),
         new String("Блок-конструктор"),
         new String("Прогрузчик чанков 3x3"),
         new String("Прогрузчик чанков 3x3"),
         new String("Прогрузчик чанков 3x3"),
         new String("Прогрузчик чанков"),
         new String("Прогрузчик чанков 1x1"),
         new String("Блок Чанкер"),
         new String("Блок-конструктор"),
         new String("Прогрузчик чанков 1x1"),
         new String("Прогрузчик чанков 1x1"),
         new String("Прогрузчик чанков 1x1"),
         new String("Таер вайт"),
         new String("Таер Вайт"),
         new String("Таер вайт"),
         new String("Таер Вайт"),
         new String("tnt-item-white"),
         new String("Таер блэк"),
         new String("Таер Блэк"),
         new String("Таер блэк"),
         new String("Таер Блэк"),
         new String("tnt-item-black"),
         new String("Дезориентация"),
         new String("Дезориентация"),
         new String("Дезориентация"),
         new String("Дезориентация"),
         new String("effect-item-diz"),
         new String("Трапка"),
         new String("Трапка"),
         new String("Трапка"),
         new String("Трапка"),
         new String("schematic-item-trap"),
         new String("Пласт"),
         new String("Пласт"),
         new String("Пласт"),
         new String("schematic-item-plast"),
         new String("Явная пыль"),
         new String("Явная пыль"),
         new String("Явная пыль"),
         new String("Явная пыль"),
         new String("effect-item-dust"),
         new String("Божья аура"),
         new String("Божья аура"),
         new String("Божья аура"),
         new String("effect-item-god"),
         new String("Снежок заморозка"),
         new String("Снежок заморозка"),
         new String("Снежок заморозка"),
         new String("Снежок заморозка"),
         new String("effect-item-snowball"),
         new String("Меч Крушителя"),
         new String("Меч Крушителя"),
         new String("Меч Крушителя"),
         new String("Окисление II"),
         new String("Детекция III"),
         new String("Яд III"),
         new String("Опытный III"),
         new String("Вампиризм II"),
         new String("Нестабильный"),
         new String("Незеритовый меч"),
         new String("Меч для фарма криперов"),
         new String("Незеритовый меч"),
         new String("Незеритовый меч"),
         new String("Нестабильный"),
         new String("Трезубец Крушителя"),
         new String("Трезубец Крушителя"),
         new String("Трезубец Крушителя"),
         new String("Возвращение"),
         new String("Ступор III"),
         new String("Опытный III"),
         new String("Скаут III"),
         new String("Вампиризм II"),
         new String("Яд III"),
         new String("Подрывник"),
         new String("Окисление II"),
         new String("Детекция III"),
         new String("Притяжение II"),
         new String("Нестабильный"),
         new String("Арбалет Крушителя"),
         new String("Арбалет Крушителя"),
         new String("Арбалет Крушителя"),
         new String("Нестабильный"),
         new String("Кирка Крушителя"),
         new String("Кирка Крушителя"),
         new String("Кирка Крушителя"),
         new String("Опытный III"),
         new String("Магнит"),
         new String("Бульдозер II"),
         new String("Пингер"),
         new String("Паутина"),
         new String("Авто-Плавка"),
         new String("Нестабильный"),
         new String("Кирка мега-бульдозер"),
         new String("Молот Тора"),
         new String("Молот Тора"),
         new String("Кирка мега-бульдозер"),
         new String("Кирка мега-бульдозер"),
         new String("magnet"),
         new String("megabuldozing"),
         new String("Божье Касание"),
         new String("Божье Касание"),
         new String("Божье Касание"),
         new String("spawner"),
         new String("Мощный Удар"),
         new String("Мощный Удар"),
         new String("Мощный Удар"),
         new String("bedrock"),
         new String("Незеритовая мотыга"),
         new String("Мотыга Озеленитель"),
         new String("Незеритовая мотыга"),
         new String("growing"),
         new String("Шлем Крушителя"),
         new String("Шлем Крушителя"),
         new String("Шлем Крушителя"),
         new String("Нестабильный"),
         new String("Работать с шипами"),
         new String("Нагрудник Крушителя"),
         new String("Нагрудник Крушителя"),
         new String("Нагрудник Крушителя"),
         new String("Нестабильный"),
         new String("Работать с шипами"),
         new String("Штаны Крушителя"),
         new String("Поножи Крушителя"),
         new String("Поножи Крушителя"),
         new String("Поножи Крушителя"),
         new String("Нестабильный"),
         new String("Работать с шипами"),
         new String("Ботинки Крушителя"),
         new String("Ботинки Крушителя"),
         new String("Ботинки Крушителя"),
         new String("Попрыгун"),
         new String("Нестабильный"),
         new String("Работать с шипами"),
         new String("Незеритовый шлем"),
         new String("Топовый шлем"),
         new String("Незеритовый шлем"),
         new String("Незеритовый шлем"),
         new String("Нестабильный"),
         new String("Работать с шипами"),
         new String("Незеритовый нагрудник"),
         new String("Топовый нагрудник"),
         new String("Незеритовый нагрудник"),
         new String("Незеритовый нагрудник"),
         new String("Нестабильный"),
         new String("Работать с шипами"),
         new String("Незеритовые поножи"),
         new String("Топовые поножи"),
         new String("Незеритовые поножи"),
         new String("Незеритовые поножи"),
         new String("Нестабильный"),
         new String("Работать с шипами"),
         new String("Незеритовые ботинки"),
         new String("Топовые ботинки"),
         new String("Незеритовые ботинки"),
         new String("Незеритовые ботинки"),
         new String("Попрыгун"),
         new String("Нестабильный"),
         new String("Работать с шипами"),
         new String("Элитры"),
         new String("Элитры Крушителя"),
         new String("Элитры"),
         new String("Элитры"),
         new String("Элитры"),
         new String("Элитры"),
         new String("Элитры"),
         new String("Талисман Крушителя"),
         new String("Талисман Крушителя"),
         new String("Талисман Крушителя"),
         new String("Талисман Карателя"),
         new String("Талисман Карателя"),
         new String("Талисман Карателя"),
         new String("Талисман Раздора"),
         new String("Талисман Раздора"),
         new String("Талисман Раздора"),
         new String("Талисман Тирана"),
         new String("Талисман Тирана"),
         new String("Талисман Тирана"),
         new String("Талисман Ярости"),
         new String("Талисман Ярости"),
         new String("Талисман Ярости"),
         new String("Талисман Вихря"),
         new String("Талисман Вихря"),
         new String("Талисман Вихря"),
         new String("Талисман Мрака"),
         new String("Талисман Мрака"),
         new String("Талисман Мрака"),
         new String("Талисман Демона"),
         new String("Талисман Демона"),
         new String("Талисман Демона"),
         new String("Сфера Хаоса"),
         new String("Сфера Хаоса"),
         new String("Сфера Хаоса"),
         new String("Сфера Сатира"),
         new String("Сфера Сатира"),
         new String("Сфера Сатира"),
         new String("Сфера Бестии"),
         new String("Сфера Бестии"),
         new String("Сфера Бестии"),
         new String("Сфера Ареса"),
         new String("Сфера Ареса"),
         new String("Сфера Ареса"),
         new String("Сфера Гидры"),
         new String("Сфера Гидры"),
         new String("Сфера Гидры"),
         new String("Сфера Икара"),
         new String("Сфера Икара"),
         new String("Сфера Икара"),
         new String("Сфера Эрида"),
         new String("Сфера Эрида"),
         new String("Сфера Эрида"),
         new String("Сфера Титана"),
         new String("Сфера Титана"),
         new String("Сфера Титана"),
         new String("Хлопушка"),
         new String("Хлопушка"),
         new String("Хлопушка"),
         new String("Святая вода"),
         new String("Святая вода"),
         new String("Святая вода"),
         new String("Зелье Гнева"),
         new String("Зелье Гнева"),
         new String("Зелье Гнева"),
         new String("Зелье Палладина"),
         new String("Зелье Палладина"),
         new String("Зелье Палладина"),
         new String("Зелье Ассасина"),
         new String("Зелье Ассасина"),
         new String("Зелье Ассасина"),
         new String("Зелье Радиации"),
         new String("Зелье Радиации"),
         new String("Зелье Радиации"),
         new String("Снотворное"),
         new String("Снотворное"),
         new String("Снотворное"),
         new String("Яйцо призыва крестьянина"),
         new String("Яйцо призыва жителя"),
         new String("Яйцо призыва крестьянина"),
         new String("Яйцо призыва зомби-крестьянина"),
         new String("Яйцо призыва зомби жителя"),
         new String("Яйцо призыва зомби-крестьянина"),
         new String("Яйцо призыва слизня"),
         new String("Яйцо призыва слизня"),
         new String("Яйцо призыва слизня"),
         new String("Яйцо призыва эндермена"),
         new String("Яйцо призыва эндермена"),
         new String("Яйцо призыва эндермена"),
         new String("Яйцо призыва стража"),
         new String("Яйцо призыва стража"),
         new String("Яйцо призыва стража"),
         new String("Книга починка"),
         new String("Книга на починку"),
         new String("Книга починка"),
         new String("Книга починка"),
         new String("Книга магнит"),
         new String("Книга на магнит"),
         new String("Книга магнит"),
         new String("magnet"),
         new String("Книга магнит"),
         new String("Книга подводная ходьба"),
         new String("Книга на подводную ходьбу 5"),
         new String("Книга подводная ходьба"),
         new String("Книга подводная ходьба"),
         new String("Мучительная стрела"),
         new String("Мучительная Стрела"),
         new String("Мучительная стрела"),
         new String("Стрела зевса"),
         new String("Стрела Зевса"),
         new String("Стрела зевса"),
         new String("Кровавая стрела"),
         new String("Кровавая Стрела"),
         new String("Кровавая стрела"),
         new String("Стрела обледенения"),
         new String("Стрела Обледенения"),
         new String("Стрела обледенения"),
         new String("Световая стрела"),
         new String("Световая Стрела"),
         new String("Световая стрела"),
         new String("Стрела терапии"),
         new String("Стрела Терапии"),
         new String("Стрела терапии"),
         new String("С Сферами"),
         new String("Отмычка к сферам"),
         new String("Отмычка к сферам"),
         new String("Отмычка к сферам"),
         new String("С Броней"),
         new String("Отмычка к броне"),
         new String("Отмычка к броне"),
         new String("Отмычка к броне"),
         new String("С Оружием"),
         new String("Отмычка к оружию"),
         new String("Отмычка к оружию"),
         new String("Отмычка к оружию"),
         new String("С Инструментами"),
         new String("Отмычка к инструментам"),
         new String("Отмычка к инструментам"),
         new String("Отмычка к инструментам"),
         new String("С Ресурсами"),
         new String("Отмычка к ресурсам"),
         new String("Отмычка к ресурсам"),
         new String("Отмычка к ресурсам"),
         new String("Драконий скин"),
         new String("Драконий скин"),
         new String("Драконий скин"),
         new String("и получаете Драконий скин взамен"),
         new String("Неизбежный скин"),
         new String("Неизбежный скин"),
         new String("Неизбежный скин"),
         new String("и получаете Неизбежный скин взамен"),
         new String("Легендарный мист"),
         new String("Сигнальный огонь"),
         new String("Легендарный мист"),
         new String("Легендарный мист"),
         new String("Легендарный мист"),
         new String("Богатый мист"),
         new String("Сигнальный огонь"),
         new String("Богатый мист"),
         new String("Богатый мист"),
         new String("Богатый мист"),
         new String("Обычный мист"),
         new String("Сигнальный огонь"),
         new String("Обычный мист"),
         new String("Обычный мист"),
         new String("Обычный мист"),
         new String("Прогрузчик чанков"),
         new String("Прогрузчик чанков 5x5"),
         new String("Блок Чанкер"),
         new String("Блок-конструктор"),
         new String("Прогрузчик чанков 5x5"),
         new String("Прогрузчик чанков"),
         new String("Прогрузчик чанков"),
         new String("Прогрузчик чанков 3x3"),
         new String("Блок Чанкер"),
         new String("Блок-конструктор"),
         new String("Прогрузчик чанков 3x3"),
         new String("Прогрузчик чанков"),
         new String("Прогрузчик чанков"),
         new String("Прогрузчик чанков 1x1"),
         new String("Блок Чанкер"),
         new String("Блок-конструктор"),
         new String("Прогрузчик чанков 1x1"),
         new String("Прогрузчик чанков"),
         new String("Блок Дамагер"),
         new String("Дамагер"),
         new String("Пазл"),
         new String("Дамагер"),
         new String("Дамагер"),
         new String("● Каст: Нанесение урона"),
         new String("Дамагер"),
         new String("Повторяющий командный блок"),
         new String("Процессор"),
         new String("Процессор"),
         new String("Повторяющий командный блок"),
         new String("processor"),
         new String("tier1"),
         new String("Таер вайт"),
         new String("Таер Вайт"),
         new String("Таер вайт"),
         new String("Таер Вайт"),
         new String("tier2"),
         new String("Таер блэк"),
         new String("Таер Блэк"),
         new String("Таер блэк"),
         new String("Таер Блэк"),
         new String("Спавнер"),
         new String("Спавнер"),
         new String("Спавнер"),
         new String("Спавнер"),
         new String("Тотем бессмертия"),
         new String("Тотем"),
         new String("Тотем бессмертия"),
         new String("Тотем бессмертия"),
         new String("Зачарованное золотое яблоко"),
         new String("Зачарованное золотое яблоко"),
         new String("Зачарованное золотое яблоко"),
         new String("Золотое яблоко"),
         new String("Золотое яблоко"),
         new String("Золотое яблоко"),
         new String("Незеритовый слиток"),
         new String("Незеритовый слиток"),
         new String("Незеритовый слиток"),
         new String("Древние обломки"),
         new String("Древний обломок"),
         new String("Древние обломки"),
         new String("Изумрудная руда"),
         new String("Изумрудная руда"),
         new String("Изумрудная руда"),
         new String("desorientation"),
         new String("Дезориентация"),
         new String("Дезориентация"),
         new String("Дезориентация"),
         new String("Дезориентация"),
         new String("trap"),
         new String("Трапка"),
         new String("Трапка"),
         new String("Трапка"),
         new String("Трапка"),
         new String("stratum"),
         new String("Пласт"),
         new String("Пласт"),
         new String("Пласт"),
         new String("sheerdust"),
         new String("Явная пыль"),
         new String("Явная пыль"),
         new String("Явная пыль"),
         new String("Явная пыль"),
         new String("freezeball"),
         new String("Снежок заморозка"),
         new String("Снежок заморозка"),
         new String("Снежок заморозка"),
         new String("Снежок заморозка"),
         new String("godsaura"),
         new String("Божья аура"),
         new String("Божья аура"),
         new String("Божья аура"),
         new String("Проклятая Душа"),
         new String("Проклятая душа"),
         new String("Проклятая душа"),
         new String("Обменяй души на ценные"),
         new String("Незеритовый лом"),
         new String("Незеритовый лом"),
         new String("Незеритовый лом"),
         new String("Алмаз"),
         new String("Алмаз"),
         new String("Алмаз"),
         new String("Опыт обычный"),
         new String("Опыт Обычный"),
         new String("Опыт обычный"),
         new String("Бирка"),
         new String("Бирка"),
         new String("Бирка"),
         new String("Серебро"),
         new String("Серебро"),
         new String("Серебро"),
         new String("Серебро"),
         new String("Порох"),
         new String("Порох"),
         new String("Порох"),
         new String("Маяк"),
         new String("Маяк"),
         new String("Маяк"),
         new String("Голова дракона"),
         new String("Голова Дракона"),
         new String("Голова дракона"),
         new String("Череп визер-скелета"),
         new String("Череп визер-скелета"),
         new String("Череп визер-скелета"),
         new String("Шалкер"),
         new String("Шалкеровый ящик"),
         new String("Шалкер"),
         new String("Шалкер"),
         new String("INSTANCE")
      };
   }

   public void id_native() {
      rrwe_3 var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_throws();
      boolean var2 = var1.id_class((rrwU_2)var1.id_protected(), false);
      ((List)this.fieldsfb3637209df43f25b1ac5845136e2aa5[3]).forEach(var1x -> var1x.id_break(var2));
   }
}
