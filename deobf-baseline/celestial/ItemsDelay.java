package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class ItemsDelay extends Module {
   private static String[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static float[] id_catch;
   public Object[] id_break;
   private static byte[] id_private;

   private float id_char() {
      this.id_public();
      return ((rrIm_1)((Pair)this.id_break[id_throws[34]]).getRight()).id_byte();
   }

   private int id_byte(rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      return !var2.id_super() && var2 != rdy_3.hi && var2 != rdy_3.WF && var2 != rdy_3.JA ? id_protected[34] : var2.id_break(var2.id_continue());
   }

   public ItemsDelay() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_public();
      Pair var5 = rrwg_3.id_class(new rrIk_1(id_byte[2], id_protected[0]), new rrIm_1(id_byte[3], id_catch[0], id_catch[1], id_catch[2], id_catch[3]));
      this.id_break[id_throws[1]] = var5;
      Pair var6 = rrwg_3.id_class(new rrIk_1(id_byte[4], id_protected[1]), new rrIm_1(id_byte[5], id_catch[4], id_catch[5], id_catch[6], id_catch[7]));
      this.id_break[id_throws[2]] = var6;
      Pair var7 = rrwg_3.id_class(new rrIk_1(id_byte[6], id_protected[2]), new rrIm_1(id_byte[7], id_catch[8], id_catch[9], id_catch[10], id_catch[11]));
      this.id_break[id_throws[3]] = var7;
      Pair var8 = rrwg_3.id_class(new rrIk_1(id_byte[8], id_protected[3]), new rrIm_1(id_byte[9], id_catch[12], id_catch[13], id_catch[14], id_catch[15]));
      this.id_break[id_throws[4]] = var8;
      Pair var9 = rrwg_3.id_class(new rrIk_1(id_byte[10], id_protected[4]), new rrIm_1(id_byte[11], id_catch[16], id_catch[17], id_catch[18], id_catch[19]));
      this.id_break[id_throws[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_byte[12], id_protected[5])
         .id_class(
            () -> (rrfq_3)rrfp_3.id_class[id_throws[50]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[51]]
                  ? id_protected[76]
                  : id_protected[77]
         );
      this.id_break[id_throws[6]] = var10;
      rrIk_1 var11 = new rrIk_1(id_byte[13], id_protected[6]);
      this.id_break[id_throws[7]] = var11;
      Setting[] var10001 = new Setting[id_private[0]];
      byte var10003 = id_protected[7];
      String var10006 = id_byte[14];
      Setting[] var10007 = new Setting[id_private[1]];
      var10007[id_protected[8]] = new ButtonSetting(this, id_byte[15], () -> {
         this.id_public();
         ((rrIk_1)this.id_break[id_throws[46]]).id_class(Boolean.valueOf(id_protected[66]), id_protected[67], id_protected[68]);
         ((rrIk_1)this.id_break[id_throws[47]]).id_class(Boolean.valueOf(id_protected[69]), id_protected[70], id_protected[71]);
         ((rrIm_1)((Pair)this.id_break[id_throws[48]]).getRight()).id_class(id_catch[24], id_protected[72], id_protected[73]);
         ((rrIm_1)((Pair)this.id_break[id_throws[49]]).getRight()).id_class(id_catch[25], id_protected[74], id_protected[75]);
      });
      var10007[id_protected[9]] = new ButtonSetting(this, id_byte[16], () -> {
         this.id_public();
         ((rrIk_1)((Pair)this.id_break[id_throws[38]]).getLeft()).id_class(Boolean.valueOf(id_protected[43]), id_protected[44], id_protected[45]);
         ((rrIm_1)((Pair)this.id_break[id_throws[39]]).getRight()).id_class(id_catch[23], id_protected[46], id_protected[47]);
         ((rrIk_1)this.id_break[id_throws[40]]).id_class(Boolean.valueOf(id_protected[48]), id_protected[49], id_protected[50]);
         ((rrIk_1)this.id_break[id_throws[41]]).id_class(Boolean.valueOf(id_protected[51]), id_protected[52], id_protected[53]);
         ((rrIk_1)((Pair)this.id_break[id_throws[42]]).getLeft()).id_class(Boolean.valueOf(id_protected[54]), id_protected[55], id_protected[56]);
         ((rrIk_1)((Pair)this.id_break[id_throws[43]]).getLeft()).id_class(Boolean.valueOf(id_protected[57]), id_protected[58], id_protected[59]);
         ((rrIk_1)((Pair)this.id_break[id_throws[44]]).getLeft()).id_class(Boolean.valueOf(id_protected[60]), id_protected[61], id_protected[62]);
         ((rrIk_1)((Pair)this.id_break[id_throws[45]]).getLeft()).id_class(Boolean.valueOf(id_protected[63]), id_protected[64], id_protected[65]);
      });
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_protected[10];
      var10006 = id_byte[17];
      var10007 = new Setting[id_private[2]];
      var10007[id_protected[11]] = (Setting)((Pair)this.id_break[id_throws[8]]).getLeft();
      var10007[id_protected[12]] = (Setting)((Pair)this.id_break[id_throws[9]]).getRight();
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[3];
      var10006 = id_byte[18];
      var10007 = new Setting[id_private[4]];
      var10007[id_protected[13]] = (Setting)((Pair)this.id_break[id_throws[10]]).getLeft();
      var10007[id_protected[14]] = (Setting)((Pair)this.id_break[id_throws[11]]).getRight();
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[5];
      var10006 = id_byte[19];
      var10007 = new Setting[id_private[6]];
      var10007[id_protected[15]] = (Setting)((Pair)this.id_break[id_throws[12]]).getLeft();
      var10007[id_protected[16]] = (Setting)((Pair)this.id_break[id_throws[13]]).getRight();
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[7];
      var10006 = id_byte[20];
      var10007 = new Setting[id_private[8]];
      var10007[id_protected[17]] = (Setting)((Pair)this.id_break[id_throws[14]]).getLeft();
      var10007[id_protected[18]] = (Setting)((Pair)this.id_break[id_throws[15]]).getRight();
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[9];
      var10006 = id_byte[21];
      var10007 = new Setting[id_private[10]];
      var10007[id_protected[19]] = (Setting)((Pair)this.id_break[id_throws[16]]).getLeft();
      var10007[id_protected[20]] = (Setting)((Pair)this.id_break[id_throws[17]]).getRight();
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[11];
      var10006 = id_byte[22];
      var10007 = new Setting[id_private[12]];
      var10007[id_protected[21]] = (rrIk_1)this.id_break[id_throws[18]];
      var10007[id_protected[22]] = (rrIk_1)this.id_break[id_throws[19]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private boolean id_this() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[id_throws[28]]).getLeft()).id_class();
   }

   private boolean id_interface() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[id_throws[29]]).getLeft()).id_class();
   }

   private rVi_1 id_class(rdn_3 var1, float var2) {
      rVi_1 var3;
      if (var1.id_this()) {
         var3 = var1.id_continue().id_case().id_class(rgF_2.RED);
      } else {
         var3 = new rgN_2(jI_2.id_class(id_byte[23], var1.id_finally())).id_class(rgF_2.RED);
      }

      return rrfu_3.id_break((Module)this)
         .id_class(rgF_2.GRAY)
         .id_break(id_byte[24])
         .id_break(id_byte[25])
         .id_class(var3)
         .id_break(" доступно на " + rgF_2.RED + var2 + "с" + rgF_2.GRAY + " быстрее");
   }

   @EventTarget
   public void id_class(rrAY var1) {
      if (this.id_goto()) {
         rdn_3 var2 = var1.id_break();
         rdb_3 var3 = var2.id_break();
         if (this.id_this() && var3 == rdy_3.Jm) {
            if (rrfo_3.id_class(var2)) {
               var1.id_class(id_protected[23]);
            }
         } else if (this.id_interface() && var3 == rdy_3.hy) {
            if (rrfo_3.id_class(var2)) {
               var1.id_class(id_protected[24]);
            }
         } else if (this.id_try() && var3 == rdy_3.hp) {
            if (rrfo_3.id_class(var2)) {
               var1.id_class(id_protected[25]);
            }
         } else if (this.id_while() && rrfH_2.id_break(var2)) {
            if (rrfo_3.id_class(var2)) {
               var1.id_class(id_protected[26]);
            }
         } else if (this.id_else() && var3 == rdy_3.kO && rrfo_3.id_class(var2)) {
            var1.id_class(id_protected[27]);
         }
      }
   }

   @EventTarget
   public void id_class(rrLK var1) {
      if (this.id_goto()) {
         rdn_3 var2 = var1.id_class();
         rdb_3 var3 = var2.id_break();
         if (this.id_try() && var3 == rdy_3.hp) {
            this.id_class(var2, var0 -> var0.id_break() == rdy_3.hp ? id_protected[41] : id_protected[42], this.id_super());
         } else if (this.id_interface() && var3 == rdy_3.hy) {
            this.id_class(var2, var0 -> var0.id_break() == rdy_3.hy ? id_protected[39] : id_protected[40], this.id_instanceof());
         } else if (this.id_while() && rrfH_2.id_break(var2)) {
            this.id_class(var2, var0 -> rrfH_2.id_break(var0), this.id_char());
         } else if (this.id_else() && var3 == rdy_3.kO) {
            this.id_class(var2, var0 -> var0.id_break() == rdy_3.kO ? id_protected[37] : id_protected[38], this.id_import());
         }
      }
   }

   @EventTarget
   public void id_class(rrLn_1 var1) {
      rvs_3 var2 = var1.id_class();
      rdb_3 var3 = var2.id_break();
      int var4 = var2.id_byte();
      if (var4 != 0) {
         rdn_3 var5 = var3.id_continue();
         if (this.id_goto() && this.id_this() && var3 == rdy_3.Jm) {
            this.id_class(var5, var0 -> var0.id_break() == rdy_3.Jm ? id_protected[35] : id_protected[36], this.id_continue());
         }

         if (this.id_throws(var5) && !rrfo_3.id_class(var5)) {
            int var6 = this.id_byte(var5);
            if (var6 > 0 && var4 > var6) {
               int var7 = var2.id_byte();
               var2.id_class(var4 - var6);
               float var8 = (float)(var7 - var2.id_byte()) / id_catch[20];
               rrfu_3.id_class(this.id_class(var5, var8));
            }
         }
      }
   }

   private void id_class(rdn_3 var1, Predicate<rdn_3> var2, float var3) {
      int var4 = (int)(var3 * id_catch[21]);
      if (this.id_throws(var1)) {
         int var5 = this.id_byte(var1);
         if (var5 > 0 && var4 > var5) {
            int var6 = var4;
            var4 -= var5;
            float var7 = (float)(var6 - var4) / id_catch[22];
            rrfu_3.id_class(this.id_class(var1, var7));
         }
      }

      ((cb_3)id_import.id_class[id_throws[22]]).r().id_class(var1, var2, var4);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1260884897;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1880531544961888906L;
   }

   private void id_class(rdn_3 var1) {
      ((cb_3)id_import.id_class[id_throws[26]]).r().id_break(var1);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-37, -65, -10, 73, -66, -120, 8, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_throws(rdn_3 var1) {
      this.id_public();
      if (!((rrIk_1)this.id_break[id_throws[23]]).id_class()) {
         return id_protected[28];
      } else {
         return (rrfq_3)rrfp_3.id_class[id_throws[24]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[25]]
               && var1.id_break() == rdy_3.Jd
            ? id_protected[29]
            : id_protected[30];
      }
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      if ((cb_3)id_import.id_class[id_throws[20]] != null) {
         ((cb_3)id_import.id_class[id_throws[21]]).r().id_break();
      }
   }

   private boolean id_goto() {
      this.id_public();
      return ((rrIk_1)this.id_break[id_throws[27]]).id_class() && !rrfZ_2.id_byte() ? id_protected[31] : id_protected[32];
   }

   private float id_continue() {
      this.id_public();
      return ((rrIm_1)((Pair)this.id_break[id_throws[33]]).getRight()).id_byte();
   }

   private boolean id_else() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[id_throws[32]]).getLeft()).id_class();
   }

   private float id_import() {
      this.id_public();
      return ((rrIm_1)((Pair)this.id_break[id_throws[37]]).getRight()).id_byte();
   }

   private float id_instanceof() {
      this.id_public();
      return ((rrIm_1)((Pair)this.id_break[id_throws[35]]).getRight()).id_byte();
   }

   private static void id_new() {
      id_catch = new float[]{
         14.0F,
         1.5F,
         60.0F,
         0.5F,
         5.0F,
         0.1F,
         60.0F,
         0.5F,
         5.0F,
         0.1F,
         60.0F,
         0.5F,
         5.0F,
         0.1F,
         60.0F,
         0.5F,
         5.0F,
         1.5F,
         60.0F,
         0.5F,
         20.0F,
         20.0F,
         20.0F,
         20.0F,
         14.0F,
         5.0F
      };
   }

   private static void id_return() {
      id_byte = new String[]{
         new String("Items Delay"),
         new String("Ставит задержку на предмет после\nего использования"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Включено"),
         new String("Задержка в секундах"),
         new String("Компенсировать задержку"),
         new String("Только в ПВП"),
         new String("Авто. конфигурации"),
         new String("ReallyWorld"),
         new String("Funtime"),
         new String("Эндер жемчуги"),
         new String("Зачар. золотые яблоки"),
         new String("Золотые яблоки"),
         new String("Зелье исцеления"),
         new String("Хорус"),
         new String("Другое"),
         new String("ru_ru"),
         new String("Задержка компенсирована"),
         new String("\nТеперь использование ")
      };
   }

   private float id_super() {
      this.id_public();
      return ((rrIm_1)((Pair)this.id_break[id_throws[36]]).getRight()).id_byte();
   }

   private static void id_throw() {
      id_protected = new boolean[]{
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
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
         true,
         true,
         true,
         true,
         true,
         false,
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
         true,
         false,
         true,
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
         false,
         true,
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
         true,
         false
      };
   }

   private boolean id_try() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[id_throws[30]]).getLeft()).id_class();
   }

   private boolean id_while() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[id_throws[31]]).getLeft()).id_class();
   }

   private static void id_static() {
      id_throws = new short[]{
         3,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         0,
         0,
         1,
         1,
         2,
         2,
         3,
         3,
         4,
         4,
         5,
         6,
         57,
         57,
         57,
         5,
         1,
         2,
         57,
         6,
         0,
         2,
         1,
         3,
         4,
         0,
         3,
         2,
         1,
         4,
         3,
         3,
         5,
         6,
         0,
         2,
         1,
         4,
         6,
         5,
         0,
         2,
         1,
         2
      };
   }

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   private static void id_abstract() {
      id_private = new byte[]{7, 2, 2, 2, 2, 3, 2, 4, 2, 5, 2, 6, 2, 7};
   }
}
