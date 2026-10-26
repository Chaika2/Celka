package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryR extends rrpu_3 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static long[] id_protected;
   private static String[] id_case;
   private static short[] id_catch;
   public Object[] id_class;
   private static float[] id_private;

   private int id_byte(int var1) {
      this.id_final();
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
         ((rrfP_2)this.id_class[3]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[5] = var6;
         return var1;
      } else {
         return -1;
      }
   }

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_catch[51]]).id_break().id_class();
   }

   private static void id_int() {
      id_protected = new long[]{300L, 0L};
   }

   public rryR(FtHelper var1) {
      super(var1);
      this.id_final();
      rrIk_1 var6 = new rrIk_1(id_case[0], true);
      this.id_class[id_catch[0]] = var6;
      rrIF var7 = new rrIF(id_case[1], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_catch[1]]);
      this.id_class[1] = var7;
      CheckGroup var8 = new CheckGroup().id_catch(true).id_case(true).id_class(true);
      this.id_class[2] = var8;
      rrfP_2 var9 = new rrfP_2();
      this.id_class[3] = var9;
      Integer var10 = -1;
      this.id_class[6] = var10;
      String var10003 = id_case[2];
      Setting[] var10004 = new Setting[2];
      byte var10006 = id_byte[4];
      String var10009 = id_case[3];
      rrIk_1[] var10010 = new rrIk_1[1];
      var10010[id_byte[6]] = (rrIk_1)this.id_class[id_catch[6]];
      var10004[var10006] = new rrIc_1(var10009, var10010);
      var10004[1] = (rrIF)this.id_class[1];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new short[]{
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

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_final();
      if (var1.id_break() == ((rrIF)this.id_class[1]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_class[4] = var6;
      }
   }

   private rryY id_class(int var1) {
      if (var1 == -1) {
         return (rryY)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[1];
      } else if (((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.xa)) {
         return (rryY)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[2];
      } else {
         return !this.id_return()
            ? (rryY)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[3]
            : (rryY)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[39]];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1859870416410859451L;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_final();
      ((rrfP_2)this.id_class[3]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_final();
      ((rrfP_2)this.id_class[3]).id_class(rqR_2.id_break() - this.id_class[5] > 300L ? true : id_byte[10]);
      if ((Boolean)this.id_class[4]) {
         FtHelper var2 = this.id_continue();
         int var3 = this.id_public();
         rryY var4 = this.id_class(var3);
         if (var4 == (rryY)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[2]) {
            int var5 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.xa);
            float var6 = (float)var5 / 20.0F;
            rrfu_3.id_class(var2, id_case[4], var6);
         } else if (var4 == (rryY)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[3]) {
            String var18 = id_case[5];
            rrfu_3.id_byte(rrfu_3.id_class((Module)var2) + var18);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[17]]).id_class(new rrtx_3(var2.id_final(), var18, 2000));
         } else if (var4 == (rryY)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[19]]) {
            int var19 = this.id_byte(var3);
            if (var19 > 8) {
               Integer var11 = var19;
               this.id_class[6] = var11;
               Integer var12 = Integer.valueOf(id_byte[11]);
               this.id_class[7] = var12;
            }
         }

         Boolean var13 = id_byte[12];
         this.id_class[4] = var13;
      }

      if ((Integer)this.id_class[6] != -1) {
         byte var17 = !((cb_3)id_import.id_class[57]).sV() && !((cb_3)id_import.id_class[57]).sZ() ? 2 : id_byte[13];
         int var10002 = (Integer)this.id_class[7] + 1;
         Integer var14 = var10002;
         this.id_class[7] = var14;
         if (var10002 > var17) {
            ((Ax_1)id_import.id_class[55]).id_class((Integer)this.id_class[6]);
            Integer var15 = -1;
            this.id_class[6] = var15;
            Integer var16 = Integer.valueOf(id_byte[15]);
            this.id_class[7] = var16;
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-75, -64, -28, 121, -22, 41, 96, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1541794290;
   }

   public long id_break() {
      this.id_final();
      return (Long)this.id_class[5];
   }

   @Override
   public rrIF id_throws() {
      this.id_final();
      return (rrIF)this.id_class[1];
   }

   public boolean id_finally() {
      this.id_final();
      return (Boolean)this.id_class[4];
   }

   public CheckGroup id_extends() {
      this.id_final();
      return (CheckGroup)this.id_class[2];
   }

   public rrIk_1 id_case() {
      this.id_final();
      return (rrIk_1)this.id_class[id_catch[57]];
   }

   private static void id_else() {
      id_byte = new boolean[]{
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

   public int id_implements() {
      this.id_final();
      return (Integer)this.id_class[7];
   }

   private static void id_new() {
      id_private = new float[]{20.0F, 10.0F};
   }

   private static void id_package() {
      id_case = new String[]{
         new String("Рядом игрок"),
         new String("Активация"),
         new String("Огненный смерч"),
         new String("Проверки"),
         new String("огненного смерча"),
         new String("Нет игроков поблизости"),
         new String("[★] Огненный смерч"),
         new String("fierytornado"),
         new String("spooky-item")
      };
   }

   private boolean id_return() {
      this.id_final();
      if (!((rrIk_1)this.id_class[id_catch[40]]).id_class()) {
         return true;
      } else {
         ObjectIterator var1 = ((gm_3)id_import.id_class[56]).id_return().int2ObjectEntrySet().iterator();

         while (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            an_3 var3 = (an_3)var2.getValue();
            if (var3 != this.O() && rrff_3.id_class(var3, (CheckGroup)this.id_class[2]) && ((cb_3)id_import.id_class[57]).id_implements(var3) <= 10.0F) {
               return true;
            }
         }

         return id_byte[20];
      }
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
         for (int var2 = id_byte[21]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.xa) {
            return id_byte[22];
         } else if (var0.id_continue().id_byte().equalsIgnoreCase(id_case[6])) {
            return true;
         } else {
            return !var0.id_protected(id_case[7]) && !var0.id_protected(id_case[8]) ? id_byte[25] : true;
         }
      };
   }

   public int id_private() {
      this.id_final();
      return (Integer)this.id_class[6];
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[8];
         this.id_class[4] = false;
         this.id_class[5] = 0L;
         this.id_class[6] = 0;
         this.id_class[7] = 0;
      }
   }

   private static void id_synchronized() {
      id_break = new byte[]{-1, 2, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 8, 4, 5, 6, 7};
   }

   public rrfP_2 id_native() {
      this.id_final();
      return (rrfP_2)this.id_class[3];
   }

   @Override
   public boolean aK_() {
      this.id_final();
      Boolean var5 = id_byte[16];
      this.id_class[4] = var5;
      Integer var6 = -1;
      this.id_class[6] = var6;
      Integer var7 = Integer.valueOf(id_byte[17]);
      this.id_class[7] = var7;
      return super.aK_();
   }
}
