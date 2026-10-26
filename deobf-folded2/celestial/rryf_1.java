package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryf_1 extends rrpu_3 {
   public static Object[] id_class;
   private static long[] id_byte;
   public Object[] id_break;
   private static float[] id_protected;
   private static boolean[] id_case;
   private static byte[] id_catch;
   private static String[] id_private;
   private static short[] id_implements;

   private int id_byte(int var1) {
      this.id_else();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_break[3]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_break[5] = var6;
         return var1;
      } else {
         return id_catch[13];
      }
   }

   @Override
   public rdn_3 id_byte() {
      return (rdn_3)id_class[0];
   }

   private static void id_int() {
      id_case = new boolean[]{
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
         true,
         false,
         false,
         false,
         false,
         true
      };
   }

   public rryf_1(FtHelper var1) {
      super(var1);
      this.id_else();
      rrIk_1 var6 = new rrIk_1("Рядом игрок", true);
      this.id_break[0] = var6;
      rrIF var7 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_break[1] = var7;
      CheckGroup var8 = new CheckGroup().id_catch(true).id_case(true).id_class(true);
      this.id_break[2] = var8;
      rrfP_2 var9 = new rrfP_2();
      this.id_break[3] = var9;
      Integer var10 = -1;
      this.id_break[6] = var10;
      var1.id_class(new GroupSetting("Дезориентация", new rrIc_1("Проверки", (rrIk_1)this.id_break[0]), (rrIF)this.id_break[1]));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new String[]{
         new String("Рядом игрок"),
         new String("Активация"),
         new String("Дезориентация"),
         new String("Проверки"),
         new String("дезориентации"),
         new String("Нет игроков поблизости"),
         new String("[★] Дезориентация"),
         new String("desorientation"),
         new String("spooky-item")
      };
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -962392608973498530L;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_else();
      ((rrfP_2)this.id_break[3]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_else();
      ((rrfP_2)this.id_break[3]).id_class(rqR_2.id_break() - this.id_break[5] > 300L ? true : id_case[10]);
      if ((Boolean)this.id_break[4]) {
         FtHelper var2 = this.id_continue();
         int var3 = this.id_public();
         rryj_1 var4 = this.id_class(var3);
         if (var4 == (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[2]) {
            int var5 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.JT);
            float var6 = (float)var5 / 20.0F;
            rrfu_3.id_class(var2, "дезориентации", var6);
         } else if (var4 == (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[3]) {
            String var18 = "Нет игроков поблизости";
            rrfu_3.id_byte(rrfu_3.id_class((Module)var2) + var18);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(var2.id_final(), var18, 2000));
         } else if (var4 == (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[0]) {
            int var19 = this.id_byte(var3);
            if (var19 > 8) {
               Integer var11 = var19;
               this.id_break[6] = var11;
               Integer var12 = 0;
               this.id_break[7] = var12;
            }
         }

         Boolean var13 = false;
         this.id_break[4] = var13;
      }

      if ((Integer)this.id_break[6] != -1) {
         byte var17 = !((cb_3)id_import.id_class[57]).sV() && !((cb_3)id_import.id_class[57]).sZ() ? id_catch[4] : id_case[13];
         int var10002 = (Integer)this.id_break[7] + 1;
         Integer var14 = var10002;
         this.id_break[7] = var14;
         if (var10002 > var17) {
            ((Ax_1)id_import.id_class[55]).id_class((Integer)this.id_break[6]);
            Integer var15 = -1;
            this.id_break[6] = var15;
            Integer var16 = 0;
            this.id_break[7] = var16;
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-95, 6, 26, 114, -6, 124, -23, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_else();
      if (var1.id_break() == ((rrIF)this.id_break[1]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_break[4] = var6;
      }
   }

   private rryj_1 id_class(int var1) {
      if (var1 == -1) {
         return (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[1];
      } else if (((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.JT)) {
         return (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[2];
      } else {
         return !this.id_final()
            ? (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[3]
            : (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[0];
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1808484833;
   }

   public int id_break() {
      this.id_else();
      return (Integer)this.id_break[7];
   }

   @Override
   public rrIF id_throws() {
      this.id_else();
      return (rrIF)this.id_break[1];
   }

   public boolean id_finally() {
      this.id_else();
      return (Boolean)this.id_break[4];
   }

   public rrIk_1 id_extends() {
      this.id_else();
      return (rrIk_1)this.id_break[0];
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.JT, 1)};
      id_class = var0;
   }

   public CheckGroup id_case() {
      this.id_else();
      return (CheckGroup)this.id_break[2];
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[8];
         this.id_break[4] = false;
         this.id_break[5] = 0L;
         this.id_break[6] = 0;
         this.id_break[7] = 0;
      }
   }

   public int id_implements() {
      this.id_else();
      return (Integer)this.id_break[6];
   }

   private static void id_new() {
      id_catch = new byte[]{-1, 2, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 8, 4, 5, 6, 7};
   }

   private static void id_package() {
      id_byte = new long[]{300L, 0L};
   }

   private static void id_return() {
      id_protected = new float[]{20.0F, 10.0F};
   }

   private int id_public() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)id_import.id_class[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)id_import.id_class[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = id_case[21]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_catch[18];
      }
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.JT) {
            return false;
         } else if (var0.id_continue().id_byte().equalsIgnoreCase("[★] Дезориентация")) {
            return true;
         } else {
            return !var0.id_protected("desorientation") && !var0.id_protected("spooky-item") ? id_case[25] : id_case[24];
         }
      };
   }

   public long id_private() {
      this.id_else();
      return (Long)this.id_break[5];
   }

   private boolean id_final() {
      this.id_else();
      if (!((rrIk_1)this.id_break[0]).id_class()) {
         return true;
      } else {
         ObjectIterator var1 = ((gm_3)id_import.id_class[56]).id_return().int2ObjectEntrySet().iterator();

         while (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            an_3 var3 = (an_3)var2.getValue();
            if (var3 != this.O() && rrff_3.id_class(var3, (CheckGroup)this.id_break[2]) && ((cb_3)id_import.id_class[57]).id_implements(var3) <= 10.0F) {
               return true;
            }
         }

         return id_case[20];
      }
   }

   private static void id_synchronized() {
      id_implements = new short[]{
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
         0,
         1,
         57,
         57,
         57,
         1,
         0,
         2,
         3,
         4,
         5,
         6,
         7
      };
   }

   public rrfP_2 id_native() {
      this.id_else();
      return (rrfP_2)this.id_break[3];
   }

   @Override
   public boolean aK_() {
      this.id_else();
      Boolean var5 = false;
      this.id_break[4] = var5;
      Integer var6 = -1;
      this.id_break[6] = var6;
      Integer var7 = 0;
      this.id_break[7] = var7;
      return super.aK_();
   }
}
