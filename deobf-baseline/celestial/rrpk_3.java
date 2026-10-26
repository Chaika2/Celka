package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpk_3 extends rrpu_3 {
   private static short[] id_break;
   private static long[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static float[] id_case;
   private static String[] id_catch;
   private static byte[] id_private;

   private int id_byte(int var1) {
      this.id_case();
      if (var1 == id_private[8]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_private[9]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_private[10]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_break[44]]).id_implements[id_break[45]]).id_protected);
         return var1;
      } else if (var1 >= id_private[11] && var1 <= id_private[12]) {
         ((rrfP_2)this.id_class[id_break[46]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_break[47]]).id_implements[id_break[48]]).id_protected);
         ((Ax_1)id_import.id_class[id_break[49]]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[id_break[50]] = var6;
         return var1;
      } else {
         return id_private[13];
      }
   }

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_break[51]]).id_break().id_class();
   }

   public rrpk_3(FtHelper var1) {
      super(var1);
      this.id_case();
      rrIk_1 var6 = new rrIk_1(id_catch[0], id_protected[0]);
      this.id_class[id_break[0]] = var6;
      rrIF var7 = new rrIF(id_catch[1], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_break[1]]);
      this.id_class[id_break[2]] = var7;
      CheckGroup var8 = new CheckGroup().id_catch(id_protected[1]).id_case(id_protected[2]).id_class(id_protected[3]);
      this.id_class[id_break[3]] = var8;
      rrfP_2 var9 = new rrfP_2();
      this.id_class[id_break[4]] = var9;
      Integer var10 = Integer.valueOf(id_private[0]);
      this.id_class[id_break[5]] = var10;
      String var10003 = id_catch[2];
      Setting[] var10004 = new Setting[id_private[1]];
      byte var10006 = id_protected[4];
      String var10009 = id_catch[3];
      rrIk_1[] var10010 = new rrIk_1[id_protected[5]];
      var10010[id_protected[6]] = (rrIk_1)this.id_class[id_break[6]];
      var10004[var10006] = new rrIc_1(var10009, var10010);
      var10004[id_protected[7]] = (rrIF)this.id_class[id_break[7]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_case();
      if (var1.id_break() == ((rrIF)this.id_class[id_break[8]]).id_finally().id_byte()) {
         Boolean var6 = id_protected[8];
         this.id_class[id_break[9]] = var6;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7266994685149547605L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1992145915;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, -91, 12, 1, 3, -64, 101, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_case();
      ((rrfP_2)this.id_class[id_break[10]]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_case();
      ((rrfP_2)this.id_class[id_break[11]]).id_class(rqR_2.id_break() - this.id_class[id_break[12]] > id_byte[0] ? id_protected[9] : id_protected[10]);
      if ((Boolean)this.id_class[id_break[13]]) {
         FtHelper var2 = this.id_continue();
         int var3 = this.id_final();
         rrpW_2 var4 = this.id_break(var3);
         if (var4 == (rrpW_2)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[14]]) {
            int var5 = ((cb_3)id_import.id_class[id_break[15]]).sK().id_protected(rdy_3.XY);
            float var6 = (float)var5 / id_case[0];
            rrfu_3.id_class(var2, id_catch[4], var6);
         } else if (var4 == (rrpW_2)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[16]]) {
            String var18 = id_catch[5];
            rrfu_3.id_byte(rrfu_3.id_class((Module)var2) + var18);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[17]]).id_class(new rrtx_3(var2.id_final(), var18, id_break[18]));
         } else if (var4 == (rrpW_2)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[19]]) {
            int var19 = this.id_byte(var3);
            if (var19 > id_private[2]) {
               Integer var11 = var19;
               this.id_class[id_break[20]] = var11;
               Integer var12 = Integer.valueOf(id_protected[11]);
               this.id_class[id_break[21]] = var12;
            }
         }

         Boolean var13 = id_protected[12];
         this.id_class[id_break[22]] = var13;
      }

      if ((Integer)this.id_class[id_break[23]] != id_private[3]) {
         byte var17 = !((cb_3)id_import.id_class[id_break[24]]).sV() && !((cb_3)id_import.id_class[id_break[25]]).sZ() ? id_private[4] : id_protected[13];
         int var10002 = (Integer)this.id_class[id_break[26]] + id_protected[14];
         Integer var14 = var10002;
         this.id_class[id_break[27]] = var14;
         if (var10002 > var17) {
            ((Ax_1)id_import.id_class[id_break[28]]).id_class((Integer)this.id_class[id_break[29]]);
            Integer var15 = Integer.valueOf(id_private[5]);
            this.id_class[id_break[30]] = var15;
            Integer var16 = Integer.valueOf(id_protected[15]);
            this.id_class[id_break[31]] = var16;
         }
      }
   }

   private static void id_break() {
      id_byte = new long[]{300L, 0L};
   }

   private rrpW_2 id_break(int var1) {
      if (var1 == id_private[7]) {
         return (rrpW_2)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[35]];
      } else if (((cb_3)id_import.id_class[id_break[36]]).sK().id_class(rdy_3.XY)) {
         return (rrpW_2)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[37]];
      } else {
         return !this.id_native()
            ? (rrpW_2)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[38]]
            : (rrpW_2)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[39]];
      }
   }

   @Override
   public rrIF id_throws() {
      this.id_case();
      return (rrIF)this.id_class[id_break[52]];
   }

   private static void id_finally() {
      id_break = new short[]{
         0,
         0,
         1,
         2,
         3,
         6,
         0,
         1,
         1,
         4,
         3,
         3,
         5,
         4,
         2,
         57,
         3,
         0,
         2000,
         0,
         6,
         7,
         4,
         6,
         57,
         57,
         7,
         7,
         55,
         6,
         6,
         7,
         4,
         6,
         7,
         1,
         57,
         2,
         3,
         0,
         0,
         56,
         2,
         57,
         57,
         1,
         3,
         57,
         1,
         55,
         5,
         2,
         1,
         57,
         57,
         57,
         1
      };
   }

   private static void id_extends() {
      id_case = new float[]{20.0F, 10.0F};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[8];
         this.id_class[4] = false;
         this.id_class[5] = 0L;
         this.id_class[6] = 0;
         this.id_class[7] = 0;
      }
   }

   private static void id_implements() {
      id_catch = new String[]{
         new String("Рядом игрок"),
         new String("Активация"),
         new String("Явная пыль"),
         new String("Проверки"),
         new String("явной пыли"),
         new String("Нет игроков поблизости"),
         new String("[★] Явная пыль"),
         new String("sheerdust"),
         new String("spooky-item")
      };
   }

   private static void id_package() {
      id_private = new byte[]{-1, 2, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 8, 4, 5, 6, 7};
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.XY) {
            return id_protected[22];
         } else if (var0.id_continue().id_byte().equalsIgnoreCase(id_catch[6])) {
            return id_protected[23];
         } else {
            return !var0.id_protected(id_catch[7]) && !var0.id_protected(id_catch[8]) ? id_protected[25] : id_protected[24];
         }
      };
   }

   private static void id_private() {
      id_protected = new boolean[]{
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false
      };
   }

   private int id_final() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_private[14];
      } else if (var1.test(((cb_3)id_import.id_class[id_break[53]]).ss())) {
         return id_private[15];
      } else if (var1.test(((cb_3)id_import.id_class[id_break[54]]).Sn())) {
         return id_private[16];
      } else {
         for (int var2 = id_protected[21]; var2 < id_private[17]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_break[55]]).id_implements[id_break[56]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_private[18];
      }
   }

   private boolean id_native() {
      this.id_case();
      if (!((rrIk_1)this.id_class[id_break[40]]).id_class()) {
         return id_protected[18];
      } else {
         ObjectIterator var1 = ((gm_3)id_import.id_class[id_break[41]]).id_return().int2ObjectEntrySet().iterator();

         while (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            an_3 var3 = (an_3)var2.getValue();
            if (var3 != this.O()
               && rrff_3.id_class(var3, (CheckGroup)this.id_class[id_break[42]])
               && ((cb_3)id_import.id_class[id_break[43]]).id_implements(var3) <= id_case[1]) {
               return id_protected[19];
            }
         }

         return id_protected[20];
      }
   }

   @Override
   public boolean aK_() {
      this.id_case();
      Boolean var5 = id_protected[16];
      this.id_class[id_break[32]] = var5;
      Integer var6 = Integer.valueOf(id_private[6]);
      this.id_class[id_break[33]] = var6;
      Integer var7 = Integer.valueOf(id_protected[17]);
      this.id_class[id_break[34]] = var7;
      return super.aK_();
   }
}
